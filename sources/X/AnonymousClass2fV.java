package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.2fV  reason: invalid class name */
public final class AnonymousClass2fV extends 0vM {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2fV(UserSession userSession, InstagramMainActivity instagramMainActivity) {
        super("LimitedProfilePlugin", 43, 4, false, false);
        this.A00 = userSession;
        this.A01 = instagramMainActivity;
    }

    public final void loggedRun() {
        if (AnonymousClass1ZG.A01 == null) {
            0qQ.A0F("plugin");
            throw AnonymousClass00P.createAndThrow();
        }
        UserSession userSession = this.A00;
        InstagramMainActivity instagramMainActivity = this.A01;
        Context applicationContext = instagramMainActivity.getApplicationContext();
        0qQ.A07(applicationContext);
        AnonymousClass0iw A0n = instagramMainActivity.A0n();
        FragmentActivity fragmentActivity = instagramMainActivity.A0f;
        0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(A0n, 2);
        0qQ.A0B(fragmentActivity2, 3);
        AnonymousClass921 r3 = new AnonymousClass921(applicationContext, fragmentActivity2, A0n, userSession);
        long j = AnonymousClass1B0.A02;
        UserSession userSession2 = r3.A05;
        if (!AnonymousClass1B1.A00(userSession2).A00(1B2.A06) || !182.A06(0Tu.A05, userSession2, 36323045229669147L)) {
            1P0 r6 = r3.A04;
            0qQ.A0B(r6, 1);
            1NY r2 = new 1NY(userSession2, -2);
            r2.A08(AnonymousClass05K.A0N);
            r2.A0A("users/get_limited_interactions_reminder/");
            r2.A0O((15p) null, AnonymousClass927.class, AnonymousClass928.class, false);
            r2.A0R = true;
            1OC A0M = r2.A0M();
            A0M.A00 = r6;
            1ES.A03(A0M);
        }
    }
}
