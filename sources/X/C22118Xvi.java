package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Xvi  reason: case insensitive filesystem */
public final class C22118Xvi implements Y92 {
    public final int A00;
    public final ImmutableList A01;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0153, code lost:
        r1 = new X.SOW();
        r1.A0L = r8;
        r1.A09 = r7;
        r1.A01(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C22118Xvi A00(X.C11389SRd r14, int r15) {
        /*
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            int r4 = r14.A00
            r2 = -2
        L_0x0008:
            int r0 = X.Pxe.A06(r14)
            r1 = 8
            if (r0 <= r1) goto L_0x01c8
            int r6 = r14.A02()
            int r0 = r14.A02()
            int r3 = r14.A01
            int r3 = r3 + r0
            r14.A0N(r3)
            r0 = 1414744396(0x5453494c, float:3.62987127E12)
            if (r6 != r0) goto L_0x0068
            int r0 = r14.A02()
            X.Xvi r8 = A00(r14, r0)
        L_0x002b:
            int r1 = r8.getType()
            r0 = 1752331379(0x68727473, float:4.5798432E24)
            if (r1 != r0) goto L_0x0058
            r0 = r8
            X.Xvh r0 = (X.C22117Xvh) r0
            int r2 = r0.A03
            r0 = 1935960438(0x73646976, float:1.809666E31)
            if (r2 == r0) goto L_0x0066
            r0 = 1935963489(0x73647561, float:1.8100348E31)
            if (r2 == r0) goto L_0x0064
            r0 = 1937012852(0x73747874, float:1.936895E31)
            if (r2 == r0) goto L_0x0062
            java.lang.String r1 = "Found unsupported streamType fourCC: "
            java.lang.String r0 = java.lang.Integer.toHexString(r2)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "AviStreamHeaderChunk"
            X.STH.A03(r0, r1)
            r2 = -1
        L_0x0058:
            r5.add(r8)
        L_0x005b:
            r14.A0O(r3)
            r14.A0N(r4)
            goto L_0x0008
        L_0x0062:
            r2 = 3
            goto L_0x0058
        L_0x0064:
            r2 = 1
            goto L_0x0058
        L_0x0066:
            r2 = 2
            goto L_0x0058
        L_0x0068:
            switch(r6) {
                case 1718776947: goto L_0x006c;
                case 1751742049: goto L_0x016b;
                case 1752331379: goto L_0x018d;
                case 1852994675: goto L_0x01b7;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x005b
        L_0x006c:
            r0 = 2
            if (r2 != r0) goto L_0x009b
            r0 = 4
            r14.A0P(r0)
            int r8 = r14.A02()
            int r7 = r14.A02()
            r14.A0P(r0)
            int r6 = r14.A02()
            switch(r6) {
                case 808802372: goto L_0x014d;
                case 826496577: goto L_0x00e5;
                case 828601953: goto L_0x00e5;
                case 842289229: goto L_0x00e2;
                case 859066445: goto L_0x00df;
                case 875967048: goto L_0x00e5;
                case 877677894: goto L_0x014d;
                case 1145656883: goto L_0x014d;
                case 1145656920: goto L_0x014d;
                case 1196444237: goto L_0x00dc;
                case 1482049860: goto L_0x014d;
                case 1684633208: goto L_0x014d;
                case 1735420525: goto L_0x00dc;
                case 2021026148: goto L_0x014d;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Ignoring track with unsupported compression "
        L_0x008b:
            r1.append(r0)
            r1.append(r6)
        L_0x0091:
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "StreamFormatChunk"
            X.STH.A03(r0, r1)
            goto L_0x005b
        L_0x009b:
            r0 = 1
            if (r2 != r0) goto L_0x00bb
            int r6 = r14.A03()
            if (r6 == r0) goto L_0x00f9
            r0 = 85
            if (r6 == r0) goto L_0x00f2
            r0 = 255(0xff, float:3.57E-43)
            if (r6 == r0) goto L_0x00ef
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r6 == r0) goto L_0x00fc
            r0 = 8193(0x2001, float:1.1481E-41)
            if (r6 == r0) goto L_0x00e8
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Ignoring track with unsupported format tag "
            goto L_0x008b
        L_0x00bb:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Ignoring strf box for unsupported track type: "
            r1.append(r0)
            switch(r2) {
                case -2: goto L_0x00cd;
                case -1: goto L_0x00d0;
                case 0: goto L_0x00c7;
                case 1: goto L_0x00d3;
                case 2: goto L_0x00d6;
                case 3: goto L_0x00d9;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            java.lang.String r0 = "camera motion"
        L_0x00c9:
            r1.append(r0)
            goto L_0x0091
        L_0x00cd:
            java.lang.String r0 = "none"
            goto L_0x00c9
        L_0x00d0:
            java.lang.String r0 = "unknown"
            goto L_0x00c9
        L_0x00d3:
            java.lang.String r0 = "audio"
            goto L_0x00c9
        L_0x00d6:
            java.lang.String r0 = "video"
            goto L_0x00c9
        L_0x00d9:
            java.lang.String r0 = "text"
            goto L_0x00c9
        L_0x00dc:
            java.lang.String r0 = "video/mjpeg"
            goto L_0x0153
        L_0x00df:
            java.lang.String r0 = "video/mp43"
            goto L_0x0153
        L_0x00e2:
            java.lang.String r0 = "video/mp42"
            goto L_0x0153
        L_0x00e5:
            java.lang.String r0 = "video/avc"
            goto L_0x0153
        L_0x00e8:
            r0 = 4499(0x1193, float:6.304E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            goto L_0x00fe
        L_0x00ef:
            java.lang.String r9 = "audio/mp4a-latm"
            goto L_0x00fe
        L_0x00f2:
            r0 = 2669(0xa6d, float:3.74E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            goto L_0x00fe
        L_0x00f9:
            java.lang.String r9 = "audio/raw"
            goto L_0x00fe
        L_0x00fc:
            java.lang.String r9 = "audio/ac3"
        L_0x00fe:
            int r11 = r14.A03()
            int r10 = r14.A02()
            r0 = 6
            r14.A0P(r0)
            int r0 = r14.A03()
            int r8 = androidx.media3.common.util.Util.A00(r0)
            int r1 = X.Pxe.A06(r14)
            r0 = 0
            if (r1 <= 0) goto L_0x014b
            int r7 = r14.A03()
        L_0x011d:
            byte[] r6 = new byte[r7]
            r14.A0R(r6, r0, r7)
            X.SOW r1 = new X.SOW
            r1.<init>()
            r1.A01(r9)
            r1.A04 = r11
            r1.A0G = r10
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x013a
            if (r8 == 0) goto L_0x013a
            r1.A0C = r8
        L_0x013a:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x015f
            if (r7 <= 0) goto L_0x015f
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r6)
            r1.A0X = r0
            goto L_0x015f
        L_0x014b:
            r7 = 0
            goto L_0x011d
        L_0x014d:
            r0 = 1921(0x781, float:2.692E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x0153:
            X.SOW r1 = new X.SOW
            r1.<init>()
            r1.A0L = r8
            r1.A09 = r7
            r1.A01(r0)
        L_0x015f:
            X.SJM r0 = new X.SJM
            r0.<init>(r1)
            X.Xve r8 = new X.Xve
            r8.<init>(r0)
            goto L_0x002b
        L_0x016b:
            int r7 = r14.A02()
            r14.A0P(r1)
            int r6 = r14.A02()
            int r1 = r14.A02()
            r0 = 4
            r14.A0P(r0)
            r14.A02()
            r0 = 12
            r14.A0P(r0)
            X.Xvg r8 = new X.Xvg
            r8.<init>(r7, r6, r1)
            goto L_0x002b
        L_0x018d:
            int r9 = r14.A02()
            r0 = 12
            r14.A0P(r0)
            r14.A02()
            int r10 = r14.A02()
            int r11 = r14.A02()
            r0 = 4
            r14.A0P(r0)
            int r12 = r14.A02()
            int r13 = r14.A02()
            r14.A0P(r1)
            X.Xvh r8 = new X.Xvh
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x002b
        L_0x01b7:
            int r1 = X.Pxe.A06(r14)
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05
            java.lang.String r0 = r14.A0I(r0, r1)
            X.Xvf r8 = new X.Xvf
            r8.<init>(r0)
            goto L_0x002b
        L_0x01c8:
            com.google.common.collect.ImmutableList r1 = r5.build()
            X.Xvi r0 = new X.Xvi
            r0.<init>(r1, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22118Xvi.A00(X.SRd, int):X.Xvi");
    }

    public final Y92 A01(Class cls) {
        C249803kO it = this.A01.iterator();
        while (it.hasNext()) {
            Y92 y92 = (Y92) it.next();
            if (y92.getClass() == cls) {
                return y92;
            }
        }
        return null;
    }

    public C22118Xvi(ImmutableList immutableList, int i) {
        this.A00 = i;
        this.A01 = immutableList;
    }

    public final int getType() {
        return this.A00;
    }
}
