package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kct  reason: case insensitive filesystem */
public final class C62259Kct extends Us8 implements AnonymousClass3NL {
    public View A00;
    public final RelativeLayout A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62259Kct(android.view.View r11, X.AnonymousClass4DH r12, com.instagram.common.session.UserSession r13, boolean r14) {
        /*
            r10 = this;
            r0 = 1
            X.0qQ.A0B(r12, r0)
            android.view.LayoutInflater r1 = X.DbV.A0D(r11)
            r0 = 2131626827(0x7f0e0b4b, float:1.8880901E38)
            r8 = 0
            android.view.View r1 = r1.inflate(r0, r8)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            X.0qQ.A0C(r1, r0)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            if (r14 == 0) goto L_0x0109
            X.6go r2 = X.C313666go.BROADCASTER
        L_0x001b:
            boolean r3 = X.DbW.A1Z(r1)
            r7 = r10
            r10.<init>(r1)
            r10.A00 = r1
            r10.A02 = r12
            r10.A03 = r13
            r10.A01 = r1
            r10.A00 = r11
            r0 = 39
            X.MMn r6 = X.C66304MMn.A01(r10, r2, r0)
            r0 = 47
            X.MMq r5 = new X.MMq
            r5.<init>(r12, r0)
            X.0eO r4 = X.0eO.A02
            r2 = 48
            X.MMq r0 = new X.MMq
            r0.<init>(r5, r2)
            X.0eM r5 = X.AnonymousClass0eN.A00(r4, r0)
            java.lang.Class<X.Jiy> r0 = X.C60300Jiy.class
            X.0Yh r4 = X.DbS.A0z(r0)
            r0 = 49
            X.MMq r2 = new X.MMq
            r2.<init>(r5, r0)
            r0 = 38
            X.MMn r0 = X.C66304MMn.A01(r5, r8, r0)
            X.2kA r0 = X.DbS.A0I(r2, r6, r0, r4)
            r10.A0D = r0
            r0 = 45
            X.0eM r0 = X.C66307MMq.A01(r10, r0)
            r10.A09 = r0
            r0 = 46
            X.0eM r0 = X.C66307MMq.A01(r10, r0)
            r10.A0A = r0
            r2 = 0
            X.0eM r0 = X.C66302MMl.A00(r10, r2)
            r10.A0B = r0
            X.0eM r0 = X.C66302MMl.A00(r10, r3)
            r10.A0C = r0
            r0 = 41
            X.0eM r0 = X.C66307MMq.A01(r10, r0)
            r10.A05 = r0
            r9 = 43
            X.0eM r0 = X.C66307MMq.A01(r10, r9)
            r10.A07 = r0
            r0 = 44
            X.0eM r0 = X.C66307MMq.A01(r10, r0)
            r10.A08 = r0
            r0 = 40
            X.0eM r0 = X.C66307MMq.A01(r10, r0)
            r10.A04 = r0
            r0 = 42
            X.0eM r0 = X.C66307MMq.A01(r10, r0)
            r10.A06 = r0
            android.view.View r0 = r10.A00
            r1.addView(r0, r2)
            android.view.View r0 = r10.A00
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r1 = -1
            r0.height = r1
            android.view.View r0 = r10.A00
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.width = r1
            X.0eM r0 = r10.A09
            X.JTS.A1W(r0, r2)
            X.0eM r0 = r10.A0B
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r10.A00(r0)
            X.0eM r0 = r10.A0C
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r10.A00(r0)
            X.0eM r0 = r10.A05
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r10.A00(r0)
            X.0eM r0 = r10.A07
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r10.A00(r0)
            X.0eM r0 = r10.A04
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r10.A00(r0)
            X.0eM r0 = r10.A06
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r10.A00(r0)
            X.07U r6 = X.07U.A05
            X.07Z r5 = r12.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r5)
            X.JaL r4 = new X.JaL
            r4.<init>(r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r4, r0)
            return
        L_0x0109:
            X.6go r2 = X.C313666go.GUEST
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62259Kct.<init>(android.view.View, X.4DH, com.instagram.common.session.UserSession, boolean):void");
    }

    public static final void A01(View view, ImageView imageView, C62259Kct kct, C60930Jto jto) {
        ImageView imageView2 = view;
        if (view == null) {
            imageView2 = imageView;
        }
        imageView2.setVisibility(DbW.A01(jto.A03 ? 1 : 0));
        if (view == null) {
            view = imageView;
        }
        view.setEnabled(jto.A02);
        AnonymousClass4DH r2 = kct.A02;
        DbU.A13(r2.requireContext(), imageView, jto.A00);
        Integer num = jto.A01;
        if (num != null) {
            DbT.A1A(DbV.A05(r2), imageView, num.intValue());
        }
    }

    public final void A03(View view) {
        RelativeLayout relativeLayout = this.A01;
        relativeLayout.addView(view, 0);
        relativeLayout.removeView(this.A00);
        this.A00 = view;
    }

    public final void DP5(View view) {
    }

    public final boolean Dqe(View view) {
        C60300Jiy A0H;
        C318136oS A002;
        int i;
        0qQ.A0B(view, 0);
        view.performHapticFeedback(1);
        if (view.equals(AnonymousClass7TE.A14(this.A0B))) {
            C60300Jiy jiy = (C60300Jiy) this.A0D.getValue();
            C60300Jiy.A00(jiy);
            05G r0 = jiy.A09;
            JTU.A1P(r0);
            M0X m0x = jiy.A03;
            if (m0x != null) {
                m0x.A0F(002.A1D("toggleAudioMute: ", DbX.A1b(r0)));
            }
            MGU.A02(jiy, C318116oQ.A00(jiy), 9);
        } else if (view.equals(AnonymousClass7TE.A14(this.A0C))) {
            C60300Jiy jiy2 = (C60300Jiy) this.A0D.getValue();
            C60300Jiy.A00(jiy2);
            JTU.A1P(jiy2.A0E);
            C60300Jiy.A01(jiy2, false);
            return true;
        } else {
            if (view.equals(AnonymousClass7TE.A14(this.A05))) {
                A0H = (C60300Jiy) this.A0D.getValue();
                05G r4 = A0H.A0A;
                JTU.A1P(r4);
                M0X m0x2 = A0H.A03;
                if (m0x2 != null) {
                    Integer A0j = JTP.A0j(DbX.A1b(r4) ? 1 : 0);
                    m0x2.A0f.incrementAndGet();
                    LKD.A01(M0X.A02(m0x2, AnonymousClass05K.A0L), A0j);
                }
                M0W m0w = A0H.A04;
                if (m0w != null) {
                    m0w.A08(JTP.A0j(DbX.A1b(r4) ? 1 : 0));
                }
                A002 = C318116oQ.A00(A0H);
                i = 12;
            } else if (view.equals(AnonymousClass7TE.A14(this.A07))) {
                C60300Jiy jiy3 = (C60300Jiy) this.A0D.getValue();
                JTU.A1P(jiy3.A0B);
                MGU.A02(jiy3, C318116oQ.A00(jiy3), 11);
                return true;
            } else if (view.equals(AnonymousClass7TE.A14(this.A04))) {
                A0H = DbS.A0H(this.A0D);
                A002 = C318116oQ.A00(A0H);
                i = 8;
            } else if (view.equals(AnonymousClass7TE.A14(this.A06))) {
                A0H = DbS.A0H(this.A0D);
                A002 = C318116oQ.A00(A0H);
                i = 10;
            }
            MGU.A02(A0H, A002, i);
            return true;
        }
        return true;
    }

    private final void A00(View view) {
        if (view != null) {
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
            A0m.A04 = this;
            A0m.A05 = AnonymousClass05K.A01;
            A0m.A00();
        }
    }

    public final View A02() {
        return this.A00;
    }

    public final void A04() {
        M0X m0x;
        C63841L8w l8w;
        C60300Jiy jiy = (C60300Jiy) this.A0D.getValue();
        05G r3 = jiy.A0C;
        if (!(DbX.A1b(r3) || (m0x = jiy.A03) == null || (l8w = m0x.A06) == null)) {
            l8w.A04 = true;
            LKD.A01(M0X.A02(m0x, AnonymousClass05K.A0p), m0x.A07);
        }
        JTR.A1W(r3);
    }
}
