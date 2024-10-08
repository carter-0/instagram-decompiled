package X;

import android.app.Activity;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;

/* renamed from: X.6yI  reason: invalid class name and case insensitive filesystem */
public final class C323906yI {
    public final Activity A00;
    public final UserSession A01;
    public final C252063oV A02;
    public final C322486vu A03;
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new AnonymousClass9LD(this, 24));

    public C323906yI(Activity activity, ViewStub viewStub, UserSession userSession, C322486vu r6, RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(activity, 2);
        0qQ.A0B(r6, 3);
        0qQ.A0B(viewStub, 4);
        0qQ.A0B(refreshableAppBarLayoutBehavior, 5);
        this.A01 = userSession;
        this.A00 = activity;
        this.A03 = r6;
        C252063oV A012 = 2b1.A01(viewStub, false, false);
        A012.EeU(new C323916yJ(refreshableAppBarLayoutBehavior));
        this.A02 = A012;
    }
}
