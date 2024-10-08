package X;

/* renamed from: X.WrE  reason: case insensitive filesystem */
public final class C20429WrE implements 02o {
    public final int A00;
    public final Object A01;

    public C20429WrE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.util.List r15, X.AnonymousClass4D7 r16) {
        /*
            r14 = this;
            r4 = 24
            r5 = r16
            boolean r0 = X.ME3.A03(r4, r5)
            if (r0 == 0) goto L_0x0028
            r3 = r5
            X.ME3 r3 = (X.ME3) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r3.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 == r2) goto L_0x010d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0028:
            r0 = 42
            X.ME3 r3 = new X.ME3
            r3.<init>(r14, r5, r4, r0)
            goto L_0x0018
        L_0x0030:
            X.0eS.A00(r1)
            if (r15 == 0) goto L_0x0116
            boolean r0 = X.AnonymousClass7TE.A1b(r15)
            if (r0 != r2) goto L_0x0116
            java.lang.Object r8 = r14.A01
            X.Ums r8 = (X.C16011Ums) r8
            com.instagram.common.ui.base.IgTextView r0 = r8.A03
            r13 = 0
            if (r0 == 0) goto L_0x0047
            r0.setVisibility(r13)
        L_0x0047:
            com.instagram.common.ui.base.IgTextView r0 = r8.A02
            if (r0 == 0) goto L_0x004e
            r0.setVisibility(r13)
        L_0x004e:
            com.instagram.common.ui.base.IgView r0 = r8.A04
            if (r0 == 0) goto L_0x0055
            r0.setVisibility(r13)
        L_0x0055:
            androidx.recyclerview.widget.RecyclerView r0 = r8.A00
            if (r0 == 0) goto L_0x005c
            r0.setVisibility(r13)
        L_0x005c:
            androidx.recyclerview.widget.RecyclerView r7 = r8.A00
            if (r7 == 0) goto L_0x0079
            androidx.fragment.app.FragmentActivity r6 = r8.requireActivity()
            X.0eM r0 = r8.A09
            java.lang.Object r5 = r0.getValue()
            X.UnR r5 = (X.C16038UnR) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r15)
            X.U9x r0 = new X.U9x
            r0.<init>(r6, r8, r5, r1)
            r7.setAdapter(r0)
        L_0x0079:
            java.util.Iterator r5 = r15.iterator()
        L_0x007d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r1 = r5.next()
            X.WWa r1 = (X.C19359WWa) r1
            X.0eM r0 = r8.A08
            com.instagram.common.session.UserSession r6 = X.DbW.A0S(r0, r13)
            X.0qQ.A0B(r1, r2)
            X.1Xj r7 = r1.A02
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            java.lang.String r10 = "impression"
            r11 = 0
            r12 = r11
            X.C233822wX.A0S(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x007d
        L_0x00a0:
            androidx.recyclerview.widget.RecyclerView r6 = r8.A00
            if (r6 == 0) goto L_0x00d7
            X.0eM r0 = r8.A08
            X.1Av r5 = X.DbX.A0h(r0)
            X.0s0 r7 = r5.A3m
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 287(0x11f, float:4.02E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r5, r7, r1, r0)
            if (r0 != 0) goto L_0x00d7
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            r0 = 2131964694(0x7f133316, float:1.9566177E38)
            java.lang.String r0 = X.DbU.A0m(r8, r0)
            X.5Gt r0 = X.AnonymousClass7TG.A0f(r1, r0)
            r0.A03(r6)
            r0.A01()
            X.5Gv r1 = r0.A00()
            X.Woq r0 = new X.Woq
            r0.<init>(r1, r8, r5)
            r6.post(r0)
        L_0x00d7:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r8.A04
            if (r0 == 0) goto L_0x00de
            r0.setPrimaryActionIsLoading(r13)
        L_0x00de:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r6 = r8.A04
            if (r6 == 0) goto L_0x00f3
            r0 = 2131964686(0x7f13330e, float:1.956616E38)
            java.lang.String r5 = r8.getString(r0)
            r1 = 46
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r8, (int) r1)
            r6.setPrimaryAction(r5, r0)
        L_0x00f3:
            X.0eM r0 = r8.A09
            java.lang.Object r0 = r0.getValue()
            X.UnR r0 = (X.C16038UnR) r0
            X.05G r5 = r0.A0B
            r1 = 8
            X.WrE r0 = new X.WrE
            r0.<init>(r8, r1)
            r3.A00 = r2
            java.lang.Object r0 = r5.collect(r0, r3)
            if (r0 != r4) goto L_0x0110
            return r4
        L_0x010d:
            X.0eS.A00(r1)
        L_0x0110:
            X.MCr r0 = new X.MCr
            r0.<init>()
            throw r0
        L_0x0116:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20429WrE.A00(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v63, types: [X.07Z, X.UYd, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0cd0: MOVE  (r4v35 X.X7g) = (r4v6 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x059b  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x05be  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x05c4  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0998 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09b2 A[SYNTHETIC, Splitter:B:436:0x09b2] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x09d6 A[Catch:{ NotFoundException -> 0x09e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x09dd A[Catch:{ NotFoundException -> 0x09e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x09fa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0a1c A[Catch:{ NotFoundException -> 0x0a3c }] */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0a23 A[Catch:{ NotFoundException -> 0x0a3c }] */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0a2c A[Catch:{ NotFoundException -> 0x0a3c }] */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0a34 A[Catch:{ NotFoundException -> 0x0a3c }] */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0a4b  */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x0a51  */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0a65  */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x0aa2  */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0ab5  */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0ad1  */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0ae8  */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x0afd  */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0b1c  */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x0b4d  */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x0b56  */
    /* JADX WARNING: Removed duplicated region for block: B:544:0x0b5f  */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x0b62  */
    /* JADX WARNING: Removed duplicated region for block: B:546:0x0b65 A[SYNTHETIC, Splitter:B:546:0x0b65] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x0b89 A[Catch:{ NotFoundException -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:560:0x0b90 A[Catch:{ NotFoundException -> 0x0b9b }] */
    /* JADX WARNING: Removed duplicated region for block: B:567:0x0ba9  */
    /* JADX WARNING: Removed duplicated region for block: B:570:0x0bb4  */
    /* JADX WARNING: Removed duplicated region for block: B:573:0x0bc7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:592:0x0c3d  */
    /* JADX WARNING: Removed duplicated region for block: B:827:0x059d A[SYNTHETIC] */
    public final java.lang.Object emit(java.lang.Object r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r4 = r18
            r0 = r19
            int r1 = r4.A00
            switch(r1) {
                case 0: goto L_0x1090;
                case 1: goto L_0x10c7;
                case 2: goto L_0x0c8b;
                case 3: goto L_0x0c5b;
                case 4: goto L_0x0c45;
                case 5: goto L_0x08fa;
                case 6: goto L_0x0801;
                case 7: goto L_0x07ac;
                case 8: goto L_0x0799;
                case 9: goto L_0x0790;
                case 10: goto L_0x0753;
                case 11: goto L_0x062a;
                case 12: goto L_0x05eb;
                case 13: goto L_0x04b4;
                case 14: goto L_0x06a0;
                case 15: goto L_0x03da;
                case 16: goto L_0x0306;
                case 17: goto L_0x02b6;
                case 18: goto L_0x0241;
                case 19: goto L_0x0228;
                case 20: goto L_0x01cc;
                case 21: goto L_0x01aa;
                case 22: goto L_0x0188;
                case 23: goto L_0x0126;
                case 24: goto L_0x00c7;
                case 25: goto L_0x0071;
                case 26: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 0
            return r1
        L_0x000b:
            X.V2g r0 = (X.C16703V2g) r0
            boolean r1 = r0 instanceof X.C16393UuB
            if (r1 == 0) goto L_0x0067
            java.lang.Object r4 = r4.A01
            X.UYn r4 = (X.UYn) r4
            X.UuB r0 = (X.C16393UuB) r0
            java.lang.Object r5 = r0.A01
            r3 = r5
            X.Nk0 r3 = (X.C69360Nk0) r3
            int r2 = r3.ordinal()
            r1 = 0
            if (r2 == r1) goto L_0x005d
            r1 = 1
            if (r2 == r1) goto L_0x0059
            r1 = 2
            if (r2 != r1) goto L_0x0061
            r1 = 2131976193(0x7f136001, float:1.95895E38)
        L_0x002c:
            java.lang.String r9 = X.DbU.A0m(r4, r1)
            r1 = 2131975851(0x7f135eab, float:1.9588806E38)
            java.lang.String r10 = X.DbU.A0m(r4, r1)
            X.DbZ.A15(r4)
            java.lang.Object r0 = r0.A00
            if (r0 == r5) goto L_0x10fa
            X.Nk0 r0 = (X.C69360Nk0) r0
            java.lang.String r7 = r0.A01
            java.lang.String r8 = r3.A01
            r0 = 30
            X.Wvr r11 = new X.Wvr
            r11.<init>(r4, r0)
            X.I10 r6 = r4.A01
            if (r6 != 0) goto L_0x015d
            java.lang.String r0 = "snackBarLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0059:
            r1 = 2131976194(0x7f136002, float:1.9589502E38)
            goto L_0x002c
        L_0x005d:
            r1 = 2131976192(0x7f136000, float:1.9589498E38)
            goto L_0x002c
        L_0x0061:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0067:
            boolean r0 = r0 instanceof X.C16392UuA
            if (r0 != 0) goto L_0x016c
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0071:
            X.V2g r0 = (X.C16703V2g) r0
            boolean r1 = r0 instanceof X.C16393UuB
            if (r1 == 0) goto L_0x00bd
            java.lang.Object r6 = r4.A01
            X.UYl r6 = (X.C15271UYl) r6
            X.UuB r0 = (X.C16393UuB) r0
            java.lang.Object r5 = r0.A01
            r4 = r5
            X.Uwv r4 = (X.C16548Uwv) r4
            int r3 = r4.ordinal()
            r1 = 2
            if (r3 == r1) goto L_0x00b9
            r2 = 0
            r1 = 2131976182(0x7f135ff6, float:1.9589477E38)
            if (r3 == r2) goto L_0x0092
            r1 = 2131976181(0x7f135ff5, float:1.9589475E38)
        L_0x0092:
            java.lang.String r9 = X.DbU.A0m(r6, r1)
            r1 = 2131975851(0x7f135eab, float:1.9588806E38)
            java.lang.String r10 = X.DbU.A0m(r6, r1)
            X.DbZ.A15(r6)
            java.lang.Object r0 = r0.A00
            if (r0 == r5) goto L_0x10fa
            X.Uwv r0 = (X.C16548Uwv) r0
            java.lang.String r7 = r0.name()
            java.lang.String r8 = r4.name()
            r0 = 18
            X.Wvr r11 = new X.Wvr
            r11.<init>(r6, r0)
            X.I10 r6 = r6.A02
            goto L_0x0157
        L_0x00b9:
            r1 = 2131976183(0x7f135ff7, float:1.958948E38)
            goto L_0x0092
        L_0x00bd:
            boolean r0 = r0 instanceof X.C16392UuA
            if (r0 != 0) goto L_0x016c
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00c7:
            X.V2g r0 = (X.C16703V2g) r0
            boolean r1 = r0 instanceof X.C16393UuB
            if (r1 == 0) goto L_0x011c
            java.lang.Object r4 = r4.A01
            X.UYj r4 = (X.C15269UYj) r4
            X.UuB r0 = (X.C16393UuB) r0
            java.lang.Object r6 = r0.A01
            r5 = r6
            X.Uz1 r5 = (X.C16665Uz1) r5
            int r3 = r5.ordinal()
            r1 = 2
            if (r3 == r1) goto L_0x00eb
            r1 = 3
            if (r3 == r1) goto L_0x0118
            r1 = 1
            if (r3 == r1) goto L_0x0114
            r2 = 4
            r1 = 2131976172(0x7f135fec, float:1.9589457E38)
            if (r3 == r2) goto L_0x00ee
        L_0x00eb:
            r1 = 2131976171(0x7f135feb, float:1.9589455E38)
        L_0x00ee:
            java.lang.String r9 = X.DbU.A0m(r4, r1)
            r1 = 2131975851(0x7f135eab, float:1.9588806E38)
            java.lang.String r10 = X.DbU.A0m(r4, r1)
            X.DbZ.A15(r4)
            java.lang.Object r0 = r0.A00
            if (r0 == r6) goto L_0x10fa
            X.Uz1 r0 = (X.C16665Uz1) r0
            java.lang.String r7 = r0.name()
            java.lang.String r8 = r5.name()
            r0 = 13
            X.Wvr r11 = new X.Wvr
            r11.<init>(r4, r0)
            X.I10 r6 = r4.A01
            goto L_0x0157
        L_0x0114:
            r1 = 2131976170(0x7f135fea, float:1.9589453E38)
            goto L_0x00ee
        L_0x0118:
            r1 = 2131976173(0x7f135fed, float:1.958946E38)
            goto L_0x00ee
        L_0x011c:
            boolean r0 = r0 instanceof X.C16392UuA
            if (r0 != 0) goto L_0x016c
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0126:
            X.V2g r0 = (X.C16703V2g) r0
            boolean r1 = r0 instanceof X.C16393UuB
            if (r1 == 0) goto L_0x0162
            java.lang.Object r2 = r4.A01
            X.UYk r2 = (X.C15270UYk) r2
            r1 = 2131976159(0x7f135fdf, float:1.958943E38)
            java.lang.String r9 = X.DbU.A0m(r2, r1)
            r1 = 2131975851(0x7f135eab, float:1.9588806E38)
            java.lang.String r10 = X.DbU.A0m(r2, r1)
            X.DbZ.A15(r2)
            X.UuB r0 = (X.C16393UuB) r0
            java.lang.Object r1 = r0.A00
            X.Nk4 r1 = (X.C69364Nk4) r1
            java.lang.String r7 = r1.A02
            java.lang.Object r0 = r0.A01
            X.Nk4 r0 = (X.C69364Nk4) r0
            java.lang.String r8 = r0.A02
            r0 = 4
            X.Wvr r11 = new X.Wvr
            r11.<init>(r2, r0)
            X.I10 r6 = r2.A01
        L_0x0157:
            if (r6 != 0) goto L_0x015d
            java.lang.String r1 = "snackBarLogger"
            goto L_0x06b0
        L_0x015d:
            X.C55180HdW.A00(r6, r7, r8, r9, r10, r11)
            goto L_0x10fa
        L_0x0162:
            boolean r0 = r0 instanceof X.C16392UuA
            if (r0 != 0) goto L_0x016c
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x016c:
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r4.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.DbX.A10(r0, r2)
            android.content.Context r1 = r1.requireContext()
            r0 = 70
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.C59689JTv.A0D(r1, r0)
            goto L_0x10fa
        L_0x0188:
            X.Tnz r0 = (X.C13997Tnz) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x10fa
            java.lang.Object r0 = r4.A01
            X.U91 r0 = (X.U91) r0
            r4 = 0
            r5 = 1
            X.U91.A05(r0, r5, r4)
            X.Vj6 r0 = r0.A06
            X.05G r0 = r0.A00
            r2 = 8
            r3 = 5
            X.Tnz r1 = new X.Tnz
            r6 = r4
            r7 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.Epw(r1)
            goto L_0x10fa
        L_0x01aa:
            X.JTb r0 = (X.C59671JTb) r0
            java.lang.Object r2 = r4.A01
            X.U91 r2 = (X.U91) r2
            X.0Ud r1 = r2.A0G
            java.lang.Object r1 = r1.getValue()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r1 instanceof X.UOK
            if (r0 == 0) goto L_0x10fa
            X.U91.A04(r2)
            goto L_0x10fa
        L_0x01c3:
            boolean r0 = r1 instanceof X.UOJ
            if (r0 == 0) goto L_0x10fa
            X.U91.A03(r2)
            goto L_0x10fa
        L_0x01cc:
            X.UOF r0 = (X.UOF) r0
            X.W2B r7 = X.W2B.A00
            java.lang.Object r6 = r4.A01
            X.U91 r6 = (X.U91) r6
            X.VPf r5 = r6.A0A
            X.6d8 r8 = r6.A03
            X.VgI r4 = r6.A0B
            X.VtC r3 = r6.A09
            java.lang.String r2 = X.U91.A01(r6)
            if (r2 == 0) goto L_0x0226
            X.6W7 r1 = r3.A04
            java.util.Map r1 = r1.A00
            java.lang.String r13 = X.DbT.A11(r2, r1)
        L_0x01ea:
            r9 = r0
            r10 = r3
            r11 = r5
            r12 = r4
            X.UOL r2 = r7.A03(r8, r9, r10, r11, r12, r13)
            X.05G r1 = r6.A0E
            r1.Epw(r2)
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x10fa
            X.Vbe r1 = r6.A08
            com.instagram.user.model.User r3 = X.C17103VHz.A00(r0)
            if (r3 == 0) goto L_0x10fa
            com.instagram.common.session.UserSession r1 = r1.A02
            X.6oA r0 = new X.6oA
            r0.<init>(r1)
            boolean r0 = r3.CQp(r0)
            if (r0 == 0) goto L_0x10fa
            java.lang.String r0 = "story-reply"
            X.GPq r2 = new X.GPq
            r2.<init>(r1, r0)
            java.lang.Long r1 = X.C51972G9s.A0h(r3)
            r0 = 398(0x18e, float:5.58E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.C52369GPq.A03(r2, r1, r0)
            goto L_0x10fa
        L_0x0226:
            r13 = 0
            goto L_0x01ea
        L_0x0228:
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r0 = (com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState) r0
            java.lang.Object r1 = r4.A01
            X.Uam r1 = (X.C15337Uam) r1
            X.ULE r2 = X.C13991Tnr.A0U(r1)
            if (r2 == 0) goto L_0x10fa
            X.0eM r1 = r1.A06
            java.lang.Object r1 = r1.getValue()
            X.Vfs r1 = (X.C17781Vfs) r1
            r1.A00(r2, r0)
            goto L_0x10fa
        L_0x0241:
            X.V2b r0 = (X.C16698V2b) r0
            X.UrG r1 = X.C16253UrG.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 == 0) goto L_0x0258
            java.lang.Object r0 = r4.A01
            android.content.Context r1 = X.DbT.A08(r0)
            java.lang.String r0 = "shop_management_edit_fragment_network_error"
            X.C59689JTv.A0E(r1, r0)
            goto L_0x10fa
        L_0x0258:
            boolean r1 = r0 instanceof X.C16252UrF
            if (r1 == 0) goto L_0x02b0
            java.lang.Object r5 = r4.A01
            X.Uai r5 = (X.C15333Uai) r5
            X.UrF r0 = (X.C16252UrF) r0
            com.instagram.user.model.Product r6 = r0.A01
            X.VkR r2 = r0.A00
            X.0eM r0 = r5.A09
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.W3U r0 = X.W3U.A00
            X.0xa r0 = X.W3U.A02(r1, r0)
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "has_seen_hide_from_shop_nux_dialog"
            r4 = 1
            r1.E5T(r0, r4)
            r1.apply()
            r0 = 8
            X.W5R r3 = new X.W5R
            r3.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r6, (java.lang.Object) r5)
            r1 = 2131963386(0x7f132dfa, float:1.9563524E38)
            r0 = 2131963385(0x7f132df9, float:1.9563522E38)
            X.8ab r2 = X.DbW.A0U(r5)
            r2.A09(r1)
            r2.A08(r0)
            r0 = 2131963372(0x7f132dec, float:1.9563496E38)
            r2.A0I(r3, r0)
            r1 = 2131964884(0x7f1333d4, float:1.9566562E38)
            r0 = 47
            X.W5U.A01(r2, r5, r0, r1)
            r2.A05()
            X.AnonymousClass7TH.A0a(r2, r4)
            goto L_0x10fa
        L_0x02b0:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x02b6:
            X.V2Z r0 = (X.V2Z) r0
            X.UrA r1 = X.C16247UrA.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 != 0) goto L_0x02fa
            boolean r1 = r0 instanceof X.C16246Ur9
            if (r1 == 0) goto L_0x02cc
            java.lang.Object r1 = r4.A01
            android.content.Context r2 = X.DbT.A08(r1)
            goto L_0x03fd
        L_0x02cc:
            boolean r1 = r0 instanceof X.C16244Ur7
            if (r1 == 0) goto L_0x02d8
            java.lang.Object r1 = r4.A01
            android.content.Context r2 = X.DbT.A08(r1)
            goto L_0x041c
        L_0x02d8:
            boolean r1 = r0 instanceof X.C16243Ur6
            if (r1 == 0) goto L_0x02e4
            java.lang.Object r1 = r4.A01
            android.content.Context r2 = X.DbT.A08(r1)
            goto L_0x0448
        L_0x02e4:
            boolean r0 = r0 instanceof X.C16245Ur8
            if (r0 == 0) goto L_0x02f4
            java.lang.Object r1 = r4.A01
            X.Uar r1 = (X.C15341Uar) r1
            r0 = 1
            r1.A0A = r0
            X.DbT.A1J(r1)
            goto L_0x10fa
        L_0x02f4:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x02fa:
            java.lang.Object r3 = r4.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r0 = 2131968258(0x7f134102, float:1.9573406E38)
            java.lang.String r1 = r3.getString(r0)
            goto L_0x0328
        L_0x0306:
            X.V2a r0 = (X.C16697V2a) r0
            X.UrE r1 = X.C16251UrE.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 != 0) goto L_0x02fa
            boolean r1 = r0 instanceof X.C16248UrB
            if (r1 == 0) goto L_0x033a
            java.lang.Object r3 = r4.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r2 = 2131965881(0x7f1337b9, float:1.9568584E38)
            X.UrB r0 = (X.C16248UrB) r0
            int r1 = r0.A00
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            java.lang.String r1 = X.DbV.A0z(r3, r0, r2)
        L_0x0328:
            X.0qQ.A07(r1)
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x10fa
            android.content.Context r0 = r3.requireContext()
            X.C59689JTv.A09(r0, r1)
            goto L_0x10fa
        L_0x033a:
            boolean r1 = r0 instanceof X.C16250UrD
            if (r1 == 0) goto L_0x03a8
            java.lang.Object r5 = r4.A01
            X.Uar r5 = (X.C15341Uar) r5
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r5.A02
            if (r1 != 0) goto L_0x034a
            java.lang.String r1 = "inlineSearchBox"
            goto L_0x06b0
        L_0x034a:
            r1.A03()
            r1 = 3
            X.WQd r3 = new X.WQd
            r3.<init>(r1, r0, r5)
            r5.A01 = r3
            X.0eM r4 = r5.A0M
            X.1Ng r2 = X.DbX.A0R(r4)
            java.lang.Class<X.WQI> r1 = X.WQI.class
            r2.A01(r3, r1)
            android.content.Context r3 = r5.getContext()
            X.0qQ.A0A(r3)
            r4.getValue()
            X.UrD r0 = (X.C16250UrD) r0
            com.instagram.model.shopping.ProductGroup r4 = r0.A00
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0 = 4
            java.lang.String r1 = X.C66579MXk.A00(r0)
            r0 = 1810(0x712, float:2.536E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r1, r0)
            java.lang.String r0 = "product_group"
            r2.putParcelable(r0, r4)
            r0 = 14
            java.lang.String r1 = X.C66579MXk.A00(r0)
            r0 = 1
            r2.putBoolean(r1, r0)
            java.util.List r0 = r4.A00()
            java.lang.Object r1 = X.AnonymousClass7TE.A13(r0)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            java.lang.String r0 = "product"
            r2.putParcelable(r0, r1)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            java.lang.String r0 = "bottom_sheet"
            X.AnonymousClass6W8.A06(r3, r2, r1, r0)
            goto L_0x10fa
        L_0x03a8:
            boolean r1 = r0 instanceof X.C16249UrC
            if (r1 == 0) goto L_0x03d4
            java.lang.Object r1 = r4.A01
            android.content.Context r3 = X.DbT.A08(r1)
            X.UrC r0 = (X.C16249UrC) r0
            java.lang.String r2 = r0.A00
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r0 = 2131954084(0x7f1309a4, float:1.9544657E38)
            java.lang.String r1 = X.DbY.A0c(r3, r2, r0)
            r0 = 2131954083(0x7f1309a3, float:1.9544655E38)
            java.lang.String r0 = X.DbY.A0c(r3, r2, r0)
            X.8ab r0 = X.DbX.A0g(r3, r0, r1)
            r0.A06()
            X.DbT.A1V(r0)
            goto L_0x10fa
        L_0x03d4:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x03da:
            X.V2Z r0 = (X.V2Z) r0
            X.UrA r1 = X.C16247UrA.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 == 0) goto L_0x03f3
            java.lang.Object r0 = r4.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "product_collection_picker_network_error"
            X.C59689JTv.A0E(r1, r0)
            goto L_0x10fa
        L_0x03f3:
            boolean r1 = r0 instanceof X.C16246Ur9
            if (r1 == 0) goto L_0x0412
            java.lang.Object r1 = r4.A01
            android.content.Context r2 = X.DbT.A08(r1)
        L_0x03fd:
            X.Ur9 r0 = (X.C16246Ur9) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A00
            X.AnonymousClass7TG.A1O(r1, r0)
            X.8ab r0 = X.DbX.A0g(r2, r0, r1)
            r0.A06()
            X.DbT.A1V(r0)
            goto L_0x10fa
        L_0x0412:
            boolean r1 = r0 instanceof X.C16244Ur7
            if (r1 == 0) goto L_0x043e
            java.lang.Object r1 = r4.A01
            android.content.Context r2 = X.DbT.A08(r1)
        L_0x041c:
            X.Ur7 r0 = (X.C16244Ur7) r0
            java.lang.String r1 = r0.A00
            r0 = 1
            X.0qQ.A0B(r1, r0)
            r0 = 2131954080(0x7f1309a0, float:1.954465E38)
            java.lang.String r1 = X.DbY.A0c(r2, r1, r0)
            r0 = 2131954079(0x7f13099f, float:1.9544647E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r0)
            X.8ab r0 = X.DbX.A0g(r2, r0, r1)
            r0.A06()
            X.DbT.A1V(r0)
            goto L_0x10fa
        L_0x043e:
            boolean r1 = r0 instanceof X.C16243Ur6
            if (r1 == 0) goto L_0x046a
            java.lang.Object r1 = r4.A01
            android.content.Context r2 = X.DbT.A08(r1)
        L_0x0448:
            X.Ur6 r0 = (X.C16243Ur6) r0
            java.lang.String r1 = r0.A00
            r0 = 1
            X.0qQ.A0B(r1, r0)
            r0 = 2131954086(0x7f1309a6, float:1.9544661E38)
            java.lang.String r1 = X.DbY.A0c(r2, r1, r0)
            r0 = 2131954085(0x7f1309a5, float:1.954466E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r0)
            X.8ab r0 = X.DbX.A0g(r2, r0, r1)
            r0.A06()
            X.DbT.A1V(r0)
            goto L_0x10fa
        L_0x046a:
            boolean r1 = r0 instanceof X.C16245Ur8
            if (r1 == 0) goto L_0x04ae
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            X.Ur8 r0 = (X.C16245Ur8) r0
            X.VWn r1 = r0.A00
            java.lang.String r2 = r1.A01
            java.lang.String r1 = "merchant_id"
            r5.putExtra(r1, r2)
            com.instagram.user.model.ProductCollection r1 = r0.A01
            java.lang.String r0 = "product_collection"
            r5.putExtra(r0, r1)
            java.lang.Object r3 = r4.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "is_modal"
            boolean r0 = r1.getBoolean(r0)
            r2 = -1
            if (r0 == 0) goto L_0x04a2
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            r0.setResult(r2, r5)
        L_0x049d:
            X.DbT.A1J(r3)
            goto L_0x10fa
        L_0x04a2:
            androidx.fragment.app.Fragment r1 = r3.getTargetFragment()
            if (r1 == 0) goto L_0x049d
            r0 = 17
            r1.onActivityResult(r0, r2, r5)
            goto L_0x049d
        L_0x04ae:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x04b4:
            X.V2W r0 = (X.V2W) r0
            boolean r1 = r0 instanceof X.C16134UpL
            if (r1 == 0) goto L_0x05cb
            java.lang.Object r4 = r4.A01
            X.Uat r4 = (X.C15343Uat) r4
            X.0h9 r1 = r4.mLifecycleRegistry
            X.07U r2 = r1.A07()
            X.07U r1 = X.07U.A04
            if (r2 != r1) goto L_0x04f8
            X.WWy r2 = r4.A02
            if (r2 == 0) goto L_0x04d2
            r1 = 0
            r2.A04 = r1
            r2.A02()
        L_0x04d2:
            X.WWy r6 = r4.A02
            if (r6 == 0) goto L_0x04f8
            r1 = r0
            X.UpL r1 = (X.C16134UpL) r1
            java.util.List r5 = r1.A01
            boolean r3 = r1.A02
            java.lang.String r1 = r1.A00
            boolean r2 = X.DbW.A1a(r1)
            r1 = 0
            X.0qQ.A0B(r5, r1)
            if (r3 == 0) goto L_0x04ee
            java.util.List r1 = r6.A0E
            r1.clear()
        L_0x04ee:
            java.util.List r1 = r6.A0E
            r1.addAll(r5)
            r6.A03 = r2
            r6.A02()
        L_0x04f8:
            com.instagram.profile.fragment.UserDetailTabController r1 = r4.A01
            if (r1 == 0) goto L_0x04ff
            r1.A0H()
        L_0x04ff:
            r2 = 0
            r4.A01 = r2
            X.UpL r0 = (X.C16134UpL) r0
            java.util.List r8 = r0.A01
            com.instagram.profile.intf.AutoLaunchReelParams r0 = r4.A03
            if (r0 == 0) goto L_0x10fa
            java.lang.String r6 = r0.A04
            if (r6 == 0) goto L_0x10fa
            java.lang.Integer r7 = r0.A00
            if (r7 == 0) goto L_0x10fa
            boolean r3 = r0.A07
            boolean r0 = r8 instanceof java.util.Collection
            r5 = 1
            if (r0 == 0) goto L_0x059f
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x059f
        L_0x051f:
            r1 = 0
        L_0x0520:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r7 != r0) goto L_0x10fa
            if (r1 == 0) goto L_0x10fa
            java.util.Iterator r8 = r8.iterator()
        L_0x052a:
            boolean r0 = r8.hasNext()
            r7 = 0
            if (r0 == 0) goto L_0x059d
            java.lang.Object r1 = r8.next()
            r0 = r1
            X.WSc r0 = (X.C19269WSc) r0
            com.instagram.model.reels.Reel r0 = r0.A01
            java.lang.String r0 = r0.getId()
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x052a
        L_0x0544:
            X.WSc r1 = (X.C19269WSc) r1
            if (r1 == 0) goto L_0x059b
            com.instagram.model.reels.Reel r6 = r1.A01
            r6.A1d = r3
            r6.A1q = r5
        L_0x054e:
            X.32A r0 = r4.A04
            if (r0 == 0) goto L_0x055b
            X.6VJ r1 = r0.A07
            if (r1 == 0) goto L_0x055b
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            r1.A05(r0)
        L_0x055b:
            r4.A03 = r7
            X.0eM r0 = r4.A0D
            java.lang.Object r3 = r0.getValue()
            X.Jfd r3 = (X.C60097Jfd) r3
            com.instagram.common.session.UserSession r0 = r3.A02
            java.lang.String r1 = r0.A06
            java.lang.String r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x05be
            if (r6 == 0) goto L_0x10fa
            java.lang.String r3 = r6.getId()
            if (r3 == 0) goto L_0x05c0
            java.lang.String r1 = "myWeek"
            r0 = 0
            boolean r0 = X.00p.A0k(r3, r1, r0)
            if (r0 != r5) goto L_0x05c0
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0eM r0 = r4.A0C
            X.6Yo r1 = X.DbX.A0N(r1, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r0.A05
            X.H0y r0 = X.LT8.A05(r0)
            X.Dba.A0w(r2, r0, r1)
            goto L_0x10fa
        L_0x059b:
            r6 = r7
            goto L_0x054e
        L_0x059d:
            r1 = r7
            goto L_0x0544
        L_0x059f:
            java.util.Iterator r1 = r8.iterator()
        L_0x05a3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x051f
            java.lang.Object r0 = r1.next()
            X.WSc r0 = (X.C19269WSc) r0
            com.instagram.model.reels.Reel r0 = r0.A01
            java.lang.String r0 = r0.getId()
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x05a3
            r1 = 1
            goto L_0x0520
        L_0x05be:
            if (r6 == 0) goto L_0x10fa
        L_0x05c0:
            X.32A r1 = r4.A04
            if (r1 == 0) goto L_0x10fa
            X.3BQ r0 = X.AnonymousClass3BQ.HIGHLIGHTS_IN_GRID_SUBTAB
            r1.A03(r6, r0, r7)
            goto L_0x10fa
        L_0x05cb:
            X.UpM r1 = X.C16135UpM.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 != 0) goto L_0x05db
            X.UpN r1 = X.C16136UpN.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x10fa
        L_0x05db:
            java.lang.Object r0 = r4.A01
            X.Uat r0 = (X.C15343Uat) r0
            X.WWy r1 = r0.A02
            if (r1 == 0) goto L_0x10fa
            r0 = 1
            r1.A04 = r0
            r1.A02()
            goto L_0x10fa
        L_0x05eb:
            com.instagram.leadgen.core.model.LeadGenProfileContentInfo r0 = (com.instagram.leadgen.core.model.LeadGenProfileContentInfo) r0
            java.lang.Object r5 = r4.A01
            X.Umf r5 = (X.C15998Umf) r5
            X.C15998Umf.A04(r5, r0)
            if (r0 == 0) goto L_0x10fa
            r5.A07()
            com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r3 = r0.A01
            if (r3 == 0) goto L_0x10fa
            java.lang.Integer r2 = r3.A04
            if (r2 == 0) goto L_0x10fa
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x10fa
            com.instagram.leadgen.core.ui.LeadGenFormStaticHeaderView r1 = r5.A05
            if (r1 == 0) goto L_0x060c
            r1.A0D(r5, r0)
        L_0x060c:
            boolean r4 = r3.A01()
            if (r4 == 0) goto L_0x061b
            com.instagram.leadgen.core.ui.LeadGenFormStaticHeaderView r2 = r5.A05
            if (r2 == 0) goto L_0x061b
            X.WC0 r1 = X.WC0.A00
            r2.setOnTouchListener(r1)
        L_0x061b:
            com.instagram.leadgen.core.ui.LeadGenFormStaticHeaderView r3 = r5.A05
            if (r3 == 0) goto L_0x10fa
            r2 = 1
            X.W9v r1 = new X.W9v
            r1.<init>(r2, r0, r5, r4)
            X.AnonymousClass0fU.A00(r1, r3)
            goto L_0x10fa
        L_0x062a:
            boolean r5 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r4 = r4.A01
            X.Umf r4 = (X.C15998Umf) r4
            androidx.viewpager2.widget.ViewPager2 r2 = r4.A00
            r0 = 0
            r1 = 0
            if (r2 == 0) goto L_0x069e
            android.view.View r3 = X.AnonymousClass046.A00(r2, r0)
        L_0x063c:
            boolean r2 = r3 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L_0x064e
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            if (r3 == 0) goto L_0x064e
            androidx.viewpager2.widget.ViewPager2 r1 = r4.A00
            if (r1 == 0) goto L_0x064a
            int r0 = r1.A00
        L_0x064a:
            X.3kE r1 = r3.A0W(r0)
        L_0x064e:
            boolean r0 = r1 instanceof X.C14898UEa
            if (r0 == 0) goto L_0x065d
            X.UEa r1 = (X.C14898UEa) r1
            if (r1 == 0) goto L_0x065d
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r1.A09
            if (r0 == 0) goto L_0x065d
            r0.setPrimaryActionIsLoading(r5)
        L_0x065d:
            X.UnS r0 = X.C13990Tnq.A0R(r4)
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x10fa
            X.UYd r4 = r4.A03
            if (r4 == 0) goto L_0x10fa
            X.QAL r0 = r4.A00
            java.lang.String r1 = "dialog"
            if (r0 == 0) goto L_0x06b0
            r3 = r5 ^ 1
            r0.setCancelable(r3)
            X.QAL r0 = r4.A00
            if (r0 == 0) goto L_0x06b0
            r0.setCanceledOnTouchOutside(r3)
            X.QAL r0 = r4.A00
            if (r0 == 0) goto L_0x06b0
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.A06()
            r0.A0N = r3
            X.QAL r0 = r4.A00
            if (r0 == 0) goto L_0x06b0
            X.00N r2 = r0.A01
            r1 = 18
            X.Iwj r0 = new X.Iwj
            r0.<init>(r1, r4, r5)
            X.AnonymousClass00O.A00(r2, r4, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A03
            if (r0 == 0) goto L_0x10fa
            r0.setClickable(r3)
            goto L_0x10fa
        L_0x069e:
            r3 = r1
            goto L_0x063c
        L_0x06a0:
            X.V2Y r0 = (X.V2Y) r0
            boolean r1 = r0 instanceof X.C16210UqZ
            if (r1 == 0) goto L_0x10fa
            java.lang.Object r4 = r4.A01
            X.UZq r4 = (X.C15286UZq) r4
            X.TpO r3 = r4.A06
            if (r3 != 0) goto L_0x06b8
            java.lang.String r1 = "grid"
        L_0x06b0:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x06b8:
            r2 = 0
            r1 = 1
            X.C14074TpO.A00(r3, r2, r1)
            X.UqZ r0 = (X.C16210UqZ) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x10fa
            X.0wc r1 = r4.A02
            if (r1 != 0) goto L_0x06ca
            java.lang.String r1 = "typedLogger"
            goto L_0x06b0
        L_0x06ca:
            java.lang.String r0 = "instagram_serp_media_results_displayed"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x10fa
            X.UZa r3 = r4.A06()
            java.lang.String r1 = r3.A0L
            if (r1 == 0) goto L_0x074f
            java.lang.String r0 = "serp_session_id"
            r2.AAJ(r0, r1)
            X.N4N r0 = X.C13989Tnp.A0b(r4)
            boolean r0 = r0.A0M
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_mixed_serp_content"
            r2.A7p(r0, r1)
            java.lang.String r1 = r3.A04()
            java.lang.String r0 = "search_session_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = X.C13988Tno.A0Y(r4)
            java.lang.String r0 = "rank_token"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0J
            if (r1 == 0) goto L_0x111c
            java.lang.String r0 = "query_text"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0I
            java.lang.String r0 = "prior_serp_session_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0H
            java.lang.String r0 = "prior_query_text"
            X.C51973G9u.A14(r2, r0, r1)
            X.UZa r0 = r4.A06()
            java.lang.String r1 = r0.A0M
            java.lang.String r0 = "source"
            r2.AAJ(r0, r1)
            java.lang.String r0 = r3.A0J
            if (r0 == 0) goto L_0x111c
            boolean r0 = X.C253063q9.A02(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_tag"
            r2.A7p(r0, r1)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER"
            java.lang.String r1 = r1.getString(r0)
            r0 = 982(0x3d6, float:1.376E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.AAJ(r0, r1)
            r2.Cgf()
            goto L_0x10fa
        L_0x074f:
            java.lang.String r5 = "serpSessionId"
            goto L_0x111e
        L_0x0753:
            java.util.List r0 = (java.util.List) r0
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            if (r1 == 0) goto L_0x10fa
            java.lang.Object r3 = r4.A01
            X.Umf r3 = (X.C15998Umf) r3
            X.U9h r2 = r3.A04
            if (r2 == 0) goto L_0x076b
            X.Wjx r1 = new X.Wjx
            r1.<init>(r3)
            r2.submitList(r0, r1)
        L_0x076b:
            androidx.viewpager2.widget.ViewPager2 r0 = r3.A00
            if (r0 == 0) goto L_0x078e
            int r1 = r0.A00
        L_0x0771:
            r0 = 0
            X.C15998Umf.A03(r3, r1, r0)
            X.UnS r0 = X.C13990Tnq.A0R(r3)
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x10fa
            X.UnS r0 = X.C13990Tnq.A0R(r3)
            X.05G r0 = r0.A0b
            java.lang.Object r0 = r0.getValue()
            com.instagram.leadgen.core.model.LeadGenProfileContentInfo r0 = (com.instagram.leadgen.core.model.LeadGenProfileContentInfo) r0
            X.C15998Umf.A04(r3, r0)
            goto L_0x10fa
        L_0x078e:
            r1 = 0
            goto L_0x0771
        L_0x0790:
            java.util.List r0 = (java.util.List) r0
            r1 = r20
            java.lang.Object r1 = r4.A00(r0, r1)
            return r1
        L_0x0799:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r4.A01
            X.Umd r1 = (X.C15996Umd) r1
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r1.A04
            if (r1 == 0) goto L_0x10fa
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r1.setPrimaryButtonEnabled(r0)
            goto L_0x10fa
        L_0x07ac:
            X.VSn r0 = (X.C17360VSn) r0
            r2 = 1
            if (r0 == 0) goto L_0x10fa
            java.util.List r3 = r0.A01
            boolean r1 = X.AnonymousClass7TE.A1b(r3)
            if (r1 != r2) goto L_0x10fa
            java.lang.Object r5 = r4.A01
            com.instagram.leadads.activity.LeadAdsActivity r5 = (com.instagram.leadads.activity.LeadAdsActivity) r5
            r5.A03 = r2
            int r2 = r0.A00
            java.lang.Object r0 = r3.get(r2)
            X.WWa r0 = (X.C19359WWa) r0
            X.1Xj r0 = r0.A02
            com.instagram.leadads.activity.LeadAdsActivity.A01(r0, r5)
            java.lang.Object r0 = r3.get(r2)
            X.WWa r0 = (X.C19359WWa) r0
            java.lang.String r6 = r0.A07
            java.lang.String r1 = ""
            if (r6 != 0) goto L_0x07d9
            r6 = r1
        L_0x07d9:
            X.0eM r0 = r5.A0A
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r0 = r3.get(r2)
            X.WWa r0 = (X.C19359WWa) r0
            java.lang.String r7 = r0.A08
            if (r7 != 0) goto L_0x07ea
            r7 = r1
        L_0x07ea:
            java.lang.Object r0 = r3.get(r2)
            X.WWa r0 = (X.C19359WWa) r0
            java.lang.String r8 = r0.A03
            if (r8 != 0) goto L_0x07f5
            r8 = r1
        L_0x07f5:
            r9 = 0
            com.instagram.leadads.activity.LeadAdsActivity.A00(r4, r5, r6, r7, r8, r9)
            X.WYW r0 = r5.A00
            if (r0 == 0) goto L_0x10fa
            r0.A00 = r2
            goto L_0x10fa
        L_0x0801:
            X.Jw6 r0 = (X.C61068Jw6) r0
            java.lang.Object r5 = r4.A01
            X.UYz r5 = (X.UYz) r5
            java.lang.Object r6 = r0.A04
            X.ULF r6 = (X.ULF) r6
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r5.A07
            if (r1 != 0) goto L_0x0819
            java.lang.String r6 = "useCurrentLocationSwitch"
        L_0x0811:
            X.0qQ.A0F(r6)
        L_0x0814:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0819:
            boolean r0 = r6.A06
            r1.setCheckedAnimated(r0)
            int r8 = r6.A01
            X.0eM r0 = r5.A0D
            java.lang.Object r4 = r0.getValue()
            X.U92 r4 = (X.U92) r4
            X.ULF r0 = r4.A0A()
            boolean r3 = r0.A06
            r1 = 0
            X.ULF r0 = r4.A0A()
            if (r3 == 0) goto L_0x0889
            com.instagram.business.promote.model.AudienceGeoLocation r0 = r0.A02
        L_0x0838:
            if (r0 == 0) goto L_0x0883
            double r3 = r0.A00
            double r1 = r0.A01
            com.facebook.android.maps.model.LatLng r0 = new com.facebook.android.maps.model.LatLng
            r0.<init>(r3, r1)
        L_0x0843:
            java.lang.String r1 = "promote_audience_creation_map"
            com.facebook.android.maps.StaticMapView$StaticMapOptions r7 = new com.facebook.android.maps.StaticMapView$StaticMapOptions
            r7.<init>(r1)
            double r3 = r0.A00
            double r1 = r0.A01
            r7.A02(r3, r1)
            android.content.Context r3 = r5.requireContext()
            android.content.Context r2 = r5.getContext()
            r1 = 2130970245(0x7f040685, float:1.7549195E38)
            int r3 = X.JTP.A02(r2, r3, r1)
            X.W2W r1 = X.C17149VKb.A00
            android.content.Context r1 = r5.requireContext()
            com.instagram.business.promote.model.DistanceUnit r2 = X.W2W.A01(r1)
            com.instagram.business.promote.model.DistanceUnit r1 = com.instagram.business.promote.model.DistanceUnit.MILE
            if (r2 != r1) goto L_0x0880
            float r2 = (float) r8
            r1 = 1154034401(0x44c92ae1, float:1609.34)
            int r1 = X.AnonymousClass7TE.A06(r2, r1)
        L_0x0876:
            r7.A04(r0, r3, r1)
            com.instagram.maps.ui.IgStaticMapView r0 = r5.A08
            if (r0 != 0) goto L_0x088c
            java.lang.String r6 = "mapView"
            goto L_0x0811
        L_0x0880:
            int r1 = r8 * 1000
            goto L_0x0876
        L_0x0883:
            com.facebook.android.maps.model.LatLng r0 = new com.facebook.android.maps.model.LatLng
            r0.<init>(r1, r1)
            goto L_0x0843
        L_0x0889:
            com.instagram.business.promote.model.AudienceGeoLocation r0 = r0.A03
            goto L_0x0838
        L_0x088c:
            r0.setMapOptions(r7)
            boolean r1 = r6.A06
            r3 = 8
            java.lang.String r4 = "customAddressEntry"
            android.view.View r0 = r5.A00
            if (r1 == 0) goto L_0x08a0
            if (r0 == 0) goto L_0x08f5
            r0.setVisibility(r3)
            goto L_0x10fa
        L_0x08a0:
            if (r0 == 0) goto L_0x08f5
            r1 = 0
            r0.setVisibility(r1)
            com.instagram.business.promote.model.AudienceGeoLocation r2 = r6.A03
            java.lang.String r6 = "customAddressTitle"
            java.lang.String r4 = "customAddressDisplayName"
            android.widget.TextView r0 = r5.A03
            if (r2 != 0) goto L_0x08d7
            if (r0 == 0) goto L_0x0811
            r0.setVisibility(r3)
            android.widget.TextView r1 = r5.A01
            if (r1 == 0) goto L_0x08f5
            r0 = 2131970325(0x7f134915, float:1.9577598E38)
            r1.setText(r0)
            android.widget.TextView r3 = r5.A01
            if (r3 == 0) goto L_0x08f5
            android.content.Context r2 = r5.requireContext()
            android.content.Context r1 = r5.getContext()
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
        L_0x08ce:
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A17(r2, r3, r0)
            goto L_0x10fa
        L_0x08d7:
            if (r0 == 0) goto L_0x0811
            r0.setVisibility(r1)
            android.widget.TextView r1 = r5.A01
            if (r1 == 0) goto L_0x08f5
            java.lang.String r0 = r2.A05
            r1.setText(r0)
            android.widget.TextView r3 = r5.A01
            if (r3 == 0) goto L_0x08f5
            android.content.Context r2 = r5.requireContext()
            android.content.Context r1 = r5.getContext()
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            goto L_0x08ce
        L_0x08f5:
            X.0qQ.A0F(r4)
            goto L_0x0814
        L_0x08fa:
            X.Jw6 r0 = (X.C61068Jw6) r0
            java.lang.Object r5 = r4.A01
            X.6Ky r5 = (X.C306146Ky) r5
            java.lang.Object r4 = r0.A03
            X.ULv r4 = (X.C15053ULv) r4
            java.lang.String r3 = r4.A05
            if (r3 == 0) goto L_0x0937
            android.widget.EditText r2 = r5.A0B
            if (r2 == 0) goto L_0x0919
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r2)
            boolean r1 = X.0qQ.A0K(r1, r3)
            if (r1 != 0) goto L_0x0919
            r2.setText(r3)
        L_0x0919:
            android.widget.TextView r2 = r5.A0F
            if (r2 == 0) goto L_0x0928
            int r1 = r3.length()
            int r1 = X.JTQ.A01(r1)
            r2.setVisibility(r1)
        L_0x0928:
            android.widget.ImageView r2 = r5.A0C
            if (r2 == 0) goto L_0x0937
            int r1 = r3.length()
            if (r1 <= 0) goto L_0x093f
            android.graphics.drawable.Drawable r1 = r5.A00
        L_0x0934:
            r2.setImageDrawable(r1)
        L_0x0937:
            java.util.List r2 = r4.A07
            r7 = 8
            r3 = 0
            if (r2 == 0) goto L_0x0964
            goto L_0x0942
        L_0x093f:
            android.graphics.drawable.Drawable r1 = r5.A01
            goto L_0x0934
        L_0x0942:
            boolean r1 = r2.isEmpty()     // Catch:{ NotFoundException -> 0x097a }
            if (r1 != 0) goto L_0x0964
            android.content.Context r1 = r5.getContext()     // Catch:{ NotFoundException -> 0x097a }
            if (r1 == 0) goto L_0x0984
            java.lang.String r2 = X.W3x.A0E(r1, r2)     // Catch:{ NotFoundException -> 0x097a }
            android.widget.TextView r1 = r5.A0L     // Catch:{ NotFoundException -> 0x097a }
            if (r1 == 0) goto L_0x095c
            r1.setText(r2)     // Catch:{ NotFoundException -> 0x097a }
            r1.setVisibility(r3)     // Catch:{ NotFoundException -> 0x097a }
        L_0x095c:
            android.widget.TextView r1 = r5.A0M     // Catch:{ NotFoundException -> 0x097a }
            if (r1 == 0) goto L_0x0984
            X.C13992Tns.A0d(r1, r5)     // Catch:{ NotFoundException -> 0x097a }
            goto L_0x0984
        L_0x0964:
            android.widget.TextView r1 = r5.A0L     // Catch:{ NotFoundException -> 0x097a }
            if (r1 == 0) goto L_0x096b
            r1.setVisibility(r7)     // Catch:{ NotFoundException -> 0x097a }
        L_0x096b:
            android.widget.TextView r6 = r5.A0M     // Catch:{ NotFoundException -> 0x097a }
            if (r6 == 0) goto L_0x0984
            android.content.res.Resources r2 = X.DbV.A05(r5)     // Catch:{ NotFoundException -> 0x097a }
            r1 = 2131165220(0x7f070024, float:1.794465E38)
            X.C13990Tnq.A0o(r2, r6, r1)     // Catch:{ NotFoundException -> 0x097a }
            goto L_0x0984
        L_0x097a:
            android.view.View r2 = r5.A09
            if (r2 == 0) goto L_0x0984
            r1 = 2131435695(0x7f0b20af, float:1.849324E38)
            X.DbX.A1D(r2, r1, r7)
        L_0x0984:
            java.util.List r6 = r4.A08
            X.U92 r1 = X.C306146Ky.A01(r5)
            X.ULv r1 = r1.A09()
            com.instagram.api.schemas.AdvantageAudienceData r1 = r1.A02
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r2 = X.C13991Tnr.A0L(r1)
            android.view.View r8 = r5.A06
            if (r8 == 0) goto L_0x09b0
            if (r2 == 0) goto L_0x09ac
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.OFF
            if (r2 == r1) goto L_0x09ac
            X.0eM r1 = r5.A0S
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            boolean r2 = X.C18803W2r.A06(r1)
            r1 = 8
            if (r2 != 0) goto L_0x09ad
        L_0x09ac:
            r1 = 0
        L_0x09ad:
            r8.setVisibility(r1)
        L_0x09b0:
            if (r6 == 0) goto L_0x09d2
            boolean r1 = r6.isEmpty()     // Catch:{ NotFoundException -> 0x09e8 }
            if (r1 != 0) goto L_0x09d2
            android.widget.TextView r2 = r5.A0H     // Catch:{ NotFoundException -> 0x09e8 }
            if (r2 == 0) goto L_0x09ca
            android.content.Context r1 = r5.requireContext()     // Catch:{ NotFoundException -> 0x09e8 }
            java.lang.String r1 = X.W3x.A0D(r1, r6)     // Catch:{ NotFoundException -> 0x09e8 }
            r2.setText(r1)     // Catch:{ NotFoundException -> 0x09e8 }
            r2.setVisibility(r3)     // Catch:{ NotFoundException -> 0x09e8 }
        L_0x09ca:
            android.widget.TextView r1 = r5.A0J     // Catch:{ NotFoundException -> 0x09e8 }
            if (r1 == 0) goto L_0x09f2
            X.C13992Tns.A0d(r1, r5)     // Catch:{ NotFoundException -> 0x09e8 }
            goto L_0x09f2
        L_0x09d2:
            android.widget.TextView r1 = r5.A0H     // Catch:{ NotFoundException -> 0x09e8 }
            if (r1 == 0) goto L_0x09d9
            r1.setVisibility(r7)     // Catch:{ NotFoundException -> 0x09e8 }
        L_0x09d9:
            android.widget.TextView r8 = r5.A0J     // Catch:{ NotFoundException -> 0x09e8 }
            if (r8 == 0) goto L_0x09f2
            android.content.res.Resources r2 = X.DbV.A05(r5)     // Catch:{ NotFoundException -> 0x09e8 }
            r1 = 2131165220(0x7f070024, float:1.794465E38)
            X.C13990Tnq.A0o(r2, r8, r1)     // Catch:{ NotFoundException -> 0x09e8 }
            goto L_0x09f2
        L_0x09e8:
            android.view.View r2 = r5.A09
            if (r2 == 0) goto L_0x09f2
            r1 = 2131434985(0x7f0b1de9, float:1.84918E38)
            X.DbX.A1D(r2, r1, r7)
        L_0x09f2:
            int r9 = r4.A01
            int r8 = r4.A00
            java.util.List r2 = r4.A06
            if (r2 == 0) goto L_0x0a18
            if (r8 == 0) goto L_0x0a18
            if (r9 == 0) goto L_0x0a18
            android.content.Context r1 = r5.requireContext()     // Catch:{ NotFoundException -> 0x0a3c }
            java.lang.String r2 = X.W3x.A0F(r1, r2, r9, r8)     // Catch:{ NotFoundException -> 0x0a3c }
            android.widget.TextView r1 = r5.A0D     // Catch:{ NotFoundException -> 0x0a3c }
            if (r1 == 0) goto L_0x0a10
            r1.setText(r2)     // Catch:{ NotFoundException -> 0x0a3c }
            r1.setVisibility(r3)     // Catch:{ NotFoundException -> 0x0a3c }
        L_0x0a10:
            android.widget.TextView r1 = r5.A0E     // Catch:{ NotFoundException -> 0x0a3c }
            if (r1 == 0) goto L_0x0a26
            X.C13992Tns.A0d(r1, r5)     // Catch:{ NotFoundException -> 0x0a3c }
            goto L_0x0a26
        L_0x0a18:
            android.widget.TextView r1 = r5.A0D     // Catch:{ NotFoundException -> 0x0a3c }
            if (r1 == 0) goto L_0x0a1f
            r1.setVisibility(r7)     // Catch:{ NotFoundException -> 0x0a3c }
        L_0x0a1f:
            android.widget.TextView r1 = r5.A0E     // Catch:{ NotFoundException -> 0x0a3c }
            if (r1 == 0) goto L_0x0a26
            X.C13992Tns.A0d(r1, r5)     // Catch:{ NotFoundException -> 0x0a3c }
        L_0x0a26:
            boolean r1 = X.C306146Ky.A03(r5)     // Catch:{ NotFoundException -> 0x0a3c }
            if (r1 == 0) goto L_0x0a34
            android.view.View r1 = r5.A02     // Catch:{ NotFoundException -> 0x0a3c }
            if (r1 == 0) goto L_0x0a46
            r1.setVisibility(r7)     // Catch:{ NotFoundException -> 0x0a3c }
            goto L_0x0a46
        L_0x0a34:
            android.view.View r1 = r5.A02     // Catch:{ NotFoundException -> 0x0a3c }
            if (r1 == 0) goto L_0x0a46
            r1.setVisibility(r3)     // Catch:{ NotFoundException -> 0x0a3c }
            goto L_0x0a46
        L_0x0a3c:
            android.view.View r2 = r5.A09
            if (r2 == 0) goto L_0x0a46
            r1 = 2131427849(0x7f0b0209, float:1.8477326E38)
            X.DbX.A1D(r2, r1, r7)
        L_0x0a46:
            com.instagram.api.schemas.AdvantageAudienceData r11 = r4.A02
            r10 = 0
            if (r11 == 0) goto L_0x0b62
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = r11.Aa9()
        L_0x0a4f:
            if (r11 == 0) goto L_0x0b5f
            java.lang.Integer r12 = r11.BT2()
        L_0x0a55:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r8 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r1 != r8) goto L_0x0b56
            X.0eM r1 = r5.A0S
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            boolean r1 = X.C18803W2r.A06(r1)
            if (r1 == 0) goto L_0x0b56
            X.WGU r4 = X.C306146Ky.A00(r5)
            X.U92 r1 = X.C306146Ky.A01(r5)
            X.UzE r2 = r1.A08()
            java.lang.String r1 = "minimum_age_constraint"
            r4.A0H(r2, r1)
            android.view.View r1 = r5.A0A
            if (r1 == 0) goto L_0x0a7d
            r1.setVisibility(r3)
        L_0x0a7d:
            if (r12 == 0) goto L_0x0aa0
            android.widget.TextView r1 = r5.A0N
            if (r1 == 0) goto L_0x0a86
            r1.setVisibility(r3)
        L_0x0a86:
            android.widget.TextView r9 = r5.A0N
            if (r9 == 0) goto L_0x0aa0
            android.content.Context r4 = r5.requireContext()
            int r1 = r12.intValue()
            r2 = 2131970339(0x7f134923, float:1.9577626E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = X.DbY.A0c(r4, r1, r2)
            r9.setText(r1)
        L_0x0aa0:
            if (r11 == 0) goto L_0x0aa6
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r10 = r11.Aa9()
        L_0x0aa6:
            r4 = 0
            if (r10 != r8) goto L_0x0b4d
            X.0eM r1 = r5.A0S
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            boolean r1 = X.C18803W2r.A06(r1)
            if (r1 == 0) goto L_0x0b4d
            X.WGU r7 = X.C306146Ky.A00(r5)
            X.U92 r1 = X.C306146Ky.A01(r5)
            X.UzE r2 = r1.A08()
            java.lang.String r1 = "optional_suggestions"
            r7.A0H(r2, r1)
            android.view.View r1 = r5.A03
            if (r1 == 0) goto L_0x0acd
            r1.setVisibility(r3)
        L_0x0acd:
            android.view.View r2 = r5.A05
            if (r2 == 0) goto L_0x0ae4
            X.U92 r1 = X.C306146Ky.A01(r5)
            X.ULv r1 = r1.A09()
            boolean r1 = r1.A09
            r1 = r1 ^ 1
            int r1 = X.DbW.A01(r1)
            r2.setVisibility(r1)
        L_0x0ae4:
            android.view.View r2 = r5.A04
            if (r2 == 0) goto L_0x0af9
            X.U92 r1 = X.C306146Ky.A01(r5)
            X.ULv r1 = r1.A09()
            boolean r1 = r1.A09
            if (r1 != 0) goto L_0x0af6
            r4 = 8
        L_0x0af6:
            r2.setVisibility(r4)
        L_0x0af9:
            android.widget.TextView r7 = r5.A0G
            if (r7 == 0) goto L_0x0b16
            android.content.Context r4 = r5.requireContext()
            X.U92 r1 = X.C306146Ky.A01(r5)
            X.ULv r1 = r1.A09()
            boolean r2 = r1.A09
            r1 = 2131970348(0x7f13492c, float:1.9577645E38)
            if (r2 == 0) goto L_0x0b13
            r1 = 2131970346(0x7f13492a, float:1.957764E38)
        L_0x0b13:
            X.DbT.A18(r4, r7, r1)
        L_0x0b16:
            android.view.View r7 = r5.A07
            r4 = 8
            if (r7 == 0) goto L_0x0b4a
            X.U92 r1 = X.C306146Ky.A01(r5)
            X.ULv r1 = r1.A09()
            com.instagram.api.schemas.AdvantageAudienceData r1 = r1.A02
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = X.C13991Tnr.A0L(r1)
            if (r1 != r8) goto L_0x0b45
            X.U92 r1 = X.C306146Ky.A01(r5)
            X.ULv r1 = r1.A09()
            boolean r1 = r1.A09
            if (r1 == 0) goto L_0x0b45
            X.0eM r1 = r5.A0S
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            boolean r2 = X.C18803W2r.A06(r1)
            r1 = 0
            if (r2 != 0) goto L_0x0b47
        L_0x0b45:
            r1 = 8
        L_0x0b47:
            r7.setVisibility(r1)
        L_0x0b4a:
            if (r6 == 0) goto L_0x0b85
            goto L_0x0b65
        L_0x0b4d:
            android.view.View r1 = r5.A03
            if (r1 == 0) goto L_0x0acd
            r1.setVisibility(r7)
            goto L_0x0acd
        L_0x0b56:
            android.view.View r1 = r5.A0A
            if (r1 == 0) goto L_0x0aa0
            r1.setVisibility(r7)
            goto L_0x0aa0
        L_0x0b5f:
            r12 = r10
            goto L_0x0a55
        L_0x0b62:
            r1 = r10
            goto L_0x0a4f
        L_0x0b65:
            boolean r1 = r6.isEmpty()     // Catch:{ NotFoundException -> 0x0b9b }
            if (r1 != 0) goto L_0x0b85
            android.widget.TextView r2 = r5.A0I     // Catch:{ NotFoundException -> 0x0b9b }
            if (r2 == 0) goto L_0x0b7d
            android.content.Context r1 = r5.requireContext()     // Catch:{ NotFoundException -> 0x0b9b }
            java.lang.String r1 = X.W3x.A0D(r1, r6)     // Catch:{ NotFoundException -> 0x0b9b }
            r2.setText(r1)     // Catch:{ NotFoundException -> 0x0b9b }
            r2.setVisibility(r3)     // Catch:{ NotFoundException -> 0x0b9b }
        L_0x0b7d:
            android.widget.TextView r1 = r5.A0K     // Catch:{ NotFoundException -> 0x0b9b }
            if (r1 == 0) goto L_0x0ba5
            X.C13992Tns.A0d(r1, r5)     // Catch:{ NotFoundException -> 0x0b9b }
            goto L_0x0ba5
        L_0x0b85:
            android.widget.TextView r1 = r5.A0I     // Catch:{ NotFoundException -> 0x0b9b }
            if (r1 == 0) goto L_0x0b8c
            r1.setVisibility(r4)     // Catch:{ NotFoundException -> 0x0b9b }
        L_0x0b8c:
            android.widget.TextView r3 = r5.A0K     // Catch:{ NotFoundException -> 0x0b9b }
            if (r3 == 0) goto L_0x0ba5
            android.content.res.Resources r2 = X.DbV.A05(r5)     // Catch:{ NotFoundException -> 0x0b9b }
            r1 = 2131165220(0x7f070024, float:1.794465E38)
            X.C13990Tnq.A0o(r2, r3, r1)     // Catch:{ NotFoundException -> 0x0b9b }
            goto L_0x0ba5
        L_0x0b9b:
            android.view.View r2 = r5.A09
            if (r2 == 0) goto L_0x0ba5
            r1 = 2131434985(0x7f0b1de9, float:1.84918E38)
            X.DbX.A1D(r2, r1, r4)
        L_0x0ba5:
            X.VvD r2 = r5.A0R
            if (r2 == 0) goto L_0x0bb0
            java.lang.Object r1 = r0.A05
            X.JwK r1 = (X.C61082JwK) r1
            r2.A02(r1)
        L_0x0bb0:
            X.Vvl r1 = r5.A0Q
            if (r1 == 0) goto L_0x0bbb
            boolean r2 = r0.A00
            X.2da r1 = r1.A01
            r1.setIsLoading(r2)
        L_0x0bbb:
            boolean r1 = r0.A01
            X.U92 r0 = X.C306146Ky.A01(r5)
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0c39
            if (r1 == 0) goto L_0x0c39
            android.view.View r4 = r5.A08
            if (r4 != 0) goto L_0x0c32
            android.view.View r1 = r5.A09
            if (r1 == 0) goto L_0x0c37
            r0 = 2131434976(0x7f0b1de0, float:1.8491781E38)
            android.view.View r4 = r1.findViewById(r0)
            if (r4 == 0) goto L_0x0c37
            r0 = 2131442375(0x7f0b3ac7, float:1.8506788E38)
            android.view.View r2 = r4.findViewById(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r2
            if (r2 == 0) goto L_0x0c00
            r1 = 4
            X.WYN r0 = new X.WYN
            r0.<init>(r5, r1)
            r2.A07 = r0
            com.instagram.api.schemas.TargetingRelaxationConstants r1 = com.instagram.api.schemas.TargetingRelaxationConstants.EXPANSION
            X.U92 r0 = X.C306146Ky.A01(r5)
            X.ULv r0 = r0.A09()
            com.instagram.api.schemas.TargetingRelaxationConstants r0 = r0.A03
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r2.setChecked(r0)
        L_0x0c00:
            r0 = 2131440491(0x7f0b336b, float:1.8502967E38)
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r4, r0)
            if (r3 == 0) goto L_0x0c30
            r0 = 2131970319(0x7f13490f, float:1.9577586E38)
            java.lang.String r0 = r5.getString(r0)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r0)
            r0 = 2131970321(0x7f134911, float:1.957759E38)
            java.lang.String r1 = X.DbU.A0m(r5, r0)
            java.lang.String r0 = "https://www.facebook.com/business/help/283579896000936"
            X.C306146Ky.A02(r2, r5, r1, r0)
            r0 = 2131970320(0x7f134910, float:1.9577588E38)
            java.lang.String r1 = X.DbU.A0m(r5, r0)
            java.lang.String r0 = "https://www.facebook.com/business/help/128066880933676?id=176276233019487"
            X.C306146Ky.A02(r2, r5, r1, r0)
            X.DbX.A1G(r3, r2)
        L_0x0c30:
            r5.A08 = r4
        L_0x0c32:
            if (r4 == 0) goto L_0x10fa
            r0 = 0
            goto L_0x0cb6
        L_0x0c37:
            r4 = 0
            goto L_0x0c30
        L_0x0c39:
            android.view.View r1 = r5.A09
            if (r1 == 0) goto L_0x10fa
            r0 = 2131434976(0x7f0b1de0, float:1.8491781E38)
            android.view.View r4 = r1.findViewById(r0)
            goto L_0x0cb2
        L_0x0c45:
            X.Jw6 r0 = (X.C61068Jw6) r0
            java.lang.Object r1 = r4.A01
            X.UZP r1 = (X.UZP) r1
            X.UZP.A00(r1)
            X.VvD r1 = r1.A02
            if (r1 == 0) goto L_0x10fa
            java.lang.Object r0 = r0.A05
            X.JwK r0 = (X.C61082JwK) r0
            r1.A02(r0)
            goto L_0x10fa
        L_0x0c5b:
            X.UKf r0 = (X.C15026UKf) r0
            java.lang.Object r1 = r4.A01
            X.U8z r1 = (X.C14788U8z) r1
            r1.A00 = r0
            X.05G r3 = r1.A0E
        L_0x0c65:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.UL6 r1 = (X.UL6) r1
            X.ULZ r8 = r0.A03
            X.N4Q r7 = r0.A02
            java.lang.String r9 = r0.A08
            boolean r11 = r1.A06
            X.ULT r5 = r1.A00
            X.JVf r6 = r1.A01
            boolean r12 = r1.A05
            r10 = 0
            X.AnonymousClass7TG.A1Q(r5, r6)
            X.UL6 r4 = new X.UL6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = r3.AIY(r2, r4)
            if (r1 == 0) goto L_0x0c65
            goto L_0x10fa
        L_0x0c8b:
            X.UL6 r0 = (X.UL6) r0
            java.lang.Object r1 = r4.A01
            X.Ua6 r1 = (X.C15299Ua6) r1
            boolean r3 = r0.A06
            r6 = 1
            r5 = 0
            X.Vw9 r2 = r1.A03
            if (r3 == 0) goto L_0x0cbb
            if (r2 == 0) goto L_0x0c9e
            r2.A05(r6)
        L_0x0c9e:
            X.Vvl r2 = r1.A04
            if (r2 == 0) goto L_0x0ca5
            r2.A03(r5)
        L_0x0ca5:
            boolean r2 = r0.A07
            if (r2 == 0) goto L_0x0cc8
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r1.A07
            if (r0 == 0) goto L_0x0cb0
            X.DbS.A1T(r0)
        L_0x0cb0:
            android.view.View r4 = r1.A01
        L_0x0cb2:
            if (r4 == 0) goto L_0x10fa
            r0 = 8
        L_0x0cb6:
            r4.setVisibility(r0)
            goto L_0x10fa
        L_0x0cbb:
            if (r2 == 0) goto L_0x0cc0
            r2.A05(r5)
        L_0x0cc0:
            X.Vvl r2 = r1.A04
            if (r2 == 0) goto L_0x0ca5
            r2.A03(r6)
            goto L_0x0ca5
        L_0x0cc8:
            androidx.fragment.app.FragmentActivity r4 = r1.getActivity()
            boolean r2 = r4 instanceof X.X7g
            if (r2 == 0) goto L_0x0cdf
            X.X7g r4 = (X.X7g) r4
            if (r4 == 0) goto L_0x0cdf
            java.lang.String r3 = "boost_package_fragment"
            X.UzE r2 = X.C16678UzE.BOOST_PACKAGES
            java.lang.String r2 = r2.toString()
            r4.Clv(r3, r2)
        L_0x0cdf:
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r1.A07
            if (r2 == 0) goto L_0x0ce6
            X.JTO.A1X(r2)
        L_0x0ce6:
            android.view.View r2 = r1.A01
            if (r2 == 0) goto L_0x0ced
            r2.setVisibility(r5)
        L_0x0ced:
            X.ULT r2 = r0.A00
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r8 = r1.A05
            if (r8 == 0) goto L_0x0d4e
            int r7 = r2.A01
            int r4 = r2.A02
            int r3 = r2.A03
            r2 = 2
            if (r3 < r2) goto L_0x0e24
            if (r7 < 0) goto L_0x0e24
            if (r7 >= r3) goto L_0x0e24
            if (r4 >= r3) goto L_0x0e24
            r8.setVisibility(r5)
            boolean r2 = X.C51970G9q.A1W(r4, r7)
            r8.A03(r7, r3, r6, r2)
            if (r4 == r7) goto L_0x0d4e
            r8.A01()
            X.0eM r2 = r1.A0G
            java.lang.Object r2 = r2.getValue()
            X.U8z r2 = (X.C14788U8z) r2
            X.05G r7 = r2.A0E
        L_0x0d1b:
            java.lang.Object r8 = r7.getValue()
            r9 = r8
            X.UL6 r9 = (X.UL6) r9
            X.ULT r2 = r9.A00
            int r3 = r2.A01
            int r2 = r2.A03
            r4 = 3
            X.ULT r10 = new X.ULT
            r10.<init>(r3, r3, r2, r4)
            boolean r15 = r9.A07
            boolean r3 = r9.A06
            X.JVf r11 = r9.A01
            boolean r2 = r9.A05
            X.ULZ r13 = r9.A03
            X.N4Q r12 = r9.A02
            java.lang.String r14 = r9.A04
            X.0qQ.A0B(r11, r4)
            X.UL6 r9 = new X.UL6
            r16 = r3
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r2 = r7.AIY(r8, r9)
            if (r2 == 0) goto L_0x0d1b
        L_0x0d4e:
            X.JVf r7 = r0.A01
            com.instagram.ui.widget.radiogroup.IgRadioGroup r2 = r1.A06
            if (r2 != 0) goto L_0x0e5d
            android.view.View r3 = r1.mView
            if (r3 == 0) goto L_0x0e21
            r2 = 2131428867(0x7f0b0603, float:1.847939E38)
            android.view.View r4 = r3.findViewById(r2)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r4 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r4
        L_0x0d61:
            r1.A06 = r4
            if (r4 == 0) goto L_0x0e5d
            r4.removeAllViews()
            r13 = 0
            r4.setVisibility(r5)
            android.content.Context r11 = r1.getContext()
            if (r11 == 0) goto L_0x0e56
            java.lang.Object r2 = r7.A00
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r16 = r2.iterator()
        L_0x0d7e:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0e2b
            java.lang.Object r3 = r16.next()
            int r15 = r13 + 1
            if (r13 >= 0) goto L_0x0d94
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0d94:
            X.UKT r3 = (X.UKT) r3
            X.U5O r10 = new X.U5O
            r10.<init>(r11)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r10.setTag(r2)
            java.lang.String r2 = r3.A05
            r10.setPrimaryText((java.lang.CharSequence) r2)
            r10.A04(r5)
            java.lang.String r2 = r3.A04
            if (r2 == 0) goto L_0x0db4
            r10.setSecondaryText((java.lang.String) r2)
            r10.A04(r6)
        L_0x0db4:
            r2 = 2131437667(0x7f0b2863, float:1.849724E38)
            android.widget.TextView r14 = X.AnonymousClass7TE.A0d(r10, r2)
            if (r14 == 0) goto L_0x0dd9
            r2 = 8
            r14.setVisibility(r2)
            java.lang.String r12 = r3.A02
            if (r12 == 0) goto L_0x0dd9
            r14.setText(r12)
            r14.setVisibility(r5)
            java.lang.String r9 = r3.A03
            if (r9 == 0) goto L_0x0dd9
            r3 = 4
            X.LXW r2 = new X.LXW
            r2.<init>(r1, r9, r12, r3)
            X.AnonymousClass0fU.A00(r2, r14)
        L_0x0dd9:
            if (r13 == 0) goto L_0x0e17
            if (r13 == r6) goto L_0x0e0d
            r2 = 2
            if (r13 != r2) goto L_0x0e07
            android.content.Context r3 = r1.getContext()
            if (r3 == 0) goto L_0x0e07
            r2 = 2131237667(0x7f081b23, float:1.809159E38)
        L_0x0de9:
            android.graphics.drawable.Drawable r9 = r3.getDrawable(r2)
            if (r9 == 0) goto L_0x0e07
            r2 = 2131438675(0x7f0b2c53, float:1.8499284E38)
            android.view.View r3 = r10.findViewById(r2)
            if (r3 == 0) goto L_0x0e07
            r2 = 2131438674(0x7f0b2c52, float:1.8499282E38)
            android.widget.ImageView r2 = X.DbS.A0G(r3, r2)
            if (r2 == 0) goto L_0x0e07
            r2.setImageDrawable(r9)
            r3.setVisibility(r5)
        L_0x0e07:
            r8.add(r10)
            r13 = r15
            goto L_0x0d7e
        L_0x0e0d:
            android.content.Context r3 = r1.getContext()
            if (r3 == 0) goto L_0x0e07
            r2 = 2131237666(0x7f081b22, float:1.8091589E38)
            goto L_0x0de9
        L_0x0e17:
            android.content.Context r3 = r1.getContext()
            if (r3 == 0) goto L_0x0e07
            r2 = 2131237665(0x7f081b21, float:1.8091587E38)
            goto L_0x0de9
        L_0x0e21:
            r4 = 0
            goto L_0x0d61
        L_0x0e24:
            r2 = 8
            r8.setVisibility(r2)
            goto L_0x0d4e
        L_0x0e2b:
            java.util.Iterator r3 = r8.iterator()
        L_0x0e2f:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0e3d
            android.view.View r2 = X.JTO.A0H(r3)
            r4.addView(r2)
            goto L_0x0e2f
        L_0x0e3d:
            java.lang.Object r2 = r7.A01
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0e56
            int r2 = r2.intValue()
            java.lang.Object r2 = X.00k.A0O(r8, r2)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0e56
            int r2 = r2.getId()
            r4.A02(r2)
        L_0x0e56:
            X.Wet r2 = new X.Wet
            r2.<init>(r1, r5)
            r4.A02 = r2
        L_0x0e5d:
            java.lang.Object r2 = r7.A01
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x107a
            int r3 = r2.intValue()
            java.lang.Object r2 = r7.A00
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = X.00k.A0O(r2, r3)
            X.UKT r2 = (X.UKT) r2
            if (r2 == 0) goto L_0x107a
            X.Jw3 r2 = r2.A01
            if (r2 == 0) goto L_0x107a
            X.Jw3 r4 = r0.A01()
            if (r4 == 0) goto L_0x10fa
            X.Vw9 r3 = r1.A03
            if (r3 == 0) goto L_0x0e8d
            boolean r2 = r0.A05
            r3.A04(r2)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r3.A02
            if (r2 == 0) goto L_0x0e8d
            r2.setVisibility(r5)
        L_0x0e8d:
            X.UdT r3 = r1.A02
            if (r3 == 0) goto L_0x0e99
            java.util.List r2 = r3.A00
            r2.clear()
            r3.clear()
        L_0x0e99:
            X.UdT r3 = r1.A02
            if (r3 == 0) goto L_0x0ea2
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.C15478UdT.A00(r3, r2)
        L_0x0ea2:
            android.content.Context r3 = r1.getContext()
            if (r3 == 0) goto L_0x0ec9
            X.UdT r5 = r1.A02
            if (r5 == 0) goto L_0x0ec9
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r2 = 2131954016(0x7f130960, float:1.954452E38)
            java.lang.String r9 = r3.getString(r2)
            r8 = 0
            r3 = 40
            X.WAz r2 = new X.WAz
            r2.<init>(r1, r3)
            X.VZL r7 = new X.VZL
            r10 = r1
            r12 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.List r2 = r5.A00
            r2.add(r7)
        L_0x0ec9:
            X.UdT r3 = r1.A02
            if (r3 == 0) goto L_0x0ed2
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.C15478UdT.A00(r3, r2)
        L_0x0ed2:
            android.content.Context r3 = r1.getContext()
            if (r3 == 0) goto L_0x0f00
            X.UdT r5 = r1.A02
            if (r5 == 0) goto L_0x0f00
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            r2 = 2131970732(0x7f134aac, float:1.9578423E38)
            java.lang.String r9 = r3.getString(r2)
            X.0eM r2 = r1.A0E
            java.lang.Object r8 = r2.getValue()
            com.instagram.common.typedurl.ImageUrl r8 = (com.instagram.common.typedurl.ImageUrl) r8
            r3 = 41
            X.WAz r2 = new X.WAz
            r2.<init>(r1, r3)
            X.VZL r7 = new X.VZL
            r10 = r1
            r12 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.List r2 = r5.A00
            r2.add(r7)
        L_0x0f00:
            X.UdT r3 = r1.A02
            if (r3 == 0) goto L_0x0f09
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.C15478UdT.A00(r3, r2)
        L_0x0f09:
            X.ULZ r3 = r0.A03
            if (r3 == 0) goto L_0x0f62
            android.content.Context r5 = r1.getContext()
            if (r5 == 0) goto L_0x0f62
            X.UdT r8 = r1.A02
            if (r8 == 0) goto L_0x0f40
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
            r2 = 2131970731(0x7f134aab, float:1.9578421E38)
            java.lang.String r13 = X.AnonymousClass7TE.A16(r5, r2)
            java.lang.String r7 = r3.A08
            java.lang.Object r2 = r3.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = X.00k.A0J(r2)
            java.lang.String r5 = (java.lang.String) r5
            com.instagram.common.typedurl.SimpleImageUrl r2 = new com.instagram.common.typedurl.SimpleImageUrl
            r2.<init>(r5)
            X.WAS r10 = X.WAS.A00
            X.VaN r9 = new X.VaN
            r11 = r1
            r12 = r2
            r14 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.util.List r2 = r8.A00
            r2.add(r9)
        L_0x0f40:
            java.lang.Object r7 = r3.A04
            X.GSY r7 = (X.GSY) r7
            if (r7 == 0) goto L_0x0f62
            X.UdT r5 = r1.A02
            if (r5 == 0) goto L_0x0f62
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            java.lang.String r11 = r7.A02
            r9 = 0
            r2 = 23
            X.WBH r8 = new X.WBH
            r8.<init>((int) r2, (java.lang.Object) r7, (java.lang.Object) r1)
            X.VaN r7 = new X.VaN
            r10 = r9
            r12 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.util.List r2 = r5.A00
            r2.add(r7)
        L_0x0f62:
            X.N4Q r5 = r0.A02
            if (r5 == 0) goto L_0x1017
            int r7 = r0.A00()
            android.content.Context r2 = r1.getContext()
            if (r2 == 0) goto L_0x1017
            int r8 = r4.A00
            int r8 = r8 * r7
            int r7 = r4.A01
            java.lang.Object r4 = r4.A02
            java.util.Currency r4 = (java.util.Currency) r4
            java.lang.String r15 = X.W2x.A02(r4, r8, r7)
            X.UdT r7 = r1.A02
            if (r7 == 0) goto L_0x0f86
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            X.C15478UdT.A00(r7, r4)
        L_0x0f86:
            X.UdT r7 = r1.A02
            if (r7 == 0) goto L_0x0fa2
            java.lang.Integer r14 = X.AnonymousClass05K.A0j
            r4 = 2131970737(0x7f134ab1, float:1.9578434E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r2, r4)
            r11 = 0
            X.WAT r9 = X.WAT.A00
            X.VaN r8 = new X.VaN
            r10 = r1
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.util.List r4 = r7.A00
            r4.add(r8)
        L_0x0fa2:
            X.UdT r7 = r1.A02
            if (r7 == 0) goto L_0x0fbd
            java.lang.Integer r16 = X.AnonymousClass05K.A0u
            r4 = 2131970736(0x7f134ab0, float:1.9578432E38)
            java.lang.String r14 = X.AnonymousClass7TE.A16(r2, r4)
            r13 = 0
            X.WAU r11 = X.WAU.A00
            X.VaN r10 = new X.VaN
            r12 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.List r4 = r7.A00
            r4.add(r10)
        L_0x0fbd:
            java.lang.Object r4 = r5.A01
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0ff0
            java.util.Iterator r9 = r4.iterator()
        L_0x0fc7:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0ff0
            java.lang.Object r4 = r9.next()
            X.XA5 r4 = (X.XA5) r4
            X.UdT r8 = r1.A02
            if (r8 == 0) goto L_0x0fc7
            java.lang.Integer r16 = X.AnonymousClass05K.A0u
            X.UNd r4 = (X.C15060UNd) r4
            java.lang.String r7 = r4.A00
            java.lang.String r4 = r4.A01
            r13 = 0
            X.WAV r11 = X.WAV.A00
            X.VaN r10 = new X.VaN
            r12 = r1
            r14 = r7
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.util.List r4 = r8.A00
            r4.add(r10)
            goto L_0x0fc7
        L_0x0ff0:
            X.UdT r7 = r1.A02
            if (r7 == 0) goto L_0x100e
            java.lang.Integer r14 = X.AnonymousClass05K.A0j
            r4 = 2131970738(0x7f134ab2, float:1.9578436E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r2, r4)
            java.lang.String r2 = r5.A02
            r11 = 0
            X.WAW r9 = X.WAW.A00
            X.VaN r8 = new X.VaN
            r10 = r1
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.util.List r2 = r7.A00
            r2.add(r8)
        L_0x100e:
            X.UdT r4 = r1.A02
            if (r4 == 0) goto L_0x1017
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.C15478UdT.A00(r4, r2)
        L_0x1017:
            if (r3 == 0) goto L_0x1057
            java.lang.Object r8 = r3.A01
            X.GSY r8 = (X.GSY) r8
            if (r8 == 0) goto L_0x1057
            java.lang.String r4 = r3.A07
            if (r4 == 0) goto L_0x1057
            r3 = 32
            java.lang.String r2 = r8.A02
            java.lang.String r2 = X.002.A0T(r4, r2, r3)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r2)
            X.U2H r5 = new X.U2H
            r5.<init>(r6, r1, r8)
            int r4 = r4.length()
            int r3 = X.DbX.A05(r2)
            r2 = 33
            r7.setSpan(r5, r4, r3, r2)
            X.UdT r2 = r1.A02
            if (r2 == 0) goto L_0x1057
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            r6 = 0
            X.WAR r4 = X.WAR.A00
            X.VaN r3 = new X.VaN
            r5 = r1
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.util.List r2 = r2.A00
            r2.add(r3)
        L_0x1057:
            java.lang.String r2 = r0.A04
            if (r2 == 0) goto L_0x1071
            X.UdT r0 = r1.A02
            if (r0 == 0) goto L_0x1071
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            r6 = 0
            X.WAQ r4 = X.WAQ.A00
            X.VaN r3 = new X.VaN
            r5 = r1
            r7 = r2
            r8 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.util.List r0 = r0.A00
            r0.add(r3)
        L_0x1071:
            X.UdT r0 = r1.A02
            if (r0 == 0) goto L_0x10fa
            r0.A01()
            goto L_0x10fa
        L_0x107a:
            X.Vw9 r0 = r1.A03
            if (r0 == 0) goto L_0x1083
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r0.A02
            X.AnonymousClass7TH.A0R(r0)
        L_0x1083:
            X.UdT r1 = r1.A02
            if (r1 == 0) goto L_0x10fa
            java.util.List r0 = r1.A00
            r0.clear()
            r1.clear()
            goto L_0x10fa
        L_0x1090:
            X.4W8 r0 = (X.AnonymousClass4W8) r0
            java.lang.Object r1 = r4.A01
            X.VXT r1 = (X.VXT) r1
            X.X0E r1 = r1.A00
            if (r1 != 0) goto L_0x10a0
            r1 = 0
        L_0x109b:
            X.1Hj r0 = X.1Hj.A02
            if (r1 != r0) goto L_0x10fa
            return r1
        L_0x10a0:
            X.WEa r1 = (X.C18947WEa) r1
            androidx.slidingpanelayout.widget.SlidingPaneLayout r5 = r1.A00
            r5.A07 = r0
            X.TtL r4 = new X.TtL
            r4.<init>()
            r0 = 300(0x12c, double:1.48E-321)
            r4.A0L(r0)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r0.<init>(r3, r2, r2, r1)
            r4.A0N(r0)
            X.C14283TtH.A02(r5, r4)
            r5.requestLayout()
            X.0gF r1 = X.C60340gF.A00
            goto L_0x109b
        L_0x10c7:
            X.V2W r0 = (X.V2W) r0
            boolean r1 = r0 instanceof X.C16134UpL
            java.lang.String r5 = "adapter"
            if (r1 == 0) goto L_0x10fd
            java.lang.Object r4 = r4.A01
            com.instagram.archive.fragment.ArchiveReelHighlightsFragment r4 = (com.instagram.archive.fragment.ArchiveReelHighlightsFragment) r4
            X.0h9 r1 = r4.mLifecycleRegistry
            X.07U r2 = r1.A07()
            X.07U r1 = X.07U.A04
            if (r2 != r1) goto L_0x10fa
            X.WWx r1 = r4.A00
            if (r1 == 0) goto L_0x111e
            r3 = 0
            r1.A01 = r3
            r1.A02()
            X.WWx r2 = r4.A00
            if (r2 == 0) goto L_0x111e
            X.UpL r0 = (X.C16134UpL) r0
            java.util.List r1 = r0.A01
            X.0qQ.A0B(r1, r3)
            java.util.List r0 = r2.A0A
            r0.addAll(r1)
            r2.A02()
        L_0x10fa:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x10fd:
            X.UpM r1 = X.C16135UpM.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 != 0) goto L_0x110d
            X.UpN r1 = X.C16136UpN.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x10fa
        L_0x110d:
            java.lang.Object r0 = r4.A01
            com.instagram.archive.fragment.ArchiveReelHighlightsFragment r0 = (com.instagram.archive.fragment.ArchiveReelHighlightsFragment) r0
            X.WWx r1 = r0.A00
            if (r1 == 0) goto L_0x111e
            r0 = 1
            r1.A01 = r0
            r1.A02()
            goto L_0x10fa
        L_0x111c:
            java.lang.String r5 = "query"
        L_0x111e:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20429WrE.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
