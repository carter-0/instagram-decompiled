package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.facebookpay.logging.LoggingContext;

/* renamed from: X.Sui  reason: case insensitive filesystem */
public final class C12450Sui implements C13783Tgy {
    public final QD2 A00;

    public final C11330SNj BLL() {
        throw AnonymousClass7TE.A0z("Should not be called");
    }

    public final void DG8(Bundle bundle, C11330SNj sNj) {
        SR4.A02(this.A00.A02, new AnonymousClass34S(sNj, bundle));
    }

    public final void DG9(Throwable th) {
        SR4.A02(this.A00.A01, th);
    }

    public C12450Sui(Bundle bundle, QD2 qd2) {
        String A002;
        String str;
        this.A00 = qd2;
        LoggingContext loggingContext = (LoggingContext) bundle.getParcelable("logging_context");
        if (loggingContext != null) {
            A002 = loggingContext.A02;
        } else {
            A002 = Pxi.A0J(bundle).A00();
            A002.getClass();
        }
        LoggingContext loggingContext2 = (LoggingContext) bundle.getParcelable("logging_context");
        if (loggingContext2 != null) {
            str = String.valueOf(loggingContext2.A00);
        } else {
            str = Pxi.A0J(bundle).A02;
        }
        String str2 = AnonymousClass2E0.A08().A01.A06;
        AnonymousClass2E0.A08();
        String A0l = DbU.A0l(bundle, "THREE_DS_URL");
        String A0l2 = DbU.A0l(bundle, "NONCE");
        String A11 = 002.A11("{'user_id':'", str2, "','universe':'", "instagram", "'}");
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("nonce=");
        A1A.append(A0l2);
        A1A.append("&return_method=");
        A1A.append("app_url");
        A1A.append("&app_url=");
        A1A.append(Base64.encodeToString("https://www.ecpthreeds.com".getBytes(), 2).replaceAll("=", ""));
        A1A.append("&session_id=");
        A1A.append(A002);
        A1A.append("&payment_type=");
        A1A.append("ecp");
        A1A.append("&context=");
        A1A.append(Base64.encodeToString(A11.getBytes(), 2).replaceAll("=", ""));
        if (!TextUtils.isEmpty(str)) {
            A1A.append("&product_id=");
            A1A.append(str);
        }
        String obj = A1A.toString();
        bundle.putString("WEB_VIEW_URL", !TextUtils.isEmpty(obj) ? 002.A0g(A0l, "?", obj) : A0l);
        bundle.putStringArray("WEB_VIEW_ALLOWED_INTERCEPT_URLS", new String[]{"https://www.ecpthreeds.com"});
        SR4.A02(qd2.A00, new AnonymousClass34S("AUTH_THREE_DS", Pxe.A0J(bundle)));
    }
}
