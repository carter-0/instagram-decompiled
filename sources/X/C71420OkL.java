package X;

import android.view.View;

/* renamed from: X.OkL  reason: case insensitive filesystem */
public final class C71420OkL implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C71420OkL(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = obj4;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003a, code lost:
        r5.A02(X.AnonymousClass7TE.A1I(r6));
        r5.getContentView().measure(r13, r13);
        r5.showAsDropDown(r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x00ac, code lost:
        r4.A00(r0, r3, (X.AnonymousClass4DU) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r24) {
        /*
            r23 = this;
            r2 = r23
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x009a;
                case 2: goto L_0x0083;
                case 3: goto L_0x004f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r4 = r2.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            r7 = 0
            r13 = 0
            X.8Ov r5 = new X.8Ov
            r5.<init>(r0, r4, r7, r13)
            java.lang.Object r3 = r2.A03
            java.lang.Object r1 = r2.A02
            r0 = 2
            X.PHQ r10 = new X.PHQ
            r10.<init>(r0, r4, r1, r3)
            java.lang.String r12 = "Unpin User"
            r19 = 1
            X.8rI r6 = new X.8rI
            r8 = r7
            r9 = r7
            r11 = r7
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r20 = r13
            r21 = r13
            r22 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x003a:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r6)
            r5.A02(r0)
            android.view.View r0 = r5.getContentView()
            r0.measure(r13, r13)
            r0 = r24
            r5.showAsDropDown(r0)
        L_0x004d:
            r0 = 1
            return r0
        L_0x004f:
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r4 = r2.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            r7 = 0
            r13 = 0
            X.8Ov r5 = new X.8Ov
            r5.<init>(r0, r4, r7, r13)
            java.lang.Object r3 = r2.A03
            java.lang.Object r1 = r2.A02
            r0 = 1
            X.PHQ r10 = new X.PHQ
            r10.<init>(r0, r4, r1, r3)
            java.lang.String r12 = "Pin User"
            X.8rI r6 = new X.8rI
            r8 = r7
            r9 = r7
            r11 = r7
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r0
            r20 = r13
            r21 = r13
            r22 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x003a
        L_0x0083:
            java.lang.Object r4 = r2.A01
            X.GWo r4 = (X.C52537GWo) r4
            java.lang.Object r0 = r2.A03
            X.GSn r0 = (X.C52435GSn) r0
            X.1Xj r3 = r0.BPf()
            java.lang.Object r0 = r2.A04
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            java.lang.Object r1 = r2.A02
            goto L_0x00ac
        L_0x009a:
            java.lang.Object r4 = r2.A02
            X.GWo r4 = (X.C52537GWo) r4
            java.lang.Object r0 = r2.A04
            X.GSn r0 = (X.C52435GSn) r0
            X.1Xj r3 = r0.BPf()
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r2.A03
        L_0x00ac:
            X.4DU r1 = (X.AnonymousClass4DU) r1
            r4.A00(r0, r3, r1)
            goto L_0x004d
        L_0x00b2:
            java.lang.Object r3 = r2.A02
            X.MlI r3 = (X.C67283MlI) r3
            android.view.ViewGroup r6 = r3.A07
            r0 = 1
            r6.requestDisallowInterceptTouchEvent(r0)
            java.lang.Object r4 = r2.A01
            X.Pw7 r4 = (X.C74512Pw7) r4
            java.lang.Object r1 = r2.A04
            X.Mb9 r1 = (X.C66702Mb9) r1
            X.3sy r9 = r1.A0J
            com.instagram.model.direct.DirectShareTarget r8 = r1.A0H
            X.JwJ r0 = r1.A07
            java.lang.String r10 = r0.A01
            java.lang.Object r11 = r0.A00
            java.util.List r11 = (java.util.List) r11
            boolean r12 = r1.A0c
            X.Mha r0 = r3.A0O
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r0.A04
            android.graphics.RectF r5 = X.0nA.A0F(r0)
            java.lang.Object r7 = r2.A03
            X.MhZ r7 = (X.C67058MhZ) r7
            boolean r13 = r1.A0Y
            r4.DRf(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71420OkL.onLongClick(android.view.View):boolean");
    }
}
