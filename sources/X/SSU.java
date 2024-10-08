package X;

import java.util.Iterator;
import java.util.Map;

public final class SSU {
    public static final SSU A03 = new SSU(true);
    public boolean A00;
    public boolean A01;
    public final TS4 A02;

    public SSU(boolean z) {
        R5f r5f = new R5f(0);
        this.A02 = r5f;
        if (!this.A01) {
            r5f.A05();
            this.A01 = true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r0 >= 0) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r0 = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        r2.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r4.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        r2.A0H((X.TAP) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
        r2.A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b8, code lost:
        r2.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bb, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.google.protobuf.CodedOutputStream r2, X.C8915RFi r3, java.lang.Object r4, int r5) {
        /*
            X.RFi r0 = X.C8915RFi.A07
            if (r3 != r0) goto L_0x0016
            X.T5J r4 = (X.T5J) r4
            int r1 = r5 << 3
            r0 = r1 | 3
            r2.A07(r0)
            r4.A0F(r2)
            r0 = r1 | 4
        L_0x0012:
            r2.A07(r0)
            return
        L_0x0016:
            int r1 = r3.A00
            int r0 = r5 << 3
            r0 = r0 | r1
            r2.A07(r0)
            int[] r0 = X.C10016RlB.A00
            int r0 = X.Pxe.A08(r3, r0)
            switch(r0) {
                case 1: goto L_0x0056;
                case 2: goto L_0x005b;
                case 3: goto L_0x0028;
                case 4: goto L_0x0028;
                case 5: goto L_0x0051;
                case 6: goto L_0x00b4;
                case 7: goto L_0x00ac;
                case 8: goto L_0x0064;
                case 9: goto L_0x006d;
                case 10: goto L_0x0070;
                case 11: goto L_0x007d;
                case 12: goto L_0x0087;
                case 13: goto L_0x0032;
                case 14: goto L_0x00ac;
                case 15: goto L_0x00b4;
                case 16: goto L_0x0037;
                case 17: goto L_0x002d;
                case 18: goto L_0x0040;
                default: goto L_0x0027;
            }
        L_0x0027:
            return
        L_0x0028:
            long r0 = X.AnonymousClass7TE.A0R(r4)
            goto L_0x004d
        L_0x002d:
            long r0 = X.Pxh.A0G(r4)
            goto L_0x004d
        L_0x0032:
            int r0 = X.AnonymousClass7TE.A0M(r4)
            goto L_0x0012
        L_0x0037:
            int r0 = X.AnonymousClass7TE.A0M(r4)
            int r0 = X.Pxe.A02(r0)
            goto L_0x0012
        L_0x0040:
            boolean r0 = r4 instanceof X.C13660TeR
            if (r0 == 0) goto L_0x0051
            X.TeR r4 = (X.C13660TeR) r4
            int r0 = r4.BXO()
        L_0x004a:
            if (r0 >= 0) goto L_0x0012
            long r0 = (long) r0
        L_0x004d:
            r2.A0F(r0)
            return
        L_0x0051:
            int r0 = X.AnonymousClass7TE.A0M(r4)
            goto L_0x004a
        L_0x0056:
            long r0 = X.Pxg.A0G(r4)
            goto L_0x00b8
        L_0x005b:
            float r0 = X.AnonymousClass7TE.A04(r4)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            goto L_0x00b0
        L_0x0064:
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            byte r0 = (byte) r0
            r2.A05(r0)
            return
        L_0x006d:
            X.T5J r4 = (X.T5J) r4
            goto L_0x0079
        L_0x0070:
            X.T5J r4 = (X.T5J) r4
            int r0 = r4.A0E()
            r2.A07(r0)
        L_0x0079:
            r4.A0F(r2)
            return
        L_0x007d:
            boolean r0 = r4 instanceof X.TAP
            if (r0 != 0) goto L_0x00a6
            java.lang.String r4 = (java.lang.String) r4
            r2.A0I(r4)
            return
        L_0x0087:
            boolean r0 = r4 instanceof X.TAP
            if (r0 != 0) goto L_0x00a6
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            boolean r0 = r2 instanceof X.R3C
            if (r0 == 0) goto L_0x009c
            X.R3C r2 = (X.R3C) r2
            r0 = 0
            r2.A07(r1)
            r2.A0N(r4, r0, r1)
            return
        L_0x009c:
            X.R3B r2 = (X.R3B) r2
            r0 = 0
            r2.A07(r1)
            r2.A0K(r4, r0, r1)
            return
        L_0x00a6:
            X.TAP r4 = (X.TAP) r4
            r2.A0H(r4)
            return
        L_0x00ac:
            int r0 = X.AnonymousClass7TE.A0M(r4)
        L_0x00b0:
            r2.A06(r0)
            return
        L_0x00b4:
            long r0 = X.AnonymousClass7TE.A0R(r4)
        L_0x00b8:
            r2.A0E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSU.A01(com.google.protobuf.CodedOutputStream, X.RFi, java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Iterable entrySet;
        Map.Entry A1J;
        SSU ssu = new SSU();
        TS4 ts4 = this.A02;
        if (0 < ts4.A00.size()) {
            A1J = (Map.Entry) ts4.A00.get(0);
        } else {
            if (ts4.A01.isEmpty()) {
                entrySet = C10098Rma.A00;
            } else {
                entrySet = ts4.A01.entrySet();
            }
            Iterator it = entrySet.iterator();
            if (it.hasNext()) {
                A1J = AnonymousClass7TE.A1J(it);
            } else {
                ssu.A00 = this.A00;
                return ssu;
            }
        }
        A1J.getKey();
        A1J.getValue();
        throw AnonymousClass7TE.A11("isRepeated");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SSU)) {
            return false;
        }
        return this.A02.equals(((SSU) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0 >= 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A00(r1) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r1 = ((X.TAP) r4).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        return r2 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C8915RFi r3, java.lang.Object r4, int r5) {
        /*
            int r2 = X.SQE.A05(r5)
            X.RFi r0 = X.C8915RFi.A07
            if (r3 != r0) goto L_0x000a
            int r2 = r2 * 2
        L_0x000a:
            int[] r0 = X.C10016RlB.A00
            int r0 = X.Pxe.A08(r3, r0)
            switch(r0) {
                case 1: goto L_0x004b;
                case 2: goto L_0x004e;
                case 3: goto L_0x0081;
                case 4: goto L_0x0081;
                case 5: goto L_0x0030;
                case 6: goto L_0x004b;
                case 7: goto L_0x004e;
                case 8: goto L_0x007f;
                case 9: goto L_0x0078;
                case 10: goto L_0x001a;
                case 11: goto L_0x0059;
                case 12: goto L_0x0064;
                case 13: goto L_0x0050;
                case 14: goto L_0x004e;
                case 15: goto L_0x004b;
                case 16: goto L_0x0035;
                case 17: goto L_0x0042;
                case 18: goto L_0x0021;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.String r0 = "There is no way to get here, but the compiler thinks otherwise."
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x001a:
            X.T5J r4 = (X.T5J) r4
            int r1 = r4.A0E()
            goto L_0x006b
        L_0x0021:
            boolean r0 = r4 instanceof X.C13660TeR
            if (r0 == 0) goto L_0x0030
            X.TeR r4 = (X.C13660TeR) r4
            int r0 = r4.BXO()
        L_0x002b:
            if (r0 >= 0) goto L_0x003d
            r0 = 10
            goto L_0x0089
        L_0x0030:
            int r0 = X.AnonymousClass7TE.A0M(r4)
            goto L_0x002b
        L_0x0035:
            int r0 = X.AnonymousClass7TE.A0M(r4)
            int r0 = X.Pxe.A02(r0)
        L_0x003d:
            int r0 = com.google.protobuf.CodedOutputStream.A00(r0)
            goto L_0x0089
        L_0x0042:
            long r0 = X.Pxh.A0G(r4)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0089
        L_0x004b:
            r0 = 8
            goto L_0x0089
        L_0x004e:
            r0 = 4
            goto L_0x0089
        L_0x0050:
            int r0 = X.AnonymousClass7TE.A0M(r4)
            int r0 = com.google.protobuf.CodedOutputStream.A00(r0)
            goto L_0x0089
        L_0x0059:
            boolean r0 = r4 instanceof X.TAP
            if (r0 != 0) goto L_0x0071
            java.lang.String r4 = (java.lang.String) r4
            int r0 = com.google.protobuf.CodedOutputStream.A02(r4)
            goto L_0x0089
        L_0x0064:
            boolean r0 = r4 instanceof X.TAP
            if (r0 != 0) goto L_0x0071
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
        L_0x006b:
            int r0 = com.google.protobuf.CodedOutputStream.A00(r1)
            int r0 = r0 + r1
            goto L_0x0089
        L_0x0071:
            X.TAP r4 = (X.TAP) r4
            int r1 = r4.A02()
            goto L_0x006b
        L_0x0078:
            X.T5J r4 = (X.T5J) r4
            int r0 = r4.A0E()
            goto L_0x0089
        L_0x007f:
            r0 = 1
            goto L_0x0089
        L_0x0081:
            long r0 = X.AnonymousClass7TE.A0R(r4)
            int r0 = com.google.protobuf.CodedOutputStream.A01(r0)
        L_0x0089:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSU.A00(X.RFi, java.lang.Object, int):int");
    }

    public SSU() {
        this.A02 = new R5f(16);
    }
}
