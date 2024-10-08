package X;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3x7  reason: invalid class name and case insensitive filesystem */
public final class C257263x7 {
    public static final C257263x7 A0B = new C257263x7(Uri.parse("www.facebook.com"), 0, -1);
    public final int A00;
    public final int A01;
    @Deprecated
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Uri A06;
    public final C257253x6 A07;
    public final String A08;
    public final Map A09;
    public final byte[] A0A;

    static {
        27e.A00("goog.exo.datasource");
    }

    public final C257263x7 A00(long j, long j2) {
        long j3 = j2;
        if (j == 0 && this.A03 == j2) {
            return this;
        }
        Uri uri = this.A06;
        long j4 = this.A05;
        int i = this.A01;
        byte[] bArr = this.A0A;
        Map map = this.A09;
        String str = this.A08;
        int i2 = this.A00;
        C257253x6 r13 = this.A07;
        String str2 = r13.A0N;
        String str3 = r13.A0M;
        long j5 = r13.A0A;
        boolean z = r13.A0T;
        int i3 = r13.A08;
        int i4 = r13.A07;
        int i5 = r13.A00;
        int i6 = r13.A09;
        boolean z2 = r13.A0V;
        boolean z3 = r13.A0S;
        int i7 = r13.A05;
        long j6 = r13.A0C;
        C257223x3 r30 = r13.A0I;
        long j7 = r13.A0F;
        boolean z4 = r13.A0U;
        int i8 = r13.A06;
        int i9 = r13.A02;
        long j8 = r13.A0E;
        long j9 = r13.A0B;
        int i10 = r13.A01;
        Map map2 = r13.A0Q;
        int i11 = r13.A04;
        String str4 = r13.A0K;
        String str5 = r13.A0J;
        C257243x5 r19 = r13.A0H;
        int i12 = r13.A03;
        boolean z5 = r13.A0R;
        boolean z6 = z4;
        boolean z7 = z5;
        C257243x5 r17 = r19;
        C257223x3 r18 = r30;
        String str6 = str3;
        return new C257263x7(uri, new C257253x6(r17, r18, str6, str4, str5, r13.A0O, r13.A0L, r13.A0P, str2, map2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, j5, j6, j7, j8, j9, -1, -1, z, z2, z3, z6, z7), str, map, bArr, i, i2, j4, this.A04 + j, j3);
    }

    public final void A01(Map map) {
        Map map2 = this.A07.A0Q;
        map2.clear();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("DataSpec[");
        int i = this.A01;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else if (i == 3) {
            str = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.A06);
        sb.append(", ");
        sb.append(this.A04);
        sb.append(", ");
        sb.append(this.A03);
        sb.append(", ");
        sb.append(this.A08);
        sb.append(", ");
        sb.append(this.A00);
        sb.append(", ");
        C257253x6 r0 = this.A07;
        sb.append(r0);
        sb.append(", ");
        sb.append(r0.A0Q);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C257263x7(android.net.Uri r51, int r52, int r53) {
        /*
            r50 = this;
            java.util.Map r40 = java.util.Collections.emptyMap()
            X.3x3 r2 = new X.3x3
            r2.<init>()
            X.3x5 r1 = X.C257243x5.A02
            java.lang.String r3 = ""
            r21 = -1
            r35 = 0
            r11 = -1
            r4 = 0
            X.3x6 r0 = new X.3x6
            r15 = r53
            r5 = r4
            r6 = r4
            r7 = r3
            r8 = r3
            r9 = r4
            r10 = r4
            r12 = r11
            r13 = r11
            r14 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r23 = r21
            r25 = r21
            r27 = r21
            r29 = r21
            r31 = r21
            r33 = r21
            r36 = r35
            r37 = r35
            r38 = r35
            r39 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r29, r31, r33, r35, r36, r37, r38, r39)
            r44 = 0
            r42 = 1
            r36 = r50
            r37 = r51
            r43 = r52
            r38 = r0
            r39 = r4
            r41 = r4
            r46 = r44
            r48 = r21
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r46, r48)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C257263x7.<init>(android.net.Uri, int, int):void");
    }

    public C257263x7(Uri uri, C257253x6 r15, String str, Map map, byte[] bArr, int i, int i2, long j, long j2, long j3) {
        byte[] bArr2 = bArr;
        long j4 = j2;
        long j5 = j;
        long j6 = j + j2;
        boolean z = true;
        C256703wD.A03(j6 >= 0);
        C256703wD.A03(j2 >= 0);
        long j7 = j3;
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C256703wD.A03(z);
        this.A06 = uri;
        this.A05 = j5;
        this.A01 = i;
        this.A0A = (bArr == null || bArr2.length == 0) ? null : bArr2;
        this.A09 = Collections.unmodifiableMap(new HashMap(map));
        this.A04 = j4;
        this.A02 = j6;
        this.A03 = j7;
        this.A08 = str;
        this.A00 = i2;
        this.A07 = r15;
    }
}
