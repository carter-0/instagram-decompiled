package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FuB  reason: case insensitive filesystem */
public final class C51441FuB implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;

    public C51441FuB(Activity activity, View view, UserSession userSession) {
        this.A00 = activity;
        this.A01 = view;
        this.A02 = userSession;
    }

    public final void run() {
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(this.A00, 2131964305);
        A0e.A03(this.A01);
        A0e.A02();
        A0e.A0A = true;
        UserSession userSession = this.A02;
        C47898ELs.A00(A0e, userSession, 1).A07(userSession);
    }
}
