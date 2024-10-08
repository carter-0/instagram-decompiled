package X;

/* renamed from: X.4XG  reason: invalid class name */
public final class AnonymousClass4XG extends C265294Th {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final C264484Qb A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0145, code lost:
        if ((r18 & r12) == 0) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0171, code lost:
        if (r0 == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r19 & r12) == 0) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d3, code lost:
        if ((r1 & 1) != 0) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x00a6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x00f0 A[EDGE_INSN: B:130:0x00f0->B:80:0x00f0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4XG(X.C264854Ro r14, X.C264484Qb r15, int r16, int r17, int r18, int r19, boolean r20) {
        /*
            r13 = this;
            r0 = r17
            r2 = r18
            r1 = r16
            r13.<init>(r14, r1, r0)
            r13.A08 = r15
            boolean r0 = r15.A09
            r12 = 16
            if (r0 == 0) goto L_0x0013
            r12 = 24
        L_0x0013:
            boolean r0 = r15.A08
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L_0x001e
            r19 = r19 & r12
            r0 = 1
            if (r19 != 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r13.A09 = r0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = -1
            if (r20 == 0) goto L_0x00a4
            X.3wB r4 = r13.A02
            int r1 = r4.A0L
            if (r1 == r3) goto L_0x0030
            int r0 = r15.A06
            if (r1 > r0) goto L_0x00a4
        L_0x0030:
            int r1 = r4.A0A
            if (r1 == r3) goto L_0x0038
            int r0 = r15.A05
            if (r1 > r0) goto L_0x00a4
        L_0x0038:
            float r1 = r4.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0045
            int r0 = r15.A04
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00a4
        L_0x0045:
            int r1 = r4.A05
            if (r1 == r3) goto L_0x004d
            int r0 = r15.A03
            if (r1 > r0) goto L_0x00a4
        L_0x004d:
            r0 = 1
        L_0x004e:
            r13.A0B = r0
            if (r20 == 0) goto L_0x00a2
            X.3wB r4 = r13.A02
            int r1 = r4.A0L
            if (r1 == r3) goto L_0x005c
            int r0 = r15.A0A
            if (r1 < r0) goto L_0x00a2
        L_0x005c:
            int r1 = r4.A0A
            if (r1 == r3) goto L_0x0064
            int r0 = r15.A09
            if (r1 < r0) goto L_0x00a2
        L_0x0064:
            float r1 = r4.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            int r0 = r15.A08
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00a2
        L_0x0071:
            int r1 = r4.A05
            if (r1 == r3) goto L_0x0079
            int r0 = r15.A07
            if (r1 < r0) goto L_0x00a2
        L_0x0079:
            r0 = 1
        L_0x007a:
            r13.A0C = r0
            r5 = r18 & 7
            r4 = 4
            r0 = 1
            if (r5 == r4) goto L_0x0083
            r0 = 0
        L_0x0083:
            r13.A0D = r0
            r6 = 0
        L_0x0086:
            java.util.List r3 = r15.A0L
            int r0 = r3.size()
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r6 >= r0) goto L_0x00a6
            X.3wB r1 = r13.A02
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = X.C264614Qo.A00(r1, r0, r7)
            if (r0 > 0) goto L_0x00aa
            int r6 = r6 + 1
            goto L_0x0086
        L_0x00a2:
            r0 = 0
            goto L_0x007a
        L_0x00a4:
            r0 = 0
            goto L_0x004e
        L_0x00a6:
            r6 = 2147483647(0x7fffffff, float:NaN)
            r0 = 0
        L_0x00aa:
            r13.A03 = r6
            r13.A04 = r0
            X.3wB r9 = r13.A02
            int r3 = r9.A05
            r13.A00 = r3
            int r6 = r9.A0L
            r1 = -1
            if (r6 == r1) goto L_0x00bf
            int r0 = r9.A0A
            if (r0 == r1) goto L_0x00bf
            int r1 = r6 * r0
        L_0x00bf:
            r13.A02 = r1
            int r1 = r9.A0E
            int r0 = r15.A0D
            if (r1 == 0) goto L_0x0178
            if (r1 != r0) goto L_0x0178
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x00cc:
            r13.A06 = r0
            if (r1 == 0) goto L_0x00d5
            r6 = r1 & 1
            r0 = 0
            if (r6 == 0) goto L_0x00d6
        L_0x00d5:
            r0 = 1
        L_0x00d6:
            r13.A0A = r0
            r11 = 0
        L_0x00d9:
            java.util.List r7 = r15.A0M
            int r0 = r7.size()
            if (r11 >= r0) goto L_0x00f0
            java.lang.String r6 = r9.A0W
            if (r6 == 0) goto L_0x0174
            java.lang.Object r0 = r7.get(r11)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0174
            r10 = r11
        L_0x00f0:
            r13.A05 = r10
            r7 = r2 & 384(0x180, float:5.38E-43)
            r6 = 128(0x80, float:1.794E-43)
            r0 = 0
            if (r7 != r6) goto L_0x00fa
            r0 = 1
        L_0x00fa:
            r13.A0F = r0
            r6 = r18 & 64
            r0 = 64
            if (r6 == r0) goto L_0x0103
            r8 = 0
        L_0x0103:
            r13.A0E = r8
            java.lang.String r7 = r9.A0W
            if (r7 == 0) goto L_0x0111
            int r0 = r7.hashCode()
            r6 = 2
            switch(r0) {
                case -1851077871: goto L_0x0149;
                case -1662735862: goto L_0x0153;
                case -1662541442: goto L_0x015b;
                case 1331836730: goto L_0x0163;
                case 1599127257: goto L_0x016b;
                default: goto L_0x0111;
            }
        L_0x0111:
            r6 = 0
        L_0x0112:
            r13.A01 = r6
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            r7 = 0
            if (r0 != 0) goto L_0x012c
            X.4Qb r6 = r13.A08
            boolean r0 = r6.A0D
            if (r5 == r4) goto L_0x0124
            if (r0 == 0) goto L_0x012c
            r0 = 3
            if (r5 != r0) goto L_0x012c
        L_0x0124:
            boolean r1 = r13.A0B
            if (r1 != 0) goto L_0x012f
            boolean r0 = r6.A0E
            if (r0 != 0) goto L_0x012f
        L_0x012c:
            r13.A07 = r7
            return
        L_0x012f:
            if (r5 != r4) goto L_0x0147
            boolean r0 = r13.A0C
            if (r0 == 0) goto L_0x0147
            if (r1 == 0) goto L_0x0147
            r0 = -1
            if (r3 == r0) goto L_0x0147
            boolean r0 = r6.A0N
            if (r0 != 0) goto L_0x0147
            boolean r0 = r6.A0O
            if (r0 != 0) goto L_0x0147
            r2 = r18 & r12
            r7 = 2
            if (r2 != 0) goto L_0x012c
        L_0x0147:
            r7 = 1
            goto L_0x012c
        L_0x0149:
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0111
            r6 = 5
            goto L_0x0112
        L_0x0153:
            java.lang.String r0 = "video/av01"
            boolean r0 = r7.equals(r0)
            r6 = 4
            goto L_0x0171
        L_0x015b:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r7.equals(r0)
            r6 = 3
            goto L_0x0171
        L_0x0163:
            java.lang.String r0 = "video/avc"
            boolean r0 = r7.equals(r0)
            r6 = 1
            goto L_0x0171
        L_0x016b:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r7.equals(r0)
        L_0x0171:
            if (r0 != 0) goto L_0x0112
            goto L_0x0111
        L_0x0174:
            int r11 = r11 + 1
            goto L_0x00d9
        L_0x0178:
            r0 = r0 & r1
            int r0 = java.lang.Integer.bitCount(r0)
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XG.<init>(X.4Ro, X.4Qb, int, int, int, int, boolean):void");
    }
}
