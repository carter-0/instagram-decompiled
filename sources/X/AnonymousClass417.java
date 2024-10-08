package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.417  reason: invalid class name */
public final class AnonymousClass417 extends C252633pQ {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass416 A02;
    public final 0Pl A03;
    public final boolean A04;
    public final Activity A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass417(Activity activity, Context context, UserSession userSession, AnonymousClass416 r5, 0Pl r6, boolean z) {
        super(context);
        0qQ.A0B(context, 2);
        0qQ.A0B(r6, 3);
        0qQ.A0B(userSession, 5);
        this.A05 = activity;
        this.A00 = context;
        this.A03 = r6;
        this.A02 = r5;
        this.A01 = userSession;
        this.A04 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r0.A1X().A02.contains(r7) == true) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r13.A06 != X.C252883pr.Success) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C376639It r24, X.AnonymousClass419 r25, X.AnonymousClass4DU r26, X.C245833dY r27) {
        /*
            r23 = this;
            r4 = 0
            r5 = r25
            X.0qQ.A0B(r5, r4)
            r0 = r27
            X.3W1 r3 = r0.A03
            X.3gp r13 = r0.A01
            X.1Xj r10 = r0.A02
            int r15 = r0.A00
            X.1sy r14 = r3.A0o
            java.lang.Integer r2 = r13.A0Z
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r2 == r1) goto L_0x0020
            X.3pr r6 = r13.A06
            X.3pr r0 = X.C252883pr.Success
            r16 = 1
            if (r6 == r0) goto L_0x0022
        L_0x0020:
            r16 = 0
        L_0x0022:
            java.lang.String r7 = r13.A0F
            if (r7 == 0) goto L_0x018c
            r6 = 1
            r17 = 1
            X.1Xj r0 = r13.A07
            if (r0 == 0) goto L_0x0198
            X.1i7 r0 = r0.A1X()
            java.util.Set r0 = r0.A02
            boolean r0 = r0.contains(r7)
            if (r0 != r6) goto L_0x018c
        L_0x0039:
            int r0 = r3.A03
            boolean r19 = X.1sx.A0I(r13, r0)
            r7 = r23
            X.0Pl r11 = r7.A03
            android.content.Context r12 = r7.A00
            r6 = r24
            boolean r0 = r6.A00
            r18 = r0
            android.text.Layout r8 = r11.A0C(r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0059
            android.view.View r9 = r5.A0A
            r0 = 4
            X.2eQ.A04(r9, r0)
        L_0x0059:
            com.instagram.ui.widget.textview.IgTextLayoutView r9 = r5.A0C
            r9.setTextLayout(r8)
            android.view.View r8 = r5.A09
            r0 = 8
            if (r17 == 0) goto L_0x0065
            r0 = 0
        L_0x0065:
            r8.setVisibility(r0)
            if (r2 == r1) goto L_0x017d
            X.3pr r1 = r13.A06
            X.3pr r0 = X.C252883pr.Success
            if (r1 != r0) goto L_0x017d
            android.view.View r0 = r5.A00
            if (r0 != 0) goto L_0x0098
            android.view.ViewStub r0 = r5.A0B
            android.view.View r1 = r0.inflate()
            r5.A00 = r1
            r0 = 2131440159(0x7f0b321f, float:1.8502294E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = (com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView) r0
            r5.A06 = r0
            X.5xz r2 = new X.5xz
            r2.<init>()
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r1 = r5.A06
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r2.A01(r0)
            r5.A07 = r2
        L_0x0098:
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r1 = r5.A06
            if (r1 == 0) goto L_0x0190
            boolean r0 = r13.A0O
            r1.setSelected(r0)
            android.view.View r2 = r5.A00
            if (r2 == 0) goto L_0x00d1
            X.5ld r0 = new X.5ld
            r19 = r7
            r20 = r13
            r21 = r10
            r22 = r3
            r17 = r0
            r18 = r5
            r17.<init>(r18, r19, r20, r21, r22)
            X.AnonymousClass0fU.A00(r0, r2)
            android.content.res.Resources r8 = r12.getResources()
            boolean r1 = r13.A0O
            r0 = 2131975018(0x7f135b6a, float:1.9587116E38)
            if (r1 == 0) goto L_0x00c7
            r0 = 2131975022(0x7f135b6e, float:1.9587125E38)
        L_0x00c7:
            java.lang.String r0 = r8.getString(r0)
            r2.setContentDescription(r0)
            r2.setVisibility(r4)
        L_0x00d1:
            if (r16 != 0) goto L_0x00de
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r4 = r1.getDimensionPixelSize(r0)
        L_0x00de:
            X.0nA.A0b(r9, r4)
            X.3W1 r2 = r5.A04
            if (r2 == 0) goto L_0x00ea
            r1 = 0
            r0 = 1
            r2.A0M(r5, r1, r0)
        L_0x00ea:
            r5.A04 = r3
            com.instagram.common.session.UserSession r4 = r7.A01
            r5.A01 = r4
            java.lang.String r0 = r6.A02
            r5.A08 = r0
            r0 = r26
            r5.A03 = r0
            r5.A02 = r13
            r5.A05 = r11
            X.C268384dI.A02(r5)
            r1 = 0
            r0 = 1
            r3.A0L(r5, r1, r0)
            X.1Xj r5 = r13.A07
            boolean r0 = r13.A0h
            if (r0 == 0) goto L_0x011e
            X.3W8 r0 = r3.A3b
            java.lang.Object r1 = r0.A00
            X.3W9 r0 = X.AnonymousClass3W9.Translated
            if (r1 != r0) goto L_0x011e
        L_0x0112:
            boolean r0 = r13.A03()
            if (r0 == 0) goto L_0x011d
            X.3aa r0 = X.C244063aa.CAPTION
            X.C244083ac.A05(r9, r0)
        L_0x011d:
            return
        L_0x011e:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321108198761578(0x8109db0009246a, double:3.032953306035871E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x016d
            X.1Xj r0 = r13.A07
            if (r0 == 0) goto L_0x016d
            com.instagram.user.model.User r0 = r0.A2A(r4)
            if (r0 == 0) goto L_0x016d
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r4.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x016d
        L_0x0141:
            int r3 = r13.A0R
            if (r3 <= 0) goto L_0x0112
            if (r5 == 0) goto L_0x0112
            X.1sy r0 = X.1sy.A0H
            if (r0 == r14) goto L_0x016a
            X.1sy r0 = X.1sy.A0I
            if (r0 == r14) goto L_0x016a
            X.1sy r0 = X.1sy.A0U
            if (r0 == r14) goto L_0x016a
            X.1sy r0 = X.1sy.A08
            if (r14 != r0) goto L_0x0167
            r0 = 563(0x233, float:7.89E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
        L_0x015d:
            X.4H4 r1 = X.AnonymousClass4H4.A00
            java.lang.String r0 = r5.getId()
            r1.A07(r4, r0, r2, r3)
            goto L_0x0112
        L_0x0167:
            java.lang.String r2 = ""
            goto L_0x015d
        L_0x016a:
            java.lang.String r2 = "post_view"
            goto L_0x015d
        L_0x016d:
            int r0 = r13.A0R
            if (r0 == 0) goto L_0x0112
            r0 = 36321108198630504(0x8109db00072468, double:3.0329533059529794E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0112
            goto L_0x0141
        L_0x017d:
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x00d1
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r1.setOnClickListener(r0)
            goto L_0x00d1
        L_0x018c:
            r17 = 0
            goto L_0x0039
        L_0x0190:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0198:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass417.A06(X.9It, X.419, X.4DU, X.3dY):void");
    }
}
