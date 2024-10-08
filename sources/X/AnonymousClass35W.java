package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.35W  reason: invalid class name */
public final class AnonymousClass35W implements C252243on {
    public final C2368035d A00;
    public final AnonymousClass35Z A01;
    public final C2368235f A02;
    public final C2368235f A03;
    public final C2368235f A04;
    public final 1wn A05;
    public final 1wn A06;
    public final 1wn A07;
    public final 1wn A08;
    public final 1wn A09;
    public final 1wn A0A;
    public final 1wn A0B;
    public final 1wn A0C;
    public final 1wn A0D;
    public final 1wn A0E;
    public final 1wn A0F;
    public final 1wn A0G;
    public final 1wn A0H;
    public final 1wn A0I;
    public final 1wn A0J;
    public final 1wn A0K;
    public final 1wn A0L;
    public final 1wn A0M;
    public final 1wn A0N;
    public final 1wn A0O;
    public final 1wn A0P;
    public final 1wn A0Q;
    public final 1wn A0R;
    public final 1wn A0S;
    public final UserSession A0T;
    public final AnonymousClass35X A0U = new AnonymousClass35X();
    public final AnonymousClass2oD A0V;
    public final AnonymousClass4DU A0W;
    public final AnonymousClass35Y A0X;
    public final C249763kK A0Y;
    public final C2368135e A0Z;
    public final AnonymousClass35V A0a;
    public final WeakReference A0b;

    public AnonymousClass35W(UserSession userSession, AnonymousClass2oD r4, AnonymousClass4DU r5, C231002qi r6, C249763kK r7, C227802jw r8, AnonymousClass35V r9) {
        0qQ.A0B(r6, 2);
        0qQ.A0B(r7, 7);
        this.A0a = r9;
        this.A0V = r4;
        this.A0T = userSession;
        this.A0W = r5;
        this.A0Y = r7;
        this.A0X = new AnonymousClass35Y(r8, userSession, r6);
        this.A0b = new WeakReference(r8);
        this.A01 = new AnonymousClass35Z(r8.requireContext(), r8, r5, userSession);
        this.A00 = new C2368035d(r8.requireContext(), r8, userSession);
        this.A0Z = new C2368135e(r8, userSession);
        this.A04 = new C2368235f(AnonymousClass1Nd.A00(userSession));
        this.A03 = new C2368235f(AnonymousClass1Nd.A00(userSession));
        this.A02 = new C2368235f(AnonymousClass1Nd.A00(userSession));
        this.A09 = new C2368335g(this);
        this.A0M = new C2368435h(this);
        this.A0K = new C2368535i(this);
        this.A0C = new AnonymousClass35j(this);
        this.A0O = new C2368635k(this);
        this.A0H = new C2368735l(this);
        this.A0P = new C2368835m(this);
        this.A0L = new C2368935n(this);
        this.A0S = new C2369035o(this);
        this.A0R = new C2369135p(this);
        this.A0J = new C2369235q(r8, this);
        this.A05 = new C2369335r(r8, this);
        this.A0E = new C2369435s(this);
        this.A0N = new C2369535t(this);
        this.A0A = new C2369635u(this);
        this.A0D = new C2369735v(this);
        this.A07 = new C2369835w(this);
        this.A0Q = new C2369935x(this);
        this.A0F = new C2370035y(this);
        this.A0I = new C2370135z(this);
        this.A06 = new AnonymousClass360(this);
        this.A08 = new AnonymousClass361(this);
        this.A0G = new AnonymousClass362(this);
        this.A0B = new AnonymousClass363(r8);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onCreate() {
        C2368235f r2 = this.A03;
        r2.A99(this.A0H, C2370436c.class);
        r2.A99(this.A0P, C2370536d.class);
        r2.A99(this.A0L, C2370636e.class);
        r2.A99(this.A0S, C2370736f.class);
        r2.A99(this.A0R, C2370836g.class);
        Class<C2370936h> cls = C2370936h.class;
        r2.A99(this.A0J, cls);
        r2.A99(this.A0X, cls);
        r2.A99(this.A0E, C2371036i.class);
        r2.A99(this.A0N, C2371136j.class);
        r2.A99(this.A0A, C2371236k.class);
        r2.A99(this.A0D, C2371336l.class);
        r2.A99(this.A07, C2371436m.class);
        r2.A99(this.A0Q, C2371536n.class);
        r2.A99(this.A05, C2371636o.class);
        r2.A99(this.A08, C2371736p.class);
        r2.A99(this.A0G, C2371836q.class);
        r2.A99(this.A0B, C2371936r.class);
    }

    public final void onDestroy() {
        C2368235f r2 = this.A04;
        1Ng r1 = r2.A00;
        if (r1 != null) {
            r1.A04(r2.A01);
        }
        r2.A00 = null;
        C2368235f r22 = this.A03;
        1Ng r12 = r22.A00;
        if (r12 != null) {
            r12.A04(r22.A01);
        }
        r22.A00 = null;
        C2368235f r23 = this.A02;
        1Ng r13 = r23.A00;
        if (r13 != null) {
            r13.A04(r23.A01);
        }
        r23.A00 = null;
    }

    public final void onDestroyView() {
        C2368235f r0 = this.A04;
        1Ng r1 = r0.A00;
        if (r1 != null) {
            r1.A04(r0.A01);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C2368235f r2 = this.A04;
        r2.A99(this.A09, AnonymousClass3DO.class);
        r2.A99(this.A0M, AnonymousClass3DP.class);
        r2.A99(this.A0U, AnonymousClass3DQ.class);
        r2.A99(this.A0K, AnonymousClass3DR.class);
        r2.A99(this.A0C, AnonymousClass3DS.class);
        r2.A99(this.A0O, AnonymousClass3DT.class);
        r2.A99(this.A06, AnonymousClass3DU.class);
    }
}
