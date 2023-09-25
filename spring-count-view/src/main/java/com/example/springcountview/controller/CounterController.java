package com.example.springcountview.controller;

import com.example.springcountview.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter") //được sử dụng để lưu trữ modelattribute trong session
public class CounterController {
    @ModelAttribute("counter")// modelattribute "counter"sẽ được thêm vào session nếu tên attribute của @ModelAttribute và @SessionAttributes giống nhau.  @ModelAttribute liên kết một tham số phương thức hoặc một phương thức trả về giá trị cho một model attribute và sau đó trả nó về một view cụ thể.
    public Counter setUpCounter(){
        return new Counter();
    }

    @GetMapping
    public String get(@ModelAttribute("counter") Counter counter){
        counter.increment();//hàm increment() có nhiệm vụ tăng giá trị thuộc tính count của đối tượng counter.
        return "/index";
    }


}
