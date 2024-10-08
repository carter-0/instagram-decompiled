package X;

import android.content.Context;
import android.webkit.WebSettings;
import com.facebook.secure.securewebview.SecureWebView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.SOr  reason: case insensitive filesystem */
public final class C11355SOr {
    public final List A00 = AnonymousClass7TE.A1C();
    public final List A01 = AnonymousClass7TE.A1C();

    public static Context A00(Context context, SecureWebView secureWebView) {
        C11355SOr sOr = new C11355SOr();
        sOr.A04();
        secureWebView.A01 = sOr.A02();
        secureWebView.A02 = "SecureWebView";
        return context.getApplicationContext();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.0bY] */
    public final S4j A02() {
        return new S4j(new Object(), new C9569Rd9(), this.A01, this.A00);
    }

    public final void A03() {
        List list = this.A00;
        ArrayList A0v = DbS.A0v(4);
        List asList = Arrays.asList(new String[]{"http", "https"});
        if (!asList.isEmpty()) {
            A0v.add(new C7900QcS(asList));
            AnonymousClass0cm A002 = C9571RdB.A00(A0v);
            0qQ.A07(A002);
            list.add(A002);
            return;
        }
        throw AnonymousClass7TE.A0w("Cannot set 0 schemes");
    }

    public final void A04() {
        List list = this.A00;
        ArrayList A0v = DbS.A0v(4);
        List asList = Arrays.asList(new String[]{"https"});
        if (!asList.isEmpty()) {
            A0v.add(new C7900QcS(asList));
            AnonymousClass0cm A002 = C9571RdB.A00(A0v);
            0qQ.A07(A002);
            list.add(A002);
            return;
        }
        throw AnonymousClass7TE.A0w("Cannot set 0 schemes");
    }

    public static void A01(SecureWebView secureWebView) {
        C10236Row secureSettings = secureWebView.getSecureSettings();
        C11355SOr sOr = new C11355SOr();
        sOr.A03();
        secureWebView.A01 = sOr.A02();
        WebSettings webSettings = secureSettings.A00;
        String userAgentString = webSettings.getUserAgentString();
        0qQ.A07(userAgentString);
        webSettings.setUserAgentString(1Ch.A01(userAgentString));
    }
}
