package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailLaunchConfig;

/* renamed from: X.6x7  reason: invalid class name and case insensitive filesystem */
public final class C323206x7 implements C252243on, C323216x8, C323226x9, C323236xA {
    public DcA A00;
    public final FragmentActivity A01;
    public final BusinessFlowAnalyticsLogger A02;
    public final AnonymousClass0iw A03;
    public final 0wc A04;
    public final UserSession A05;
    public final AnonymousClass4DU A06;
    public final AnonymousClass47L A07;
    public final C322456vr A08;
    public final C322296vZ A09;
    public final C318866pf A0A;
    public final C323196x6 A0B;
    public final C323256xC A0C;
    public final C322896wa A0D;
    public final UserDetailFragment A0E;
    public final C323246xB A0F;
    public final UserDetailTabController A0G;
    public final Dc6 A0H;
    public final Dda A0I;
    public final UserDetailLaunchConfig A0J;
    public final C321586uQ A0K;
    public final C231002qi A0L;
    public final AnonymousClass32A A0M;
    public final 2Zg A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final AnonymousClass0eM A0V;
    public final AnonymousClass0eM A0W;
    public final AnonymousClass0eM A0X;
    public final AnonymousClass0eM A0Y;
    public final AnonymousClass0eM A0Z;
    public final AnonymousClass0eM A0a;
    public final AnonymousClass0eM A0b;
    public final AnonymousClass0eM A0c;
    public final AnonymousClass0eM A0d;
    public final AnonymousClass0eM A0e;
    public final AnonymousClass0eM A0f;
    public final AnonymousClass0eM A0g;
    public final AnonymousClass0eM A0h;
    public final boolean A0i;
    public final 1wn A0j;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass1Nd.A00(this.A05).A01(this.A0j, C323936yL.class);
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onResume() {
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

    public final C319866rM Bgg() {
        return (C319856rL) this.A0Y.getValue();
    }

    public final AnonymousClass710 BhL() {
        return (C3250870z) this.A0c.getValue();
    }

    public final AnonymousClass71F BwV() {
        return (AnonymousClass71E) this.A0e.getValue();
    }

    public final void onDestroyView() {
        AnonymousClass1Nd.A00(this.A05).A02(this.A0j, C323936yL.class);
    }

    public final void onPause() {
        try {
            FragmentActivity fragmentActivity = this.A01;
            1OP r0 = 1OP.$redex_init_class;
            AnonymousClass3K2 A042 = AnonymousClass3K2.A04(fragmentActivity);
            if (A042 != null) {
                A042.A0S();
            }
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("activity: ");
            sb.append(this.A01);
            0wb.A06("UserDetailDelegate#onPause NPE on ReelViewerAnimator#get but null check passed", sb.toString(), e);
        }
    }

    public C323206x7(FragmentActivity fragmentActivity, BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, C2355930l r36, AnonymousClass0iw r37, 0wc r38, UserSession userSession, AnonymousClass4DU r40, C322456vr r41, C322296vZ r42, C318866pf r43, C318856pe r44, C323196x6 r45, C322896wa r46, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController, Dc6 dc6, C323336xK r50, Dda dda, UserDetailLaunchConfig userDetailLaunchConfig, C321586uQ r53, C231002qi r54, 2Zg r55, String str, String str2, String str3) {
        int i;
        String str4;
        String str5;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity2, 1);
        Dc6 dc62 = dc6;
        0qQ.A0B(dc62, 3);
        UserDetailTabController userDetailTabController2 = userDetailTabController;
        0qQ.A0B(userDetailTabController2, 4);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 5);
        C2355930l r22 = r36;
        0qQ.A0B(r22, 7);
        UserDetailLaunchConfig userDetailLaunchConfig2 = userDetailLaunchConfig;
        0qQ.A0B(userDetailLaunchConfig2, 12);
        0wc r15 = r38;
        0qQ.A0B(r15, 13);
        C231002qi r1 = r54;
        0qQ.A0B(r1, 17);
        C322296vZ r13 = r42;
        0qQ.A0B(r13, 19);
        C322456vr r14 = r41;
        0qQ.A0B(r14, 25);
        this.A01 = fragmentActivity2;
        UserDetailFragment userDetailFragment2 = userDetailFragment;
        this.A0E = userDetailFragment2;
        this.A0H = dc62;
        this.A0G = userDetailTabController2;
        this.A05 = userSession2;
        2Zg r6 = r55;
        this.A0N = r6;
        C318866pf r18 = r43;
        this.A0A = r18;
        AnonymousClass4DU r24 = r40;
        this.A06 = r24;
        this.A0J = userDetailLaunchConfig2;
        this.A04 = r15;
        this.A0K = r53;
        this.A02 = businessFlowAnalyticsLogger;
        this.A0P = str;
        this.A0L = r1;
        this.A0B = r45;
        this.A09 = r13;
        this.A0I = dda;
        this.A03 = r37;
        this.A0T = str2;
        this.A0U = str3;
        this.A0D = r46;
        this.A08 = r14;
        if (182.A06(0Tu.A05, userSession2, 2342156197492164411L)) {
            i = -1;
        } else {
            i = 60574;
        }
        this.A0M = new AnonymousClass32A(userDetailFragment2, userSession2, new AnonymousClass328(userDetailFragment2, i));
        this.A0O = userDetailLaunchConfig2.A0C;
        1Xl r0 = userDetailFragment2.A0M;
        if (r0 != null) {
            str4 = r0.BPf().getId();
        } else {
            str4 = null;
        }
        this.A0Q = str4;
        1Xl r02 = userDetailFragment2.A0M;
        if (r02 != null) {
            str5 = r02.BPf().C9L();
        } else {
            str5 = null;
        }
        this.A0S = str5;
        this.A0R = userDetailFragment2.A0m();
        this.A07 = userDetailFragment2.A0k();
        this.A0i = userDetailLaunchConfig2.A0W;
        this.A0F = new C323246xB(fragmentActivity2, userSession2, r6);
        C323336xK r62 = r50;
        C318866pf r25 = r18;
        FragmentActivity fragmentActivity3 = fragmentActivity2;
        UserDetailFragment userDetailFragment3 = userDetailFragment2;
        UserSession userSession3 = userSession2;
        this.A0C = new C323256xC(userDetailFragment2.requireContext(), fragmentActivity3, userDetailFragment3, r22, userSession3, r24, r25, r44, r62, dc62.A03, dc62.A03(), str4, str5, userDetailFragment2.A10.A0C.A00);
        this.A0j = new C323266xD(this);
        this.A0V = AnonymousClass0eN.A01(new AnonymousClass9M1(0, r62, this));
        this.A0g = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 22));
        this.A0a = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 16));
        this.A0W = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 12));
        this.A0X = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 13));
        this.A0Z = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 15));
        this.A0d = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 19));
        this.A0e = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 20));
        this.A0c = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 18));
        this.A0Y = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 14));
        this.A0h = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 23));
        this.A0b = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 17));
        this.A0f = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 21));
    }
}
