package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.4KC  reason: invalid class name */
public final class AnonymousClass4KC implements C13907Tl7 {
    public final Activity A00;
    public final UserSession A01;
    public final String A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C377209Ky(this, 3));
    public final 1Ng A04;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final void onPause(AnonymousClass07Z r4) {
        this.A04.A02((1wn) this.A03.getValue(), AnonymousClass4KD.class);
    }

    public final void onResume(AnonymousClass07Z r4) {
        this.A04.A01((1wn) this.A03.getValue(), AnonymousClass4KD.class);
    }

    public AnonymousClass4KC(UserSession userSession, Activity activity, String str) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = str;
        this.A04 = AnonymousClass1Nd.A00(userSession);
    }
}
