package beans;

import java.lang.reflect.Member;

public class DataInfors {
    // MemberBean에 데이터 세팅하기
    public MemberBean getDataWithMemberBean(){
        // 인스턴스화 시키기
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");
        return memberBean;
    }
}
