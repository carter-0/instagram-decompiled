package X;

import android.os.Bundle;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import java.util.HashMap;

/* renamed from: X.SnY  reason: case insensitive filesystem */
public final class C12128SnY implements C13556TcU {
    public final /* synthetic */ LoginClient$Request A00;
    public final /* synthetic */ C12131Snb A01;

    public C12128SnY(LoginClient$Request loginClient$Request, C12131Snb snb) {
        this.A01 = snb;
        this.A00 = loginClient$Request;
    }

    public final void D50(Bundle bundle, C10179Rnu rnu) {
        LoginClient$Result loginClient$Result;
        C12131Snb snb = this.A01;
        LoginClient$Request loginClient$Request = this.A00;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                snb.A03 = bundle.getString("e2e");
            }
            try {
                C9831Rht.A00(snb.A02, "web_auth_success", loginClient$Request.A01, (HashMap) null, loginClient$Request.A02);
                AccessToken A002 = SP4.A00(bundle, AnonymousClass05K.A0j, loginClient$Request.A03, loginClient$Request.A06);
                SP4 sp4 = snb.A01;
                loginClient$Result = LoginClient$Result.A00(A002, sp4.A01);
                CookieSyncManager.createInstance(sp4.A06.getActivity()).sync();
                String str = snb.A04;
                if (!"fbsdk_logged_out_id".equals(str)) {
                    String str2 = A002.A02;
                    0qQ.A0B(str, 0);
                    0xY AR4 = 1Al.A00(1An.A1J, str).AR4();
                    AR4.E5g("com.facebook.login.WebViewAuthHandler.TOKEN_KEY", str2);
                    AR4.apply();
                }
            } catch (TQM e) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("exception", e.getMessage());
                C9831Rht.A00(snb.A02, "web_auth_error", loginClient$Request.A01, A1E, loginClient$Request.A02);
                loginClient$Result = LoginClient$Result.A02(snb.A01.A01, (String) null, e.getMessage(), (String) null);
            }
        } else {
            17k.A07(rnu, "If unsuccessful then error cannot be null");
            if (rnu.A00 == AnonymousClass05K.A01) {
                C9831Rht.A00(snb.A02, "web_auth_cancel", loginClient$Request.A01, (HashMap) null, loginClient$Request.A02);
                loginClient$Result = LoginClient$Result.A01(snb.A01.A01, "User canceled log in.");
            } else {
                snb.A03 = null;
                loginClient$Result = LoginClient$Result.A02(snb.A01.A01, (String) null, (String) null, (String) null);
            }
        }
        snb.A00.A04(loginClient$Result);
    }
}
