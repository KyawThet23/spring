package com.kth.main;


import com.kth.beans.Vehicle;
import com.kth.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda Fit");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());

        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

//        Vehicle veh1 = context.getBean("audiVehicle",Vehicle.class);
//        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());
//
//        Vehicle veh2 = context.getBean("hondaVehicle",Vehicle.class);
//        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());
//
//        Vehicle veh3 = context.getBean("ferrariVehicle",Vehicle.class);
//        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());


    }
}
