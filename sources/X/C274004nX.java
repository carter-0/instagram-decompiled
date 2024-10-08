package X;

import android.content.Context;
import android.view.LayoutInflater;

/* renamed from: X.4nX  reason: invalid class name and case insensitive filesystem */
public final class C274004nX extends C274014nY {
    public final C62320sa A00;
    public final int A01;
    public final LayoutInflater A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C274004nX(Context context, LayoutInflater layoutInflater, C62320sa r4, int i, boolean z, boolean z2) {
        super(context, layoutInflater, z2, z);
        0qQ.A0B(layoutInflater, 1);
        0qQ.A0B(r4, 6);
        this.A02 = layoutInflater;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = i;
        this.A00 = r4;
    }

    public final LayoutInflater cloneInContext(Context context) {
        0qQ.A0B(context, 0);
        LayoutInflater cloneInContext = this.A02.cloneInContext(context);
        0qQ.A07(cloneInContext);
        boolean z = this.A04;
        boolean z2 = this.A03;
        return new C274004nX(context, cloneInContext, this.A00, this.A01, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r0 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        if (r0 == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View inflate(int r23, android.view.ViewGroup r24, boolean r25) {
        /*
            r22 = this;
            r13 = r22
            r12 = r23
            android.content.Context r0 = r13.getContext()     // Catch:{ all -> 0x0011 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x0011 }
            java.lang.String r2 = r0.getResourceEntryName(r12)     // Catch:{ all -> 0x0011 }
            goto L_0x0013
        L_0x0011:
            java.lang.String r2 = "unknown"
        L_0x0013:
            r10 = 0
            X.0sa r0 = r13.A00     // Catch:{ all -> 0x0020 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x0020 }
            X.0lg r0 = (X.0lg) r0     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0020
            X.02m r10 = X.02m.A0p     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r19 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r19)
            if (r0 == 0) goto L_0x0036
            java.lang.String r1 = "LayoutInflation["
            r0 = 93
            java.lang.String r1 = X.002.A0S(r1, r2, r0)
            r0 = -1733266361(0xffffffff98b07447, float:-4.5612344E-24)
            X.0fS.A01(r1, r0)
        L_0x0036:
            r14 = r24
            r11 = r25
            if (r10 == 0) goto L_0x0105
            X.2SQ r0 = X.2SP.A00     // Catch:{ all -> 0x0116 }
            int r1 = r13.A01     // Catch:{ all -> 0x0116 }
            X.2SP r0 = X.2SP.A01     // Catch:{ all -> 0x0116 }
            int r0 = r0.A05(r1)     // Catch:{ all -> 0x0116 }
            if (r0 != 0) goto L_0x0105
            r9 = 2
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0116 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0116 }
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}     // Catch:{ all -> 0x0116 }
            int r8 = java.util.Arrays.hashCode(r0)     // Catch:{ all -> 0x0116 }
            r7 = 684470379(0x28cc306b, float:2.2669548E-14)
            r10.markerStart(r7, r8)     // Catch:{ all -> 0x0116 }
            com.facebook.quicklog.MarkerEditor r6 = r10.withMarker(r7, r8)     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "layout_name"
            r6.annotate(r0, r2)     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = "is_scrolling"
            java.lang.String r1 = X.AnonymousClass3GZ.A00     // Catch:{ all -> 0x0116 }
            r0 = 0
            if (r1 == 0) goto L_0x0070
            r0 = 1
        L_0x0070:
            r6.annotate(r2, r0)     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = "container_module"
            X.0sa r0 = r13.A00     // Catch:{ all -> 0x0116 }
            r21 = r0
            java.lang.Object r0 = r21.invoke()     // Catch:{ all -> 0x0116 }
            X.0lg r0 = (X.0lg) r0     // Catch:{ all -> 0x0116 }
            java.lang.String r4 = "unknown"
            r15 = r4
            if (r0 == 0) goto L_0x009c
            X.2cc r3 = X.C71342cb.A00(r0)     // Catch:{ all -> 0x0116 }
            r17 = 0
            X.60i r2 = r3.A01     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x00c7
            long r0 = r2.A01     // Catch:{ all -> 0x0116 }
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 < 0) goto L_0x00c7
        L_0x0094:
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x0116 }
            if (r0 != 0) goto L_0x00c5
        L_0x0098:
            java.lang.String r0 = r3.A0D     // Catch:{ all -> 0x0116 }
            if (r0 != 0) goto L_0x00c5
        L_0x009c:
            r6.annotate(r5, r4)     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = "is_main_thread"
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0116 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0116 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x0116 }
            r6.annotate(r2, r0)     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = "navigation_path"
            java.lang.Object r0 = r21.invoke()     // Catch:{ all -> 0x0116 }
            X.0lg r0 = (X.0lg) r0     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x00db
            X.2cc r0 = X.C71342cb.A00(r0)     // Catch:{ all -> 0x0116 }
            X.60i r0 = r0.A01     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x00db
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x0116 }
            goto L_0x00d2
        L_0x00c5:
            r4 = r0
            goto L_0x009c
        L_0x00c7:
            X.60i r2 = r3.A02     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x0098
            long r0 = r2.A01     // Catch:{ all -> 0x0116 }
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 < 0) goto L_0x0098
            goto L_0x0094
        L_0x00d2:
            if (r1 != 0) goto L_0x00d5
            r1 = r15
        L_0x00d5:
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x00dd
            r15 = r0
            goto L_0x00dd
        L_0x00db:
            r0 = 0
            goto L_0x00e3
        L_0x00dd:
            java.lang.String r0 = " -> "
            java.lang.String r0 = X.002.A0g(r1, r0, r15)     // Catch:{ all -> 0x0116 }
        L_0x00e3:
            r6.annotate(r2, r0)     // Catch:{ all -> 0x0116 }
            java.lang.String r1 = "ongoing_startup_type"
            X.0wX r0 = X.C61170le.A00     // Catch:{ all -> 0x0116 }
            X.18g r0 = X.C638918c.A01(r0)     // Catch:{ all -> 0x0116 }
            X.1Jv r0 = r0.A05     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x0103
            X.1CS r0 = r0.A0O     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x0116 }
        L_0x00f8:
            r6.annotate(r1, r0)     // Catch:{ all -> 0x0116 }
            android.view.View r1 = super.inflate((int) r12, (android.view.ViewGroup) r14, (boolean) r11)     // Catch:{ all -> 0x0116 }
            r10.markerEnd(r7, r8, r9)     // Catch:{ all -> 0x0116 }
            goto L_0x0109
        L_0x0103:
            r0 = 0
            goto L_0x00f8
        L_0x0105:
            android.view.View r1 = super.inflate((int) r12, (android.view.ViewGroup) r14, (boolean) r11)     // Catch:{ all -> 0x0116 }
        L_0x0109:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r19)
            if (r0 == 0) goto L_0x0115
            r0 = 1220926653(0x48c5dcbd, float:405221.9)
            X.0fS.A00(r0)
        L_0x0115:
            return r1
        L_0x0116:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r19)
            if (r0 == 0) goto L_0x0123
            r0 = 1505220148(0x59b7d634, float:6.4681799E15)
            X.0fS.A00(r0)
        L_0x0123:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C274004nX.inflate(int, android.view.ViewGroup, boolean):android.view.View");
    }
}
