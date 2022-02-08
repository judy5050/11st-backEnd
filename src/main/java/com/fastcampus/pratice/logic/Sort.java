package com.fastcampus.pratice.logic;

import java.util.List;

/**
 * 정렬기능을 제공하는 인터페이스, 사용하는 타입은 정렬할 수 있게꿈 @Link Comparable 구현해야 한다.
 *
 * @param <T> 정렬할 데이터의 타입
 * @author
 */
public interface Sort<T extends Comparable<T>> {

    /**
     * 정렬을 수행한다. 오름차순만  되니 주의
     *
     * @param list 정렬할 리스트
     * @return 정렬된 리스트
     */
    List<T> sort(List<T> list);


}
