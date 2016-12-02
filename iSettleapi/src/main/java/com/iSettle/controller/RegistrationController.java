package com.iSettle.controller;

import com.iSettle.model.UserDetails;
import com.iSettle.repository.UserDetailsRepository;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by deepeshuniyal on 03/12/16.
 */
@RestController
@RequestMapping("/registration")
public class RegistrationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Registion time Hit", notes = "Only Send the 'email,login_app_id,name,picture' paramter")
    public Long registration(@RequestBody @Valid UserDetails userDetails) {
        //Card created = service.create(card);
        LOGGER.info("Registration Request-"+userDetails);
        userDetails.setStatus(1l);
        userDetails.setCreate_time(new Date());
        userDetails.setUpdate_time(new Date());
        userDetails.setAcc_id(System.currentTimeMillis());
        userDetails = userDetailsRepository.save(userDetails);

        return userDetails.getId();
    }
}
