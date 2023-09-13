package coreJava_projects;

import java.util.Scanner;

class phonePay {
    private int sbipin;
    private int kvgpin;
    private int kvgBalance;
    private int sbiBalance;

    public int getSbipin() {
        return sbipin;
    }

    public void setSbipin(int sbipin) {
        this.sbipin = sbipin;
    }

    public int getKvgpin() {
        return kvgpin;
    }

    public void setKvgpin(int kvgpin) {
        this.kvgpin = kvgpin;
    }

    public int getKvgBalance() {
        return kvgBalance;
    }

    public void setKvgBalance(int kvgBalance) {
        this.kvgBalance = kvgBalance;
    }

    public int getSbiBalance() {
        return sbiBalance;
    }

    public void setSbiBalance(int sbiBalance) {
        this.sbiBalance = sbiBalance;
    }
}

public class PhonePay {

    public static void main(String[] args) {
        phonePay pp = new phonePay();
        pp.setSbipin(7676);
        pp.setKvgpin(8080);
        pp.setSbiBalance(5000);
        pp.setKvgBalance(10000);
        int sbipin = pp.getSbipin();
        int kvgpin = pp.getKvgpin();
        int sbalance = pp.getSbiBalance();
        int kbalance = pp.getKvgBalance();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Option");
        System.out.println("1) Send amount To Mobile");
        System.out.println("2) Check Balance");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.println("enter the mbl num");
                long mblnum = s.nextLong();

                System.out.println("select bank");
                System.out.println("case 1: sbi     case 2:KARNATAKA VIKAS GRAMIN BANK");
                int select = s.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("STATE BANK OF INDIA");
                        System.out.println("ENTER THE AMOUNT");
                        int samount = s.nextInt();
                        if (samount <= sbalance) {

                            System.out.println("click pay");
                            System.out.println("enter the UPI ID ____");
                            int code = s.nextInt();

                            if (code == sbipin) {
                                System.out
                                        .println("AMOUNT OF " + samount + " send SUCESSFULLY To Mbl Number-" + mblnum);
                            }

                            else {
                                System.out.println("INCORECT UPIID");
                            }

                        } else {
                            System.out.println("amount is insuficient in your account");
                        }
                        break;

                    case 2:
                        System.out.println("KARNATAKA VIKAS GRAMIN BANK");
                        System.out.println("ENTER THE AMOUNT");
                        int kamount = s.nextInt();
                        if (kamount <= kbalance) {

                            System.out.println("click pay");
                            System.out.println("enter the UPI ID ____");
                            int code = s.nextInt();

                            if (code == kvgpin) {
                                System.out.println(
                                        "THE AMOUNT " + kamount + "is SEND SUCCESSFULLY To Mbl Number-" + mblnum);
                            }

                            else {
                                System.out.println("INCORECT UPIID");
                            }

                        } else {
                            System.out.println("amount is insuficient in your account");
                        }

                        break;

                } // iner switch end
                break;

            case 2:
                System.out.println("UPI BANK ACCOUNTs");
                System.out.println("case 1: STATE BANK OF INDIA");
                System.out.println("case 2: KARNATAKA VIKAS GRAMIN BANK");
                System.out.println("select the Bank");
                int bchoice = s.nextInt();
                switch (bchoice) {
                    case 1:
                        System.out.println("ENTER THE UPI PIN");
                        int code = s.nextInt();
                        if (code == sbipin) {
                            System.out.println("YOUR BALANCE IS: " + sbalance);
                        } else {
                            System.out.println("INCORRECT UPI ID");
                        }
                        break;
                    case 2:
                        System.out.println("ENTER THE UPI ID");
                        int kcode = s.nextInt();

                        if (kcode == kvgpin) {
                            System.out.println("YOU BALANCE IS :" + kbalance);
                        } else {
                            System.out.println("INCORRECT UPI ID");
                        }

                        break;

                }
        }// main switch end

    }

}
