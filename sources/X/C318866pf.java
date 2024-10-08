package X;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.Collections;

/* renamed from: X.6pf  reason: invalid class name and case insensitive filesystem */
public final class C318866pf extends C252233om {
    public int A00;
    public int A01;
    public AnonymousClass4DH A02;
    public 1Ng A03;
    public 1wn A04;
    public UserSession A05;
    public DcA A06;
    public boolean A07;
    public boolean A08;

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 132) {
            A01(this);
        }
    }

    public static void A01(C318866pf r8) {
        String str;
        Uri A002 = A00(FFi.A00);
        if (r8.A07) {
            str = "family_entrypoint/?show_unconnected_interstitial=true";
        } else {
            str = "feed";
        }
        UserSession userSession = r8.A05;
        AnonymousClass0t1.A01.A01(userSession).A03.BaE();
        AnonymousClass4DH r4 = r8.A02;
        FFi.A01(r4.getContext(), r4, userSession, "profile_fb_entrypoint", A002.toString(), 002.A0R("fb://", str));
    }

    public static void A02(C318866pf r2) {
        AnonymousClass4DH r0 = r2.A02;
        FragmentActivity activity = r0.getActivity();
        if (activity != null && r0.isResumed()) {
            2dZ.A0t.A03(activity).A0T();
            DcA dcA = r2.A06;
            if (dcA != null) {
                dcA.A02();
            }
        }
    }

    public final void onCreate() {
        UserSession userSession = this.A05;
        if (182.A06(0Tu.A06, userSession, 36312513968604306L)) {
            RealtimeClientManager.getInstance(userSession).rawSubscribeCommand(Collections.singletonList(002.A0R("ig/fb_unseen_notif/", userSession.A06)));
            FXK fxk = this.A04;
            if (fxk == null) {
                fxk = new FXK(this);
                this.A04 = fxk;
            }
            this.A03.A01(fxk, C50269FWa.class);
        }
    }

    public final void onDestroy() {
        UserSession userSession = this.A05;
        RealtimeClientManager.getInstance(userSession).rawUnSubscribeCommand(Collections.singletonList(002.A0R("ig/fb_unseen_notif/", userSession.A06)));
        1wn r2 = this.A04;
        if (r2 != null) {
            this.A03.A02(r2, C50269FWa.class);
        }
    }

    public C318866pf(AnonymousClass4DH r5, UserSession userSession) {
        this.A02 = r5;
        this.A05 = userSession;
        this.A03 = AnonymousClass1Nd.A00(userSession);
        UserSession userSession2 = this.A05;
        0Tu r3 = 0Tu.A06;
        this.A01 = Long.valueOf(182.A01(r3, userSession2, 36593988946101799L)).intValue();
        182.A06(r3, this.A05, 36312513968735380L);
        182.A06(r3, this.A05, 36312513969194133L);
        this.A08 = Boolean.valueOf(182.A06(r3, this.A05, 36312513969456279L)).booleanValue();
        this.A07 = Boolean.valueOf(182.A06(r3, this.A05, 36312513969259670L)).booleanValue();
    }

    public static Uri A00(String str) {
        if (AnonymousClass5He.A00(str)) {
            str = FFi.A00;
        }
        return 0cp.A03(str).buildUpon().appendQueryParameter("ig_profile_tab", "true").build();
    }
}
