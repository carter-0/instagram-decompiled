package X;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import java.util.List;

public final class SJM {
    public static final SJM A0c = Pxe.A0O(SOW.A00());
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final long A0O;
    public final SRQ A0P;
    public final DrmInitData A0Q;
    public final Metadata A0R;
    public final Object A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final List A0Z;
    public final List A0a;
    public final byte[] A0b;

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SJM sjm = (SJM) obj;
            int i2 = this.A00;
            if ((i2 == 0 || (i = sjm.A00) == 0 || i2 == i) && this.A0J == sjm.A0J && this.A0G == sjm.A0G && this.A04 == sjm.A04 && this.A0F == sjm.A0F && this.A0C == sjm.A0C && this.A0O == sjm.A0O && this.A0N == sjm.A0N && this.A0B == sjm.A0B && this.A0H == sjm.A0H && this.A0K == sjm.A0K && this.A06 == sjm.A06 && this.A0I == sjm.A0I && this.A0E == sjm.A0E && this.A09 == sjm.A09 && this.A0A == sjm.A0A && this.A03 == sjm.A03 && this.A0L == sjm.A0L && this.A0M == sjm.A0M && this.A07 == sjm.A07 && Float.compare(this.A01, sjm.A01) == 0 && Float.compare(this.A02, sjm.A02) == 0 && 2Ob.A00(this.A0V, sjm.A0V) && 2Ob.A00(this.A0W, sjm.A0W) && this.A0a.equals(sjm.A0a) && 2Ob.A00(this.A0T, sjm.A0T) && 2Ob.A00(this.A0U, sjm.A0U) && 2Ob.A00(this.A0Y, sjm.A0Y) && 2Ob.A00(this.A0X, sjm.A0X) && Arrays.equals(this.A0b, sjm.A0b) && 2Ob.A00(this.A0R, sjm.A0R) && 2Ob.A00(this.A0P, sjm.A0P) && 2Ob.A00(this.A0Q, sjm.A0Q)) {
                List list = this.A0Z;
                int size = list.size();
                List list2 = sjm.A0Z;
                if (size == list2.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < list.size()) {
                            if (!Arrays.equals((byte[]) list.get(i3), (byte[]) list2.get(i3))) {
                                break;
                            }
                            i3++;
                        } else if (2Ob.A00(this.A0S, sjm.A0S)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A002 = ((((((((((((((((((AnonymousClass7TF.A00((AnonymousClass7TF.A00((((((((((((((((((((((((((((((((((527 + AnonymousClass7TG.A0E(this.A0V)) * 31) + AnonymousClass7TG.A0E(this.A0W)) * 31) + this.A0a.hashCode()) * 31) + AnonymousClass7TG.A0E(this.A0X)) * 31) + this.A0J) * 31) + this.A0G) * 31) + this.A04) * 31) + this.A0F) * 31) + AnonymousClass7TG.A0E(this.A0T)) * 31) + AnonymousClass7TG.A0C(this.A0R)) * 31) + AnonymousClass7TG.A0C(this.A0S)) * 31) + AnonymousClass7TG.A0E(this.A0U)) * 31) + C41845B3m.A00(this.A0Y)) * 31) + this.A0C) * 31) + ((int) this.A0O)) * 31) + this.A0N) * 31) + this.A0B) * 31, this.A01) + this.A0H) * 31, this.A02) + this.A0K) * 31) + this.A06) * 31) + this.A0I) * 31) + this.A0E) * 31) + this.A09) * 31) + this.A0A) * 31) + this.A03) * 31) + this.A0L) * 31) + this.A0M) * 31) + this.A07;
        this.A00 = A002;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c9, code lost:
        if (r2 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SJM(X.SOW r6) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = r6.A0T
            r5.A0V = r0
            java.lang.String r0 = r6.A0V
            java.lang.String r4 = androidx.media3.common.util.Util.A09(r0)
            r5.A0X = r4
            java.util.List r3 = r6.A0Y
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00cf
            java.lang.String r1 = r6.A0U
            if (r1 == 0) goto L_0x00cf
            X.S45 r0 = new X.S45
            r0.<init>(r4, r1)
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r0)
        L_0x0024:
            r5.A0a = r3
            java.lang.String r0 = r6.A0U
        L_0x0028:
            r5.A0W = r0
            int r0 = r6.A0H
            r5.A0J = r0
            int r0 = r6.A0E
            r5.A0G = r0
            int r1 = r6.A03
            r5.A04 = r1
            int r0 = r6.A0D
            r5.A0F = r0
            r4 = -1
            if (r0 == r4) goto L_0x003e
            r1 = r0
        L_0x003e:
            r5.A05 = r1
            java.lang.String r0 = r6.A0R
            r5.A0T = r0
            androidx.media3.common.Metadata r0 = r6.A0P
            r5.A0R = r0
            java.lang.Object r0 = r6.A0Q
            r5.A0S = r0
            java.lang.String r0 = r6.A0S
            r5.A0U = r0
            java.lang.String r0 = r6.A0W
            r5.A0Y = r0
            int r0 = r6.A0A
            r5.A0C = r0
            int r0 = r6.A0B
            r5.A0D = r0
            java.util.List r0 = r6.A0X
            if (r0 != 0) goto L_0x0064
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0064:
            r5.A0Z = r0
            androidx.media3.common.DrmInitData r2 = r6.A0O
            r5.A0Q = r2
            long r0 = r6.A0M
            r5.A0O = r0
            int r0 = r6.A0L
            r5.A0N = r0
            int r0 = r6.A09
            r5.A0B = r0
            float r0 = r6.A00
            r5.A01 = r0
            int r0 = r6.A0F
            r3 = 0
            if (r0 != r4) goto L_0x0080
            r0 = 0
        L_0x0080:
            r5.A0H = r0
            float r1 = r6.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x008c:
            r5.A02 = r1
            byte[] r0 = r6.A0Z
            r5.A0b = r0
            int r0 = r6.A0I
            r5.A0K = r0
            X.SRQ r0 = r6.A0N
            r5.A0P = r0
            int r0 = r6.A04
            r5.A06 = r0
            int r0 = r6.A0G
            r5.A0I = r0
            int r0 = r6.A0C
            r5.A0E = r0
            int r0 = r6.A07
            if (r0 != r4) goto L_0x00ab
            r0 = 0
        L_0x00ab:
            r5.A09 = r0
            int r0 = r6.A08
            if (r0 == r4) goto L_0x00b2
            r3 = r0
        L_0x00b2:
            r5.A0A = r3
            int r0 = r6.A02
            r5.A03 = r0
            int r0 = r6.A06
            r5.A08 = r0
            int r0 = r6.A0J
            r5.A0L = r0
            int r0 = r6.A0K
            r5.A0M = r0
            int r1 = r6.A05
            if (r1 != 0) goto L_0x00cb
            r0 = 1
            if (r2 != 0) goto L_0x00cc
        L_0x00cb:
            r0 = r1
        L_0x00cc:
            r5.A07 = r0
            return
        L_0x00cf:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = r6.A0U
            if (r0 != 0) goto L_0x00fe
            r5.A0a = r3
            java.util.Iterator r2 = r3.iterator()
        L_0x00df:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r1 = r2.next()
            X.S45 r1 = (X.S45) r1
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L_0x00df
        L_0x00f3:
            java.lang.String r0 = r1.A01
            goto L_0x0028
        L_0x00f7:
            java.lang.Object r1 = X.AnonymousClass7TE.A13(r3)
            X.S45 r1 = (X.S45) r1
            goto L_0x00f3
        L_0x00fe:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = r6.A0U
            if (r0 != 0) goto L_0x010e
        L_0x0108:
            r0 = 1
        L_0x0109:
            X.C11366SPh.A02(r0)
            goto L_0x0024
        L_0x010e:
            r2 = 0
        L_0x010f:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x0128
            java.lang.Object r0 = r3.get(r2)
            X.S45 r0 = (X.S45) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r6.A0U
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0108
            int r2 = r2 + 1
            goto L_0x010f
        L_0x0128:
            r0 = 0
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SJM.<init>(X.SOW):void");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Format(");
        A1A.append(this.A0V);
        A1A.append(", ");
        A1A.append(this.A0W);
        A1A.append(", ");
        A1A.append(this.A0U);
        A1A.append(", ");
        A1A.append(this.A0Y);
        A1A.append(", ");
        A1A.append(this.A0T);
        A1A.append(", ");
        A1A.append(this.A05);
        A1A.append(", ");
        A1A.append(this.A0X);
        A1A.append(", [");
        A1A.append(this.A0N);
        A1A.append(", ");
        A1A.append(this.A0B);
        A1A.append(", ");
        A1A.append(this.A01);
        A1A.append(", ");
        A1A.append(this.A0P);
        A1A.append("], [");
        A1A.append(this.A06);
        A1A.append(", ");
        A1A.append(this.A0I);
        return AnonymousClass7TF.A0l("])", A1A);
    }
}
