package X;

import com.instagram.model.keyword.Keyword;

/* renamed from: X.Mn4  reason: case insensitive filesystem */
public final class C67387Mn4 extends C66942Mfb {
    public int A00;
    public Keyword A01;
    public CharSequence A02;
    public boolean A03;

    public C67387Mn4() {
        super(4);
        this.A01 = new Keyword((Double) null, (String) null, "", (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, false);
        this.A02 = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.String r19, boolean r20) {
        /*
            r18 = this;
            r15 = r18
            com.instagram.model.keyword.Keyword r0 = r15.A01
            java.lang.String r14 = r0.A04
            r3 = 0
            X.0qQ.A0B(r14, r3)
            r4 = r19
            int r5 = r4.length()
            r13 = 0
            if (r5 == 0) goto L_0x013a
            X.11S r0 = X.C67453Mo8.A02
            boolean r0 = r0.A08(r14)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x013a
            android.text.SpannableString r12 = new android.text.SpannableString
            r12.<init>(r14)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.0qQ.A07(r0)
            java.lang.String r0 = r14.toLowerCase(r0)
            X.0qQ.A07(r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            r17 = 1
            int r5 = r5 - r17
            r9 = 0
            r2 = 0
            r6 = 0
        L_0x0041:
            if (r2 > r5) goto L_0x0063
            r0 = r5
            if (r6 != 0) goto L_0x0047
            r0 = r2
        L_0x0047:
            char r1 = r4.charAt(r0)
            r0 = 32
            int r1 = X.0qQ.A00(r1, r0)
            r0 = 0
            if (r1 > 0) goto L_0x0055
            r0 = 1
        L_0x0055:
            if (r6 != 0) goto L_0x005e
            if (r0 != 0) goto L_0x005b
            r6 = 1
            goto L_0x0041
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x0041
        L_0x005e:
            if (r0 == 0) goto L_0x0063
            int r5 = r5 + -1
            goto L_0x0041
        L_0x0063:
            int r0 = r5 + 1
            java.lang.CharSequence r0 = r4.subSequence(r2, r0)
            java.lang.String r1 = r0.toString()
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.0qQ.A07(r0)
            java.lang.String r2 = r1.toLowerCase(r0)
            X.0qQ.A07(r2)
            java.lang.String r1 = "\\s+"
            X.11S r0 = new X.11S
            r0.<init>(r1)
            java.util.List r1 = r0.A03(r2)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r8 = r1.toArray(r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            X.MoC r1 = X.C67457MoC.A00
            r7 = 11
            X.PcS r0 = new X.PcS
            r0.<init>((X.0sL) r1, (int) r7)
            java.util.Arrays.sort(r8, r0)
            int r6 = r8.length
        L_0x009b:
            if (r9 >= r6) goto L_0x00ed
            r5 = r8[r9]
            int r4 = r10.indexOf(r5)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>(r10)
        L_0x00a8:
            java.lang.String r2 = " "
            r0 = -1
            if (r4 == r0) goto L_0x00ea
            r16 = 1
            if (r4 == 0) goto L_0x00bd
            int r0 = r4 - r17
            int r1 = r14.codePointAt(r0)
            r0 = 32
            if (r1 == r0) goto L_0x00bd
            r16 = 0
        L_0x00bd:
            java.util.regex.Pattern r0 = X.0mp.A06
            if (r5 == 0) goto L_0x00e8
            int r1 = r5.length()
        L_0x00c5:
            if (r16 != 0) goto L_0x00d6
            int r1 = r1 + r4
        L_0x00c8:
            if (r4 >= r1) goto L_0x00d1
            int r0 = r4 + 1
            r3.replace(r4, r0, r2)
            r4 = r0
            goto L_0x00c8
        L_0x00d1:
            int r4 = r3.indexOf(r5)
            goto L_0x00a8
        L_0x00d6:
            X.Mo9 r0 = new X.Mo9
            r0.<init>(r4, r1)
            r11.add(r0)
            int r1 = r1 + r4
        L_0x00df:
            if (r4 >= r1) goto L_0x00ea
            int r0 = r4 + 1
            r10.replace(r4, r0, r2)
            r4 = r0
            goto L_0x00df
        L_0x00e8:
            r1 = 0
            goto L_0x00c5
        L_0x00ea:
            int r9 = r9 + 1
            goto L_0x009b
        L_0x00ed:
            X.MoB r1 = X.C67456MoB.A00
            X.PcS r0 = new X.PcS
            r0.<init>((X.0sL) r1, (int) r7)
            java.util.Collections.sort(r11, r0)
            X.0sn r1 = X.0sn.A00
            r5 = r1
            X.MoA r0 = X.C67453Mo8.A00
            java.util.List r4 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r4)
            if (r20 == 0) goto L_0x010d
            java.util.List r5 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r5)
            r4 = r1
        L_0x010d:
            java.util.Iterator r3 = r11.iterator()
        L_0x0111:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r1 = r3.next()
            X.Mo9 r1 = (X.C67454Mo9) r1
            int r2 = r1.A01
            if (r2 == 0) goto L_0x0127
            X.C67453Mo8.A00(r12, r4, r13, r2)
            int r0 = r2 - r13
            int r13 = r13 + r0
        L_0x0127:
            int r1 = r1.A00
            int r0 = r2 + r1
            X.C67453Mo8.A00(r12, r5, r2, r0)
            int r13 = r13 + r1
            goto L_0x0111
        L_0x0130:
            java.util.regex.Pattern r0 = X.0mp.A06
            int r0 = r14.length()
            X.C67453Mo8.A00(r12, r4, r13, r0)
            r14 = r12
        L_0x013a:
            r15.A02 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67387Mn4.A06(java.lang.String, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C67387Mn4) || !0qQ.A0K(this.A01, ((C67387Mn4) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67387Mn4(Keyword keyword) {
        super(4);
        0qQ.A0B(keyword, 1);
        this.A01 = keyword;
        this.A02 = keyword.A04;
    }
}
