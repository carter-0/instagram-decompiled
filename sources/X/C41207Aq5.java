package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Aq5  reason: case insensitive filesystem */
public final class C41207Aq5 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass2xK A03;

    public C41207Aq5(Activity activity, View view, UserSession userSession, AnonymousClass2xK r4) {
        this.A00 = activity;
        this.A01 = view;
        this.A03 = r4;
        this.A02 = userSession;
    }

    public final void run() {
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(this.A00, 2131956151);
        A0e.A03(this.A01);
        A0e.A02();
        A0e.A0A = false;
        A0e.A04 = this.A03;
        A0e.A00().A07(this.A02);
    }
}
