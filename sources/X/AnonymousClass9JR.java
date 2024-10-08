package X;

/* renamed from: X.9JR  reason: invalid class name */
public final class AnonymousClass9JR implements AnonymousClass2WY {
    public final int A00;
    public final long A01;
    public final Object A02;

    public AnonymousClass9JR(Integer num, int i, long j) {
        this.A00 = i;
        this.A02 = num;
        this.A01 = j;
    }

    public static 2WX A00(2WX r2, Integer num, int i, long j) {
        return new 2WX(r2, new AnonymousClass9JR(num, i, j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a9, code lost:
        r7.E1a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c7, code lost:
        r7.A0T(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ca, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f9, code lost:
        r7.A0U(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0105, code lost:
        r7.A0V(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0108, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ABy(X.2TC r7, X.2V1 r8) {
        /*
            r6 = this;
            int r3 = r6.A00
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            long r1 = r6.A01
            X.2V4 r0 = r8.A0D
            X.0qQ.A07(r0)
            switch(r3) {
                case 0: goto L_0x0067;
                case 1: goto L_0x00cb;
                default: goto L_0x0014;
            }
        L_0x0014:
            int r4 = X.2Wd.A00(r0, r1)
            java.lang.Object r0 = r6.A02
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x0027;
                case 2: goto L_0x002a;
                case 3: goto L_0x002d;
                case 4: goto L_0x0030;
                case 5: goto L_0x0033;
                case 6: goto L_0x0036;
                case 7: goto L_0x0039;
                case 8: goto L_0x003c;
                case 9: goto L_0x0058;
                default: goto L_0x0023;
            }
        L_0x0023:
            return
        L_0x0024:
            X.3ai r3 = X.C244143ai.START
            goto L_0x003e
        L_0x0027:
            X.3ai r3 = X.C244143ai.TOP
            goto L_0x003e
        L_0x002a:
            X.3ai r3 = X.C244143ai.END
            goto L_0x003e
        L_0x002d:
            X.3ai r3 = X.C244143ai.BOTTOM
            goto L_0x003e
        L_0x0030:
            X.3ai r3 = X.C244143ai.LEFT
            goto L_0x003e
        L_0x0033:
            X.3ai r3 = X.C244143ai.RIGHT
            goto L_0x003e
        L_0x0036:
            X.3ai r3 = X.C244143ai.HORIZONTAL
            goto L_0x003e
        L_0x0039:
            X.3ai r3 = X.C244143ai.VERTICAL
            goto L_0x003e
        L_0x003c:
            X.3ai r3 = X.C244143ai.ALL
        L_0x003e:
            X.3Zj r2 = X.2TC.A01(r7)
            int r0 = r2.A02
            r0 = r0 | 256(0x100, float:3.59E-43)
            r2.A02 = r0
            X.2Tn r1 = r2.A07
            if (r1 != 0) goto L_0x0051
            X.2Tn r1 = new X.2Tn
            r1.<init>()
        L_0x0051:
            float r0 = (float) r4
            r1.A03(r3, r0)
            r2.A07 = r1
            return
        L_0x0058:
            float r5 = (float) r4
            X.2TG r4 = X.2TC.A02(r7)
            long r2 = r4.A0F
            r0 = 16384(0x4000, double:8.0948E-320)
            long r2 = r2 | r0
            r4.A0F = r2
            r4.A05 = r5
            return
        L_0x0067:
            int r1 = X.2Wd.A00(r0, r1)
            java.lang.Object r0 = r6.A02
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0077;
                case 1: goto L_0x007b;
                case 2: goto L_0x007f;
                case 3: goto L_0x0083;
                case 4: goto L_0x0087;
                case 5: goto L_0x008b;
                case 6: goto L_0x008f;
                case 7: goto L_0x0092;
                case 8: goto L_0x0095;
                case 9: goto L_0x0098;
                case 10: goto L_0x009b;
                case 11: goto L_0x009e;
                case 12: goto L_0x00a1;
                case 13: goto L_0x00a4;
                case 14: goto L_0x00a7;
                case 15: goto L_0x00ad;
                case 16: goto L_0x00b0;
                case 17: goto L_0x00b3;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b9;
                case 20: goto L_0x00bc;
                case 21: goto L_0x00bf;
                case 22: goto L_0x00c2;
                case 23: goto L_0x00c5;
                default: goto L_0x0076;
            }
        L_0x0076:
            return
        L_0x0077:
            r7.A0L(r1)
            return
        L_0x007b:
            r7.A0F(r1)
            return
        L_0x007f:
            r7.A0K(r1)
            return
        L_0x0083:
            r7.A0I(r1)
            return
        L_0x0087:
            r7.A0J(r1)
            return
        L_0x008b:
            r7.A0H(r1)
            return
        L_0x008f:
            X.3ai r0 = X.C244143ai.START
            goto L_0x00a9
        L_0x0092:
            X.3ai r0 = X.C244143ai.TOP
            goto L_0x00a9
        L_0x0095:
            X.3ai r0 = X.C244143ai.END
            goto L_0x00a9
        L_0x0098:
            X.3ai r0 = X.C244143ai.BOTTOM
            goto L_0x00a9
        L_0x009b:
            X.3ai r0 = X.C244143ai.LEFT
            goto L_0x00a9
        L_0x009e:
            X.3ai r0 = X.C244143ai.RIGHT
            goto L_0x00a9
        L_0x00a1:
            X.3ai r0 = X.C244143ai.HORIZONTAL
            goto L_0x00a9
        L_0x00a4:
            X.3ai r0 = X.C244143ai.VERTICAL
            goto L_0x00a9
        L_0x00a7:
            X.3ai r0 = X.C244143ai.ALL
        L_0x00a9:
            r7.E1a(r0, r1)
            return
        L_0x00ad:
            X.3ai r0 = X.C244143ai.START
            goto L_0x00c7
        L_0x00b0:
            X.3ai r0 = X.C244143ai.TOP
            goto L_0x00c7
        L_0x00b3:
            X.3ai r0 = X.C244143ai.END
            goto L_0x00c7
        L_0x00b6:
            X.3ai r0 = X.C244143ai.BOTTOM
            goto L_0x00c7
        L_0x00b9:
            X.3ai r0 = X.C244143ai.LEFT
            goto L_0x00c7
        L_0x00bc:
            X.3ai r0 = X.C244143ai.RIGHT
            goto L_0x00c7
        L_0x00bf:
            X.3ai r0 = X.C244143ai.HORIZONTAL
            goto L_0x00c7
        L_0x00c2:
            X.3ai r0 = X.C244143ai.VERTICAL
            goto L_0x00c7
        L_0x00c5:
            X.3ai r0 = X.C244143ai.ALL
        L_0x00c7:
            r7.A0T(r0, r1)
            return
        L_0x00cb:
            int r1 = X.2Wd.A00(r0, r1)
            java.lang.Object r0 = r6.A02
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00df;
                case 2: goto L_0x00e2;
                case 3: goto L_0x00e8;
                case 4: goto L_0x00e5;
                case 5: goto L_0x00eb;
                case 6: goto L_0x00ee;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00f4;
                case 9: goto L_0x00f7;
                case 10: goto L_0x00fd;
                case 11: goto L_0x0100;
                case 12: goto L_0x0103;
                default: goto L_0x00da;
            }
        L_0x00da:
            return
        L_0x00db:
            r7.A0E(r1)
            return
        L_0x00df:
            X.3ai r0 = X.C244143ai.ALL
            goto L_0x00f9
        L_0x00e2:
            X.3ai r0 = X.C244143ai.START
            goto L_0x00f9
        L_0x00e5:
            X.3ai r0 = X.C244143ai.END
            goto L_0x00f9
        L_0x00e8:
            X.3ai r0 = X.C244143ai.TOP
            goto L_0x00f9
        L_0x00eb:
            X.3ai r0 = X.C244143ai.BOTTOM
            goto L_0x00f9
        L_0x00ee:
            X.3ai r0 = X.C244143ai.LEFT
            goto L_0x00f9
        L_0x00f1:
            X.3ai r0 = X.C244143ai.RIGHT
            goto L_0x00f9
        L_0x00f4:
            X.3ai r0 = X.C244143ai.HORIZONTAL
            goto L_0x00f9
        L_0x00f7:
            X.3ai r0 = X.C244143ai.VERTICAL
        L_0x00f9:
            r7.A0U(r0, r1)
            return
        L_0x00fd:
            X.9sB r0 = X.C390999sB.COLUMN
            goto L_0x0105
        L_0x0100:
            X.9sB r0 = X.C390999sB.ROW
            goto L_0x0105
        L_0x0103:
            X.9sB r0 = X.C390999sB.ALL
        L_0x0105:
            r7.A0V(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9JR.ABy(X.2TC, X.2V1):void");
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!(obj instanceof AnonymousClass9JR)) {
            return false;
        }
        AnonymousClass9JR r6 = (AnonymousClass9JR) obj;
        if (r6.A00 == i && this.A02 == r6.A02 && this.A01 == r6.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String A002;
        int i = this.A00;
        Integer num = (Integer) this.A02;
        switch (i) {
            case 0:
                A002 = RVY.A00(num);
                break;
            case 1:
                A002 = C392989vi.A00(num);
                break;
            default:
                A002 = C392999vj.A00(num);
                break;
        }
        long j = this.A01;
        return ((A002.hashCode() + num.intValue()) * 31) + ((int) (j ^ (j >>> 32)));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r3 = this;
            int r0 = r3.A00
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            switch(r0) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0034;
                default: goto L_0x0007;
            }
        L_0x0007:
            r2.<init>()
            java.lang.String r0 = "DimenStyleItem(field="
            r2.append(r0)
            java.lang.Object r0 = r3.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = X.C392999vj.A00(r0)
        L_0x0019:
            r2.append(r0)
            java.lang.String r0 = ", value="
            r2.append(r0)
            long r0 = r3.A01
            java.lang.String r0 = X.2Wd.A04(r0)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0034:
            r2.<init>()
            java.lang.String r0 = "FlexboxDimenStyleItem(field="
            r2.append(r0)
            java.lang.Object r0 = r3.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = X.C392989vi.A00(r0)
            goto L_0x0019
        L_0x0047:
            r2.<init>()
            java.lang.String r0 = "CoreDimenStyleItem(field="
            r2.append(r0)
            java.lang.Object r0 = r3.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = X.RVY.A00(r0)
            goto L_0x0019
        L_0x005a:
            java.lang.String r0 = "null"
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9JR.toString():java.lang.String");
    }
}
