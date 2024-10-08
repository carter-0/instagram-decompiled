package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Ixp  reason: case insensitive filesystem */
public final class C58804Ixp extends 0Yg implements 0sP {
    public final /* synthetic */ C270284gU A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0sL A05;
    public final /* synthetic */ 0sJ A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58804Ixp(C270284gU r2, 1Xj r3, Reel reel, String str, C62320sa r6, 0sL r7, 0sJ r8, boolean z) {
        super(1);
        this.A01 = r3;
        this.A07 = z;
        this.A02 = reel;
        this.A00 = r2;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = str;
        this.A06 = r8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.1Xj r3 = r9.A01
            java.lang.String r6 = X.C51971G9r.A0s(r3)
            boolean r8 = r9.A07
            if (r8 != 0) goto L_0x0091
            com.instagram.model.reels.Reel r1 = r9.A02
            if (r6 == 0) goto L_0x0091
            X.4gU r0 = r9.A00
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.util.List r0 = r1.A0O(r0)
            X.0qQ.A07(r0)
            java.util.Iterator r5 = r0.iterator()
            r7 = 0
            r4 = 0
        L_0x0027:
            boolean r0 = r5.hasNext()
            r2 = -1
            r1 = 1
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r5.next()
            X.3uh r0 = (X.C255773uh) r0
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.startsWith(r6)
            if (r0 != r1) goto L_0x008c
        L_0x0045:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x0050
            r7 = r0
        L_0x0050:
            X.4gU r0 = r9.A00
            java.lang.Object r6 = r0.getValue()
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            X.0sL r2 = r9.A05
            java.lang.String r1 = r9.A03
            r0 = 13
            X.IwS r5 = new X.IwS
            r5.<init>(r3, r2, r1, r0)
            X.0sa r4 = r9.A04
            X.0sJ r2 = r9.A06
            com.instagram.model.reels.Reel r1 = r9.A02
            r0 = 16
            X.JGL r3 = new X.JGL
            r3.<init>((int) r7, (int) r0, (java.lang.Object) r1, (java.lang.Object) r2)
            if (r8 == 0) goto L_0x007b
            r5.invoke()
            r4.invoke()
        L_0x0078:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x007b:
            X.WT0 r2 = X.WT0.A00(r6)
            X.0qQ.A07(r2)
            r1 = 1
            X.Upl r0 = new X.Upl
            r0.<init>(r2, r1)
            r3.invoke(r10, r0)
            goto L_0x0078
        L_0x008c:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x008f:
            r4 = -1
            goto L_0x0045
        L_0x0091:
            r7 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58804Ixp.invoke(java.lang.Object):java.lang.Object");
    }
}
