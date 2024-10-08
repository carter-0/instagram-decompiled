package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.USh  reason: case insensitive filesystem */
public final class C15151USh extends C19062WIs {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C245033cB A05;
    public final /* synthetic */ C18592Vuj A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15151USh(C18592Vuj vuj, C245033cB r6, int i, int i2, int i3, int i4, int i5, int i6) {
        super(vuj, i2);
        this.A06 = vuj;
        this.A01 = i;
        this.A03 = i3;
        this.A04 = i4;
        this.A02 = i5;
        this.A00 = i6;
        this.A05 = r6;
        Systrace.A07(33554432, "updateLayout", this.A00);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r3.needsCustomLayoutForChildren() == false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AT8() {
        /*
            r15 = this;
            int r6 = r15.A00
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            java.lang.String r2 = "updateLayout"
            com.facebook.systrace.Systrace.A05(r0, r2, r6)
            X.Vuj r2 = r15.A06
            X.W0R r8 = r2.A0L
            int r4 = r15.A01
            int r11 = r15.A03
            int r12 = r15.A04
            int r13 = r15.A02
            int r14 = r15.A00
            X.3cB r3 = r15.A05
            monitor-enter(r8)
            java.lang.String r5 = "NativeViewHierarchyManager_updateLayout"
            X.0eu r2 = com.facebook.systrace.SystraceMessage.A00     // Catch:{ all -> 0x0129 }
            X.0et r5 = com.facebook.systrace.SystraceMessage.A00(r2, r5, r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = "parentTag"
            r5.A01(r2, r4)     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = "tag"
            r5.A01(r2, r6)     // Catch:{ all -> 0x0129 }
            r5.A02()     // Catch:{ all -> 0x0129 }
            android.view.View r10 = r8.A02(r6)     // Catch:{ all -> 0x0121 }
            X.XyL r2 = X.C18401Vr3.A00     // Catch:{ all -> 0x0121 }
            boolean r2 = r2.setAndroidLayoutDirection()     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x004d
            r2 = 0
            int r5 = X.DbU.A02(r3, r2)     // Catch:{ all -> 0x0121 }
            r3 = 2
            r2 = 1
            if (r5 == r2) goto L_0x0049
            if (r5 != r3) goto L_0x004a
            r3 = 1
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            r10.setLayoutDirection(r3)     // Catch:{ all -> 0x0121 }
        L_0x004d:
            r3 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r3)     // Catch:{ all -> 0x0121 }
            X.C13988Tno.A11(r10, r14, r3, r2)     // Catch:{ all -> 0x0121 }
            android.view.ViewParent r3 = r10.getParent()     // Catch:{ all -> 0x0121 }
            boolean r2 = r3 instanceof X.X61     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x0061
            r3.requestLayout()     // Catch:{ all -> 0x0121 }
        L_0x0061:
            android.util.SparseBooleanArray r2 = r8.A04     // Catch:{ all -> 0x0121 }
            boolean r2 = r2.get(r4)     // Catch:{ all -> 0x0121 }
            if (r2 != 0) goto L_0x007f
            android.util.SparseArray r2 = r8.A02     // Catch:{ all -> 0x0121 }
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x0121 }
            com.facebook.react.uimanager.ViewManager r3 = (com.facebook.react.uimanager.ViewManager) r3     // Catch:{ all -> 0x0121 }
            boolean r2 = r3 instanceof X.X2Y     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x0113
            X.X2Y r3 = (X.X2Y) r3     // Catch:{ all -> 0x0121 }
            if (r3 == 0) goto L_0x010b
            boolean r2 = r3.needsCustomLayoutForChildren()     // Catch:{ all -> 0x0121 }
            if (r2 != 0) goto L_0x010b
        L_0x007f:
            boolean r2 = r8.A09     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x0106
            X.Vv6 r7 = r8.A08     // Catch:{ all -> 0x0121 }
            boolean r2 = r7.A02(r10)     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x0106
            int r4 = r10.getId()     // Catch:{ all -> 0x0121 }
            android.util.SparseArray r2 = r7.A03     // Catch:{ all -> 0x0121 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0121 }
            X.X0k r2 = (X.C20835X0k) r2     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x009f
            X.U3y r2 = (X.U3y) r2     // Catch:{ all -> 0x0121 }
            X.U3y.A00(r2, r11, r12, r13, r14)     // Catch:{ all -> 0x0121 }
            goto L_0x010b
        L_0x009f:
            int r2 = r10.getWidth()     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x00b4
            int r2 = r10.getHeight()     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x00b4
            X.Vvo r9 = r7.A06     // Catch:{ all -> 0x0121 }
        L_0x00ad:
            boolean r2 = r9.A02()     // Catch:{ all -> 0x0121 }
            if (r2 != 0) goto L_0x00b9
            goto L_0x00b7
        L_0x00b4:
            X.Vvo r9 = r7.A04     // Catch:{ all -> 0x0121 }
            goto L_0x00ad
        L_0x00b7:
            r6 = 0
            goto L_0x00d0
        L_0x00b9:
            android.view.animation.Animation r6 = r9.A00(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0121 }
            if (r6 == 0) goto L_0x00d0
            int r2 = r9.A01     // Catch:{ all -> 0x0121 }
            long r2 = (long) r2     // Catch:{ all -> 0x0121 }
            r6.setDuration(r2)     // Catch:{ all -> 0x0121 }
            int r2 = r9.A00     // Catch:{ all -> 0x0121 }
            long r2 = (long) r2     // Catch:{ all -> 0x0121 }
            r6.setStartOffset(r2)     // Catch:{ all -> 0x0121 }
            android.view.animation.Interpolator r2 = r9.A02     // Catch:{ all -> 0x0121 }
            r6.setInterpolator(r2)     // Catch:{ all -> 0x0121 }
        L_0x00d0:
            boolean r2 = r6 instanceof X.C20835X0k     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x00fe
            X.WCU r2 = new X.WCU     // Catch:{ all -> 0x0121 }
            r2.<init>(r7, r4)     // Catch:{ all -> 0x0121 }
            r6.setAnimationListener(r2)     // Catch:{ all -> 0x0121 }
        L_0x00dc:
            long r4 = r6.getDuration()     // Catch:{ all -> 0x0121 }
            long r2 = r7.A00     // Catch:{ all -> 0x0121 }
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00fa
            r7.A00 = r4     // Catch:{ all -> 0x0121 }
            java.lang.Runnable r2 = r7.A01     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x00fa
            android.os.Handler r3 = X.C18773W0w.A00()     // Catch:{ all -> 0x0121 }
            java.lang.Runnable r2 = r7.A01     // Catch:{ all -> 0x0121 }
            r3.removeCallbacks(r2)     // Catch:{ all -> 0x0121 }
            java.lang.Runnable r2 = r7.A01     // Catch:{ all -> 0x0121 }
            r3.postDelayed(r2, r4)     // Catch:{ all -> 0x0121 }
        L_0x00fa:
            r10.startAnimation(r6)     // Catch:{ all -> 0x0121 }
            goto L_0x010b
        L_0x00fe:
            int r13 = r13 + r11
            int r14 = r14 + r12
            r10.layout(r11, r12, r13, r14)     // Catch:{ all -> 0x0121 }
            if (r6 == 0) goto L_0x010b
            goto L_0x00dc
        L_0x0106:
            int r13 = r13 + r11
            int r14 = r14 + r12
            r10.layout(r11, r12, r13, r14)     // Catch:{ all -> 0x0121 }
        L_0x010b:
            r2 = 2090384672(0x7c98bd20, float:6.34452E36)
            X.0fc.A00(r0, r2)     // Catch:{ all -> 0x0129 }
            monitor-exit(r8)
            return
        L_0x0113:
            java.lang.String r3 = "Trying to use view with tag "
            java.lang.String r2 = " as a parent, but its Manager doesn't implement IViewManagerWithChildren"
            java.lang.String r3 = X.002.A0c(r3, r2, r4)     // Catch:{ all -> 0x0121 }
            X.QZA r2 = new X.QZA     // Catch:{ all -> 0x0121 }
            r2.<init>(r3)     // Catch:{ all -> 0x0121 }
            throw r2     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r3 = move-exception
            r2 = 1256869018(0x4aea4c9a, float:7677517.0)
            X.0fc.A00(r0, r2)     // Catch:{ all -> 0x0129 }
            throw r3     // Catch:{ all -> 0x0129 }
        L_0x0129:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15151USh.AT8():void");
    }
}
