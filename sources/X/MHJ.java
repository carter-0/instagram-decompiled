package X;

public final class MHJ extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public static MH1 A01(Object obj, MHJ mhj, int i) {
        MH1 mh1 = new MH1(obj, (AnonymousClass4D7) null, i);
        mhj.A00 = 1;
        return mh1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHJ(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A04 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static MHJ A02(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r4, int i) {
        return new MHJ(obj, obj2, obj3, r4, i);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MHJ, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.MHJ, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.MHJ, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v9, types: [X.MHJ, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v13, types: [X.MHJ, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v20, types: [X.MHJ, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v21, types: [X.MHJ, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v26, types: [X.MHJ, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v31, types: [X.MHJ, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v52, types: [X.MHJ, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ff, code lost:
        r3 = new X.MHJ(r4, r5, r6, r7, 42);
        r3.A02 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0108, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0139, code lost:
        return A02(r3, r1, r2, r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016e, code lost:
        return new X.MHJ(r4, r5, r6, r7, 42);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c7, code lost:
        return A02(r2, r1, r3, r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ce, code lost:
        r3 = new X.MHJ(r2, r1, r11, r0);
        r3.A03 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d5, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e2, code lost:
        return A02(r1, r2, r3, r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f8, code lost:
        return A02(r3, r2, r1, r11, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r0 = r9.A04
            r6 = r11
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0019;
                case 2: goto L_0x0022;
                case 3: goto L_0x002b;
                case 4: goto L_0x0034;
                case 5: goto L_0x003d;
                case 6: goto L_0x0046;
                case 7: goto L_0x004f;
                case 8: goto L_0x0056;
                case 9: goto L_0x005e;
                case 10: goto L_0x0066;
                case 11: goto L_0x0070;
                case 12: goto L_0x007a;
                case 13: goto L_0x0081;
                case 14: goto L_0x008b;
                case 15: goto L_0x0095;
                case 16: goto L_0x009f;
                case 17: goto L_0x00a9;
                case 18: goto L_0x00b3;
                case 19: goto L_0x00bd;
                case 20: goto L_0x00c7;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00db;
                case 23: goto L_0x00e5;
                case 24: goto L_0x00ef;
                case 25: goto L_0x00f9;
                case 26: goto L_0x0109;
                case 27: goto L_0x0113;
                case 28: goto L_0x011d;
                case 29: goto L_0x0124;
                case 30: goto L_0x012d;
                case 31: goto L_0x013a;
                case 32: goto L_0x0144;
                case 33: goto L_0x014d;
                case 34: goto L_0x0157;
                case 35: goto L_0x0161;
                case 36: goto L_0x016f;
                case 37: goto L_0x0178;
                case 38: goto L_0x0181;
                case 39: goto L_0x018a;
                case 40: goto L_0x0193;
                case 41: goto L_0x019c;
                case 42: goto L_0x01a5;
                case 43: goto L_0x01b2;
                case 44: goto L_0x01bb;
                case 45: goto L_0x01c8;
                case 46: goto L_0x01d6;
                case 47: goto L_0x01e3;
                case 48: goto L_0x01ec;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r9.A03
            r0 = 49
            X.MHJ r3 = new X.MHJ
            r3.<init>(r1, r11, r0)
            r3.A01 = r10
            return r3
        L_0x0012:
            java.lang.Object r4 = r9.A03
            java.lang.Object r5 = r9.A01
            r7 = 0
            goto L_0x00ff
        L_0x0019:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 1
            goto L_0x01f4
        L_0x0022:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 2
            goto L_0x01f4
        L_0x002b:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 3
            goto L_0x01f4
        L_0x0034:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 4
            goto L_0x01f4
        L_0x003d:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 5
            goto L_0x01f4
        L_0x0046:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 6
            goto L_0x01f4
        L_0x004f:
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A01
            r0 = 7
            goto L_0x01ce
        L_0x0056:
            java.lang.Object r5 = r9.A01
            java.lang.Object r4 = r9.A03
            r7 = 8
            goto L_0x00ff
        L_0x005e:
            java.lang.Object r5 = r9.A01
            java.lang.Object r4 = r9.A03
            r7 = 9
            goto L_0x00ff
        L_0x0066:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 10
            goto L_0x01f4
        L_0x0070:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 11
            goto L_0x01f4
        L_0x007a:
            java.lang.Object r4 = r9.A03
            java.lang.Object r5 = r9.A01
            r7 = 12
            goto L_0x00ff
        L_0x0081:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 13
            goto L_0x01f4
        L_0x008b:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 14
            goto L_0x01f4
        L_0x0095:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 15
            goto L_0x01f4
        L_0x009f:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 16
            goto L_0x01f4
        L_0x00a9:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 17
            goto L_0x01f4
        L_0x00b3:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 18
            goto L_0x01f4
        L_0x00bd:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 19
            goto L_0x01f4
        L_0x00c7:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 20
            goto L_0x01f4
        L_0x00d1:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 21
            goto L_0x01f4
        L_0x00db:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 22
            goto L_0x01f4
        L_0x00e5:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 23
            goto L_0x01f4
        L_0x00ef:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 24
            goto L_0x01f4
        L_0x00f9:
            java.lang.Object r4 = r9.A03
            java.lang.Object r5 = r9.A01
            r7 = 25
        L_0x00ff:
            r8 = 42
            X.MHJ r3 = new X.MHJ
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r7, (int) r8)
            r3.A02 = r10
            return r3
        L_0x0109:
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A01
            r0 = 26
            goto L_0x01c3
        L_0x0113:
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A01
            r0 = 27
            goto L_0x01c3
        L_0x011d:
            java.lang.Object r4 = r9.A03
            java.lang.Object r5 = r9.A01
            r7 = 28
            goto L_0x0167
        L_0x0124:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 29
            goto L_0x0135
        L_0x012d:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 30
        L_0x0135:
            X.MHJ r3 = A02(r3, r1, r2, r11, r0)
            return r3
        L_0x013a:
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A01
            r0 = 31
            goto L_0x01c3
        L_0x0144:
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A01
            r0 = 32
            goto L_0x01c3
        L_0x014d:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 33
            goto L_0x01f4
        L_0x0157:
            java.lang.Object r1 = r9.A03
            r0 = 34
            X.MHJ r3 = new X.MHJ
            r3.<init>(r1, r11, r0)
            return r3
        L_0x0161:
            java.lang.Object r4 = r9.A03
            java.lang.Object r5 = r9.A01
            r7 = 35
        L_0x0167:
            r8 = 42
            X.MHJ r3 = new X.MHJ
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r7, (int) r8)
            return r3
        L_0x016f:
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A02
            r0 = 36
            goto L_0x01de
        L_0x0178:
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A02
            r0 = 37
            goto L_0x01de
        L_0x0181:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 38
            goto L_0x01f4
        L_0x018a:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 39
            goto L_0x01f4
        L_0x0193:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 40
            goto L_0x01f4
        L_0x019c:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 41
            goto L_0x01f4
        L_0x01a5:
            java.lang.Object r3 = r9.A01
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 42
            X.MHJ r3 = A02(r1, r3, r2, r11, r0)
            return r3
        L_0x01b2:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 43
            goto L_0x01f4
        L_0x01bb:
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A01
            r0 = 44
        L_0x01c3:
            X.MHJ r3 = A02(r2, r1, r3, r11, r0)
            return r3
        L_0x01c8:
            java.lang.Object r2 = r9.A02
            java.lang.Object r1 = r9.A01
            r0 = 45
        L_0x01ce:
            X.MHJ r3 = new X.MHJ
            r3.<init>(r2, r1, r11, r0)
            r3.A03 = r10
            return r3
        L_0x01d6:
            java.lang.Object r3 = r9.A03
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A02
            r0 = 46
        L_0x01de:
            X.MHJ r3 = A02(r1, r2, r3, r11, r0)
            return r3
        L_0x01e3:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 47
            goto L_0x01f4
        L_0x01ec:
            java.lang.Object r3 = r9.A02
            java.lang.Object r2 = r9.A01
            java.lang.Object r1 = r9.A03
            r0 = 48
        L_0x01f4:
            X.MHJ r3 = A02(r3, r2, r1, r11, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHJ.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MHJ, X.4D7] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02f6, code lost:
        r6 = new X.MHN(r3, r4, r1);
        r0.A00 = r5;
        r0 = X.AnonymousClass3DM.A00(r7, r8, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0447, code lost:
        if (r0 != r2) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0449, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04f9, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0955, code lost:
        r0.A02 = r0.A03;
        r0.A00 = r9;
        r3 = X.AnonymousClass42T.A00(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x095f, code lost:
        if (r3 != r5) goto L_0x0965;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0961, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0962, code lost:
        X.0eS.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0965, code lost:
        r3 = (java.util.List) r3;
        r2 = X.AnonymousClass7TE.A1H();
        r5 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0973, code lost:
        if (r5.hasNext() == false) goto L_0x0999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0975, code lost:
        r4 = X.AnonymousClass7TF.A0u((java.util.Map) r5.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0983, code lost:
        if (r4.hasNext() == false) goto L_0x096f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0985, code lost:
        r0 = X.AnonymousClass7TE.A1J(r4);
        r1 = r0.getKey();
        r0 = r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0991, code lost:
        if (r1 == null) goto L_0x097f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0993, code lost:
        if (r0 == null) goto L_0x097f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0995, code lost:
        r2.put(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x09a1, code lost:
        if (r2.size() == r3.size()) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x09a3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0a8f, code lost:
        X.0eS.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0aa3, code lost:
        r0 = X.AnonymousClass3DM.A00(r6, r7, r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0aa7, code lost:
        if (r0 != r5) goto L_0x0ac3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0aa9, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:?, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0 A[LOOP:2: B:34:0x00b9->B:36:0x00c0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ea A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r3 = r22
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x0b0c;
                case 1: goto L_0x0a81;
                case 2: goto L_0x0a5e;
                case 3: goto L_0x0a3f;
                case 4: goto L_0x0a20;
                case 5: goto L_0x0a00;
                case 6: goto L_0x09e0;
                case 7: goto L_0x09a5;
                case 8: goto L_0x091e;
                case 9: goto L_0x08e7;
                case 10: goto L_0x08c3;
                case 11: goto L_0x08a3;
                case 12: goto L_0x083b;
                case 13: goto L_0x0819;
                case 14: goto L_0x07f9;
                case 15: goto L_0x07d9;
                case 16: goto L_0x07b6;
                case 17: goto L_0x0793;
                case 18: goto L_0x0773;
                case 19: goto L_0x0753;
                case 20: goto L_0x0733;
                case 21: goto L_0x0713;
                case 22: goto L_0x06f3;
                case 23: goto L_0x06d3;
                case 24: goto L_0x06b1;
                case 25: goto L_0x0679;
                case 26: goto L_0x064d;
                case 27: goto L_0x0621;
                case 28: goto L_0x0aaa;
                case 29: goto L_0x0009;
                case 30: goto L_0x0009;
                case 31: goto L_0x05db;
                case 32: goto L_0x055d;
                case 33: goto L_0x0539;
                case 34: goto L_0x04ae;
                case 35: goto L_0x0452;
                case 36: goto L_0x0332;
                case 37: goto L_0x0303;
                case 38: goto L_0x02db;
                case 39: goto L_0x02bf;
                case 40: goto L_0x02a3;
                case 41: goto L_0x0287;
                case 42: goto L_0x0251;
                case 43: goto L_0x0234;
                case 44: goto L_0x020a;
                case 45: goto L_0x01cf;
                case 46: goto L_0x0130;
                case 47: goto L_0x0113;
                case 48: goto L_0x00eb;
                case 49: goto L_0x004e;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 == r6) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            X.0eS.A00(r3)
            java.lang.Object r1 = r0.A02
            X.5kq r1 = (X.C293505kq) r1
            X.JXu r2 = r1.A0G
            java.lang.Object r1 = r0.A03
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r1
            X.LC1 r4 = r1.A05
            java.lang.Object r3 = r0.A01
            X.5kq r3 = (X.C293505kq) r3
            r0.A00 = r6
            boolean r1 = r2 instanceof X.JY6
            if (r1 == 0) goto L_0x0045
            X.JXu r2 = r3.A0G
            X.JXu r1 = X.JXu.A03
            if (r2 == r1) goto L_0x004a
            java.util.List r1 = r3.A0v
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == 0) goto L_0x004a
        L_0x003e:
            java.lang.Object r0 = r4.A00(r3, r0)
            if (r0 != r5) goto L_0x004a
            return r5
        L_0x0045:
            X.JXu r1 = X.JXu.A02
            if (r2 != r1) goto L_0x004a
            goto L_0x003e
        L_0x004a:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0aa7
        L_0x004e:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 0
            r9 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0072
            if (r1 == r6) goto L_0x0084
            X.0eS.A00(r3)
        L_0x005c:
            java.lang.Object r0 = r0.A03
            X.HpC r0 = (X.C55891HpC) r0
            X.05G r2 = r0.A0D
        L_0x0062:
            java.lang.Object r1 = r2.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0062
            goto L_0x04f7
        L_0x0072:
            X.0eS.A00(r3)
            java.lang.Object r10 = r0.A01
            X.4Cq r10 = (X.C262224Cq) r10
            java.lang.Object r1 = r0.A03
            X.HpC r1 = (X.C55891HpC) r1
            java.util.Set r1 = r1.A0C
            java.util.Iterator r4 = r1.iterator()
            goto L_0x008e
        L_0x0084:
            java.lang.Object r4 = r0.A02
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r1 = r0.A01
            X.4Cq r10 = X.JTO.A1D(r1, r3)
        L_0x008e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00ab
            java.lang.Object r1 = r4.next()
            X.Hn8 r1 = (X.C55773Hn8) r1
            r0.A01 = r10
            r0.A02 = r4
            r0.A00 = r6
            X.5b4 r2 = r1.A00
            java.lang.Object r1 = r1.A02
            java.lang.Object r1 = r2.A05(r1, r0)
            if (r1 != r5) goto L_0x008e
            return r5
        L_0x00ab:
            java.lang.Object r1 = r0.A03
            X.HpC r1 = (X.C55891HpC) r1
            java.util.Set r1 = r1.A0C
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r6 = r1.iterator()
        L_0x00b9:
            boolean r1 = r6.hasNext()
            r4 = 0
            if (r1 == 0) goto L_0x00cf
            java.lang.Object r3 = r6.next()
            r2 = 46
            X.MG6 r1 = new X.MG6
            r1.<init>(r3, r4, r2)
            X.JTQ.A1M(r7, r1, r10)
            goto L_0x00b9
        L_0x00cf:
            X.2Q9[] r1 = new X.AnonymousClass2Q9[r8]
            java.lang.Object[] r2 = r7.toArray(r1)
            X.2Q9[] r2 = (X.AnonymousClass2Q9[]) r2
            int r1 = r2.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            X.2Q9[] r1 = (X.AnonymousClass2Q9[]) r1
            r0.A01 = r4
            r0.A02 = r4
            r0.A00 = r9
            java.lang.Object r1 = X.AnonymousClass42T.A02(r0, r1)
            if (r1 != r5) goto L_0x005c
            return r5
        L_0x00eb:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 1
            if (r1 == 0) goto L_0x00f9
            if (r1 == r8) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00f9:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            r5 = 0
            java.lang.Object r4 = r0.A03
            r3 = 33
            X.MHN r1 = new X.MHN
            r1.<init>(r4, r5, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r6, r7, r0, r1)
            goto L_0x0447
        L_0x0113:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x0121
            if (r1 == r5) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0121:
            X.07V r8 = A00(r3, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r0.A03
            r1 = 30
            goto L_0x02f6
        L_0x0130:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x0170
            if (r1 != r6) goto L_0x01ca
            X.0eS.A00(r3)
        L_0x013c:
            java.lang.Object r4 = r0.A02
            X.1Av r4 = (X.1Av) r4
            java.lang.Object r5 = r0.A01
            java.util.List r5 = (java.util.List) r5
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01c1
            r0 = 0
            X.0qQ.A0B(r5, r0)
            com.instagram.api.schemas.GenAIMagicModNotificationType r0 = com.instagram.api.schemas.GenAIMagicModNotificationType.BACKDROP
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x015d
            X.0s0 r2 = r4.A5n
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 473(0x1d9, float:6.63E-43)
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r6)
        L_0x015d:
            com.instagram.api.schemas.GenAIMagicModNotificationType r0 = com.instagram.api.schemas.GenAIMagicModNotificationType.RESTYLE
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x04f7
            X.0s0 r2 = r4.A5o
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 474(0x1da, float:6.64E-43)
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r6)
            goto L_0x04f7
        L_0x0170:
            X.0eS.A00(r3)
            java.lang.Object r1 = r0.A03
            X.0lg r1 = (X.0lg) r1
            java.lang.Object r7 = r0.A01
            java.util.List r7 = (java.util.List) r7
            X.1NY r4 = X.DbZ.A0L(r1)
            r4.A02()
            java.lang.String r1 = "api/v1/ai_gen/async_send_magic_mod_tool_available_notification/"
            r4.A0A(r1)
            java.lang.Class<X.CDO> r2 = X.CDO.class
            java.lang.Class<X.Czb> r1 = X.C45625Czb.class
            r4.A0Q(r2, r1)
            if (r7 == 0) goto L_0x01ac
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x0199:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x01a3
            X.DbT.A1W(r2, r3)
            goto L_0x0199
        L_0x01a3:
            java.lang.String r2 = X.DbT.A10(r3)
            java.lang.String r1 = "notification_types"
            r4.A9m(r1, r2)
        L_0x01ac:
            X.1OC r2 = r4.A0M()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.SendMagicModToolNotificationResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.SendMagicModToolNotificationResponse>>"
            X.0qQ.A0C(r2, r1)
            r0.A00 = r6
            r1 = 1879881788(0x700cb83c, float:1.742025E29)
            java.lang.Object r3 = r2.A00(r1, r0)
            if (r3 != r5) goto L_0x013c
            return r5
        L_0x01c1:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x04f7
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01cf:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x01dd
            if (r1 == r9) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01dd:
            X.0eS.A00(r3)
            java.lang.Object r10 = r0.A03
            X.6FR r10 = (X.AnonymousClass6FR) r10
            r8 = 0
            java.lang.Object r7 = r0.A02
            r1 = 24
            X.MP4 r6 = new X.MP4
            r6.<init>(r7, r1)
            r1 = 4
            X.JVp r5 = new X.JVp
            r5.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r1)
            java.lang.Object r4 = r0.A01
            r3 = 18
            X.J6k r1 = new X.J6k
            r1.<init>((int) r3, (java.lang.Object) r7, (java.lang.Object) r4)
            r0.A00 = r9
            r11 = r0
            r12 = r8
            r13 = r6
            r14 = r1
            r15 = r5
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A03(r10, r11, r12, r13, r14, r15)
            goto L_0x0447
        L_0x020a:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 1
            if (r1 == 0) goto L_0x0218
            if (r1 == r7) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0218:
            X.0eS.A00(r3)
            java.lang.Object r1 = r0.A03
            X.GgJ r1 = (X.C52966GgJ) r1
            X.0r6 r6 = r1.A09
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A01
            r3 = 55
            X.MCn r1 = new X.MCn
            r1.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r5)
            r0.A00 = r7
            java.lang.Object r0 = r6.collect(r1, r0)
            goto L_0x0447
        L_0x0234:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x0242
            if (r1 == r5) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0242:
            X.07V r8 = A00(r3, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r0.A03
            r1 = 21
            goto L_0x02f6
        L_0x0251:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 1
            if (r1 == 0) goto L_0x025f
            if (r1 == r8) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x025f:
            X.0eS.A00(r3)
            java.lang.Object r7 = r0.A01
            r3 = 34
            X.MIz r1 = new X.MIz
            r1.<init>(r7, r3)
            X.05E r3 = X.C3025664b.A02(r1)
            X.MPJ r1 = X.MPJ.A00
            X.0r6 r6 = X.AnonymousClass11E.A00(r1, r3)
            java.lang.Object r5 = r0.A03
            java.lang.Object r4 = r0.A02
            r3 = 6
            X.IkS r1 = new X.IkS
            r1.<init>(r3, r7, r5, r4)
            r0.A00 = r8
            java.lang.Object r0 = r6.collect(r1, r0)
            goto L_0x0447
        L_0x0287:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x0295
            if (r1 == r5) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0295:
            X.07V r8 = A00(r3, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r0.A03
            r1 = 18
            goto L_0x02f6
        L_0x02a3:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x02b1
            if (r1 == r5) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02b1:
            X.07V r8 = A00(r3, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r0.A03
            r1 = 17
            goto L_0x02f6
        L_0x02bf:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x02cd
            if (r1 == r5) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02cd:
            X.07V r8 = A00(r3, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r0.A03
            r1 = 16
            goto L_0x02f6
        L_0x02db:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x02e9
            if (r1 == r5) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02e9:
            X.07V r8 = A00(r3, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r0.A03
            r1 = 15
        L_0x02f6:
            X.MHN r6 = new X.MHN
            r6.<init>(r3, r4, r1)
            r0.A00 = r5
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r7, r8, r0, r6)
            goto L_0x0447
        L_0x0303:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 1
            if (r1 == 0) goto L_0x0311
            if (r1 == r8) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0311:
            X.0eS.A00(r3)
            X.12T r3 = X.AnonymousClass12T.A00
            r7 = 0
            r1 = 2000485202(0x773cfb52, float:3.8330047E33)
            X.0nV r6 = X.JTP.A0V(r3, r1)
            java.lang.Object r5 = r0.A03
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            r1 = 36
            X.MHJ r1 = A02(r3, r4, r5, r7, r1)
            r0.A00 = r8
            java.lang.Object r0 = X.1Eo.A00(r0, r6, r1)
            goto L_0x0447
        L_0x0332:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0341
            if (r1 == r7) goto L_0x04aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0341:
            X.0eS.A00(r3)
            r9 = 0
            java.lang.Object r8 = r0.A03
            com.instagram.creation.fragment.AlbumEditFragment r8 = (com.instagram.creation.fragment.AlbumEditFragment) r8
            X.82q r1 = r8.A0H
            java.lang.String r13 = "creationCameraSession"
            r6 = 0
            if (r1 == 0) goto L_0x044a
            X.JWE r1 = (X.JWE) r1
            com.instagram.creation.base.CreationSession r1 = r1.A01
            java.util.List r1 = r1.A0E
            java.util.Iterator r5 = X.JTQ.A0h(r1)
        L_0x035a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x036f
            com.instagram.creation.base.MediaSession r1 = X.JTO.A0Z(r5)
            java.lang.Integer r3 = r1.Bsu()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r3 != r1) goto L_0x035a
            int r9 = r9 + 1
            goto L_0x035a
        L_0x036f:
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch
            r5.<init>(r9)
            X.82q r1 = r8.A0H
            if (r1 == 0) goto L_0x044a
            X.JWE r1 = (X.JWE) r1
            com.instagram.creation.base.CreationSession r1 = r1.A01
            java.util.List r1 = r1.A0E
            java.util.Iterator r12 = X.JTQ.A0h(r1)
        L_0x0382:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x041c
            com.instagram.creation.base.MediaSession r9 = X.JTO.A0Z(r12)
            java.lang.Integer r1 = r9.Bsu()
            int r1 = r1.intValue()
            if (r1 == r4) goto L_0x03d0
            X.4cI r1 = r8.A0Q
            if (r1 != 0) goto L_0x03a4
            java.lang.String r0 = "pendingMediaProvider"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03a4:
            X.3Q2 r11 = X.JTQ.A0N(r9, r1)
            java.lang.String r10 = "SAVE VIDEO ITEM"
            if (r11 == 0) goto L_0x03ca
            java.lang.Object r9 = r0.A01
            android.content.Context r9 = (android.content.Context) r9
            X.0eM r1 = r8.A0d
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.0qQ.A0B(r9, r4)
            X.0qQ.A0B(r3, r7)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            boolean r1 = X.C9841RiD.A00(r9, r6, r3, r11, r1)
            if (r1 != 0) goto L_0x0382
            java.lang.String r1 = "save failed for video"
            X.0kD.A02(r10, r1)
            goto L_0x0382
        L_0x03ca:
            java.lang.String r1 = "video item PendingMedia is null"
            X.0kD.A02(r10, r1)
            goto L_0x0382
        L_0x03d0:
            X.82q r1 = r8.A0H
            if (r1 == 0) goto L_0x044a
            X.JWE r1 = (X.JWE) r1
            com.instagram.creation.base.CreationSession r3 = r1.A01
            java.lang.String r1 = r9.B5g()
            com.instagram.creation.base.PhotoSession r16 = r3.A03(r1)
            java.lang.String r9 = "SAVE PHOTO ITEM"
            if (r16 == 0) goto L_0x0415
            X.82q r10 = r8.A0H
            if (r10 == 0) goto L_0x044a
            X.4mi r3 = r8.A0N
            if (r3 != 0) goto L_0x03f6
            java.lang.String r0 = "provider"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03f6:
            java.lang.Object r14 = r0.A01
            android.content.Context r14 = (android.content.Context) r14
            X.0eM r1 = r8.A0d
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r1)
            r20 = r4
            r17 = r10
            r18 = r3
            r19 = r5
            boolean r1 = X.LIb.A01(r14, r15, r16, r17, r18, r19, r20)
            if (r1 != 0) goto L_0x0382
            java.lang.String r1 = "save failed for photo"
            X.0kD.A02(r9, r1)
            goto L_0x0382
        L_0x0415:
            java.lang.String r1 = "photo item PendingMedia is null"
            X.0kD.A02(r9, r1)
            goto L_0x0382
        L_0x041c:
            r3 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            boolean r1 = r5.await(r3, r1)
            if (r1 != 0) goto L_0x0435
            java.lang.String r1 = "photo saves timed out "
            long r3 = r5.getCount()
            java.lang.String r3 = X.002.A0Q(r1, r3)
            java.lang.String r1 = "SAVING ALBUM TIMEOUT"
            X.0kD.A02(r1, r3)
        L_0x0435:
            X.12T r1 = X.AnonymousClass12T.A00
            X.4CZ r5 = r1.A04
            java.lang.Object r4 = r0.A02
            r3 = 5
            X.MGX r1 = new X.MGX
            r1.<init>(r4, r8, r6, r3)
            r0.A00 = r7
            java.lang.Object r0 = X.1Eo.A00(r0, r5, r1)
        L_0x0447:
            if (r0 != r2) goto L_0x04f7
            return r2
        L_0x044a:
            X.0qQ.A0F(r13)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0452:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0480
            if (r1 != r6) goto L_0x04aa
            java.lang.Object r4 = r0.A02
            com.instagram.creation.fragment.AlbumEditFragment r4 = (com.instagram.creation.fragment.AlbumEditFragment) r4
            X.0eS.A00(r3)
        L_0x0463:
            java.util.Map r3 = (java.util.Map) r3
            r4.A0R = r3
            X.12T r1 = X.AnonymousClass12T.A00
            X.4CZ r6 = r1.A04
            java.lang.Object r4 = r0.A03
            r3 = 0
            r2 = 32
            X.MG0 r1 = new X.MG0
            r1.<init>(r4, r3, r2)
            r0.A02 = r3
            r0.A00 = r7
            java.lang.Object r0 = X.1Eo.A00(r0, r6, r1)
            if (r0 != r5) goto L_0x04f7
            return r5
        L_0x0480:
            X.0eS.A00(r3)
            java.lang.Object r4 = r0.A03
            com.instagram.creation.fragment.AlbumEditFragment r4 = (com.instagram.creation.fragment.AlbumEditFragment) r4
            java.lang.Object r1 = r0.A01
            android.view.View r1 = (android.view.View) r1
            android.content.Context r1 = r1.getContext()
            android.content.Context r2 = X.DbT.A05(r1)
            X.0eM r1 = r4.A0d
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.creation.ml.VisualFeatureStore r1 = X.C394989z1.A00(r2, r1)
            r4.A0J = r1
            r0.A02 = r4
            r0.A00 = r6
            java.lang.Object r3 = com.instagram.creation.fragment.AlbumEditFragment.A03(r4, r0)
            if (r3 != r5) goto L_0x0463
            return r5
        L_0x04aa:
            X.0eS.A00(r3)
            goto L_0x04f7
        L_0x04ae:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x04fa
            if (r1 != r6) goto L_0x0534
            java.lang.Object r7 = r0.A02
            X.Jvo r7 = (X.C61050Jvo) r7
            java.lang.Object r5 = r0.A01
            X.Jhz r5 = (X.C60242Jhz) r5
            X.0eS.A00(r3)
        L_0x04c2:
            X.L0d r1 = r5.A02
            X.LAL r0 = r5.A03
            java.lang.String r4 = r0.A00
            java.lang.String r3 = r7.A06
            X.0qQ.A0B(r3, r6)
            X.L81 r1 = r1.A00
            X.0eM r0 = r1.A01
            java.lang.Object r2 = r0.getValue()
            X.0Ak r2 = (X.0Ak) r2
            if (r2 == 0) goto L_0x04f7
            com.instagram.common.session.UserSession r0 = r1.A00
            java.lang.String r0 = r0.A06
            long r0 = X.DbZ.A07(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "author_igid"
            r2.A0Q(r0, r1)
            java.lang.String r0 = "cta_type"
            r2.A0R(r0, r3)
            java.lang.String r0 = "media_type"
            r2.A0R(r0, r4)
            r2.Cgf()
        L_0x04f7:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x04fa:
            X.0eS.A00(r3)
            java.lang.Object r5 = r0.A03
            X.Jhz r5 = (X.C60242Jhz) r5
            X.Jvo r7 = r5.A00
            if (r7 == 0) goto L_0x04f7
            X.LAL r3 = r5.A03
            X.05G r1 = r3.A06
            r1.Epw(r7)
            com.instagram.common.session.UserSession r1 = r3.A03
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Object r1 = r7.A05
            X.Khl r1 = (X.C62555Khl) r1
            X.JwI r3 = new X.JwI
            r3.<init>((X.C62555Khl) r1)
            X.LfX r1 = new X.LfX
            r1.<init>(r3)
            r4.A00(r1)
            X.3ju r3 = r5.A04
            X.LLE r1 = X.LLE.A00
            r0.A01 = r5
            r0.A02 = r7
            r0.A00 = r6
            java.lang.Object r0 = r3.ELH(r1, r0)
            if (r0 != r2) goto L_0x04c2
            return r2
        L_0x0534:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0539:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x0547
            if (r1 == r4) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0547:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            r3 = 0
            java.lang.Object r2 = r0.A03
            r1 = 13
            X.MHN r8 = new X.MHN
            r8.<init>(r2, r3, r1)
            r0.A00 = r4
            goto L_0x0aa3
        L_0x055d:
            r2 = r3
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x0570
            if (r1 != r4) goto L_0x056b
            X.0eS.A00(r3)
            return r2
        L_0x056b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0570:
            X.0eS.A00(r3)
            java.lang.Object r1 = r0.A03
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r1
            java.lang.Object r2 = r0.A02
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            java.lang.Object r6 = r0.A01
            X.5kq r6 = (X.C293505kq) r6
            r0.A00 = r4
            com.instagram.common.session.UserSession r1 = r1.A04
            java.lang.Class<X.8Xy> r0 = X.C357458Xy.class
            java.lang.Object r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x05d6
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.JXe r4 = new X.JXe
            r4.<init>()
            java.lang.String r0 = r2.A35
            X.JXc r0 = X.C59764JXc.A00(r0)
            r4.A0g = r0
            X.51W r1 = r2.A1P
            if (r1 == 0) goto L_0x05cf
            java.util.List r0 = r1.A01()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x05cf
            java.util.List r0 = r1.A01()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x05b6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05c8
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x05b6
            r3.add(r1)
            goto L_0x05b6
        L_0x05c8:
            java.util.List r0 = X.LIO.A01(r3)
            r4.A06(r0)
        L_0x05cf:
            X.5kq r2 = r4.A01(r6)
            if (r2 != r5) goto L_0x0ac5
            return r5
        L_0x05d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x05db:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x05e9
            if (r1 == r4) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05e9:
            X.0eS.A00(r3)
            java.lang.Object r1 = r0.A03
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = r1.A07
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.A01(r1)
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            boolean r11 = X.DbW.A1S(r4, r1, r3)
            X.Lnb r2 = new X.Lnb
            r2.<init>(r1)
            X.LnZ r1 = new X.LnZ
            r1.<init>(r3)
            X.B1S[] r1 = new X.B1S[]{r2, r1}
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.mutations.CompositeMutation r7 = new com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.mutations.CompositeMutation
            r7.<init>(r1)
            r8 = 0
            r0.A00 = r4
            X.MNx r10 = X.C66340MNx.A00
            r9 = r0
            r12 = r11
            java.lang.Object r0 = r6.A0F(r7, r8, r9, r10, r11, r12)
            goto L_0x0aa7
        L_0x0621:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x062f
            if (r1 == r6) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x062f:
            X.0eS.A00(r3)
            java.lang.Object r1 = r0.A03
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r1 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r4 = r1.A0H
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            X.LnY r1 = new X.LnY
            r1.<init>(r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.A0G(r1, r0, r2)
            goto L_0x0aa7
        L_0x064d:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x065b
            if (r1 == r6) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x065b:
            X.0eS.A00(r3)
            java.lang.Object r1 = r0.A03
            X.8Cx r1 = (X.C352328Cx) r1
            X.0V2 r4 = r1.A02
            java.lang.Object r3 = r0.A02
            X.7zv r3 = (X.C349307zv) r3
            java.lang.Object r2 = r0.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.JVf r1 = new X.JVf
            r1.<init>((X.C349307zv) r3, (java.lang.Integer) r2)
            r0.A00 = r6
            java.lang.Object r0 = r4.emit(r1, r0)
            goto L_0x0aa7
        L_0x0679:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0695
            if (r1 != r6) goto L_0x0a8f
            java.lang.Object r4 = r0.A02
            X.3EX r4 = (X.AnonymousClass3EX) r4
            X.0eS.A00(r3)
        L_0x068a:
            r1 = 0
            r0.A02 = r1
            r0.A00 = r7
            java.lang.Object r0 = r4.emit(r3, r0)
            goto L_0x0aa7
        L_0x0695:
            X.0eS.A00(r3)
            java.lang.Object r4 = r0.A02
            X.3EX r4 = (X.AnonymousClass3EX) r4
            java.lang.Object r1 = r0.A03
            X.Jg3 r1 = (X.C60122Jg3) r1
            com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService r2 = r1.A00
            java.lang.Object r1 = r0.A01
            X.7zv r1 = (X.C349307zv) r1
            r0.A02 = r4
            r0.A00 = r6
            java.lang.Object r3 = r2.A02(r1, r0)
            if (r3 != r5) goto L_0x068a
            return r5
        L_0x06b1:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x06bf
            if (r1 == r4) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06bf:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            r2 = 0
            java.lang.Object r1 = r0.A03
            X.MHN r8 = new X.MHN
            r8.<init>(r1, r2, r4)
            r0.A00 = r4
            goto L_0x0aa3
        L_0x06d3:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x06e1
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06e1:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 49
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x06f3:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0701
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0701:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 48
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x0713:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0721
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0721:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 47
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x0733:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0741
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0741:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 46
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x0753:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0761
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0761:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 45
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x0773:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0781
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0781:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 44
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x0793:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x07a1
            if (r1 == r4) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07a1:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            r3 = 0
            java.lang.Object r2 = r0.A03
            r1 = 9
            X.MGV r8 = X.MGV.A01(r2, r3, r1)
            r0.A00 = r4
            goto L_0x0aa3
        L_0x07b6:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x07c4
            if (r1 == r4) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07c4:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            r3 = 0
            java.lang.Object r2 = r0.A03
            r1 = 8
            X.MGV r8 = X.MGV.A01(r2, r3, r1)
            r0.A00 = r4
            goto L_0x0aa3
        L_0x07d9:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x07e7
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07e7:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 42
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x07f9:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0807
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0807:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 41
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x0819:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x0827
            if (r1 == r4) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0827:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            r3 = 0
            java.lang.Object r2 = r0.A03
            r1 = 5
            X.MGV r8 = X.MGV.A01(r2, r3, r1)
            r0.A00 = r4
            goto L_0x0aa3
        L_0x083b:
            r2 = r3
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 1
            if (r1 == 0) goto L_0x0856
            if (r1 != r8) goto L_0x0899
            X.0eS.A00(r3)
        L_0x0848:
            if (r2 == 0) goto L_0x0ac5
        L_0x084a:
            java.lang.Object r1 = r0.A03
            X.LOG r1 = (X.LOG) r1
            java.util.Map r1 = r1.A05
            java.lang.Object r0 = r0.A01
            r1.put(r0, r2)
            return r2
        L_0x0856:
            X.0eS.A00(r3)
            java.lang.Object r7 = r0.A02
            X.4Cq r7 = (X.C262224Cq) r7
            java.lang.Object r6 = r0.A03
            X.LOG r6 = (X.LOG) r6
            java.util.Map r2 = r6.A05
            java.lang.Object r4 = r0.A01
            boolean r1 = r2.containsKey(r4)
            if (r1 == 0) goto L_0x0870
            java.lang.Object r2 = r2.get(r4)
            return r2
        L_0x0870:
            boolean r1 = r4 instanceof X.AnonymousClass51M
            if (r1 == 0) goto L_0x0889
            r3 = 0
            r2 = 40
            X.MH1 r1 = new X.MH1
            r1.<init>(r4, r6, r3, r2)
            X.2Q8 r1 = X.JTO.A1E(r1, r7)
            r0.A00 = r8
            java.lang.Object r2 = r1.A0E(r0)
            if (r2 != r5) goto L_0x0848
            return r5
        L_0x0889:
            boolean r1 = r4 instanceof X.KN4
            if (r1 == 0) goto L_0x089e
            r3 = 0
            r8 = 0
            r6 = 7
            r7 = 4
            X.JwF r2 = new X.JwF
            r4 = r3
            r5 = r3
            r2.<init>((java.lang.String) r3, (java.util.List) r4, (kotlin.jvm.internal.DefaultConstructorMarker) r5, (int) r6, (int) r7, (boolean) r8)
            goto L_0x084a
        L_0x0899:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x089e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x08a3:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x08b1
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08b1:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 33
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x08c3:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x08d1
            if (r1 == r4) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08d1:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            r3 = 0
            java.lang.Object r2 = r0.A03
            r1 = 49
            X.MGa r8 = new X.MGa
            r8.<init>(r2, r3, r1)
            r0.A00 = r4
            goto L_0x0aa3
        L_0x08e7:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x08f5
            if (r1 == r9) goto L_0x0962
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08f5:
            X.0eS.A00(r3)
            java.lang.Object r8 = r0.A02
            X.4Cq r8 = (X.C262224Cq) r8
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.lang.Object r1 = r0.A01
            java.util.Iterator r7 = X.C51966G9m.A1H(r1)
        L_0x0906:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0955
            java.lang.String r6 = X.AnonymousClass7TE.A18(r7)
            r4 = 0
            java.lang.Object r3 = r0.A03
            r2 = 42
            X.MGE r1 = new X.MGE
            r1.<init>(r3, r6, r4, r2)
            X.JTQ.A1M(r10, r1, r8)
            goto L_0x0906
        L_0x091e:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x092c
            if (r1 == r9) goto L_0x0962
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x092c:
            X.0eS.A00(r3)
            java.lang.Object r8 = r0.A02
            X.4Cq r8 = (X.C262224Cq) r8
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.lang.Object r1 = r0.A01
            java.util.Iterator r7 = X.C51966G9m.A1H(r1)
        L_0x093d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0955
            java.lang.String r6 = X.AnonymousClass7TE.A18(r7)
            r4 = 0
            java.lang.Object r3 = r0.A03
            r2 = 41
            X.MGE r1 = new X.MGE
            r1.<init>(r3, r6, r4, r2)
            X.JTQ.A1M(r10, r1, r8)
            goto L_0x093d
        L_0x0955:
            java.lang.Object r1 = r0.A03
            r0.A02 = r1
            r0.A00 = r9
            java.lang.Object r3 = X.AnonymousClass42T.A00(r10, r0)
            if (r3 != r5) goto L_0x0965
            return r5
        L_0x0962:
            X.0eS.A00(r3)
        L_0x0965:
            java.util.List r3 = (java.util.List) r3
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r5 = r3.iterator()
        L_0x096f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0999
            java.lang.Object r0 = r5.next()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r0)
        L_0x097f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x096f
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r4)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            if (r1 == 0) goto L_0x097f
            if (r0 == 0) goto L_0x097f
            r2.put(r1, r0)
            goto L_0x097f
        L_0x0999:
            int r1 = r2.size()
            int r0 = r3.size()
            if (r1 == r0) goto L_0x0ac5
            r2 = 0
            return r2
        L_0x09a5:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 1
            if (r1 == 0) goto L_0x09b3
            if (r1 == r7) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09b3:
            X.0eS.A00(r3)
            java.lang.Object r4 = r0.A03
            X.4Cq r4 = (X.C262224Cq) r4
            r6 = 0
            java.lang.Object r2 = r0.A02
            r1 = 24
            X.MGu r3 = new X.MGu
            r3.<init>(r2, r6, r1)
            X.19B r2 = X.19B.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.1Eo.A01(r1, r2, r3, r4)
            X.4CZ r1 = X.AnonymousClass12W.A00
            X.134 r4 = X.AnonymousClass12y.A00
            java.lang.Object r3 = r0.A01
            r2 = 12
            X.MG0 r1 = new X.MG0
            r1.<init>(r3, r6, r2)
            r0.A00 = r7
            java.lang.Object r0 = X.1Eo.A00(r0, r4, r1)
            goto L_0x0aa7
        L_0x09e0:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x09ee
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09ee:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 26
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x0a00:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0a0e
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a0e:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 25
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x0a20:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0a2e
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a2e:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 24
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x0a3f:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0a4d
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a4d:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 23
            X.MH1 r8 = A01(r2, r0, r1)
            goto L_0x0aa3
        L_0x0a5e:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x0a6c
            if (r1 == r4) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a6c:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            r3 = 0
            java.lang.Object r2 = r0.A03
            r1 = 38
            X.MGa r8 = new X.MGa
            r8.<init>(r2, r3, r1)
            r0.A00 = r4
            goto L_0x0aa3
        L_0x0a81:
            X.1Hj r5 = X.1Hj.A02
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x0a93
            if (r2 == r1) goto L_0x0a8f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a8f:
            X.0eS.A00(r3)
            goto L_0x0ac3
        L_0x0a93:
            X.07V r7 = A00(r3, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            java.lang.Object r2 = r0.A03
            r1 = 15
            X.MH1 r8 = A01(r2, r0, r1)
        L_0x0aa3:
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r6, r7, r0, r8)
        L_0x0aa7:
            if (r0 != r5) goto L_0x0ac3
            return r5
        L_0x0aaa:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x0ac6
            if (r1 != r6) goto L_0x0b02
            java.lang.Object r4 = r0.A02
            X.50r r4 = (X.C2801950r) r4
            X.0eS.A00(r3)
        L_0x0aba:
            java.lang.Object r2 = r0.A03
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r2
            r1 = 0
            r0 = 0
            r2.A0F(r4, r1, r0)
        L_0x0ac3:
            X.0gF r2 = X.C60340gF.A00
        L_0x0ac5:
            return r2
        L_0x0ac6:
            X.0eS.A00(r3)
            java.lang.Object r7 = r0.A03
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r7 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r7
            X.2Fj r1 = r7.A0C
            java.lang.Object r1 = r1.A02()
            X.88W r1 = (X.AnonymousClass88W) r1
            if (r1 == 0) goto L_0x0b07
            java.lang.Object r1 = r1.A01
            X.9IV r1 = (X.AnonymousClass9IV) r1
            if (r1 == 0) goto L_0x0b07
            java.lang.Object r8 = r1.A00
            X.5kq r8 = (X.C293505kq) r8
            if (r8 == 0) goto L_0x0b07
            X.50r r4 = r8.A0H
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = r7.A0H
            r11 = 0
            X.8Y4 r1 = new X.8Y4
            r1.<init>(r8)
            r2.A00 = r1
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            r0.A02 = r4
            r0.A00 = r6
            r9 = r0
            r10 = r1
            r12 = r6
            r13 = r11
            java.lang.Object r1 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A03(r7, r8, r9, r10, r11, r12, r13)
            if (r1 != r5) goto L_0x0aba
            return r5
        L_0x0b02:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b07:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0b0c:
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r9 = 0
            r8 = 1
            if (r1 == 0) goto L_0x0b1e
            if (r1 != r8) goto L_0x0b42
            X.0eS.A00(r3)
        L_0x0b19:
            java.lang.Object r2 = X.C51966G9m.A19(r3, r9)
            return r2
        L_0x0b1e:
            X.0eS.A00(r3)
            java.lang.Object r7 = r0.A02
            X.4Cq r7 = (X.C262224Cq) r7
            r6 = 0
            java.lang.Object r4 = r0.A03
            java.lang.Object r3 = r0.A01
            r2 = 31
            X.MGa r1 = new X.MGa
            r1.<init>(r3, r4, r6, r2)
            X.2Q8 r1 = X.JTO.A1E(r1, r7)
            X.2Q9[] r1 = new X.AnonymousClass2Q9[]{r1}
            r0.A00 = r8
            java.lang.Object r3 = X.AnonymousClass42T.A02(r0, r1)
            if (r3 != r5) goto L_0x0b19
            return r5
        L_0x0b42:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static AnonymousClass07V A00(Object obj, MHJ mhj) {
        0eS.A00(obj);
        return ((AnonymousClass07Z) mhj.A02).getLifecycle();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MHJ) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHJ(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A04 = i;
        this.A03 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHJ(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A04 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHJ(Object obj, Object obj2, AnonymousClass4D7 r4, int i, int i2) {
        super(2, r4);
        this.A04 = i;
        this.A03 = obj;
        this.A01 = obj2;
    }
}
