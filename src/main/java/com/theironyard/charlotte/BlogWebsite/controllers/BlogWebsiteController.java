package com.theironyard.charlotte.BlogWebsite.controllers;

import com.theironyard.charlotte.BlogWebsite.entities.BlogPost;
import com.theironyard.charlotte.BlogWebsite.repositories.BlogPostRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jake on 5/18/17.
 */

@Controller
public class BlogWebsiteController {
    BlogPostRepo blogs;

    public BlogWebsiteController(BlogPostRepo blogs) {
        this.blogs = blogs;
    }


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String homePage(Model model) {
        Iterable<BlogPost> blogPosts = blogs.findAll();
        model.addAttribute("blogposts", blogPosts);

        return "index";
    }

    @RequestMapping(path = "/blog-post/{id}", method = RequestMethod.GET)
    public String displayBlog(Model model) {

        return "post";
    }

}
