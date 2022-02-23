package com.entlogics.restaurantsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Test - create a controller to figure out if all controller methods in the restaurant system can fit here
@Controller
public class RestaurantController {
	
	//to get all restaurants
	@RequestMapping(value = "/restaurants", method = RequestMethod.GET)
	public String getAllRestaurants() {
		
		System.out.println("In restaurant controller getAllRestaurants method");
		
		return "list-restaurants";
	}
	
	
	// to add a restaurant
	@RequestMapping(value = "/restaurants", method = RequestMethod.POST)
	public void addARestaurant() {

		System.out.println("In restaurant controller addARestaurant method");
		
	}

	//to get specific restaurant
	@RequestMapping("/restaurants/{restaurant_id}")
	public String getRestaurantInformation(@PathVariable int restaurant_id) {
		
		System.out.println("In restaurant controller getRestaurantInformation method, The ID provided in path is " + restaurant_id);
		
		return "restaurant-information";
	}
	
	//to get customers of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/customers")
	public String getAllCustomersOfARestaurant(@PathVariable int restaurant_id) {
		
		System.out.println("In restaurant controller getAllCustomersOfARestaurant method, The ID provided in path is " + restaurant_id);

		return "list-restaurant-customers";
	}
	
	//to get a specific customer of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/customers/{customer_id}")
	public String getCustomerInformationOfARestaurant(@PathVariable int restaurant_id, @PathVariable int customer_id) {
		
		System.out.println("In restaurant controller getCustomerInformationOfARestaurant method, The Restaurant ID provided in path is " + restaurant_id + " And the customer ID is " + customer_id);

		return "restaurant-customer-information";
	}
	
	//to get all waiters of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/waiters")
	public String getAllWaiters(@PathVariable int restaurant_id) {
		
		System.out.println("In restaurant controller getAllWaiters method, The Restaurant ID provided in path is " + restaurant_id);
		
		return "list-restaurant-waiters";
	}
	
	
	// view a waiter of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/waiters/{waiter_id}")
	public String getWaiterInformation(@PathVariable int restaurant_id, @PathVariable int waiter_id) {

		System.out.println("In restaurant controller getWaiterInformation method, The Restaurant ID provided in path is "
				+ restaurant_id + " And the waiter ID is " + waiter_id);

		return "restaurant-waiter-information";
	}
	
	
	// to get all dishes of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/dishes")
	public String getAllDishes(@PathVariable int restaurant_id) {

		System.out.println(
				"In restaurant controller getAllDishes method, The Restaurant ID provided in path is " + restaurant_id);

		return "list-restaurant-dishes";
	}
	

	// to get all orders of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/orders")
	public String getAllOrders(@PathVariable int restaurant_id) {

		System.out.println(
				"In restaurant controller getAllOrders method, The Restaurant ID provided in path is " + restaurant_id);

		return "list-restaurant-orders";
	}
	

	// method to show the link dishes form
	@RequestMapping("/restaurants/{restaurant_id}/link-dish-to-restaurant-form")
	public String linkDishesToARestaurantForm(@PathVariable int restaurant_id) {

		System.out.println("In restaurant controller linkDishToARestaurantForm method, The Restaurant ID provided in path is "
				+ restaurant_id);

		// forward the user to the link dishes form
		return "link-dish-to-restaurant-form";
	}

	
	// method to show the link customers form
	@RequestMapping("/restaurants/{restaurant_id}/link-customer-to-restaurant-form")
	public String linkCustomerToARestaurantForm(@PathVariable int restaurant_id) {

		System.out.println("In restaurant controller linkCustomerToARestaurantForm method, The Restaurant ID provided in path is "
						+ restaurant_id);

		// forward the user to the link customer form
		return "link-customer-to-restaurant-form";
	}
	
	
	// method to show the delete form
		@RequestMapping("/restaurants/{restaurant_id}/showdeleteform")
		public String loadRestaurantDeleteForm(@PathVariable int restaurant_id) {

			System.out.println("In restaurant controller loadRestaurantDeleteForm method, The Restaurant ID provided in path is "
					+ restaurant_id);

			// forward the user to the delete form (no delete form, use postman for testing for now)
			//need to use AJAX
			return "show-delete-ajax";
		}
	
	

	// method to show the edit form
	@RequestMapping("/restaurants/{restaurant_id}/showeditform")
	public String loadRestaurantEditForm(@PathVariable int restaurant_id) {

		System.out.println("In restaurant controller loadRestaurantEditForm method, The Restaurant ID provided in path is "
				+ restaurant_id);

		// forward the user to the edit form (no edit form, use postman for testing for now)
		//need to use AJAX
		return "show-edit-ajax";
	}
	

	// method to load new form
	@RequestMapping("/restaurants/shownewform")
	public String showRestaurantNewForm() {

		System.out.println("In restaurant controller showRestaurantNewForm method");

		// forward the user to the new form
		
		return "shownewform";
	}
	
	
	//write a method to submit the new restaurant form. (handle POST request)
	
	//write a method to submit the edit restaurant form (handle PUT request, Test using Postman)
	
	//write a method to submit the delete restaurant form (handle DELETE request, Test using Postman)
	
	
	
}
