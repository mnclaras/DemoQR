package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Component that processes client requests.
 * <p>
 * The annotation @Controller is used so that the Spring container can detect, create and configure this component
 * when automatic configuration and wiring is used.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/info/{rinterno}/{suplier}/{part}/{qty}/{serial}/{batch}",
            method = RequestMethod.GET)
    public String welcome(Map<String, Object> model,
                                    @PathVariable("rinterno") String rinterno,
                                    @PathVariable("suplier") String suplier,
                                    @PathVariable("part") String part,
                                    @PathVariable("qty") String qty,
                                    @PathVariable("serial") String serial,
                                    @PathVariable("batch") String batch) {

        model.put("rinterno", rinterno);
        model.put("suplier", suplier);
        model.put("part", part);
        model.put("qty", qty);
        model.put("serial", serial);
        model.put("batch", batch);

        return "adient";
    }

    @RequestMapping(value = "/",
            method = RequestMethod.GET)
    public String hello() {
        return "adient";
    }


}
