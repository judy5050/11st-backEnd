package com.fastcampus.pratice;


import com.fastcampus.pratice.config.Config;
import com.fastcampus.pratice.service.StringSortService;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        StringSortService service = context.getBean(StringSortService.class);
//        Boolean bean = context.getBean(Boolean.class);
//        StringSortService service=new StringSortService(new BubbleSort<>());
        List<String> list = service.doSort(Arrays.asList(args));
        System.out.println("hello world- result" + list);
    }
}
