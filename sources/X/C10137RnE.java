package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.RnE  reason: case insensitive filesystem */
public abstract class C10137RnE {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature A04;
    public static final Feature A05;
    public static final Feature A06;
    public static final Feature A07;
    public static final Feature[] A08;

    static {
        Feature A0X = Pxe.A0X("auth_api_credentials_begin_sign_in", 8);
        A00 = A0X;
        Feature A0X2 = Pxe.A0X("auth_api_credentials_sign_out", 2);
        A01 = A0X2;
        Feature A0X3 = Pxe.A0X("auth_api_credentials_authorize", 1);
        A02 = A0X3;
        Feature A0X4 = Pxe.A0X("auth_api_credentials_revoke_access", 1);
        A03 = A0X4;
        Feature A0X5 = Pxe.A0X("auth_api_credentials_save_password", 4);
        A04 = A0X5;
        Feature A0X6 = Pxe.A0X("auth_api_credentials_get_sign_in_intent", 6);
        A05 = A0X6;
        Feature A0X7 = Pxe.A0X("auth_api_credentials_save_account_linking_token", 3);
        A06 = A0X7;
        Feature A0X8 = Pxe.A0X("auth_api_credentials_get_phone_number_hint_intent", 3);
        A07 = A0X8;
        A08 = new Feature[]{A0X, A0X2, A0X3, A0X4, A0X5, A0X6, A0X7, A0X8};
    }
}
