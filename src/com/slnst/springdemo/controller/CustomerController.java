package com.slnst.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slnst.springdemo.dao.CustomerDAO;
import com.slnst.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String listCustomers(Model theModel) {

		List<Customer> theCustomers = customerDAO.getCustomers();

		theModel.addAttribute("customers", theCustomers);

		return "list-customers";

	}

}
