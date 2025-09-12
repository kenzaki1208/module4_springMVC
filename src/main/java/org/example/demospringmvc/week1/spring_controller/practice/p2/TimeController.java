package org.example.demospringmvc.week1.spring_controller.practice.p2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
@RequestMapping("/week1/spring_controller/practice/p2")
public class TimeController {
    @GetMapping("/world-clock")
    public String getTimeByTimezone(
            ModelMap modelMap,
            @RequestParam(
                    name = "city",
                    required = false,
                    defaultValue = "Asia/Ho_Chi_Minh"
            ) String city
    ) {

        Date date = new Date();
        TimeZone localTimeZone = TimeZone.getDefault();
        TimeZone targetTimeZone = TimeZone.getTimeZone(city);
        long timeDifference = targetTimeZone.getRawOffset() - localTimeZone.getRawOffset();
        long targetTimeInMilliSeconds = date.getTime() + timeDifference;
        date.setTime(targetTimeInMilliSeconds);
        modelMap.addAttribute("city", city);
        modelMap.addAttribute("date", date);

        return "week1/spring_controller/practice/p2/index";
    }
}
