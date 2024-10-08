package X;

/* renamed from: X.Olf  reason: case insensitive filesystem */
public final class C71490Olf implements AnonymousClass03Q {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71490Olf(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        return X.04k.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        return r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.04k Cvn(android.view.View r13, X.04k r14) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0087;
                case 1: goto L_0x006c;
                case 2: goto L_0x001e;
                case 3: goto L_0x0042;
                case 4: goto L_0x0129;
                case 5: goto L_0x0110;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.02M r1 = X.C66583MXo.A0F(r14)
            java.lang.Object r2 = r12.A01
            android.view.View r2 = (android.view.View) r2
            int r0 = r1.A03
            X.0nA.A0e(r2, r0)
            int r1 = r1.A00
            X.0nA.A0T(r2, r1)
            java.lang.Object r0 = r12.A02
            X.NIf r0 = (X.C68442NIf) r0
            r0.A00 = r1
        L_0x001d:
            return r14
        L_0x001e:
            r0 = 1
            X.0qQ.A0B(r14, r0)
            r1 = 8
            X.04h r0 = r14.A00
            boolean r0 = r0.A0I(r1)
            if (r0 == 0) goto L_0x0084
            java.lang.Object r2 = r12.A01
            X.1IX r2 = (X.1IX) r2
            boolean r0 = r2.isActive()
            if (r0 == 0) goto L_0x0084
            r1 = 0
            r2.resumeWith(r1)
            java.lang.Object r0 = r12.A02
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass03j.A00(r0, r1)
            goto L_0x0084
        L_0x0042:
            r3 = 1
            X.0qQ.A0B(r14, r3)
            r1 = 8
            X.04h r0 = r14.A00
            boolean r0 = r0.A0I(r1)
            if (r0 != 0) goto L_0x001d
            java.lang.Object r0 = r12.A01
            X.LD2 r0 = (X.LD2) r0
            X.L63 r2 = r0.A00
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0063
            X.05G r1 = r2.A01
            X.Kg1 r0 = X.C62451Kg1.CLOSE_ON_DISMISS_KEYBOARD
            r1.Epw(r0)
            r2.A00 = r3
        L_0x0063:
            java.lang.Object r1 = r12.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            X.AnonymousClass03j.A00(r1, r0)
            return r14
        L_0x006c:
            r0 = 1
            X.0qQ.A0B(r14, r0)
            java.lang.Object r0 = r12.A02
            X.0r1 r0 = (X.0r1) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x001d
            java.lang.Object r1 = r12.A01
            X.LCe r1 = (X.LCe) r1
            X.JyZ r0 = new X.JyZ
            r0.<init>((X.04k) r14)
            r1.A00(r0)
        L_0x0084:
            X.04k r14 = X.04k.A01
            return r14
        L_0x0087:
            java.lang.Object r6 = r12.A02
            X.PrK r6 = (X.C74231PrK) r6
            java.lang.Object r0 = r12.A01
            X.V3e r0 = (X.C16721V3e) r0
            int r9 = r0.A02
            int r7 = r0.A01
            int r11 = r0.A00
            X.Or6 r6 = (X.C71805Or6) r6
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r6.A00
            X.04h r5 = r14.A00
            X.02M r0 = r5.A03()
            int r0 = r0.A03
            r3.A0A = r0
            int r0 = r13.getLayoutDirection()
            boolean r10 = X.C66581MXm.A1V(r0)
            int r4 = r13.getPaddingBottom()
            int r1 = r13.getPaddingLeft()
            int r8 = r13.getPaddingRight()
            boolean r2 = r3.A0R
            if (r2 == 0) goto L_0x00c3
            int r0 = r14.A02()
            r3.A09 = r0
            int r4 = r11 + r0
        L_0x00c3:
            boolean r0 = r3.A0S
            if (r0 == 0) goto L_0x00d2
            r1 = r9
            if (r10 == 0) goto L_0x00cb
            r1 = r7
        L_0x00cb:
            X.02M r0 = r5.A03()
            int r0 = r0.A01
            int r1 = r1 + r0
        L_0x00d2:
            boolean r0 = r3.A0T
            if (r0 == 0) goto L_0x00e1
            if (r10 == 0) goto L_0x00d9
            r7 = r9
        L_0x00d9:
            X.02M r0 = r5.A03()
            int r0 = r0.A02
            int r8 = r7 + r0
        L_0x00e1:
            int r0 = r13.getPaddingTop()
            r13.setPadding(r1, r0, r8, r4)
            boolean r1 = r6.A01
            if (r1 == 0) goto L_0x00f4
            X.02M r0 = r5.A00()
            int r0 = r0.A00
            r3.A07 = r0
        L_0x00f4:
            if (r2 != 0) goto L_0x00f8
            if (r1 == 0) goto L_0x001d
        L_0x00f8:
            java.lang.ref.WeakReference r2 = r3.A0M
            if (r2 == 0) goto L_0x001d
            com.google.android.material.bottomsheet.BottomSheetBehavior.A04(r3)
            int r1 = r3.A0G
            r0 = 4
            if (r1 != r0) goto L_0x001d
            java.lang.Object r0 = r2.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x001d
            r0.requestLayout()
            return r14
        L_0x0110:
            X.02M r1 = X.C66583MXo.A0F(r14)
            java.lang.Object r2 = r12.A01
            android.view.View r2 = (android.view.View) r2
            int r0 = r1.A03
            X.0nA.A0e(r2, r0)
            int r1 = r1.A00
            X.0nA.A0T(r2, r1)
            java.lang.Object r0 = r12.A02
            X.NJL r0 = (X.NJL) r0
            r0.A00 = r1
            return r14
        L_0x0129:
            java.lang.Object r4 = r12.A01
            X.OsD r4 = (X.C71870OsD) r4
            java.lang.Object r3 = r12.A02
            android.content.Context r3 = (android.content.Context) r3
            X.04h r0 = r14.A00
            X.02M r0 = r0.A03()
            int r0 = r0.A03
            r4.A04 = r0
            X.Ob8 r2 = r4.A0F
            if (r2 == 0) goto L_0x015a
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r0 = r4.A0S
            boolean r0 = r0.A0W
            if (r0 == 0) goto L_0x015f
            android.content.res.Resources r0 = r3.getResources()
            int r0 = X.C71870OsD.A01(r0, r4)
            float r0 = (float) r0
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L_0x0152:
            int r0 = X.C71870OsD.A00(r3, r4)
            float r0 = (float) r0
            r2.A04(r1, r0)
        L_0x015a:
            X.04k r14 = X.03v.A05(r13, r14)
            return r14
        L_0x015f:
            r1 = 0
            goto L_0x0152
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71490Olf.Cvn(android.view.View, X.04k):X.04k");
    }
}
