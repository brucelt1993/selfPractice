package com.bruce.thinkinjava19;

import com.bruce.tools.EnumsTools;

import java.util.Iterator;

public class Mail {
    enum GeneralDelivery {YES, NO1, NO2, NO3, NO4, NO5}

    enum Scannability {UNSCANNABLE, YES1, YES2, YES3, YES4};

    enum Readability {ILLEGIBLE, YES1, YES2, YES3, YES4}

    enum Address {INCORECT, OK1, OK2, Ok3, OK4, OK5, OK6}

    enum ReturnAddress {MISSING, OK1, OK2, OK3, OK4, OK5}

    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddress returnAddress;
    static long counter = 0;
    long id = counter++;

    public String toString() {
        return "Mail " + id;
    }

    public String details() {
        return toString() + " ,General Delivery: " + generalDelivery +
                ", Address Scanabilty: " + scannability +
                ", Address Readability: " + readability +
                ", Address Address: " + address +
                ", Return address: " + returnAddress;
    }

    public static Mail randomMail() {
        Mail m = new Mail();
        m.generalDelivery = EnumsTools.random(GeneralDelivery.class);
        m.scannability = EnumsTools.random(Scannability.class);
        m.readability = EnumsTools.random(Readability.class);
        m.address = EnumsTools.random(Address.class);
        m.returnAddress = EnumsTools.random(ReturnAddress.class);
        return m;
    }

    public static Iterable<Mail> generator(final int count) {
        return new Iterable<Mail>() {
            int n = count;

            @Override
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    @Override
                    public Mail next() {
                        return randomMail();
                    }
                };
            }
        };
    }
}
