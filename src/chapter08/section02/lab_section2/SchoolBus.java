package chapter08.section02.lab_section2;

public class SchoolBus extends Car {

    @Override
    public void Speed(int speed) {
            kind = "School";
            this.speed = speed;
            if(this.speed>60) this.speed=60;

    }
}
