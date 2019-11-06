package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class VendTaMotoControlleur {
	@Autowired
	AnnonceRepository annonceRepo;
	
	
	
	
	

	
	@GetMapping("/geto")
	public ModelAndView formulaireAnnonces() {
		ModelAndView newview = new ModelAndView("vendtamoto2");
		List<Annonce> mesAnnonce=annonceRepo.findAll();
		newview.addObject("lesAnnonces", mesAnnonce );
		return newview;
	}

	@PostMapping(value="/recherche")
	public ModelAndView postUser(HttpServletRequest request){
ModelAndView viewmoto = new ModelAndView("vendtamoto2"); 
String searchmoto = request.getParameter("recherchemoto");
List<Annonce> mesRecherches = annonceRepo.findAllByMarqueContains (searchmoto);
System.out.println(searchmoto);
System.out.println(mesRecherches.size());
viewmoto.addObject("lesAnnonces", mesRecherches );

return viewmoto;
	}
	
	
	@GetMapping("/recherche/vue")
	public String formulaireAnnonceMoto() {
		ModelAndView aller = new ModelAndView("vendtamoto2");
		return "vendtamoto2";
	}

	
//@PostMapping(value="/recherche")
//	public ModelAndView d (HttpServletRequest request){
//	String searchActive = request.getParameter("vendtamoto2");
//ModelAndView viewActive = new ModelAndView("rechercheActive"); 
//List<Annonce> mesAnnoncesActives = annonceRepo.findAllByActiveTrue();
//return viewActive;
	
//}
	
	
	
	
	@GetMapping("/annonce")
	public String formulaireAnnonce() {
		ModelAndView view = new ModelAndView("vendtamoto");
		return "vendtamoto";
	}


	//	@RequestMapping(value = "/add", method = RequestMethod.POST)
	//	public String submit(@Valid @ModelAttribute("vendtamoto")Annonce annonce, 
	//			BindingResult result, ModelMap model) {
	//		if (result.hasErrors()) {
	//			return "error";
	//		}
	//
	//
	//		model.addAttribute("id", annonce.getId());
	//		return "vendtamoto";
	//	}

	@PostMapping(value="annonce/add")
	public ModelAndView postUser(HttpServletRequest request, Annonce a){
ModelAndView view = new ModelAndView("vendtamoto"); 


		

String image = request.getParameter("image");
System.out.println(request.getParameter("image"));
view.addObject("image", image);     




		String marque= request.getParameter("marque");
		System.out.println(request.getParameter("marque"));
		view.addObject("marque", marque);     
		if (marque.equals("") ){view.addObject("mince1", "remplir marque svp");}
		
		
		String etat = request.getParameter("etat");
		System.out.println(request.getParameter("etat"));
		view.addObject("etat", etat);
		if ( etat.equals("") ){view.addObject("mince2", "remplir état svp");}
		
		
		String kilometrage = request.getParameter("kilometrage");
		Integer.parseInt(kilometrage);
		System.out.println(request.getParameter("kilometrage"));
		view.addObject("kilometrage", kilometrage);
		if (kilometrage==null ){view.addObject("mince3", "remplir le kilometrage svp");}
		
	
		
		String prix = request.getParameter("prix");
		Integer.parseInt(prix);
		System.out.println(request.getParameter("prix"));
		view.addObject("prix", prix);
		if (prix==null ){view.addObject("mince4", "remplir le prix svp");}
		
		String texte = request.getParameter("texte");
		System.out.println(request.getParameter("texte"));
		view.addObject("texte", texte);
		if (texte.equals("") ){view.addObject("mince5", "remplir le texte svp");}
		
		
		annonceRepo.save(a);	
		return view;
		
//		try {
//			
//			String kilometrage = request.getParameter("kilometrage");
//			Integer.parseInt(kilometrage);
//			System.out.println(request.getParameter("kilometrage"));
//			view.addObject("kilometrage", kilometrage);
//			}
//			catch(Exception e) {
//			view.addObject("mince3", "remplissez correctement le kilometrage svp");
//			}
//
//	
//		
//		try {
//			String prix = request.getParameter("prix");
//			Integer.parseInt(prix);
//			System.out.println(request.getParameter("prix"));
//			view.addObject("prix", prix);
//			}
//			catch(Exception e) {
//				view.addObject("mince4", "remplissez correctement  le prix svp");
//			}

		
		
		
		
		
		}
	
		
//		String lastName = request.getParameter("lastName");
//		System.out.println(request.getParameter("lastName"));
//		view.addObject("lastName", lastName);
//		
	
	}

