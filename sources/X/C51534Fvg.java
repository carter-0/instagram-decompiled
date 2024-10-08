package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fvg  reason: case insensitive filesystem */
public final class C51534Fvg implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Integer A04;

    public C51534Fvg(Activity activity, View view, View view2, UserSession userSession, Integer num) {
        this.A02 = view;
        this.A00 = activity;
        this.A04 = num;
        this.A01 = view2;
        this.A03 = userSession;
    }

    public final void run() {
        AnonymousClass5Gt A0V = DbZ.A0V(this.A00, this.A04.intValue());
        A0V.A01();
        A0V.A03(this.A01);
        A0V.A0A = true;
        UserSession userSession = this.A03;
        C47898ELs.A00(A0V, userSession, 2).A07(userSession);
    }
}
