package chapter08.section04;

public class SmartPhone implements Phone {

    @Override
    public void callPhone(String PhoneNumber) {
        System.out.println(PhoneNumber);
    }

    @Override
    public void receivePhone(String PhoneNumber) {
        System.out.println(PhoneNumber);
    }

    public void sendSMS(String PhoneNumber,String Message) {
        System.out.println(PhoneNumber+" "+Message);
    }

    public void receiveSMS(String PhoneNumber,String Message) {
        System.out.println(PhoneNumber+" "+Message);
    }

    public void installApp(String appName){
        System.out.println(appName);
    }
}
