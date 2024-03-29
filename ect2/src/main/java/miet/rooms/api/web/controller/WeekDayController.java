package miet.rooms.api.web.controller;

import miet.rooms.api.service.WeekDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/week-day")
public class WeekDayController {

    @Autowired
    private WeekDayService weekDayService;

    @GetMapping("all")
    public Map<Long, String> getAll() {
        return weekDayService.findAll();
    }

}
