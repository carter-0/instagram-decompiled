package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.Rn7  reason: case insensitive filesystem */
public abstract class C10130Rn7 {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature[] A04;

    static {
        Feature A0X = Pxe.A0X("sms_code_autofill", 2);
        A00 = A0X;
        Feature A0X2 = Pxe.A0X("sms_code_browser", 2);
        A01 = A0X2;
        Feature A0X3 = Pxe.A0X("sms_retrieve", 1);
        A02 = A0X3;
        Feature A0X4 = Pxe.A0X("user_consent", 3);
        A03 = A0X4;
        A04 = new Feature[]{A0X, A0X2, A0X3, A0X4};
    }
}
