package vn.t3h.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import vn.t3h.dao.PagesDao;
import vn.t3h.model.Pages;

public class PageApiController {
	private @Autowired PagesDao pagesDao;
	
	
	@PostMapping(value="/pages")
	public List<Pages> listPages(@RequestBody Pages pages)
	{
		/*var page = new Pages();
		pages.setName("phone");
		pages.setCate(3);*/
		return pagesDao.filter(pages);
	}
	
	
	
	@GetMapping(value="/pages")
	public List<Pages> getPages()
	{
		var pages = new Pages();
		pages.setName("phone");
		pages.setCate(2);
		return pagesDao.filter(pages);
	}
	
	
}
