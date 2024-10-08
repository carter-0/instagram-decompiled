package X;

import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.ReverseNaturalOrdering;

/* renamed from: X.5pG  reason: invalid class name and case insensitive filesystem */
public final class C295985pG extends C265294Th implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r14 == null) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C295985pG(X.C264854Ro r12, X.C264484Qb r13, java.lang.String r14, int r15, int r16, int r17) {
        /*
            r11 = this;
            r0 = r16
            r11.<init>(r12, r15, r0)
            r2 = 0
            r3 = r17 & 7
            r4 = 4
            r0 = 1
            if (r3 == r4) goto L_0x000d
            r0 = 0
        L_0x000d:
            r11.A08 = r0
            X.3wB r1 = r11.A02
            int r6 = r1.A0H
            int r0 = r13.A00
            r0 = r0 ^ -1
            r6 = r6 & r0
            r5 = r6 & 1
            r0 = 0
            if (r5 == 0) goto L_0x001e
            r0 = 1
        L_0x001e:
            r11.A06 = r0
            r5 = r6 & 2
            r0 = 0
            if (r5 == 0) goto L_0x0026
            r0 = 1
        L_0x0026:
            r11.A07 = r0
            r10 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r7 = r13.A0K
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = ""
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r9 = X.AnonymousClass4R7.A00(r0)
        L_0x003d:
            r8 = 0
        L_0x003e:
            int r0 = r9.size()
            if (r8 >= r0) goto L_0x00b3
            java.lang.Object r5 = r9.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = r13.A0P
            int r6 = X.C264614Qo.A00(r1, r5, r0)
            if (r6 <= 0) goto L_0x00b0
            r10 = r8
        L_0x0053:
            r11.A00 = r10
            r11.A01 = r6
            int r8 = r1.A0E
            int r0 = r13.A0C
            if (r8 == 0) goto L_0x00aa
            if (r8 != r0) goto L_0x00aa
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0062:
            r11.A02 = r5
            r8 = r8 & 1088(0x440, float:1.525E-42)
            r0 = 0
            if (r8 == 0) goto L_0x006a
            r0 = 1
        L_0x006a:
            r11.A05 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "und"
            boolean r0 = android.text.TextUtils.equals(r14, r0)
            if (r0 != 0) goto L_0x007d
            r0 = 0
            if (r14 != 0) goto L_0x007e
        L_0x007d:
            r0 = 1
        L_0x007e:
            int r1 = X.C264614Qo.A00(r1, r14, r0)
            r11.A03 = r1
            if (r6 > 0) goto L_0x0098
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x008e
            if (r5 > 0) goto L_0x0098
        L_0x008e:
            boolean r0 = r11.A06
            if (r0 != 0) goto L_0x0098
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x00a8
            if (r1 <= 0) goto L_0x00a8
        L_0x0098:
            r1 = 1
        L_0x0099:
            boolean r0 = r13.A0D
            if (r3 == r4) goto L_0x00a2
            if (r0 == 0) goto L_0x00a5
            r0 = 3
            if (r3 != r0) goto L_0x00a5
        L_0x00a2:
            if (r1 == 0) goto L_0x00a5
            r2 = 1
        L_0x00a5:
            r11.A04 = r2
            return
        L_0x00a8:
            r1 = 0
            goto L_0x0099
        L_0x00aa:
            r0 = r0 & r8
            int r5 = java.lang.Integer.bitCount(r0)
            goto L_0x0062
        L_0x00b0:
            int r8 = r8 + 1
            goto L_0x003e
        L_0x00b3:
            r6 = 0
            goto L_0x0053
        L_0x00b5:
            r9 = r7
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C295985pG.<init>(X.4Ro, X.4Qb, java.lang.String, int, int, int):void");
    }

    public final int A00() {
        return this.A04;
    }

    /* renamed from: A02 */
    public final int compareTo(C295985pG r8) {
        C7280Q2f A032 = C7280Q2f.A00.A03(this.A08, r8.A08);
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(r8.A00);
        C264654Qt r6 = NaturalOrdering.A00;
        C264654Qt r5 = ReverseNaturalOrdering.A00;
        C7280Q2f A022 = A032.A02(valueOf, valueOf2, r5);
        int i = this.A01;
        C7280Q2f A012 = A022.A01(i, r8.A01);
        int i2 = this.A02;
        C7280Q2f A033 = A012.A01(i2, r8.A02).A03(this.A06, r8.A06);
        Boolean valueOf3 = Boolean.valueOf(this.A07);
        Boolean valueOf4 = Boolean.valueOf(r8.A07);
        if (i != 0) {
            r6 = r5;
        }
        C7280Q2f A013 = A033.A02(valueOf3, valueOf4, r6).A01(this.A03, r8.A03);
        if (i2 == 0) {
            A013 = A013.A04(this.A05, r8.A05);
        }
        return A013.A00();
    }

    public final /* bridge */ /* synthetic */ boolean A01(C265294Th r2) {
        return false;
    }
}
