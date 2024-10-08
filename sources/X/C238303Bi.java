package X;

/* renamed from: X.3Bi  reason: invalid class name and case insensitive filesystem */
public final class C238303Bi {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C238293Bh A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;
    public final String A08;
    public final /* synthetic */ 1Pp A09;

    public C238303Bi(1Pp r1, String str) {
        this.A09 = r1;
        this.A08 = str;
    }

    public static void A01(C238293Bh r7, C238303Bi r8, long j) {
        int i;
        int[] iArr;
        if (r8.A05) {
            long j2 = j - r8.A02;
            C238293Bh r5 = r8.A04;
            C238293Bh r4 = C238293Bh.LoadingData;
            if (r5 == r4 || r5 == C238293Bh.FailedToLoad || r5 == C238293Bh.ContentIsNotAvailable) {
                r8.A03 += j2;
            }
            if (r5 == r4) {
                if (r7 != C238293Bh.ShowingData) {
                    r8.A01++;
                    int i2 = r8.A00;
                    if (i2 > 0) {
                        if (i2 <= 10) {
                            iArr = r8.A06;
                            i = i2 - 1;
                        } else {
                            int[] iArr2 = r8.A06;
                            iArr2[9] = iArr2[9] + 1;
                        }
                    }
                    r8.A00 = 0;
                } else {
                    if (j2 > 10) {
                        double d = ((double) j2) / 10.0d;
                        i = 0;
                        while (d > 1.0d && i < 12) {
                            d /= 2.0d;
                            i++;
                        }
                    } else {
                        i = 0;
                    }
                    iArr = r8.A07;
                }
                iArr[i] = iArr[i] + 1;
                r8.A00 = 0;
            }
        }
        r8.A02 = j;
    }

    public static void A00(17Z r6, C238303Bi r7) {
        r6.A0c();
        r6.A0R("category", r7.A08);
        r6.A0Q(AnonymousClass000.A00(4214), r7.A03);
        int i = 0;
        do {
            int[] iArr = r7.A07;
            if (iArr[i] != 0) {
                r6.A0P(1Pp.A03[i], iArr[i]);
            }
            i++;
        } while (i < 13);
        int i2 = 0;
        do {
            int[] iArr2 = r7.A06;
            if (iArr2[i2] != 0) {
                r6.A0P(1Pp.A04[i2], iArr2[i2]);
            }
            i2++;
        } while (i2 < 10);
        int i3 = r7.A01;
        if (i3 > 0) {
            r6.A0P("not_loaded_count", i3);
        }
        r6.A0Z();
        r7.A03 = 0;
        r7.A01 = 0;
        r7.A07 = new int[13];
        r7.A06 = new int[10];
    }
}
