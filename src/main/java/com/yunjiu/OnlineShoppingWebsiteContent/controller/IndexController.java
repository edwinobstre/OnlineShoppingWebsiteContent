package com.yunjiu.OnlineShoppingWebsiteContent.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    /**
     * Controller function for the index HTML page.
     */
    @RequestMapping("/")
    public String index(Model model) {
        logger.info("I am here");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d yyyy : HH:mm:ss:SSS z");
        Date now = new Date();
        String dateStr = dateFormat.format( now );
        model.addAttribute("time", dateStr);
        return "Hello, this is OnlineShoppingWebsite";
    }
}