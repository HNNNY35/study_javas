public class ExtendCalculations extends Calculations{
    
    ExtendCalculations() {
        System.out.println("Extended Calculations - constructor");
    }
    // Calculations에 있는 펑션들도 사용 가능(상속받았기 때문에)

    // multiply
    public int multiplication(int first, int second) {
        int result = first * second;
        return result;
    }

    // Public Method subtraction 오버라이딩 : 상속 받은 상태에서 재정의하여 사용
    public int subtraction(int first, int second) {
        int result = second  - first;
        return result;
    }
}
