package com.stackroute.rabbitmqproducer.controllerProducer;

import com.stackroute.rabbitmqproducer.serviceProducer.ServiceProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "stackroute")
public class ControllerProducer {
    @Autowired
    ServiceProducer serviceProducer;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("msg") String msg) {
//
//        Employee emp=new Employee();
////     emp.setEmpId(empId);
////        emp.setEmpName(empName);
//        emp.setMsg(msg);
        serviceProducer.send(msg);

        return "message sent";
    }
}
