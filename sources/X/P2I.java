package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public final class P2I implements C74392Pu8 {
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0111, code lost:
        if (r5 != 3) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011f, code lost:
        if (r4 != 2) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AWj(X.OU2 r39) {
        /*
            r38 = this;
            r3 = 0
            r1 = r39
            X.0qQ.A0B(r1, r3)
            X.0eM r0 = r1.A0M
            boolean r2 = X.AnonymousClass7TF.A1Z(r0)
            r0 = 0
            if (r2 != 0) goto L_0x0108
            X.0eM r2 = r1.A04
            java.lang.Number r8 = X.C66580MXl.A0r(r2)
            X.0eM r2 = r1.A0C
            java.lang.Number r7 = X.C66580MXl.A0r(r2)
            X.0eM r2 = r1.A0B
            java.lang.Number r6 = X.C66580MXl.A0r(r2)
            X.0eM r2 = r1.A0A
            java.lang.String r2 = X.DbS.A0t(r2)
            if (r8 == 0) goto L_0x0128
            if (r7 == 0) goto L_0x0128
            if (r6 == 0) goto L_0x0128
            long r4 = r8.longValue()
            android.net.Uri r2 = X.OXF.A00(r2, r0, r4)
            java.lang.String r5 = X.DbT.A10(r2)
            int r4 = r7.intValue()
            int r2 = r6.intValue()
            com.instagram.model.mediasize.ExtendedImageUrl r9 = new com.instagram.model.mediasize.ExtendedImageUrl
            r9.<init>(r5, r4, r2)
        L_0x0046:
            long r4 = r8.longValue()
            X.0eM r2 = r1.A06
            java.lang.String r2 = X.DbS.A0t(r2)
            android.net.Uri r2 = X.OXF.A00(r2, r0, r4)
            java.lang.String r2 = X.DbT.A10(r2)
            com.instagram.model.mediasize.ExtendedImageUrl r8 = new com.instagram.model.mediasize.ExtendedImageUrl
            r8.<init>(r2, r3, r3)
        L_0x005d:
            X.0eM r5 = r1.A0G
            java.lang.String r4 = X.DbS.A0t(r5)
            if (r4 == 0) goto L_0x0125
            X.9JN r2 = new X.9JN
            r2.<init>(r4)
            java.lang.String r4 = X.DbS.A0t(r5)
            r2.A02 = r4
        L_0x0070:
            X.0eM r4 = r1.A0N
            java.lang.Number r4 = X.C66580MXl.A0r(r4)
            r5 = 4
            r7 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0121
            int r4 = r4.intValue()
            if (r4 != r5) goto L_0x0117
            r34 = 4
        L_0x0083:
            X.0eM r4 = r1.A0E
            java.lang.Number r4 = X.C66580MXl.A0r(r4)
            if (r4 == 0) goto L_0x0113
            int r5 = r4.intValue()
            if (r5 != r6) goto L_0x0109
            r35 = 1
        L_0x0093:
            r10 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            X.0eM r4 = r1.A0L
            java.lang.String r23 = X.DbS.A0t(r4)
            X.0eM r5 = r1.A0Q
            java.lang.String r24 = X.DbS.A0t(r5)
            X.0eM r4 = r1.A0R
            java.lang.String r25 = X.DbS.A0t(r4)
            X.0eM r4 = r1.A0P
            java.lang.Object r15 = r4.getValue()
            java.lang.Integer r15 = (java.lang.Integer) r15
            java.lang.String r26 = X.DbS.A0t(r5)
            X.0eM r4 = r1.A0O
            java.lang.Object r4 = r4.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            X.0eM r5 = r1.A0H
            java.lang.String r29 = X.DbS.A0t(r5)
            X.3tD r7 = X.C254883tD.SINGLE
            if (r2 == 0) goto L_0x00cc
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
        L_0x00cc:
            X.0eM r2 = r1.A0J
            java.lang.String r30 = X.DbS.A0t(r2)
            X.0eM r2 = r1.A0K
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.0eM r1 = r1.A0I
            java.lang.String r31 = X.DbS.A0t(r1)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r12 = r11
            r13 = r10
            r17 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r27 = r10
            r28 = r10
            r32 = r10
            r33 = r0
            r36 = r3
            r37 = r3
            r16 = r4
            r18 = r2
            X.3tC r0 = X.C71152OeO.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
        L_0x0108:
            return r0
        L_0x0109:
            if (r5 != r7) goto L_0x010e
            r35 = 8
            goto L_0x0093
        L_0x010e:
            r4 = 3
            r35 = 2
            if (r5 == r4) goto L_0x0093
        L_0x0113:
            r35 = 0
            goto L_0x0093
        L_0x0117:
            if (r4 != r6) goto L_0x011d
            r34 = 2
            goto L_0x0083
        L_0x011d:
            r34 = 1
            if (r4 == r7) goto L_0x0083
        L_0x0121:
            r34 = 0
            goto L_0x0083
        L_0x0125:
            r2 = r0
            goto L_0x0070
        L_0x0128:
            r9 = r0
            if (r8 != 0) goto L_0x0046
            r8 = r0
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P2I.AWj(X.OU2):java.lang.Object");
    }

    public final 2FW BZu(OU2 ou2) {
        0qQ.A0B(ou2, 0);
        Map map = O4J.A00;
        2FW r0 = (2FW) O4J.A00.get(ou2.A0F.getValue());
        if (r0 == null) {
            return 2FW.A0y;
        }
        return r0;
    }

    public P2I(UserSession userSession) {
        this.A00 = userSession;
    }
}
