package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.77L  reason: invalid class name */
public final class AnonymousClass77L {
    public final UserSession A00;
    public final AnonymousClass7X1 A01;
    public final AnonymousClass7YA A02;
    public final C332927Wz A03;
    public final C332917Wy A04;
    public final AnonymousClass7YB A05;
    public final AnonymousClass9HC A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r2.startsWith("content://com.instagram.android.tam-attachment") != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(com.instagram.common.typedurl.ImageUrl r5, X.AnonymousClass77B r6, X.AnonymousClass77L r7, X.C66775McL r8, boolean r9) {
        /*
            boolean r3 = r6.A0d
            if (r5 == 0) goto L_0x0018
            java.lang.String r2 = r5.getUrl()
            X.0qQ.A07(r2)
            java.lang.String r1 = "content://com.instagram.android.tam-attachment"
            r0 = 1
            X.0qQ.A0B(r1, r0)
            boolean r1 = r2.startsWith(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r3 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001f
            r0 = 0
            return r0
        L_0x001f:
            X.9HC r0 = r7.A06
            X.0eM r0 = r0.A0o
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x003a
            X.7YB r1 = r7.A05
            if (r1 == 0) goto L_0x0038
            com.instagram.feed.widget.IgProgressImageView r0 = r8.A09
            r1.Cpw(r0, r6)
        L_0x0038:
            r0 = 1
            return r0
        L_0x003a:
            X.7Wy r2 = r7.A04
            if (r2 == 0) goto L_0x0038
            java.util.List r6 = java.util.Collections.singletonList(r6)
            X.0qQ.A07(r6)
            com.instagram.feed.widget.IgProgressImageView r3 = r8.A09
            android.graphics.RectF r1 = X.0nA.A0F(r3)
            r0 = 0
            X.N3i r4 = new X.N3i
            r4.<init>(r1, r0)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r7 = 0
            r8 = r9
            r9 = r7
            r2.Cpz(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77L.A00(com.instagram.common.typedurl.ImageUrl, X.77B, X.77L, X.McL, boolean):boolean");
    }

    public AnonymousClass77L(UserSession userSession, AnonymousClass7X1 r2, AnonymousClass7YA r3, C332917Wy r4, AnonymousClass7YB r5, C332927Wz r6, AnonymousClass9HC r7) {
        this.A03 = r6;
        this.A01 = r2;
        this.A05 = r5;
        this.A02 = r3;
        this.A04 = r4;
        this.A00 = userSession;
        this.A06 = r7;
    }
}
