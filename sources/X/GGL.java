package X;

import com.instagram.common.session.UserSession;

public final class GGL extends C247303g7 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C52193GIk A02;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1.BXF() == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r1.BHr() == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (r3 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        if (r3 != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r32 == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x013c, code lost:
        if (r3 != null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0149, code lost:
        if (r3 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C59511JMj A05(X.C267324bN r29, X.C52058GDe r30, int r31, boolean r32, boolean r33) {
        /*
            r28 = this;
            r5 = 1
            r10 = r29
            X.1Xj r1 = r10.A02
            r2 = r28
            com.instagram.common.session.UserSession r0 = r2.A01
            r14 = 4
            X.IoB r13 = new X.IoB
            r11 = r30
            r15 = r10
            r16 = r2
            r17 = r11
            r18 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            r19 = 0
            boolean r1 = r10.CcK()
            if (r1 == 0) goto L_0x0157
            boolean r1 = r10.CcK()
            if (r1 == 0) goto L_0x0029
            r9 = 1
            if (r32 != 0) goto L_0x002a
        L_0x0029:
            r9 = 0
        L_0x002a:
            boolean r1 = r10.CcK()
            r8 = 0
            if (r1 == 0) goto L_0x0044
            X.1Xj r1 = r10.A02
            if (r1 == 0) goto L_0x0044
            X.1Xy r1 = r1.A0C
            com.instagram.api.schemas.AppstoreMetadataDict r1 = r1.AcH()
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = r1.BXF()
            r7 = 1
            if (r1 != 0) goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            boolean r1 = r10.CcK()
            if (r1 == 0) goto L_0x0060
            if (r7 != 0) goto L_0x0060
            X.1Xj r1 = r10.A02
            if (r1 == 0) goto L_0x0060
            X.1Xy r1 = r1.A0C
            com.instagram.api.schemas.AppstoreMetadataDict r1 = r1.AcH()
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = r1.BHr()
            r3 = 1
            if (r1 != 0) goto L_0x0061
        L_0x0060:
            r3 = 0
        L_0x0061:
            X.1Xj r1 = r10.A02
            boolean r1 = X.GEJ.A01(r0, r1)
            if (r1 == 0) goto L_0x006e
            if (r7 != 0) goto L_0x006e
            r2 = 1
            if (r3 == 0) goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            boolean r1 = X.GEJ.A00(r10, r0)
            if (r1 == 0) goto L_0x007a
            if (r7 != 0) goto L_0x007a
            r1 = 1
            if (r3 == 0) goto L_0x007b
        L_0x007a:
            r1 = 0
        L_0x007b:
            r6 = 2
            boolean[] r4 = new boolean[r6]
            r4[r19] = r9
            if (r7 != 0) goto L_0x0088
            if (r3 != 0) goto L_0x0088
            if (r2 != 0) goto L_0x0088
            if (r1 == 0) goto L_0x0089
        L_0x0088:
            r8 = 1
        L_0x0089:
            r4[r5] = r8
            r3 = 0
            r2 = 0
        L_0x008d:
            boolean r1 = r4[r3]
            if (r1 == 0) goto L_0x0093
            int r2 = r2 + 1
        L_0x0093:
            int r3 = r3 + 1
            if (r3 < r6) goto L_0x008d
            int r13 = r2 + -1
        L_0x0099:
            if (r13 < r5) goto L_0x0154
            X.1Xj r3 = r10.A02
            if (r3 == 0) goto L_0x0150
            java.lang.String r2 = r3.A2n()
            if (r2 == 0) goto L_0x0150
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r2)
            if (r1 == 0) goto L_0x0150
            long r20 = r1.longValue()
        L_0x00b1:
            r22 = 0
            if (r3 == 0) goto L_0x0147
            X.1Xy r1 = r3.A0C
            X.DUF r1 = r1.Anr()
            if (r1 == 0) goto L_0x0147
            java.lang.String r2 = r1.getAttributionAppId()
            if (r2 == 0) goto L_0x0147
            r1 = 10
            java.lang.Long r17 = X.00y.A0n(r1, r2)
        L_0x00c9:
            com.instagram.user.model.User r1 = r3.A2A(r0)
            if (r1 == 0) goto L_0x014d
            java.lang.String r2 = r1.getId()
            r1 = 10
            java.lang.Long r18 = X.00y.A0n(r1, r2)
        L_0x00d9:
            X.GJB r16 = X.C52086GEg.A00(r10)
            X.GEh r8 = new X.GEh
            r15 = r8
            r15.<init>(r16, r17, r18, r19, r20)
            X.1Xj r3 = r10.A02
            if (r3 == 0) goto L_0x0144
            java.lang.String r2 = r3.A2n()
            if (r2 == 0) goto L_0x0144
            r1 = 10
            java.lang.Long r1 = X.00y.A0n(r1, r2)
            if (r1 == 0) goto L_0x0144
            long r26 = r1.longValue()
        L_0x00f9:
            r23 = 0
            if (r3 == 0) goto L_0x013c
            X.1Xy r1 = r3.A0C
            X.DUF r1 = r1.Anr()
            if (r1 == 0) goto L_0x013c
            java.lang.String r2 = r1.getAttributionAppId()
            if (r2 == 0) goto L_0x013c
            r1 = 10
            java.lang.Long r22 = X.00y.A0n(r1, r2)
        L_0x0111:
            com.instagram.user.model.User r0 = r3.A2A(r0)
            if (r0 == 0) goto L_0x013f
            java.lang.String r1 = r0.getId()
            r0 = 10
            java.lang.Long r23 = X.00y.A0n(r0, r1)
        L_0x0121:
            X.1Xy r0 = r3.A0C
            java.lang.String r24 = r0.getLoggingInfoToken()
        L_0x0127:
            X.GEi r9 = new X.GEi
            r21 = r9
            r25 = r14
            r21.<init>(r22, r23, r24, r25, r26)
            X.GLQ r7 = new X.GLQ
            r12 = r31
            r14 = r33
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
        L_0x0139:
            X.JMj r7 = (X.C59511JMj) r7
            return r7
        L_0x013c:
            if (r3 == 0) goto L_0x013f
            goto L_0x0111
        L_0x013f:
            if (r3 != 0) goto L_0x0121
            r24 = r23
            goto L_0x0127
        L_0x0144:
            r26 = 0
            goto L_0x00f9
        L_0x0147:
            r17 = r22
            if (r3 == 0) goto L_0x014d
            goto L_0x00c9
        L_0x014d:
            r18 = r22
            goto L_0x00d9
        L_0x0150:
            r20 = 0
            goto L_0x00b1
        L_0x0154:
            X.GKF r7 = X.GKF.A00
            goto L_0x0139
        L_0x0157:
            java.lang.Object r2 = r13.invoke()
            java.util.List r2 = (java.util.List) r2
            int r1 = r2.size()
            if (r1 <= r5) goto L_0x018d
            int r1 = r2.size()
            java.util.List r1 = r2.subList(r5, r1)
        L_0x016b:
            r6 = 0
            java.util.Iterator r4 = r1.iterator()
        L_0x0170:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0190
            java.lang.Object r3 = r4.next()
            X.GJ2 r2 = X.GJ2.CONTENT_APPRECIATION
            if (r3 == r2) goto L_0x018a
            X.GJ2 r2 = X.GJ2.SEE_MORE_PROMPTS
            if (r3 == r2) goto L_0x018a
            X.GJ2 r2 = X.GJ2.CREATOR_PICK
            if (r3 == r2) goto L_0x018a
            X.GJ2 r2 = X.GJ2.STICKER_RESULT
            if (r3 != r2) goto L_0x0170
        L_0x018a:
            int r6 = r6 + 1
            goto L_0x0170
        L_0x018d:
            X.0sn r1 = X.0sn.A00
            goto L_0x016b
        L_0x0190:
            int r13 = r1.size()
            int r13 = r13 - r6
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGL.A05(X.4bN, X.GDe, int, boolean, boolean):X.JMj");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.GIk] */
    public /* synthetic */ GGL(AnonymousClass0iw r2, UserSession userSession) {
        ? obj = new Object();
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = obj;
    }
}
