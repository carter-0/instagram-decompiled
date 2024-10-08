package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.AqF  reason: case insensitive filesystem */
public final class C41217AqF implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Av A03;

    public C41217AqF(Activity activity, View view, UserSession userSession, 1Av r4) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = r4;
        this.A02 = userSession;
    }

    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            Activity activity = this.A00;
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, AnonymousClass7TE.A16(activity, 2131955057));
            A0f.A03(view);
            A0f.A01();
            A0f.A07(C283255Gu.A07);
            A0f.A0A = true;
            A0f.A04 = new C389339pH(2, this.A03, this.A02);
            A0f.A00().A06();
        }
    }
}
