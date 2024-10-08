package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fuq  reason: case insensitive filesystem */
public final /* synthetic */ class C51482Fuq implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Av A02;

    public /* synthetic */ C51482Fuq(View view, UserSession userSession, 1Av r3) {
        this.A00 = view;
        this.A02 = r3;
        this.A01 = userSession;
    }

    public final void run() {
        View view = this.A00;
        1Av r3 = this.A02;
        UserSession userSession = this.A01;
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e((Activity) view.getContext(), 2131974344);
        A0e.A03(view);
        A0e.A07(C283255Gu.A06);
        A0e.A01();
        A0e.A0F = true;
        A0e.A0A = true;
        A0e.A0B = true;
        C47898ELs.A00(A0e, r3, 13).A07(userSession);
    }
}
