package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.34I  reason: invalid class name */
public final class AnonymousClass34I extends C252233om {
    public final Fragment A00;
    public final UserSession A01;
    public final C2361132m A02;
    public final C231332rR A03;

    public AnonymousClass34I(Fragment fragment, UserSession userSession, C2361132m r4, C231332rR r5) {
        0qQ.A0B(r4, 4);
        this.A00 = fragment;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = userSession;
    }

    public final void onResume() {
        UserSession userSession = this.A01;
        if (!C240133Js.A00(userSession).A00) {
            C240133Js.A00(userSession).A01();
            return;
        }
        1E8 A002 = 1E7.A00(userSession);
        C240133Js.A00(userSession);
        1Xj A022 = A002.A02((String) null);
        if (A022 != null) {
            AnonymousClass3W1 BQr = this.A03.BQr(A022);
            new Handler().postDelayed(new C57945Ij0(A022, new C57214ITb(A022, BQr), BQr, this), 100);
        }
    }
}
