package chapter08.section04;

public class TelePhone implements Phone {

    @Override
    public void callPhone(String PhoneNumber) {
        System.out.println(PhoneNumber);
    }

    @Override
    public void receivePhone(String PhoneNumber) {
        System.out.println(PhoneNumber);
    }

    public void answerMachine(String answeringMessage) {

    }
}
