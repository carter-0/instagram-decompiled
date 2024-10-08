package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.LSq  reason: case insensitive filesystem */
public final class C64183LSq {
    public ValueAnimator A00;
    public final ViewGroup A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final TargetViewSizeProvider A04;
    public final AnonymousClass872 A05;
    public final C3496881i A06;
    public final C3497281m A07;
    public final C352828Fe A08;
    public final C359028br A09;
    public final AnonymousClass0eM A0A = A01(this, 25);
    public final AnonymousClass0eM A0B = A01(this, 26);
    public final AnonymousClass0eM A0C = A01(this, 27);
    public final AnonymousClass0eM A0D = A01(this, 28);
    public final AnonymousClass0eM A0E = A01(this, 29);
    public final AnonymousClass0eM A0F = A01(this, 30);
    public final AnonymousClass0eM A0G = A01(this, 31);
    public final AnonymousClass0eM A0H = A01(this, 32);
    public final AnonymousClass0eM A0I = A01(this, 33);
    public final AnonymousClass0eM A0J = A01(this, 34);
    public final AnonymousClass0eM A0K = A01(this, 35);
    public final AnonymousClass0eM A0L = A01(this, 37);
    public final AnonymousClass0eM A0M = A01(this, 38);
    public final AnonymousClass0eM A0N = A01(this, 39);
    public final AnonymousClass0eM A0O = A01(this, 40);
    public final AnonymousClass0eM A0P = A01(this, 41);

    public C64183LSq(ViewGroup viewGroup, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass872 r4, AnonymousClass80D r5, C3496881i r6, C3497281m r7, C352828Fe r8, C359028br r9) {
        C51974G9v.A0d(1, r5, r9, r7, r6);
        0qQ.A0B(r4, 7);
        this.A01 = viewGroup;
        this.A04 = targetViewSizeProvider;
        this.A09 = r9;
        this.A07 = r7;
        this.A06 = r6;
        this.A05 = r4;
        this.A08 = r8;
        AnonymousClass4DH A0G2 = r5.A0G();
        0qQ.A07(A0G2);
        this.A02 = A0G2;
        UserSession userSession = r5.A0S;
        0qQ.A07(userSession);
        this.A03 = userSession;
    }

    public static final View A00(C64183LSq lSq) {
        return AnonymousClass7TH.A06(lSq.A0N);
    }

    public static AnonymousClass0eM A01(Object obj, int i) {
        return AnonymousClass1YB.A00(new C51765G0h(obj, i));
    }

    public final View A04() {
        C340297l2 r0 = this.A06.A02;
        if (r0 != null) {
            return r0.A0F;
        }
        return null;
    }

    public final View A05() {
        return AnonymousClass7TH.A06(this.A0M);
    }

    public static final void A02(C64183LSq lSq) {
        View A042 = lSq.A04();
        if (A042 != null) {
            AnonymousClass7TH.A06(lSq.A0M).setY(A042.getY());
        }
        View A043 = lSq.A04();
        if (A043 != null) {
            AnonymousClass7TH.A06(lSq.A0M).setX(A043.getX());
        }
        AnonymousClass7TH.A06(lSq.A0M).requestLayout();
    }

    public static final void A03(C64183LSq lSq, C53362Gmm gmm) {
        View A042 = lSq.A04();
        if (A042 != null) {
            A042.setTag(gmm);
            boolean z = gmm.A05;
            C58695Iw4 iw4 = new C58695Iw4(44, (Object) gmm, (Object) lSq, (Object) A042);
            C340297l2 r0 = lSq.A06.A02;
            if (r0 != null) {
                View A002 = r0.A0H.A00();
                if (z) {
                    A002.setVisibility(8);
                }
                iw4.invoke();
                if (z) {
                    11Z.A04(new C66005M7q(A002, lSq), 170);
                } else {
                    A02(lSq);
                }
            }
        }
    }
}
