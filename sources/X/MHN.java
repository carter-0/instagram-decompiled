package X;

import android.graphics.Bitmap;

public final class MHN extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHN(Bitmap bitmap, AnonymousClass4D7 r3, 0sL r4, int i) {
        super(2, r3);
        this.A03 = 3;
        this.A02 = r4;
        this.A00 = i;
        this.A01 = bitmap;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MHN, X.4D7] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A01(java.lang.Object r2, X.MHN r3, X.AnonymousClass0r6 r4, int r5) {
        /*
            r1 = 1
            X.MCe r0 = new X.MCe
            r0.<init>(r2, r5)
            r3.A00 = r1
            java.lang.Object r0 = r4.collect(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHN.A01(java.lang.Object, X.MHN, X.0r6, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MHN, X.4D7] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A02(java.lang.Object r2, X.MHN r3, X.C61770pa r4, int r5) {
        /*
            r1 = 1
            X.MCe r0 = new X.MCe
            r0.<init>(r2, r5)
            r3.A00 = r1
            java.lang.Object r0 = r4.collect(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHN.A02(java.lang.Object, X.MHN, X.0pa, int):java.lang.Object");
    }

    public static void A03(Object obj, Object obj2, C262224Cq r4, int i) {
        1Eo.A05(19B.A00, new MHN(obj, obj2, (AnonymousClass4D7) null, i), r4);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MHN, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MHN, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MHN, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.MHN, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.MHN, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.MHN, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r3 = new X.MHN(r1, r6, r0);
        r3.A01 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0149, code lost:
        return new X.MHN(r2, r1, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0155, code lost:
        return new X.MHN(r1, r2, r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r5, X.AnonymousClass4D7 r6) {
        /*
            r4 = this;
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0011;
                case 2: goto L_0x0015;
                case 3: goto L_0x0089;
                case 4: goto L_0x0099;
                case 5: goto L_0x00a0;
                case 6: goto L_0x00a7;
                case 7: goto L_0x00ae;
                case 8: goto L_0x00b5;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00c5;
                case 11: goto L_0x00cd;
                case 12: goto L_0x00d4;
                case 13: goto L_0x0019;
                case 14: goto L_0x00db;
                case 15: goto L_0x001e;
                case 16: goto L_0x0023;
                case 17: goto L_0x0028;
                case 18: goto L_0x002d;
                case 19: goto L_0x00e5;
                case 20: goto L_0x00ec;
                case 21: goto L_0x0032;
                case 22: goto L_0x00f3;
                case 23: goto L_0x00ff;
                case 24: goto L_0x0106;
                case 25: goto L_0x010d;
                case 26: goto L_0x0114;
                case 27: goto L_0x011b;
                case 28: goto L_0x0122;
                case 29: goto L_0x0129;
                case 30: goto L_0x0037;
                case 31: goto L_0x0130;
                case 32: goto L_0x003c;
                case 33: goto L_0x0041;
                case 34: goto L_0x0137;
                case 35: goto L_0x0046;
                case 36: goto L_0x004b;
                case 37: goto L_0x0050;
                case 38: goto L_0x0055;
                case 39: goto L_0x013e;
                case 40: goto L_0x014a;
                case 41: goto L_0x005a;
                case 42: goto L_0x005f;
                case 43: goto L_0x0064;
                case 44: goto L_0x0069;
                case 45: goto L_0x006e;
                case 46: goto L_0x0073;
                case 47: goto L_0x0078;
                case 48: goto L_0x007d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A02
            r0 = 49
        L_0x0009:
            X.MHN r3 = new X.MHN
            r3.<init>(r1, r6, r0)
            r3.A01 = r5
            return r3
        L_0x0011:
            java.lang.Object r1 = r4.A02
            r0 = 1
            goto L_0x0009
        L_0x0015:
            java.lang.Object r1 = r4.A02
            r0 = 2
            goto L_0x0009
        L_0x0019:
            java.lang.Object r1 = r4.A02
            r0 = 13
            goto L_0x0009
        L_0x001e:
            java.lang.Object r1 = r4.A02
            r0 = 15
            goto L_0x0009
        L_0x0023:
            java.lang.Object r1 = r4.A02
            r0 = 16
            goto L_0x0009
        L_0x0028:
            java.lang.Object r1 = r4.A02
            r0 = 17
            goto L_0x0009
        L_0x002d:
            java.lang.Object r1 = r4.A02
            r0 = 18
            goto L_0x0009
        L_0x0032:
            java.lang.Object r1 = r4.A02
            r0 = 21
            goto L_0x0009
        L_0x0037:
            java.lang.Object r1 = r4.A02
            r0 = 30
            goto L_0x0009
        L_0x003c:
            java.lang.Object r1 = r4.A02
            r0 = 32
            goto L_0x0009
        L_0x0041:
            java.lang.Object r1 = r4.A02
            r0 = 33
            goto L_0x0009
        L_0x0046:
            java.lang.Object r1 = r4.A02
            r0 = 35
            goto L_0x0009
        L_0x004b:
            java.lang.Object r1 = r4.A02
            r0 = 36
            goto L_0x0009
        L_0x0050:
            java.lang.Object r1 = r4.A02
            r0 = 37
            goto L_0x0009
        L_0x0055:
            java.lang.Object r1 = r4.A02
            r0 = 38
            goto L_0x0009
        L_0x005a:
            java.lang.Object r1 = r4.A02
            r0 = 41
            goto L_0x0009
        L_0x005f:
            java.lang.Object r1 = r4.A02
            r0 = 42
            goto L_0x0009
        L_0x0064:
            java.lang.Object r1 = r4.A02
            r0 = 43
            goto L_0x0009
        L_0x0069:
            java.lang.Object r1 = r4.A02
            r0 = 44
            goto L_0x0009
        L_0x006e:
            java.lang.Object r1 = r4.A02
            r0 = 45
            goto L_0x0009
        L_0x0073:
            java.lang.Object r1 = r4.A02
            r0 = 46
            goto L_0x0009
        L_0x0078:
            java.lang.Object r1 = r4.A02
            r0 = 47
            goto L_0x0009
        L_0x007d:
            java.lang.Object r1 = r4.A02
            r0 = 48
            goto L_0x0009
        L_0x0082:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 0
            goto L_0x0150
        L_0x0089:
            java.lang.Object r2 = r4.A02
            X.0sL r2 = (X.0sL) r2
            int r1 = r4.A00
            java.lang.Object r0 = r4.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            X.MHN r3 = new X.MHN
            r3.<init>((android.graphics.Bitmap) r0, (X.AnonymousClass4D7) r6, (X.0sL) r2, (int) r1)
            return r3
        L_0x0099:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 4
            goto L_0x0150
        L_0x00a0:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 5
            goto L_0x0150
        L_0x00a7:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 6
            goto L_0x0150
        L_0x00ae:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 7
            goto L_0x0150
        L_0x00b5:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 8
            goto L_0x0150
        L_0x00bd:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 9
            goto L_0x0150
        L_0x00c5:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 10
            goto L_0x0150
        L_0x00cd:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 11
            goto L_0x0150
        L_0x00d4:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 12
            goto L_0x0150
        L_0x00db:
            java.lang.Object r1 = r4.A02
            r0 = 14
            X.MHN r3 = new X.MHN
            r3.<init>(r1, r6, r0)
            return r3
        L_0x00e5:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 19
            goto L_0x0150
        L_0x00ec:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 20
            goto L_0x0150
        L_0x00f3:
            java.lang.Object r0 = r4.A01
            X.5Oz r0 = (X.C284945Oz) r0
            X.MHN r3 = new X.MHN
            r3.<init>(r0, r6)
            r3.A02 = r5
            return r3
        L_0x00ff:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 23
            goto L_0x0144
        L_0x0106:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 24
            goto L_0x0150
        L_0x010d:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 25
            goto L_0x0144
        L_0x0114:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 26
            goto L_0x0150
        L_0x011b:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 27
            goto L_0x0150
        L_0x0122:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 28
            goto L_0x0144
        L_0x0129:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 29
            goto L_0x0150
        L_0x0130:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 31
            goto L_0x0150
        L_0x0137:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 34
            goto L_0x0150
        L_0x013e:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 39
        L_0x0144:
            X.MHN r3 = new X.MHN
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r1, (X.AnonymousClass4D7) r6, (int) r0)
            return r3
        L_0x014a:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 40
        L_0x0150:
            X.MHN r3 = new X.MHN
            r3.<init>((java.lang.Object) r1, (java.lang.Object) r2, (X.AnonymousClass4D7) r6, (int) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHN.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MHN, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v48, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v16, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0d39, code lost:
        X.0eS.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0d4d, code lost:
        if (r0 != r1) goto L_0x0d61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0d4f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x089f  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x092f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:616:0x0984 A[LOOP:4: B:418:0x0984->B:616:0x0984, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:617:0x09ab A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r3 = r20
            int r1 = r0.A03
            switch(r1) {
                case 0: goto L_0x0d2b;
                case 1: goto L_0x0cf3;
                case 2: goto L_0x0cc9;
                case 3: goto L_0x0d50;
                case 4: goto L_0x0c92;
                case 5: goto L_0x0c72;
                case 6: goto L_0x0c4b;
                case 7: goto L_0x0c2b;
                case 8: goto L_0x0c0b;
                case 9: goto L_0x0009;
                case 10: goto L_0x0bdd;
                case 11: goto L_0x0bbd;
                case 12: goto L_0x0009;
                case 13: goto L_0x0b94;
                case 14: goto L_0x0b68;
                case 15: goto L_0x0b2f;
                case 16: goto L_0x0b02;
                case 17: goto L_0x0ade;
                case 18: goto L_0x0aad;
                case 19: goto L_0x0a42;
                case 20: goto L_0x0a22;
                case 21: goto L_0x09f3;
                case 22: goto L_0x09ce;
                case 23: goto L_0x08d9;
                case 24: goto L_0x0842;
                case 25: goto L_0x06de;
                case 26: goto L_0x06af;
                case 27: goto L_0x0680;
                case 28: goto L_0x05ce;
                case 29: goto L_0x0061;
                case 30: goto L_0x05a1;
                case 31: goto L_0x03ce;
                case 32: goto L_0x03a0;
                case 33: goto L_0x036a;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02ac;
                case 37: goto L_0x0288;
                case 38: goto L_0x023d;
                case 39: goto L_0x0215;
                case 40: goto L_0x01e0;
                case 41: goto L_0x01bc;
                case 42: goto L_0x018f;
                case 43: goto L_0x016b;
                case 44: goto L_0x013e;
                case 45: goto L_0x0111;
                case 46: goto L_0x00ec;
                case 47: goto L_0x00be;
                case 48: goto L_0x0099;
                case 49: goto L_0x0033;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0017
            if (r2 == r4) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            java.lang.Object r2 = A00(r3, r0)
            X.Jfo r2 = (X.C60108Jfo) r2
            X.0V2 r3 = r2.A0U
            java.lang.Object r2 = r0.A01
            X.51M r2 = (X.AnonymousClass51M) r2
            int r2 = X.JTP.A08(r2)
            java.lang.Integer r2 = X.JTO.A0w(r2)
            r0.A00 = r4
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0d4d
        L_0x0033:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r5) goto L_0x0059
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0041:
            java.lang.Object r4 = A00(r3, r0)
            X.Lou r4 = (X.C65191Lou) r4
            X.KOY r2 = r4.A05
            X.0Ud r3 = r2.A03
            r2 = 5
            X.MCi r2 = X.MCi.A00(r4, r2)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r2, r0)
            if (r0 != r1) goto L_0x005c
            return r1
        L_0x0059:
            X.0eS.A00(r3)
        L_0x005c:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0061:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x007c
            if (r2 != r5) goto L_0x0094
            X.0eS.A00(r3)
        L_0x006d:
            java.lang.Object r2 = r0.A02
            X.GhH r2 = (X.C53026GhH) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 44
            X.C51971G9r.A1Q(r2, r1, r0)
            goto L_0x0d61
        L_0x007c:
            X.0eS.A00(r3)
            com.instagram.creation.genai.memu.util.MEmuUtil r4 = com.instagram.creation.genai.memu.util.MEmuUtil.A00
            java.lang.Object r2 = r0.A02
            X.GhH r2 = (X.C53026GhH) r2
            com.instagram.common.session.UserSession r3 = r2.A02
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            r0.A00 = r5
            java.lang.Object r2 = r4.A00(r3, r2, r0)
            if (r2 != r1) goto L_0x006d
            return r1
        L_0x0094:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0099:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x00a7
            if (r2 == r5) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a7:
            java.lang.Object r4 = A00(r3, r0)
            X.Lp7 r4 = (X.C65202Lp7) r4
            X.KOQ r2 = r4.A04
            X.0r6 r3 = r2.A03
            r2 = 4
            X.MCi r2 = X.MCi.A00(r4, r2)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r2, r0)
            goto L_0x0d4d
        L_0x00be:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x00cc
            if (r2 == r5) goto L_0x00e4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00cc:
            java.lang.Object r4 = A00(r3, r0)
            X.Lot r4 = (X.C65190Lot) r4
            X.KOC r2 = r4.A04
            X.0Ud r3 = r2.A02
            r2 = 3
            X.MCi r2 = X.MCi.A00(r4, r2)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r2, r0)
            if (r0 != r1) goto L_0x00e7
            return r1
        L_0x00e4:
            X.0eS.A00(r3)
        L_0x00e7:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x00ec:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x00fa
            if (r2 == r5) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00fa:
            java.lang.Object r4 = A00(r3, r0)
            X.Loj r4 = (X.C65180Loj) r4
            X.KO9 r2 = r4.A02
            X.0r6 r3 = r2.A01
            r2 = 2
            X.MCi r2 = X.MCi.A00(r4, r2)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r2, r0)
            goto L_0x0d4d
        L_0x0111:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x011f
            if (r2 == r5) goto L_0x0136
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x011f:
            java.lang.Object r4 = A00(r3, r0)
            X.Los r4 = (X.C65189Los) r4
            X.KOO r2 = r4.A06
            X.0Ud r3 = r2.A06
            X.MCi r2 = X.MCi.A00(r4, r5)
            r0.A00 = r5
            java.lang.Object r0 = r3.collect(r2, r0)
            if (r0 != r1) goto L_0x0139
            return r1
        L_0x0136:
            X.0eS.A00(r3)
        L_0x0139:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x013e:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x014c
            if (r4 == r2) goto L_0x0163
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x014c:
            java.lang.Object r4 = A00(r3, r0)
            X.KHW r4 = (X.KHW) r4
            X.0eM r2 = r4.A09
            X.JiG r2 = X.JTT.A0P(r2)
            X.0pa r3 = r2.A08
            r2 = 55
            java.lang.Object r0 = A02(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x0166
            return r1
        L_0x0163:
            X.0eS.A00(r3)
        L_0x0166:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x016b:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x0179
            if (r4 == r2) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0179:
            java.lang.Object r4 = A00(r3, r0)
            X.KHW r4 = (X.KHW) r4
            X.0eM r2 = r4.A09
            X.JiG r2 = X.JTT.A0P(r2)
            X.0r6 r3 = r2.A04
            r2 = 54
            java.lang.Object r0 = A01(r4, r0, r3, r2)
            goto L_0x0d4d
        L_0x018f:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x019d
            if (r4 == r2) goto L_0x01b4
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x019d:
            java.lang.Object r4 = A00(r3, r0)
            X.K7V r4 = (X.K7V) r4
            X.0eM r2 = r4.A05
            X.JiG r2 = X.JTT.A0P(r2)
            X.0pa r3 = r2.A08
            r2 = 53
            java.lang.Object r0 = A02(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x01b7
            return r1
        L_0x01b4:
            X.0eS.A00(r3)
        L_0x01b7:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x01bc:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x01ca
            if (r4 == r2) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01ca:
            java.lang.Object r4 = A00(r3, r0)
            X.K7V r4 = (X.K7V) r4
            X.0eM r2 = r4.A05
            X.JiG r2 = X.JTT.A0P(r2)
            X.0r6 r3 = r2.A04
            r2 = 52
            java.lang.Object r0 = A01(r4, r0, r3, r2)
            goto L_0x0d4d
        L_0x01e0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x01ee
            if (r2 == r4) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01ee:
            java.lang.Object r2 = A00(r3, r0)
            X.KNr r2 = (X.C61828KNr) r2
            X.KO3 r3 = r2.A03
            java.lang.Object r2 = r0.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0.A00 = r4
            X.0Ud r0 = r3.A06
            java.lang.Object r0 = r0.getValue()
            X.8fx r0 = (X.C361278fx) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x020f
            r2.run()
        L_0x020b:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0d4d
        L_0x020f:
            java.util.Queue r0 = r3.A04
            r0.add(r2)
            goto L_0x020b
        L_0x0215:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0223
            if (r2 == r7) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0223:
            X.0eS.A00(r3)
            java.lang.Object r6 = r0.A01
            X.KWg r6 = (X.C62030KWg) r6
            X.0r6 r5 = r6.A01
            java.lang.Object r4 = r0.A02
            r3 = 56
            X.MCn r2 = new X.MCn
            r2.<init>((int) r3, (java.lang.Object) r6, (java.lang.Object) r4)
            r0.A00 = r7
            java.lang.Object r0 = r5.collect(r2, r0)
            goto L_0x0d4d
        L_0x023d:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x024b
            if (r4 == r2) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x024b:
            java.lang.Object r5 = A00(r3, r0)
            X.K5v r5 = (X.C61401K5v) r5
            X.LP2 r2 = r5.A01
            if (r2 != 0) goto L_0x025d
            X.JTO.A1M()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x025d:
            X.Jfi r2 = r2.A04()
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r4 = r5.A02
            if (r4 != 0) goto L_0x026f
            java.lang.String r0 = "categoryType"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x026f:
            java.util.Map r2 = r2.A01
            java.lang.Object r3 = r2.get(r4)
            if (r3 != 0) goto L_0x027e
            X.02z r3 = X.JTO.A1J()
            r2.put(r4, r3)
        L_0x027e:
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            r2 = 49
            java.lang.Object r0 = A01(r5, r0, r3, r2)
            goto L_0x0d4d
        L_0x0288:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x0296
            if (r4 == r2) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0296:
            java.lang.Object r4 = A00(r3, r0)
            X.K66 r4 = (X.K66) r4
            X.KNs r2 = X.K66.A06(r4)
            X.KOa r2 = r2.A0I
            X.0r6 r3 = r2.A04
            r2 = 48
            java.lang.Object r0 = A01(r4, r0, r3, r2)
            goto L_0x0d4d
        L_0x02ac:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x02ba
            if (r4 == r2) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02ba:
            java.lang.Object r4 = A00(r3, r0)
            X.K66 r4 = (X.K66) r4
            X.KNs r2 = X.K66.A06(r4)
            X.KOa r2 = r2.A0I
            X.0r6 r3 = r2.A03
            r2 = 47
            java.lang.Object r0 = A01(r4, r0, r3, r2)
            goto L_0x0d4d
        L_0x02d0:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x02de
            if (r4 == r2) goto L_0x02f7
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02de:
            java.lang.Object r4 = A00(r3, r0)
            X.K66 r4 = (X.K66) r4
            X.0eM r2 = r4.A0P
            java.lang.Object r2 = r2.getValue()
            X.Jg1 r2 = (X.C60120Jg1) r2
            X.05G r3 = r2.A01
            r2 = 46
            java.lang.Object r0 = A02(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x02fa
            return r1
        L_0x02f7:
            X.0eS.A00(r3)
        L_0x02fa:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x02ff:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x030d
            if (r2 == r6) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x030d:
            java.lang.Object r9 = A00(r3, r0)
            X.JcW r9 = (X.C59963JcW) r9
            X.05G r8 = r9.A0O
            java.lang.Iterable r3 = X.JTO.A0x(r8)
            java.lang.Object r7 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r7 = (com.instagram.music.common.model.AudioOverlayTrack) r7
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0344
            r2 = r3
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0344
        L_0x032a:
            java.util.Collection r2 = X.JTO.A13(r8)
            java.util.ArrayList r2 = X.00k.A0T(r7, r2)
            r8.Epw(r2)
        L_0x0335:
            X.3ju r3 = r9.A0E
            X.KNY r2 = new X.KNY
            r2.<init>(r7)
            r0.A00 = r6
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x0d4d
        L_0x0344:
            java.util.Iterator r5 = r3.iterator()
        L_0x0348:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x032a
            java.lang.Object r2 = r5.next()
            com.instagram.music.common.model.AudioOverlayTrack r2 = (com.instagram.music.common.model.AudioOverlayTrack) r2
            com.instagram.music.common.model.MusicAssetModel r3 = r2.A08
            r2 = 0
            if (r3 == 0) goto L_0x0368
            java.lang.String r4 = r3.A0E
        L_0x035b:
            com.instagram.music.common.model.MusicAssetModel r3 = r7.A08
            if (r3 == 0) goto L_0x0361
            java.lang.String r2 = r3.A0E
        L_0x0361:
            boolean r2 = X.0qQ.A0K(r4, r2)
            if (r2 == 0) goto L_0x0348
            goto L_0x0335
        L_0x0368:
            r4 = r2
            goto L_0x035b
        L_0x036a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0378
            if (r2 == r6) goto L_0x0398
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0378:
            java.lang.Object r5 = A00(r3, r0)
            X.H13 r5 = (X.H13) r5
            X.0eM r2 = r5.A08
            java.lang.Object r2 = r2.getValue()
            X.GhN r2 = (X.C53032GhN) r2
            X.0Ud r4 = r2.A0I
            r3 = 17
            X.IkV r2 = new X.IkV
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x039b
            return r1
        L_0x0398:
            X.0eS.A00(r3)
        L_0x039b:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x03a0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x03ae
            if (r2 == r8) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03ae:
            X.0eS.A00(r3)
            java.lang.Object r7 = r0.A01
            java.lang.Object r6 = r0.A02
            X.GhN r6 = (X.C53032GhN) r6
            X.4HW r5 = r6.A0A
            r4 = 0
            r2 = 5
            X.GPB r3 = new X.GPB
            r3.<init>(r6, r7, r4, r2)
            r0.A00 = r8
            r2 = 1390(0x56e, float:1.948E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.Object r0 = r5.A00(r2, r0, r3)
            goto L_0x0d4d
        L_0x03ce:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r11 = 1
            if (r2 == 0) goto L_0x04f0
            if (r2 != r11) goto L_0x059c
            X.0eS.A00(r3)
        L_0x03da:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r1 = r3 instanceof X.C239793Ih
            r16 = 0
            if (r1 == 0) goto L_0x04e8
            X.3lr r9 = X.C41846B3n.A0R(r3)
            if (r9 == 0) goto L_0x04c1
            java.lang.Class<X.BeF> r8 = X.C42534BeF.class
            r7 = 0
            r1 = 1958(0x7a6, float:2.744E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r1)
            r5 = 869662047(0x33d5fd5f, float:9.964673E-8)
            X.3lr r4 = r9.getOptionalTreeField(r7, r6, r8, r5)
            if (r4 == 0) goto L_0x0493
            java.lang.Class<X.BeE> r2 = X.C42533BeE.class
            r1 = -1833019812(0xffffffff92be565c, float:-1.2011975E-27)
            X.3lr r2 = r4.reinterpretRequired(r7, r2, r1)
            if (r2 == 0) goto L_0x0493
            java.lang.String r1 = "success"
            boolean r1 = r2.getCoercedBooleanField(r7, r1)
            if (r1 != r11) goto L_0x0493
        L_0x040d:
            java.lang.Object r2 = r0.A01
            X.Jvj r2 = (X.C61045Jvj) r2
            r1 = r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0593
            X.3lr r4 = X.C41846B3n.A0R(r3)
            if (r4 == 0) goto L_0x0589
            java.lang.Class<X.BeF> r3 = X.C42534BeF.class
            r8 = 0
            r0 = 1958(0x7a6, float:2.744E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 869662047(0x33d5fd5f, float:9.964673E-8)
            X.3lr r3 = r4.getOptionalTreeField(r8, r1, r3, r0)
            if (r3 == 0) goto L_0x0589
            java.lang.Class<X.BeE> r1 = X.C42533BeE.class
            r0 = -1833019812(0xffffffff92be565c, float:-1.2011975E-27)
            X.3lr r4 = r3.reinterpretRequired(r8, r1, r0)
            if (r4 == 0) goto L_0x0589
            java.lang.Class<X.BeD> r3 = X.C42532BeD.class
            java.lang.String r1 = "theme"
            r0 = -287765545(0xffffffffeed90bd7, float:-3.358628E28)
            X.3lr r7 = r4.getOptionalTreeField(r11, r1, r3, r0)
            if (r7 == 0) goto L_0x0589
            java.lang.Class<X.9ea> r6 = X.C382829ea.class
            r5 = -1350982122(0xffffffffaf79a616, float:-2.2705424E-10)
            X.3lr r4 = r7.reinterpretRequired(r8, r6, r5)
            X.9ea r4 = (X.C382829ea) r4
            X.0qQ.A07(r4)
            java.lang.Class<X.BeC> r3 = X.C42531BeC.class
            java.lang.String r1 = "alternative_themes"
            r0 = -145048408(0xfffffffff75abca8, float:-4.4365122E33)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r7, r3, r1, r11, r0)
            java.lang.Object r0 = r0.get(r8)
            X.3lr r0 = (X.C250663lr) r0
            X.3lr r1 = r0.reinterpretRequired(r8, r6, r5)
            X.9ea r1 = (X.C382829ea) r1
            X.0qQ.A07(r1)
            java.lang.String r0 = "strong_id__"
            java.lang.String r0 = r4.getOptionalStringField(r11, r0)
            if (r0 == 0) goto L_0x058c
            com.instagram.direct.model.DirectThreadThemeInfo r3 = X.C389799qE.A00(r4, r1, r0)
            java.lang.String r4 = r2.A05
            java.lang.String r5 = r2.A02
            java.lang.String r6 = r2.A06
            java.lang.String r7 = r2.A07
            java.lang.String r8 = r2.A03
            java.lang.String r9 = r2.A04
            X.0qQ.A0B(r4, r11)
            X.Jvj r2 = new X.Jvj
            r2.<init>((com.instagram.direct.model.DirectThreadThemeInfo) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)
            X.3Ih r1 = X.C41845B3m.A0d(r2)
            return r1
        L_0x0493:
            X.3lr r3 = r9.getOptionalTreeField(r7, r6, r8, r5)
            if (r3 == 0) goto L_0x04c1
            java.lang.Class<X.BeE> r2 = X.C42533BeE.class
            r1 = -1833019812(0xffffffff92be565c, float:-1.2011975E-27)
            X.3lr r5 = r3.reinterpretRequired(r7, r2, r1)
            if (r5 == 0) goto L_0x04c1
            java.lang.Class<X.UQ4> r3 = X.UQ4.class
            r4 = 2
            java.lang.String r2 = "error"
            r1 = 2109585054(0x7dbdb69e, float:3.1521537E37)
            X.3lr r3 = r5.getOptionalTreeField(r4, r2, r3, r1)
            if (r3 == 0) goto L_0x04c3
            java.lang.String r1 = "internal_error_message"
            java.lang.String r13 = r3.getOptionalStringField(r11, r1)
            X.Kic r2 = X.C62605Kic.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "type"
            java.lang.Enum r1 = r3.getOptionalEnumField(r4, r1, r2)
            goto L_0x04c6
        L_0x04c1:
            r3 = r16
        L_0x04c3:
            r13 = r16
            r1 = r13
        L_0x04c6:
            java.lang.String r14 = java.lang.String.valueOf(r1)
            if (r3 == 0) goto L_0x04e5
            java.lang.String r1 = "ui_description"
            java.lang.String r15 = r3.A0A(r1)
            java.lang.String r1 = "ui_description_details"
            java.lang.String r16 = r3.A0B(r1)
        L_0x04d8:
            r17 = 6
            X.QP5 r12 = new X.QP5
            r12.<init>(r13, r14, r15, r16, r17)
            X.5sO r3 = X.C41845B3m.A0c(r12)
            goto L_0x040d
        L_0x04e5:
            r15 = r16
            goto L_0x04d8
        L_0x04e8:
            java.lang.String r1 = "Network error"
            X.5sO r3 = X.JTU.A0S(r1)
            goto L_0x040d
        L_0x04f0:
            java.lang.Object r2 = A00(r3, r0)
            X.9qE r2 = (X.C389799qE) r2
            X.L0k r2 = r2.A00
            java.lang.Object r8 = r0.A01
            X.Jvj r8 = (X.C61045Jvj) r8
            r0.A00 = r11
            com.instagram.common.session.UserSession r2 = r2.A00
            X.1vn r3 = X.1vm.A01(r2)
            r12 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r9 = X.C41845B3m.A04()
            X.2IV r6 = new X.2IV
            r6.<init>()
            java.lang.String r4 = r8.A05
            java.lang.String r2 = "prompt"
            r6.A09(r4, r2)
            java.lang.String r4 = "IGDIRECT"
            java.lang.String r2 = "caller"
            r6.A09(r4, r2)
            r13 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r13)
            java.lang.String r2 = "skip_post_processing"
            r6.A08(r2, r4)
            X.0sn r4 = X.0sn.A00
            r2 = 3400(0xd48, float:4.764E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r6.A05(r2, r4)
            java.lang.String r4 = r8.A02
            java.lang.String r2 = "color"
            r6.A09(r4, r2)
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r4 = r8.A06
            java.lang.String r2 = "request_id"
            X.0Df r7 = X.C41845B3m.A03(r7, r4, r2)
            java.lang.String r4 = r8.A07
            java.lang.String r2 = "response_id"
            X.0Df.A00(r7, r4, r2)
            java.lang.String r4 = r8.A03
            java.lang.String r2 = "image_handle"
            X.0Df.A00(r7, r4, r2)
            java.lang.String r4 = ""
            java.lang.String r2 = "image_url"
            X.0Df.A00(r7, r4, r2)
            java.lang.String r4 = "imagine_result"
            X.0Df r2 = r6.A02()
            r2.A0E(r7, r4)
            java.lang.String r2 = "input"
            X.1vR r6 = X.JTP.A0L(r6, r5, r2)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r9.getParamsCopy()
            java.lang.Class<X.BeG> r10 = X.C42535BeG.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "GenerateThemeMutation"
            java.lang.String r15 = "xfb_generate_ai_theme_with_post_processing"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.A04(r5, r0)
            if (r3 != r1) goto L_0x03da
            return r1
        L_0x0589:
            java.lang.String r0 = "Generated theme is missing from server response"
            goto L_0x058e
        L_0x058c:
            java.lang.String r0 = "Malformed server response"
        L_0x058e:
            X.5sO r1 = X.JTU.A0S(r0)
            return r1
        L_0x0593:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0d63
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x059c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05a1:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x05af
            if (r2 == r6) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05af:
            java.lang.Object r5 = A00(r3, r0)
            X.H0e r5 = (X.C54135H0e) r5
            X.0eM r2 = r5.A09
            java.lang.Object r2 = r2.getValue()
            X.GhH r2 = (X.C53026GhH) r2
            X.0r6 r4 = r2.A05
            r3 = 16
            X.IkV r2 = new X.IkV
            r2.<init>(r5, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            goto L_0x0d4d
        L_0x05ce:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 2
            r6 = 1
            if (r2 == 0) goto L_0x05df
            if (r2 == r6) goto L_0x0606
            if (r2 == r8) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05df:
            X.0eS.A00(r3)
            java.lang.Object r5 = r0.A01
            X.JwE r5 = (X.C61076JwE) r5
            java.lang.Object r4 = r0.A02
            X.GgQ r4 = (X.C52973GgQ) r4
            X.I4e r2 = r4.A07
            X.GnY r2 = r2.A00
            java.lang.String r2 = r2.A03
            X.KS2 r3 = new X.KS2
            r3.<init>(r5, r2)
            X.0eM r2 = r4.A0C
            java.lang.Object r2 = r2.getValue()
            com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource r2 = (com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource) r2
            r0.A00 = r6
            java.lang.Object r3 = r2.A01(r3, r0)
            if (r3 != r1) goto L_0x0609
            return r1
        L_0x0606:
            X.0eS.A00(r3)
        L_0x0609:
            X.3Ii r3 = (X.C239803Ii) r3
            java.lang.Object r7 = r0.A02
            X.GgQ r7 = (X.C52973GgQ) r7
            boolean r2 = r3 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x0624
            boolean r2 = r3 instanceof X.C297815sO
            if (r2 == 0) goto L_0x067b
            X.5sO r3 = (X.C297815sO) r3
            java.lang.Object r2 = r3.A00
            X.Hir r2 = (X.C55509Hir) r2
            X.C52973GgQ.A06(r7, r2)
            X.5sO r3 = X.DbU.A0f()
        L_0x0624:
            boolean r2 = r3 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0672
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r9 = r3.A00
            X.L4B r9 = (X.L4B) r9
            X.Hka r3 = r7.A08
            boolean r6 = r9.A01
            java.util.concurrent.atomic.AtomicReference r2 = r3.A01
            java.lang.Object r2 = r2.get()
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x064f
            int r5 = r2.intValue()
            X.02m r4 = r3.A00
            r3 = 792330241(0x2f3a0001, float:1.6916603E-10)
            java.lang.String r2 = "segmentation_results_available"
            r4.markerPoint(r3, r5, r2)
            java.lang.String r2 = "segmentation_results_cached"
            r4.markerAnnotate(r3, r5, r2, r6)
        L_0x064f:
            X.L82 r6 = r9.A00
            X.HmF r2 = r6.A02
            r7.A00 = r2
            r0.A00 = r8
            X.6oS r5 = X.C318116oQ.A00(r7)
            X.12T r2 = X.AnonymousClass12T.A00
            r4 = 0
            r0 = 1242107527(0x4a090e87, float:2245537.8)
            X.0nV r3 = X.JTP.A0U(r2, r0)
            r2 = 5
            X.MHF r0 = new X.MHF
            r0.<init>(r6, r7, r4, r2)
            X.1Eo.A05(r3, r0, r5)
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0d4d
        L_0x0672:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0d61
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x067b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0680:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x068e
            if (r2 == r5) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x068e:
            java.lang.Object r2 = A00(r3, r0)
            X.GgQ r2 = (X.C52973GgQ) r2
            X.0eM r2 = r2.A0C
            java.lang.Object r4 = r2.getValue()
            com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource r4 = (com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource) r4
            java.lang.Object r2 = r0.A01
            X.JwE r2 = (X.C61076JwE) r2
            X.JwG r3 = new X.JwG
            r3.<init>((X.C61076JwE) r2)
            r0.A00 = r5
            X.MTt r2 = r4.A01
            java.lang.Object r0 = r2.FMY(r3, r0)
            goto L_0x0d4d
        L_0x06af:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x06bd
            if (r2 == r5) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06bd:
            java.lang.Object r2 = A00(r3, r0)
            X.8An r2 = (X.C351818An) r2
            X.0eM r2 = r2.A0A
            java.lang.Object r4 = r2.getValue()
            com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource r4 = (com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource) r4
            java.lang.Object r2 = r0.A01
            X.JwE r2 = (X.C61076JwE) r2
            X.JwG r3 = new X.JwG
            r3.<init>((X.C61076JwE) r2)
            r0.A00 = r5
            X.MTt r2 = r4.A01
            java.lang.Object r0 = r2.FMY(r3, r0)
            goto L_0x0d4d
        L_0x06de:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L_0x0723
            if (r2 != r9) goto L_0x082e
            X.0eS.A00(r3)
        L_0x06eb:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0818
            java.lang.Object r0 = r0.A02
            X.HDk r0 = (X.C54435HDk) r0
            X.05G r6 = r0.A06
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0709:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0824
            java.lang.Object r0 = r4.next()
            X.Jvc r0 = (X.C61038Jvc) r0
            java.lang.String r3 = r0.A02
            boolean r2 = r0.A04
            r1 = 0
            X.Jvt r0 = new X.Jvt
            r0.<init>((com.instagram.common.typedurl.ImageUrl) r1, (java.lang.String) r3, (java.lang.String) r1, (boolean) r2)
            r5.add(r0)
            goto L_0x0709
        L_0x0723:
            X.0eS.A00(r3)
            java.lang.Object r2 = r0.A01
            X.8hK r2 = (X.C362088hK) r2
            int r3 = r2.ordinal()
            if (r3 == r10) goto L_0x0757
            r2 = 2
            if (r3 == r2) goto L_0x0754
            if (r3 != r9) goto L_0x083d
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
        L_0x0737:
            X.0qQ.A0B(r7, r9)
            r14 = 0
            com.instagram.genai.promptservice.service.GenAISuggestedPromptsService r8 = com.instagram.genai.promptservice.service.GenAISuggestedPromptsService.A00
            java.lang.Object r2 = r0.A02
            X.HDk r2 = (X.C54435HDk) r2
            com.instagram.common.session.UserSession r5 = r2.A01
            r0.A00 = r9
            r4 = 28
            boolean r2 = X.C66137MDp.A02(r4, r0)
            if (r2 == 0) goto L_0x075a
            java.lang.String r0 = "i3"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0754:
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            goto L_0x0737
        L_0x0757:
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            goto L_0x0737
        L_0x075a:
            X.MDp r3 = X.C66137MDp.A00(r8, r0, r4)
            java.lang.Object r6 = r3.A02
            int r2 = r3.A00
            if (r2 == 0) goto L_0x07b8
            if (r2 != r9) goto L_0x0838
            X.0eS.A00(r6)
        L_0x0769:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r2 = r6 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x07ad
            X.3lr r6 = X.C41846B3n.A0R(r6)
            if (r6 == 0) goto L_0x07aa
            java.lang.Class<X.BqQ> r5 = X.BqQ.class
            r7 = 0
            r2 = 1970(0x7b2, float:2.76E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            r2 = -1080581502(0xffffffffbf97a282, float:-1.1846468)
            X.3lr r6 = r6.getOptionalTreeField(r7, r3, r5, r2)
            if (r6 == 0) goto L_0x07aa
            java.lang.Class<X.BqP> r5 = X.BqP.class
            java.lang.String r3 = "prompts"
            r2 = -288934597(0xffffffffeec7353b, float:-3.0825934E28)
            com.google.common.collect.ImmutableList r2 = r6.getRequiredCompactedTreeListField(r7, r3, r5, r2)
            if (r2 == 0) goto L_0x07aa
            java.util.ArrayList r3 = com.instagram.genai.promptservice.service.GenAISuggestedPromptsService.A00(r2)
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x07aa
            X.JwG r2 = new X.JwG
            r2.<init>((java.util.List) r3, (int) r4)
            X.3Ih r3 = X.C41845B3m.A0d(r2)
        L_0x07a7:
            if (r3 != r1) goto L_0x06eb
            return r1
        L_0x07aa:
            X.KSA r2 = X.KSA.A00
            goto L_0x07b3
        L_0x07ad:
            boolean r2 = r6 instanceof X.C297815sO
            if (r2 == 0) goto L_0x0833
            X.KS9 r2 = X.KS9.A00
        L_0x07b3:
            X.5sO r3 = X.C41845B3m.A0c(r2)
            goto L_0x07a7
        L_0x07b8:
            X.0eS.A00(r6)
            int r6 = r7.intValue()
            if (r6 == r10) goto L_0x0815
            if (r6 == r9) goto L_0x0812
            r2 = 2
            if (r6 == r2) goto L_0x080f
            java.lang.String r7 = "STYLIZATION"
        L_0x07c8:
            r3.A01 = r8
            r3.A00 = r9
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r2 = "type"
            X.0Df r8 = X.C41845B3m.A03(r6, r7, r2)
            r2 = 356(0x164, float:4.99E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0Df.A00(r8, r14, r2)
            java.lang.String r2 = "media_id"
            X.2IS r7 = X.JTQ.A0D(r8, r14, r2)
            X.2IS r6 = X.C41845B3m.A04()
            java.lang.String r2 = "params"
            X.1vR r8 = X.C41847B3o.A04(r8, r7, r2)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.BqR> r12 = X.BqR.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "IGSharingGenAISuggestedPromptsQuery"
            r13 = 0
            java.lang.String r17 = "xig_ig_genai_suggested_prompts_query"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r6 = X.JTQ.A0W(r7, r5, r3)
            if (r6 != r1) goto L_0x0769
            return r1
        L_0x080f:
            java.lang.String r7 = "IMAGINE_ME"
            goto L_0x07c8
        L_0x0812:
            java.lang.String r7 = "EXPANDER"
            goto L_0x07c8
        L_0x0815:
            java.lang.String r7 = "BACKDROP"
            goto L_0x07c8
        L_0x0818:
            boolean r1 = r3 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0829
            java.lang.Object r0 = r0.A02
            X.HDk r0 = (X.C54435HDk) r0
            X.05G r6 = r0.A06
            X.62M r5 = X.AnonymousClass62M.A01
        L_0x0824:
            r6.Epw(r5)
            goto L_0x0d61
        L_0x0829:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x082e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0833:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0838:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x083d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0842:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0885
            if (r2 == r4) goto L_0x0896
            if (r2 != r5) goto L_0x08d4
            X.0eS.A00(r3)
        L_0x0851:
            X.3Ii r3 = (X.C239803Ii) r3
            java.lang.Object r1 = r0.A02
            X.Hzh r1 = (X.C56510Hzh) r1
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x08cb
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            java.util.List r0 = (java.util.List) r0
            X.HrY r4 = r1.A02
            java.util.Iterator r3 = X.JTP.A0x(r0)
        L_0x0867:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x08b4
            java.lang.Object r2 = r3.next()
            X.JVf r2 = (X.C59721JVf) r2
            java.lang.Object r0 = r2.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0867
            boolean r1 = r0.booleanValue()
            java.lang.Object r0 = r2.A01
            X.8hK r0 = (X.C362088hK) r0
            r4.A00(r0, r1)
            goto L_0x0867
        L_0x0885:
            java.lang.Object r2 = A00(r3, r0)
            X.Hzh r2 = (X.C56510Hzh) r2
            com.instagram.creation.genai.magicmod.consentflow.MagicModConsentMigrator r2 = r2.A01
            r0.A00 = r4
            java.lang.Object r3 = r2.A00(r0)
            if (r3 != r1) goto L_0x0899
            return r1
        L_0x0896:
            X.0eS.A00(r3)
        L_0x0899:
            boolean r2 = X.AnonymousClass7TE.A1a(r3)
            if (r2 == 0) goto L_0x0d61
            com.instagram.creation.genai.magicmod.consentflow.api.MagicModConsentGraphQLApi r4 = com.instagram.creation.genai.magicmod.consentflow.api.MagicModConsentGraphQLApi.A00
            java.lang.Object r2 = r0.A02
            X.Hzh r2 = (X.C56510Hzh) r2
            com.instagram.common.session.UserSession r3 = r2.A00
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            r0.A00 = r5
            java.lang.Object r3 = r4.A00(r3, r2, r0)
            if (r3 != r1) goto L_0x0851
            return r1
        L_0x08b4:
            X.1Av r5 = r4.A00
            long r3 = java.lang.System.currentTimeMillis()
            X.0s0 r2 = r5.A6S
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 466(0x1d2, float:6.53E-43)
            r1 = r1[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.Epx(r5, r0, r1)
            goto L_0x0d61
        L_0x08cb:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0d61
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x08d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08d9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r11 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x08ed
            if (r2 == r6) goto L_0x090e
            if (r2 == r5) goto L_0x0930
            if (r2 == r11) goto L_0x0930
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08ed:
            X.0eS.A00(r3)
            r2 = 1000(0x3e8, float:1.401E-42)
            X.GQC r12 = X.JTR.A0a(r2)
            java.lang.Object r4 = r0.A01
            r3 = 4
            X.JFu r2 = new X.JFu
            r2.<init>(r4, r3)
            r0.A00 = r6
            r15 = 0
            r16 = 1065353216(0x3f800000, float:1.0)
            r13 = r0
            r14 = r2
            r17 = r15
            java.lang.Object r2 = androidx.compose.animation.core.SuspendAnimationKt.A03(r12, r13, r14, r15, r16, r17)
            if (r2 != r1) goto L_0x0911
            return r1
        L_0x090e:
            X.0eS.A00(r3)
        L_0x0911:
            r2 = 1000(0x3e8, float:1.401E-42)
            X.GQC r12 = X.JTR.A0a(r2)
            java.lang.Object r4 = r0.A02
            r3 = 5
            X.JFu r2 = new X.JFu
            r2.<init>(r4, r3)
            r0.A00 = r5
            r15 = 1073741824(0x40000000, float:2.0)
            r16 = 1056964608(0x3f000000, float:0.5)
            r17 = 0
            r13 = r0
            r14 = r2
            java.lang.Object r2 = androidx.compose.animation.core.SuspendAnimationKt.A03(r12, r13, r14, r15, r16, r17)
        L_0x092d:
            if (r2 != r1) goto L_0x0933
            return r1
        L_0x0930:
            X.0eS.A00(r3)
        L_0x0933:
            java.lang.Object r15 = r0.A02
            X.5Oz r15 = (X.C284945Oz) r15
            java.lang.Object r13 = r15.getValue()
            X.GNY r13 = (X.GNY) r13
            java.lang.Object r10 = r13.A01
            android.graphics.PointF r10 = (android.graphics.PointF) r10
        L_0x0941:
            float r9 = r10.x
            r4 = -4624296097384025293(0xbfd3333333333333, double:-0.3)
            r2 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            X.2SP r6 = X.2SP.A01
            double r7 = r6.A01(r4, r2)
            float r12 = (float) r7
            float r9 = r9 + r12
            float r7 = r10.y
            double r2 = r6.A01(r4, r2)
            float r4 = (float) r2
            float r7 = r7 + r4
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r9, r7)
            float r3 = r14.x
            r2 = 1036831949(0x3dcccccd, float:0.1)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0941
            r2 = 1063675494(0x3f666666, float:0.9)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0941
            float r3 = r14.y
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0941
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0941
            float r7 = r13.A00
        L_0x0984:
            r4 = -4626998257160447590(0xbfc999999999999a, double:-0.2)
            r2 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r2 = r6.A01(r4, r2)
            float r4 = (float) r2
            float r4 = r4 + r7
            java.lang.Float r8 = java.lang.Float.valueOf(r4)
            if (r8 == 0) goto L_0x0984
            r5 = 1041865114(0x3e19999a, float:0.15)
            r3 = 1059481190(0x3f266666, float:0.65)
            X.GQu r2 = new X.GQu
            r2.<init>(r5, r3)
            boolean r2 = r2.AJZ(r8)
            if (r2 == 0) goto L_0x0984
            r3 = 1200(0x4b0, float:1.682E-42)
            r2 = 1600(0x640, float:2.242E-42)
            int r2 = r6.A06(r3, r2)
            X.GQC r2 = X.JTR.A0a(r2)
            X.J7p r12 = new X.J7p
            r17 = r11
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            r0.A00 = r11
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r3 = r0
            r4 = r12
            r7 = r5
            java.lang.Object r2 = androidx.compose.animation.core.SuspendAnimationKt.A03(r2, r3, r4, r5, r6, r7)
            goto L_0x092d
        L_0x09ce:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x09dc
            if (r2 == r7) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09dc:
            java.lang.Object r6 = A00(r3, r0)
            X.6FR r6 = (X.AnonymousClass6FR) r6
            r5 = 0
            java.lang.Object r4 = r0.A01
            r3 = 3
            X.JVp r2 = new X.JVp
            r2.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r5, (int) r3)
            r0.A00 = r7
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A05(r6, r0, r5, r2)
            goto L_0x0d4d
        L_0x09f3:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x0a01
            if (r4 == r2) goto L_0x0a1a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a01:
            java.lang.Object r4 = A00(r3, r0)
            X.H0n r4 = (X.C54143H0n) r4
            X.0eM r2 = r4.A02
            java.lang.Object r2 = r2.getValue()
            com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel r2 = (com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel) r2
            X.0pa r3 = r2.A09
            r2 = 36
            java.lang.Object r0 = A02(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x0a1d
            return r1
        L_0x0a1a:
            X.0eS.A00(r3)
        L_0x0a1d:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0a22:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0a30
            if (r2 == r4) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a30:
            java.lang.Object r3 = A00(r3, r0)
            com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel r3 = (com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel) r3
            java.lang.Object r2 = r0.A01
            com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage r2 = (com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage) r2
            r0.A00 = r4
            java.lang.Object r0 = r3.A01(r2, r0)
            goto L_0x0d4d
        L_0x0a42:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0a50
            if (r2 == r6) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a50:
            java.lang.Object r9 = A00(r3, r0)
            X.JjS r9 = (X.C60323JjS) r9
            X.05G r8 = r9.A0N
            java.lang.Iterable r3 = X.JTO.A0x(r8)
            java.lang.Object r7 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r7 = (com.instagram.music.common.model.AudioOverlayTrack) r7
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0a87
            r2 = r3
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0a87
        L_0x0a6d:
            java.util.Collection r2 = X.JTO.A13(r8)
            java.util.ArrayList r2 = X.00k.A0T(r7, r2)
            r8.Epw(r2)
        L_0x0a78:
            X.3ju r3 = r9.A0D
            X.KNJ r2 = new X.KNJ
            r2.<init>(r7)
            r0.A00 = r6
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x0d4d
        L_0x0a87:
            java.util.Iterator r5 = r3.iterator()
        L_0x0a8b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0a6d
            java.lang.Object r2 = r5.next()
            com.instagram.music.common.model.AudioOverlayTrack r2 = (com.instagram.music.common.model.AudioOverlayTrack) r2
            com.instagram.music.common.model.MusicAssetModel r3 = r2.A08
            r2 = 0
            if (r3 == 0) goto L_0x0aab
            java.lang.String r4 = r3.A0E
        L_0x0a9e:
            com.instagram.music.common.model.MusicAssetModel r3 = r7.A08
            if (r3 == 0) goto L_0x0aa4
            java.lang.String r2 = r3.A0E
        L_0x0aa4:
            boolean r2 = X.0qQ.A0K(r4, r2)
            if (r2 == 0) goto L_0x0a8b
            goto L_0x0a78
        L_0x0aab:
            r4 = r2
            goto L_0x0a9e
        L_0x0aad:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x0abb
            if (r4 == r2) goto L_0x0ad6
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0abb:
            java.lang.Object r4 = A00(r3, r0)
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r4 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r4
            com.facebook.common.callercontext.CallerContext r2 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            X.0eM r2 = r4.A0e
            java.lang.Object r2 = r2.getValue()
            X.Jg1 r2 = (X.C60120Jg1) r2
            X.05G r3 = r2.A01
            r2 = 33
            java.lang.Object r0 = A02(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x0ad9
            return r1
        L_0x0ad6:
            X.0eS.A00(r3)
        L_0x0ad9:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0ade:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x0aec
            if (r4 == r2) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0aec:
            java.lang.Object r4 = A00(r3, r0)
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r4 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r4
            X.KNr r2 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r4)
            X.KOp r2 = r2.A0M
            X.0r6 r3 = r2.A02
            r2 = 32
            java.lang.Object r0 = A01(r4, r0, r3, r2)
            goto L_0x0d4d
        L_0x0b02:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x0b10
            if (r4 == r2) goto L_0x0b27
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b10:
            java.lang.Object r4 = A00(r3, r0)
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r4 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r4
            X.KNr r2 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r4)
            X.KOe r2 = r2.A07
            X.0Ud r3 = r2.A04
            r2 = 31
            java.lang.Object r0 = A02(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x0b2a
            return r1
        L_0x0b27:
            X.0eS.A00(r3)
        L_0x0b2a:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0b2f:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x0b3d
            if (r4 == r2) goto L_0x0b60
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b3d:
            java.lang.Object r4 = A00(r3, r0)
            X.K5Y r4 = (X.K5Y) r4
            com.facebook.common.callercontext.CallerContext r2 = X.K5Y.A0E
            X.KNr r2 = r4.A01
            if (r2 != 0) goto L_0x0b53
            java.lang.String r0 = "feedPublishScreenViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0b53:
            X.KOm r2 = r2.A0O
            X.0Ud r3 = r2.A0A
            r2 = 30
            java.lang.Object r0 = A02(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x0b63
            return r1
        L_0x0b60:
            X.0eS.A00(r3)
        L_0x0b63:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0b68:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0b7e
            if (r2 != r4) goto L_0x0b8f
            java.lang.Object r2 = r0.A01
            com.instagram.creation.fragment.AlbumEditFragment r2 = (com.instagram.creation.fragment.AlbumEditFragment) r2
            X.0eS.A00(r3)
        L_0x0b78:
            java.util.Map r3 = (java.util.Map) r3
            r2.A0R = r3
            goto L_0x0d61
        L_0x0b7e:
            java.lang.Object r2 = A00(r3, r0)
            com.instagram.creation.fragment.AlbumEditFragment r2 = (com.instagram.creation.fragment.AlbumEditFragment) r2
            r0.A01 = r2
            r0.A00 = r4
            java.lang.Object r3 = com.instagram.creation.fragment.AlbumEditFragment.A03(r2, r0)
            if (r3 != r1) goto L_0x0b78
            return r1
        L_0x0b8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b94:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r2 = 1
            if (r4 == 0) goto L_0x0ba2
            if (r4 == r2) goto L_0x0bb5
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ba2:
            java.lang.Object r4 = A00(r3, r0)
            com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserCategoriesViewController r4 = (com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserCategoriesViewController) r4
            X.Jj5 r2 = r4.A03
            X.0Ud r3 = r2.A0A
            r2 = 28
            java.lang.Object r0 = A02(r4, r0, r3, r2)
            if (r0 != r1) goto L_0x0bb8
            return r1
        L_0x0bb5:
            X.0eS.A00(r3)
        L_0x0bb8:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0bbd:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0bcb
            if (r2 == r4) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0bcb:
            java.lang.Object r2 = A00(r3, r0)
            X.Jfo r2 = (X.C60108Jfo) r2
            X.05G r3 = r2.A0d
            java.lang.Object r2 = r0.A01
            r0.A00 = r4
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0d4d
        L_0x0bdd:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0beb
            if (r2 == r6) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0beb:
            java.lang.Object r2 = A00(r3, r0)
            X.Jfo r2 = (X.C60108Jfo) r2
            X.0V2 r5 = r2.A0T
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            java.lang.Object r2 = r0.A01
            X.Kh8 r2 = (X.C62517Kh8) r2
            X.Jw3 r3 = new X.Jw3
            r3.<init>((X.C62517Kh8) r2)
            X.JVf r2 = new X.JVf
            r2.<init>((X.C61065Jw3) r3, (java.lang.Integer) r4)
            r0.A00 = r6
            java.lang.Object r0 = r5.emit(r2, r0)
            goto L_0x0d4d
        L_0x0c0b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0c19
            if (r2 == r4) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c19:
            java.lang.Object r2 = A00(r3, r0)
            X.KMt r2 = (X.C61805KMt) r2
            X.3ju r3 = r2.A0A
            java.lang.Object r2 = r0.A01
            r0.A00 = r4
            java.lang.Object r0 = r3.ELH(r2, r0)
            goto L_0x0d4d
        L_0x0c2b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0c39
            if (r2 == r4) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c39:
            java.lang.Object r2 = A00(r3, r0)
            X.8M1 r2 = (X.AnonymousClass8M1) r2
            X.05G r3 = r2.A06
            java.lang.Object r2 = r0.A01
            r0.A00 = r4
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0d4d
        L_0x0c4b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0c59
            if (r2 == r5) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c59:
            java.lang.Object r2 = A00(r3, r0)
            X.8BN r2 = (X.AnonymousClass8BN) r2
            X.0V2 r4 = r2.A03
            java.lang.Object r3 = r0.A01
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            X.9np r2 = new X.9np
            r2.<init>(r3)
            r0.A00 = r5
            java.lang.Object r0 = r4.emit(r2, r0)
            goto L_0x0d4d
        L_0x0c72:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0c80
            if (r2 == r4) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c80:
            java.lang.Object r2 = A00(r3, r0)
            X.Jfa r2 = (X.C60094Jfa) r2
            X.0V2 r3 = r2.A01
            java.lang.Object r2 = r0.A01
            r0.A00 = r4
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0d4d
        L_0x0c92:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0ca3
            if (r2 == r4) goto L_0x0cb6
            if (r2 == r5) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ca3:
            java.lang.Object r2 = A00(r3, r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r2
            X.0V2 r3 = r2.A0X
            X.8fw r2 = X.C361268fw.A00
            r0.A00 = r4
            java.lang.Object r2 = r3.emit(r2, r0)
            if (r2 != r1) goto L_0x0cb9
            return r1
        L_0x0cb6:
            X.0eS.A00(r3)
        L_0x0cb9:
            java.lang.Object r2 = r0.A02
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r2
            X.0V2 r3 = r2.A0Y
            java.lang.Object r2 = r0.A01
            r0.A00 = r5
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0d4d
        L_0x0cc9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0cd7
            if (r2 == r4) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0cd7:
            X.0eS.A00(r3)
            java.lang.Object r3 = r0.A01
            X.02o r3 = (X.02o) r3
            java.lang.Object r2 = r0.A02
            X.JfW r2 = (X.C60090JfW) r2
            com.instagram.common.session.UserSession r2 = r2.A00
            boolean r2 = X.AET.A01(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.A00 = r4
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0d4d
        L_0x0cf3:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0d01
            if (r2 == r8) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d01:
            java.lang.Object r7 = A00(r3, r0)
            X.K5W r7 = (X.K5W) r7
            X.0eM r3 = r7.A0X
            java.lang.Object r2 = r3.getValue()
            X.Jit r2 = (X.C60295Jit) r2
            X.05G r6 = r2.A02
            java.lang.Object r2 = r3.getValue()
            X.Jit r2 = (X.C60295Jit) r2
            X.05G r5 = r2.A01
            r4 = 0
            r3 = 3
            X.MHi r2 = new X.MHi
            r2.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r4, (int) r3)
            X.0pm r2 = X.AnonymousClass10H.A03(r2, r6, r5)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass11O.A01(r0, r2)
            goto L_0x0d4d
        L_0x0d2b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0d3d
            if (r2 == r4) goto L_0x0d39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d39:
            X.0eS.A00(r3)
            goto L_0x0d61
        L_0x0d3d:
            java.lang.Object r2 = A00(r3, r0)
            X.Jin r2 = (X.C60290Jin) r2
            X.3ju r3 = r2.A04
            java.lang.Object r2 = r0.A01
            r0.A00 = r4
            java.lang.Object r0 = r3.ELH(r2, r0)
        L_0x0d4d:
            if (r0 != r1) goto L_0x0d61
            return r1
        L_0x0d50:
            java.lang.Object r2 = A00(r3, r0)
            X.0sL r2 = (X.0sL) r2
            int r1 = r0.A00
            java.lang.Integer r1 = X.JTO.A0w(r1)
            java.lang.Object r0 = r0.A01
            r2.invoke(r1, r0)
        L_0x0d61:
            X.0gF r1 = X.C60340gF.A00
        L_0x0d63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, MHN mhn) {
        0eS.A00(obj);
        return mhn.A02;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MHN) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHN(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A03 = i;
        this.A02 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHN(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHN(C284945Oz r2, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A03 = 22;
        this.A01 = r2;
    }
}
