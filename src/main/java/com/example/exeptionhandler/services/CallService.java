package com.example.exeptionhandler.services;

import com.example.exeptionhandler.config.exceptions.ObjectNotFoundException;
import com.example.exeptionhandler.model.Call;
import com.example.exeptionhandler.repositories.CallRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CallService {

    private CallRepository callRepository;

    public Call findById(Integer id) {

        return callRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Call not found. Id: " + id));
    }

}