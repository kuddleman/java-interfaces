package com.company;

// create signatures, not actual body in this Interface
    // don't need access modifiers as the code will be done
    // in the class.  Access modifier can be declared there.
    // Here, declaring a access modifier is redundant
public interface ITelephone {
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();
}
