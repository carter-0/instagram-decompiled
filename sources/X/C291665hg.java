package X;

import java.util.List;

/* renamed from: X.5hg  reason: invalid class name and case insensitive filesystem */
public final class C291665hg {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = (0 << 32);
    public long A04 = AnonymousClass5SF.A05(0, 0, 0, 0);
    public C55997Hr3 A05;
    public C292055iK A06;
    public C291845hy A07;
    public AnonymousClass5Z4 A08;
    public C286305Uu A09;
    public C268024cd A0A;
    public AnonymousClass5Q8 A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public int A0F = -1;
    public int A0G = -1;
    public long A0H = C291675hh.A00;

    public static final void A02(C291665hg r4) {
        r4.A06 = null;
        r4.A07 = null;
        r4.A0B = null;
        r4.A0G = -1;
        r4.A0F = -1;
        r4.A04 = AnonymousClass5SF.A05(0, 0, 0, 0);
        r4.A03 = 0 << 32;
        r4.A0D = false;
    }

    public static final C291845hy A01(C291665hg r8, AnonymousClass5Q8 r9) {
        C291845hy r1 = r8.A07;
        if (r1 == null || r9 != r8.A0B || r1.BC8()) {
            r8.A0B = r9;
            String str = r8.A0C;
            AnonymousClass5Z4 A002 = C291695hj.A00(r8.A08, r9);
            C268024cd r4 = r8.A0A;
            0qQ.A0A(r4);
            C286305Uu r3 = r8.A09;
            List list = 0sn.A00;
            r1 = new C291835hx(A002, r3, r4, str, list, list);
        }
        r8.A07 = r1;
        return r1;
    }

    public final int A03(AnonymousClass5Q8 r4, int i) {
        int i2 = this.A0G;
        int i3 = this.A0F;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int A002 = AnonymousClass5iI.A00(A00(this, r4, AnonymousClass5SF.A04(0, i, 0, Integer.MAX_VALUE)).BCs());
        this.A0G = i;
        this.A0F = A002;
        return A002;
    }

    public final void A04(C268024cd r8) {
        long j;
        C268024cd r2 = this.A0A;
        if (r8 != null) {
            long j2 = C291675hh.A00;
            float AwL = r8.AwL();
            float B77 = r8.B77();
            long floatToRawIntBits = (long) Float.floatToRawIntBits(AwL);
            j = (((long) Float.floatToRawIntBits(B77)) & 4294967295L) | (floatToRawIntBits << 32);
        } else {
            j = C291675hh.A00;
        }
        if (r2 == null) {
            this.A0A = r8;
            this.A0H = j;
        } else if (r8 == null || this.A0H != j) {
            this.A0A = r8;
            this.A0H = j;
            A02(this);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphLayoutCache(paragraph=");
        if (this.A06 != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", lastDensity=");
        long j = this.A0H;
        long j2 = C291675hh.A00;
        sb.append(002.A0U("InlineDensity(density=", ", fontScale=", ')', Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))));
        sb.append(')');
        return sb.toString();
    }

    public C291665hg(AnonymousClass5Z4 r4, C286305Uu r5, String str, int i, int i2, int i3, boolean z) {
        this.A0C = str;
        this.A08 = r4;
        this.A09 = r5;
        this.A02 = i;
        this.A0E = z;
        this.A00 = i2;
        this.A01 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r2 == 2) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C292045iJ A00(X.C291665hg r4, X.AnonymousClass5Q8 r5, long r6) {
        /*
            X.5hy r3 = A01(r4, r5)
            boolean r2 = r4.A0E
            int r1 = r4.A02
            float r0 = r3.BP9()
            long r5 = X.C292035iH.A00(r0, r1, r6, r2)
            boolean r0 = r4.A0E
            int r2 = r4.A02
            int r1 = r4.A00
            r4 = 1
            if (r0 != 0) goto L_0x0025
            r0 = 2
            if (r2 != r0) goto L_0x0025
        L_0x001c:
            r7 = 1
        L_0x001d:
            X.5hx r3 = (X.C291835hx) r3
            X.5iJ r2 = new X.5iJ
            r2.<init>(r3, r4, r5, r7)
            return r2
        L_0x0025:
            if (r1 >= r4) goto L_0x0028
            r1 = 1
        L_0x0028:
            r4 = r1
            r0 = 2
            r7 = 0
            if (r2 != r0) goto L_0x001d
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291665hg.A00(X.5hg, X.5Q8, long):X.5iJ");
    }
}
