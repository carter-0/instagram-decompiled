package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.72F  reason: invalid class name */
public final class AnonymousClass72F implements C13907Tl7 {
    public AnonymousClass3KQ A00;
    public final UserSession A01;
    public final String A02;
    public final C62320sa A03;
    public final AnonymousClass3KG A04;

    public AnonymousClass72F(Context context, UserSession userSession, String str, C62320sa r5) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = r5;
        this.A04 = AnonymousClass3KF.A00(context, userSession);
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final void onPause(AnonymousClass07Z r3) {
        0qQ.A0B(r3, 0);
        AnonymousClass3KQ r1 = this.A00;
        if (r1 != null) {
            AnonymousClass3KG r0 = this.A04;
            r0.A06(r1);
            r0.A04();
            this.A00 = null;
        }
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final void onResume(AnonymousClass07Z r3) {
        AnonymousClass3KG r1 = this.A04;
        r1.A03();
        AnonymousClass3KQ A002 = AnonymousClass3KG.A00(new AnonymousClass72H(this));
        this.A00 = A002;
        r1.A05(A002);
    }
}
