package X;

/* renamed from: X.LxI  reason: case insensitive filesystem */
public final class C65641LxI implements C66461MSp {
    public final int A00;
    public final Object A01;

    public C65641LxI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        X.LRS.A01(r2, r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r2 = r0.requireContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r5 != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        r1 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        r2 = r0.requireContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r5 != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        r1 = X.AnonymousClass05K.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        r1 = X.AnonymousClass05K.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterSelection(boolean r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0057;
                case 2: goto L_0x0048;
                case 3: goto L_0x0080;
                case 4: goto L_0x003f;
                case 5: goto L_0x0078;
                case 6: goto L_0x0033;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r4.A01
            X.M1D r2 = (X.M1D) r2
            if (r5 == 0) goto L_0x0015
            java.lang.Object r0 = r2.A01
            X.LlP r0 = (X.C64986LlP) r0
            X.8it r1 = r0.A03
            r0 = 1
            r1.A04(r0)
        L_0x0015:
            java.lang.Object r0 = r2.A01
            X.LlP r0 = (X.C64986LlP) r0
            X.E6c r1 = r0.A0E
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x002f
            android.content.Context r2 = r1.requireContext()
            if (r5 == 0) goto L_0x0030
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
        L_0x0029:
            com.facebook.common.callercontext.CallerContext r0 = X.C62052KYa.A02
        L_0x002b:
            r0 = 0
            X.LRS.A01(r2, r1, r0)
        L_0x002f:
            return
        L_0x0030:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0029
        L_0x0033:
            if (r5 == 0) goto L_0x002f
            java.lang.Object r0 = r4.A01
            X.8it r0 = (X.C363008it) r0
            if (r0 == 0) goto L_0x002f
            r0.A02()
            return
        L_0x003f:
            com.facebook.common.callercontext.CallerContext r0 = X.C62052KYa.A02
            java.lang.Object r0 = r4.A01
            X.LpY r0 = (X.C65228LpY) r0
            X.4DH r0 = r0.A04
            goto L_0x005d
        L_0x0048:
            java.lang.Object r0 = r4.A01
            X.Loa r0 = (X.C65171Loa) r0
            X.4DH r0 = r0.A06
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x002f
            com.facebook.common.callercontext.CallerContext r1 = X.C62052KYa.A02
            goto L_0x006c
        L_0x0057:
            com.facebook.common.callercontext.CallerContext r0 = X.C62052KYa.A02
            java.lang.Object r0 = r4.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
        L_0x005d:
            android.content.Context r2 = r0.requireContext()
            if (r5 != 0) goto L_0x0075
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x002b
        L_0x0066:
            com.facebook.common.callercontext.CallerContext r0 = X.C62052KYa.A02
            java.lang.Object r0 = r4.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
        L_0x006c:
            android.content.Context r2 = r0.requireContext()
            if (r5 != 0) goto L_0x0075
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            goto L_0x002b
        L_0x0075:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x002b
        L_0x0078:
            java.lang.Object r0 = r4.A01
            X.Lqv r0 = (X.C65302Lqv) r0
            X.C65302Lqv.A00(r0)
            return
        L_0x0080:
            if (r5 == 0) goto L_0x0099
            X.5w9 r0 = X.AnonymousClass5w8.A05
            java.lang.Object r0 = r4.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            boolean r3 = X.JTU.A1X(r0)
            X.EZv r2 = X.C48153EZv.A05
            X.3Q2 r1 = X.LRK.A00(r0)
            r0 = 1
            if (r3 == 0) goto L_0x0096
            r0 = 0
        L_0x0096:
            r2.A06(r1, r0)
        L_0x0099:
            java.lang.Object r0 = r4.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65641LxI.afterSelection(boolean):void");
    }
}
