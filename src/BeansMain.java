

import beans.DataInfors;
import beans.MemberBean;

public class BeansMain {
    // 데이터 불러와서 데이터에 값 넣어주기
    public static void main(String[] args) {
        DataInfors dataInfors = new DataInfors();
        MemberBean memberBean = dataInfors.getDataWithMemberBean();

        System.out.println(memberBean.getFirstName() + " " + 
        memberBean.getSecondName() + " "  +memberBean.getHandleName());
    }
}
