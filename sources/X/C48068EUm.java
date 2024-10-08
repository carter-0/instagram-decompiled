package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.EUm  reason: case insensitive filesystem */
public enum C48068EUm {
    ;
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        EMO emo = new EMO(4);
        EMO emo2 = new EMO(5);
        EMO emo3 = new EMO(6);
        EMO emo4 = new EMO(7);
        EMO emo5 = new EMO(8);
        EMO emo6 = new EMO(9);
        EMO emo7 = new EMO(10);
        EMO emo8 = new EMO(11);
        EMO emo9 = new EMO(12);
        EMO emo10 = new EMO(0);
        EMO emo11 = new EMO(1);
        EMO emo12 = new EMO(2);
        EMO emo13 = new EMO(3);
        EnumMap enumMap = new EnumMap(C48085EVd.class);
        A01 = enumMap;
        enumMap.put(C48085EVd.SEND_PASSWORD_RESET_EMAIL, emo);
        enumMap.put(C48085EVd.SEND_PASSWORD_RESET_SMS, emo2);
        enumMap.put(C48085EVd.LOGIN_WITH_FACEBOOK, emo3);
        enumMap.put(C48085EVd.FORGOT_PASSWORD_FLOW, emo4);
        enumMap.put(C48085EVd.SEND_ONE_CLICK_LOGIN_EMAIL, emo5);
        enumMap.put(C48085EVd.SWITCH_TO_SIGNUP_FLOW, emo6);
        enumMap.put(C48085EVd.STOP_ACCOUNT_DELETION, emo7);
        enumMap.put(C48085EVd.GO_TO_HELPER_URL, emo8);
        enumMap.put(C48085EVd.SHOW_RECOVERY_CHALLENGE, emo9);
        enumMap.put(C48085EVd.LEARN_MORE, emo10);
        enumMap.put(C48085EVd.BACK_TO_LOGIN, emo12);
        enumMap.put(C48085EVd.DISMISS, emo11);
        enumMap.put(C48085EVd.DEFAULT, emo13);
    }

    public final void A00(AnonymousClass0aP r8) {
        0Aj A0e;
        String str = this.A00;
        if (str.equals("retry")) {
            double A012 = DbS.A01();
            double A002 = DbS.A00();
            A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r8), "retry_tapped");
            DbW.A11(A0e);
            DbY.A1D(A0e, A012, A002);
            DbS.A1H(A0e, "access_dialog");
            DbY.A1I(A0e, "module", "waterfall_log_in", A002);
            DbW.A13(A0e, A012);
            FH8.A09(A0e, r8);
        } else {
            A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r8), "recovery_tapped");
            if (A0e.isSampled()) {
                DbY.A1E(A0e, System.currentTimeMillis(), 1Q0.A00());
                DbW.A11(A0e);
                DbS.A1H(A0e, "access_dialog");
                A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
                DbT.A1O(A0e);
                DbW.A12(A0e, DbS.A00());
                FH8.A09(A0e, r8);
            } else {
                return;
            }
        }
        A0e.Cgf();
    }

    /* access modifiers changed from: public */
    C48068EUm(String str) {
        this.A00 = str;
    }
}
