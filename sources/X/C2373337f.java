package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.37f  reason: invalid class name and case insensitive filesystem */
public final class C2373337f extends 0vM {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2373337f(UserSession userSession, InstagramMainActivity instagramMainActivity) {
        super("InAppPurchasesSync", 659, 5, false, false);
        this.A01 = instagramMainActivity;
        this.A00 = userSession;
    }

    public final void loggedRun() {
        Activity activity = this.A01.A0f;
        0qQ.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        UserSession userSession = this.A00;
        0qQ.A0B(activity, 0);
        0xa r1 = ((AnonymousClass90R) userSession.A01(AnonymousClass90R.class, new C51802G2l((Object) userSession, 3))).A00;
        if (r1.getBoolean("ig_in_app_purchases_has_been_initialized", false) && r1.getBoolean("ig_in_app_purchases_synchronization_required", true)) {
            C49054EoY.A00();
            T7R t7r = (T7R) userSession.A01(T7R.class, new MJ4(6, activity, userSession));
            C61046Jvk jvk = new C61046Jvk(Pxd.A00(28), 0);
            jvk.A01 = true;
            t7r.A00.A0G(activity, jvk, new C12185Soa(t7r));
        }
    }
}
