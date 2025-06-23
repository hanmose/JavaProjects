package chapter08.section04;

public class PhoneTest {
    public static void main(String[] args) {
        TelePhone telephone = new TelePhone();
        FeaturePhone featurePhone = new FeaturePhone();
        SmartPhone smartPhone = new SmartPhone();

        telephone.answerMachine("메세지를 남겨주세요");
        telephone.callPhone("010-xxxx-xxxx");
        telephone.receivePhone("010-xxxx-xxxx");

        featurePhone.sendSMS("010-xxxx-xxxx","인터페이스");

        smartPhone.installApp("카카오톡");
    }
}
