package com.controller;

import com.pojo.Paper;
import com.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Batman create on 2019-03-08 14:21
 */
@Controller
@RequestMapping("/paper")
public class PaperController {
    @Autowired
    private PaperService service;


    @RequestMapping("/allPaper")
    public String list(Model model){
        List<Paper> list = service.queryAllPaper();
        model.addAttribute("list", list);
        return "allPaper";

    }

    @RequestMapping("/toAddPaper")
    public String toAddPaper(){
        return "addPaper";
    }


    @RequestMapping("/addPaper")
    public String addPaper(Paper paper){
        service.addPaper(paper);
        return "redirect:/paper/allPaper";
    }

    @RequestMapping("/toUpdatePaper")
    public String toUpdatePaper(Model model, long id){
        model.addAttribute("paper", service.queryById(id));
        return "updatePaper";
    }

    @RequestMapping("/updatePaper")
    public String updatePaper(Model model, Paper paper){
        service.updatePaper(paper);
        paper = service.queryById(paper.getPaperId());
        model.addAttribute("paper", paper);
        return "redirect:/paper/allPaper";

    }


    @RequestMapping("/del/{id}")
    @ResponseBody
    public String deletePaper( @PathVariable("id") long id){
        System.out.println("正在删除paper...");

        service.deletePaperById(id);

        return "redirect:/paper/allPaper";


    }






}
