package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IVe  reason: case insensitive filesystem */
public final class C57269IVe implements MVB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C317556nS A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C57269IVe(Activity activity, UserSession userSession, C317556nS r3, String str, String str2, int i) {
        this.A02 = userSession;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = activity;
        this.A03 = r3;
    }

    public final void onButtonClick(View view) {
        UserSession userSession = this.A02;
        C313756gx A002 = C313746gw.A00(userSession);
        int i = this.A00;
        String str = this.A04;
        String str2 = this.A05;
        1Ln A0E = 1Ln.A0E(A002.A03);
        if (DbT.A1Y(A0E)) {
            A0E.A0h(Long.valueOf(A002.A02));
            A0E.A0l(C273654mx.A00(936));
            A0E.A0k("tap");
            A0E.A0p("undo_button");
            A0E.A0i(DbZ.A0b(A0E, "story", str, str2, i));
            A0E.Cgf();
        }
        Activity activity = this.A01;
        new C67100MiK(activity, userSession).A03(C300965yF.A05(new C254763t0(str)), AnonymousClass05K.A09);
        C54951HZh.A00(userSession).A00.remove(str);
        this.A03.FJq(userSession);
    }
}
