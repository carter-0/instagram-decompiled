package X;

import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Gad  reason: case insensitive filesystem */
public final class C52665Gad extends C251253mo {
    @Prop(optional = true, resType = C54606HKp.A04)
    @Comparable(type = 3)
    public int A00;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public int A01 = 0;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public AnonymousClass3AS A02 = C55376Hgi.A00;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 10)
    public C251263mp A03;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 10)
    public C251263mp A04;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 10)
    public C251263mp A05;
    public 2Vh A06;
    public 2Vh A07;
    public 2Vh A08;
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 15)
    public C337587ga A09;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public C54011Gxt A0A;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public C337547gW A0B = C55376Hgi.A01;
    @Prop(optional = true, resType = C54606HKp.A0A, varArg = "itemDecoration")
    @Comparable(type = 5)
    public List A0C = Collections.emptyList();
    @Prop(optional = true, resType = C54606HKp.A0A, varArg = "onScrollListener")
    @Comparable(type = 5)
    public List A0D = Collections.emptyList();
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A0E;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A0F;

    public final boolean A0z() {
        return true;
    }

    public final boolean A11() {
        return true;
    }

    public C52665Gad() {
        super("RecyclerCollectionComponent");
    }

    public final Object[] A0W() {
        Object[] objArr = new Object[49];
        Boolean A0v = AnonymousClass7TE.A0v();
        Boolean valueOf = Boolean.valueOf(this.A0E);
        C251263mp r6 = this.A03;
        C251263mp r5 = this.A04;
        C251263mp r17 = r6;
        C251263mp r18 = r5;
        boolean A1X = AnonymousClass7TF.A1X(new Object[]{null, false, null, 0, null, A0v, A0v, null, valueOf, null, r17, r18, this.A0A, Integer.valueOf(this.A00), null, Boolean.valueOf(this.A0F), null, A0v, A0v, A0v, A0v, A0v, this.A02, this.A0C, null, null, null}, objArr);
        C251263mp r11 = this.A05;
        List list = this.A0D;
        List list2 = list;
        System.arraycopy(new Object[]{r11, A0v, list2, Integer.valueOf(this.A01), this.A0B, null, null, C51967G9n.A0j(), null, -12425294, null, null, this.A09, null, null, null, null, null, null, null, null, null}, A1X ? 1 : 0, objArr, 27, 22);
        return objArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        if (r0 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0067, code lost:
        if (r16 != null) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0b(X.2V1 r49) {
        /*
            r48 = this;
            r10 = r49
            X.2TB r3 = X.C51969G9p.A0e(r10)
            X.Gag r3 = (X.C52668Gag) r3
            r1 = r48
            X.7ga r5 = r1.A09
            X.3mp r0 = r1.A05
            r18 = r0
            X.3mp r0 = r1.A03
            r17 = r0
            X.3mp r0 = r1.A04
            r16 = r0
            java.util.List r12 = r1.A0D
            r15 = 0
            java.util.List r0 = r1.A0C
            r28 = r0
            X.3AS r2 = r1.A02
            int r0 = r1.A01
            r37 = r0
            boolean r0 = r1.A0F
            r40 = r0
            int r0 = r1.A00
            r35 = r0
            boolean r0 = r1.A0E
            X.7gW r13 = r1.A0B
            X.Gxt r1 = r3.A04
            r26 = r1
            X.7hR r11 = r3.A06
            X.HLS r9 = r3.A02
            X.2Wg r1 = r3.A05
            r24 = r1
            X.7gh r8 = r3.A01
            X.2lf r1 = r3.A00
            r22 = r1
            r7 = 1
            r6 = 0
            r36 = -1
            r34 = -12425294(0xffffffffff4267b2, float:-2.5840865E38)
            X.7gW r1 = X.C55376Hgi.A01
            r14 = 1
            X.3mp r1 = r10.A01
            if (r1 == 0) goto L_0x005f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Object[] r3 = X.C51968G9o.A1b(r7)
            X.5lv r1 = new X.5lv
            r1.<init>(r3, r4)
            r10.A0A(r1)
        L_0x005f:
            r8.A0I(r5)
            X.HLS r5 = X.HLS.ERROR
            if (r9 != r5) goto L_0x0069
            r1 = 1
            if (r16 == 0) goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            X.HLS r4 = X.HLS.EMPTY
            if (r9 != r4) goto L_0x0071
            if (r17 != 0) goto L_0x0071
        L_0x0070:
            return r15
        L_0x0071:
            if (r1 != 0) goto L_0x0070
            r3 = 0
            int r1 = r13.BYr()
            if (r1 == 0) goto L_0x007e
            r46 = 1
            if (r0 == 0) goto L_0x0080
        L_0x007e:
            r46 = 0
        L_0x0080:
            X.7gS r0 = r13.BkM()
            X.7hO r1 = r0.A00
            X.2Sa r0 = r1.A03
            if (r0 != 0) goto L_0x008e
            X.3X5 r0 = r10.A02
            X.2Sa r0 = r0.A01
        L_0x008e:
            java.lang.Integer r0 = r0.A06
            r19 = r0
            boolean r0 = r24.AFc()
            if (r0 != 0) goto L_0x017c
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x017c
        L_0x009c:
            X.3AS r0 = X.C55376Hgi.A00
            if (r0 != r2) goto L_0x00a5
            X.7gd r2 = new X.7gd
            r2.<init>()
        L_0x00a5:
            if (r12 == 0) goto L_0x0176
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r12)
        L_0x00ab:
            X.9VZ r12 = new X.9VZ
            r0 = r26
            r12.<init>(r0, r11)
            r1.add(r12)
            X.3XV r12 = X.2WX.A02
            X.2WX r11 = r12.A00(r12)
            r0 = 0
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            X.9JQ r13 = X.C51965G9l.A0b(r13, r0, r7)
            if (r11 != r12) goto L_0x00c5
            r11 = 0
        L_0x00c5:
            X.2WX r23 = X.C51965G9l.A0X(r11, r13)
            if (r14 == 0) goto L_0x00db
            X.2WX r14 = X.C51974G9v.A0B(r23)
            r11 = 9221401712017801216(0x7ff9000000000000, double:NaN)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            X.9JR r11 = X.C51965G9l.A0c(r13, r7, r11)
            X.2WX r23 = X.C51965G9l.A0X(r14, r11)
        L_0x00db:
            if (r46 == 0) goto L_0x00e2
            X.MBJ r3 = new X.MBJ
            r3.<init>(r6, r10, r8)
        L_0x00e2:
            X.7h8 r8 = new X.7h8
            r20 = r2
            r21 = r15
            r25 = r15
            r27 = r19
            r29 = r1
            r30 = r3
            r31 = r6
            r32 = r6
            r33 = r6
            r38 = r7
            r39 = r7
            r41 = r6
            r42 = r7
            r43 = r7
            r44 = r7
            r45 = r7
            r47 = r6
            r19 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            X.GOI r2 = X.GOJ.A00(r10)
            X.3mo r1 = r2.A00
            X.2TC r1 = r1.A0Z()
            r1.A07(r0)
            X.3Zh r3 = X.C243573Zh.FLEX_START
            X.2Tl r1 = r2.A00
            r1.A00 = r3
            r2.A0A(r8)
            X.HLS r1 = X.HLS.LOADING
            if (r9 != r1) goto L_0x0158
            if (r18 == 0) goto L_0x0155
            X.2Uc r1 = new X.2Uc
            r1.<init>()
            X.GGF r3 = new X.GGF
            r3.<init>(r10, r1)
            r1 = r18
        L_0x0133:
            r3.A0A(r1)
            X.3mo r1 = r3.A00
            X.2TC r1 = r1.A0Z()
            r1.A07(r0)
            X.3b9 r0 = X.C244413b9.ABSOLUTE
            r3.A08(r0)
            X.3ai r0 = X.C244143ai.ALL
            r3.A07(r0, r6)
            java.util.BitSet r1 = r3.A01
            java.lang.String[] r0 = X.GGF.A02
            X.C244113af.A00(r1, r0, r7)
            X.2Uc r0 = r3.A00
            r2.A0A(r0)
        L_0x0155:
            X.2Tl r15 = r2.A00
            return r15
        L_0x0158:
            if (r9 != r4) goto L_0x0167
            X.2Uc r1 = new X.2Uc
            r1.<init>()
            X.GGF r3 = new X.GGF
            r3.<init>(r10, r1)
            r1 = r17
            goto L_0x0133
        L_0x0167:
            if (r9 != r5) goto L_0x0155
            X.2Uc r1 = new X.2Uc
            r1.<init>()
            X.GGF r3 = new X.GGF
            r3.<init>(r10, r1)
            r1 = r16
            goto L_0x0133
        L_0x0176:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            goto L_0x00ab
        L_0x017c:
            r14 = 0
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52665Gad.A0b(X.2V1):X.3mp");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2TB, java.lang.Object] */
    public final /* bridge */ /* synthetic */ 2TB A0f() {
        return new Object();
    }

    public final Object A0g(2Sg r4, Object obj) {
        if (r4.A01 == -1048037474) {
            2Vb.A02(r4.A00.A00, (C10398Rra) obj);
        }
        return null;
    }

    public final void A0p(2V1 r2, AnonymousClass2V9 r3) {
        C51971G9r.A1H(r2, this.A08, this, r3);
        C51971G9r.A1H(r2, this.A07, this, r3);
        C51971G9r.A1H(r2, this.A06, this, r3);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [X.7go] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0w(X.2V1 r57, X.2TB r58) {
        /*
            r56 = this;
            r11 = r58
            X.Gag r11 = (X.C52668Gag) r11
            r0 = r56
            X.7ga r10 = r0.A09
            X.7gW r9 = r0.A0B
            X.Gxt r8 = r0.A0A
            r7 = 0
            X.7gW r0 = X.C55376Hgi.A01
            X.7gS r0 = r9.BkM()
            r12 = r57
            X.7hR r6 = r9.BLr(r12)
            X.7hO r1 = r0.A00
            X.2Sa r15 = r1.A03
            if (r15 != 0) goto L_0x0023
            X.3X5 r0 = r12.A02
            X.2Sa r15 = r0.A01
        L_0x0023:
            X.7hP r5 = new X.7hP
            r5.<init>()
            boolean r0 = r1.A09
            r55 = r0
            boolean r0 = r1.A07
            r54 = r0
            X.7iC r0 = r1.A04
            r53 = r0
            java.lang.Integer r0 = r1.A06
            r52 = r0
            boolean r0 = r1.A0B
            r51 = r0
            boolean r0 = r1.A0A
            r50 = r0
            int r0 = r1.A01
            r49 = r0
            boolean r0 = r1.A08
            r48 = r0
            float r0 = r1.A00
            r47 = r0
            java.lang.Boolean r0 = r1.A05
            r46 = r0
            boolean r0 = r1.A0C
            r45 = r0
            int r0 = r1.A02
            r44 = r0
            X.2Sa r14 = X.2Sa.A01(r15)
            boolean r0 = r14.A0P
            r35 = r0
            X.3X7 r0 = r14.A02
            r43 = r0
            X.2Sd r0 = r14.A03
            r42 = r0
            X.2Sf r0 = r14.A01
            r41 = r0
            java.lang.Integer r0 = r14.A05
            r40 = r0
            boolean r0 = r14.A0X
            r38 = r0
            java.lang.String r0 = r14.A07
            r39 = r0
            boolean r0 = r14.A00
            r29 = r0
            boolean r0 = r14.A09
            r21 = r0
            boolean r0 = r14.A0J
            r31 = r0
            boolean r0 = r14.A0C
            r23 = r0
            boolean r0 = r14.A0A
            r22 = r0
            boolean r0 = r14.A0L
            r32 = r0
            boolean r0 = r14.A0T
            r19 = r0
            java.lang.Integer r0 = r14.A06
            r18 = r0
            boolean r0 = r14.A0E
            r17 = r0
            boolean r0 = r14.A0G
            r16 = r0
            X.0sP r0 = r14.A08
            r20 = r0
            boolean r13 = r14.A0W
            boolean r4 = r14.A0I
            boolean r3 = r14.A0F
            boolean r2 = r14.A0H
            boolean r1 = r14.A0D
            boolean r0 = r14.A0N
            boolean r15 = r15.A0M
            boolean r33 = X.AnonymousClass7TF.A1P(r15)
            r24 = r1
            r25 = r17
            r26 = r3
            r27 = r16
            r28 = r2
            r30 = r4
            r34 = r0
            r36 = r19
            r37 = r13
            r13 = r41
            r15 = r43
            r16 = r42
            r17 = r40
            r19 = r39
            X.2Sa r14 = X.AnonymousClass3XC.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.7hO r13 = new X.7hO
            r15 = r53
            r16 = r46
            r17 = r52
            r18 = r47
            r19 = r49
            r20 = r44
            r21 = r55
            r22 = r54
            r23 = r51
            r24 = r50
            r25 = r48
            r26 = r45
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5.A07 = r13
            r5.A04 = r6
            X.2We r0 = r5.A00(r12)
            X.7gf r13 = new X.7gf
            r13.<init>(r0)
            X.7gX r1 = new X.7gX
            r1.<init>(r12)
            X.2lf r9 = r9.Bx6()
            java.lang.String r0 = r10.A09
            if (r0 != 0) goto L_0x010f
            java.lang.String r0 = ""
        L_0x010f:
            X.7gh r5 = new X.7gh
            r5.<init>(r1, r13, r0)
            if (r8 != 0) goto L_0x011b
            X.Gxt r8 = new X.Gxt
            r8.<init>()
        L_0x011b:
            r8.A00 = r5
            X.Hza r4 = new X.Hza
            r4.<init>(r12, r8)
            r5.A05 = r4
            X.9Va r3 = new X.9Va
            r3.<init>(r5)
            X.2We r2 = r13.A00
            X.7hl r1 = r2.A0Y
            monitor-enter(r1)
            java.util.List r0 = r1.A07     // Catch:{ all -> 0x0149 }
            r0.add(r3)     // Catch:{ all -> 0x0149 }
            monitor-exit(r1)     // Catch:{ all -> 0x0149 }
            r2.A0E = r7
            X.HLS r0 = X.HLS.LOADING
            if (r9 == 0) goto L_0x013c
            r11.A00 = r9
        L_0x013c:
            r11.A01 = r5
            r11.A03 = r4
            r11.A05 = r13
            r11.A02 = r0
            r11.A04 = r8
            r11.A06 = r6
            return
        L_0x0149:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0149 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52665Gad.A0w(X.2V1, X.2TB):void");
    }

    public final /* bridge */ /* synthetic */ C251263mp A0E() {
        C251263mp r1;
        C251263mp r12;
        C251263mp r13;
        C52665Gad gad = (C52665Gad) super.A0E();
        C251263mp r14 = gad.A03;
        C337587ga r0 = null;
        if (r14 != null) {
            r1 = r14.A0E();
        } else {
            r1 = null;
        }
        gad.A03 = r1;
        C251263mp r15 = gad.A04;
        if (r15 != null) {
            r12 = r15.A0E();
        } else {
            r12 = null;
        }
        gad.A04 = r12;
        C251263mp r16 = gad.A05;
        if (r16 != null) {
            r13 = r16.A0E();
        } else {
            r13 = null;
        }
        gad.A05 = r13;
        C337587ga r17 = gad.A09;
        if (r17 != null) {
            r0 = r17.A04(false);
        }
        gad.A09 = r0;
        return gad;
    }

    public final void A0m(2V1 r3) {
        C70852Wg r1 = C51969G9p.A0e(r3).A05;
        C337547gW r0 = C55376Hgi.A01;
        r1.detach();
    }
}
