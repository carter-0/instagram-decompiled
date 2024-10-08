package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.List;

/* renamed from: X.SKl  reason: case insensitive filesystem */
public abstract class C11301SKl {
    public static C10440RsH A02(String str, String str2, String str3, String str4, List list) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("PAYMENT_TYPE", str);
        A0a.putString("PAYMENT_LOGGING_ID", str2);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A0a.putString("PAYMENT_ACCOUNT_ID", (String) null);
        }
        A0a.putStringArray("PTT_UTIL_CAP_NAMES", DbU.A1b(list, 0));
        C11249SHj sHj = new C11249SHj();
        sHj.A01(str2);
        sHj.A00 = str2;
        sHj.A01 = str;
        sHj.A02 = str3;
        sHj.A03 = str4;
        Pxi.A0y(A0a, sHj);
        return new C10440RsH(A0a);
    }

    public static C10440RsH A00(Bundle bundle, C11027S6f s6f, String str) {
        Bundle A0J = Pxe.A0J(bundle);
        A0J.putString("AUTH_METHOD_TYPE", s6f.A00);
        SQ8.A02(str, A0J);
        String str2 = s6f.A02;
        if (!TextUtils.isEmpty(str2)) {
            A0J.putString("CREDENTIAL_ID", str2);
        }
        String str3 = s6f.A01;
        if (!TextUtils.isEmpty(str3)) {
            A0J.putString("PAYPAL_LOGIN_URL", str3);
        }
        String str4 = s6f.A03;
        if (!TextUtils.isEmpty(str4)) {
            A0J.putString("PAYPAL_HIDDEN_EMAIL", str4);
        }
        String str5 = s6f.A06;
        if (!TextUtils.isEmpty(str5)) {
            A0J.putString("CARD_INFO", str5);
        }
        String str6 = s6f.A04;
        if (!TextUtils.isEmpty(str6)) {
            A0J.putString("NONCE", str6);
        }
        String str7 = s6f.A05;
        if (!TextUtils.isEmpty(str7)) {
            A0J.putString("THREE_DS_URL", str7);
        }
        return new C10440RsH(A0J);
    }

    public static C10440RsH A01(FBPayLoggerData fBPayLoggerData, String str) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("AUTH_METHOD_TYPE", "PIN");
        A0a.putString("PAYMENT_TYPE", str);
        A0a.putParcelable("logger_data", fBPayLoggerData);
        return new C10440RsH(A0a);
    }
}
