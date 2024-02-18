package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default
        //data.defaultField = 2;
        //data.defaultMethod();

        // private 호출 불가
        // data.privateField
        // data.privateMethod();

        data.innerAccess();
    }
}
