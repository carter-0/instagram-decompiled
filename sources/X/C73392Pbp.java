package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Pbp  reason: case insensitive filesystem */
public final /* synthetic */ class C73392Pbp implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ OCH A03;
    public final /* synthetic */ 1Av A04;

    public /* synthetic */ C73392Pbp(Activity activity, View view, UserSession userSession, OCH och, 1Av r5) {
        this.A03 = och;
        this.A00 = activity;
        this.A01 = view;
        this.A04 = r5;
        this.A02 = userSession;
    }

    public final void run() {
        OCH och = this.A03;
        Activity activity = this.A00;
        View view = this.A01;
        1Av r4 = this.A04;
        UserSession userSession = this.A02;
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(activity, 2131962416);
        A0e.A03(view);
        A0e.A01();
        A0e.A07(C283255Gu.A07);
        A0e.A0A = true;
        A0e.A04 = new C69034NdP(2, r4, och);
        A0e.A00().A07(userSession);
        och.A00 = null;
        och.A01 = null;
    }
}
