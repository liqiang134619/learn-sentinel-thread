package com.example.alibaba;

/**
 * @author Liq
 * @date 2020/1/3
 */

public class Person {

    private String cardNumber;

    private long companyId;

    private String name;

    public Person(String carNumber, long companyId) {
        this.cardNumber = carNumber;
        this.companyId = companyId;
    }

    public Person() {
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
            "cardNumber='" + cardNumber + '\'' +
            ", companyId='" + companyId + '\'' +
            ", name='" + name + '\'' +
            '}';
    }
}
