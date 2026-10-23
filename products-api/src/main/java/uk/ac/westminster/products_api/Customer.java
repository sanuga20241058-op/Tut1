package uk.ac.westminster.products_api;

public class Customer {

    private Long id;
    private String name;
    private String email;
    private Address address;

    //Stretch Task A: Shared customer counter
    private static int customerCount = 0;

    // No-argument constructor
    public Customer(){
        customerCount++;
    }

    public Customer(Long id, String name, String email, Address address){
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;

        customerCount++;
    }

    //Getters
    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public Address getAddress(){
        return address;
    }

    // Stretch Task A: Return the customer count
    public static int getCustomerCount(){
        return customerCount;
    }
}
