public class Calculations extends Object{
    // this : 현재 클래스 내부에서 사용할 수 있는 일종의 전역변수같은 역할
    int _first = 0;
    int _second = 0;

    // Constructor - 기본생성자
    Calculations() {
        System.out.println("Calculations - constructor");
    }

    // Parameter가 있는 생성자
    Calculations(int first, int second) {
        this._first = first;
        this._second = second;
        System.out.println("Calculations - constructor with Param");
    }
    
    // multiplication
    public int multiplication(){
        int result = this._first * this._second;
        return result;
    }
    

    // Public Method addition
    public int addition(int first, int second) {
        int result = first + second;
        return result;
    }

    // Public Method subtraction
    public int subtraction(int first, int second) {
        int result = first - second;
        return result;
    }
}
