package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.user.model.Comic;
import com.example.demo.domain.user.service.ComicService;

@Controller
@RequestMapping("/user")
public class ComicListController {
	
	@Autowired
	private ComicService comicService;

    /** ユーザー一覧画面を表示 */
    @GetMapping("/list")
    public String getComicList(Model model) {
    	
    	List<Comic> comicList = comicService.getComics();
    	
    	model.addAttribute("comicList", comicList);
    	
    	// ユーザー一覧画面を表示
        return "user/list";
    }
}
