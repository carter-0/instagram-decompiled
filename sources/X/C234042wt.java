package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.2wt  reason: invalid class name and case insensitive filesystem */
public final class C234042wt implements C252243on, C234052wu {
    public static final C234062wv A0T = new Object();
    public C231292rN A00;
    public AnonymousClass57Q A01;
    public C228232l0 A02;
    public C249763kK A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final Fragment A07;
    public final C234072ww A08;
    public final 1Ng A09;
    public final 1wn A0A = new AnonymousClass2x6(this);
    public final UserSession A0B;
    public final C234142xA A0C = new C234142xA(this);
    public final C234162xC A0D = new C234162xC(this);
    public final AnonymousClass2x4 A0E = new AnonymousClass2x4(this);
    public final C234102wz A0F = new C234102wz(this);
    public final C234082wx A0G = new C234082wx(this);
    public final AnonymousClass2x0 A0H = new AnonymousClass2x0(this);
    public final AnonymousClass2x8 A0I = new AnonymousClass2x8(this);
    public final C234152xB A0J = new C234152xB(this);
    public final AnonymousClass2x2 A0K = new AnonymousClass2x2(this);
    public final C234092wy A0L = new C234092wy(this);
    public final AnonymousClass2x1 A0M = new AnonymousClass2x1(this);
    public final C234122x7 A0N = new C234122x7(this);
    public final C234132x9 A0O = new C234132x9(this);
    public final C234112x5 A0P = new C234112x5(this);
    public final AnonymousClass2x3 A0Q = new AnonymousClass2x3(this);
    public final 1GI A0R;
    public final AnonymousClass4DU A0S;

    public C234042wt(Fragment fragment, UserSession userSession, AnonymousClass4DU r5) {
        0qQ.A0B(r5, 2);
        0qQ.A0B(userSession, 3);
        this.A07 = fragment;
        this.A0S = r5;
        this.A0B = userSession;
        this.A09 = AnonymousClass1Nd.A00(userSession);
        this.A08 = new C234072ww(userSession, r5, this.A03);
        this.A0R = 1GH.A00(userSession);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(Fragment fragment, UserSession userSession, C234042wt r5, String str) {
        String str2;
        FragmentActivity activity = r5.A07.getActivity();
        if (activity == null) {
            str2 = "trying to navigate to fragment on null activity";
        } else if (activity.isFinishing() || activity.isDestroyed()) {
            str2 = "trying to navigate to fragment after activity finished";
        } else {
            C309516Yo r1 = new C309516Yo(activity, userSession);
            r1.A0E = true;
            r1.A08();
            r1.A0B((Bundle) null, fragment);
            if (str != null) {
                r1.A0B = str;
            }
            r1.A05();
            return;
        }
        0wb.A03("MediaLinkBroadcastHandler", str2);
    }

    public static final boolean A01(1Xj r6, C234042wt r7, boolean z) {
        AnonymousClass37D A012;
        FragmentActivity activity = r7.A07.getActivity();
        if (!(activity == null || (A012 = AnonymousClass37D.A00.A01(activity)) == null)) {
            if (z) {
                UserSession userSession = r7.A0B;
                if (GED.A03(userSession, r6)) {
                    if (182.A06(0Tu.A06, userSession, 36321584941180467L)) {
                        r7.A06 = true;
                    } else {
                        A012.A0B();
                        return true;
                    }
                }
            }
            return !((AnonymousClass37F) A012).A0g;
        }
        return true;
    }

    public static final boolean A02(C234042wt r1) {
        AnonymousClass37D A012;
        FragmentActivity activity = r1.A07.getActivity();
        if (activity == null || (A012 = AnonymousClass37D.A00.A01(activity)) == null || !((AnonymousClass37F) A012).A0g) {
            return true;
        }
        return false;
    }

    public static final boolean A03(C234042wt r2) {
        AnonymousClass37D A012;
        FragmentActivity activity = r2.A07.getActivity();
        if (activity == null || (A012 = AnonymousClass37D.A00.A01(activity)) == null) {
            return false;
        }
        AnonymousClass37F r22 = (AnonymousClass37F) A012;
        if (!r22.A0g || !r22.A0f) {
            return false;
        }
        return true;
    }

    public final void onPause() {
        1Ng r2 = this.A09;
        r2.A02(this.A0O, C240213Ka.class);
        r2.A02(this.A0N, C240223Kb.class);
        r2.A02(this.A0I, C240233Kc.class);
        r2.A02(this.A0H, C240243Kd.class);
        r2.A02(this.A0A, C240253Ke.class);
        r2.A02(this.A0E, C240263Kf.class);
        r2.A02(this.A0Q, C240273Kg.class);
        r2.A02(this.A0M, C240283Kh.class);
        r2.A02(this.A0K, C240293Ki.class);
        r2.A02(this.A0G, C240303Kj.class);
        r2.A02(this.A0L, C240313Kk.class);
        r2.A02(this.A0F, C240323Kl.class);
        r2.A02(this.A0C, C240333Km.class);
        r2.A02(this.A0P, C240343Kn.class);
        r2.A02(this.A0D, C240353Ko.class);
        r2.A02(this.A0J, C240363Kp.class);
    }

    public final void onResume() {
        1Ng r2 = this.A09;
        r2.A01(this.A0O, C240213Ka.class);
        r2.A01(this.A0N, C240223Kb.class);
        r2.A01(this.A0I, C240233Kc.class);
        r2.A01(this.A0H, C240243Kd.class);
        r2.A01(this.A0A, C240253Ke.class);
        r2.A01(this.A0E, C240263Kf.class);
        r2.A01(this.A0Q, C240273Kg.class);
        r2.A01(this.A0M, C240283Kh.class);
        r2.A01(this.A0K, C240293Ki.class);
        r2.A01(this.A0G, C240303Kj.class);
        r2.A01(this.A0L, C240313Kk.class);
        r2.A01(this.A0F, C240323Kl.class);
        r2.A01(this.A0C, C240333Km.class);
        r2.A01(this.A0P, C240343Kn.class);
        r2.A01(this.A0D, C240353Ko.class);
        r2.A01(this.A0J, C240363Kp.class);
    }
}
