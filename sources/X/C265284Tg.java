package X;

import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ReverseNaturalOrdering;

/* renamed from: X.4Tg  reason: invalid class name and case insensitive filesystem */
public final class C265284Tg extends C265294Th implements Comparable {
    public final int A00;
    public final C264484Qb A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        if ((r1 & 1) != 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r14.apply(r9) == false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C265284Tg(X.C264854Ro r12, X.C264484Qb r13, X.1UV r14, int r15, int r16, int r17, boolean r18) {
        /*
            r11 = this;
            r0 = r16
            r11.<init>(r12, r15, r0)
            r11.A01 = r13
            X.3wB r9 = r11.A02
            java.lang.String r1 = r9.A0V
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "und"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            r11.A0E = r1
            r3 = 0
            r4 = r17
            r7 = r17 & 7
            r1 = 4
            r0 = 1
            if (r7 == r1) goto L_0x0026
            r0 = 0
        L_0x0026:
            r11.A0H = r0
            r2 = 0
        L_0x0029:
            java.util.List r1 = r13.A0I
            int r0 = r1.size()
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r0) goto L_0x0043
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = X.C264614Qo.A00(r9, r0, r3)
            if (r0 > 0) goto L_0x0047
            int r2 = r2 + 1
            goto L_0x0029
        L_0x0043:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0 = 0
        L_0x0047:
            r11.A09 = r2
            r11.A0A = r0
            int r1 = r9.A0E
            int r0 = r13.A0B
            if (r1 == 0) goto L_0x00b4
            if (r1 != r0) goto L_0x00b4
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0056:
            r11.A0C = r0
            if (r1 == 0) goto L_0x005f
            r1 = r1 & 1
            r0 = 0
            if (r1 == 0) goto L_0x0060
        L_0x005f:
            r0 = 1
        L_0x0060:
            r11.A0F = r0
            int r0 = r9.A0H
            r1 = r0 & 1
            r0 = 0
            if (r1 == 0) goto L_0x006a
            r0 = 1
        L_0x006a:
            r11.A0G = r0
            int r1 = r9.A06
            r11.A06 = r1
            int r0 = r9.A0G
            r11.A0D = r0
            int r6 = r9.A05
            r11.A05 = r6
            r5 = -1
            if (r6 == r5) goto L_0x007f
            int r0 = r13.A01
            if (r6 > r0) goto L_0x008c
        L_0x007f:
            if (r1 == r5) goto L_0x0085
            int r0 = r13.A02
            if (r1 > r0) goto L_0x008c
        L_0x0085:
            boolean r1 = r14.apply(r9)
            r0 = 1
            if (r1 != 0) goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            r11.A02 = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            java.lang.String r1 = r0.toLanguageTags()
            java.lang.String r0 = ","
            java.lang.String[] r2 = r1.split(r0, r5)
            r1 = 0
        L_0x00a6:
            int r10 = r2.length
            if (r1 >= r10) goto L_0x00ba
            r0 = r2[r1]
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.A0C(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00b4:
            r0 = r0 & r1
            int r0 = java.lang.Integer.bitCount(r0)
            goto L_0x0056
        L_0x00ba:
            r1 = 0
        L_0x00bb:
            if (r1 >= r10) goto L_0x00c8
            r0 = r2[r1]
            int r0 = X.C264614Qo.A00(r9, r0, r3)
            if (r0 > 0) goto L_0x00cc
            int r1 = r1 + 1
            goto L_0x00bb
        L_0x00c8:
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = 0
        L_0x00cc:
            r11.A07 = r1
            r11.A08 = r0
            r10 = 0
        L_0x00d1:
            java.util.List r2 = r13.A0J
            int r0 = r2.size()
            if (r10 >= r0) goto L_0x00e8
            java.lang.String r1 = r9.A0W
            if (r1 == 0) goto L_0x0132
            java.lang.Object r0 = r2.get(r10)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0132
            r8 = r10
        L_0x00e8:
            r11.A0B = r8
            r2 = r4 & 384(0x180, float:5.38E-43)
            r1 = 128(0x80, float:1.794E-43)
            r0 = 0
            if (r2 != r1) goto L_0x00f2
            r0 = 1
        L_0x00f2:
            r11.A04 = r0
            r1 = r17 & 64
            r0 = 64
            if (r1 != r0) goto L_0x00fb
            r3 = 1
        L_0x00fb:
            r11.A03 = r3
            X.4Qb r4 = r11.A01
            boolean r0 = r4.A0D
            r3 = 4
            if (r7 == r3) goto L_0x0109
            if (r0 == 0) goto L_0x0130
            r0 = 3
            if (r7 != r0) goto L_0x0130
        L_0x0109:
            r0 = 1
        L_0x010a:
            r2 = 0
            if (r0 == 0) goto L_0x0115
            boolean r1 = r11.A02
            if (r1 != 0) goto L_0x0118
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0118
        L_0x0115:
            r11.A00 = r2
            return
        L_0x0118:
            if (r7 != r3) goto L_0x012e
            if (r1 == 0) goto L_0x012e
            if (r6 == r5) goto L_0x012e
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x012e
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x012e
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x012c
            if (r18 != 0) goto L_0x012e
        L_0x012c:
            r2 = 2
            goto L_0x0115
        L_0x012e:
            r2 = 1
            goto L_0x0115
        L_0x0130:
            r0 = 0
            goto L_0x010a
        L_0x0132:
            int r10 = r10 + 1
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C265284Tg.<init>(X.4Ro, X.4Qb, X.1UV, int, int, int, boolean):void");
    }

    /* renamed from: A02 */
    public final int compareTo(C265284Tg r8) {
        C264654Qt r6;
        C264654Qt A012;
        C264654Qt r0;
        boolean z = this.A02;
        if (!z || !this.A0H) {
            r6 = C264614Qo.A04;
            A012 = r6.A01();
        } else {
            r6 = C264614Qo.A04;
            A012 = r6;
        }
        C7280Q2f A032 = C7280Q2f.A00.A03(this.A0H, r8.A0H);
        Integer valueOf = Integer.valueOf(this.A09);
        Integer valueOf2 = Integer.valueOf(r8.A09);
        ReverseNaturalOrdering reverseNaturalOrdering = ReverseNaturalOrdering.A00;
        C7280Q2f A022 = A032.A02(valueOf, valueOf2, reverseNaturalOrdering).A01(this.A0A, r8.A0A).A01(this.A0C, r8.A0C).A03(this.A0G, r8.A0G).A03(this.A0F, r8.A0F).A02(Integer.valueOf(this.A07), Integer.valueOf(r8.A07), reverseNaturalOrdering).A01(this.A08, r8.A08).A03(z, r8.A02).A02(Integer.valueOf(this.A0B), Integer.valueOf(r8.A0B), reverseNaturalOrdering);
        Integer valueOf3 = Integer.valueOf(this.A05);
        Integer valueOf4 = Integer.valueOf(r8.A05);
        if (this.A01.A0O) {
            r0 = r6.A01();
        } else {
            r0 = C264614Qo.A05;
        }
        C7280Q2f A023 = A022.A02(valueOf3, valueOf4, r0).A03(this.A04, r8.A04).A03(this.A03, r8.A03).A02(Integer.valueOf(this.A06), Integer.valueOf(r8.A06), A012).A02(Integer.valueOf(this.A0D), Integer.valueOf(r8.A0D), A012);
        if (!Util.A0I(this.A0E, r8.A0E)) {
            A012 = C264614Qo.A05;
        }
        return A023.A02(valueOf3, valueOf4, A012).A00();
    }
}
