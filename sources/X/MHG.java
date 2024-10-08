package X;

public final class MHG extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHG(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A05 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.MHG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.MHG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5, types: [X.MHG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v11, types: [X.MHG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v13, types: [X.MHG, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v29, types: [X.MHG] */
    /* JADX WARNING: type inference failed for: r5v30, types: [X.MHG] */
    /* JADX WARNING: type inference failed for: r5v31, types: [X.MHG] */
    /* JADX WARNING: type inference failed for: r5v32, types: [X.MHG] */
    /* JADX WARNING: type inference failed for: r5v33, types: [X.MHG] */
    /* JADX WARNING: type inference failed for: r5v34, types: [X.MHG] */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        return new X.MHG(r1, r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0098, code lost:
        r4 = new X.MHG(r2, r14, r0);
        r4.A01 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ef, code lost:
        r5 = new X.MHG(r6, r7, r0, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r6 = new X.MHG(r7, r8, r9, r10, 42);
        r6.A02 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x014d, code lost:
        r5 = new X.MHG(r14, r0, r3, r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0185, code lost:
        r5 = new X.MHG(r6, r7, r2, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x018c, code lost:
        r4.A04 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018e, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d3, code lost:
        r5 = new X.MHG(r14, r2, r0, r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01f8, code lost:
        r5 = new X.MHG(r14, r3, r0, r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0237, code lost:
        r5 = new X.MHG(r14, r3, r2, r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0241, code lost:
        r4.A03 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0243, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0253, code lost:
        return new X.MHG(r5, r6, r7, r8, r9, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            int r2 = r12.A05
            r9 = r14
            switch(r2) {
                case 0: goto L_0x0023;
                case 1: goto L_0x0017;
                case 2: goto L_0x002e;
                case 3: goto L_0x001d;
                case 4: goto L_0x0037;
                case 5: goto L_0x0040;
                case 6: goto L_0x0049;
                case 7: goto L_0x0052;
                case 8: goto L_0x005b;
                case 9: goto L_0x0060;
                case 10: goto L_0x0065;
                case 11: goto L_0x006f;
                case 12: goto L_0x007c;
                case 13: goto L_0x0088;
                case 14: goto L_0x0094;
                case 15: goto L_0x00a0;
                case 16: goto L_0x00aa;
                case 17: goto L_0x00b6;
                case 18: goto L_0x00c2;
                case 19: goto L_0x00ce;
                case 20: goto L_0x00da;
                case 21: goto L_0x00e7;
                case 22: goto L_0x00f8;
                case 23: goto L_0x0102;
                case 24: goto L_0x010e;
                case 25: goto L_0x0117;
                case 26: goto L_0x0123;
                case 27: goto L_0x012f;
                case 28: goto L_0x013b;
                case 29: goto L_0x0145;
                case 30: goto L_0x0159;
                case 31: goto L_0x0163;
                case 32: goto L_0x016d;
                case 33: goto L_0x017d;
                case 34: goto L_0x018f;
                case 35: goto L_0x019b;
                case 36: goto L_0x01a7;
                case 37: goto L_0x01b3;
                case 38: goto L_0x01bf;
                case 39: goto L_0x01cb;
                case 40: goto L_0x01de;
                case 41: goto L_0x01e7;
                case 42: goto L_0x01f0;
                case 43: goto L_0x0203;
                case 44: goto L_0x020e;
                case 45: goto L_0x0219;
                case 46: goto L_0x0224;
                case 47: goto L_0x022f;
                case 48: goto L_0x0244;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r8 = r12.A04
            java.lang.Object r7 = r12.A01
            r10 = 49
        L_0x000c:
            r11 = 42
            X.MHG r4 = new X.MHG
            r6 = r4
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10, (int) r11)
            r4.A02 = r13
            return r4
        L_0x0017:
            java.lang.Object r7 = r12.A01
            java.lang.Object r8 = r12.A04
            r10 = 1
            goto L_0x000c
        L_0x001d:
            java.lang.Object r7 = r12.A01
            java.lang.Object r8 = r12.A04
            r10 = 3
            goto L_0x000c
        L_0x0023:
            java.lang.Object r7 = r12.A04
            java.lang.Object r6 = r12.A02
            java.lang.Object r8 = r12.A01
            java.lang.Object r5 = r12.A03
            r10 = 0
            goto L_0x024e
        L_0x002e:
            java.lang.Object r3 = r12.A04
            java.lang.Object r2 = r12.A01
            java.lang.Object r0 = r12.A02
            r10 = 2
            goto L_0x01f8
        L_0x0037:
            java.lang.Object r3 = r12.A01
            java.lang.Object r2 = r12.A04
            java.lang.Object r0 = r12.A02
            r10 = 4
            goto L_0x01d3
        L_0x0040:
            java.lang.Object r2 = r12.A03
            java.lang.Object r7 = r12.A01
            java.lang.Object r6 = r12.A02
            r10 = 5
            goto L_0x0185
        L_0x0049:
            java.lang.Object r7 = r12.A01
            java.lang.Object r6 = r12.A02
            java.lang.Object r0 = r12.A03
            r10 = 6
            goto L_0x00ef
        L_0x0052:
            java.lang.Object r3 = r12.A04
            java.lang.Object r2 = r12.A01
            java.lang.Object r0 = r12.A02
            r10 = 7
            goto L_0x01f8
        L_0x005b:
            java.lang.Object r2 = r12.A04
            r0 = 8
            goto L_0x0098
        L_0x0060:
            java.lang.Object r1 = r12.A04
            r0 = 9
            goto L_0x0069
        L_0x0065:
            java.lang.Object r1 = r12.A04
            r0 = 10
        L_0x0069:
            X.MHG r4 = new X.MHG
            r4.<init>(r1, r14, r0)
            return r4
        L_0x006f:
            java.lang.Object r3 = r12.A01
            java.lang.Object r2 = r12.A02
            r0 = 11
            X.MHG r4 = new X.MHG
            r4.<init>(r2, r3, r14, r0)
            goto L_0x0241
        L_0x007c:
            java.lang.Object r8 = r12.A01
            java.lang.Object r7 = r12.A04
            java.lang.Object r6 = r12.A02
            java.lang.Object r5 = r12.A03
            r10 = 12
            goto L_0x024e
        L_0x0088:
            java.lang.Object r5 = r12.A03
            java.lang.Object r7 = r12.A04
            java.lang.Object r6 = r12.A02
            java.lang.Object r8 = r12.A01
            r10 = 13
            goto L_0x024e
        L_0x0094:
            java.lang.Object r2 = r12.A04
            r0 = 14
        L_0x0098:
            X.MHG r4 = new X.MHG
            r4.<init>(r2, r14, r0)
            r4.A01 = r13
            return r4
        L_0x00a0:
            java.lang.Object r3 = r12.A04
            java.lang.Object r2 = r12.A02
            java.lang.Object r0 = r12.A01
            r10 = 15
            goto L_0x0237
        L_0x00aa:
            java.lang.Object r7 = r12.A04
            java.lang.Object r5 = r12.A03
            java.lang.Object r6 = r12.A02
            java.lang.Object r8 = r12.A01
            r10 = 16
            goto L_0x024e
        L_0x00b6:
            java.lang.Object r5 = r12.A03
            java.lang.Object r6 = r12.A02
            java.lang.Object r7 = r12.A04
            java.lang.Object r8 = r12.A01
            r10 = 17
            goto L_0x024e
        L_0x00c2:
            java.lang.Object r6 = r12.A02
            java.lang.Object r8 = r12.A01
            java.lang.Object r7 = r12.A04
            java.lang.Object r5 = r12.A03
            r10 = 18
            goto L_0x024e
        L_0x00ce:
            java.lang.Object r7 = r12.A04
            java.lang.Object r8 = r12.A01
            java.lang.Object r5 = r12.A03
            java.lang.Object r6 = r12.A02
            r10 = 19
            goto L_0x024e
        L_0x00da:
            java.lang.Object r3 = r12.A02
            java.lang.Object r2 = r12.A01
            r0 = 20
            X.MHG r4 = new X.MHG
            r4.<init>(r3, r2, r14, r0)
            goto L_0x0241
        L_0x00e7:
            java.lang.Object r6 = r12.A02
            java.lang.Object r7 = r12.A01
            java.lang.Object r0 = r12.A03
            r10 = 21
        L_0x00ef:
            X.MHG r4 = new X.MHG
            r5 = r4
            r8 = r0
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            goto L_0x018c
        L_0x00f8:
            java.lang.Object r2 = r12.A03
            java.lang.Object r7 = r12.A01
            java.lang.Object r6 = r12.A02
            r10 = 22
            goto L_0x0185
        L_0x0102:
            java.lang.Object r5 = r12.A03
            java.lang.Object r6 = r12.A02
            java.lang.Object r8 = r12.A01
            java.lang.Object r7 = r12.A04
            r10 = 23
            goto L_0x024e
        L_0x010e:
            java.lang.Object r3 = r12.A02
            java.lang.Object r2 = r12.A01
            java.lang.Object r0 = r12.A04
            r10 = 24
            goto L_0x014d
        L_0x0117:
            java.lang.Object r7 = r12.A04
            java.lang.Object r6 = r12.A02
            java.lang.Object r8 = r12.A01
            java.lang.Object r5 = r12.A03
            r10 = 25
            goto L_0x024e
        L_0x0123:
            java.lang.Object r7 = r12.A04
            java.lang.Object r8 = r12.A01
            java.lang.Object r6 = r12.A02
            java.lang.Object r5 = r12.A03
            r10 = 26
            goto L_0x024e
        L_0x012f:
            java.lang.Object r5 = r12.A03
            java.lang.Object r8 = r12.A01
            java.lang.Object r6 = r12.A02
            java.lang.Object r7 = r12.A04
            r10 = 27
            goto L_0x024e
        L_0x013b:
            java.lang.Object r3 = r12.A04
            java.lang.Object r2 = r12.A02
            java.lang.Object r0 = r12.A01
            r10 = 28
            goto L_0x0237
        L_0x0145:
            java.lang.Object r3 = r12.A02
            java.lang.Object r2 = r12.A01
            java.lang.Object r0 = r12.A04
            r10 = 29
        L_0x014d:
            X.MHG r4 = new X.MHG
            r5 = r4
            r6 = r14
            r7 = r0
            r8 = r3
            r9 = r2
            r5.<init>((X.AnonymousClass4D7) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (int) r10)
            goto L_0x0241
        L_0x0159:
            java.lang.Object r3 = r12.A04
            java.lang.Object r2 = r12.A01
            java.lang.Object r0 = r12.A02
            r10 = 30
            goto L_0x01f8
        L_0x0163:
            java.lang.Object r3 = r12.A04
            java.lang.Object r2 = r12.A01
            java.lang.Object r0 = r12.A02
            r10 = 31
            goto L_0x01f8
        L_0x016d:
            java.lang.Object r1 = r12.A03
            java.lang.Object r7 = r12.A01
            java.lang.Object r6 = r12.A02
            r10 = 32
            X.MHG r4 = new X.MHG
            r5 = r4
            r8 = r1
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            return r4
        L_0x017d:
            java.lang.Object r2 = r12.A03
            java.lang.Object r6 = r12.A02
            java.lang.Object r7 = r12.A01
            r10 = 33
        L_0x0185:
            X.MHG r4 = new X.MHG
            r5 = r4
            r8 = r2
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
        L_0x018c:
            r4.A04 = r13
            return r4
        L_0x018f:
            java.lang.Object r7 = r12.A04
            java.lang.Object r8 = r12.A01
            java.lang.Object r5 = r12.A03
            java.lang.Object r6 = r12.A02
            r10 = 34
            goto L_0x024e
        L_0x019b:
            java.lang.Object r7 = r12.A04
            java.lang.Object r6 = r12.A02
            java.lang.Object r5 = r12.A03
            java.lang.Object r8 = r12.A01
            r10 = 35
            goto L_0x024e
        L_0x01a7:
            java.lang.Object r7 = r12.A04
            java.lang.Object r5 = r12.A03
            java.lang.Object r8 = r12.A01
            java.lang.Object r6 = r12.A02
            r10 = 36
            goto L_0x024e
        L_0x01b3:
            java.lang.Object r6 = r12.A02
            java.lang.Object r8 = r12.A01
            java.lang.Object r7 = r12.A04
            java.lang.Object r5 = r12.A03
            r10 = 37
            goto L_0x024e
        L_0x01bf:
            java.lang.Object r7 = r12.A04
            java.lang.Object r6 = r12.A02
            java.lang.Object r8 = r12.A01
            java.lang.Object r5 = r12.A03
            r10 = 38
            goto L_0x024e
        L_0x01cb:
            java.lang.Object r3 = r12.A01
            java.lang.Object r2 = r12.A04
            java.lang.Object r0 = r12.A02
            r10 = 39
        L_0x01d3:
            X.MHG r4 = new X.MHG
            r5 = r4
            r6 = r14
            r7 = r2
            r8 = r0
            r9 = r3
            r5.<init>((X.AnonymousClass4D7) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (int) r10)
            goto L_0x0241
        L_0x01de:
            java.lang.Object r3 = r12.A04
            java.lang.Object r2 = r12.A02
            java.lang.Object r0 = r12.A01
            r10 = 40
            goto L_0x0237
        L_0x01e7:
            java.lang.Object r3 = r12.A04
            java.lang.Object r2 = r12.A02
            java.lang.Object r0 = r12.A01
            r10 = 41
            goto L_0x0237
        L_0x01f0:
            java.lang.Object r3 = r12.A04
            java.lang.Object r2 = r12.A01
            java.lang.Object r0 = r12.A02
            r10 = 42
        L_0x01f8:
            X.MHG r4 = new X.MHG
            r5 = r4
            r6 = r14
            r7 = r3
            r8 = r0
            r9 = r2
            r5.<init>((X.AnonymousClass4D7) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (int) r10)
            goto L_0x0241
        L_0x0203:
            java.lang.Object r8 = r12.A01
            java.lang.Object r6 = r12.A02
            java.lang.Object r7 = r12.A04
            java.lang.Object r5 = r12.A03
            r10 = 43
            goto L_0x024e
        L_0x020e:
            java.lang.Object r5 = r12.A03
            java.lang.Object r6 = r12.A02
            java.lang.Object r7 = r12.A04
            java.lang.Object r8 = r12.A01
            r10 = 44
            goto L_0x024e
        L_0x0219:
            java.lang.Object r5 = r12.A03
            java.lang.Object r6 = r12.A02
            java.lang.Object r8 = r12.A01
            java.lang.Object r7 = r12.A04
            r10 = 45
            goto L_0x024e
        L_0x0224:
            java.lang.Object r5 = r12.A03
            java.lang.Object r8 = r12.A01
            java.lang.Object r7 = r12.A04
            java.lang.Object r6 = r12.A02
            r10 = 46
            goto L_0x024e
        L_0x022f:
            java.lang.Object r3 = r12.A04
            java.lang.Object r2 = r12.A02
            java.lang.Object r0 = r12.A01
            r10 = 47
        L_0x0237:
            X.MHG r4 = new X.MHG
            r5 = r4
            r6 = r14
            r7 = r3
            r8 = r2
            r9 = r0
            r5.<init>((X.AnonymousClass4D7) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (int) r10)
        L_0x0241:
            r4.A03 = r13
            return r4
        L_0x0244:
            java.lang.Object r7 = r12.A04
            java.lang.Object r5 = r12.A03
            java.lang.Object r6 = r12.A02
            java.lang.Object r8 = r12.A01
            r10 = 48
        L_0x024e:
            X.MHG r4 = new X.MHG
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHG.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v112, resolved type: X.5eu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v113, resolved type: X.5eu} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.MHG, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, X.0rh] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:647:0x0eb0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:651:0x0ec1  */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r12 = r18
            int r1 = r0.A05
            switch(r1) {
                case 0: goto L_0x0ef1;
                case 1: goto L_0x0e7c;
                case 2: goto L_0x0d6e;
                case 3: goto L_0x0df9;
                case 4: goto L_0x0e4b;
                case 5: goto L_0x0ced;
                case 6: goto L_0x0caf;
                case 7: goto L_0x0c5b;
                case 8: goto L_0x0bf2;
                case 9: goto L_0x0b8b;
                case 10: goto L_0x0b23;
                case 11: goto L_0x0ab0;
                case 12: goto L_0x0a75;
                case 13: goto L_0x0a38;
                case 14: goto L_0x09e0;
                case 15: goto L_0x09a6;
                case 16: goto L_0x0974;
                case 17: goto L_0x0945;
                case 18: goto L_0x0916;
                case 19: goto L_0x08ba;
                case 20: goto L_0x0849;
                case 21: goto L_0x0820;
                case 22: goto L_0x07f4;
                case 23: goto L_0x07b9;
                case 24: goto L_0x077e;
                case 25: goto L_0x0750;
                case 26: goto L_0x06e5;
                case 27: goto L_0x06b6;
                case 28: goto L_0x066c;
                case 29: goto L_0x05fa;
                case 30: goto L_0x0594;
                case 31: goto L_0x04df;
                case 32: goto L_0x0463;
                case 33: goto L_0x0417;
                case 34: goto L_0x03e7;
                case 35: goto L_0x03c4;
                case 36: goto L_0x039c;
                case 37: goto L_0x0374;
                case 38: goto L_0x0347;
                case 39: goto L_0x005d;
                case 40: goto L_0x0311;
                case 41: goto L_0x02d3;
                case 42: goto L_0x0f67;
                case 43: goto L_0x021f;
                case 44: goto L_0x01f6;
                case 45: goto L_0x01cd;
                case 46: goto L_0x01aa;
                case 47: goto L_0x00c8;
                case 48: goto L_0x009f;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r0.A00
            r1 = 0
            r9 = 1
            if (r3 == 0) goto L_0x0025
            if (r3 != r9) goto L_0x009a
            java.lang.Object r6 = r0.A03
            java.lang.Object r8 = r0.A02
            X.LOG r8 = (X.LOG) r8
            X.0eS.A00(r12)
        L_0x001c:
            r1 = r12
            if (r12 == 0) goto L_0x0024
            java.util.Map r0 = r8.A06
            r0.put(r6, r12)
        L_0x0024:
            return r1
        L_0x0025:
            X.0eS.A00(r12)
            java.lang.Object r7 = r0.A02
            X.4Cq r7 = (X.C262224Cq) r7
            java.lang.Object r8 = r0.A04
            X.LOG r8 = (X.LOG) r8
            java.util.Map r4 = r8.A06
            java.lang.Object r6 = r0.A01
            X.M1Y r6 = (X.M1Y) r6
            boolean r3 = r4.containsKey(r6)
            if (r3 == 0) goto L_0x0041
            java.lang.Object r1 = r4.get(r6)
            return r1
        L_0x0041:
            java.lang.String r5 = r6.A06
            if (r5 == 0) goto L_0x0024
            r4 = 45
            X.MGE r3 = new X.MGE
            r3.<init>(r8, r5, r1, r4)
            X.2Q8 r1 = X.JTO.A1E(r3, r7)
            r0.A02 = r8
            r0.A03 = r6
            r0.A00 = r9
            java.lang.Object r12 = r1.A0E(r0)
            if (r12 != r2) goto L_0x001c
            return r2
        L_0x005d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x0069
            if (r2 != r3) goto L_0x0f4a
            java.lang.Object r4 = r0.A03
            goto L_0x007e
        L_0x0069:
            X.0eS.A00(r12)
            java.lang.Object r4 = r0.A03
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x0f50 }
            X.0sP r2 = (X.0sP) r2     // Catch:{ all -> 0x0f50 }
            r0.A03 = r4     // Catch:{ all -> 0x0f50 }
            r0.A00 = r3     // Catch:{ all -> 0x0f50 }
            java.lang.Object r12 = r2.invoke(r0)     // Catch:{ all -> 0x0f50 }
            if (r12 != r1) goto L_0x0081
            goto L_0x0f4f
        L_0x007e:
            X.0eS.A00(r12)     // Catch:{ all -> 0x0f50 }
        L_0x0081:
            r1 = r12
            X.5mw r1 = (X.C294735mw) r1     // Catch:{ all -> 0x0f50 }
            java.lang.Object r2 = r0.A04
            X.4HW r2 = (X.AnonymousClass4HW) r2
            java.util.concurrent.ConcurrentHashMap r3 = r2.A00
            java.lang.Object r2 = r0.A02
            java.lang.Object r0 = r3.get(r2)
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0024
            r3.remove(r2)
            return r1
        L_0x009a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x009f:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x00ad
            if (r1 == r6) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ad:
            X.0eS.A00(r12)
            java.lang.Object r5 = r0.A04
            com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel r5 = (com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel) r5
            java.lang.Object r4 = r0.A03
            com.instagram.reels.prompt.model.PromptStickerModel r4 = (com.instagram.reels.prompt.model.PromptStickerModel) r4
            java.lang.Object r3 = r0.A02
            X.6b1 r3 = (X.C310416b1) r3
            java.lang.Object r1 = r0.A01
            com.instagram.feed.media.CreativeConfigIntf r1 = (com.instagram.feed.media.CreativeConfigIntf) r1
            r0.A00 = r6
            java.lang.Object r0 = r5.A00(r1, r4, r3, r0)
            goto L_0x0414
        L_0x00c8:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r11 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r6 = 0
            if (r2 == 0) goto L_0x00fc
            if (r2 == r9) goto L_0x0160
            if (r2 != r8) goto L_0x0c04
            java.lang.Object r5 = r0.A03
            java.util.List r5 = (java.util.List) r5
            X.0eS.A00(r12)
        L_0x00de:
            X.3Ih r12 = X.C51967G9n.A0d()
        L_0x00e2:
            java.lang.Object r4 = r0.A04
            com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r4 = (com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource) r4
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            boolean r2 = r12 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x0f18
            boolean r2 = r12 instanceof X.C297815sO
            if (r2 == 0) goto L_0x018f
            r0.A03 = r6
            r0.A00 = r7
            java.lang.Object r0 = com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource.A02(r4, r3, r5, r6, r0)
            goto L_0x0c53
        L_0x00fc:
            X.0eS.A00(r12)
            java.lang.Object r12 = r0.A04
            com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r12 = (com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource) r12
            android.content.Context r3 = r12.A01
            com.instagram.common.session.UserSession r10 = r12.A03
            java.lang.Object r2 = r0.A02
            X.2jA r2 = (X.C227382jA) r2
            X.AnonymousClass7TG.A1T(r3, r10, r2)
            X.JY0 r5 = X.JTS.A0Q(r3, r10, r2)
            if (r5 == 0) goto L_0x015d
            X.9rz r2 = X.C390879rz.AUTO_CREATED_REELS
            java.util.List r4 = X.AnonymousClass7TE.A1I(r2)
            r3 = 25
            X.9IE r2 = new X.9IE
            r2.<init>((java.util.List) r4, (int) r3)
            java.util.List r5 = r5.A00(r2)
            if (r5 == 0) goto L_0x015d
        L_0x0127:
            boolean r2 = X.AnonymousClass7TE.A1b(r5)
            if (r2 == 0) goto L_0x01a0
            X.C63144KsC.A00(r10, r5)
            X.0Tu r4 = X.0Tu.A05
            r2 = 36318874815306279(0x8107d300021a27, double:3.031540905345627E-306)
            boolean r2 = X.182.A06(r4, r10, r2)
            if (r2 == 0) goto L_0x0194
            com.instagram.clips.audio.soundsync.repository.data.SoundSyncSuggestedAudioNetworkDataSource r4 = new com.instagram.clips.audio.soundsync.repository.data.SoundSyncSuggestedAudioNetworkDataSource
            r4.<init>(r10)
            r2 = 49
            X.Wvq r3 = new X.Wvq
            r3.<init>(r4, r2)
            java.lang.Class<X.LBu> r2 = X.C63910LBu.class
            java.lang.Object r3 = r10.A01(r2, r3)
            X.LBu r3 = (X.C63910LBu) r3
            r2 = 5
            r0.A03 = r5
            r0.A00 = r9
            java.lang.Object r12 = r3.A00(r6, r0, r2)
            if (r12 != r1) goto L_0x0167
            return r1
        L_0x015d:
            X.0sn r5 = X.0sn.A00
            goto L_0x0127
        L_0x0160:
            java.lang.Object r5 = r0.A03
            java.util.List r5 = (java.util.List) r5
            X.0eS.A00(r12)
        L_0x0167:
            X.3Ii r12 = (X.C239803Ii) r12
            java.lang.Object r4 = r0.A04
            com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource r4 = (com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource) r4
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            boolean r2 = r12 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0186
            X.3Ih r12 = (X.C239793Ih) r12
            java.lang.Object r2 = r12.A00
            java.util.List r2 = (java.util.List) r2
            r0.A03 = r5
            r0.A00 = r8
            java.lang.Object r2 = com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource.A02(r4, r3, r5, r2, r0)
            if (r2 != r1) goto L_0x00de
            return r1
        L_0x0186:
            boolean r2 = r12 instanceof X.C297815sO
            if (r2 != 0) goto L_0x00e2
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x018f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0194:
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            r0.A00 = r11
            java.lang.Object r0 = com.instagram.creation.capture.quickcapture.autocreatedclips.browser.repository.ClipsACRBrowserPagingSource.A02(r12, r2, r5, r6, r0)
            goto L_0x0c53
        L_0x01a0:
            X.LF8 r1 = X.C63143KsB.A00(r10)
            r0 = 0
            r1.A00(r0, r0)
            goto L_0x0f18
        L_0x01aa:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x01b8
            if (r1 == r6) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01b8:
            X.0eS.A00(r12)
            java.lang.Object r1 = r0.A03
            X.07V r9 = X.JTO.A0J(r1)
            java.lang.Object r8 = r0.A01
            X.07U r8 = (X.07U) r8
            r5 = 0
            java.lang.Object r4 = r0.A04
            java.lang.Object r3 = r0.A02
            r1 = 46
            goto L_0x0218
        L_0x01cd:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x01db
            if (r1 == r6) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01db:
            X.0eS.A00(r12)
            java.lang.Object r1 = r0.A03
            X.07V r9 = X.JTO.A0J(r1)
            java.lang.Object r8 = r0.A02
            X.07U r8 = (X.07U) r8
            r5 = 0
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A04
            r1 = 41
            X.MH4 r7 = new X.MH4
            r7.<init>((X.AnonymousClass4D7) r5, (java.lang.Object) r4, (java.lang.Object) r3, (int) r1)
            goto L_0x040e
        L_0x01f6:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x0204
            if (r1 == r6) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0204:
            X.0eS.A00(r12)
            java.lang.Object r1 = r0.A03
            X.07V r9 = X.JTO.A0J(r1)
            java.lang.Object r8 = r0.A02
            X.07U r8 = (X.07U) r8
            r5 = 0
            java.lang.Object r4 = r0.A04
            java.lang.Object r3 = r0.A01
            r1 = 36
        L_0x0218:
            X.MH4 r7 = new X.MH4
            r7.<init>((X.AnonymousClass4D7) r5, (java.lang.Object) r3, (java.lang.Object) r4, (int) r1)
            goto L_0x040e
        L_0x021f:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 1
            if (r1 == 0) goto L_0x0238
            if (r1 != r7) goto L_0x02ce
            X.0eS.A00(r12)
        L_0x022b:
            java.lang.Object r0 = r0.A02
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            X.00N r0 = r0.getOnBackPressedDispatcher()
            r0.A04()
            goto L_0x0b20
        L_0x0238:
            X.0eS.A00(r12)
            java.lang.Object r6 = r0.A01
            X.L3X r6 = (X.L3X) r6
            java.lang.Object r5 = r0.A02
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Object r3 = r0.A04
            X.K4d r3 = (X.C61361K4d) r3
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r1 = X.C60299Jix.A00(r3)
            boolean r1 = r1.A0H
            X.LO2 r4 = new X.LO2
            r4.<init>(r5, r1)
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r1 = X.C60299Jix.A00(r3)
            com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates r3 = r1.A01
            java.lang.Object r1 = r0.A03
            X.LAt r1 = (X.C63890LAt) r1
            X.L7i r8 = new X.L7i
            r8.<init>(r3, r6, r1, r4)
            android.view.Window r4 = r5.getWindow()
            X.0qQ.A07(r4)
            r0.A00 = r7
            X.1IW r11 = X.JTS.A0s(r0)
            X.LAt r5 = r8.A02
            android.view.View r7 = r5.A07
            float r3 = r7.getX()
            com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates r6 = r8.A00
            r10 = 0
            if (r6 == 0) goto L_0x02cc
            int r1 = r6.A00
            float r1 = (float) r1
            float r1 = r1 - r3
            java.lang.Float r9 = X.C51965G9l.A0q(r1)
        L_0x0283:
            float r3 = r7.getY()
            if (r6 == 0) goto L_0x0291
            int r1 = r6.A01
            float r1 = (float) r1
            float r1 = r1 - r3
            java.lang.Float r10 = X.C51965G9l.A0q(r1)
        L_0x0291:
            android.view.View r1 = r4.getDecorView()
            X.04k r1 = X.C586203k.A00(r1)
            if (r1 == 0) goto L_0x02ca
            int r12 = X.OOp.A00(r1)
        L_0x029f:
            android.view.View r1 = r5.A02
            X.JfM r7 = new X.JfM
            r7.<init>(r8, r9, r10, r11, r12)
            X.04a.A01(r1, r7)
            android.view.View r3 = r4.getDecorView()
            X.04n r1 = new X.04n
            r1.<init>(r3, r4)
            r3 = 8
            X.04l r1 = r1.A00
            r1.A01(r3)
            r3 = 10
            X.Iwa r1 = new X.Iwa
            r1.<init>(r8, r3)
            r11.CO0(r1)
            java.lang.Object r1 = r11.A0E()
            if (r1 != r2) goto L_0x022b
            return r2
        L_0x02ca:
            r12 = 0
            goto L_0x029f
        L_0x02cc:
            r9 = r10
            goto L_0x0283
        L_0x02ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02d3:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x02e1
            if (r2 == r8) goto L_0x0309
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x02e1:
            X.0eS.A00(r12)
            java.lang.Object r7 = r0.A04
            X.K4d r7 = (X.C61361K4d) r7
            X.Jix r2 = X.C61361K4d.A00(r7)
            X.0eM r2 = r2.A08
            java.lang.Object r2 = r2.getValue()
            X.LAb r2 = (X.C63872LAb) r2
            X.0Ud r6 = r2.A05
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A01
            r3 = 7
            X.MCf r2 = new X.MCf
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r7, (java.lang.Object) r5)
            r0.A00 = r8
            java.lang.Object r0 = r6.collect(r2, r0)
            if (r0 != r1) goto L_0x030c
            return r1
        L_0x0309:
            X.0eS.A00(r12)
        L_0x030c:
            X.MCr r3 = X.C51965G9l.A0x()
            throw r3
        L_0x0311:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x031f
            if (r2 == r8) goto L_0x033f
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x031f:
            X.0eS.A00(r12)
            java.lang.Object r7 = r0.A04
            X.K4d r7 = (X.C61361K4d) r7
            X.Jix r2 = X.C61361K4d.A00(r7)
            X.0Ud r6 = r2.A0C
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A01
            r3 = 6
            X.MCf r2 = new X.MCf
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r7, (java.lang.Object) r5)
            r0.A00 = r8
            java.lang.Object r0 = r6.collect(r2, r0)
            if (r0 != r1) goto L_0x0342
            return r1
        L_0x033f:
            X.0eS.A00(r12)
        L_0x0342:
            X.MCr r3 = X.C51965G9l.A0x()
            throw r3
        L_0x0347:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x0355
            if (r1 == r9) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0355:
            X.0eS.A00(r12)
            java.lang.Object r6 = r0.A04
            X.7be r6 = (X.C334657be) r6
            X.GgO r1 = r6.A04
            X.0Ud r1 = r1.A0X
            java.lang.Object r4 = r0.A02
            java.lang.Object r7 = r0.A01
            java.lang.Object r5 = r0.A03
            r8 = 0
            X.MGM r3 = new X.MGM
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.A00 = r9
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r3, r1)
            goto L_0x0414
        L_0x0374:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x0382
            if (r1 == r6) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0382:
            X.0eS.A00(r12)
            java.lang.Object r1 = r0.A02
            X.07V r9 = X.JTO.A0J(r1)
            java.lang.Object r8 = r0.A01
            X.07U r8 = (X.07U) r8
            r5 = 0
            java.lang.Object r4 = r0.A04
            java.lang.Object r3 = r0.A03
            r1 = 20
            X.JZr r7 = new X.JZr
            r7.<init>((X.AnonymousClass4D7) r5, (java.lang.Object) r4, (java.lang.Object) r3, (int) r1)
            goto L_0x040e
        L_0x039c:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x03aa
            if (r1 == r6) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03aa:
            X.0eS.A00(r12)
            java.lang.Object r1 = r0.A04
            X.07V r9 = X.JTO.A0J(r1)
            java.lang.Object r8 = r0.A03
            X.07U r8 = (X.07U) r8
            r5 = 0
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            r1 = 22
            X.MH4 r7 = new X.MH4
            r7.<init>((java.lang.Object) r4, (java.lang.Object) r3, (X.AnonymousClass4D7) r5, (int) r1)
            goto L_0x040e
        L_0x03c4:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x03d2
            if (r1 == r6) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03d2:
            X.0eS.A00(r12)
            java.lang.Object r1 = r0.A04
            X.07V r9 = X.JTO.A0J(r1)
            java.lang.Object r8 = r0.A02
            X.07U r8 = (X.07U) r8
            r5 = 0
            java.lang.Object r4 = r0.A03
            java.lang.Object r3 = r0.A01
            r1 = 20
            goto L_0x0409
        L_0x03e7:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x03f5
            if (r1 == r6) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03f5:
            X.0eS.A00(r12)
            java.lang.Object r1 = r0.A04
            X.07V r9 = X.JTO.A0J(r1)
            java.lang.Object r8 = r0.A01
            X.07U r8 = (X.07U) r8
            r5 = 0
            java.lang.Object r4 = r0.A03
            java.lang.Object r3 = r0.A02
            r1 = 19
        L_0x0409:
            X.MH4 r7 = new X.MH4
            r7.<init>((java.lang.Object) r3, (java.lang.Object) r4, (X.AnonymousClass4D7) r5, (int) r1)
        L_0x040e:
            r0.A00 = r6
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r8, r9, r0, r7)
        L_0x0414:
            if (r0 != r2) goto L_0x0f18
            return r2
        L_0x0417:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x0425
            if (r1 == r4) goto L_0x0445
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0425:
            X.0eS.A00(r12)
            java.lang.Object r1 = r0.A03     // Catch:{ all -> 0x044d }
            X.7b7 r1 = (X.C334347b7) r1     // Catch:{ all -> 0x044d }
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r3 = r1.A0B     // Catch:{ all -> 0x044d }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x044d }
            X.0lr r1 = (X.0lr) r1     // Catch:{ all -> 0x044d }
            r3.addTextChangedListener(r1)     // Catch:{ all -> 0x044d }
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x044d }
            X.7bH r1 = (X.C334447bH) r1     // Catch:{ all -> 0x044d }
            r3.addTextChangedListener(r1)     // Catch:{ all -> 0x044d }
            r0.A00 = r4     // Catch:{ all -> 0x044d }
            X.1Hj r1 = X.C241603Pv.A03(r0)     // Catch:{ all -> 0x044d }
            if (r1 != r2) goto L_0x0448
            return r2
        L_0x0445:
            X.0eS.A00(r12)     // Catch:{ all -> 0x044d }
        L_0x0448:
            X.MCr r1 = X.C51965G9l.A0x()     // Catch:{ all -> 0x044d }
            throw r1     // Catch:{ all -> 0x044d }
        L_0x044d:
            r3 = move-exception
            java.lang.Object r1 = r0.A03
            X.7b7 r1 = (X.C334347b7) r1
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = r1.A0B
            java.lang.Object r1 = r0.A02
            X.0lr r1 = (X.0lr) r1
            r2.removeTextChangedListener(r1)
            java.lang.Object r0 = r0.A01
            X.7bH r0 = (X.C334447bH) r0
            r2.removeTextChangedListener(r0)
            throw r3
        L_0x0463:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 0
            r6 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0475
            if (r2 == r4) goto L_0x04c1
            if (r2 == r6) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0475:
            X.0eS.A00(r12)
            java.lang.Object r2 = r0.A03
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r9 = r0.A01
            X.7aY r9 = (X.C334027aY) r9
            java.util.Iterator r10 = r2.iterator()
            r5 = 0
        L_0x0485:
            boolean r2 = r10.hasNext()
            r8 = -1
            if (r2 == 0) goto L_0x04a2
            java.lang.Object r2 = r10.next()
            X.7aD r2 = (X.C333827aD) r2
            java.lang.String r3 = r2.A00
            r2 = r9
            X.7d7 r2 = (X.C335537d7) r2
            java.lang.String r2 = r2.A01
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 != 0) goto L_0x04a3
            int r5 = r5 + 1
            goto L_0x0485
        L_0x04a2:
            r5 = -1
        L_0x04a3:
            java.lang.Integer r5 = X.JTO.A0w(r5)
            int r2 = r5.intValue()
            if (r2 != r8) goto L_0x04ae
            r5 = r7
        L_0x04ae:
            X.7d7 r9 = (X.C335537d7) r9
            boolean r2 = r9.A03
            if (r2 == 0) goto L_0x04c8
            long r2 = r9.A00
            r0.A04 = r5
            r0.A00 = r4
            java.lang.Object r2 = X.C241603Pv.A01(r0, r2)
            if (r2 != r1) goto L_0x04c8
            return r1
        L_0x04c1:
            java.lang.Object r5 = r0.A04
            java.lang.Number r5 = (java.lang.Number) r5
            X.0eS.A00(r12)
        L_0x04c8:
            if (r5 == 0) goto L_0x0f18
            java.lang.Object r4 = r0.A02
            androidx.compose.foundation.lazy.LazyListState r4 = (androidx.compose.foundation.lazy.LazyListState) r4
            int r3 = r5.intValue()
            r0.A04 = r7
            r0.A00 = r6
            X.5Tp r2 = androidx.compose.foundation.lazy.LazyListState.A0O
            r2 = 0
            java.lang.Object r0 = r4.A03(r0, r3, r2)
            goto L_0x0c53
        L_0x04df:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r9 = 3
            r8 = 2
            r5 = 1
            r7 = 0
            if (r2 == 0) goto L_0x04f4
            if (r2 == r5) goto L_0x0562
            if (r2 == r8) goto L_0x0562
            if (r2 == r9) goto L_0x0c04
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x04f4:
            X.0eS.A00(r12)
            java.lang.Object r6 = r0.A03
            X.7dm r6 = (X.C335937dm) r6
            X.7dn r2 = X.C335947dn.A00
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 != 0) goto L_0x0f18
            X.7do r2 = X.C335957do.A00
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x053a
            X.7ap r2 = X.C334197ap.A00
            java.lang.Object r4 = r0.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r4
            java.lang.Object r3 = r0.A01
            X.7al r3 = (X.C334157al) r3
            r2.A02(r3, r7)
            X.7al r2 = X.C334157al.INITIAL_LOADING
            if (r3 != r2) goto L_0x0565
            java.lang.Object r2 = r0.A02
            X.0r1 r2 = (X.0r1) r2
            boolean r2 = r2.A00
            if (r2 == 0) goto L_0x0565
            X.GyO r2 = r4.A03
            if (r2 == 0) goto L_0x052f
            X.34p r2 = r2.A00
            if (r2 == 0) goto L_0x052f
            r2.A01()
        L_0x052f:
            r0.A00 = r5
            X.Ayy r2 = X.C41707Ayy.A00
            java.lang.Object r2 = X.JTQ.A0X(r4, r1, r0, r2)
        L_0x0537:
            if (r2 != r1) goto L_0x0565
            return r1
        L_0x053a:
            boolean r2 = r6 instanceof X.C335927dl
            if (r2 == 0) goto L_0x056d
            X.7ap r2 = X.C334197ap.A00
            java.lang.Object r4 = r0.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r4
            java.lang.Object r3 = r0.A01
            X.7al r3 = (X.C334157al) r3
            r2.A03(r3, r7)
            X.7dl r6 = (X.C335927dl) r6
            X.7al r2 = X.C334157al.INITIAL_LOADING
            if (r3 != r2) goto L_0x0560
            java.lang.Object r2 = r0.A02
            X.0r1 r2 = (X.0r1) r2
            boolean r2 = r2.A00
            if (r2 == 0) goto L_0x0560
        L_0x0559:
            r0.A00 = r8
            java.lang.Object r2 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A04(r4, r6, r0, r5)
            goto L_0x0537
        L_0x0560:
            r5 = 0
            goto L_0x0559
        L_0x0562:
            X.0eS.A00(r12)
        L_0x0565:
            java.lang.Object r0 = r0.A02
            X.0r1 r0 = (X.0r1) r0
            r0.A00 = r7
            goto L_0x0f18
        L_0x056d:
            boolean r2 = r6 instanceof X.C338027hI
            if (r2 == 0) goto L_0x058f
            X.7ap r5 = X.C334197ap.A00
            java.lang.Object r4 = r0.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r4
            com.instagram.common.session.UserSession r3 = r4.A0B
            java.lang.Object r2 = r0.A01
            X.7al r2 = (X.C334157al) r2
            r5.A01(r3, r2, r7)
            r0.A00 = r9
            r3 = 48
            X.9Kw r2 = new X.9Kw
            r2.<init>(r6, r3)
            java.lang.Object r0 = X.JTQ.A0X(r4, r1, r0, r2)
            goto L_0x0c53
        L_0x058f:
            X.Wub r3 = X.AnonymousClass7TE.A1K()
            throw r3
        L_0x0594:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x05a7
            if (r2 != r7) goto L_0x05a2
            java.lang.Object r5 = r0.A03
            X.4Cq r5 = (X.C262224Cq) r5
            goto L_0x05d7
        L_0x05a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05a7:
            X.0eS.A00(r12)
            java.lang.Object r5 = r0.A03
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r3 = r0.A04
            X.72N r3 = (X.AnonymousClass72N) r3
            java.lang.Object r2 = r0.A01
            X.8vc r2 = (X.C369968vc) r2
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r6 = r3.A08     // Catch:{ all -> 0x05dd }
            java.lang.String r4 = r2.A09     // Catch:{ all -> 0x05dd }
            boolean r2 = r2.A0G     // Catch:{ all -> 0x05dd }
            boolean r3 = X.AnonymousClass7TF.A1Q(r2)
            r0.A03 = r5     // Catch:{ all -> 0x05dd }
            r0.A00 = r7     // Catch:{ all -> 0x05dd }
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r2 = r6.A03     // Catch:{ all -> 0x05dd }
            X.2NP r2 = r2.A01     // Catch:{ all -> 0x05dd }
            java.lang.Object r2 = r2.A0J(r4, r0, r3)     // Catch:{ all -> 0x05dd }
            if (r2 == r1) goto L_0x05d0
            X.0gF r2 = X.C60340gF.A00     // Catch:{ all -> 0x05dd }
        L_0x05d0:
            if (r2 == r1) goto L_0x05d4
            X.0gF r2 = X.C60340gF.A00     // Catch:{ all -> 0x05dd }
        L_0x05d4:
            if (r2 != r1) goto L_0x05da
            return r1
        L_0x05d7:
            X.0eS.A00(r12)     // Catch:{ all -> 0x05dd }
        L_0x05da:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x05dd }
            goto L_0x05e2
        L_0x05dd:
            r1 = move-exception
            X.0eQ r1 = X.JTO.A1B(r1)
        L_0x05e2:
            boolean r1 = r1 instanceof X.0eQ
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0f18
            X.12T r1 = X.AnonymousClass12T.A00
            X.4CZ r4 = r1.A04
            r3 = 0
            java.lang.Object r2 = r0.A02
            java.lang.Object r1 = r0.A01
            r0 = 47
            X.MGZ r11 = new X.MGZ
            r11.<init>((java.lang.Object) r1, (java.lang.Object) r2, (X.AnonymousClass4D7) r3, (int) r0)
            goto L_0x0ca5
        L_0x05fa:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r10 = 1
            r6 = 2
            if (r2 == 0) goto L_0x060b
            if (r2 == r10) goto L_0x064e
            if (r2 == r6) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x060b:
            X.0eS.A00(r12)
            java.lang.Object r11 = r0.A03
            X.4Cq r11 = (X.C262224Cq) r11
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r9 = r0.A04
            X.72N r9 = (X.AnonymousClass72N) r9
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r2)     // Catch:{ all -> 0x0654 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x0654 }
        L_0x0622:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x0654 }
            if (r2 == 0) goto L_0x0645
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x0654 }
            X.8vc r5 = (X.C369968vc) r5     // Catch:{ all -> 0x0654 }
            X.12T r3 = X.AnonymousClass12T.A00     // Catch:{ all -> 0x0654 }
            r4 = 0
            r2 = 875656996(0x34317724, float:1.6527753E-7)
            X.0nV r3 = X.JTP.A0U(r3, r2)     // Catch:{ all -> 0x0654 }
            com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1 r2 = new com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1     // Catch:{ all -> 0x0654 }
            r2.<init>(r5, r9, r4)     // Catch:{ all -> 0x0654 }
            X.2Q8 r2 = X.1Eo.A02(r3, r2, r11)     // Catch:{ all -> 0x0654 }
            r8.add(r2)     // Catch:{ all -> 0x0654 }
            goto L_0x0622
        L_0x0645:
            r0.A00 = r10     // Catch:{ all -> 0x0654 }
            java.lang.Object r12 = X.AnonymousClass42T.A00(r8, r0)     // Catch:{ all -> 0x0654 }
            if (r12 != r1) goto L_0x0651
            return r1
        L_0x064e:
            X.0eS.A00(r12)     // Catch:{ all -> 0x0654 }
        L_0x0651:
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0654 }
            goto L_0x0659
        L_0x0654:
            r2 = move-exception
            X.0eQ r12 = X.JTO.A1B(r2)
        L_0x0659:
            java.lang.Object r4 = r0.A02
            X.02o r4 = (X.02o) r4
            java.lang.Object r3 = r0.A01
            boolean r2 = r12 instanceof X.0eQ
            if (r2 == 0) goto L_0x0664
            r12 = r3
        L_0x0664:
            r0.A00 = r6
            java.lang.Object r0 = r4.emit(r12, r0)
            goto L_0x0c53
        L_0x066c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x067a
            if (r2 == r7) goto L_0x06ae
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x067a:
            X.0eS.A00(r12)
            java.lang.Object r3 = r0.A04
            X.E1g r3 = (X.C47412E1g) r3
            X.0eM r2 = r3.A03
            java.lang.Object r2 = r2.getValue()
            X.DkY r2 = (X.C46745DkY) r2
            X.0Ud r2 = r2.A01
            java.lang.String r2 = X.JTO.A11(r2)
            r3.A00 = r2
            X.0eM r2 = r3.A03
            java.lang.Object r2 = r2.getValue()
            X.DkY r2 = (X.C46745DkY) r2
            X.0Ud r6 = r2.A01
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A01
            r3 = 2
            X.FxO r2 = new X.FxO
            r2.<init>(r3, r4, r5)
            r0.A00 = r7
            java.lang.Object r0 = r6.collect(r2, r0)
            if (r0 != r1) goto L_0x06b1
            return r1
        L_0x06ae:
            X.0eS.A00(r12)
        L_0x06b1:
            X.MCr r3 = X.C51965G9l.A0x()
            throw r3
        L_0x06b6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r9 = 1
            if (r2 == 0) goto L_0x06c4
            if (r2 == r9) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06c4:
            X.0eS.A00(r12)
            java.lang.Object r2 = r0.A03
            X.07V r8 = X.JTO.A0J(r2)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r6 = 0
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A04
            r3 = 9
            X.MH4 r2 = new X.MH4
            r2.<init>((X.AnonymousClass4D7) r6, (java.lang.Object) r5, (java.lang.Object) r4, (int) r3)
            r0.A00 = r9
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r7, r8, r0, r2)
            goto L_0x0c53
        L_0x06e5:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x071c
            if (r2 != r3) goto L_0x074b
            X.0eS.A00(r12)
        L_0x06f1:
            X.3Ii r12 = (X.C239803Ii) r12
            boolean r1 = r12 instanceof X.C297815sO
            r3 = 0
            if (r1 == 0) goto L_0x0707
            java.lang.Object r2 = r0.A01
            X.6Rx r2 = (X.C307896Rx) r2
        L_0x06fc:
            java.lang.Object r1 = r0.A02
        L_0x06fe:
            X.4uI r1 = (X.C277014uI) r1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.C308206Td.A0E(r2, r1, r0)
            goto L_0x0f18
        L_0x0707:
            boolean r1 = r12 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0746
            java.lang.Object r2 = r0.A01
            X.6Rx r2 = (X.C307896Rx) r2
            X.3Ih r12 = (X.C239793Ih) r12
            java.lang.Object r1 = r12.A00
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            if (r1 == 0) goto L_0x06fc
            java.lang.Object r1 = r0.A03
            goto L_0x06fe
        L_0x071c:
            X.0eS.A00(r12)
            X.C66631pj.A00()
            java.lang.Object r2 = r0.A04
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r0.A00 = r3
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r6 = X.C63496Ky2.A00(r2)
            com.instagram.common.session.UserSession r5 = r6.A00
            java.lang.String r4 = r5.A06
            X.MM0 r3 = X.MM0.A00
            java.lang.Class<X.Lii> r2 = X.C64822Lii.class
            java.lang.Object r2 = r5.A01(r2, r3)
            X.Lii r2 = (X.C64822Lii) r2
            android.util.LruCache r2 = r2.A00
            r2.remove(r4)
            java.lang.Object r12 = com.instagram.wellbeing.equity.diversity.DiversityInfoRepository.A02(r6, r0)
            if (r12 != r1) goto L_0x06f1
            return r1
        L_0x0746:
            X.Wub r3 = X.AnonymousClass7TE.A1K()
            throw r3
        L_0x074b:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x0750:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x075e
            if (r3 == r2) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x075e:
            X.0eS.A00(r12)
            java.lang.Object r5 = r0.A04
            X.L5s r5 = (X.C63760L5s) r5
            X.4HW r3 = r5.A01
            r9 = 0
            java.lang.Object r6 = r0.A02
            java.lang.Object r7 = r0.A01
            java.lang.Object r8 = r0.A03
            r10 = 0
            X.MEO r4 = new X.MEO
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.A00 = r2
            X.0gF r2 = X.C60340gF.A00
            java.lang.Object r0 = r3.A00(r2, r0, r4)
            goto L_0x0c53
        L_0x077e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x078c
            if (r2 == r5) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x078c:
            X.0eS.A00(r12)
            java.lang.Object r10 = r0.A03
            X.4Cq r10 = (X.C262224Cq) r10
            X.0rm r8 = X.C51965G9l.A11()
            r11 = 0
            java.lang.Object r7 = r0.A01
            java.lang.Object r9 = r0.A04
            r12 = 23
            X.MHG r6 = new X.MHG
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.AnonymousClass7TE.A1Z(r6, r10)
            java.lang.Object r4 = r0.A02
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            r3 = 30
            X.MCn r2 = new X.MCn
            r2.<init>((int) r3, (java.lang.Object) r10, (java.lang.Object) r8)
            r0.A00 = r5
            java.lang.Object r0 = r4.collect(r2, r0)
            goto L_0x0c53
        L_0x07b9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x07c7
            if (r2 == r8) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x07c7:
            X.0eS.A00(r12)
            java.lang.Object r2 = r0.A03
            X.1Ng r2 = (X.1Ng) r2
            X.64X r3 = new X.64X
            r3.<init>(r2)
            java.lang.Class<X.36g> r2 = X.C2370836g.class
            X.032 r3 = r3.A00(r2)
            java.lang.Object r7 = r0.A02
            java.lang.Object r2 = r0.A04
            X.MC8 r6 = new X.MC8
            r6.<init>((int) r8, (java.lang.Object) r7, (java.lang.Object) r2, (java.lang.Object) r3)
            java.lang.Object r5 = r0.A01
            r4 = 0
            r3 = 21
            X.MHC r2 = new X.MHC
            r2.<init>((java.lang.Object) r5, (java.lang.Object) r7, (X.AnonymousClass4D7) r4, (int) r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r6)
            goto L_0x0c53
        L_0x07f4:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0802
            if (r3 == r2) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0802:
            X.0eS.A00(r12)
            java.lang.Object r8 = r0.A04
            X.6FR r8 = (X.AnonymousClass6FR) r8
            java.lang.Object r6 = r0.A03
            java.lang.Object r5 = r0.A01
            java.lang.Object r7 = r0.A02
            r4 = 22
            X.IxG r3 = new X.IxG
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A00 = r2
            X.0sK r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A05(r8, r0, r3, r2)
            goto L_0x0c53
        L_0x0820:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x082e
            if (r3 == r2) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x082e:
            X.0eS.A00(r12)
            java.lang.Object r4 = r0.A04
            java.lang.Object r5 = r0.A02
            java.lang.Object r6 = r0.A01
            java.lang.Object r7 = r0.A03
            r8 = 0
            r9 = 18
            X.JUk r3 = new X.JUk
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r9)
            r0.A00 = r2
            java.lang.Object r0 = X.19E.A00(r0, r3)
            goto L_0x0c53
        L_0x0849:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r10 = 1
            if (r2 == 0) goto L_0x08ad
            if (r2 != r10) goto L_0x08b5
            java.lang.Object r8 = r0.A04
            X.0rm r8 = (X.0rm) r8
            java.lang.Object r9 = r0.A03
            X.Kzh r9 = (X.C63594Kzh) r9
            X.0eS.A00(r12)
        L_0x085d:
            r8.A00 = r12
        L_0x085f:
            java.lang.Object r8 = r0.A02
            X.0rm r8 = (X.0rm) r8
            java.lang.Object r3 = r8.A00
            boolean r2 = r3 instanceof X.C54087GzB
            if (r2 != 0) goto L_0x0f18
            boolean r2 = r3 instanceof X.C61345K3g
            if (r2 == 0) goto L_0x089c
            X.K3g r3 = (X.C61345K3g) r3
            if (r3 == 0) goto L_0x089c
            float r12 = r3.A01
            long r6 = r3.A02
            float r11 = r3.A00
            X.LAC r13 = r9.A00
            long r2 = r13.A00
            long r4 = X.C289295dM.A07(r2, r6)
            r13.A00 = r4
            X.GQN r14 = r13.A03
            long r2 = android.os.SystemClock.uptimeMillis()
            r14.A02(r2, r4)
            X.0sK r5 = r13.A06
            java.lang.Float r4 = java.lang.Float.valueOf(r12)
            X.5dM r3 = new X.5dM
            r3.<init>(r6)
            java.lang.Float r2 = java.lang.Float.valueOf(r11)
            r5.invoke(r4, r3, r2)
        L_0x089c:
            java.lang.Object r2 = r0.A01
            X.3jw r2 = (X.C249533jw) r2
            r0.A03 = r9
            r0.A04 = r8
            r0.A00 = r10
            java.lang.Object r12 = r2.E6v(r0)
            if (r12 != r1) goto L_0x085d
            return r1
        L_0x08ad:
            X.0eS.A00(r12)
            java.lang.Object r9 = r0.A03
            X.Kzh r9 = (X.C63594Kzh) r9
            goto L_0x085f
        L_0x08b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08ba:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r7 = 2
            r2 = 1
            if (r3 == 0) goto L_0x08cb
            if (r3 == r2) goto L_0x08e0
            if (r3 == r7) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08cb:
            X.0eS.A00(r12)
            java.lang.Object r4 = r0.A04
            com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r4 = (com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository) r4
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            r0.A00 = r2
            r2 = 0
            java.lang.Object r12 = com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository.A02(r4, r3, r0, r2)
            if (r12 != r1) goto L_0x08e3
            return r1
        L_0x08e0:
            X.0eS.A00(r12)
        L_0x08e3:
            X.Ju4 r12 = (X.C60946Ju4) r12
            if (r12 == 0) goto L_0x0f18
            java.lang.Object r6 = r0.A04
            com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository r6 = (com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository) r6
            X.LEj r5 = r6.A05
            java.util.Map r3 = r12.A02
            r4 = 0
            X.0qQ.A0B(r3, r4)
            java.util.concurrent.ConcurrentHashMap r2 = r5.A00
            r2.putAll(r3)
            java.util.Map r3 = r12.A03
            X.0qQ.A0B(r3, r4)
            java.util.concurrent.ConcurrentHashMap r2 = r5.A01
            r2.putAll(r3)
            java.lang.Object r3 = r0.A03
            X.0V2 r3 = (X.0V2) r3
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = r6.AjS(r2)
            r0.A00 = r7
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0c53
        L_0x0916:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r9 = 1
            if (r2 == 0) goto L_0x0924
            if (r2 == r9) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0924:
            X.0eS.A00(r12)
            java.lang.Object r2 = r0.A02
            X.07V r8 = X.JTO.A0J(r2)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r6 = 0
            java.lang.Object r5 = r0.A04
            java.lang.Object r4 = r0.A03
            r3 = 26
            X.MHH r2 = new X.MHH
            r2.<init>((X.AnonymousClass4D7) r6, (java.lang.Object) r5, (java.lang.Object) r4, (int) r3)
            r0.A00 = r9
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r7, r8, r0, r2)
            goto L_0x0c53
        L_0x0945:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r9 = 1
            if (r2 == 0) goto L_0x0953
            if (r2 == r9) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0953:
            X.0eS.A00(r12)
            java.lang.Object r2 = r0.A03
            X.07V r8 = X.JTO.A0J(r2)
            java.lang.Object r7 = r0.A02
            X.07U r7 = (X.07U) r7
            r6 = 0
            java.lang.Object r5 = r0.A04
            java.lang.Object r4 = r0.A01
            r3 = 22
            X.MHH r2 = new X.MHH
            r2.<init>((X.AnonymousClass4D7) r6, (java.lang.Object) r5, (java.lang.Object) r4, (int) r3)
            r0.A00 = r9
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r7, r8, r0, r2)
            goto L_0x0c53
        L_0x0974:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0982
            if (r2 == r8) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0982:
            X.0eS.A00(r12)
            java.lang.Object r2 = r0.A04
            X.Dkn r2 = (X.C46760Dkn) r2
            X.3ju r7 = r2.A04
            java.lang.Object r6 = r0.A03
            com.instagram.api.schemas.TrackOrOriginalSoundSchema r6 = (com.instagram.api.schemas.TrackOrOriginalSoundSchema) r6
            java.util.UUID r5 = r2.A00
            java.lang.Object r4 = r0.A02
            X.8ZN r4 = (X.AnonymousClass8ZN) r4
            java.lang.Object r3 = r0.A01
            X.HOu r3 = (X.C54689HOu) r3
            X.K2p r2 = new X.K2p
            r2.<init>(r3, r4, r6, r5)
            r0.A00 = r8
            java.lang.Object r0 = r7.ELH(r2, r0)
            goto L_0x0c53
        L_0x09a6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x09b4
            if (r2 == r8) goto L_0x09d8
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x09b4:
            X.0eS.A00(r12)
            java.lang.Object r7 = r0.A04
            X.K68 r7 = (X.K68) r7
            X.0eM r2 = r7.A0E
            java.lang.Object r2 = r2.getValue()
            X.Jgh r2 = (X.C60162Jgh) r2
            X.0Ud r6 = r2.A04
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A01
            r3 = 4
            X.MCf r2 = new X.MCf
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r7, (java.lang.Object) r5)
            r0.A00 = r8
            java.lang.Object r0 = r6.collect(r2, r0)
            if (r0 != r1) goto L_0x09db
            return r1
        L_0x09d8:
            X.0eS.A00(r12)
        L_0x09db:
            X.MCr r3 = X.C51965G9l.A0x()
            throw r3
        L_0x09e0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            r9 = 2
            if (r2 == 0) goto L_0x09f1
            if (r2 == r4) goto L_0x0a11
            if (r2 == r9) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09f1:
            X.0eS.A00(r12)
            java.lang.Object r8 = r0.A01
            X.4Cq r8 = (X.C262224Cq) r8
            java.lang.Object r7 = r0.A04
            X.Jiw r7 = (X.C60298Jiw) r7
            java.lang.String r6 = r7.A00
            if (r6 == 0) goto L_0x0f18
            r2 = 200(0xc8, double:9.9E-322)
            r0.A01 = r8
            r0.A02 = r7
            r0.A03 = r6
            r0.A00 = r4
            java.lang.Object r2 = X.C241603Pv.A01(r0, r2)
            if (r2 != r1) goto L_0x0a1f
            return r1
        L_0x0a11:
            java.lang.Object r6 = r0.A03
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.A02
            X.Jiw r7 = (X.C60298Jiw) r7
            java.lang.Object r2 = r0.A01
            X.4Cq r8 = X.JTO.A1D(r2, r12)
        L_0x0a1f:
            r5 = 0
            X.0r6 r4 = X.C60298Jiw.A00(r7, r6, r5)
            r3 = 0
            X.MCg r2 = new X.MCg
            r2.<init>((X.C60298Jiw) r7, (java.lang.String) r6, (X.C262224Cq) r8, (int) r3)
            r0.A01 = r5
            r0.A02 = r5
            r0.A03 = r5
            r0.A00 = r9
            java.lang.Object r0 = r4.collect(r2, r0)
            goto L_0x0c53
        L_0x0a38:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0a46
            if (r2 == r4) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a46:
            X.0eS.A00(r12)
            java.lang.Object r5 = r0.A03
            X.MPr r5 = (X.C66385MPr) r5
            boolean r3 = r5 instanceof X.C61143Jxt
            java.lang.Object r2 = r0.A04
            X.Jiz r2 = (X.C60301Jiz) r2
            if (r3 == 0) goto L_0x0a6d
            X.05G r4 = r2.A07
            X.Jxt r5 = (X.C61143Jxt) r5
            X.Gn3 r3 = r5.A00
            java.lang.Object r2 = r0.A02
            X.Jw9 r2 = (X.C61071Jw9) r2
            java.lang.Object r1 = r0.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.Jxs r0 = new X.Jxs
            r0.<init>(r3, r2, r1)
            r4.Epw(r0)
            goto L_0x0f18
        L_0x0a6d:
            r0.A00 = r4
            java.lang.Object r0 = X.C60301Jiz.A01(r2, r0)
            goto L_0x0c53
        L_0x0a75:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0a9d
            if (r2 != r4) goto L_0x0aab
            X.0eS.A00(r12)
        L_0x0a81:
            java.lang.Object r3 = r0.A01
            X.0sL r3 = (X.0sL) r3
            java.lang.Object r1 = r0.A04
            X.Jvj r1 = (X.C61045Jvj) r1
            java.lang.String r2 = r1.A07
            java.lang.Object r1 = r0.A02
            java.lang.Object r1 = X.C51966G9m.A17(r1)
            r3.invoke(r2, r1)
            java.lang.Object r0 = r0.A03
            X.5Oz r0 = (X.C284945Oz) r0
            X.C51967G9n.A16(r0, r4)
            goto L_0x0f18
        L_0x0a9d:
            X.0eS.A00(r12)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.A00 = r4
            java.lang.Object r2 = X.C241603Pv.A01(r0, r2)
            if (r2 != r1) goto L_0x0a81
            return r1
        L_0x0aab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ab0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r9 = 2
            r8 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0afb
            if (r2 == r8) goto L_0x0ad5
            if (r2 != r9) goto L_0x0b18
            java.lang.Object r5 = r0.A04
            X.1IT r5 = (X.AnonymousClass1IT) r5
            java.lang.Object r4 = r0.A03
            X.4Co r4 = (X.C262204Co) r4
            X.0eS.A00(r12)
        L_0x0ac8:
            r0.A03 = r4
            r0.A04 = r5
            r0.A00 = r8
            java.lang.Object r12 = r5.A01(r0)
            if (r12 != r1) goto L_0x0ae0
            return r1
        L_0x0ad5:
            java.lang.Object r5 = r0.A04
            X.1IT r5 = (X.AnonymousClass1IT) r5
            java.lang.Object r4 = r0.A03
            X.4Co r4 = (X.C262204Co) r4
            X.0eS.A00(r12)
        L_0x0ae0:
            boolean r2 = X.AnonymousClass7TE.A1a(r12)
            if (r2 == 0) goto L_0x0b1d
            java.lang.Object r3 = r5.A00()
            java.lang.Object r2 = r0.A01
            X.02o r2 = (X.02o) r2
            r0.A03 = r4
            r0.A04 = r5
            r0.A00 = r9
            java.lang.Object r2 = r2.emit(r3, r0)
            if (r2 != r1) goto L_0x0ac8
            return r1
        L_0x0afb:
            X.0eS.A00(r12)
            java.lang.Object r6 = r0.A03
            X.4Cq r6 = (X.C262224Cq) r6
            X.1HR r5 = X.JTQ.A0o()
            java.lang.Object r4 = r0.A02
            r3 = 36
            X.MH2 r2 = new X.MH2
            r2.<init>((java.lang.Object) r5, (java.lang.Object) r4, (X.AnonymousClass4D7) r7, (int) r3)
            X.1Er r4 = X.C51966G9m.A1L(r2, r6)
            X.1IT r5 = r5.CfF()
            goto L_0x0ac8
        L_0x0b18:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b1d:
            r4.AG7(r7)
        L_0x0b20:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0b23:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r9 = 2
            r2 = 1
            r8 = 0
            if (r3 == 0) goto L_0x0b45
            if (r3 == r2) goto L_0x0b35
            if (r3 == r9) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b35:
            java.lang.Object r7 = r0.A03
            androidx.paging.PageFetcherSnapshot r7 = (androidx.paging.PageFetcherSnapshot) r7
            java.lang.Object r6 = r0.A02
            X.136 r6 = (X.136) r6
            java.lang.Object r3 = r0.A01
            androidx.paging.PageFetcherSnapshotState$Holder r3 = (androidx.paging.PageFetcherSnapshotState$Holder) r3
            X.0eS.A00(r12)
            goto L_0x0b5f
        L_0x0b45:
            X.0eS.A00(r12)
            java.lang.Object r7 = r0.A04
            androidx.paging.PageFetcherSnapshot r7 = (androidx.paging.PageFetcherSnapshot) r7
            androidx.paging.PageFetcherSnapshotState$Holder r3 = r7.A01
            X.136 r6 = r3.A01
            r0.A01 = r3
            r0.A02 = r6
            r0.A03 = r7
            r0.A00 = r2
            java.lang.Object r2 = X.136.A00(r0, r6)
            if (r2 != r1) goto L_0x0b5f
            return r1
        L_0x0b5f:
            X.LGA r5 = r3.A00     // Catch:{ all -> 0x0b86 }
            X.3ju r2 = r5.A08     // Catch:{ all -> 0x0b86 }
            X.05Y r4 = X.0u9.A03(r2)     // Catch:{ all -> 0x0b86 }
            r3 = 12
            X.JUv r2 = new X.JUv     // Catch:{ all -> 0x0b86 }
            r2.<init>(r5, r8, r3)     // Catch:{ all -> 0x0b86 }
            X.0rn r3 = new X.0rn     // Catch:{ all -> 0x0b86 }
            r3.<init>(r2, r4)     // Catch:{ all -> 0x0b86 }
            r6.A05(r8)
            X.Kfy r2 = X.C62448Kfy.APPEND
            r0.A01 = r8
            r0.A02 = r8
            r0.A03 = r8
            r0.A00 = r9
            java.lang.Object r0 = androidx.paging.PageFetcherSnapshot.A03(r2, r7, r0, r3)
            goto L_0x0c53
        L_0x0b86:
            r3 = move-exception
            r6.A05(r8)
            throw r3
        L_0x0b8b:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r9 = 2
            r2 = 1
            r8 = 0
            if (r3 == 0) goto L_0x0bad
            if (r3 == r2) goto L_0x0b9d
            if (r3 == r9) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b9d:
            java.lang.Object r7 = r0.A03
            androidx.paging.PageFetcherSnapshot r7 = (androidx.paging.PageFetcherSnapshot) r7
            java.lang.Object r6 = r0.A02
            X.136 r6 = (X.136) r6
            java.lang.Object r3 = r0.A01
            androidx.paging.PageFetcherSnapshotState$Holder r3 = (androidx.paging.PageFetcherSnapshotState$Holder) r3
            X.0eS.A00(r12)
            goto L_0x0bc7
        L_0x0bad:
            X.0eS.A00(r12)
            java.lang.Object r7 = r0.A04
            androidx.paging.PageFetcherSnapshot r7 = (androidx.paging.PageFetcherSnapshot) r7
            androidx.paging.PageFetcherSnapshotState$Holder r3 = r7.A01
            X.136 r6 = r3.A01
            r0.A01 = r3
            r0.A02 = r6
            r0.A03 = r7
            r0.A00 = r2
            java.lang.Object r2 = X.136.A00(r0, r6)
            if (r2 != r1) goto L_0x0bc7
            return r1
        L_0x0bc7:
            X.LGA r5 = r3.A00     // Catch:{ all -> 0x0bed }
            X.3ju r2 = r5.A09     // Catch:{ all -> 0x0bed }
            X.05Y r4 = X.0u9.A03(r2)     // Catch:{ all -> 0x0bed }
            r3 = 13
            X.JUv r2 = new X.JUv     // Catch:{ all -> 0x0bed }
            r2.<init>(r5, r8, r3)     // Catch:{ all -> 0x0bed }
            X.0rn r3 = new X.0rn     // Catch:{ all -> 0x0bed }
            r3.<init>(r2, r4)     // Catch:{ all -> 0x0bed }
            r6.A05(r8)
            X.Kfy r2 = X.C62448Kfy.PREPEND
            r0.A01 = r8
            r0.A02 = r8
            r0.A03 = r8
            r0.A00 = r9
            java.lang.Object r0 = androidx.paging.PageFetcherSnapshot.A03(r2, r7, r0, r3)
            goto L_0x0c53
        L_0x0bed:
            r3 = move-exception
            r6.A05(r8)
            throw r3
        L_0x0bf2:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            r7 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0c19
            if (r2 == r8) goto L_0x0c09
            if (r2 == r7) goto L_0x0c04
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c04:
            X.0eS.A00(r12)
            goto L_0x0f18
        L_0x0c09:
            java.lang.Object r4 = r0.A03
            X.02o r4 = (X.02o) r4
            java.lang.Object r5 = r0.A02
            X.136 r5 = (X.136) r5
            java.lang.Object r3 = r0.A01
            androidx.paging.PageFetcherSnapshotState$Holder r3 = (androidx.paging.PageFetcherSnapshotState$Holder) r3
            X.0eS.A00(r12)
            goto L_0x0c37
        L_0x0c19:
            X.0eS.A00(r12)
            java.lang.Object r4 = r0.A01
            X.02o r4 = (X.02o) r4
            java.lang.Object r2 = r0.A04
            androidx.paging.PageFetcherSnapshot r2 = (androidx.paging.PageFetcherSnapshot) r2
            androidx.paging.PageFetcherSnapshotState$Holder r3 = r2.A01
            X.136 r5 = r3.A01
            r0.A01 = r3
            r0.A02 = r5
            r0.A03 = r4
            r0.A00 = r8
            java.lang.Object r2 = X.136.A00(r0, r5)
            if (r2 != r1) goto L_0x0c37
            return r1
        L_0x0c37:
            X.LGA r2 = r3.A00     // Catch:{ all -> 0x0c56 }
            X.LGK r2 = r2.A03     // Catch:{ all -> 0x0c56 }
            X.LP3 r3 = r2.A01()     // Catch:{ all -> 0x0c56 }
            r5.A05(r6)
            X.Jje r2 = new X.Jje
            r2.<init>(r3, r6)
            r0.A01 = r6
            r0.A02 = r6
            r0.A03 = r6
            r0.A00 = r7
            java.lang.Object r0 = r4.emit(r2, r0)
        L_0x0c53:
            if (r0 != r1) goto L_0x0f18
            return r1
        L_0x0c56:
            r3 = move-exception
            r5.A05(r6)
            throw r3
        L_0x0c5b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0c7d
            if (r2 != r4) goto L_0x0caa
            java.lang.Object r1 = r0.A03
            X.4Cq r5 = X.JTO.A1D(r1, r12)
        L_0x0c6a:
            java.lang.Object r14 = r0.A04
            X.LS9 r14 = (X.LS9) r14
            androidx.paging.PagingSource r1 = r14.A02
            X.LFy r1 = r1.A00
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x0c99
            java.util.concurrent.atomic.AtomicBoolean r0 = r14.A03
            r0.set(r4)
            goto L_0x0f18
        L_0x0c7d:
            X.0eS.A00(r12)
            java.lang.Object r5 = r0.A03
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r2 = r0.A04
            X.LS9 r2 = (X.LS9) r2
            androidx.paging.PagingSource r3 = r2.A02
            java.lang.Object r2 = r0.A01
            X.LCU r2 = (X.LCU) r2
            r0.A03 = r5
            r0.A00 = r4
            java.lang.Object r12 = r3.A04(r2, r0)
            if (r12 != r1) goto L_0x0c6a
            return r1
        L_0x0c99:
            X.4CZ r4 = r14.A05
            r15 = 0
            java.lang.Object r13 = r0.A02
            r16 = 3
            X.JZr r11 = new X.JZr
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0ca5:
            X.1Eo.A05(r4, r11, r5)
            goto L_0x0f18
        L_0x0caa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0caf:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r9 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0cc5
            if (r2 != r8) goto L_0x0ce8
            java.lang.Object r7 = r0.A04
            X.3jv r7 = (X.C249523jv) r7
            X.0eS.A00(r12)
        L_0x0cc0:
            r7.AI3(r9)
            goto L_0x0f18
        L_0x0cc5:
            X.0eS.A00(r12)
            java.lang.Object r7 = r0.A04
            X.3jv r7 = (X.C249523jv) r7
            java.lang.Object r6 = r0.A01
            X.07V r6 = (X.AnonymousClass07V) r6
            java.lang.Object r5 = r0.A02
            X.07U r5 = (X.07U) r5
            java.lang.Object r4 = r0.A03
            r3 = 25
            X.MH2 r2 = new X.MH2
            r2.<init>((java.lang.Object) r4, (java.lang.Object) r7, (X.AnonymousClass4D7) r9, (int) r3)
            r0.A04 = r7
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r5, r6, r0, r2)
            if (r0 != r1) goto L_0x0cc0
            return r1
        L_0x0ce8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ced:
            r2 = r12
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r4 = 0
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0d0e
            if (r3 == r7) goto L_0x0d06
            if (r3 != r6) goto L_0x0d01
            java.lang.Object r5 = r0.A04
            X.0eS.A00(r12)     // Catch:{ all -> 0x0d65 }
            goto L_0x0d5b
        L_0x0d01:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x0d06:
            java.lang.Object r5 = r0.A04
            X.5eu r5 = (X.C290195eu) r5
            X.0eS.A00(r12)
            goto L_0x0d4a
        L_0x0d0e:
            X.0eS.A00(r12)
            java.lang.Object r5 = r0.A04
            X.4Cq r5 = (X.C262224Cq) r5
            X.4Cc r2 = r5.ArX()
            X.4Co r3 = X.AnonymousClass5H8.A00(r2)
            java.lang.Object r2 = r0.A03
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r2 = r2.invoke(r5)
            X.5eu r5 = new X.5eu
            r5.<init>(r2, r3)
            java.lang.Object r2 = r0.A01
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            java.lang.Object r2 = r2.getAndSet(r5)
            X.5eu r2 = (X.C290195eu) r2
            if (r2 == 0) goto L_0x0d4a
            X.4Co r2 = r2.A01
            r0.A04 = r5
            r0.A00 = r7
            r2.AG7(r4)
            java.lang.Object r2 = r2.CfH(r0)
            if (r2 == r1) goto L_0x0d47
            X.0gF r2 = X.C60340gF.A00
        L_0x0d47:
            if (r2 != r1) goto L_0x0d4a
            return r1
        L_0x0d4a:
            java.lang.Object r3 = r0.A02     // Catch:{ all -> 0x0d63 }
            X.0sL r3 = (X.0sL) r3     // Catch:{ all -> 0x0d63 }
            java.lang.Object r2 = r5.A00     // Catch:{ all -> 0x0d63 }
            r0.A04 = r5     // Catch:{ all -> 0x0d63 }
            r0.A00 = r6     // Catch:{ all -> 0x0d63 }
            java.lang.Object r2 = r3.invoke(r2, r0)     // Catch:{ all -> 0x0d63 }
            if (r2 != r1) goto L_0x0d5b
            return r1
        L_0x0d5b:
            java.lang.Object r0 = r0.A01
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            X.1FH.A00(r5, r4, r0)
            return r2
        L_0x0d63:
            r3 = move-exception
            goto L_0x0d66
        L_0x0d65:
            r3 = move-exception
        L_0x0d66:
            java.lang.Object r0 = r0.A01
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            X.1FH.A00(r5, r4, r0)
            throw r3
        L_0x0d6e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r9 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0d7e
            if (r2 != r4) goto L_0x0d79
            goto L_0x0dae
        L_0x0d79:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d7e:
            X.0eS.A00(r12)
            java.lang.Object r2 = r0.A03
            X.4Cq r2 = (X.C262224Cq) r2
            X.4Cc r2 = r2.ArX()
            X.4Co r11 = X.AnonymousClass5H8.A00(r2)
            java.lang.Object r10 = r0.A04     // Catch:{ CancellationException -> 0x0de7 }
            X.6IZ r10 = (X.AnonymousClass6IZ) r10     // Catch:{ CancellationException -> 0x0de7 }
            r10.A04 = r4     // Catch:{ CancellationException -> 0x0de7 }
            androidx.compose.foundation.gestures.ScrollingLogic r3 = r10.A09     // Catch:{ CancellationException -> 0x0de7 }
            X.HKs r2 = X.C54609HKs.A01     // Catch:{ CancellationException -> 0x0de7 }
            java.lang.Object r13 = r0.A01     // Catch:{ CancellationException -> 0x0de7 }
            androidx.compose.foundation.gestures.UpdatableAnimationState r13 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r13     // Catch:{ CancellationException -> 0x0de7 }
            java.lang.Object r12 = r0.A02     // Catch:{ CancellationException -> 0x0de7 }
            X.JS2 r12 = (X.JS2) r12     // Catch:{ CancellationException -> 0x0de7 }
            r14 = 0
            X.JUk r8 = new X.JUk     // Catch:{ CancellationException -> 0x0de7 }
            r8.<init>((X.AnonymousClass4D7) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (int) r14)     // Catch:{ CancellationException -> 0x0de7 }
            r0.A00 = r4     // Catch:{ CancellationException -> 0x0de7 }
            java.lang.Object r2 = r3.A03(r2, r0, r8)     // Catch:{ CancellationException -> 0x0de7 }
            if (r2 != r1) goto L_0x0db1
            return r1
        L_0x0dae:
            X.0eS.A00(r12)     // Catch:{ CancellationException -> 0x0de7 }
        L_0x0db1:
            java.lang.Object r8 = r0.A04     // Catch:{ CancellationException -> 0x0de7 }
            X.6IZ r8 = (X.AnonymousClass6IZ) r8     // Catch:{ CancellationException -> 0x0de7 }
            X.6Ib r7 = r8.A08     // Catch:{ CancellationException -> 0x0de7 }
            X.5Pl r6 = r7.A00     // Catch:{ CancellationException -> 0x0de7 }
            int r1 = r6.A00     // Catch:{ CancellationException -> 0x0de7 }
            int r2 = r1 + -1
            r5 = 0
            X.2HY r1 = new X.2HY     // Catch:{ CancellationException -> 0x0de7 }
            r1.<init>(r5, r2)     // Catch:{ CancellationException -> 0x0de7 }
            int r4 = r1.A00     // Catch:{ CancellationException -> 0x0de7 }
            int r3 = r1.A01     // Catch:{ CancellationException -> 0x0de7 }
            if (r4 > r3) goto L_0x0ddb
        L_0x0dc9:
            java.lang.Object[] r1 = r6.A02     // Catch:{ CancellationException -> 0x0de7 }
            r1 = r1[r4]     // Catch:{ CancellationException -> 0x0de7 }
            X.6Ic r1 = (X.AnonymousClass6Ic) r1     // Catch:{ CancellationException -> 0x0de7 }
            X.1IX r2 = r1.A01     // Catch:{ CancellationException -> 0x0de7 }
            X.0gF r1 = X.C60340gF.A00     // Catch:{ CancellationException -> 0x0de7 }
            r2.resumeWith(r1)     // Catch:{ CancellationException -> 0x0de7 }
            if (r4 == r3) goto L_0x0ddb
            int r4 = r4 + 1
            goto L_0x0dc9
        L_0x0ddb:
            r6.A01()     // Catch:{ CancellationException -> 0x0de7 }
            r8.A04 = r5
            r7.A00(r9)
            r8.A06 = r5
            goto L_0x0f18
        L_0x0de7:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0de9 }
        L_0x0de9:
            r3 = move-exception
            java.lang.Object r2 = r0.A04
            X.6IZ r2 = (X.AnonymousClass6IZ) r2
            r1 = 0
            r2.A04 = r1
            X.6Ib r0 = r2.A08
            r0.A00(r9)
            r2.A06 = r1
            throw r3
        L_0x0df9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0e3e
            if (r2 != r6) goto L_0x0e46
            java.lang.Object r4 = r0.A03
            X.0rm r4 = (X.0rm) r4
            java.lang.Object r5 = r0.A02
            X.0sP r5 = (X.0sP) r5
            X.0eS.A00(r12)
        L_0x0e0e:
            r4.A00 = r12
        L_0x0e10:
            java.lang.Object r4 = r0.A01
            X.0rm r4 = (X.0rm) r4
            java.lang.Object r3 = r4.A00
            boolean r2 = r3 instanceof X.GQQ
            if (r2 != 0) goto L_0x0f18
            boolean r2 = r3 instanceof X.C52468GTu
            if (r2 != 0) goto L_0x0f18
            boolean r2 = r3 instanceof X.GQP
            if (r2 == 0) goto L_0x0e27
            if (r3 == 0) goto L_0x0e27
            r5.invoke(r3)
        L_0x0e27:
            java.lang.Object r2 = r0.A04
            androidx.compose.foundation.gestures.DragGestureNode r2 = (androidx.compose.foundation.gestures.DragGestureNode) r2
            X.3ju r2 = r2.A02
            if (r2 == 0) goto L_0x0e3c
            r0.A02 = r5
            r0.A03 = r4
            r0.A00 = r6
            java.lang.Object r12 = r2.E6v(r0)
            if (r12 != r1) goto L_0x0e0e
            return r1
        L_0x0e3c:
            r12 = r7
            goto L_0x0e0e
        L_0x0e3e:
            X.0eS.A00(r12)
            java.lang.Object r5 = r0.A02
            X.0sP r5 = (X.0sP) r5
            goto L_0x0e10
        L_0x0e46:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e4b:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r0.A00
            r1 = 1
            if (r3 == 0) goto L_0x0e59
            if (r3 == r1) goto L_0x0e74
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x0e59:
            X.0eS.A00(r12)
            java.lang.Object r6 = r0.A03
            java.lang.Object r8 = r0.A01
            java.lang.Object r5 = r0.A04
            java.lang.Object r7 = r0.A02
            r4 = 0
            r9 = 5
            X.JUk r3 = new X.JUk
            r3.<init>((X.AnonymousClass4D7) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (int) r9)
            r0.A00 = r1
            java.lang.Object r0 = X.19E.A00(r0, r3)
            if (r0 != r2) goto L_0x0e77
            return r2
        L_0x0e74:
            X.0eS.A00(r12)
        L_0x0e77:
            X.MCr r3 = X.C51965G9l.A0x()
            throw r3
        L_0x0e7c:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0edd
            if (r1 == r5) goto L_0x0eb1
            if (r1 != r6) goto L_0x0eec
            java.lang.Object r10 = r0.A03
            X.0rh r10 = (X.0rh) r10
            java.lang.Object r13 = r0.A02
            X.0eS.A00(r12)
        L_0x0e91:
            java.lang.Object r12 = r0.A01
            java.lang.Object r11 = r0.A04
            r9 = 0
            X.IxG r8 = new X.IxG
            r8.<init>(r9, r10, r11, r12, r13)
            r0.A02 = r13
            r0.A03 = r10
            r0.A00 = r5
            X.4Cc r3 = r0.getContext()
            X.JZq r1 = X.C59818JZp.A00
            r3.get(r1)
            java.lang.Object r1 = X.C3026564t.A01(r0, r8)
            if (r1 != r2) goto L_0x0eba
            return r2
        L_0x0eb1:
            java.lang.Object r10 = r0.A03
            X.0rh r10 = (X.0rh) r10
            java.lang.Object r13 = r0.A02
            X.0eS.A00(r12)
        L_0x0eba:
            float r3 = r10.A00
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0e91
            X.Ivr r1 = new X.Ivr
            r1.<init>(r13, r5)
            X.05E r4 = X.C3025664b.A02(r1)
            r3 = 0
            androidx.compose.animation.core.InfiniteTransition$run$1$1$3 r1 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$3
            r1.<init>(r3)
            r0.A02 = r13
            r0.A03 = r10
            r0.A00 = r6
            java.lang.Object r1 = X.AnonymousClass10c.A00(r0, r1, r4)
            if (r1 != r2) goto L_0x0e91
            return r2
        L_0x0edd:
            X.0eS.A00(r12)
            java.lang.Object r13 = r0.A02
            X.0rh r10 = new X.0rh
            r10.<init>()
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.A00 = r1
            goto L_0x0e91
        L_0x0eec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ef1:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0f1b
            if (r2 != r6) goto L_0x0f45
            X.0eS.A00(r12)
        L_0x0efd:
            java.lang.Object r2 = r0.A03
            X.4gU r2 = (X.C270284gU) r2
            X.5b7 r1 = X.I69.A01
            java.lang.Object r1 = r2.getValue()
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x0f18
            java.lang.Object r0 = r0.A02
            X.5b4 r0 = (X.AnonymousClass5b4) r0
            X.5b5 r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            r1.invoke(r0)
        L_0x0f18:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0f1b:
            X.0eS.A00(r12)
            java.lang.Object r5 = r0.A04
            java.lang.Object r4 = r0.A02
            X.5b4 r4 = (X.AnonymousClass5b4) r4
            X.5Oz r2 = r4.A09
            java.lang.Object r2 = r2.getValue()
            boolean r2 = X.0qQ.A0K(r5, r2)
            if (r2 != 0) goto L_0x0f18
            java.lang.Object r3 = r0.A01
            X.4gU r3 = (X.C270284gU) r3
            X.5b7 r2 = X.I69.A01
            java.lang.Object r2 = r3.getValue()
            X.5b9 r2 = (X.AnonymousClass5b9) r2
            r0.A00 = r6
            java.lang.Object r2 = X.JTQ.A0V(r4, r2, r5, r0)
            if (r2 != r1) goto L_0x0efd
            return r1
        L_0x0f45:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0f4a:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x0f4f:
            return r1
        L_0x0f50:
            r3 = move-exception
            java.lang.Object r1 = r0.A04
            X.4HW r1 = (X.AnonymousClass4HW) r1
            java.util.concurrent.ConcurrentHashMap r2 = r1.A00
            java.lang.Object r1 = r0.A02
            java.lang.Object r0 = r2.get(r1)
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0f74
            r2.remove(r1)
            throw r3
        L_0x0f67:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0f75
            if (r2 == r8) goto L_0x0f96
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
        L_0x0f74:
            throw r3
        L_0x0f75:
            X.0eS.A00(r12)
            java.lang.Object r7 = r0.A04
            X.K4d r7 = (X.C61361K4d) r7
            X.Jix r2 = X.C61361K4d.A00(r7)
            X.0Ud r6 = r2.A0C
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A02
            r3 = 8
            X.MCf r2 = new X.MCf
            r2.<init>((int) r3, (java.lang.Object) r5, (java.lang.Object) r7, (java.lang.Object) r4)
            r0.A00 = r8
            java.lang.Object r0 = r6.collect(r2, r0)
            if (r0 != r1) goto L_0x0f99
            return r1
        L_0x0f96:
            X.0eS.A00(r12)
        L_0x0f99:
            X.MCr r3 = X.C51965G9l.A0x()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MHG) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHG(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A05 = i;
        this.A04 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHG(AnonymousClass4D7 r2, Object obj, Object obj2, Object obj3, int i) {
        super(2, r2);
        this.A05 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHG(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A05 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A01 = obj4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHG(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A05 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHG(Object obj, Object obj2, AnonymousClass4D7 r4, int i, int i2) {
        super(2, r4);
        this.A05 = i;
        this.A01 = obj;
        this.A04 = obj2;
    }
}
