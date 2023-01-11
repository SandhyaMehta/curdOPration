package com.SecondOne.SecondOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondOneService {
    @Autowired SecondOneRepositry SecondOne;

    public SecondOne AddsecondOne(SecondOne name){
      return  SecondOne.save(name);

    }
    public  String getSecondOne(int id)
    {
        return  SecondOne.findById(id).get().toString();
    }



}
