package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VKc  reason: case insensitive filesystem */
public abstract class C17150VKc {
    public static final Map A00;
    public static final Map A01;

    static {
        LinkedHashMap A06 = 0Yt.A06(new 0eP[]{new 0eP("READ_PHONE_STATE", "android.permission.READ_PHONE_STATE"), new 0eP("READ_CALL_LOG", "android.permission.READ_CALL_LOG"), new 0eP("CALL_PHONE", "android.permission.CALL_PHONE"), new 0eP("READ_CONTACTS", "android.permission.READ_CONTACTS"), new 0eP("GET_ACCOUNTS", "android.permission.GET_ACCOUNTS"), new 0eP("READ_PHONE_NUMBERS", "android.permission.READ_PHONE_NUMBERS"), new 0eP("POST_NOTIFICATIONS", "android.permission.POST_NOTIFICATIONS")});
        A01 = A06;
        A00 = 0Yt.A0C(A06, new 0eP("ANSWER_PHONE_CALLS", "android.permission.ANSWER_PHONE_CALLS"));
    }
}
