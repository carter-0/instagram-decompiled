package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.M9t  reason: case insensitive filesystem */
public final class C66060M9t implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C62320sa A04;

    public C66060M9t(Activity activity, View view, UserSession userSession, C62320sa r4, int i) {
        this.A01 = activity;
        this.A00 = i;
        this.A02 = view;
        this.A03 = userSession;
        this.A04 = r4;
    }

    public final void run() {
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(this.A01, this.A00);
        A0e.A01();
        View view = this.A02;
        A0e.A03(view);
        A0e.A04(view, (view.getWidth() / 2) - 200, view.getHeight() - 16, false);
        A0e.A0F = true;
        A0e.A0B = true;
        A0e.A0A = true;
        KSP.A00(A0e, this.A04, 4).A07(this.A03);
    }
}
