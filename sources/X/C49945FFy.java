package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Deprecated;

/* renamed from: X.FFy  reason: case insensitive filesystem */
public final class C49945FFy {
    public int A00 = -2;
    public View A01;
    public C331157Pu A02;
    public final C46498Dg1 A03;
    public final C47417E1l A04;

    public C49945FFy(C46498Dg1 dg1) {
        0qQ.A0B(dg1, 1);
        C47417E1l e1l = new C47417E1l();
        this.A04 = e1l;
        this.A03 = dg1;
        C331127Pr A0W = DbS.A0W(dg1.A08);
        A0W.A17 = dg1.A05;
        A0W.A0T = dg1.A03;
        A0W.A06 = 0;
        A0W.A1C = dg1.A06;
        A0W.A0O = dg1.A02;
        A0W.A1O = dg1.A07;
        A0W.A0X = new C65754Lz8(dg1, 3);
        A0W.A0U = new FmA(2, dg1, this);
        this.A02 = A0W.A00();
        e1l.A05.A00 = new C50475FcN(this);
        e1l.setDayNightMode(dg1.A02);
    }

    public final void A03(Activity activity) {
        0qQ.A0B(activity, 0);
        C331157Pu r3 = this.A02;
        Context context = this.A03.A00;
        C47417E1l e1l = this.A04;
        0qQ.A0B(e1l, 2);
        C331157Pu.A00(activity, context, e1l, r3, (AnonymousClass37D) null);
        A01(this);
    }

    @Deprecated(message = "")
    public final void A05(Context context) {
        0qQ.A0B(context, 0);
        this.A02.A03(context, this.A04);
        A01(this);
    }

    public static void A00(Fragment fragment, C46498Dg1 dg1) {
        new C49945FFy(dg1).A03(fragment.requireActivity());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (r1 == 0) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C49945FFy r9) {
        /*
            X.Dg1 r5 = r9.A03
            android.view.View r7 = r5.A01
            if (r7 == 0) goto L_0x0010
            r1 = 44
            X.FPF r0 = new X.FPF
            r0.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r9)
            X.AnonymousClass0fU.A00(r0, r7)
        L_0x0010:
            X.DfA r6 = r5.A04
            if (r7 == 0) goto L_0x0052
            X.E1l r4 = r9.A04
            boolean r3 = r5.A06
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0042
            android.view.View r1 = r4.A00
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x0105
            r0 = 2131431194(0x7f0b0f1a, float:1.848411E38)
            android.view.ViewGroup r1 = X.DbX.A0I(r1, r0)
            r1.addView(r7)
            r0 = 0
            r1.setVisibility(r0)
            if (r3 == 0) goto L_0x0042
            android.view.View r1 = r4.A00
            if (r1 == 0) goto L_0x0100
            r0 = 2131427608(0x7f0b0118, float:1.8476837E38)
            android.view.View r0 = X.AnonymousClass7TF.A0F(r1, r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r0.inflate()
        L_0x0042:
            X.E1l r1 = r9.A04
            java.util.List r2 = r5.A09
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.DmB r1 = r1.A05
            java.util.List r0 = r1.A01
            X.DbW.A0z(r1, r2, r0)
            return
        L_0x0052:
            if (r6 == 0) goto L_0x0042
            X.E1l r4 = r9.A04
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0042
            r3 = 0
            android.view.View r7 = r4.A00
            java.lang.String r8 = "Required value was null."
            if (r7 == 0) goto L_0x0114
            r0 = 2131427610(0x7f0b011a, float:1.8476841E38)
            android.view.View r0 = X.AnonymousClass7TF.A0F(r7, r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r0.inflate()
            r0 = 2131427607(0x7f0b0117, float:1.8476835E38)
            android.widget.TextView r0 = X.DbU.A0G(r7, r0)
            r4.A01 = r0
            if (r0 == 0) goto L_0x010f
            X.2eQ.A03(r0)
            java.lang.CharSequence r0 = r6.A0F
            if (r0 == 0) goto L_0x0086
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0087
        L_0x0086:
            r0 = 1
        L_0x0087:
            r0 = r0 ^ 1
            r2 = 0
            if (r0 == 0) goto L_0x00fe
            r0 = 2131427612(0x7f0b011c, float:1.8476845E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r7, r0)
        L_0x0093:
            java.lang.CharSequence r0 = r6.A0D
            if (r0 == 0) goto L_0x00a4
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00a4
            r0 = 2131427603(0x7f0b0113, float:1.8476827E38)
            android.widget.TextView r2 = X.AnonymousClass7TE.A0d(r7, r0)
        L_0x00a4:
            android.widget.TextView r0 = r4.A01
            if (r0 == 0) goto L_0x010a
            r6.A04(r0, r1, r2)
            com.instagram.common.typedurl.ImageUrl r0 = r6.A0B
            if (r0 != 0) goto L_0x00b3
            com.instagram.common.typedurl.ImageUrl r0 = r6.A0A
            if (r0 == 0) goto L_0x0042
        L_0x00b3:
            r0 = 2131427604(0x7f0b0114, float:1.8476829E38)
            X.DbT.A1F(r7, r0, r3)
            com.instagram.common.typedurl.ImageUrl r0 = r6.A0B
            if (r0 == 0) goto L_0x00dd
            boolean r1 = r6.A0J
            r0 = 2131427605(0x7f0b0115, float:1.847683E38)
            if (r1 == 0) goto L_0x00c7
            r0 = 2131427606(0x7f0b0116, float:1.8476833E38)
        L_0x00c7:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = X.DbX.A0b(r7, r0)
            com.instagram.common.typedurl.ImageUrl r1 = r6.A0B
            if (r2 == 0) goto L_0x00dd
            boolean r0 = X.C253833rU.A02(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00dd
            r2.setUrl(r1, r4)
            r2.setVisibility(r3)
        L_0x00dd:
            com.instagram.common.typedurl.ImageUrl r0 = r6.A0A
            if (r0 == 0) goto L_0x0042
            r0 = 2131428503(0x7f0b0497, float:1.8478652E38)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = X.DbX.A0j(r7, r0)
            if (r2 == 0) goto L_0x0042
            com.instagram.common.typedurl.ImageUrl r1 = r6.A0A
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 != 0) goto L_0x0042
            r0 = 0
            r2.A0F(r0, r4, r1)
            r2.A07()
            r2.setVisibility(r3)
            goto L_0x0042
        L_0x00fe:
            r1 = r2
            goto L_0x0093
        L_0x0100:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r2)
            throw r0
        L_0x0105:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r2)
            throw r0
        L_0x010a:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r8)
            throw r0
        L_0x010f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r8)
            throw r0
        L_0x0114:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49945FFy.A01(X.FFy):void");
    }

    public final void A02() {
        this.A02.A0L((C332277Ui) null);
    }

    public final void A04(Context context) {
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(context);
        if (A022 != null) {
            AnonymousClass37F r3 = (AnonymousClass37F) A022;
            r3.A0H = new FmM(3, context, this, r3.A0H);
            A022.A0B();
        }
    }

    public final void A06(C331127Pr r3) {
        this.A02.A0F(this.A04, r3);
        A01(this);
    }

    public C49945FFy(C46498Dg1 dg1, C331157Pu r5) {
        this.A02 = r5;
        C47417E1l e1l = new C47417E1l();
        this.A04 = e1l;
        e1l.A05.A00 = new C50476FcO(this);
        e1l.setDayNightMode(dg1.A02);
        this.A03 = dg1;
    }
}
