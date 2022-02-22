package com.entlogics.restaurantsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//Test - create a controller to figure out if all controller methods in the restaurant system can fit here
@Controller
public class RestaurantController {
	
	//to get all restaurants
	@RequestMapping("/restaurants")
	public void getAllRestaurants() {
		
		System.out.println("In restaurant controller getAllRestaurants method");
	}

	//to get specific restaurant
	@RequestMapping("/restaurants/{restaurant_id}")
	public void getRestaurantInformation(@PathVariable int restaurant_id) {
		
		System.out.println("In restaurant controller getRestaurantInformation method, The ID provided in path is " + restaurant_id);
	}
	
	//to get customers of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/customers")
	public void getAllCustomersOfARestaurant(@PathVariable int restaurant_id) {
		
		System.out.println("In restaurant controller getAllCustomersOfARestaurant method, The ID provided in path is " + restaurant_id);

		
	}
	
	//to get a specific customer of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/customers/{customer_id}")
	public void getCustomerInformationOfARestaurant(@PathVariable int restaurant_id, @PathVariable int customer_id) {
		
		System.out.println("In restaurant controller getCustomerInformationOfARestaurant method, The Restaurant ID provided in path is " + restaurant_id + " And the customer ID is " + customer_id);

		
	}
	
	//to get all waiters of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/waiters")
	public void getAllWaiters(@PathVariable int restaurant_id) {
		
		System.out.println("In restaurant controller getAllWaiters method, The Restaurant ID provided in path is " + restaurant_id);
		
	}
	
	
	// view a waiter of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/waiters/{waiter_id}")
	public void getWaiterInformation(@PathVariable int restaurant_id, @PathVariable int waiter_id) {

		System.out.println("In restaurant controller getWaiterInformation method, The Restaurant ID provided in path is "
				+ restaurant_id + " And the waiter ID is " + waiter_id);

	}
	
	
	// to get all dishes of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/dishes")
	public void getAllDishes(@PathVariable int restaurant_id) {

		System.out.println(
				"In restaurant controller getAllDishes method, The Restaurant ID provided in path is " + restaurant_id);

	}
	

	// to get all orders of a restaurant
	@RequestMapping("/restaurants/{restaurant_id}/orders")
	public void getAllOrders(@PathVariable int restaurant_id) {

		System.out.println(
				"In restaurant controller getAllOrders method, The Restaurant ID provided in path is " + restaurant_id);

	}
	

	// method to show the link dishes form
	@RequestMapping("/restaurants/{restaurant_id}/link-dish-to-restaurant-form")
	public void linkDishesToARestaurantForm(@PathVariable int restaurant_id) {

		System.out.println("In restaurant controller linkDishToARestaurantForm method, The Restaurant ID provided in path is "
				+ restaurant_id);

		// forward the user to the link dishes form
	}

	
	// method to show the link customers form
	@RequestMapping("/restaurants/{restaurant_id}/link-customer-to-restaurant-form")
	public void linkCustomerToARestaurantForm(@PathVariable int restaurant_id) {

		System.out.println("In restaurant controller linkCustomerToARestaurantForm method, The Restaurant ID provided in path is "
						+ restaurant_id);

		// forward the user to the link customer form
	}
	
	
	// method to show the delete form
		@RequestMapping("/restaurants/{restaurant_id}/showdeleteform")
		public void loadRestaurantDeleteForm(@PathVariable int restaurant_id) {

			System.out.println("In restaurant controller loadRestaurantDeleteForm method, The Restaurant ID provided in path is "
					+ restaurant_id);

			// forward the user to the delete form
		}
	
	

	// method to show the edit form
	@RequestMapping("/restaurants/{restaurant_id}/showeditform")
	public void loadRestaurantEditForm(@PathVariable int restaurant_id) {

		System.out.println("In restaurant controller loadRestaurantEditForm method, The Restaurant ID provided in path is "
				+ restaurant_id);

		// forward the user to the edit form
	}
	

	// method to load new form
	@RequestMapping("/restaurants/shownewform")
	public void showRestaurantNewForm() {

		System.out.println("In restaurant controller showRestaurantNewForm method");

		// forward the user to the new form
	}
	
	
	//write a method to submit the new restaurant form. (handle POST request)
	
	//write a method to submit the edit restaurant form (handle PUT request, Test using Postman)
	
	//write a method to submit the delete restaurant form (handle DELETE request, Test using Postman)
	
	
	
}
