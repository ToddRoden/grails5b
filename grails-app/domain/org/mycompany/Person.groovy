package org.mycompany

class Person {

    String firstName;
    String lastName;

    static hasMany = [addresses: Address]

    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
    }
}