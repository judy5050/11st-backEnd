package com.fastcampus.pratice.service;

import com.fastcampus.pratice.logic.Sort;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class StringSortService {

    private final Sort<String> sort;

//    public void setSort(Sort<String> sort) {
//        this.sort = sort;
//    }

    public StringSortService(@Qualifier("bubbleSort") Sort<String> sort) {
        System.out.println("선택된 구현체는: " + sort.getClass().getSimpleName());
        this.sort = sort;
    }

    public List<String> doSort(List<String> input) {
        return sort.sort(input);
    }

}
