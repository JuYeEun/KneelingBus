package com.cookandroid.kneelingbus;


public class UserAccount {
    private  String idToken; //파이어베이스 Uid (고유 정보), key값 (각 계정 유일하게  )
    private String emailId;  //이메일아이디
    private String password; //비밀번호

    public UserAccount() { }//파이어베이스 DB사용 시 모델클래스이용해 가져올때 () = 공백

    public String getIdToken() { return idToken; }

    public void setIdToken(String idToken) { this.idToken = idToken; }

    public String getEmailId() { return emailId; }

    public void setEmailId(String emailId) { this.emailId = emailId; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }


}
