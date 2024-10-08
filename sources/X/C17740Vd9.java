package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Vd9  reason: case insensitive filesystem */
public final class C17740Vd9 {
    public ImmutableList A00;
    public ImmutableList A01;
    public ImmutableList A02;
    public ImmutableList A03;
    public ImmutableList A04;
    public String A05;
    public String A06;
    public ImmutableList A07;
    public final int A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final C16676UzC A0B;
    public final C16644Uyg A0C;
    public final C16662Uyy A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;
    public final boolean A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0134, code lost:
        if (r4.A0I == false) goto L_0x0136;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17740Vd9(X.C17739Vd8 r21, java.util.List r22, java.util.List r23) {
        /*
            r20 = this;
            r4 = r21
            r0 = r22
            X.AnonymousClass7TG.A1O(r4, r0)
            r3 = r20
            r3.<init>()
            r3.A0I = r0
            java.lang.String r0 = r4.A07
            r3.A0E = r0
            java.lang.String r0 = r4.A06
            r3.A0F = r0
            java.lang.String r0 = r4.A09
            r3.A0G = r0
            X.Uyy r5 = r4.A04
            r3.A0D = r5
            X.UzC r0 = r4.A02
            r3.A0B = r0
            X.Uyg r0 = r4.A03
            r3.A0C = r0
            boolean r0 = r4.A0J
            r3.A0J = r0
            java.util.List r0 = r4.A0D
            X.0qQ.A07(r0)
            com.google.common.collect.ImmutableList$Builder r6 = new com.google.common.collect.ImmutableList$Builder
            r6.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0038:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r1 = r2.next()
            X.VSW r1 = (X.VSW) r1
            X.0qQ.A0A(r1)
            X.VSm r0 = new X.VSm
            r0.<init>(r1)
            r6.add(r0)
            goto L_0x0038
        L_0x0050:
            com.google.common.collect.ImmutableList r0 = r6.build()
            r3.A0A = r0
            r6 = 0
            com.google.common.collect.ImmutableList$Builder r7 = new com.google.common.collect.ImmutableList$Builder
            r7.<init>()
            java.util.List r0 = r4.A0C
            java.util.Iterator r19 = r0.iterator()
        L_0x0062:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0113
            java.lang.Object r9 = r19.next()
            X.VVt r9 = (X.C17440VVt) r9
            com.google.common.collect.ImmutableList$Builder r8 = new com.google.common.collect.ImmutableList$Builder
            r8.<init>()
            java.util.List r0 = r9.A02
            java.util.Iterator r18 = r0.iterator()
        L_0x0079:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r11 = r18.next()
            X.VVs r11 = (X.C17439VVs) r11
            com.google.common.collect.ImmutableList$Builder r10 = new com.google.common.collect.ImmutableList$Builder
            r10.<init>()
            java.util.List r0 = r11.A02
            java.util.Iterator r17 = r0.iterator()
        L_0x0090:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r13 = r17.next()
            X.VVr r13 = (X.C17438VVr) r13
            com.google.common.collect.ImmutableList$Builder r12 = new com.google.common.collect.ImmutableList$Builder
            r12.<init>()
            java.util.List r0 = r13.A02
            java.util.Iterator r16 = r0.iterator()
        L_0x00a7:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r2 = r16.next()
            X.VVq r2 = (X.C17437VVq) r2
            com.google.common.collect.ImmutableList$Builder r14 = new com.google.common.collect.ImmutableList$Builder
            r14.<init>()
            java.util.List r0 = r2.A02
            java.util.Iterator r15 = r0.iterator()
        L_0x00be:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r15.next()
            X.VSV r0 = (X.VSV) r0
            java.lang.String r1 = r0.A01
            X.VSl r0 = new X.VSl
            r0.<init>(r6, r1)
            r14.add(r0)
            goto L_0x00be
        L_0x00d5:
            java.lang.String r2 = r2.A01
            com.google.common.collect.ImmutableList r1 = r14.build()
            X.VSl r0 = new X.VSl
            r0.<init>(r1, r2)
            r12.add(r0)
            goto L_0x00a7
        L_0x00e4:
            java.lang.String r2 = r13.A01
            com.google.common.collect.ImmutableList r1 = r12.build()
            X.VSl r0 = new X.VSl
            r0.<init>(r1, r2)
            r10.add(r0)
            goto L_0x0090
        L_0x00f3:
            java.lang.String r2 = r11.A01
            com.google.common.collect.ImmutableList r1 = r10.build()
            X.VSl r0 = new X.VSl
            r0.<init>(r1, r2)
            r8.add(r0)
            goto L_0x0079
        L_0x0103:
            java.lang.String r2 = r9.A01
            com.google.common.collect.ImmutableList r1 = r8.build()
            X.VSl r0 = new X.VSl
            r0.<init>(r1, r2)
            r7.add(r0)
            goto L_0x0062
        L_0x0113:
            com.google.common.collect.ImmutableList r0 = r7.build()
            r3.A09 = r0
            int r2 = r4.A00
            r3.A08 = r2
            java.lang.String r1 = r4.A05
            r3.A0H = r1
            java.lang.String r0 = r4.A08
            r3.A06 = r0
            X.Uyy r0 = X.C16662Uyy.INLINE_SELECT
            if (r5 == r0) goto L_0x0183
            X.Uyy r0 = X.C16662Uyy.SELECT
            if (r5 == r0) goto L_0x0183
            if (r2 == 0) goto L_0x0136
            if (r1 == 0) goto L_0x0136
            boolean r0 = r4.A0I
            r1 = 1
            if (r0 != 0) goto L_0x0137
        L_0x0136:
            r1 = 0
        L_0x0137:
            java.util.List r0 = r4.A0H
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r1 == 0) goto L_0x0180
            r3.A01 = r0
        L_0x0141:
            r3.A05 = r6
            java.util.Iterator r2 = r23.iterator()
        L_0x0147:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015b
            java.lang.Object r1 = r2.next()
            X.Ctq r1 = (X.C45287Ctq) r1
            X.Uyy r0 = r1.A00
            if (r0 != r5) goto L_0x0147
            java.lang.String r0 = r1.A01
            r3.A05 = r0
        L_0x015b:
            java.util.List r0 = r4.A0A
            if (r0 == 0) goto L_0x016d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x016d
            java.util.List r0 = r4.A0A
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            r3.A04 = r0
        L_0x016d:
            java.util.List r0 = r4.A0F
            if (r0 == 0) goto L_0x017f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x017f
            java.util.List r0 = r4.A0F
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            r3.A03 = r0
        L_0x017f:
            return
        L_0x0180:
            r3.A02 = r0
            goto L_0x0141
        L_0x0183:
            java.util.List r0 = r4.A0B
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            r3.A07 = r0
            java.util.List r0 = r4.A0H
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            r3.A01 = r0
            java.util.List r0 = r4.A0G
            if (r0 == 0) goto L_0x0141
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0141
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r0 = r4.A0G
            java.util.Iterator r1 = r0.iterator()
        L_0x01a8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r0 = r1.next()
            X.VSX r0 = (X.VSX) r0
            X.VO4 r0 = r0.A01
            if (r0 == 0) goto L_0x01a8
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x01a8
            r2.add(r0)
            goto L_0x01a8
        L_0x01c0:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
            r3.A00 = r0
            goto L_0x0141
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17740Vd9.<init>(X.Vd8, java.util.List, java.util.List):void");
    }
}
