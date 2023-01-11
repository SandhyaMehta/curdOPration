package com.SecondOne.SecondOne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SecondOneRepositry extends JpaRepository<SecondOne,Integer> {

}
