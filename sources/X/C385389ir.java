package X;

/* renamed from: X.9ir  reason: invalid class name and case insensitive filesystem */
public final class C385389ir extends 1P0 {
    public final /* synthetic */ C3509887d A00;

    public C385389ir(C3509887d r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(985549653);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Failed to fetch dial elements: ");
        0kD.A01("DialFetcher", AnonymousClass7TF.A0i(r5.A01(), A1A));
        AnonymousClass0fD.A0A(505946000, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-910535627);
        this.A00.A02 = true;
        AnonymousClass0fD.A0A(-665695537, A03);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        if (X.AnonymousClass3S1.A04(r0) != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (r0 != null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cb, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r1.append("Dial mode is missing required field: ");
        r0 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d8, code lost:
        if (r0 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00da, code lost:
        r0 = X.AnonymousClass87I.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
        X.0kD.A01("DialFetcher", X.AnonymousClass7TF.A0i(r0, r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = -1533122207(0xffffffffa49e6961, float:-6.8700096E-17)
            int r8 = X.AnonymousClass0fD.A03(r0)
            X.9hR r12 = (X.C384509hR) r12
            r0 = -9933035(0xffffffffff686f15, float:-3.0895767E38)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.87d r6 = r11.A00
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.87G r0 = r6.A03()
            r5.add(r0)
            java.util.List r0 = r12.A00
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = "DialFetcher"
            java.lang.String r0 = "CanvasDialResponse had no modes"
            X.0kD.A01(r1, r0)
        L_0x002c:
            r6.A01 = r5
            X.87c r0 = r6.A07
            r0.D8d(r5)
            r0 = -2076421996(0xffffffff843c5094, float:-2.2136293E-36)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 1214173920(0x485ed2e0, float:228171.5)
            X.AnonymousClass0fD.A0A(r0, r8)
            return
        L_0x0040:
            X.87G r0 = r6.A00
            if (r0 == 0) goto L_0x00fb
            X.87I r4 = r0.A04
            if (r4 != 0) goto L_0x004a
            X.87I r4 = X.AnonymousClass87I.EMPTY
        L_0x004a:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r12.A00
            java.util.Iterator r10 = r0.iterator()
        L_0x0054:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r9 = r10.next()
            X.87G r9 = (X.AnonymousClass87G) r9
            X.87I r0 = r9.A04
            if (r0 != 0) goto L_0x0066
            X.87I r0 = X.AnonymousClass87I.EMPTY
        L_0x0066:
            int r0 = r0.ordinal()
            switch(r0) {
                case 4: goto L_0x006e;
                case 5: goto L_0x00b5;
                case 6: goto L_0x0071;
                case 7: goto L_0x007c;
                case 8: goto L_0x0085;
                case 9: goto L_0x008b;
                case 10: goto L_0x006d;
                case 11: goto L_0x006d;
                case 12: goto L_0x006d;
                case 13: goto L_0x006d;
                case 14: goto L_0x006d;
                case 15: goto L_0x006d;
                case 16: goto L_0x006d;
                case 17: goto L_0x0088;
                case 18: goto L_0x0092;
                case 19: goto L_0x0099;
                case 20: goto L_0x00c0;
                case 21: goto L_0x00e5;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0054
        L_0x006e:
            java.util.List r0 = r9.A0I
            goto L_0x00b9
        L_0x0071:
            X.A5e r1 = r9.A0B
            if (r1 == 0) goto L_0x00cb
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x00cb
            java.util.List r0 = r1.A01
            goto L_0x00c9
        L_0x007c:
            X.UY8 r0 = r9.A07
            if (r0 == 0) goto L_0x00cb
            java.util.List r0 = r0.A00()
            goto L_0x00b9
        L_0x0085:
            java.util.List r0 = r9.A0L
            goto L_0x00b9
        L_0x0088:
            X.BEs r0 = r9.A02
            goto L_0x00c9
        L_0x008b:
            X.Csw r0 = r9.A09
            if (r0 == 0) goto L_0x00cb
            java.util.List r0 = r0.A00
            goto L_0x00b9
        L_0x0092:
            X.BIw r0 = r9.A0C
            if (r0 == 0) goto L_0x00cb
            java.util.List r0 = r0.A00
            goto L_0x00b9
        L_0x0099:
            X.Csx r0 = r9.A0A
            if (r0 == 0) goto L_0x00cb
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00a9
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            X.0qQ.A07(r0)
            goto L_0x00b9
        L_0x00a9:
            X.0wb r2 = X.0wb.A01
            java.lang.String r1 = "javaClass"
            java.lang.String r0 = "empty media list"
            r2.Ew0(r1, r0)
            X.0sn r0 = X.0sn.A00
            goto L_0x00b9
        L_0x00b5:
            java.util.List r0 = r9.A02()
        L_0x00b9:
            boolean r0 = X.AnonymousClass3S1.A04(r0)
            if (r0 == 0) goto L_0x00e5
            goto L_0x00cb
        L_0x00c0:
            java.util.List r0 = r9.A0H
            r0.getClass()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
        L_0x00c9:
            if (r0 != 0) goto L_0x00e5
        L_0x00cb:
            java.lang.String r2 = "DialFetcher"
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Dial mode is missing required field: "
            r1.append(r0)
            X.87I r0 = r9.A04
            if (r0 != 0) goto L_0x00dc
            X.87I r0 = X.AnonymousClass87I.EMPTY
        L_0x00dc:
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
            X.0kD.A01(r2, r0)
            goto L_0x0054
        L_0x00e5:
            X.87I r0 = r9.A04
            if (r0 != 0) goto L_0x00eb
            X.87I r0 = X.AnonymousClass87I.EMPTY
        L_0x00eb:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00f6
            r5.add(r9)
            goto L_0x0054
        L_0x00f6:
            r3.add(r9)
            goto L_0x0054
        L_0x00fb:
            r4 = 0
            goto L_0x004a
        L_0x00fe:
            r5.addAll(r3)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385389ir.onSuccess(java.lang.Object):void");
    }
}
