package X;

/* renamed from: X.USg  reason: case insensitive filesystem */
public final class C15150USg extends C19062WIs {
    public final int[] A00;
    public final int[] A01;
    public final C18600Vut[] A02;
    public final /* synthetic */ C18592Vuj A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15150USg(C18592Vuj vuj, int[] iArr, int[] iArr2, C18600Vut[] vutArr, int i) {
        super(vuj, i);
        this.A03 = vuj;
        this.A00 = iArr;
        this.A02 = vutArr;
        this.A01 = iArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r0.A04.get(r23) == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ca, code lost:
        if (r1.getChildCount(r2) != 0) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r2 = new X.QZA(X.002.A0x("Trying to remove a view index above child count ", " view tag: ", "\n detail: ", X.W0R.A00(r2, r1, r10, r3, r9), r4, r23));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AT8() {
        /*
            r24 = this;
            r2 = r24
            X.Vuj r0 = r2.A03
            X.W0R r0 = r0.A0L
            int r1 = r2.A00
            r23 = r1
            int[] r10 = r2.A00
            X.Vut[] r9 = r2.A02
            int[] r3 = r2.A01
            monitor-enter(r0)
            java.util.HashMap r1 = r0.A00     // Catch:{ all -> 0x0210 }
            if (r1 != 0) goto L_0x001c
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0210 }
            r1.<init>()     // Catch:{ all -> 0x0210 }
            r0.A00 = r1     // Catch:{ all -> 0x0210 }
        L_0x001c:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0210 }
            boolean r1 = r1.containsKey(r13)     // Catch:{ all -> 0x0210 }
            if (r1 != 0) goto L_0x0030
            java.util.HashMap r2 = r0.A00     // Catch:{ all -> 0x0210 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0210 }
            r1.<init>()     // Catch:{ all -> 0x0210 }
            r2.put(r13, r1)     // Catch:{ all -> 0x0210 }
        L_0x0030:
            java.util.HashMap r1 = r0.A00     // Catch:{ all -> 0x0210 }
            java.lang.Object r12 = r1.get(r13)     // Catch:{ all -> 0x0210 }
            java.util.Set r12 = (java.util.Set) r12     // Catch:{ all -> 0x0210 }
            android.util.SparseArray r1 = r0.A03     // Catch:{ all -> 0x0210 }
            r22 = r1
            r2 = r23
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0210 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x0210 }
            r1 = r23
            com.facebook.react.uimanager.ViewManager r1 = r0.A03(r1)     // Catch:{ all -> 0x0210 }
            com.facebook.react.uimanager.ViewGroupManager r1 = (com.facebook.react.uimanager.ViewGroupManager) r1     // Catch:{ all -> 0x0210 }
            if (r2 == 0) goto L_0x01e5
            int r6 = r1.getChildCount((android.view.ViewGroup) r2)     // Catch:{ all -> 0x0210 }
            if (r10 == 0) goto L_0x00b5
            int r4 = r10.length     // Catch:{ all -> 0x0210 }
            int r11 = r4 + -1
        L_0x0057:
            if (r11 < 0) goto L_0x00b5
            r4 = r10[r11]     // Catch:{ all -> 0x0210 }
            if (r4 < 0) goto L_0x009d
            android.view.View r5 = r1.getChildAt((android.view.ViewGroup) r2, (int) r4)     // Catch:{ all -> 0x0210 }
            if (r5 != 0) goto L_0x0073
            android.util.SparseBooleanArray r6 = r0.A04     // Catch:{ all -> 0x0210 }
            r5 = r23
            boolean r5 = r6.get(r5)     // Catch:{ all -> 0x0210 }
            if (r5 == 0) goto L_0x01ce
            int r5 = r1.getChildCount((android.view.ViewGroup) r2)     // Catch:{ all -> 0x0210 }
            goto L_0x01ca
        L_0x0073:
            if (r4 >= r6) goto L_0x01f9
            android.view.View r6 = r1.getChildAt((android.view.ViewGroup) r2, (int) r4)     // Catch:{ all -> 0x0210 }
            boolean r5 = r0.A09     // Catch:{ all -> 0x0210 }
            if (r5 == 0) goto L_0x0096
            X.Vv6 r5 = r0.A08     // Catch:{ all -> 0x0210 }
            boolean r5 = r5.A02(r6)     // Catch:{ all -> 0x0210 }
            if (r5 == 0) goto L_0x0096
            int r8 = r6.getId()     // Catch:{ all -> 0x0210 }
            if (r3 == 0) goto L_0x0096
            int r7 = r3.length     // Catch:{ all -> 0x0210 }
            r6 = 0
        L_0x008d:
            if (r6 >= r7) goto L_0x0096
            r5 = r3[r6]     // Catch:{ all -> 0x0210 }
            if (r5 == r8) goto L_0x0099
            int r6 = r6 + 1
            goto L_0x008d
        L_0x0096:
            r1.removeViewAt((android.view.ViewGroup) r2, (int) r4)     // Catch:{ all -> 0x0210 }
        L_0x0099:
            int r11 = r11 + -1
            r6 = r4
            goto L_0x0057
        L_0x009d:
            java.lang.String r5 = "Trying to remove a negative view index:"
            java.lang.String r6 = " view tag: "
            java.lang.String r7 = "\n detail: "
            java.lang.String r8 = X.W0R.A00(r2, r1, r10, r3, r9)     // Catch:{ all -> 0x0210 }
            r9 = r4
            r10 = r23
            java.lang.String r1 = X.002.A0x(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0210 }
            X.QZA r2 = new X.QZA     // Catch:{ all -> 0x0210 }
            r2.<init>(r1)     // Catch:{ all -> 0x0210 }
            goto L_0x020f
        L_0x00b5:
            if (r3 == 0) goto L_0x016a
            r11 = 0
        L_0x00b8:
            int r4 = r3.length     // Catch:{ all -> 0x0210 }
            if (r11 >= r4) goto L_0x016a
            r7 = r3[r11]     // Catch:{ all -> 0x0210 }
            r4 = r22
            java.lang.Object r8 = r4.get(r7)     // Catch:{ all -> 0x0210 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x0210 }
            if (r8 == 0) goto L_0x0157
            boolean r4 = r0.A09     // Catch:{ all -> 0x0210 }
            if (r4 == 0) goto L_0x0150
            X.Vv6 r6 = r0.A08     // Catch:{ all -> 0x0210 }
            boolean r4 = r6.A02(r8)     // Catch:{ all -> 0x0210 }
            if (r4 == 0) goto L_0x0150
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0210 }
            r12.add(r4)     // Catch:{ all -> 0x0210 }
            X.Vhj r15 = new X.Vhj     // Catch:{ all -> 0x0210 }
            r19 = r1
            r20 = r12
            r21 = r23
            r16 = r8
            r17 = r2
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0210 }
            X.Vvo r14 = r6.A05     // Catch:{ all -> 0x0210 }
            int r18 = r8.getLeft()     // Catch:{ all -> 0x0210 }
            int r19 = r8.getTop()     // Catch:{ all -> 0x0210 }
            int r20 = r8.getWidth()     // Catch:{ all -> 0x0210 }
            int r21 = r8.getHeight()     // Catch:{ all -> 0x0210 }
            boolean r4 = r14.A02()     // Catch:{ all -> 0x0210 }
            if (r4 == 0) goto L_0x014c
            r16 = r14
            r17 = r8
            android.view.animation.Animation r7 = r16.A00(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0210 }
            if (r7 == 0) goto L_0x014c
            int r4 = r14.A01     // Catch:{ all -> 0x0210 }
            long r4 = (long) r4     // Catch:{ all -> 0x0210 }
            r7.setDuration(r4)     // Catch:{ all -> 0x0210 }
            int r4 = r14.A00     // Catch:{ all -> 0x0210 }
            long r4 = (long) r4     // Catch:{ all -> 0x0210 }
            r7.setStartOffset(r4)     // Catch:{ all -> 0x0210 }
            android.view.animation.Interpolator r4 = r14.A02     // Catch:{ all -> 0x0210 }
            r7.setInterpolator(r4)     // Catch:{ all -> 0x0210 }
            X.C18613Vv6.A00(r8, r6)     // Catch:{ all -> 0x0210 }
            r5 = 0
            X.Sbh r4 = new X.Sbh     // Catch:{ all -> 0x0210 }
            r4.<init>(r5, r6, r15)     // Catch:{ all -> 0x0210 }
            r7.setAnimationListener(r4)     // Catch:{ all -> 0x0210 }
            long r4 = r7.getDuration()     // Catch:{ all -> 0x0210 }
            long r14 = r6.A00     // Catch:{ all -> 0x0210 }
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x0148
            java.lang.Runnable r14 = r6.A01     // Catch:{ all -> 0x0210 }
            if (r14 == 0) goto L_0x0146
            android.os.Handler r15 = X.C18773W0w.A00()     // Catch:{ all -> 0x0210 }
            java.lang.Runnable r14 = r6.A01     // Catch:{ all -> 0x0210 }
            r15.removeCallbacks(r14)     // Catch:{ all -> 0x0210 }
            java.lang.Runnable r14 = r6.A01     // Catch:{ all -> 0x0210 }
            r15.postDelayed(r14, r4)     // Catch:{ all -> 0x0210 }
        L_0x0146:
            r6.A00 = r4     // Catch:{ all -> 0x0210 }
        L_0x0148:
            r8.startAnimation(r7)     // Catch:{ all -> 0x0210 }
            goto L_0x0153
        L_0x014c:
            r15.A00()     // Catch:{ all -> 0x0210 }
            goto L_0x0153
        L_0x0150:
            r0.A07(r8)     // Catch:{ all -> 0x0210 }
        L_0x0153:
            int r11 = r11 + 1
            goto L_0x00b8
        L_0x0157:
            java.lang.String r5 = "Trying to destroy unknown view tag: "
            java.lang.String r4 = "\n detail: "
            java.lang.String r1 = X.W0R.A00(r2, r1, r10, r3, r9)     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = X.002.A05(r7, r5, r4, r1)     // Catch:{ all -> 0x0210 }
            X.QZA r2 = new X.QZA     // Catch:{ all -> 0x0210 }
            r2.<init>(r1)     // Catch:{ all -> 0x0210 }
            goto L_0x020f
        L_0x016a:
            if (r9 == 0) goto L_0x01be
            r8 = 0
        L_0x016d:
            int r4 = r9.length     // Catch:{ all -> 0x0210 }
            if (r8 >= r4) goto L_0x01be
            r7 = r9[r8]     // Catch:{ all -> 0x0210 }
            int r5 = r7.A01     // Catch:{ all -> 0x0210 }
            r4 = r22
            java.lang.Object r11 = r4.get(r5)     // Catch:{ all -> 0x0210 }
            android.view.View r11 = (android.view.View) r11     // Catch:{ all -> 0x0210 }
            if (r11 == 0) goto L_0x01aa
            int r7 = r7.A00     // Catch:{ all -> 0x0210 }
            r6 = r7
            boolean r4 = r12.isEmpty()     // Catch:{ all -> 0x0210 }
            if (r4 != 0) goto L_0x01a4
            r7 = 0
            r5 = 0
        L_0x0189:
            int r4 = r2.getChildCount()     // Catch:{ all -> 0x0210 }
            if (r7 >= r4) goto L_0x01a4
            if (r5 == r6) goto L_0x01a4
            android.view.View r4 = r2.getChildAt(r7)     // Catch:{ all -> 0x0210 }
            int r4 = r4.getId()     // Catch:{ all -> 0x0210 }
            boolean r4 = X.Pxf.A1U(r12, r4)     // Catch:{ all -> 0x0210 }
            if (r4 != 0) goto L_0x01a1
            int r5 = r5 + 1
        L_0x01a1:
            int r7 = r7 + 1
            goto L_0x0189
        L_0x01a4:
            r1.addView((android.view.ViewGroup) r2, (android.view.View) r11, (int) r7)     // Catch:{ all -> 0x0210 }
            int r8 = r8 + 1
            goto L_0x016d
        L_0x01aa:
            java.lang.String r6 = "Trying to add unknown view tag: "
            int r5 = r7.A01     // Catch:{ all -> 0x0210 }
            java.lang.String r4 = "\n detail: "
            java.lang.String r1 = X.W0R.A00(r2, r1, r10, r3, r9)     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = X.002.A05(r5, r6, r4, r1)     // Catch:{ all -> 0x0210 }
            X.QZA r2 = new X.QZA     // Catch:{ all -> 0x0210 }
            r2.<init>(r1)     // Catch:{ all -> 0x0210 }
            goto L_0x020f
        L_0x01be:
            boolean r1 = r12.isEmpty()     // Catch:{ all -> 0x0210 }
            if (r1 == 0) goto L_0x01cc
            java.util.HashMap r1 = r0.A00     // Catch:{ all -> 0x0210 }
            r1.remove(r13)     // Catch:{ all -> 0x0210 }
            goto L_0x01cc
        L_0x01ca:
            if (r5 != 0) goto L_0x01ce
        L_0x01cc:
            monitor-exit(r0)
            return
        L_0x01ce:
            java.lang.String r5 = "Trying to remove a view index above child count "
            java.lang.String r6 = " view tag: "
            java.lang.String r7 = "\n detail: "
            java.lang.String r8 = X.W0R.A00(r2, r1, r10, r3, r9)     // Catch:{ all -> 0x0210 }
            r9 = r4
            r10 = r23
            java.lang.String r1 = X.002.A0x(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0210 }
            X.QZA r2 = new X.QZA     // Catch:{ all -> 0x0210 }
            r2.<init>(r1)     // Catch:{ all -> 0x0210 }
            goto L_0x020f
        L_0x01e5:
            java.lang.String r5 = "Trying to manageChildren view with tag "
            java.lang.String r4 = " which doesn't exist\n detail: "
            java.lang.String r2 = X.W0R.A00(r2, r1, r10, r3, r9)     // Catch:{ all -> 0x0210 }
            r1 = r23
            java.lang.String r1 = X.002.A05(r1, r5, r4, r2)     // Catch:{ all -> 0x0210 }
            X.QZA r2 = new X.QZA     // Catch:{ all -> 0x0210 }
            r2.<init>(r1)     // Catch:{ all -> 0x0210 }
            goto L_0x020f
        L_0x01f9:
            java.lang.String r5 = "Trying to remove an out of order view index:"
            java.lang.String r6 = " view tag: "
            java.lang.String r7 = "\n detail: "
            java.lang.String r8 = X.W0R.A00(r2, r1, r10, r3, r9)     // Catch:{ all -> 0x0210 }
            r9 = r4
            r10 = r23
            java.lang.String r1 = X.002.A0x(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0210 }
            X.QZA r2 = new X.QZA     // Catch:{ all -> 0x0210 }
            r2.<init>(r1)     // Catch:{ all -> 0x0210 }
        L_0x020f:
            throw r2     // Catch:{ all -> 0x0210 }
        L_0x0210:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15150USg.AT8():void");
    }
}
