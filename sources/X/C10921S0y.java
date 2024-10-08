package X;

/* renamed from: X.S0y  reason: case insensitive filesystem */
public final class C10921S0y {
    public final int A00;
    public final C10517RtW A01;

    public C10921S0y(C10517RtW rtW, int i) {
        this.A01 = rtW;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x04cf, code lost:
        r2 = X.S81.A00(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x04d3, code lost:
        switch(r37) {
            case -1662735862: goto L_0x04f5;
            case -1662541442: goto L_0x04e9;
            case 1331836730: goto L_0x04dd;
            default: goto L_0x04d6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x04dc, code lost:
        throw X.AnonymousClass7TF.A0W("Unsupported video format: ", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x04e4, code lost:
        if (r13.equals("video/avc") == false) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x04e6, code lost:
        r10 = "avc1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x04f0, code lost:
        if (r13.equals("video/hevc") == false) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x04f2, code lost:
        r10 = "hvc1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x04fc, code lost:
        if (r13.equals("video/av01") == false) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x04fe, code lost:
        r10 = "av01";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0500, code lost:
        r6 = java.nio.ByteBuffer.allocate(r2.limit() + 200);
        r6.putInt(0);
        r6.putShort(0);
        r6.putShort(1);
        r6.putShort(0);
        r6.putShort(0);
        r6.putInt(0);
        r6.putInt(0);
        r6.putInt(0);
        r1 = r9.A0N;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0526, code lost:
        if (r1 == -1) goto L_0x0529;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0528, code lost:
        r0 = (short) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0529, code lost:
        r6.putShort(r0);
        r1 = r9.A0B;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x052f, code lost:
        if (r1 == -1) goto L_0x0532;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0531, code lost:
        r0 = (short) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0532, code lost:
        r6.putShort(r0);
        r6.putInt(4718592);
        r6.putInt(4718592);
        r6.putInt(0);
        r6.putShort(1);
        r6.putLong(0);
        r6.putLong(0);
        r6.putLong(0);
        r6.putLong(0);
        r6.putShort(24);
        r6.putShort(-1);
        r6.put(r2);
        r1 = java.nio.ByteBuffer.allocate(8);
        r1.putInt(com.facebook.common.dextricks.Constants.LOAD_RESULT_PGO_ATTEMPTED);
        r1.putInt(com.facebook.common.dextricks.Constants.LOAD_RESULT_PGO_ATTEMPTED);
        r1.rewind();
        r6.put(X.S81.A00("pasp", r1));
        r13 = r9.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0579, code lost:
        if (r13 == null) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x057b, code lost:
        r2 = r13.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x057d, code lost:
        if (r2 != 0) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0581, code lost:
        if (r13.A04 != 0) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0585, code lost:
        if (r13.A02 == 0) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0587, code lost:
        r12 = java.nio.ByteBuffer.allocate(20);
        r12.put((byte) 110);
        r12.put((byte) 99);
        r12.put((byte) 108);
        r12.put((byte) 120);
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x05a2, code lost:
        if (r2 == -1) goto L_0x065a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x05a4, code lost:
        if (r2 < 0) goto L_0x0a1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x05a6, code lost:
        r1 = X.C10052Rlp.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x05ac, code lost:
        if (r2 >= r1.size()) goto L_0x0a1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x05ae, code lost:
        r3 = ((java.lang.Number) ((com.google.common.collect.ImmutableList) r1.get(r2)).get(0)).shortValue();
        r2 = ((java.lang.Number) ((com.google.common.collect.ImmutableList) r1.get(r2)).get(1)).shortValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x05ce, code lost:
        r1 = r13.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x05d0, code lost:
        if (r1 == -1) goto L_0x0658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x05d2, code lost:
        if (r1 < 0) goto L_0x0a14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x05d4, code lost:
        r14 = X.C10052Rlp.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x05da, code lost:
        if (r1 >= r14.size()) goto L_0x0a14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x05dc, code lost:
        r1 = ((java.lang.Number) r14.get(r1)).shortValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x05e6, code lost:
        r0 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x05e8, code lost:
        if (r0 == -1) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x05ea, code lost:
        if (r0 < 0) goto L_0x0a0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x05ec, code lost:
        if (r0 > 2) goto L_0x0a0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x05ee, code lost:
        if (r0 != 1) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x05f0, code lost:
        r4 = Byte.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x05f2, code lost:
        r12.putShort(r3);
        r12.putShort(r1);
        r12.putShort(r2);
        r12.put(r4);
        r12.flip();
        r6.put(X.S81.A00("colr", r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x060a, code lost:
        r6.flip();
        r37 = X.C11411SSj.A02(X.S81.A00(r10, r6));
        r6 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) ((X.C11754Sfp) r20).A06);
        r4 = java.nio.ByteBuffer.allocate((r6.size() * 4) + 200);
        r3 = 0;
        r4.putInt(0);
        r5 = r4.position();
        r4.putInt(r6.size());
        r2 = 0;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0640, code lost:
        if (r3 >= r6.size()) goto L_0x065e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x064c, code lost:
        if ((((android.media.MediaCodec.BufferInfo) r6.get(r3)).flags & 1) <= 0) goto L_0x0653;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x064e, code lost:
        r4.putInt(r1);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0653, code lost:
        r1 = r1 + 1;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0658, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x065a, code lost:
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x065e, code lost:
        r4.putInt(r5, r2);
        r4.flip();
        r6 = X.S81.A01("stbl", java.util.Arrays.asList(new java.nio.ByteBuffer[]{r37, r34, r39, r33, r32, r31, X.S81.A00("stss", r4)}));
        r5 = "vide";
        r4 = "VideoHandle";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0a1a, code lost:
        throw X.DbW.A0a("Color transfer not implemented: ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0a21, code lost:
        throw X.DbW.A0a("Color standard not implemented: ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02a2, code lost:
        throw X.AnonymousClass7TF.A0W("Unsupported video format: ", r13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.ByteBuffer A00(java.util.List r49, long r50, boolean r52) {
        /*
            r48 = this;
            r47 = r48
            r0 = r47
            X.RtW r0 = r0.A01
            r46 = r0
            androidx.media3.container.Mp4TimestampData r3 = r0.A01
            long r1 = r3.A00
            int r0 = (int) r1
            r45 = r0
            long r1 = r3.A01
            int r0 = (int) r1
            r44 = r0
            java.util.ArrayList r36 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r35 = X.AnonymousClass7TE.A1C()
            r16 = 0
            r28 = 1
            r29 = 0
        L_0x0022:
            r2 = r49
            int r1 = r2.size()
            r0 = r29
            if (r0 >= r1) goto L_0x0a39
            java.lang.Object r20 = r2.get(r0)
            r0 = r20
            X.Tbd r0 = (X.C13512Tbd) r0
            r20 = r0
            if (r52 != 0) goto L_0x004b
            r0 = r20
            X.Sfp r0 = (X.C11754Sfp) r0
            java.util.List r0 = r0.A06
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004b
        L_0x0048:
            int r29 = r29 + 1
            goto L_0x0022
        L_0x004b:
            r0 = r20
            X.Sfp r0 = (X.C11754Sfp) r0
            X.SJM r9 = r0.A01
            java.lang.String r0 = r9.A0X
            r23 = r0
            if (r0 != 0) goto L_0x0087
            r23 = 0
        L_0x0059:
            r0 = r20
            X.Sfp r0 = (X.C11754Sfp) r0
            java.util.List r0 = r0.A06
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            int r3 = r20.FN2()
            r0 = r47
            int r2 = r0.A00
            r0 = r50
            java.util.ArrayList r11 = X.C11411SSj.A03(r4, r3, r2, r0)
            r2 = 0
            r18 = 0
        L_0x0074:
            int r0 = r11.size()
            if (r2 >= r0) goto L_0x009a
            java.lang.Object r0 = r11.get(r2)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            long r18 = r18 + r0
            int r2 = r2 + 1
            goto L_0x0074
        L_0x0087:
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r23)
            java.lang.String r0 = r1.getISO3Language()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0059
            java.lang.String r23 = r1.getISO3Language()
            goto L_0x0059
        L_0x009a:
            int r0 = r20.FN2()
            long r0 = (long) r0
            r26 = 1000000(0xf4240, double:4.940656E-318)
            long r21 = r18 * r26
            long r21 = r21 / r0
            java.lang.String r10 = r9.A0Y
            int r3 = X.SQX.A00(r10)
            int r0 = r11.size()
            int r0 = r0 * 8
            int r0 = r0 + 200
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r0)
            r7 = 0
            r8.putInt(r7)
            int r6 = r8.position()
            r8.putInt(r7)
            r13 = -1
            r5 = 0
            r4 = -1
        L_0x00c7:
            int r0 = r11.size()
            if (r7 >= r0) goto L_0x00f1
            long r1 = X.Pxg.A0I(r11, r7)
            r0 = 1
            int r12 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r12 == 0) goto L_0x00e7
            int r4 = r8.position()
            r8.putInt(r0)
            int r0 = (int) r1
            r8.putInt(r0)
            int r5 = r5 + 1
            r13 = r1
        L_0x00e4:
            int r7 = r7 + 1
            goto L_0x00c7
        L_0x00e7:
            int r0 = r8.getInt(r4)
            int r0 = r0 + 1
            r8.putInt(r4, r0)
            goto L_0x00e4
        L_0x00f1:
            r8.putInt(r6, r5)
            r8.flip()
            java.lang.String r0 = "stts"
            java.nio.ByteBuffer r34 = X.S81.A00(r0, r8)
            java.lang.String r1 = X.SQX.A01(r10)
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01ad
            r0 = r20
            X.Sfp r0 = (X.C11754Sfp) r0
            java.util.List r0 = r0.A06
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            int r0 = r20.FN2()
            java.util.ArrayList r10 = X.C11411SSj.A04(r1, r11, r0)
            boolean r0 = r10.isEmpty()
            r8 = 0
            if (r0 == 0) goto L_0x0159
            java.nio.ByteBuffer r39 = java.nio.ByteBuffer.allocate(r8)
        L_0x0128:
            r7 = r20
            X.Sfp r7 = (X.C11754Sfp) r7
            java.util.List r0 = r7.A06
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            int r0 = r4.size()
            int r0 = r0 * 4
            int r0 = r0 + 200
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)
            r1 = 0
            r2.putInt(r1)
            X.Pxi.A1O(r2, r4, r1)
        L_0x0145:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x01b4
            java.lang.Object r0 = r4.get(r1)
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0
            int r0 = r0.size
            r2.putInt(r0)
            int r1 = r1 + 1
            goto L_0x0145
        L_0x0159:
            int r0 = r10.size()
            int r0 = r0 * 2
            int r0 = r0 * 4
            int r0 = r0 + 8
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r0)
            r6 = 1
            r7.putInt(r6)
            int r5 = r7.position()
            r7.putInt(r8)
            r4 = 0
            r2 = -1
            r1 = -1
        L_0x0175:
            int r0 = r10.size()
            if (r8 >= r0) goto L_0x019f
            java.lang.Object r0 = r10.get(r8)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r2 == r0) goto L_0x0195
            int r1 = r7.position()
            r7.putInt(r6)
            r7.putInt(r0)
            int r4 = r4 + 1
            r2 = r0
        L_0x0192:
            int r8 = r8 + 1
            goto L_0x0175
        L_0x0195:
            int r0 = r7.getInt(r1)
            int r0 = r0 + 1
            r7.putInt(r1, r0)
            goto L_0x0192
        L_0x019f:
            r7.putInt(r5, r4)
            r7.flip()
            java.lang.String r0 = "ctts"
            java.nio.ByteBuffer r39 = X.S81.A00(r0, r7)
            goto L_0x0128
        L_0x01ad:
            r0 = 0
            java.nio.ByteBuffer r39 = java.nio.ByteBuffer.allocate(r0)
            goto L_0x0128
        L_0x01b4:
            r2.flip()
            java.lang.String r0 = "stsz"
            java.nio.ByteBuffer r33 = X.S81.A00(r0, r2)
            java.util.List r0 = r7.A05
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            int r0 = r6.size()
            int r0 = r0 * 12
            int r0 = r0 + 200
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r0)
            r4 = 0
            X.Pxi.A1O(r5, r6, r4)
            r2 = 1
            r1 = 1
        L_0x01d6:
            int r0 = r6.size()
            if (r4 >= r0) goto L_0x01ee
            int r0 = X.C51971G9r.A0I(r6, r4)
            r5.putInt(r1)
            r5.putInt(r0)
            r5.putInt(r2)
            int r1 = r1 + 1
            int r4 = r4 + 1
            goto L_0x01d6
        L_0x01ee:
            r5.flip()
            java.lang.String r0 = "stsc"
            java.nio.ByteBuffer r32 = X.S81.A00(r0, r5)
            java.util.List r0 = r7.A04
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            int r0 = r5.size()
            if (r52 == 0) goto L_0x0238
            int r0 = r0 * 4
            int r0 = r0 + 8
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r0)
            r0 = 0
            X.Pxi.A1O(r4, r5, r0)
            r6 = 0
        L_0x0211:
            int r0 = r5.size()
            if (r6 >= r0) goto L_0x0231
            long r0 = X.Pxg.A0I(r5, r6)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r7 = X.Dba.A1U(r2)
            java.lang.String r2 = "Only 32-bit chunk offset is allowed"
            if (r7 == 0) goto L_0x09f4
            int r2 = (int) r0
            r4.putInt(r2)
            int r6 = r6 + 1
            goto L_0x0211
        L_0x0231:
            r4.flip()
            java.lang.String r0 = "stco"
            goto L_0x025b
        L_0x0238:
            int r0 = r0 * 2
            int r0 = r0 * 4
            int r0 = r0 + 8
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r0)
            r2 = 0
            X.Pxi.A1O(r4, r5, r2)
        L_0x0246:
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x0256
            long r0 = X.Pxg.A0I(r5, r2)
            r4.putLong(r0)
            int r2 = r2 + 1
            goto L_0x0246
        L_0x0256:
            r4.flip()
            java.lang.String r0 = "co64"
        L_0x025b:
            java.nio.ByteBuffer r31 = X.S81.A00(r0, r4)
            r8 = -1
            r25 = 4
            r30 = 5
            if (r3 == r8) goto L_0x0689
            r0 = r30
            if (r3 == r0) goto L_0x0689
            r7 = 1
            if (r3 == r7) goto L_0x06e5
            r11 = 2
            if (r3 != r11) goto L_0x0a22
            r0 = 200(0xc8, float:2.8E-43)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r12 = 0
            r1.putInt(r12)
            r1.putShort(r12)
            r1.putShort(r12)
            r1.putShort(r12)
            r1.putShort(r12)
            r1.flip()
            java.lang.String r0 = "vmhd"
            java.nio.ByteBuffer r24 = X.S81.A00(r0, r1)
            java.lang.String r13 = r9.A0Y
            r13.getClass()
            int r37 = r13.hashCode()
            switch(r37) {
                case -1662735862: goto L_0x04a3;
                case -1662541442: goto L_0x0372;
                case 1331836730: goto L_0x02a3;
                default: goto L_0x029c;
            }
        L_0x029c:
            java.lang.String r0 = "Unsupported video format: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r13)
            throw r0
        L_0x02a3:
            java.lang.String r0 = "video/avc"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x029c
            java.util.List r2 = r9.A0Z
            int r0 = r2.size()
            boolean r1 = X.JTQ.A1P(r0, r11)
            java.lang.String r0 = "csd-0 and/or csd-1 not found in the format."
            X.C11366SPh.A03(r1, r0)
            java.lang.Object r3 = r2.get(r12)
            byte[] r3 = (byte[]) r3
            int r0 = r3.length
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            java.lang.String r0 = "csd-0 is empty."
            X.C11366SPh.A03(r1, r0)
            java.lang.Object r2 = r2.get(r7)
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            java.lang.String r0 = "csd-1 is empty."
            X.C11366SPh.A03(r1, r0)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r2)
            int r0 = r4.limit()
            int r1 = r3.limit()
            int r0 = r0 + r1
            int r0 = r0 + 200
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r0)
            r10.put(r7)
            com.google.common.collect.ImmutableList r2 = X.S80.A00(r4)
            int r0 = r2.size()
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r7)
            java.lang.String r0 = "SPS data not found in csd0."
            X.C11366SPh.A03(r1, r0)
            java.lang.Object r1 = r2.get(r12)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r1.remaining()
            byte[] r0 = new byte[r2]
            r1.get(r0)
            r1.rewind()
            X.Rz2 r2 = X.SS3.A03(r0, r7, r2)
            int r0 = r2.A0A
            byte r0 = (byte) r0
            r10.put(r0)
            int r0 = r2.A06
            byte r0 = (byte) r0
            r10.put(r0)
            int r0 = r2.A08
            byte r0 = (byte) r0
            r10.put(r0)
            r10.put(r8)
            r0 = -31
            r10.put(r0)
            int r0 = r1.remaining()
            short r0 = (short) r0
            r10.putShort(r0)
            r10.put(r1)
            r1.rewind()
            com.google.common.collect.ImmutableList r1 = X.S80.A00(r3)
            int r0 = r1.size()
            boolean r2 = X.AnonymousClass7TF.A1S(r0, r7)
            java.lang.String r0 = "PPS data not found in csd1."
            if (r2 == 0) goto L_0x09fd
            r10.put(r7)
            java.lang.Object r1 = r1.get(r12)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r0 = r1.remaining()
            short r0 = (short) r0
            r10.putShort(r0)
            r10.put(r1)
            r1.rewind()
            r10.flip()
            java.lang.String r0 = "avcC"
            goto L_0x04cf
        L_0x0372:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x029c
            java.util.List r2 = r9.A0Z
            boolean r1 = X.AnonymousClass7TE.A1b(r2)
            java.lang.String r0 = "csd-0 not found in the format."
            X.C11366SPh.A03(r1, r0)
            java.lang.Object r2 = r2.get(r12)
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            java.lang.String r0 = "csd-0 is empty."
            X.C11366SPh.A03(r1, r0)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r2)
            int r0 = r1.limit()
            int r0 = r0 + 200
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r0)
            com.google.common.collect.ImmutableList r6 = X.S80.A00(r1)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r4 = 0
        L_0x03ad:
            int r0 = r6.size()
            if (r4 >= r0) goto L_0x03ef
            java.lang.Object r3 = r6.get(r4)
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r3.limit()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)
            r1 = 0
            r0 = 0
        L_0x03c3:
            int r14 = r3.limit()
            if (r1 >= r14) goto L_0x03e6
            byte r15 = r3.get(r1)
            r14 = 3
            if (r15 != r14) goto L_0x03de
            if (r0 < r11) goto L_0x03de
        L_0x03d2:
            byte r14 = r3.get(r1)
            int r0 = r0 + 1
            if (r14 == 0) goto L_0x03db
            r0 = 0
        L_0x03db:
            int r1 = r1 + 1
            goto L_0x03c3
        L_0x03de:
            byte r14 = r3.get(r1)
            r2.put(r14)
            goto L_0x03d2
        L_0x03e6:
            r2.flip()
            r5.add(r2)
            int r4 = r4 + 1
            goto L_0x03ad
        L_0x03ef:
            r10.put(r7)
            java.lang.Object r1 = r5.get(r12)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r0 = r1.position()
            byte r2 = r1.get(r0)
            r0 = 64
            if (r2 != r0) goto L_0x0a06
            r0 = 6
            byte r0 = r1.get(r0)
            r10.put(r0)
            r0 = 7
            int r0 = r1.getInt(r0)
            r10.putInt(r0)
            r0 = 11
            int r0 = r1.getInt(r0)
            r10.putInt(r0)
            r3 = 15
            short r0 = r1.getShort(r3)
            r10.putShort(r0)
            r0 = 17
            byte r0 = r1.get(r0)
            r10.put(r0)
            r0 = -4096(0xfffffffffffff000, float:NaN)
            r10.putShort(r0)
            r0 = -4
            r10.put(r0)
            java.lang.Object r2 = r6.get(r7)
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r1 = r2.remaining()
            byte[] r0 = new byte[r1]
            r2.get(r0)
            r2.rewind()
            X.RzC r0 = X.SS3.A02(r0, r11, r1)
            int r1 = r0.A03
            r1 = r1 | 252(0xfc, float:3.53E-43)
            byte r2 = (byte) r1
            int r1 = r0.A02
            r1 = r1 | 248(0xf8, float:3.48E-43)
            byte r1 = (byte) r1
            int r0 = r0.A01
            r0 = r0 | 248(0xf8, float:3.48E-43)
            byte r0 = (byte) r0
            r10.put(r2)
            r10.put(r1)
            r10.put(r0)
            r10.putShort(r12)
            r10.put(r3)
            int r0 = r6.size()
            byte r0 = (byte) r0
            r10.put(r0)
            r2 = 0
        L_0x0475:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x049d
            java.lang.Object r1 = r6.get(r2)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            byte r0 = r1.get(r12)
            int r0 = r0 >> r7
            r0 = r0 & 63
            byte r0 = (byte) r0
            r10.put(r0)
            r10.putShort(r7)
            int r0 = r1.limit()
            short r0 = (short) r0
            r10.putShort(r0)
            r10.put(r1)
            int r2 = r2 + 1
            goto L_0x0475
        L_0x049d:
            r10.flip()
            java.lang.String r0 = "hvcC"
            goto L_0x04cf
        L_0x04a3:
            java.lang.String r0 = "video/av01"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x029c
            java.util.List r3 = r9.A0Z
            boolean r0 = r3.isEmpty()
            r2 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "csd-0 is not found in the format"
            X.C11366SPh.A03(r1, r0)
            java.lang.Object r1 = r3.get(r12)
            byte[] r1 = (byte[]) r1
            int r0 = r1.length
            if (r0 > 0) goto L_0x04c4
            r2 = 0
        L_0x04c4:
            java.lang.String r0 = "csd-0 is empty."
            X.C11366SPh.A03(r2, r0)
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r0 = "av1C"
        L_0x04cf:
            java.nio.ByteBuffer r2 = X.S81.A00(r0, r10)
            switch(r37) {
                case -1662735862: goto L_0x04f5;
                case -1662541442: goto L_0x04e9;
                case 1331836730: goto L_0x04dd;
                default: goto L_0x04d6;
            }
        L_0x04d6:
            java.lang.String r0 = "Unsupported video format: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r13)
            throw r0
        L_0x04dd:
            java.lang.String r0 = "video/avc"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x04d6
            java.lang.String r10 = "avc1"
            goto L_0x0500
        L_0x04e9:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x04d6
            java.lang.String r10 = "hvc1"
            goto L_0x0500
        L_0x04f5:
            java.lang.String r0 = "video/av01"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x04d6
            java.lang.String r10 = "av01"
        L_0x0500:
            int r0 = r2.limit()
            int r0 = r0 + 200
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r0)
            r5 = 0
            r6.putInt(r12)
            r6.putShort(r12)
            r6.putShort(r7)
            r6.putShort(r12)
            r6.putShort(r12)
            r6.putInt(r12)
            r6.putInt(r12)
            r6.putInt(r12)
            int r1 = r9.A0N
            r0 = 0
            if (r1 == r8) goto L_0x0529
            short r0 = (short) r1
        L_0x0529:
            r6.putShort(r0)
            int r1 = r9.A0B
            r0 = 0
            if (r1 == r8) goto L_0x0532
            short r0 = (short) r1
        L_0x0532:
            r6.putShort(r0)
            r0 = 4718592(0x480000, float:6.612156E-39)
            r6.putInt(r0)
            r6.putInt(r0)
            r6.putInt(r12)
            r6.putShort(r7)
            r0 = 0
            r6.putLong(r0)
            r6.putLong(r0)
            r6.putLong(r0)
            r6.putLong(r0)
            r0 = 24
            r6.putShort(r0)
            r6.putShort(r8)
            r6.put(r2)
            r0 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            r1.putInt(r0)
            r1.putInt(r0)
            r1.rewind()
            java.lang.String r0 = "pasp"
            java.nio.ByteBuffer r0 = X.S81.A00(r0, r1)
            r6.put(r0)
            X.SRQ r13 = r9.A0P
            if (r13 == 0) goto L_0x060a
            int r2 = r13.A03
            if (r2 != 0) goto L_0x0587
            int r0 = r13.A04
            if (r0 != 0) goto L_0x0587
            int r0 = r13.A02
            if (r0 == 0) goto L_0x060a
        L_0x0587:
            r0 = 20
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r0)
            r0 = 110(0x6e, float:1.54E-43)
            r12.put(r0)
            r0 = 99
            r12.put(r0)
            r0 = 108(0x6c, float:1.51E-43)
            r12.put(r0)
            r0 = 120(0x78, float:1.68E-43)
            r12.put(r0)
            r4 = 0
            if (r2 == r8) goto L_0x065a
            if (r2 < 0) goto L_0x0a1b
            com.google.common.collect.ImmutableList r1 = X.C10052Rlp.A00
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0a1b
            java.lang.Object r0 = r1.get(r2)
            com.google.common.collect.ImmutableList r0 = (com.google.common.collect.ImmutableList) r0
            java.lang.Object r0 = r0.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            short r3 = r0.shortValue()
            java.lang.Object r0 = r1.get(r2)
            com.google.common.collect.ImmutableList r0 = (com.google.common.collect.ImmutableList) r0
            java.lang.Object r0 = r0.get(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            short r2 = r0.shortValue()
        L_0x05ce:
            int r1 = r13.A04
            if (r1 == r8) goto L_0x0658
            if (r1 < 0) goto L_0x0a14
            com.google.common.collect.ImmutableList r14 = X.C10052Rlp.A01
            int r0 = r14.size()
            if (r1 >= r0) goto L_0x0a14
            java.lang.Object r0 = r14.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            short r1 = r0.shortValue()
        L_0x05e6:
            int r0 = r13.A02
            if (r0 == r8) goto L_0x05f2
            if (r0 < 0) goto L_0x0a0d
            if (r0 > r11) goto L_0x0a0d
            if (r0 != r7) goto L_0x05f2
            r4 = -128(0xffffffffffffff80, float:NaN)
        L_0x05f2:
            r12.putShort(r3)
            r12.putShort(r1)
            r12.putShort(r2)
            r12.put(r4)
            r12.flip()
            java.lang.String r0 = "colr"
            java.nio.ByteBuffer r0 = X.S81.A00(r0, r12)
            r6.put(r0)
        L_0x060a:
            r6.flip()
            java.nio.ByteBuffer r0 = X.S81.A00(r10, r6)
            java.nio.ByteBuffer r37 = X.C11411SSj.A02(r0)
            r0 = r20
            X.Sfp r0 = (X.C11754Sfp) r0
            java.util.List r0 = r0.A06
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            int r0 = r6.size()
            int r0 = r0 * 4
            int r0 = r0 + 200
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r0)
            r3 = 0
            r4.putInt(r5)
            int r5 = r4.position()
            int r0 = r6.size()
            r4.putInt(r0)
            r2 = 0
            r1 = 1
        L_0x063c:
            int r0 = r6.size()
            if (r3 >= r0) goto L_0x065e
            java.lang.Object r0 = r6.get(r3)
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0
            int r0 = r0.flags
            r0 = r0 & 1
            if (r0 <= 0) goto L_0x0653
            r4.putInt(r1)
            int r2 = r2 + 1
        L_0x0653:
            int r1 = r1 + 1
            int r3 = r3 + 1
            goto L_0x063c
        L_0x0658:
            r1 = 0
            goto L_0x05e6
        L_0x065a:
            r2 = 0
            r3 = 0
            goto L_0x05ce
        L_0x065e:
            r4.putInt(r5, r2)
            r4.flip()
            java.lang.String r0 = "stss"
            java.nio.ByteBuffer r43 = X.S81.A00(r0, r4)
            r38 = r34
            r40 = r33
            r41 = r32
            r42 = r31
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[]{r37, r38, r39, r40, r41, r42, r43}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = "stbl"
            java.nio.ByteBuffer r6 = X.S81.A01(r0, r1)
            java.lang.String r5 = "vide"
            java.lang.String r4 = "VideoHandle"
            goto L_0x0808
        L_0x0689:
            r2 = 200(0xc8, float:2.8E-43)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            r3 = 0
            r1.putInt(r3)
            r1.flip()
            java.lang.String r0 = "nmhd"
            java.nio.ByteBuffer r24 = X.S81.A00(r0, r1)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.lang.String r1 = r9.A0Y
            r1.getClass()
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05
            byte[] r0 = r1.getBytes(r0)
            r2.put(r0)
            r2.put(r3)
            r2.put(r0)
            r2.put(r3)
            r2.flip()
            java.lang.String r0 = "mett"
            java.nio.ByteBuffer r0 = X.S81.A00(r0, r2)
            java.nio.ByteBuffer r4 = X.C11411SSj.A02(r0)
            r7 = 1
            r3 = r34
            r2 = r33
            r1 = r32
            r0 = r31
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[]{r4, r3, r2, r1, r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = "stbl"
            java.nio.ByteBuffer r6 = X.S81.A01(r0, r1)
            java.lang.String r5 = "meta"
            java.lang.String r4 = "MetaHandle"
            goto L_0x0808
        L_0x06e5:
            r0 = 200(0xc8, float:2.8E-43)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r11 = 0
            r1.putInt(r11)
            r1.putShort(r11)
            r1.putShort(r11)
            r1.flip()
            java.lang.String r0 = "smhd"
            java.nio.ByteBuffer r24 = X.S81.A00(r0, r1)
            java.lang.String r2 = r9.A0Y
            r2.getClass()
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r1 = r2.equals(r0)
            java.lang.String r0 = "Unsupported audio format: "
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.C11366SPh.A03(r1, r0)
            java.util.List r2 = r9.A0Z
            boolean r1 = X.AnonymousClass7TE.A1b(r2)
            java.lang.String r0 = "csd-0 not found in the format."
            X.C11366SPh.A03(r1, r0)
            java.lang.Object r2 = r2.get(r11)
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            java.lang.String r0 = "csd-0 is empty."
            X.C11366SPh.A03(r1, r0)
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r2)
            int r0 = r10.limit()
            int r0 = r0 + 200
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r0)
            r6.putInt(r11)
            r6.putShort(r11)
            r6.putShort(r7)
            r6.putInt(r11)
            r6.putInt(r11)
            int r0 = r9.A06
            short r0 = (short) r0
            r6.putShort(r0)
            r0 = 16
            r6.putShort(r0)
            r6.putShort(r11)
            r6.putShort(r11)
            int r0 = r9.A0I
            int r0 = r0 << 16
            r6.putInt(r0)
            int r5 = r9.A0F
            int r4 = r9.A04
            int r3 = r10.limit()
            int r0 = r3 + 200
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)
            r2.putInt(r11)
            r1 = 3
            r2.put(r1)
            int r12 = r3 + 21
            r0 = 127(0x7f, float:1.78E-43)
            boolean r12 = X.AnonymousClass7TF.A1T(r12, r0)
            java.lang.String r0 = "CSD too long; we might need variable-length encoding?"
            X.C11366SPh.A03(r12, r0)
            int r0 = r3 + 23
            byte r0 = (byte) r0
            r2.put(r0)
            r2.putShort(r11)
            r2.put(r11)
            r0 = r25
            r2.put(r0)
            int r0 = r3 + 15
            byte r0 = (byte) r0
            r2.put(r0)
            r0 = 64
            r2.put(r0)
            r0 = 21
            r2.put(r0)
            r2.putShort(r1)
            r2.put(r11)
            if (r5 != r8) goto L_0x07af
            r5 = 0
        L_0x07af:
            r2.putInt(r5)
            if (r4 != r8) goto L_0x07b5
            r4 = 0
        L_0x07b5:
            r2.putInt(r4)
            r0 = r30
            r2.put(r0)
            byte r0 = (byte) r3
            r2.put(r0)
            r2.put(r10)
            r10.rewind()
            r0 = 6
            r2.put(r0)
            r2.put(r7)
            r0 = 2
            r2.put(r0)
            r2.flip()
            java.lang.String r0 = "esds"
            java.nio.ByteBuffer r0 = X.S81.A00(r0, r2)
            r6.put(r0)
            r6.flip()
            java.lang.String r0 = "mp4a"
            java.nio.ByteBuffer r0 = X.S81.A00(r0, r6)
            java.nio.ByteBuffer r4 = X.C11411SSj.A02(r0)
            r3 = r34
            r2 = r33
            r1 = r32
            r0 = r31
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[]{r4, r3, r2, r1, r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = "stbl"
            java.nio.ByteBuffer r6 = X.S81.A01(r0, r1)
            java.lang.String r5 = "soun"
            java.lang.String r4 = "SoundHandle"
        L_0x0808:
            r0 = r46
            androidx.media3.container.Mp4OrientationData r0 = r0.A00
            int r12 = r0.A00
            r3 = 3
            r32 = 200(0xc8, float:2.8E-43)
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r32)
            r2 = 7
            r11.putInt(r2)
            r0 = r45
            r11.putInt(r0)
            r0 = r44
            r11.putInt(r0)
            r0 = r28
            r11.putInt(r0)
            r10 = 0
            r11.putInt(r10)
            r13 = 10000(0x2710, double:4.9407E-320)
            long r0 = r21 * r13
            long r0 = r0 / r26
            int r13 = (int) r0
            r11.putInt(r13)
            r11.putInt(r10)
            r11.putInt(r10)
            r11.putInt(r10)
            java.lang.String r0 = r9.A0Y
            java.lang.String r1 = X.SQX.A01(r0)
            java.lang.String r0 = "audio"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0850
            r0 = 256(0x100, float:3.59E-43)
        L_0x0850:
            r11.putShort(r0)
            r11.putShort(r10)
            r13 = 9
            if (r12 == 0) goto L_0x09ed
            r0 = 90
            r31 = 1073741824(0x40000000, float:2.0)
            r27 = 8
            r26 = 6
            r15 = -65536(0xffffffffffff0000, float:NaN)
            r14 = 2
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r12 == r0) goto L_0x09e1
            r0 = 180(0xb4, float:2.52E-43)
            if (r12 == r0) goto L_0x09d3
            r0 = 270(0x10e, float:3.78E-43)
            if (r12 != r0) goto L_0x0a32
            int[] r12 = new int[r13]
            r12[r10] = r10
            r12[r7] = r15
            r12[r14] = r10
            r12[r3] = r1
        L_0x087b:
            r12[r25] = r10
        L_0x087d:
            r12[r30] = r10
            r12[r26] = r10
            r12[r2] = r10
            r12[r27] = r31
        L_0x0885:
            r0 = 36
            byte[] r2 = new byte[r0]
            r1 = 0
            r26 = 0
        L_0x088c:
            r14 = r12[r1]
            int r15 = r26 + 1
            int r0 = r14 >> 24
            byte r0 = (byte) r0
            r2[r26] = r0
            int r26 = r15 + 1
            int r0 = r14 >> 16
            byte r0 = (byte) r0
            r2[r15] = r0
            int r15 = r26 + 1
            int r0 = r14 >> 8
            byte r0 = (byte) r0
            r2[r26] = r0
            int r26 = r15 + 1
            byte r0 = (byte) r14
            r2[r15] = r0
            int r1 = r1 + 1
            if (r1 < r13) goto L_0x088c
            r11.put(r2)
            int r1 = r9.A0N
            if (r1 != r8) goto L_0x08b4
            r1 = 0
        L_0x08b4:
            int r0 = r9.A0B
            if (r0 == r8) goto L_0x08b9
            r10 = r0
        L_0x08b9:
            int r0 = r1 << 16
            r11.putInt(r0)
            int r0 = r10 << 16
            r11.putInt(r0)
            r11.flip()
            java.lang.String r0 = "tkhd"
            java.nio.ByteBuffer r9 = X.S81.A00(r0, r11)
            r2 = 0
            int r1 = r20.FN2()
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r32)
            r8.putInt(r2)
            r0 = r45
            r8.putInt(r0)
            r0 = r44
            r8.putInt(r0)
            r8.putInt(r1)
            r0 = r18
            int r10 = (int) r0
            r8.putInt(r10)
            r10 = 0
            if (r23 != 0) goto L_0x09a4
            r0 = 0
        L_0x08f0:
            r8.putShort(r0)
            r8.putShort(r2)
            r8.flip()
            java.lang.String r0 = "mdhd"
            java.nio.ByteBuffer r0 = X.S81.A00(r0, r8)
            java.nio.ByteBuffer r3 = X.C11411SSj.A01(r5, r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r25)
            r4.putInt(r7)
            r4.flip()
            java.lang.String r1 = "url "
            java.nio.ByteBuffer r1 = X.S81.A00(r1, r4)
            java.nio.ByteBuffer[] r1 = new java.nio.ByteBuffer[]{r1}
            r4 = 8
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r4.putInt(r2)
            r4.putInt(r7)
            r4.flip()
            java.util.ArrayList r4 = X.DbV.A14(r4)
            java.util.Collections.addAll(r4, r1)
            java.lang.String r1 = "dref"
            java.nio.ByteBuffer r4 = X.S81.A01(r1, r4)
            java.lang.String r1 = "dinf"
            java.nio.ByteBuffer r1 = X.S81.A00(r1, r4)
            r4 = r24
            java.nio.ByteBuffer[] r1 = new java.nio.ByteBuffer[]{r4, r1, r6}
            java.util.List r4 = java.util.Arrays.asList(r1)
            java.lang.String r1 = "minf"
            java.nio.ByteBuffer r1 = X.S81.A01(r1, r4)
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[]{r0, r3, r1}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = "mdia"
            java.nio.ByteBuffer r0 = X.S81.A01(r0, r1)
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[]{r9, r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = "trak"
            java.nio.ByteBuffer r1 = X.S81.A01(r0, r1)
            r0 = r36
            r0.add(r1)
            r0 = r16
            r3 = r21
            long r16 = java.lang.Math.max(r0, r3)
            r0 = 24
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r1.putInt(r2)
            r0 = r28
            r1.putInt(r0)
            r1.putInt(r7)
            r1.putInt(r2)
            r1.putInt(r2)
            r1.putInt(r2)
            r1.flip()
            java.lang.String r0 = "trex"
            java.nio.ByteBuffer r1 = X.S81.A00(r0, r1)
            r0 = r35
            r0.add(r1)
            int r28 = r28 + 1
            goto L_0x0048
        L_0x09a4:
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05
            r1 = r23
            byte[] r1 = r1.getBytes(r0)
            int r0 = r1.length
            if (r0 != r3) goto L_0x0a29
            r0 = 2
            byte r0 = r1[r0]
            r0 = r0 & 31
            byte r3 = r1[r7]
            r3 = r3 & 31
            int r3 = r3 << 5
            int r0 = r0 + r3
            byte r1 = r1[r2]
            r1 = r1 & 31
            int r1 = r1 << 10
            int r0 = r0 + r1
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x09c9
            r10 = 1
        L_0x09c9:
            X.C11366SPh.A02(r10)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r0 = (short) r0
            goto L_0x08f0
        L_0x09d3:
            int[] r12 = new int[r13]
            r12[r10] = r15
            r12[r7] = r10
            r12[r14] = r10
            r12[r3] = r10
            r12[r25] = r15
            goto L_0x087d
        L_0x09e1:
            int[] r12 = new int[r13]
            r12[r10] = r10
            r12[r7] = r1
            r12[r14] = r10
            r12[r3] = r15
            goto L_0x087b
        L_0x09ed:
            int[] r12 = new int[r13]
            r12 = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824} // fill-array
            goto L_0x0885
        L_0x09f4:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x09fd:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0a06:
            java.lang.String r0 = "First NALU in csd-0 is not the VPS."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0a0d:
            java.lang.String r1 = "Color range not implemented: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r1, r0)
            throw r0
        L_0x0a14:
            java.lang.String r0 = "Color transfer not implemented: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        L_0x0a1b:
            java.lang.String r0 = "Color standard not implemented: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r2)
            throw r0
        L_0x0a22:
            java.lang.String r0 = "Unsupported track type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0a29:
            java.lang.String r1 = "Non-length-3 language code: "
            r0 = r23
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x0a32:
            java.lang.String r0 = "invalid orientation "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r12)
            throw r0
        L_0x0a39:
            com.google.common.collect.ImmutableList r0 = X.C11411SSj.A00
            r0 = 200(0xc8, float:2.8E-43)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r0)
            r2 = 0
            r3.putInt(r2)
            r0 = r45
            r3.putInt(r0)
            r0 = r44
            r3.putInt(r0)
            r0 = 10000(0x2710, float:1.4013E-41)
            r3.putInt(r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            long r16 = r16 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r16 = r16 / r0
            r0 = r16
            int r4 = (int) r0
            r3.putInt(r4)
            r0 = 65536(0x10000, float:9.18355E-41)
            r3.putInt(r0)
            r0 = 256(0x100, float:3.59E-43)
            r3.putShort(r0)
            r3.putShort(r2)
            r3.putInt(r2)
            r3.putInt(r2)
            r5 = 9
            int[] r4 = new int[r5]
            r4 = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824} // fill-array
            r1 = 0
        L_0x0a7e:
            r0 = r4[r1]
            r3.putInt(r0)
            int r1 = r1 + 1
            if (r1 < r5) goto L_0x0a7e
            r1 = 0
        L_0x0a88:
            r3.putInt(r2)
            int r1 = r1 + 1
            r0 = 6
            if (r1 < r0) goto L_0x0a88
            r0 = r28
            r3.putInt(r0)
            r3.flip()
            java.lang.String r0 = "mvhd"
            java.nio.ByteBuffer r11 = X.S81.A00(r0, r3)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r2)
            r0 = r46
            java.util.List r7 = r0.A02
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0adb
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
        L_0x0ab1:
            if (r52 == 0) goto L_0x0ad6
            java.lang.String r2 = "mvex"
            r0 = r35
            java.nio.ByteBuffer r4 = X.S81.A01(r2, r0)
        L_0x0abc:
            java.util.ArrayList r2 = X.DbV.A14(r11)
            r2.add(r3)
            r2.add(r1)
            r0 = r36
            r2.addAll(r0)
            r2.add(r4)
            java.lang.String r0 = "moov"
            java.nio.ByteBuffer r0 = X.S81.A01(r0, r2)
            return r0
        L_0x0ad6:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r2)
            goto L_0x0abc
        L_0x0adb:
            java.lang.String r9 = "mdta"
            java.lang.String r0 = ""
            java.nio.ByteBuffer r6 = X.C11411SSj.A01(r9, r0)
            java.util.ArrayList r8 = X.C256393vh.A00(r7)
            r5 = 0
            r1 = 0
            r4 = 0
        L_0x0aeb:
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x0b03
            java.lang.Object r0 = r8.get(r1)
            androidx.media3.container.MdtaMetadataEntry r0 = (androidx.media3.container.MdtaMetadataEntry) r0
            java.lang.String r0 = r0.A02
            int r0 = r0.length()
            int r0 = r0 + 8
            int r4 = r4 + r0
            int r1 = r1 + 1
            goto L_0x0aeb
        L_0x0b03:
            int r0 = r4 + 8
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r0)
            X.Pxi.A1O(r4, r8, r2)
        L_0x0b0c:
            int r0 = r8.size()
            if (r5 >= r0) goto L_0x0b2e
            java.lang.Object r0 = r8.get(r5)
            androidx.media3.container.MdtaMetadataEntry r0 = (androidx.media3.container.MdtaMetadataEntry) r0
            java.lang.String r1 = r0.A02
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05
            byte[] r0 = r1.getBytes(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = X.S81.A00(r9, r0)
            r4.put(r0)
            int r5 = r5 + 1
            goto L_0x0b0c
        L_0x0b2e:
            r4.flip()
            java.lang.String r0 = "keys"
            java.nio.ByteBuffer r5 = X.S81.A00(r0, r4)
            java.util.ArrayList r8 = X.C256393vh.A00(r7)
            r1 = 0
            r4 = 0
            r7 = 0
        L_0x0b3e:
            int r0 = r8.size()
            if (r4 >= r0) goto L_0x0b55
            java.lang.Object r0 = r8.get(r4)
            androidx.media3.container.MdtaMetadataEntry r0 = (androidx.media3.container.MdtaMetadataEntry) r0
            byte[] r0 = r0.A03
            int r0 = r0.length
            int r0 = r0 + 16
            int r0 = r0 + 8
            int r7 = r7 + r0
            int r4 = r4 + 1
            goto L_0x0b3e
        L_0x0b55:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)
        L_0x0b59:
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x0b97
            int r4 = r1 + 1
            java.lang.Object r10 = r8.get(r1)
            androidx.media3.container.MdtaMetadataEntry r10 = (androidx.media3.container.MdtaMetadataEntry) r10
            byte[] r9 = r10.A03
            int r0 = r9.length
            int r0 = r0 + 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            int r0 = r10.A01
            r1.putInt(r0)
            int r0 = r10.A00
            r1.putInt(r0)
            r1.put(r9)
            r1.flip()
            java.lang.String r0 = "data"
            java.nio.ByteBuffer r1 = X.S81.A00(r0, r1)
            int r0 = r1.remaining()
            int r0 = r0 + 8
            r7.putInt(r0)
            r7.putInt(r4)
            r7.put(r1)
            r1 = r4
            goto L_0x0b59
        L_0x0b97:
            r7.flip()
            java.lang.String r0 = "ilst"
            java.nio.ByteBuffer r0 = X.S81.A00(r0, r7)
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[]{r6, r5, r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = "meta"
            java.nio.ByteBuffer r1 = X.S81.A01(r0, r1)
            goto L_0x0ab1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10921S0y.A00(java.util.List, long, boolean):java.nio.ByteBuffer");
    }
}
