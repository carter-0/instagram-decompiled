package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.MnG  reason: case insensitive filesystem */
public final class C67399MnG extends C232222tE {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C74585PxY A03;
    public final XAH A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r7.A0H != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r44, X.C249703kE r45) {
        /*
            r43 = this;
            r2 = r45
            r9 = r44
            X.Mg7 r9 = (X.C66974Mg7) r9
            X.Mno r2 = (X.C67433Mno) r2
            r8 = 0
            X.0qQ.A0B(r9, r8)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.Mg0 r7 = r9.A00
            int r3 = r2.A00
            android.view.View r0 = r2.itemView
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r0 = r1.height
            if (r0 == r3) goto L_0x0025
            r1.height = r3
            android.view.View r0 = r2.itemView
            r0.setLayoutParams(r1)
        L_0x0025:
            r0 = r43
            boolean r1 = r0.A0D
            r24 = 0
            if (r1 != 0) goto L_0x0033
            boolean r1 = r7.A0H
            r20 = 0
            if (r1 == 0) goto L_0x0035
        L_0x0033:
            r20 = 1
        L_0x0035:
            X.Mnl r31 = X.C67437Mns.A00
            android.app.Activity r1 = r0.A00
            r32 = r1
            android.view.View r1 = r2.itemView
            android.content.Context r33 = r1.getContext()
            X.0qQ.A07(r33)
            com.instagram.common.session.UserSession r1 = r0.A02
            r35 = r1
            X.0iw r15 = r0.A01
            X.Ma1 r14 = r9.A00
            X.PxY r13 = r0.A03
            X.XAH r12 = r0.A04
            android.view.View r1 = r2.itemView
            java.lang.Object r6 = r1.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.search.common.ui.UserRowViewBinder.Holder"
            X.0qQ.A0C(r6, r1)
            X.Mnm r6 = (X.C67431Mnm) r6
            r17 = 0
            boolean r11 = r0.A0F
            boolean r1 = r7.A0F
            if (r1 != 0) goto L_0x0069
            boolean r2 = r7.A0H
            if (r2 == 0) goto L_0x006b
        L_0x0069:
            r24 = 1
        L_0x006b:
            java.lang.String r10 = r0.A05
            boolean r5 = r0.A0B
            boolean r4 = r0.A0E
            boolean r3 = r0.A0C
            if (r1 == 0) goto L_0x00aa
            boolean r2 = r0.A09
        L_0x0077:
            boolean r1 = r0.A0A
            boolean r0 = r0.A06
            X.Mnn r16 = new X.Mnn
            r18 = r17
            r23 = r8
            r21 = r11
            r22 = r8
            r25 = r5
            r26 = r4
            r27 = r3
            r28 = r2
            r29 = r1
            r30 = r0
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r34 = r15
            r36 = r7
            r37 = r14
            r38 = r9
            r39 = r13
            r40 = r6
            r41 = r16
            r42 = r12
            r31.A03(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return
        L_0x00aa:
            boolean r2 = r0.A08
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67399MnG.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C66974Mg7.class;
    }

    public C67399MnG(Activity activity, AnonymousClass0iw r3, UserSession userSession, C74585PxY pxY, XAH xah, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean A1Y = DbW.A1Y(userSession);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = pxY;
        this.A04 = xah;
        this.A05 = str;
        this.A0D = z;
        this.A0F = A1Y;
        this.A0E = z2;
        this.A0B = A1Y;
        this.A0C = z3;
        this.A08 = z4;
        this.A09 = z5;
        this.A0A = z6;
        this.A06 = z7;
        this.A07 = 0mk.A02(activity);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DbS.A1W(viewGroup);
        return new C67433Mno(C67430Mnl.A00(viewGroup.getContext(), viewGroup, this.A07));
    }
}
