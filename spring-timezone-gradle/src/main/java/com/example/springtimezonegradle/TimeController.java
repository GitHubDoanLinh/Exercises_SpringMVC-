package com.example.springtimezonegradle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
@GetMapping("/world-clock")
    public String getTimeByTimeZone(ModelMap model, @RequestParam(name="city",required = false,defaultValue = "Asia/Ho_Chi_Minh")String city){
    // @RequestParam(name="city", required="false", defaultValue="Asia/Ho_Chi_Minh") khai báo tham số của phương thức xử lý, ràng buộc với tham số từ request.
    Date date = new Date();// lay ra thoi gia hien tai
    TimeZone local = TimeZone.getDefault(); // lay ra timezone hien tai
    TimeZone locale = TimeZone.getTimeZone(city);// lay ra time zone cua 1 thanh pho cu the

    // tinh thoi gian hine tai cua 1 thanh pho cu the
    long localTime = date.getTime() +(locale.getRawOffset() - local.getRawOffset());
    date.setTime(localTime);
    // chuyen du lieu ve view
    model.addAttribute("city", city);
    model.addAttribute("date", date);
    return "index";
}
}
