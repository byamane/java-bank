import java.util.Scanner;

public class Account {
  // Class variables
  int balance;
  int previousTransaction;
  String customerName;
  String customerID;

  // Class constructor
  Account(String cname, String cid) {
    customerName = cname;
    customerID = cid;
  }
}
