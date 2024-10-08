package X;

/* renamed from: X.MCh  reason: case insensitive filesystem */
public final class C66118MCh implements 02o {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.0k0 r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 3
            boolean r0 = X.C66146MDy.A02(r3, r8)
            if (r0 == 0) goto L_0x005c
            r5 = r8
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r4 = r5.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r1) goto L_0x003d
            if (r0 != r2) goto L_0x0062
            X.0eS.A00(r4)
        L_0x0026:
            X.0gF r3 = X.C60340gF.A00
        L_0x0028:
            return r3
        L_0x0029:
            X.0eS.A00(r4)
            java.lang.Object r0 = r6.A01
            X.L8h r0 = (X.C63826L8h) r0
            X.0V2 r0 = r0.A03
            X.C66146MDy.A00(r6, r7, r5, r1)
            java.lang.Object r0 = r0.emit(r7, r5)
            if (r0 == r3) goto L_0x0028
            r0 = r6
            goto L_0x0048
        L_0x003d:
            java.lang.Object r7 = r5.A02
            X.0k0 r7 = (X.0k0) r7
            java.lang.Object r0 = r5.A01
            X.MCh r0 = (X.C66118MCh) r0
            X.0eS.A00(r4)
        L_0x0048:
            java.lang.Object r0 = r0.A01
            X.L8h r0 = (X.C63826L8h) r0
            androidx.paging.FlattenedPageController r1 = r0.A00
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r2
            java.lang.Object r0 = r1.A00(r7, r5)
            if (r0 != r3) goto L_0x0026
            return r3
        L_0x005c:
            X.MDy r5 = new X.MDy
            r5.<init>(r6, r8, r3)
            goto L_0x0015
        L_0x0062:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66118MCh.A03(X.0k0, X.4D7):java.lang.Object");
    }

    public C66118MCh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C62942Kou r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 14
            boolean r0 = X.MEC.A03(r3, r7)
            if (r0 == 0) goto L_0x0022
            r4 = r7
            X.MEC r4 = (X.MEC) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r1) goto L_0x002b
            goto L_0x0027
        L_0x0022:
            X.MEC r4 = X.MEC.A00(r5, r7, r3)
            goto L_0x0016
        L_0x0027:
            X.0eS.A00(r3)     // Catch:{ 4d3 -> 0x0040 }
            goto L_0x0040
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0030:
            X.0eS.A00(r3)
            java.lang.Object r0 = r5.A01     // Catch:{ 4d3 -> 0x0040 }
            X.3jv r0 = (X.C249523jv) r0     // Catch:{ 4d3 -> 0x0040 }
            r4.A00 = r1     // Catch:{ 4d3 -> 0x0040 }
            java.lang.Object r0 = r0.ELH(r6, r4)     // Catch:{ 4d3 -> 0x0040 }
            if (r0 != r2) goto L_0x0040
            return r2
        L_0x0040:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66118MCh.A01(X.Kou, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C239803Ii r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 45
            boolean r0 = X.C66144MDw.A02(r3, r9)
            if (r0 == 0) goto L_0x008c
            r4 = r9
            X.MDw r4 = (X.C66144MDw) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r2) goto L_0x0092
            java.lang.Object r0 = r4.A01
            X.MCh r0 = (X.C66118MCh) r0
            X.0eS.A00(r1)
        L_0x0028:
            java.lang.Object r5 = r0.A01
            X.JiS r5 = (X.C60271JiS) r5
        L_0x002c:
            X.2Fj r1 = r5.A00
            r0 = 0
            X.JTP.A1B(r1, r0)
            X.0gF r3 = X.C60340gF.A00
        L_0x0034:
            return r3
        L_0x0035:
            X.0eS.A00(r1)
            boolean r0 = r8 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0074
            X.3Ih r8 = (X.C239793Ih) r8
            java.lang.Object r0 = r8.A00
            X.K13 r0 = (X.K13) r0
            java.util.List r0 = r0.A00
            java.util.List r6 = X.C51966G9m.A1J(r0)
            java.lang.Object r5 = r7.A01
            X.JiS r5 = (X.C60271JiS) r5
            X.L5r r4 = r5.A03
            java.util.Iterator r3 = r6.iterator()
        L_0x0052:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r3.next()
            com.instagram.camera.effect.models.effectpreview.EffectPreview r0 = (com.instagram.camera.effect.models.effectpreview.EffectPreview) r0
            java.lang.String r2 = r0.A07
            if (r2 == 0) goto L_0x0052
            com.instagram.common.session.UserSession r0 = r4.A00
            X.4Om r1 = X.C264044Oj.A00(r0)
            java.lang.String r0 = r4.A01
            r1.AAT(r2, r0)
            goto L_0x0052
        L_0x006e:
            X.2Fj r0 = r5.A01
            r0.A0B(r6)
            goto L_0x002c
        L_0x0074:
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r7.A01
            X.JiS r0 = (X.C60271JiS) r0
            X.3ju r1 = r0.A05
            X.K2h r0 = X.C61320K2h.A00
            r4.A01 = r7
            r4.A00 = r2
            java.lang.Object r0 = r1.ELH(r0, r4)
            if (r0 == r3) goto L_0x0034
            r0 = r7
            goto L_0x0028
        L_0x008c:
            X.MDw r4 = new X.MDw
            r4.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0092:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0097:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66118MCh.A02(X.3Ii, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v57, types: [java.lang.Object, com.instagram.monetization.impl.MonetizationFragmentFactoryImpl] */
    /* JADX WARNING: type inference failed for: r7v38, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v38, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v65, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v76 */
    /* JADX WARNING: type inference failed for: r8v44 */
    /* JADX WARNING: type inference failed for: r7v79 */
    /* JADX WARNING: type inference failed for: r7v82 */
    /* JADX WARNING: type inference failed for: r8v47 */
    /* JADX WARNING: type inference failed for: r8v49 */
    /* JADX WARNING: type inference failed for: r8v50 */
    /* JADX WARNING: type inference failed for: r8v51 */
    /* JADX WARNING: type inference failed for: r8v54 */
    /* JADX WARNING: type inference failed for: r8v57 */
    /* JADX WARNING: type inference failed for: r8v61 */
    /* JADX WARNING: type inference failed for: r8v62 */
    /* JADX WARNING: type inference failed for: r8v65 */
    /* JADX WARNING: type inference failed for: r7v85 */
    /* JADX WARNING: type inference failed for: r7v88 */
    /* JADX WARNING: type inference failed for: r7v89 */
    /* JADX WARNING: type inference failed for: r7v91 */
    /* JADX WARNING: type inference failed for: r5v50 */
    /* JADX WARNING: type inference failed for: r5v51 */
    /* JADX WARNING: type inference failed for: r7v102 */
    /* JADX WARNING: type inference failed for: r7v105 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02eb, code lost:
        if ((r1 instanceof X.C60811Jrg) != false) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03b1, code lost:
        X.LYC.A00(r1, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04c2, code lost:
        if (r21 != null) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04c4, code lost:
        r7.A00 = r3;
        r0 = r2.emit(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x069e, code lost:
        if (r7 != null) goto L_0x06a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0775, code lost:
        r4 = A00(r0, r4);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x077d, code lost:
        if ((!(r1 instanceof X.C59702JUj)) == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x078e, code lost:
        r0.Epw(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07a1, code lost:
        if (X.C59678JTj.A01(0, r1) != false) goto L_0x07a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07fb, code lost:
        if (((X.C61046Jvk) ((X.C59678JTj) r2).A01).A01 == false) goto L_0x0832;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0830, code lost:
        if (r1 != X.AnonymousClass2o7.LOADING) goto L_0x0832;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0832, code lost:
        r7.A00 = r3;
        r0 = r4.emit(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0b62, code lost:
        if ((r1 instanceof X.C239793Ih) != false) goto L_0x0c1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0be3, code lost:
        if ((r1 instanceof X.C239793Ih) != false) goto L_0x0c1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0c1b, code lost:
        if ((r1 instanceof X.C239793Ih) != false) goto L_0x0c1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0c1d, code lost:
        r1 = (X.C239793Ih) r1;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0c1f, code lost:
        if (r1 == null) goto L_0x1038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0c21, code lost:
        r0 = (X.AnonymousClass3JD) r1.A00;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0c25, code lost:
        if (r0 == null) goto L_0x1038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0c27, code lost:
        r2 = r0.Bny();
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0c98, code lost:
        r2.A09(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0d94, code lost:
        X.DbX.A1I(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0e0e, code lost:
        r2.A08(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0ed7, code lost:
        if (r1 == null) goto L_0x0ee0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0ed9, code lost:
        r0 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0ee0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0f38, code lost:
        if (r0 != false) goto L_0x0f3a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x0fd5, code lost:
        if (r0 != null) goto L_0x1093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x1038, code lost:
        r8.A00 = r7;
        r0 = r9.emit(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x1049, code lost:
        if (r6 != X.1Hj.A02) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x104b, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x1078, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x1093, code lost:
        r7.A00 = r3;
        r0 = r2.emit(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x1099, code lost:
        if (r0 != r6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x109b, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0710  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x073c  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0768  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x07d3  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x07e0  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x081d  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x082a  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0b4c  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0b59  */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x0b85  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0b92  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0bcd  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0bda  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0c05  */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0c12  */
    /* JADX WARNING: Removed duplicated region for block: B:635:0x0f20  */
    /* JADX WARNING: Removed duplicated region for block: B:639:0x0f2d  */
    /* JADX WARNING: Removed duplicated region for block: B:652:0x0f60  */
    /* JADX WARNING: Removed duplicated region for block: B:656:0x0f6d  */
    /* JADX WARNING: Removed duplicated region for block: B:670:0x0fc0  */
    /* JADX WARNING: Removed duplicated region for block: B:674:0x0fcd  */
    /* JADX WARNING: Removed duplicated region for block: B:683:0x0ff8  */
    /* JADX WARNING: Removed duplicated region for block: B:687:0x1005  */
    /* JADX WARNING: Removed duplicated region for block: B:700:0x106b  */
    /* JADX WARNING: Removed duplicated region for block: B:705:0x107d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r21, X.AnonymousClass4D7 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            int r2 = r0.A00
            r6 = r22
            switch(r2) {
                case 0: goto L_0x109c;
                case 1: goto L_0x000b;
                case 2: goto L_0x000b;
                case 3: goto L_0x104c;
                case 4: goto L_0x103f;
                case 5: goto L_0x000b;
                case 6: goto L_0x000b;
                case 7: goto L_0x10b3;
                case 8: goto L_0x0fd9;
                case 9: goto L_0x0fa1;
                case 10: goto L_0x10ac;
                case 11: goto L_0x0f98;
                case 12: goto L_0x0f77;
                case 13: goto L_0x0f41;
                case 14: goto L_0x0f01;
                case 15: goto L_0x0ee2;
                case 16: goto L_0x0ecf;
                case 17: goto L_0x0e8f;
                case 18: goto L_0x0e78;
                case 19: goto L_0x0e4c;
                case 20: goto L_0x0e3f;
                case 21: goto L_0x0e13;
                case 22: goto L_0x0e05;
                case 23: goto L_0x0dd9;
                case 24: goto L_0x0dcf;
                case 25: goto L_0x0da3;
                case 26: goto L_0x0d99;
                case 27: goto L_0x0d77;
                case 28: goto L_0x0d63;
                case 29: goto L_0x0d59;
                case 30: goto L_0x0d19;
                case 31: goto L_0x0d02;
                case 32: goto L_0x0cd6;
                case 33: goto L_0x0cc9;
                case 34: goto L_0x0c9d;
                case 35: goto L_0x0c8f;
                case 36: goto L_0x0c63;
                case 37: goto L_0x0c59;
                case 38: goto L_0x0c2d;
                case 39: goto L_0x0c8f;
                case 40: goto L_0x0be6;
                case 41: goto L_0x0bae;
                case 42: goto L_0x0b66;
                case 43: goto L_0x0b2d;
                case 44: goto L_0x0ae2;
                case 45: goto L_0x09c2;
                case 46: goto L_0x088a;
                case 47: goto L_0x083a;
                case 48: goto L_0x07fe;
                case 49: goto L_0x07b4;
                case 50: goto L_0x0793;
                case 51: goto L_0x0788;
                case 52: goto L_0x0781;
                case 53: goto L_0x0781;
                case 54: goto L_0x0749;
                case 55: goto L_0x071d;
                case 56: goto L_0x06f1;
                case 57: goto L_0x0598;
                case 58: goto L_0x0538;
                case 59: goto L_0x10a5;
                case 60: goto L_0x04e7;
                case 61: goto L_0x04cc;
                case 62: goto L_0x0492;
                case 63: goto L_0x03b6;
                case 64: goto L_0x037f;
                case 65: goto L_0x02ef;
                case 66: goto L_0x02b9;
                case 67: goto L_0x01a4;
                case 68: goto L_0x0170;
                case 69: goto L_0x00bd;
                case 70: goto L_0x0015;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r0.A01
            X.5Oz r0 = (X.C284945Oz) r0
            r0.Epw(r1)
        L_0x0012:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0015:
            X.KpT r1 = (X.C62977KpT) r1
            java.lang.Object r3 = r0.A01
            X.Jhg r3 = (X.C60223Jhg) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.commonavatarliveediting.utils.RichAvatarViewState.PlatformEvent"
            X.0qQ.A0C(r1, r0)
            X.Jrh r1 = (X.C60812Jrh) r1
            X.0eP r2 = r1.A00
            java.lang.Object r1 = r2.A00
            java.lang.String r0 = "avatar_fetch_event"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = r2.A01
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r0 = "data"
            java.lang.Object r1 = r1.get(r0)
            r0 = 722(0x2d2, float:1.012E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r0 = "event_name"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r0 = "fetch_started"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0057
            X.05G r4 = r3.A00
            X.K3C r0 = X.K3C.A00
            goto L_0x0edb
        L_0x0057:
            java.lang.String r0 = "fetch_completed"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0065
            X.05G r4 = r3.A00
            X.K3A r0 = X.K3A.A00
            goto L_0x0edb
        L_0x0065:
            r0 = 1363(0x553, float:1.91E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0012
            X.05G r4 = r3.A00
            X.K3B r0 = X.K3B.A00
            goto L_0x0edb
        L_0x0077:
            java.lang.String r0 = "avatar_animation_event"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = r2.A01
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r0 = "data"
            java.lang.Object r2 = r1.get(r0)
            r0 = 722(0x2d2, float:1.012E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r0 = "event_name"
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r0 = "animation_started"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00b6
            X.05G r4 = r3.A00
            java.lang.String r0 = "state"
            java.lang.Object r1 = r2.get(r0)
            X.DbS.A1Y(r1)
            java.lang.String r1 = (java.lang.String) r1
            X.K38 r0 = new X.K38
            r0.<init>(r1)
            goto L_0x0edb
        L_0x00b6:
            java.lang.String r0 = "animation_stopped"
            X.0qQ.A0K(r1, r0)
            goto L_0x0012
        L_0x00bd:
            X.KlM r1 = (X.C62722KlM) r1
            boolean r2 = r1 instanceof X.K3C
            r6 = 116919761(0x6f80dd1, float:9.3307533E-35)
            if (r2 == 0) goto L_0x00eb
            java.lang.Object r3 = r0.A01
            X.K4W r3 = (X.K4W) r3
            X.0eM r1 = r3.A09
            java.lang.Object r0 = r1.getValue()
            X.02m r0 = (X.02m) r0
            r0.markerStart(r6)
            java.lang.Object r2 = r1.getValue()
            X.02m r2 = (X.02m) r2
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "ig_self_profile"
            r2.markerAnnotate(r6, r1, r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r3.A03
            if (r0 == 0) goto L_0x0012
            X.DbS.A1T(r0)
            goto L_0x0012
        L_0x00eb:
            boolean r2 = r1 instanceof X.K3B
            r5 = 116928509(0x6f82ffd, float:9.3357744E-35)
            if (r2 == 0) goto L_0x011c
            java.lang.Object r3 = r0.A01
            X.K4W r3 = (X.K4W) r3
            X.0eM r2 = r3.A09
            java.lang.Object r0 = r2.getValue()
            X.02m r0 = (X.02m) r0
            r1 = 3
            r0.markerEnd(r6, r1)
            java.lang.Object r0 = r2.getValue()
            X.02m r0 = (X.02m) r0
            r0.markerEnd(r5, r1)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A03
            if (r1 == 0) goto L_0x0114
            X.3uy r0 = X.C255943uy.FAILED
            r1.setLoadingStatus(r0)
        L_0x0114:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A03
            if (r1 == 0) goto L_0x0012
            r0 = 50
            goto L_0x03b1
        L_0x011c:
            boolean r2 = r1 instanceof X.K3A
            java.lang.String r3 = "idle"
            if (r2 == 0) goto L_0x0153
            java.lang.Object r4 = r0.A01
            X.K4W r4 = (X.K4W) r4
            X.0eM r2 = r4.A09
            java.lang.Object r0 = r2.getValue()
            X.02m r0 = (X.02m) r0
            r1 = 2
            r0.markerEnd(r6, r1)
            java.lang.Object r0 = r2.getValue()
            X.02m r0 = (X.02m) r0
            r0.markerEnd(r5, r1)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A03
            if (r0 == 0) goto L_0x0142
            X.JTO.A1X(r0)
        L_0x0142:
            X.LZb r1 = r4.A01
            if (r1 == 0) goto L_0x0012
            X.0eM r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            X.Jhg r0 = (X.C60223Jhg) r0
            r0.A00(r1, r3)
            goto L_0x0012
        L_0x0153:
            boolean r2 = r1 instanceof X.K38
            if (r2 == 0) goto L_0x0012
            X.K38 r1 = (X.K38) r1
            java.lang.String r2 = r1.A00
            java.lang.String r1 = "center_pose"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x016b
            java.lang.String r1 = "left_pose"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0012
        L_0x016b:
            java.lang.Object r4 = r0.A01
            X.K4W r4 = (X.K4W) r4
            goto L_0x0142
        L_0x0170:
            X.L3N r1 = (X.L3N) r1
            java.lang.Object r3 = r0.A01
            X.K4W r3 = (X.K4W) r3
            android.widget.ListView r0 = r3.A00
            if (r0 == 0) goto L_0x0180
            android.widget.ListAdapter r0 = r0.getAdapter()
            if (r0 != 0) goto L_0x0012
        L_0x0180:
            java.util.List r2 = r1.A01
            android.content.Context r0 = r3.requireContext()
            X.JeK r1 = new X.JeK
            r1.<init>(r0, r2)
            r3.A02 = r1
            android.widget.ListView r0 = r3.A00
            if (r0 == 0) goto L_0x0194
            r0.setAdapter(r1)
        L_0x0194:
            android.widget.ListView r0 = r3.A00
            if (r0 == 0) goto L_0x0012
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x0012
            r0 = 0
            X.LZ0.A00(r1, r3, r0)
            goto L_0x0012
        L_0x01a4:
            boolean r2 = r1 instanceof X.K35
            r13 = 0
            if (r2 == 0) goto L_0x01da
            java.lang.Object r4 = r0.A01
            X.K4W r4 = (X.K4W) r4
            X.LZb r3 = r4.A01
            if (r3 == 0) goto L_0x01be
            X.0eM r1 = r4.A06
            java.lang.Object r2 = r1.getValue()
            X.Jhg r2 = (X.C60223Jhg) r2
            java.lang.String r1 = "center_pose"
            r2.A00(r3, r1)
        L_0x01be:
            X.JeK r1 = r4.A02
            if (r1 == 0) goto L_0x01c5
            r1.A00()
        L_0x01c5:
            X.K4W.A00(r4, r13)
        L_0x01c8:
            java.lang.Object r0 = r0.A01
            X.K4W r0 = (X.K4W) r0
            X.0eM r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            X.JgC r0 = (X.C60131JgC) r0
            X.05G r4 = r0.A00
            X.K37 r0 = X.K37.A00
            goto L_0x0edb
        L_0x01da:
            boolean r2 = r1 instanceof X.K36
            r5 = 1
            if (r2 == 0) goto L_0x0220
            java.lang.Object r6 = r0.A01
            X.K4W r6 = (X.K4W) r6
            X.LZb r3 = r6.A01
            if (r3 == 0) goto L_0x01f4
            X.0eM r1 = r6.A06
            java.lang.Object r2 = r1.getValue()
            X.Jhg r2 = (X.C60223Jhg) r2
            java.lang.String r1 = "left_pose"
            r2.A00(r3, r1)
        L_0x01f4:
            X.JeK r4 = r6.A02
            if (r4 == 0) goto L_0x021c
            r4.A02 = r5
            java.util.List r3 = r4.A00
            if (r3 == 0) goto L_0x0216
            r2 = 3
            java.util.List r1 = r4.A01
            if (r1 != 0) goto L_0x0205
            X.0sn r1 = X.0sn.A00
        L_0x0205:
            r3.addAll(r2, r1)
            int r1 = X.DbT.A02(r3, r5)
            java.lang.Object r2 = r3.get(r1)
            X.L7e r2 = (X.C63798L7e) r2
            r1 = 1127481344(0x43340000, float:180.0)
            r2.A00 = r1
        L_0x0216:
            r1 = -1224413827(0xffffffffb704ed7d, float:-7.923108E-6)
            X.0fE.A00(r4, r1)
        L_0x021c:
            X.K4W.A00(r6, r5)
            goto L_0x01c8
        L_0x0220:
            boolean r2 = r1 instanceof X.K31
            if (r2 == 0) goto L_0x0244
            java.lang.Object r2 = r0.A01
            X.K4W r2 = (X.K4W) r2
            java.lang.String r9 = "HairStyle"
        L_0x022a:
            X.GUi r3 = X.C63556Kz5.A01
            X.0eM r1 = r2.A0A
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            X.LdB r5 = r2.A05
            java.lang.String r7 = "ig_avatar_home"
            java.lang.String r8 = "ig_avatar_home_item"
            r10 = 0
            r11 = r10
            r12 = r10
            r14 = r13
            r3.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01c8
        L_0x0244:
            boolean r2 = r1 instanceof X.K30
            if (r2 == 0) goto L_0x024f
            java.lang.Object r2 = r0.A01
            X.K4W r2 = (X.K4W) r2
            java.lang.String r9 = "OutfitStyle"
            goto L_0x022a
        L_0x024f:
            boolean r2 = r1 instanceof X.K34
            if (r2 == 0) goto L_0x0259
            java.lang.Object r2 = r0.A01
            X.K4W r2 = (X.K4W) r2
            r9 = 0
            goto L_0x022a
        L_0x0259:
            boolean r2 = r1 instanceof X.K33
            if (r2 == 0) goto L_0x0288
            java.lang.Object r6 = r0.A01
            X.K4W r6 = (X.K4W) r6
            X.0eM r1 = r6.A0A
            X.0lg r5 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            java.lang.String r2 = "immersive_avatar_home"
            r1 = 889(0x379, float:1.246E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            android.os.Bundle r3 = X.DbY.A0B(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            r1 = 2867(0xb33, float:4.018E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r1 = X.Dba.A0K(r2, r3, r5, r4, r1)
            X.DbT.A1M(r6, r1)
            goto L_0x01c8
        L_0x0288:
            boolean r1 = r1 instanceof X.K32
            if (r1 == 0) goto L_0x01c8
            java.lang.Object r2 = r0.A01
            X.K4W r2 = (X.K4W) r2
            X.0eM r1 = r2.A0A
            X.7Pr r1 = X.DbX.A0f(r1)
            X.7Pu r5 = r1.A00()
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            java.lang.Boolean r1 = r2.A04
            if (r1 == 0) goto L_0x02a6
            boolean r13 = r1.booleanValue()
        L_0x02a6:
            X.E0t r3 = new X.E0t
            r3.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            java.lang.String r1 = "coin_flip_enabled"
            X.DbZ.A1B(r3, r1, r2)
            r5.A02(r4, r3)
            goto L_0x01c8
        L_0x02b9:
            r5 = 29
            boolean r2 = X.ME4.A03(r5, r6)
            if (r2 == 0) goto L_0x02df
            r7 = r6
            X.ME4 r7 = (X.ME4) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x02df
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x02cf:
            java.lang.Object r4 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r3 = 1
            if (r2 == 0) goto L_0x02e5
            if (r2 == r3) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02df:
            X.ME4 r7 = new X.ME4
            r7.<init>(r0, r6, r5)
            goto L_0x02cf
        L_0x02e5:
            X.02o r2 = A00(r0, r4)
            boolean r0 = r1 instanceof X.C60811Jrg
            if (r0 == 0) goto L_0x0012
            goto L_0x04c4
        L_0x02ef:
            X.KpT r1 = (X.C62977KpT) r1
            java.lang.Object r3 = r0.A01
            X.K4W r3 = (X.K4W) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.commonavatarliveediting.utils.RichAvatarViewState.EffectEvent"
            X.0qQ.A0C(r1, r0)
            X.Jrg r1 = (X.C60811Jrg) r1
            java.lang.Integer r0 = r1.A00
            int r5 = r0.intValue()
            r0 = 0
            r4 = 116922953(0x6f81a49, float:9.3325854E-35)
            if (r5 == r0) goto L_0x034a
            r1 = 2
            r2 = 3
            r0 = 4
            if (r5 == r1) goto L_0x032b
            if (r5 == r0) goto L_0x0369
            r0 = 7
            if (r5 != r0) goto L_0x0012
            X.0eM r1 = r3.A09
            java.lang.Object r0 = r1.getValue()
            X.02m r0 = (X.02m) r0
            r0.markerEnd(r4, r2)
            java.lang.Object r1 = r1.getValue()
            X.02m r1 = (X.02m) r1
            r0 = 116928509(0x6f82ffd, float:9.3357744E-35)
            r1.markerEnd(r0, r2)
            goto L_0x0012
        L_0x032b:
            X.0eM r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            X.02m r0 = (X.02m) r0
            r0.markerEnd(r4, r2)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A03
            if (r1 == 0) goto L_0x033f
            X.3uy r0 = X.C255943uy.FAILED
            r1.setLoadingStatus(r0)
        L_0x033f:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A03
            if (r1 == 0) goto L_0x0012
            r0 = 51
            X.LYC.A00(r1, r0, r3)
            goto L_0x0012
        L_0x034a:
            X.0eM r1 = r3.A09
            java.lang.Object r0 = r1.getValue()
            X.02m r0 = (X.02m) r0
            r0.markerStart(r4)
            java.lang.Object r2 = r1.getValue()
            X.02m r2 = (X.02m) r2
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "ig_self_profile"
            r2.markerAnnotate(r4, r1, r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A03
            if (r1 == 0) goto L_0x0012
            X.3uy r0 = X.C255943uy.LOADING
            goto L_0x037a
        L_0x0369:
            X.0eM r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            X.02m r0 = (X.02m) r0
            r0.markerEnd(r4, r1)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A03
            if (r1 == 0) goto L_0x0012
            X.3uy r0 = X.C255943uy.SUCCESS
        L_0x037a:
            r1.setLoadingStatus(r0)
            goto L_0x0012
        L_0x037f:
            X.KlK r1 = (X.C62720KlK) r1
            boolean r2 = r1 instanceof X.C61336K2x
            if (r2 == 0) goto L_0x039a
            java.lang.Object r0 = r0.A01
            X.K4W r0 = (X.K4W) r0
            X.LZb r2 = r0.A01
            if (r2 == 0) goto L_0x0012
            X.K2x r1 = (X.C61336K2x) r1
            java.lang.String r1 = r1.A00
            android.content.Context r0 = r0.requireContext()
            r2.A01(r0, r1)
            goto L_0x0012
        L_0x039a:
            boolean r1 = r1 instanceof X.C61337K2y
            if (r1 == 0) goto L_0x0012
            java.lang.Object r3 = r0.A01
            X.K4W r3 = (X.K4W) r3
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A03
            if (r1 == 0) goto L_0x03ab
            X.3uy r0 = X.C255943uy.FAILED
            r1.setLoadingStatus(r0)
        L_0x03ab:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A03
            if (r1 == 0) goto L_0x0012
            r0 = 49
        L_0x03b1:
            X.LYC.A00(r1, r0, r3)
            goto L_0x0012
        L_0x03b6:
            X.KpT r1 = (X.C62977KpT) r1
            java.lang.Object r3 = r0.A01
            X.LZb r3 = (X.C64301LZb) r3
            X.0V2 r0 = r3.A06
            r0.FIA(r1)
            X.L39 r2 = r3.A01
            if (r2 == 0) goto L_0x03ee
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.VlB r6 = r2.A00
            X.UKz r5 = r2.A01
            r2 = r1
            boolean r0 = r1 instanceof X.C60811Jrg
            if (r0 == 0) goto L_0x0448
            X.Jrg r2 = (X.C60811Jrg) r2
            java.lang.Integer r0 = r2.A00
            int r4 = r0.intValue()
            r0 = 3
            if (r4 == r0) goto L_0x0430
            r2 = 2
            r0 = 4
            if (r4 == r0) goto L_0x0417
            r0 = 7
            if (r4 == r0) goto L_0x0456
            if (r4 == r2) goto L_0x0414
            r0 = 12
            if (r4 == r0) goto L_0x040d
            r0 = 13
            if (r4 == r0) goto L_0x040d
        L_0x03ee:
            boolean r0 = r1 instanceof X.C60811Jrg
            if (r0 == 0) goto L_0x0406
            X.Jrg r1 = (X.C60811Jrg) r1
            java.lang.Integer r0 = r1.A00
            int r1 = r0.intValue()
            r0 = 4
            if (r1 != r0) goto L_0x0012
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x03ff:
            java.lang.Integer r0 = r3.A04
            X.C63567KzG.A00(r1, r0)
            goto L_0x0012
        L_0x0406:
            boolean r0 = r1 instanceof X.C60808Jrd
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x03ff
        L_0x040d:
            int r0 = r6.A01
            r0 = r0 | 2
            r6.A01 = r0
            goto L_0x042c
        L_0x0414:
            X.JrZ r2 = X.C60804JrZ.A00
            goto L_0x0458
        L_0x0417:
            int r0 = r6.A01
            r0 = r0 | 4
            r6.A01 = r0
            X.Jrb r0 = X.C60806Jrb.A00
            r6.A05(r0)
            java.util.Map r0 = r6.A07
            if (r0 == 0) goto L_0x0429
            r6.A0C(r0)
        L_0x0429:
            r0 = 0
            r6.A07 = r0
        L_0x042c:
            r6.A03()
            goto L_0x03ee
        L_0x0430:
            org.json.JSONObject r5 = r5.A02
            if (r5 == 0) goto L_0x03ee
            org.json.JSONObject r4 = X.DbS.A11()
            java.lang.String r2 = "type"
            java.lang.String r0 = "editor_initial_config"
            r4.put(r2, r0)
            java.lang.String r0 = "data"
            r4.put(r0, r5)
            r6.A0D(r4)
            goto L_0x03ee
        L_0x0448:
            boolean r0 = r1 instanceof X.C60812Jrh
            if (r0 == 0) goto L_0x045c
            X.Jrh r2 = (X.C60812Jrh) r2
            X.0eP r0 = r2.A00
            X.UI7 r2 = new X.UI7
            r2.<init>(r0)
            goto L_0x0458
        L_0x0456:
            X.Jra r2 = X.C60805Jra.A00
        L_0x0458:
            r6.A05(r2)
            goto L_0x03ee
        L_0x045c:
            boolean r0 = r1 instanceof X.C60807Jrc
            if (r0 == 0) goto L_0x0466
            X.Jrc r2 = (X.C60807Jrc) r2
            r6.A07(r2)
            goto L_0x03ee
        L_0x0466:
            boolean r0 = r1 instanceof X.C60808Jrd
            if (r0 == 0) goto L_0x0471
            X.Jrd r2 = (X.C60808Jrd) r2
            r6.A06(r2)
            goto L_0x03ee
        L_0x0471:
            boolean r0 = r1 instanceof X.C60809Jre
            if (r0 != 0) goto L_0x03ee
            boolean r0 = r1 instanceof X.C60810Jrf
            if (r0 != 0) goto L_0x03ee
            X.Jrj r0 = X.C60814Jrj.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x03ee
            boolean r0 = r1 instanceof X.C60813Jri
            if (r0 != 0) goto L_0x03ee
            X.Jrk r0 = X.C60815Jrk.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x03ee
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0492:
            r5 = 18
            boolean r2 = X.ME4.A03(r5, r6)
            if (r2 == 0) goto L_0x04b8
            r7 = r6
            X.ME4 r7 = (X.ME4) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x04b8
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x04a8:
            java.lang.Object r4 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r3 = 1
            if (r2 == 0) goto L_0x04be
            if (r2 == r3) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04b8:
            X.ME4 r7 = new X.ME4
            r7.<init>(r0, r6, r5)
            goto L_0x04a8
        L_0x04be:
            X.02o r2 = A00(r0, r4)
            if (r21 == 0) goto L_0x0012
        L_0x04c4:
            r7.A00 = r3
            java.lang.Object r0 = r2.emit(r1, r7)
            goto L_0x1099
        L_0x04cc:
            X.0eP r1 = (X.0eP) r1
            int r4 = X.C51970G9q.A0B(r1)
            int r3 = X.C51969G9p.A0A(r1)
            java.lang.Object r2 = r0.A01
            X.0sL r2 = (X.0sL) r2
            java.lang.Integer r1 = X.JTO.A0w(r4)
            java.lang.Integer r0 = X.JTO.A0w(r3)
            r2.invoke(r1, r0)
            goto L_0x0012
        L_0x04e7:
            X.6pV r1 = (X.C318776pV) r1
            java.lang.Object r0 = r0.A01
            X.JgB r0 = (X.C60130JgB) r0
            X.2Fj r2 = r0.A00
            boolean r0 = r1 instanceof X.C318766pU
            if (r0 == 0) goto L_0x0501
            X.6pU r1 = (X.C318766pU) r1
            X.3HO r1 = r1.A00
            X.K2j r0 = new X.K2j
            r0.<init>(r1)
        L_0x04fc:
            r2.A0B(r0)
            goto L_0x0012
        L_0x0501:
            boolean r0 = r1 instanceof X.KXD
            if (r0 == 0) goto L_0x10bf
            X.KXD r1 = (X.KXD) r1
            X.4dm r1 = r1.A00
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0521
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<com.instagram.model.reels.ReelTrayResponse_Response>"
            X.0qQ.A0C(r1, r0)
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r0 = r1.A00
            X.4do r1 = new X.4do
            r1.<init>(r0)
        L_0x051b:
            X.K2i r0 = new X.K2i
            r0.<init>(r1)
            goto L_0x04fc
        L_0x0521:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x10ba
            r0 = 22
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r0 = r1.A00
            X.4dn r1 = new X.4dn
            r1.<init>(r0)
            goto L_0x051b
        L_0x0538:
            r7 = 15
            boolean r2 = X.ME4.A03(r7, r6)
            if (r2 == 0) goto L_0x055e
            r5 = r6
            X.ME4 r5 = (X.ME4) r5
            int r4 = r5.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x055e
            int r4 = r4 - r3
            r5.A00 = r4
        L_0x054e:
            java.lang.Object r4 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r5.A00
            r3 = 1
            if (r2 == 0) goto L_0x0564
            if (r2 == r3) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x055e:
            X.ME4 r5 = new X.ME4
            r5.<init>(r0, r6, r7)
            goto L_0x054e
        L_0x0564:
            X.02o r2 = A00(r0, r4)
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x058b
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r1 = r1.A00
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0584
            X.K2d r0 = X.C61316K2d.A00
        L_0x0578:
            X.5sO r0 = X.C41845B3m.A0c(r0)
        L_0x057c:
            r5.A00 = r3
            java.lang.Object r0 = r2.emit(r0, r5)
            goto L_0x1099
        L_0x0584:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x10c4
            X.K2c r0 = X.C61315K2c.A00
            goto L_0x0578
        L_0x058b:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x10c9
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3Ih r0 = X.C41845B3m.A0d(r0)
            goto L_0x057c
        L_0x0598:
            X.MQ0 r1 = (X.MQ0) r1
            boolean r2 = r1 instanceof X.C59702JUj
            if (r2 == 0) goto L_0x05ab
            java.lang.Object r0 = r0.A01
            X.Jiz r0 = (X.C60301Jiz) r0
            X.05G r1 = r0.A07
            X.Lcq r0 = X.C64489Lcq.A00
            r1.Epw(r0)
            goto L_0x0012
        L_0x05ab:
            r5 = 0
            boolean r2 = X.C59678JTj.A01(r5, r1)
            if (r2 == 0) goto L_0x05fa
            java.lang.Object r7 = r0.A01
            X.Jiz r7 = (X.C60301Jiz) r7
            X.LCZ r4 = r7.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.String r0 = X.C63037KqS.A00(r2)
            r4.A00(r2, r0)
            java.util.Map r2 = r4.A01
            r3 = 541931976(0x204d39c8, float:1.7383294E-19)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.JTP.A1R(r0, r2, r5)
            X.02m r2 = r4.A00
            r0 = 3
            r2.markerEnd(r3, r0)
            X.LPB r2 = r7.A00
            X.JTj r1 = (X.C59678JTj) r1
            java.lang.Object r0 = r1.A01
            java.lang.String r0 = (java.lang.String) r0
            r2.A04(r0)
            X.05G r1 = r7.A07
            X.Lco r0 = X.C64487Lco.A00
            r1.Epw(r0)
            X.3ju r3 = r7.A05
            r0 = 2131953058(0x7f1305a2, float:1.9542576E38)
            X.HsR r2 = X.JTP.A0P(r0)
            r1 = 1
            X.Jxo r0 = new X.Jxo
            r0.<init>(r2, r1)
            java.lang.Object r6 = r3.ELH(r0, r6)
            goto L_0x1047
        L_0x05fa:
            boolean r2 = X.C59678JTj.A03(r1)
            if (r2 == 0) goto L_0x10ce
            java.lang.Object r2 = r0.A01
            X.Jiz r2 = (X.C60301Jiz) r2
            X.LCZ r4 = r2.A01
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            java.lang.String r0 = X.C63037KqS.A00(r3)
            r4.A00(r3, r0)
            X.JTj r1 = (X.C59678JTj) r1
            java.lang.Object r10 = r1.A01
            X.Gn3 r10 = (X.C53373Gn3) r10
            X.0qQ.A0B(r10, r5)
            int r8 = r10.A01
            java.lang.Object r0 = r10.A03
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x0626:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0660
            java.lang.Object r1 = r12.next()
            X.Ju3 r1 = (X.C60945Ju3) r1
            java.lang.String r11 = r1.A03
            int r9 = r1.A00
            java.lang.String r0 = r1.A04
            com.instagram.common.typedurl.SimpleImageUrl r15 = X.DbS.A0V(r0)
            java.lang.String r0 = r1.A02
            com.instagram.common.typedurl.SimpleImageUrl r16 = X.DbS.A0V(r0)
            boolean r6 = r1.A05
            java.lang.String r0 = r1.A01
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r0, r9)
            r0 = 2131953048(0x7f130598, float:1.9542556E38)
            X.GKO r14 = X.DbS.A0Q(r1, r0)
            X.N4E r13 = new X.N4E
            r19 = r6
            r18 = r9
            r17 = r11
            r13.<init>((X.C266444Yx) r14, (com.instagram.common.typedurl.ImageUrl) r15, (com.instagram.common.typedurl.ImageUrl) r16, (java.lang.String) r17, (int) r18, (boolean) r19)
            r7.add(r13)
            goto L_0x0626
        L_0x0660:
            java.lang.Object r11 = r10.A02
            X.Kg0 r11 = (X.C62450Kg0) r11
            boolean r0 = r10.A04
            X.Gn3 r6 = new X.Gn3
            r10 = r6
            r14 = r5
            r15 = r0
            r13 = r8
            r12 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x06ce
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
        L_0x0676:
            X.Jw9 r7 = X.C60301Jiz.A00(r6)
            java.lang.String r0 = "QUERY_GIFTS_LOAD_GIFT_IMAGE"
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r0)
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.002.A0R(r1, r0)
            r4.A00(r3, r0)
            X.05G r3 = r2.A07
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 2131973082(0x7f1353da, float:1.958319E38)
            if (r10 != r1) goto L_0x0695
            r0 = 2131953053(0x7f13059d, float:1.9542566E38)
        L_0x0695:
            X.GKO r9 = X.JTP.A0Q(r0)
            int r4 = r6.A01
            if (r4 == 0) goto L_0x06a0
            r11 = 0
            if (r7 == 0) goto L_0x06a1
        L_0x06a0:
            r11 = 1
        L_0x06a1:
            X.KBD r8 = new X.KBD
            r8.<init>()
            X.Jxt r5 = new X.Jxt
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.Epw(r5)
            X.LPB r5 = r2.A00
            java.lang.Object r0 = r6.A03
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x06bc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06d1
            java.lang.Object r0 = r1.next()
            X.N4E r0 = (X.N4E) r0
            java.lang.String r0 = r0.A05
            r2.add(r0)
            goto L_0x06bc
        L_0x06ce:
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            goto L_0x0676
        L_0x06d1:
            r5.A00 = r2
            X.Khq r1 = X.C62560Khq.Gift
            r0 = 0
            X.Jr7 r3 = X.LPB.A00(r1, r5, r0)
            X.JTR.A1K(r3, r4)
            java.lang.String r0 = "gift_options"
            r3.A07(r0, r2)
            X.LRb r2 = r5.A02
            com.instagram.appreciation.analytics.LoggingFanData r0 = r5.A01
            java.lang.String r1 = r0.A03
            X.0sm r0 = X.0Yt.A0E()
            r2.A04(r3, r1, r0)
            goto L_0x0012
        L_0x06f1:
            r5 = 47
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x0717
            r7 = r6
            X.MEC r7 = (X.MEC) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0717
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x0707:
            java.lang.Object r4 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r3 = 1
            if (r2 == 0) goto L_0x0775
            if (r2 == r3) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0717:
            X.MEC r7 = new X.MEC
            r7.<init>(r0, r6, r5)
            goto L_0x0707
        L_0x071d:
            r5 = 46
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x0743
            r7 = r6
            X.MEC r7 = (X.MEC) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0743
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x0733:
            java.lang.Object r4 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r3 = 1
            if (r2 == 0) goto L_0x0775
            if (r2 == r3) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0743:
            X.MEC r7 = new X.MEC
            r7.<init>(r0, r6, r5)
            goto L_0x0733
        L_0x0749:
            r5 = 45
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x076f
            r7 = r6
            X.MEC r7 = (X.MEC) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x076f
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x075f:
            java.lang.Object r4 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r3 = 1
            if (r2 == 0) goto L_0x0775
            if (r2 == r3) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x076f:
            X.MEC r7 = new X.MEC
            r7.<init>(r0, r6, r5)
            goto L_0x075f
        L_0x0775:
            X.02o r4 = A00(r0, r4)
            boolean r0 = r1 instanceof X.C59702JUj
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0012
            goto L_0x0832
        L_0x0781:
            java.lang.Object r0 = r0.A01
            X.LAZ r0 = (X.LAZ) r0
            X.05G r0 = r0.A02
            goto L_0x078e
        L_0x0788:
            java.lang.Object r0 = r0.A01
            X.LAZ r0 = (X.LAZ) r0
            X.05G r0 = r0.A04
        L_0x078e:
            r0.Epw(r1)
            goto L_0x0012
        L_0x0793:
            X.MQ0 r1 = (X.MQ0) r1
            r3 = 1
            boolean r2 = X.C59678JTj.A01(r3, r1)
            if (r2 != 0) goto L_0x07a3
            r3 = 0
            boolean r2 = X.C59678JTj.A01(r3, r1)
            if (r2 == 0) goto L_0x0012
        L_0x07a3:
            java.lang.Object r0 = r0.A01
            X.LAZ r0 = (X.LAZ) r0
            X.05G r4 = r0.A03
            X.JTj r1 = (X.C59678JTj) r1
            java.lang.Object r1 = r1.A01
            X.JTj r0 = new X.JTj
            r0.<init>(r1, r3)
            goto L_0x0edb
        L_0x07b4:
            r5 = 44
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x07da
            r7 = r6
            X.MEC r7 = (X.MEC) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x07da
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x07ca:
            java.lang.Object r4 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r3 = 1
            if (r2 == 0) goto L_0x07e0
            if (r2 == r3) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07da:
            X.MEC r7 = new X.MEC
            r7.<init>(r0, r6, r5)
            goto L_0x07ca
        L_0x07e0:
            X.02o r4 = A00(r0, r4)
            r2 = r1
            X.MQ0 r2 = (X.MQ0) r2
            boolean r0 = X.C59678JTj.A01(r3, r2)
            if (r0 != 0) goto L_0x0832
            boolean r0 = X.C59678JTj.A02(r2)
            if (r0 == 0) goto L_0x0012
            X.JTj r2 = (X.C59678JTj) r2
            java.lang.Object r0 = r2.A01
            X.Jvk r0 = (X.C61046Jvk) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0012
            goto L_0x0832
        L_0x07fe:
            r5 = 43
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x0824
            r7 = r6
            X.MEC r7 = (X.MEC) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0824
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x0814:
            java.lang.Object r4 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r3 = 1
            if (r2 == 0) goto L_0x082a
            if (r2 == r3) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0824:
            X.MEC r7 = new X.MEC
            r7.<init>(r0, r6, r5)
            goto L_0x0814
        L_0x082a:
            X.02o r4 = A00(r0, r4)
            X.2o7 r0 = X.AnonymousClass2o7.LOADING
            if (r1 == r0) goto L_0x0012
        L_0x0832:
            r7.A00 = r3
            java.lang.Object r0 = r4.emit(r1, r7)
            goto L_0x1099
        L_0x083a:
            X.MQ0 r1 = (X.MQ0) r1
            java.lang.Object r4 = r0.A01
            X.Jj6 r4 = (X.C60307Jj6) r4
            X.05G r3 = r4.A0D
            boolean r2 = X.C59678JTj.A03(r1)
            r6 = 0
            if (r2 == 0) goto L_0x0870
            r0 = r1
            X.JTj r0 = (X.C59678JTj) r0
            if (r0 == 0) goto L_0x0870
            java.lang.Object r0 = r0.A01
        L_0x0850:
            r3.Epw(r0)
            if (r2 == 0) goto L_0x0872
            X.LTO r2 = r4.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            r3 = 0
            X.JTj r1 = (X.C59678JTj) r1
            java.lang.Object r0 = r1.A01
            com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl r0 = (com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl) r0
            if (r0 == 0) goto L_0x0866
            java.util.Map r6 = X.C60307Jj6.A00(r0)
        L_0x0866:
            X.0sm r7 = X.0Yt.A0E()
            r4 = r3
            r2.A0D(r3, r4, r5, r6, r7)
            goto L_0x0012
        L_0x0870:
            r0 = r6
            goto L_0x0850
        L_0x0872:
            boolean r0 = X.C59678JTj.A02(r1)
            if (r0 == 0) goto L_0x0012
            X.LTO r0 = r4.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            X.JTj r1 = (X.C59678JTj) r1
            java.lang.Object r4 = r1.A01
            java.lang.String r4 = (java.lang.String) r4
            r1 = r6
            r2 = r6
            r5 = r6
            r0.A0A(r1, r2, r3, r4, r5)
            goto L_0x0012
        L_0x088a:
            X.Kl3 r1 = (X.C62703Kl3) r1
            boolean r2 = r1 instanceof X.C61302K1p
            if (r2 == 0) goto L_0x08ba
            java.lang.Object r2 = r0.A01
            X.E4f r2 = (X.C47480E4f) r2
            X.K1p r1 = (X.C61302K1p) r1
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = r1.A00
            boolean r5 = r1.A01
            X.6Yo r3 = X.DbY.A0K(r2)
            X.F6R.A01()
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r4 = new com.instagram.monetization.impl.MonetizationFragmentFactoryImpl
            r4.<init>()
            com.instagram.common.session.UserSession r2 = r2.A05()
            com.instagram.api.schemas.UserMonetizationProductType r1 = com.instagram.api.schemas.UserMonetizationProductType.CONTENT_APPRECIATION
            java.lang.String r0 = r0.A00
            androidx.fragment.app.Fragment r7 = r4.A00(r1, r2, r0, r5)
        L_0x08b2:
            r3.A0D(r7)
        L_0x08b5:
            r3.A04()
            goto L_0x0012
        L_0x08ba:
            boolean r2 = r1 instanceof X.C61303K1q
            if (r2 == 0) goto L_0x0903
            java.lang.Object r2 = r0.A01
            X.E4f r2 = (X.C47480E4f) r2
            X.K1q r1 = (X.C61303K1q) r1
            boolean r6 = r1.A02
            boolean r5 = r1.A01
            java.util.Map r4 = r1.A00
            android.os.Bundle r0 = r2.requireArguments()
            com.instagram.appreciation.analytics.LoggingData r1 = X.C63033KqO.A00(r0)
            X.6Yo r3 = X.DbY.A0K(r2)
            X.1Z0 r0 = X.AnonymousClass2BF.A00()
            r0.A02()
            java.lang.String r2 = r1.A01
            java.lang.String r0 = r1.A00
            X.AnonymousClass7TG.A1N(r2, r0)
            X.K89 r7 = new X.K89
            r7.<init>()
            com.instagram.appreciation.analytics.LoggingData r1 = new com.instagram.appreciation.analytics.LoggingData
            r1.<init>(r2, r0)
            java.lang.String r0 = "appreciation_logging_data"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r1 = new com.instagram.appreciation.analytics.creator.CreatorLoggingData
            r1.<init>(r6, r5, r4)
            java.lang.String r0 = "appreciation_creator_logging_data"
            android.os.Bundle r0 = X.AnonymousClass7TG.A0P(r0, r1, r2)
            r7.setArguments(r0)
            goto L_0x08b2
        L_0x0903:
            boolean r2 = r1 instanceof X.C61304K1r
            if (r2 == 0) goto L_0x0924
            java.lang.Object r3 = r0.A01
            X.KUZ r3 = (X.KUZ) r3
            X.K1r r1 = (X.C61304K1r) r1
            boolean r8 = r1.A02
            boolean r6 = r1.A04
            boolean r7 = r1.A01
            boolean r9 = r1.A03
            java.util.Map r4 = r1.A00
            android.app.Dialog r0 = r3.A00
            r13 = 1
            if (r0 == 0) goto L_0x094a
            boolean r0 = r0.isShowing()
            if (r0 != r13) goto L_0x094a
            goto L_0x0012
        L_0x0924:
            boolean r2 = r1 instanceof X.C61305K1s
            if (r2 == 0) goto L_0x0983
            java.lang.Object r1 = r0.A01
            X.E4f r1 = (X.C47480E4f) r1
            java.lang.String r0 = r1.A08()     // Catch:{ IllegalArgumentException -> 0x0935 }
            X.EWG r2 = X.EWG.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0935 }
            goto L_0x0937
        L_0x0935:
            X.EWG r2 = X.EWG.UNKNOWN
        L_0x0937:
            X.6Yo r3 = X.DbY.A0K(r1)
            r1.A05()
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.CONTENT_APPRECIATION
            r1 = 0
            androidx.fragment.app.Fragment r0 = X.C48892Els.A00(r0, r2, r1, r1)
            r3.A0B(r1, r0)
            goto L_0x08b5
        L_0x094a:
            X.8ab r1 = X.DbW.A0U(r3)
            r0 = 2131953083(0x7f1305bb, float:1.9542627E38)
            r1.A09(r0)
            r0 = 2131953082(0x7f1305ba, float:1.9542625E38)
            r1.A08(r0)
            r0 = 2131953081(0x7f1305b9, float:1.9542623E38)
            r5 = 0
            X.LUZ r2 = new X.LUZ
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.A0K(r2, r0)
            X.LUZ r10 = new X.LUZ
            r11 = r3
            r12 = r4
            r14 = r6
            r15 = r7
            r16 = r8
            r17 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r1.A0D(r10)
            android.app.Dialog r0 = r1.A02()
            r3.A00 = r0
            if (r0 == 0) goto L_0x0012
            X.AnonymousClass0fN.A00(r0)
            goto L_0x0012
        L_0x0983:
            boolean r2 = r1 instanceof X.C61300K1n
            if (r2 == 0) goto L_0x09a0
            java.lang.Object r0 = r0.A01
            X.E4f r0 = (X.C47480E4f) r0
            X.K1n r1 = (X.C61300K1n) r1
            java.lang.String r4 = r1.A00
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = r0.A05()
            X.2EG r1 = X.2EG.A1L
            java.lang.String r0 = "AppreciationCreatorSettingsFragment"
            X.FH7.A08(r3, r2, r1, r4, r0)
            goto L_0x0012
        L_0x09a0:
            boolean r2 = r1 instanceof X.C61301K1o
            if (r2 == 0) goto L_0x09b5
            java.lang.Object r2 = r0.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.K1o r1 = (X.C61301K1o) r1
            int r1 = r1.A00
            android.content.Context r0 = r2.getContext()
            X.DbZ.A0w(r0, r2, r1)
            goto L_0x0012
        L_0x09b5:
            boolean r1 = r1 instanceof X.C61306K1t
            if (r1 == 0) goto L_0x10d3
            java.lang.Object r0 = r0.A01
            X.E4f r0 = (X.C47480E4f) r0
            r0.A0B()
            goto L_0x0012
        L_0x09c2:
            X.Kl4 r1 = (X.C62704Kl4) r1
            java.lang.Object r2 = r0.A01
            X.KUZ r2 = (X.KUZ) r2
            X.0eM r0 = r2.A0B
            java.lang.Object r10 = r0.getValue()
            X.JlH r10 = (X.C60424JlH) r10
            X.0eM r0 = r2.A02
            java.lang.Object r9 = r0.getValue()
            X.Jj6 r9 = (X.C60307Jj6) r9
            r0 = 0
            X.0qQ.A0B(r1, r0)
            boolean r0 = r1 instanceof X.C61310K1x
            if (r0 != 0) goto L_0x0ad8
            boolean r0 = r1 instanceof X.C61309K1w
            if (r0 != 0) goto L_0x0ad8
            boolean r0 = r1 instanceof X.C61307K1u
            r12 = 0
            if (r0 == 0) goto L_0x0a66
            X.01N r8 = X.0jo.A1H()
            r2 = 2131953076(0x7f1305b4, float:1.9542613E38)
            r0 = 1
            X.FOl r4 = X.C50095FOl.A00
            X.DbV.A1E(r4, r12, r8, r2, r0)
            r0 = r1
            X.K1u r0 = (X.C61307K1u) r0
            X.Jvd r5 = r0.A00
            X.LuC r0 = r9.A02(r5, r12)
            r8.add(r0)
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0a38
            r2 = 2131957117(0x7f13157d, float:1.9550809E38)
            r0 = 1
            X.DbV.A1E(r4, r12, r8, r2, r0)
            X.0eM r0 = r9.A06
            java.lang.Object r0 = r0.getValue()
            X.KzV r0 = (X.C63582KzV) r0
            com.instagram.common.session.UserSession r6 = r0.A00
            X.0Tu r0 = X.0Tu.A05
            r2 = 36321657953986163(0x810a5b00002673, double:3.033300973453585E-306)
            boolean r0 = X.182.A06(r0, r6, r2)
            r3 = 2131953012(0x7f130574, float:1.9542483E38)
            if (r0 == 0) goto L_0x0a2a
            r3 = 2131953011(0x7f130573, float:1.954248E38)
        L_0x0a2a:
            r0 = 3
            X.LY8 r2 = new X.LY8
            r2.<init>(r0, r1, r9)
            X.Lu7 r0 = new X.Lu7
            r0.<init>(r2, r3)
            r8.add(r0)
        L_0x0a38:
            r0 = 2131953073(0x7f1305b1, float:1.9542607E38)
            r2 = 1
            X.DbV.A1E(r4, r12, r8, r0, r2)
            java.util.List r0 = r9.A03(r5, r12)
            r8.addAll(r0)
            r0 = 2131953077(0x7f1305b5, float:1.9542615E38)
            X.DbV.A1E(r4, r12, r8, r0, r2)
            r3 = 2131953072(0x7f1305b0, float:1.9542605E38)
            r0 = 4
        L_0x0a50:
            X.LY8 r2 = new X.LY8
            r2.<init>(r0, r1, r9)
            X.LuC r0 = new X.LuC
            r0.<init>(r2, r3)
            r8.add(r0)
            X.01N r0 = X.0jo.A1I(r8)
        L_0x0a61:
            r10.A00(r0)
            goto L_0x0012
        L_0x0a66:
            boolean r0 = r1 instanceof X.C61308K1v
            if (r0 == 0) goto L_0x10d8
            X.01N r8 = X.0jo.A1H()
            r0 = 2131953076(0x7f1305b4, float:1.9542613E38)
            r7 = r12
            r6 = 1
            X.FOl r5 = X.C50095FOl.A00
            X.DbV.A1E(r5, r12, r8, r0, r6)
            r0 = r1
            X.K1v r0 = (X.C61308K1v) r0
            X.Jvd r2 = r0.A00
            X.JwF r11 = r0.A01
            X.LuC r0 = r9.A02(r2, r11)
            r8.add(r0)
            r0 = 2131953073(0x7f1305b1, float:1.9542607E38)
            X.DbV.A1E(r5, r12, r8, r0, r6)
            java.util.List r0 = r9.A03(r2, r11)
            r8.addAll(r0)
            r4 = 2131953075(0x7f1305b3, float:1.954261E38)
            boolean r3 = r11.A02
            if (r3 == 0) goto L_0x0aa1
            r0 = 2131953064(0x7f1305a8, float:1.9542588E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
        L_0x0aa1:
            r0 = 5
            X.LY8 r2 = new X.LY8
            r2.<init>(r0, r1, r9)
            X.LuC r0 = new X.LuC
            r0.<init>(r2, r12, r4, r3)
            r8.add(r0)
            r0 = 2131953071(0x7f1305af, float:1.9542603E38)
            X.DbV.A1E(r5, r7, r8, r0, r6)
            r4 = 2131953069(0x7f1305ad, float:1.9542599E38)
            r0 = 6
            X.LY8 r3 = new X.LY8
            r3.<init>(r0, r1, r9)
            java.lang.String r0 = r11.A01
            X.GKw r2 = X.JUH.A00(r0)
            X.LuC r0 = new X.LuC
            r0.<init>((android.view.View.OnClickListener) r3, (X.C266444Yx) r2, (int) r4)
            r8.add(r0)
            r0 = 2131953077(0x7f1305b5, float:1.9542615E38)
            X.DbV.A1E(r5, r7, r8, r0, r6)
            r3 = 2131953072(0x7f1305b0, float:1.9542605E38)
            r0 = 7
            goto L_0x0a50
        L_0x0ad8:
            X.Lu3 r0 = new X.Lu3
            r0.<init>()
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x0a61
        L_0x0ae2:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r0.A01
            X.Ji0 r5 = (X.C60243Ji0) r5
            X.L5o r7 = r5.A00
            r2 = 15
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.LbP r4 = new X.LbP
            r4.<init>()
            X.2IS r3 = r4.A00
            java.lang.String r0 = "section_id"
            r3.A04(r0, r1)
            r0 = 1
            r4.A02 = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "count"
            r3.A03(r0, r2)
            X.1Ef r2 = r4.build()
            X.1vn r0 = r7.A01
            X.0qQ.A0A(r2)
            X.032 r2 = r0.A05(r2)
            r0 = 7
            X.MC9 r2 = X.MC9.A00(r2, r0)
            r0 = 8
            X.MC9 r4 = X.MC9.A00(r2, r0)
            r3 = 0
            r2 = 2
            X.JaI r0 = new X.JaI
            r0.<init>((java.lang.Object) r5, (java.lang.String) r1, (X.AnonymousClass4D7) r3, (int) r2)
            java.lang.Object r6 = X.AnonymousClass11O.A00(r6, r0, r4)
            goto L_0x1047
        L_0x0b2d:
            r5 = 40
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x0b53
            r8 = r6
            X.MEC r8 = (X.MEC) r8
            int r4 = r8.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0b53
            int r4 = r4 - r3
            r8.A00 = r4
        L_0x0b43:
            java.lang.Object r4 = r8.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r8.A00
            r7 = 1
            if (r2 == 0) goto L_0x0b59
            if (r2 == r7) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b53:
            X.MEC r8 = new X.MEC
            r8.<init>(r0, r6, r5)
            goto L_0x0b43
        L_0x0b59:
            X.02o r9 = A00(r0, r4)
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            r2 = 0
            if (r0 == 0) goto L_0x1038
            goto L_0x0c1d
        L_0x0b66:
            r5 = 39
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x0b8c
            r8 = r6
            X.MEC r8 = (X.MEC) r8
            int r4 = r8.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0b8c
            int r4 = r4 - r3
            r8.A00 = r4
        L_0x0b7c:
            java.lang.Object r4 = r8.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r8.A00
            r7 = 1
            if (r2 == 0) goto L_0x0b92
            if (r2 == r7) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b8c:
            X.MEC r8 = new X.MEC
            r8.<init>(r0, r6, r5)
            goto L_0x0b7c
        L_0x0b92:
            X.02o r9 = A00(r0, r4)
            X.3lr r1 = (X.C250663lr) r1
            if (r1 == 0) goto L_0x0bab
            java.lang.Class<X.BtY> r3 = X.C43148BtY.class
            r0 = 830(0x33e, float:1.163E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = -1537798237(0xffffffffa4570fa3, float:-4.6633938E-17)
            X.3lr r2 = r1.A03(r3, r2, r0)
            goto L_0x1038
        L_0x0bab:
            r2 = 0
            goto L_0x1038
        L_0x0bae:
            r5 = 38
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x0bd4
            r8 = r6
            X.MEC r8 = (X.MEC) r8
            int r4 = r8.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0bd4
            int r4 = r4 - r3
            r8.A00 = r4
        L_0x0bc4:
            java.lang.Object r4 = r8.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r8.A00
            r7 = 1
            if (r2 == 0) goto L_0x0bda
            if (r2 == r7) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0bd4:
            X.MEC r8 = new X.MEC
            r8.<init>(r0, r6, r5)
            goto L_0x0bc4
        L_0x0bda:
            X.02o r9 = A00(r0, r4)
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            r2 = 0
            if (r0 == 0) goto L_0x1038
            goto L_0x0c1d
        L_0x0be6:
            r5 = 37
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x0c0c
            r8 = r6
            X.MEC r8 = (X.MEC) r8
            int r4 = r8.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0c0c
            int r4 = r4 - r3
            r8.A00 = r4
        L_0x0bfc:
            java.lang.Object r4 = r8.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r8.A00
            r7 = 1
            if (r2 == 0) goto L_0x0c12
            if (r2 == r7) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c0c:
            X.MEC r8 = new X.MEC
            r8.<init>(r0, r6, r5)
            goto L_0x0bfc
        L_0x0c12:
            X.02o r9 = A00(r0, r4)
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            r2 = 0
            if (r0 == 0) goto L_0x1038
        L_0x0c1d:
            X.3Ih r1 = (X.C239793Ih) r1
            if (r1 == 0) goto L_0x1038
            java.lang.Object r0 = r1.A00
            X.3JD r0 = (X.AnonymousClass3JD) r0
            if (r0 == 0) goto L_0x1038
            java.lang.Object r2 = r0.Bny()
            goto L_0x1038
        L_0x0c2d:
            boolean r14 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r0 = r0.A01
            X.JjI r0 = (X.C60315JjI) r0
            X.05G r2 = r0.A02
        L_0x0c37:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            X.Jvn r3 = (X.C61049Jvn) r3
            if (r3 == 0) goto L_0x0c57
            r4 = 0
            r10 = 0
            r9 = 511(0x1ff, float:7.16E-43)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r11 = r10
            r12 = r10
            r13 = r10
            X.Jvn r0 = X.C61049Jvn.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0c4f:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0c37
            goto L_0x0012
        L_0x0c57:
            r0 = 0
            goto L_0x0c4f
        L_0x0c59:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r0.A01
            X.JjI r2 = (X.C60315JjI) r2
            r0 = 1
            goto L_0x0c98
        L_0x0c63:
            boolean r13 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r0 = r0.A01
            X.JjI r0 = (X.C60315JjI) r0
            X.05G r2 = r0.A02
        L_0x0c6d:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            X.Jvn r3 = (X.C61049Jvn) r3
            if (r3 == 0) goto L_0x0c8d
            r4 = 0
            r10 = 0
            r9 = 767(0x2ff, float:1.075E-42)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r11 = r10
            r12 = r10
            r14 = r10
            X.Jvn r0 = X.C61049Jvn.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0c85:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0c6d
            goto L_0x0012
        L_0x0c8d:
            r0 = 0
            goto L_0x0c85
        L_0x0c8f:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r0.A01
            X.JjI r2 = (X.C60315JjI) r2
            r0 = 0
        L_0x0c98:
            r2.A09(r0, r1)
            goto L_0x0012
        L_0x0c9d:
            boolean r12 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r0 = r0.A01
            X.JjI r0 = (X.C60315JjI) r0
            X.05G r2 = r0.A02
        L_0x0ca7:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            X.Jvn r3 = (X.C61049Jvn) r3
            if (r3 == 0) goto L_0x0cc7
            r4 = 0
            r10 = 0
            r9 = 895(0x37f, float:1.254E-42)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r11 = r10
            r13 = r10
            r14 = r10
            X.Jvn r0 = X.C61049Jvn.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0cbf:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0ca7
            goto L_0x0012
        L_0x0cc7:
            r0 = 0
            goto L_0x0cbf
        L_0x0cc9:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0012
            java.lang.Object r0 = r0.A01
            X.JjI r0 = (X.C60315JjI) r0
            r0.A0D(r1)
            goto L_0x0012
        L_0x0cd6:
            boolean r11 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r0 = r0.A01
            X.JjI r0 = (X.C60315JjI) r0
            X.05G r2 = r0.A02
        L_0x0ce0:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            X.Jvn r3 = (X.C61049Jvn) r3
            if (r3 == 0) goto L_0x0d00
            r4 = 0
            r10 = 0
            r9 = 959(0x3bf, float:1.344E-42)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r12 = r10
            r13 = r10
            r14 = r10
            X.Jvn r0 = X.C61049Jvn.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0cf8:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0ce0
            goto L_0x0012
        L_0x0d00:
            r0 = 0
            goto L_0x0cf8
        L_0x0d02:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.A01
            X.JjI r2 = (X.C60315JjI) r2
            X.05G r0 = r2.A05
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0012
            if (r1 == 0) goto L_0x0012
            r2.A0E(r1)
            goto L_0x0012
        L_0x0d19:
            boolean r14 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r0 = r0.A01
            X.JjI r0 = (X.C60315JjI) r0
            X.05G r2 = r0.A05
            r3 = 0
            if (r2 == 0) goto L_0x0012
            java.lang.Object r0 = r2.getValue()
            if (r0 == 0) goto L_0x0012
        L_0x0d2c:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.JuP r0 = (X.C60967JuP) r0
            if (r0 == 0) goto L_0x0d57
            int r7 = r0.A00
            X.N49 r5 = r0.A02
            X.N49 r6 = r0.A01
            boolean r8 = r0.A04
            boolean r9 = r0.A08
            boolean r10 = r0.A05
            boolean r11 = r0.A07
            boolean r12 = r0.A06
            boolean r13 = r0.A03
            X.AnonymousClass7TG.A1O(r5, r6)
            X.JuP r4 = new X.JuP
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0d4f:
            boolean r0 = r2.AIY(r1, r4)
            if (r0 == 0) goto L_0x0d2c
            goto L_0x0012
        L_0x0d57:
            r4 = r3
            goto L_0x0d4f
        L_0x0d59:
            X.Jvz r1 = (X.C61061Jvz) r1
            java.lang.Object r0 = r0.A01
            X.JjI r0 = (X.C60315JjI) r0
            X.05G r4 = r0.A07
            goto L_0x0ed7
        L_0x0d63:
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r0.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            java.lang.String r0 = "ugc_ai_deletion"
            X.C48314EcX.A00(r1, r0)
            goto L_0x0d94
        L_0x0d77:
            r2 = 0
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r2)
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r0.A01
            X.K5p r2 = (X.C61395K5p) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            java.lang.String r0 = "ugc_ai_creation"
            X.C48314EcX.A00(r1, r0)
            X.0eM r0 = r2.A03
            X.JjJ r0 = X.JTO.A0R(r0)
            r0.A07()
        L_0x0d94:
            X.DbX.A1I(r2)
            goto L_0x0012
        L_0x0d99:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r0.A01
            X.JjJ r2 = (X.C60316JjJ) r2
            r0 = 2
            goto L_0x0e0e
        L_0x0da3:
            boolean r14 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r0 = r0.A01
            X.JjJ r0 = (X.C60316JjJ) r0
            X.05G r2 = r0.A04
        L_0x0dad:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            X.Jvn r3 = (X.C61049Jvn) r3
            if (r3 == 0) goto L_0x0dcd
            r4 = 0
            r10 = 0
            r9 = 511(0x1ff, float:7.16E-43)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r11 = r10
            r12 = r10
            r13 = r10
            X.Jvn r0 = X.C61049Jvn.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0dc5:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0dad
            goto L_0x0012
        L_0x0dcd:
            r0 = 0
            goto L_0x0dc5
        L_0x0dcf:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r0.A01
            X.JjJ r2 = (X.C60316JjJ) r2
            r0 = 1
            goto L_0x0e0e
        L_0x0dd9:
            boolean r13 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r0 = r0.A01
            X.JjJ r0 = (X.C60316JjJ) r0
            X.05G r2 = r0.A04
        L_0x0de3:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            X.Jvn r3 = (X.C61049Jvn) r3
            if (r3 == 0) goto L_0x0e03
            r4 = 0
            r10 = 0
            r9 = 767(0x2ff, float:1.075E-42)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r11 = r10
            r12 = r10
            r14 = r10
            X.Jvn r0 = X.C61049Jvn.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0dfb:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0de3
            goto L_0x0012
        L_0x0e03:
            r0 = 0
            goto L_0x0dfb
        L_0x0e05:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r0.A01
            X.JjJ r2 = (X.C60316JjJ) r2
            r0 = 0
        L_0x0e0e:
            r2.A08(r0, r1)
            goto L_0x0012
        L_0x0e13:
            boolean r12 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r0 = r0.A01
            X.JjJ r0 = (X.C60316JjJ) r0
            X.05G r2 = r0.A04
        L_0x0e1d:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            X.Jvn r3 = (X.C61049Jvn) r3
            if (r3 == 0) goto L_0x0e3d
            r4 = 0
            r10 = 0
            r9 = 895(0x37f, float:1.254E-42)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r11 = r10
            r13 = r10
            r14 = r10
            X.Jvn r0 = X.C61049Jvn.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0e35:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0e1d
            goto L_0x0012
        L_0x0e3d:
            r0 = 0
            goto L_0x0e35
        L_0x0e3f:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0012
            java.lang.Object r0 = r0.A01
            X.JjJ r0 = (X.C60316JjJ) r0
            r0.A0B(r1)
            goto L_0x0012
        L_0x0e4c:
            boolean r11 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r0 = r0.A01
            X.JjJ r0 = (X.C60316JjJ) r0
            X.05G r2 = r0.A04
        L_0x0e56:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            X.Jvn r3 = (X.C61049Jvn) r3
            if (r3 == 0) goto L_0x0e76
            r4 = 0
            r10 = 0
            r9 = 959(0x3bf, float:1.344E-42)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r12 = r10
            r13 = r10
            r14 = r10
            X.Jvn r0 = X.C61049Jvn.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0e6e:
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0e56
            goto L_0x0012
        L_0x0e76:
            r0 = 0
            goto L_0x0e6e
        L_0x0e78:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.A01
            X.JjJ r2 = (X.C60316JjJ) r2
            X.05G r0 = r2.A07
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0012
            if (r1 == 0) goto L_0x0012
            r2.A0C(r1)
            goto L_0x0012
        L_0x0e8f:
            boolean r14 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r0 = r0.A01
            X.JjJ r0 = (X.C60316JjJ) r0
            X.05G r2 = r0.A07
            r3 = 0
            if (r2 == 0) goto L_0x0012
            java.lang.Object r0 = r2.getValue()
            if (r0 == 0) goto L_0x0012
        L_0x0ea2:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.JuP r0 = (X.C60967JuP) r0
            if (r0 == 0) goto L_0x0ecd
            int r7 = r0.A00
            X.N49 r5 = r0.A02
            X.N49 r6 = r0.A01
            boolean r8 = r0.A04
            boolean r9 = r0.A08
            boolean r10 = r0.A05
            boolean r11 = r0.A07
            boolean r12 = r0.A06
            boolean r13 = r0.A03
            X.AnonymousClass7TG.A1O(r5, r6)
            X.JuP r4 = new X.JuP
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0ec5:
            boolean r0 = r2.AIY(r1, r4)
            if (r0 == 0) goto L_0x0ea2
            goto L_0x0012
        L_0x0ecd:
            r4 = r3
            goto L_0x0ec5
        L_0x0ecf:
            X.Jvz r1 = (X.C61061Jvz) r1
            java.lang.Object r0 = r0.A01
            X.JjJ r0 = (X.C60316JjJ) r0
            X.05G r4 = r0.A0A
        L_0x0ed7:
            if (r1 == 0) goto L_0x0ee0
            java.lang.String r0 = r1.A04
        L_0x0edb:
            r4.Epw(r0)
            goto L_0x0012
        L_0x0ee0:
            r0 = 0
            goto L_0x0edb
        L_0x0ee2:
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            if (r1 == 0) goto L_0x0012
            java.lang.Object r1 = r0.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0012
            X.0hq r0 = r1.getParentFragmentManager()
            int r0 = r0.A0M()
            if (r0 <= 0) goto L_0x0012
            X.DbT.A1I(r1)
            goto L_0x0012
        L_0x0f01:
            r5 = 24
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x0f27
            r8 = r6
            X.MEC r8 = (X.MEC) r8
            int r4 = r8.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0f27
            int r4 = r4 - r3
            r8.A00 = r4
        L_0x0f17:
            java.lang.Object r4 = r8.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r8.A00
            r7 = 1
            if (r2 == 0) goto L_0x0f2d
            if (r2 == r7) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0f27:
            X.MEC r8 = new X.MEC
            r8.<init>(r0, r6, r5)
            goto L_0x0f17
        L_0x0f2d:
            X.02o r9 = A00(r0, r4)
            boolean r0 = r1 instanceof X.C13941Tln
            if (r0 != 0) goto L_0x0f3a
            boolean r0 = r1 instanceof X.C13944Tlq
            r1 = 0
            if (r0 == 0) goto L_0x0f3b
        L_0x0f3a:
            r1 = 1
        L_0x0f3b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            goto L_0x1038
        L_0x0f41:
            r5 = 23
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x0f67
            r7 = r6
            X.MEC r7 = (X.MEC) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0f67
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x0f57:
            java.lang.Object r4 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r3 = 1
            if (r2 == 0) goto L_0x0f6d
            if (r2 == r3) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0f67:
            X.MEC r7 = new X.MEC
            r7.<init>(r0, r6, r5)
            goto L_0x0f57
        L_0x0f6d:
            X.02o r2 = A00(r0, r4)
            X.0k0 r1 = (X.0k0) r1
            java.lang.Object r0 = r1.A01
            goto L_0x1093
        L_0x0f77:
            X.RFO r1 = (X.RFO) r1
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r0.A01
            X.Sln r2 = (X.C12060Sln) r2
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0012
            X.SHo r0 = r2.A05
            X.L36 r4 = r0.A06
            java.lang.String r3 = r1.A00
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.6Rm r2 = r4.A00
            X.4tV r1 = r4.A01
            r0 = 38
            X.C62961KpD.A00(r2, r1, r3, r0)
            goto L_0x0012
        L_0x0f98:
            java.lang.Object r0 = r0.A01
            X.3jv r0 = (X.C249523jv) r0
            r0.FIG(r1)
            goto L_0x0012
        L_0x0fa1:
            r5 = 12
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x0fc7
            r7 = r6
            X.MEC r7 = (X.MEC) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0fc7
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x0fb7:
            java.lang.Object r4 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r3 = 1
            if (r2 == 0) goto L_0x0fcd
            if (r2 == r3) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0fc7:
            X.MEC r7 = new X.MEC
            r7.<init>(r0, r6, r5)
            goto L_0x0fb7
        L_0x0fcd:
            X.02o r2 = A00(r0, r4)
            X.0eP r1 = (X.0eP) r1
            java.lang.Object r0 = r1.A01
            if (r0 == 0) goto L_0x0012
            goto L_0x1093
        L_0x0fd9:
            r5 = 11
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x0fff
            r8 = r6
            X.MEC r8 = (X.MEC) r8
            int r4 = r8.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0fff
            int r4 = r4 - r3
            r8.A00 = r4
        L_0x0fef:
            java.lang.Object r4 = r8.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r8.A00
            r7 = 1
            if (r2 == 0) goto L_0x1005
            if (r2 == r7) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0fff:
            X.MEC r8 = new X.MEC
            r8.<init>(r0, r6, r5)
            goto L_0x0fef
        L_0x1005:
            X.02o r9 = A00(r0, r4)
            X.L5k r1 = (X.C63752L5k) r1
            X.L8h r0 = r1.A00
            X.0r6 r4 = r0.A02
            r3 = 0
            r2 = 21
            X.JTh r0 = new X.JTh
            r0.<init>((java.lang.Object) r1, (X.AnonymousClass4D7) r3, (int) r2)
            X.0rn r2 = new X.0rn
            r2.<init>(r0, r4)
            androidx.paging.MulticastedPagingData$asPagingData$2 r0 = new androidx.paging.MulticastedPagingData$asPagingData$2
            r0.<init>(r1)
            X.0ro r5 = new X.0ro
            r5.<init>(r0, r2)
            X.Hzs r0 = r1.A01
            X.MTH r4 = r0.A01
            X.MRP r3 = r0.A00
            r2 = 17
            X.TVu r0 = new X.TVu
            r0.<init>((java.lang.Object) r1, (int) r2)
            X.Hzs r2 = new X.Hzs
            r2.<init>(r3, r4, r0, r5)
        L_0x1038:
            r8.A00 = r7
            java.lang.Object r0 = r9.emit(r2, r8)
            goto L_0x1099
        L_0x103f:
            java.lang.Object r0 = r0.A01
            X.3jv r0 = (X.C249523jv) r0
            java.lang.Object r6 = r0.ELH(r1, r6)
        L_0x1047:
            X.1Hj r0 = X.1Hj.A02
            if (r6 != r0) goto L_0x0012
            return r6
        L_0x104c:
            r5 = 10
            boolean r2 = X.MEC.A03(r5, r6)
            if (r2 == 0) goto L_0x1072
            r7 = r6
            X.MEC r7 = (X.MEC) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x1072
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x1062:
            java.lang.Object r4 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r3 = 1
            if (r2 == 0) goto L_0x107d
            if (r2 == r3) goto L_0x1078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1072:
            X.MEC r7 = new X.MEC
            r7.<init>(r0, r6, r5)
            goto L_0x1062
        L_0x1078:
            X.0eS.A00(r4)
            goto L_0x0012
        L_0x107d:
            X.02o r2 = A00(r0, r4)
            X.4d4 r1 = (X.C268254d4) r1
            boolean r0 = r1 instanceof X.C268274d6
            if (r0 != 0) goto L_0x10f2
            boolean r0 = r1 instanceof X.C283965Ki
            if (r0 != 0) goto L_0x10ed
            boolean r0 = r1 instanceof X.C268264d5
            if (r0 == 0) goto L_0x10dd
            X.4d5 r1 = (X.C268264d5) r1
            java.lang.Object r0 = r1.A01
        L_0x1093:
            r7.A00 = r3
            java.lang.Object r0 = r2.emit(r0, r7)
        L_0x1099:
            if (r0 != r6) goto L_0x0012
            return r6
        L_0x109c:
            java.lang.Object r0 = r0.A01
            X.MRM r0 = (X.MRM) r0
            r0.Exc()
            goto L_0x0012
        L_0x10a5:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r6 = r0.A02(r1, r6)
            return r6
        L_0x10ac:
            X.Kou r1 = (X.C62942Kou) r1
            java.lang.Object r6 = r0.A01(r1, r6)
            return r6
        L_0x10b3:
            X.0k0 r1 = (X.0k0) r1
            java.lang.Object r6 = r0.A03(r1, r6)
            return r6
        L_0x10ba:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x10bf:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x10c4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x10c9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x10ce:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x10d3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x10d8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x10dd:
            boolean r0 = r1 instanceof X.AnonymousClass5KV
            if (r0 == 0) goto L_0x10e8
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x10e8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x10ed:
            X.5Ki r1 = (X.C283965Ki) r1
            java.lang.Throwable r0 = r1.A00
            throw r0
        L_0x10f2:
            X.4d6 r1 = (X.C268274d6) r1
            java.lang.Throwable r0 = r1.A00
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66118MCh.emit(java.lang.Object, X.4D7):java.lang.Object");
    }

    public static 02o A00(C66118MCh mCh, Object obj) {
        0eS.A00(obj);
        return (02o) mCh.A01;
    }
}
