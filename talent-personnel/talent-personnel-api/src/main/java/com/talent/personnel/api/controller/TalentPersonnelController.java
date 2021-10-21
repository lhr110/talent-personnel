package com.talent.personnel.api.controller;

import com.talent.personnel.core.manage.PersonnelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/personnel")
public class TalentPersonnelController {
    @Autowired
    private PersonnelServiceImpl personnelServiceImpl;
}
