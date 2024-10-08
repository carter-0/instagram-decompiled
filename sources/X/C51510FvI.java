package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FvI  reason: case insensitive filesystem */
public final class C51510FvI implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass70R A03;

    public C51510FvI(Activity activity, View view, UserSession userSession, AnonymousClass70R r4) {
        this.A01 = view;
        this.A00 = activity;
        this.A02 = userSession;
        this.A03 = r4;
    }

    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            Activity activity = this.A00;
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, AnonymousClass7TF.A0d(activity.getResources(), 2131953780));
            A0f.A04(view, 0, ((-view.getHeight()) / 2) - 8, true);
            A0f.A02();
            A0f.A07(C283255Gu.A06);
            A0f.A0B = false;
            A0f.A0A = true;
            UserSession userSession = this.A02;
            A0f.A04 = new C47897ELr(1, this.A03, userSession);
            A0f.A00().A07(userSession);
        }
    }
}
