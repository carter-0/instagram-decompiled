package X;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;

public final class MHP extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHP(AnonymousClass4D7 r2, 0sK r3, AnonymousClass0r6 r4, int i) {
        super(2, r2);
        this.A04 = i;
        if (22 - i != 0) {
            this.A01 = r4;
            this.A02 = r3;
        } else {
            this.A02 = r4;
            this.A01 = r3;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r0 != null) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1Hj A00(X.LB4 r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 26
            boolean r0 = X.MEC.A03(r3, r9)
            if (r0 == 0) goto L_0x0095
            r4 = r9
            X.MEC r4 = (X.MEC) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0095
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r2) goto L_0x009c
            java.lang.Object r8 = r4.A01
            X.LB4 r8 = (X.LB4) r8
        L_0x0025:
            X.0eS.A00(r1)
        L_0x0028:
            com.facebook.rsys.audio.gen.AudioApi r0 = r8.A02
            if (r0 != 0) goto L_0x008c
            X.NCY r0 = r8.A05
            java.lang.Object r0 = X.JTS.A0g(r0)
            com.facebook.rsys.audio.gen.AudioApi r0 = (com.facebook.rsys.audio.gen.AudioApi) r0
            r8.A02 = r0
            if (r0 != 0) goto L_0x008c
            r6 = 0
        L_0x0039:
            java.lang.String r1 = r8.A03
            if (r1 != 0) goto L_0x005b
            X.PeW r0 = r8.A06
            X.0sa r0 = r0.B9B()
            java.lang.Object r1 = r0.invoke()
            X.N4A r1 = (X.N4A) r1
            java.lang.Class<com.facebook.rsys.call.gen.CallModel> r0 = com.facebook.rsys.call.gen.CallModel.class
            java.lang.Object r0 = r1.A00(r0)
            com.facebook.rsys.call.gen.CallModel r0 = (com.facebook.rsys.call.gen.CallModel) r0
            if (r0 == 0) goto L_0x008a
            com.facebook.rsys.call.gen.CallParticipant r0 = r0.selfParticipant
            if (r0 == 0) goto L_0x008a
            java.lang.String r1 = r0.userId
        L_0x0059:
            r8.A03 = r1
        L_0x005b:
            r7 = 0
            if (r1 == 0) goto L_0x0072
            com.facebook.rsys.audio.gen.AudioApi r0 = r8.A02
            if (r0 != 0) goto L_0x006e
            X.NCY r0 = r8.A05
            java.lang.Object r0 = X.JTS.A0g(r0)
            com.facebook.rsys.audio.gen.AudioApi r0 = (com.facebook.rsys.audio.gen.AudioApi) r0
            r8.A02 = r0
            if (r0 == 0) goto L_0x0072
        L_0x006e:
            int r7 = r0.getAudioLevel(r1, r2)
        L_0x0072:
            X.05G r5 = r8.A09
            r1 = 2
            X.Gms r0 = new X.Gms
            r0.<init>(r6, r7, r1)
            r5.Epw(r0)
            long r0 = r8.A01
            r4.A01 = r8
            r4.A00 = r2
            java.lang.Object r0 = X.C241603Pv.A01(r4, r0)
            if (r0 != r3) goto L_0x0028
            return r3
        L_0x008a:
            r1 = 0
            goto L_0x0059
        L_0x008c:
            r5 = 9
            java.lang.String r1 = "0"
            int r6 = r0.getAudioLevel(r1, r5)
            goto L_0x0039
        L_0x0095:
            X.MEC r4 = new X.MEC
            r4.<init>(r3, r9)
            goto L_0x0016
        L_0x009c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHP.A00(X.LB4, X.4D7):X.1Hj");
    }

    public static MHP A01(Object obj, Object obj2, AnonymousClass4D7 r8, int i) {
        return new MHP(obj, obj2, r8, i, 42);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MHP, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.MHP, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6, types: [X.MHP, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.MHP, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8, types: [X.MHP, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v11, types: [X.MHP, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r3 = new X.MHP(r15, r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0088, code lost:
        r3 = new X.MHP(r1, r2, r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00df, code lost:
        return new X.MHP(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0102, code lost:
        r3 = new X.MHP(r1, r15, r0);
        r3.A01 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r3 = new X.MHP(r2, r1, r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r3.A03 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016f, code lost:
        r3 = A01(r1, r2, r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b1, code lost:
        return new X.MHP(r1, r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01bf, code lost:
        r3 = A01(r2, r1, r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c3, code lost:
        r3.A02 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c5, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01de, code lost:
        return new X.MHP(r8, r9, r10, r15, r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r14, X.AnonymousClass4D7 r15) {
        /*
            r13 = this;
            int r0 = r13.A04
            r6 = r15
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x0096;
                case 2: goto L_0x009a;
                case 3: goto L_0x00a3;
                case 4: goto L_0x00aa;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00bf;
                case 7: goto L_0x00cd;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00ea;
                case 10: goto L_0x001a;
                case 11: goto L_0x0021;
                case 12: goto L_0x0028;
                case 13: goto L_0x002f;
                case 14: goto L_0x0036;
                case 15: goto L_0x003d;
                case 16: goto L_0x0044;
                case 17: goto L_0x004b;
                case 18: goto L_0x0052;
                case 19: goto L_0x00f4;
                case 20: goto L_0x00fe;
                case 21: goto L_0x0059;
                case 22: goto L_0x0060;
                case 23: goto L_0x006b;
                case 24: goto L_0x0072;
                case 25: goto L_0x010a;
                case 26: goto L_0x0114;
                case 27: goto L_0x011a;
                case 28: goto L_0x0120;
                case 29: goto L_0x0127;
                case 30: goto L_0x0082;
                case 31: goto L_0x0131;
                case 32: goto L_0x013c;
                case 33: goto L_0x0152;
                case 34: goto L_0x0159;
                case 35: goto L_0x0160;
                case 36: goto L_0x0169;
                case 37: goto L_0x0174;
                case 38: goto L_0x017d;
                case 39: goto L_0x0186;
                case 40: goto L_0x018f;
                case 41: goto L_0x0196;
                case 42: goto L_0x019f;
                case 43: goto L_0x01a8;
                case 44: goto L_0x01b2;
                case 45: goto L_0x01b9;
                case 46: goto L_0x01c6;
                case 47: goto L_0x01cf;
                case 48: goto L_0x008e;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A02
            r0 = 49
        L_0x000c:
            X.MHP r3 = new X.MHP
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r1, (X.AnonymousClass4D7) r15, (int) r0)
        L_0x0011:
            r3.A03 = r14
            return r3
        L_0x0014:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A02
            r0 = 0
            goto L_0x000c
        L_0x001a:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A02
            r0 = 10
            goto L_0x000c
        L_0x0021:
            java.lang.Object r2 = r13.A02
            java.lang.Object r1 = r13.A01
            r0 = 11
            goto L_0x0088
        L_0x0028:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A02
            r0 = 12
            goto L_0x000c
        L_0x002f:
            java.lang.Object r2 = r13.A02
            java.lang.Object r1 = r13.A01
            r0 = 13
            goto L_0x0088
        L_0x0036:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A02
            r0 = 14
            goto L_0x000c
        L_0x003d:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A02
            r0 = 15
            goto L_0x000c
        L_0x0044:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A02
            r0 = 16
            goto L_0x000c
        L_0x004b:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A02
            r0 = 17
            goto L_0x000c
        L_0x0052:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A02
            r0 = 18
            goto L_0x000c
        L_0x0059:
            java.lang.Object r2 = r13.A02
            java.lang.Object r1 = r13.A01
            r0 = 21
            goto L_0x0088
        L_0x0060:
            java.lang.Object r2 = r13.A02
            X.0r6 r2 = (X.AnonymousClass0r6) r2
            java.lang.Object r1 = r13.A01
            X.0sK r1 = (X.0sK) r1
            r0 = 22
            goto L_0x007c
        L_0x006b:
            java.lang.Object r2 = r13.A02
            java.lang.Object r1 = r13.A01
            r0 = 23
            goto L_0x0088
        L_0x0072:
            java.lang.Object r2 = r13.A01
            X.0r6 r2 = (X.AnonymousClass0r6) r2
            java.lang.Object r1 = r13.A02
            X.0sK r1 = (X.0sK) r1
            r0 = 24
        L_0x007c:
            X.MHP r3 = new X.MHP
            r3.<init>((X.AnonymousClass4D7) r15, (X.0sK) r1, (X.AnonymousClass0r6) r2, (int) r0)
            goto L_0x0011
        L_0x0082:
            java.lang.Object r2 = r13.A02
            java.lang.Object r1 = r13.A01
            r0 = 30
        L_0x0088:
            X.MHP r3 = new X.MHP
            r3.<init>((java.lang.Object) r1, (java.lang.Object) r2, (X.AnonymousClass4D7) r15, (int) r0)
            goto L_0x0011
        L_0x008e:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A02
            r0 = 48
            goto L_0x000c
        L_0x0096:
            java.lang.Object r1 = r13.A03
            r0 = 1
            goto L_0x0102
        L_0x009a:
            java.lang.Object r8 = r13.A03
            java.lang.Object r9 = r13.A02
            java.lang.Object r10 = r13.A01
            r12 = 2
            goto L_0x01d7
        L_0x00a3:
            java.lang.Object r2 = r13.A03
            java.lang.Object r1 = r13.A01
            r0 = 3
            goto L_0x01bf
        L_0x00aa:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A03
            r0 = 4
            goto L_0x016f
        L_0x00b1:
            java.lang.Object r7 = r13.A02
            X.0sK r7 = (X.0sK) r7
            java.lang.Object r4 = r13.A03
            androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r4
            java.lang.Object r5 = r13.A01
            X.GPU r5 = (X.GPU) r5
            r8 = 5
            goto L_0x00da
        L_0x00bf:
            java.lang.Object r7 = r13.A02
            X.0sK r7 = (X.0sK) r7
            java.lang.Object r4 = r13.A03
            androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r4
            java.lang.Object r5 = r13.A01
            X.GPU r5 = (X.GPU) r5
            r8 = 6
            goto L_0x00da
        L_0x00cd:
            java.lang.Object r7 = r13.A01
            X.0sK r7 = (X.0sK) r7
            java.lang.Object r4 = r13.A02
            androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r4
            java.lang.Object r5 = r13.A03
            X.GPU r5 = (X.GPU) r5
            r8 = 7
        L_0x00da:
            X.MHP r3 = new X.MHP
            r3.<init>((androidx.compose.foundation.gestures.PressGestureScopeImpl) r4, (X.GPU) r5, (X.AnonymousClass4D7) r6, (X.0sK) r7, (int) r8)
            return r3
        L_0x00e0:
            java.lang.Object r8 = r13.A03
            java.lang.Object r9 = r13.A02
            java.lang.Object r10 = r13.A01
            r12 = 8
            goto L_0x01d7
        L_0x00ea:
            java.lang.Object r8 = r13.A03
            java.lang.Object r9 = r13.A02
            java.lang.Object r10 = r13.A01
            r12 = 9
            goto L_0x01d7
        L_0x00f4:
            java.lang.Object r9 = r13.A02
            java.lang.Object r8 = r13.A03
            java.lang.Object r10 = r13.A01
            r12 = 19
            goto L_0x01d7
        L_0x00fe:
            java.lang.Object r1 = r13.A03
            r0 = 20
        L_0x0102:
            X.MHP r3 = new X.MHP
            r3.<init>(r1, r15, r0)
            r3.A01 = r14
            return r3
        L_0x010a:
            java.lang.Object r8 = r13.A03
            java.lang.Object r10 = r13.A01
            java.lang.Object r9 = r13.A02
            r12 = 25
            goto L_0x01d7
        L_0x0114:
            java.lang.Object r1 = r13.A03
            r0 = 26
            goto L_0x01ac
        L_0x011a:
            r2 = 0
            java.lang.Object r1 = r13.A03
            r0 = 27
            goto L_0x016f
        L_0x0120:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A03
            r0 = 28
            goto L_0x016f
        L_0x0127:
            java.lang.Object r10 = r13.A01
            java.lang.Object r8 = r13.A03
            java.lang.Object r9 = r13.A02
            r12 = 29
            goto L_0x01d7
        L_0x0131:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A03
            r0 = 31
            X.MHP r3 = A01(r1, r2, r15, r0)
            return r3
        L_0x013c:
            java.lang.Object r10 = r13.A03
            X.4uI r10 = (X.C277014uI) r10
            java.lang.Object r9 = r13.A02
            X.4tV r9 = (X.C276544tV) r9
            int r12 = r13.A00
            java.lang.Object r8 = r13.A01
            X.6Rm r8 = (X.C307786Rm) r8
            X.MHP r3 = new X.MHP
            r7 = r3
            r11 = r15
            r7.<init>((X.C307786Rm) r8, (X.C276544tV) r9, (X.C277014uI) r10, (X.AnonymousClass4D7) r11, (int) r12)
            return r3
        L_0x0152:
            java.lang.Object r2 = r13.A03
            java.lang.Object r1 = r13.A01
            r0 = 33
            goto L_0x01bf
        L_0x0159:
            java.lang.Object r2 = r13.A03
            java.lang.Object r1 = r13.A01
            r0 = 34
            goto L_0x01bf
        L_0x0160:
            java.lang.Object r9 = r13.A02
            java.lang.Object r10 = r13.A01
            java.lang.Object r8 = r13.A03
            r12 = 35
            goto L_0x01d7
        L_0x0169:
            java.lang.Object r2 = r13.A01
            java.lang.Object r1 = r13.A03
            r0 = 36
        L_0x016f:
            X.MHP r3 = A01(r1, r2, r15, r0)
            goto L_0x01c3
        L_0x0174:
            java.lang.Object r10 = r13.A01
            java.lang.Object r8 = r13.A03
            java.lang.Object r9 = r13.A02
            r12 = 37
            goto L_0x01d7
        L_0x017d:
            java.lang.Object r8 = r13.A03
            java.lang.Object r10 = r13.A01
            java.lang.Object r9 = r13.A02
            r12 = 38
            goto L_0x01d7
        L_0x0186:
            java.lang.Object r8 = r13.A03
            java.lang.Object r10 = r13.A01
            java.lang.Object r9 = r13.A02
            r12 = 39
            goto L_0x01d7
        L_0x018f:
            java.lang.Object r2 = r13.A03
            java.lang.Object r1 = r13.A01
            r0 = 40
            goto L_0x01bf
        L_0x0196:
            java.lang.Object r8 = r13.A03
            java.lang.Object r9 = r13.A02
            java.lang.Object r10 = r13.A01
            r12 = 41
            goto L_0x01d7
        L_0x019f:
            java.lang.Object r8 = r13.A03
            java.lang.Object r9 = r13.A02
            java.lang.Object r10 = r13.A01
            r12 = 42
            goto L_0x01d7
        L_0x01a8:
            java.lang.Object r1 = r13.A03
            r0 = 43
        L_0x01ac:
            X.MHP r3 = new X.MHP
            r3.<init>(r1, r15, r0)
            return r3
        L_0x01b2:
            java.lang.Object r2 = r13.A03
            java.lang.Object r1 = r13.A01
            r0 = 44
            goto L_0x01bf
        L_0x01b9:
            java.lang.Object r2 = r13.A03
            java.lang.Object r1 = r13.A01
            r0 = 45
        L_0x01bf:
            X.MHP r3 = A01(r2, r1, r15, r0)
        L_0x01c3:
            r3.A02 = r14
            return r3
        L_0x01c6:
            java.lang.Object r8 = r13.A03
            java.lang.Object r9 = r13.A02
            java.lang.Object r10 = r13.A01
            r12 = 46
            goto L_0x01d7
        L_0x01cf:
            java.lang.Object r9 = r13.A02
            java.lang.Object r8 = r13.A03
            java.lang.Object r10 = r13.A01
            r12 = 47
        L_0x01d7:
            X.MHP r3 = new X.MHP
            r7 = r3
            r11 = r15
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (X.AnonymousClass4D7) r11, (int) r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHP.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v116, resolved type: java.lang.Number} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.MHP, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v47, types: [X.Kp8, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0532, code lost:
        com.facebook.caa.shared.passkey.PasskeyService.A02(r3, r1, r3.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x063d, code lost:
        if (X.AnonymousClass7TE.A1a(r11) != false) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x082b, code lost:
        if (r7.A00 != null) goto L_0x082d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0905, code lost:
        if (r2 != false) goto L_0x0907;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x094b, code lost:
        if (r4 > (r1.A01 + r1.A02)) goto L_0x0907;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0eee, code lost:
        if (r0 != r1) goto L_0x0f60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0f60, code lost:
        r0 = X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0fef, code lost:
        r5 = new X.C289295dM(((X.GPU) r2).A06);
        r0.A00 = r4;
        r0 = r7.invoke(r6, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x1177, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:756:0x1299, code lost:
        X.0eS.A00(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x12bb, code lost:
        if (r0 != r1) goto L_0x1300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:759:0x12bd, code lost:
        return r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x080e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x08cb  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0930 A[LOOP:3: B:386:0x092a->B:388:0x0930, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0af9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0bd1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0ce8  */
    /* JADX WARNING: Removed duplicated region for block: B:764:0x12de  */
    /* JADX WARNING: Removed duplicated region for block: B:775:0x1303  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x027f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r11 = r22
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x128b;
                case 1: goto L_0x1099;
                case 2: goto L_0x106d;
                case 3: goto L_0x1028;
                case 4: goto L_0x1000;
                case 5: goto L_0x0fd6;
                case 6: goto L_0x0fd6;
                case 7: goto L_0x0fbc;
                case 8: goto L_0x0f64;
                case 9: goto L_0x0e95;
                case 10: goto L_0x0e6b;
                case 11: goto L_0x0e43;
                case 12: goto L_0x0e0a;
                case 13: goto L_0x0dda;
                case 14: goto L_0x0db9;
                case 15: goto L_0x0009;
                case 16: goto L_0x0009;
                case 17: goto L_0x0009;
                case 18: goto L_0x0d74;
                case 19: goto L_0x0d2c;
                case 20: goto L_0x0ccc;
                case 21: goto L_0x0ca0;
                case 22: goto L_0x0c71;
                case 23: goto L_0x0c50;
                case 24: goto L_0x0c20;
                case 25: goto L_0x0b65;
                case 26: goto L_0x0a3d;
                case 27: goto L_0x09e1;
                case 28: goto L_0x09b6;
                case 29: goto L_0x0794;
                case 30: goto L_0x076a;
                case 31: goto L_0x0738;
                case 32: goto L_0x0709;
                case 33: goto L_0x067f;
                case 34: goto L_0x115d;
                case 35: goto L_0x062d;
                case 36: goto L_0x05b0;
                case 37: goto L_0x053e;
                case 38: goto L_0x04e6;
                case 39: goto L_0x049d;
                case 40: goto L_0x046e;
                case 41: goto L_0x0440;
                case 42: goto L_0x03eb;
                case 43: goto L_0x031c;
                case 44: goto L_0x02c3;
                case 45: goto L_0x0241;
                case 46: goto L_0x01fd;
                case 47: goto L_0x0037;
                case 48: goto L_0x01d3;
                case 49: goto L_0x01a9;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0017
            if (r2 == r6) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            X.0eS.A00(r11)
            java.lang.Object r2 = r0.A03
            X.4Cq r2 = (X.C262224Cq) r2
            java.lang.Object r5 = r0.A01
            X.0sL r5 = (X.0sL) r5
            java.lang.Object r4 = r0.A02
            X.5Oz r4 = (X.C284945Oz) r4
            X.4Cc r3 = r2.ArX()
            androidx.compose.runtime.ProduceStateScopeImpl r2 = new androidx.compose.runtime.ProduceStateScopeImpl
            r2.<init>(r4, r3)
            r0.A00 = r6
            java.lang.Object r0 = r5.invoke(r2, r0)
            goto L_0x12bb
        L_0x0037:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x018e
            if (r2 != r4) goto L_0x01a4
            X.0eS.A00(r11)
        L_0x0043:
            X.SUj r11 = (X.SUj) r11
            boolean r1 = X.SUj.A0V(r11)
            if (r1 == 0) goto L_0x0148
            java.lang.Object r4 = r0.A03
            com.facebookpay.offsite.base.CheckoutHandler r4 = (com.facebookpay.offsite.base.CheckoutHandler) r4
            X.Til r1 = r4.A0A()
            X.S7g r1 = r1.An6()
            java.lang.Object r3 = r0.A01
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r3 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r3
            r1.A00 = r3
            X.Til r0 = r4.A0A()
            X.S7g r6 = r0.An6()
            java.lang.Object r5 = r11.A01
            X.3lr r5 = (X.C250663lr) r5
            r12 = 0
            if (r5 == 0) goto L_0x0145
            java.lang.Class<X.BXp> r2 = X.C42272BXp.class
            r0 = 4158(0x103e, float:5.827E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -250762031(0xfffffffff10dacd1, float:-7.015409E29)
            X.3lr r1 = r5.A03(r2, r1, r0)
            if (r1 == 0) goto L_0x0145
            java.lang.String r0 = "order_id"
            java.lang.String r0 = r1.A09(r0)
        L_0x0083:
            r6.A07 = r0
            X.Til r0 = r4.A0A()
            X.S7g r0 = r0.An6()
            com.facebookpay.offsite.models.message.PaymentRequest r0 = r0.A03
            com.facebookpay.offsite.models.message.PaymentResponseContent r7 = X.SQ3.A02(r3, r0)
            X.REu r5 = X.C8902REu.CLIENT_LOAD_OFFSITEPAYMENTHANDLED_INIT
            java.util.Map r2 = r4.A0F
            com.facebookpay.offsite.models.message.PaymentContainer r0 = r7.container
            java.lang.String r1 = r0.containerId
            r0 = 575(0x23f, float:8.06E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r1)
            java.util.Map r0 = X.0Yt.A0C(r2, r0)
            java.util.LinkedHashMap r2 = X.0Yt.A03(r0)
            com.facebookpay.offsite.models.message.PaymentContainer r0 = r7.container
            com.facebookpay.offsite.models.message.PaymentContainerType r0 = r0.containerType
            if (r0 == 0) goto L_0x00c0
            java.lang.String r1 = r0.getType()
            r0 = 441(0x1b9, float:6.18E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.put(r0, r1)
        L_0x00c0:
            r4.A0H(r5, r2)
            com.facebookpay.offsite.models.message.PaymentContainer r0 = r7.container
            com.facebookpay.offsite.models.message.PaymentContainerType r1 = r0.containerType
            com.facebookpay.offsite.models.message.PaymentContainerType r0 = com.facebookpay.offsite.models.message.PaymentContainerType.PAYPAL_OTC_V1
            if (r1 == r0) goto L_0x00d5
            X.Til r0 = r4.A0A()
            boolean r0 = r0.C2I()
            if (r0 == 0) goto L_0x00f0
        L_0x00d5:
            java.lang.String r2 = r4.A09
            if (r2 == 0) goto L_0x00f0
            X.SSt r1 = X.C11418SSt.A01
            X.Til r0 = r4.A0A()
            java.lang.String r0 = r0.getProductId()
            java.util.LinkedHashMap r1 = r1.A04(r3, r0, r2, r12)
            r0 = 893(0x37d, float:1.251E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            com.facebookpay.offsite.base.CheckoutHandler.A06(r4, r0, r1)
        L_0x00f0:
            X.Til r0 = r4.A0A()
            boolean r0 = r0.C2I()
            if (r0 == 0) goto L_0x0116
            X.2Fj r0 = r4.A0Q
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.Til r1 = r4.A0A()
            X.S7g r1 = r1.An6()
            java.lang.String r2 = r1.A07
            com.facebookpay.expresscheckout.models.PaymentHandledResponseData r1 = new com.facebookpay.expresscheckout.models.PaymentHandledResponseData
            r1.<init>(r3, r2)
            X.SUj r1 = X.SUj.A09(r1)
        L_0x0111:
            r0.A0B(r1)
            goto L_0x1300
        L_0x0116:
            X.2Fj r0 = r4.A0P
            java.util.concurrent.atomic.AtomicLong r1 = X.C12435SuM.A09
            long r1 = r1.getAndIncrement()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.String r6 = r4.A0B
            if (r6 != 0) goto L_0x0128
            java.lang.String r6 = ""
        L_0x0128:
            long r8 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicReference r1 = r4.A0V
            java.lang.Object r10 = r1.get()
            java.lang.String r10 = (java.lang.String) r10
            r1 = 832(0x340, float:1.166E-42)
            java.lang.String r11 = X.Pxd.A00(r1)
            com.facebookpay.offsite.models.message.PaymentResponse r4 = new com.facebookpay.offsite.models.message.PaymentResponse
            r4.<init>(r5, r6, r7, r8, r10, r11, r12)
            com.facebookpay.offsite.models.message.PaymentResponseWithAdditionalData r1 = new com.facebookpay.offsite.models.message.PaymentResponseWithAdditionalData
            r1.<init>(r4, r12)
            goto L_0x0111
        L_0x0145:
            r0 = r12
            goto L_0x0083
        L_0x0148:
            boolean r1 = X.SUj.A0S(r11)
            if (r1 == 0) goto L_0x1300
            java.lang.Object r0 = r0.A03
            com.facebookpay.offsite.base.CheckoutHandler r0 = (com.facebookpay.offsite.base.CheckoutHandler) r0
            X.Q6J r3 = r0.A04
            if (r3 == 0) goto L_0x1300
            X.2Fj r0 = r0.A0Q
            java.lang.Integer r2 = X.AnonymousClass05K.A03
            r1 = 2131961294(0x7f1325ce, float:1.955928E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r3, r1)
            r4 = 0
            java.lang.String r13 = X.C9651ReV.A00(r3, r2, r4, r4)
            r1 = 2131961292(0x7f1325cc, float:1.9559277E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r1)
            X.RFe r1 = X.C8911RFe.A05
            X.RGf r1 = r1.A01
            X.RuV r6 = new X.RuV
            r6.<init>(r1, r2, r4)
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            com.facebookpay.common.models.ErrorDialogContent r3 = new com.facebookpay.common.models.ErrorDialogContent
            r5 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.TQm r2 = new X.TQm
            r2.<init>(r3)
            X.0gF r1 = X.C60340gF.A00
            X.SUj r1 = X.SUj.A0A(r1, r2)
            goto L_0x0111
        L_0x018e:
            X.0eS.A00(r11)
            X.SOm r2 = X.AnonymousClass2E0.A01()
            com.facebookpay.offsite.repositoriesimpl.OffsitePaymentRepositoryImpl r3 = r2.A0C
            java.lang.Object r2 = r0.A02
            X.QNI r2 = (X.QNI) r2
            r0.A00 = r4
            java.lang.Object r11 = r3.A01(r2, r0)
            if (r11 != r1) goto L_0x0043
            return r1
        L_0x01a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01a9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x01b7
            if (r2 == r7) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01b7:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            X.6FR r6 = (X.AnonymousClass6FR) r6
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A02
            r2 = 13
            X.J6l r3 = new X.J6l
            r3.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r4)
            r0.A00 = r7
            X.0sK r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A05(r6, r0, r3, r2)
            goto L_0x12bb
        L_0x01d3:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x01e1
            if (r2 == r7) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01e1:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            X.6FR r6 = (X.AnonymousClass6FR) r6
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A02
            r2 = 8
            X.J6l r3 = new X.J6l
            r3.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r4)
            r0.A00 = r7
            X.0sK r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A05(r6, r0, r3, r2)
            goto L_0x12bb
        L_0x01fd:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x020b
            if (r2 == r7) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x020b:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            X.LOU r6 = (X.LOU) r6
            X.LNn r3 = r6.A02
            java.lang.Object r4 = r0.A02
            r2 = 0
            X.0qQ.A0B(r4, r2)
            java.util.Map r3 = r3.A00
            java.lang.Object r2 = r3.get(r4)
            if (r2 != 0) goto L_0x0229
            X.02z r2 = X.C51967G9n.A0u()
            r3.put(r4, r2)
        L_0x0229:
            X.0r6 r2 = (X.AnonymousClass0r6) r2
            X.0qC r5 = new X.0qC
            r5.<init>(r2)
            java.lang.Object r4 = r0.A01
            r3 = 11
            X.MCn r2 = new X.MCn
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r6)
            r0.A00 = r7
            java.lang.Object r0 = r5.collect(r2, r0)
            goto L_0x12bb
        L_0x0241:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r10 = 1
            if (r2 == 0) goto L_0x02b6
            if (r2 != r10) goto L_0x02be
            java.lang.Object r2 = r0.A02
            X.4Cq r2 = X.JTO.A1D(r2, r11)
        L_0x0250:
            java.lang.Object r3 = r0.A01
            java.lang.Object r3 = X.DbT.A0r(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x02af
            java.lang.Object r11 = r0.A03
            X.LGZ r11 = (X.LGZ) r11
            long r5 = r3.longValue()
            long r3 = java.lang.System.currentTimeMillis()
            r8 = 0
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0294
            X.8j2 r7 = X.C363058j1.A02
            java.lang.String r4 = "sup:SUPMediaStreamLatencyManager"
            java.lang.String r3 = "Invalid latency value "
            java.lang.String r3 = X.002.A0Q(r3, r5)
        L_0x0276:
            r7.A01(r4, r3)
        L_0x0279:
            boolean r3 = X.19E.A07(r2)
            if (r3 == 0) goto L_0x1300
            java.lang.Object r3 = r0.A03
            X.LGZ r3 = (X.LGZ) r3
            double r5 = r3.A00
            long r3 = (long) r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.A02 = r2
            r0.A00 = r10
            java.lang.Object r3 = X.C241603Pv.A01(r0, r3)
            if (r3 != r1) goto L_0x0250
            return r1
        L_0x0294:
            boolean r7 = r11.A04()
            if (r7 == 0) goto L_0x029d
            r11.A01()
        L_0x029d:
            boolean r7 = r11.A05()
            if (r7 != 0) goto L_0x02a9
            long r7 = r11.A01
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0279
        L_0x02a9:
            r11.A02(r5, r3)
            r11.A01 = r5
            goto L_0x0279
        L_0x02af:
            X.8j2 r7 = X.C363058j1.A02
            java.lang.String r4 = "sup:SUPMediaStreamLatencyManager"
            java.lang.String r3 = "Could not obtain latency info, callback invocation null"
            goto L_0x0276
        L_0x02b6:
            X.0eS.A00(r11)
            java.lang.Object r2 = r0.A02
            X.4Cq r2 = (X.C262224Cq) r2
            goto L_0x0279
        L_0x02be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02c3:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            r6 = 0
            if (r2 == 0) goto L_0x02ee
            if (r2 != r7) goto L_0x0317
            X.0eS.A00(r11)
        L_0x02d0:
            X.OWb r3 = X.C71004OWb.A00
            java.lang.String r2 = "SessionAudioLevelsProvider"
            java.lang.String r1 = "Call ended. Stopping audio level updates."
            r3.A00(r2, r1)
            java.lang.Object r1 = r0.A03
            X.LB4 r1 = (X.LB4) r1
            r1.A02 = r6
            java.lang.Object r0 = r0.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r0 = r0.A00
            X.4Co r0 = (X.C262204Co) r0
            if (r0 == 0) goto L_0x1300
            r0.AG7(r6)
            goto L_0x1300
        L_0x02ee:
            X.0eS.A00(r11)
            java.lang.Object r5 = r0.A02
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r4 = r0.A03
            X.LB4 r4 = (X.LB4) r4
            r3 = 30
            X.JTh r2 = new X.JTh
            r2.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r6, (int) r3)
            X.AnonymousClass7TE.A1Z(r2, r5)
            X.NCY r2 = r4.A05
            java.lang.String r8 = r2.A05
            X.PnL r10 = X.C73994PnL.A00
            X.MNJ r11 = X.MNJ.A00
            r12 = -9223372036854775808
            r0.A00 = r7
            r9 = r0
            java.lang.Object r2 = X.OOX.A00(r8, r9, r10, r11, r12)
            if (r2 != r1) goto L_0x02d0
            return r1
        L_0x0317:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x031c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 2
            r8 = 1
            if (r2 == 0) goto L_0x0370
            if (r2 == r8) goto L_0x0382
            if (r2 != r5) goto L_0x03e6
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r6 = r0.A01
            X.SGo r6 = (X.C11230SGo) r6
            X.0eS.A00(r11)
        L_0x0333:
            X.0eP r11 = (X.0eP) r11
            java.lang.Object r7 = r11.A00
            X.SGo r7 = (X.C11230SGo) r7
            java.lang.Object r1 = r11.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r0.A03
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r5 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro) r5
            java.util.List r9 = com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A03(r4)
            java.util.List r0 = com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A03(r1)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0351:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03a2
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.android.billingclient.api.Purchase r0 = (com.android.billingclient.api.Purchase) r0
            org.json.JSONObject r1 = r0.A02
            r0 = 623(0x26f, float:8.73E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.optBoolean(r0, r8)
            if (r0 != 0) goto L_0x0351
            r4.add(r2)
            goto L_0x0351
        L_0x0370:
            X.0eS.A00(r11)
            java.lang.Object r3 = r0.A03
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r3 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro) r3
            r0.A00 = r8
            java.lang.String r2 = "inapp"
            java.lang.Object r11 = com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A02(r3, r2, r0, r8)
            if (r11 != r1) goto L_0x0385
            return r1
        L_0x0382:
            X.0eS.A00(r11)
        L_0x0385:
            X.0eP r11 = (X.0eP) r11
            java.lang.Object r6 = r11.A00
            X.SGo r6 = (X.C11230SGo) r6
            java.lang.Object r4 = r11.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r0.A03
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r3 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro) r3
            r0.A01 = r6
            r0.A02 = r4
            r0.A00 = r5
            java.lang.String r2 = "subs"
            java.lang.Object r11 = com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A02(r3, r2, r0, r8)
            if (r11 != r1) goto L_0x0333
            return r1
        L_0x03a2:
            java.util.ArrayList r4 = X.00k.A0S(r4, r9)
            X.SPQ r0 = r5.A06
            java.util.LinkedHashMap r1 = X.SPQ.A01(r4)
            X.TjB r3 = r0.A00
            r0 = 668(0x29c, float:9.36E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2 = 0
            r3.Cgp(r2, r1, r0)
            int r0 = r6.A00
            if (r0 != 0) goto L_0x03df
            int r0 = r7.A00
            if (r0 != 0) goto L_0x03df
            java.util.LinkedHashMap r1 = X.SPQ.A00(r6, r4)
            r0 = 669(0x29d, float:9.37E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r3.Cgp(r1, r2, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x03da
            X.RFl r0 = X.C8918RFl.SUCCESSFUL
            r5.A0J(r0, r2, r2)
            goto L_0x1300
        L_0x03da:
            r5.A0K(r4)
            goto L_0x1300
        L_0x03df:
            X.RFl r0 = X.C8918RFl.IAB_PRODUCT_FETCH_FAILED
            r5.A0J(r0, r4, r2)
            goto L_0x1300
        L_0x03e6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03eb:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r5 = 2
            r2 = 1
            if (r3 == 0) goto L_0x03fd
            if (r3 == r2) goto L_0x041b
            if (r3 != r5) goto L_0x03f8
            goto L_0x0415
        L_0x03f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03fd:
            X.0eS.A00(r11)
            java.lang.Object r4 = r0.A03     // Catch:{ all -> 0x0431 }
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r4 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro) r4
            java.lang.Object r3 = r0.A02     // Catch:{ all -> 0x0431 }
            X.QOs r3 = (X.C7610QOs) r3     // Catch:{ all -> 0x0431 }
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x0431 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x0431 }
            r0.A00 = r5     // Catch:{ all -> 0x0431 }
            java.lang.Object r11 = r4.A0F(r3, r2, r0)     // Catch:{ all -> 0x0431 }
            if (r11 != r1) goto L_0x0418
            return r1
        L_0x0415:
            X.0eS.A00(r11)     // Catch:{ all -> 0x0431 }
        L_0x0418:
            X.0eP r11 = (X.0eP) r11     // Catch:{ all -> 0x0431 }
            goto L_0x0420
        L_0x041b:
            X.0eS.A00(r11)     // Catch:{ all -> 0x0431 }
            X.0eP r11 = (X.0eP) r11     // Catch:{ all -> 0x0431 }
        L_0x0420:
            java.lang.Object r3 = r11.A00     // Catch:{ all -> 0x0431 }
            X.QOs r3 = (X.C7610QOs) r3     // Catch:{ all -> 0x0431 }
            java.lang.Object r2 = r11.A01     // Catch:{ all -> 0x0431 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x0431 }
            java.lang.Object r1 = r0.A03     // Catch:{ all -> 0x0431 }
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r1 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro) r1     // Catch:{ all -> 0x0431 }
            r1.A0I(r3, r2)     // Catch:{ all -> 0x0431 }
            goto L_0x1300
        L_0x0431:
            java.lang.Object r0 = r0.A03
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r0 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro) r0
            X.Tfb r1 = r0.A01
            if (r1 == 0) goto L_0x1300
            X.RFl r0 = X.C8918RFl.SERVER_QUOTING_FAILED
            r1.Db0(r0)
            goto L_0x1300
        L_0x0440:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x044e
            if (r3 == r2) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x044e:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A03
            java.lang.Object r6 = r0.A02
            X.07Z r6 = (X.AnonymousClass07Z) r6
            java.lang.Object r5 = r0.A01
            r0.A00 = r2
            X.07U r4 = X.07U.A05
            r3 = 0
            r0 = 12
            X.JTi r2 = new X.JTi
            r2.<init>(r5, r7, r3, r0)
            X.19B r0 = X.19B.A00
            X.C63499KyA.A00(r4, r6, r0, r2)
            X.0gF r0 = X.C60340gF.A00
            goto L_0x12bb
        L_0x046e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x047c
            if (r2 == r5) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x047c:
            X.0eS.A00(r11)
            java.lang.Object r3 = r0.A02
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r2 = r3 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x1300
            java.lang.Object r4 = r0.A03
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r4 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r4
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r3 = r3.A00
            X.0k0 r3 = (X.0k0) r3
            java.lang.Object r2 = r0.A01
            X.0sL r2 = (X.0sL) r2
            r0.A00 = r5
            java.lang.Object r0 = com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper.A01(r4, r3, r0, r2)
            goto L_0x12bb
        L_0x049d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x04c8
            if (r2 != r7) goto L_0x04e1
            X.0eS.A00(r11)
        L_0x04a9:
            X.QAj r11 = (X.C7382QAj) r11
            if (r11 == 0) goto L_0x1300
            java.lang.Object r3 = r0.A03
            com.facebook.caa.shared.passkey.PasskeyService r3 = (com.facebook.caa.shared.passkey.PasskeyService) r3
            java.lang.String r0 = r11.A00
            com.facebook.caa.shared.passkey.PasskeyService.A04(r3, r0)
            X.6Tm r1 = com.facebook.caa.shared.passkey.PasskeyService.A00(r3, r0)
            if (r1 != 0) goto L_0x0532
            java.lang.String r1 = "Passkey callback arguments malformed"
            X.Kkd r0 = new X.Kkd
            r0.<init>(r1)
            com.facebook.caa.shared.passkey.PasskeyService.A03(r3, r0)
            goto L_0x1300
        L_0x04c8:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            com.facebook.caa.shared.passkey.PasskeyService r6 = (com.facebook.caa.shared.passkey.PasskeyService) r6
            java.lang.Object r5 = r0.A02
            r4 = 0
            r3 = 2
            X.GPB r2 = new X.GPB
            r2.<init>(r6, r5, r4, r3)
            r0.A00 = r7
            java.lang.Object r11 = com.facebook.caa.shared.passkey.PasskeyService.A01(r6, r0, r2)
            if (r11 != r1) goto L_0x04a9
            return r1
        L_0x04e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04e6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x051a
            if (r2 != r6) goto L_0x0539
            X.0eS.A00(r11)
        L_0x04f2:
            X.RnL r11 = (X.C10144RnL) r11
            if (r11 == 0) goto L_0x1300
            X.RnK r2 = r11.A00
            java.lang.String r1 = "null cannot be cast to non-null type androidx.credentials.PublicKeyCredential"
            X.0qQ.A0C(r2, r1)
            X.QAl r2 = (X.C7384QAl) r2
            java.lang.Object r3 = r0.A03
            com.facebook.caa.shared.passkey.PasskeyService r3 = (com.facebook.caa.shared.passkey.PasskeyService) r3
            java.lang.String r0 = r2.A00
            com.facebook.caa.shared.passkey.PasskeyService.A04(r3, r0)
            X.6Tm r1 = com.facebook.caa.shared.passkey.PasskeyService.A00(r3, r0)
            if (r1 != 0) goto L_0x0532
            java.lang.String r1 = "Passkey callback arguments malformed"
            X.Kkd r0 = new X.Kkd
            r0.<init>(r1)
            com.facebook.caa.shared.passkey.PasskeyService.A03(r3, r0)
            goto L_0x1300
        L_0x051a:
            X.0eS.A00(r11)
            java.lang.Object r5 = r0.A03
            com.facebook.caa.shared.passkey.PasskeyService r5 = (com.facebook.caa.shared.passkey.PasskeyService) r5
            java.lang.Object r4 = r0.A02
            r3 = 0
            X.GPB r2 = new X.GPB
            r2.<init>(r5, r4, r3, r6)
            r0.A00 = r6
            java.lang.Object r11 = com.facebook.caa.shared.passkey.PasskeyService.A01(r5, r0, r2)
            if (r11 != r1) goto L_0x04f2
            return r1
        L_0x0532:
            X.4uI r0 = r3.A05
            com.facebook.caa.shared.passkey.PasskeyService.A02(r3, r1, r0)
            goto L_0x1300
        L_0x0539:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x053e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x058e
            if (r2 != r6) goto L_0x05ab
            X.0eS.A00(r11)
        L_0x054a:
            java.lang.Object r1 = r0.A03
            X.QLA r1 = (X.QLA) r1
            if (r1 == 0) goto L_0x058c
            X.Q8n r1 = r1.A04()
        L_0x0554:
            java.lang.Object r3 = r0.A02
            java.util.concurrent.CompletableFuture r3 = (java.util.concurrent.CompletableFuture) r3
            r2 = 0
            if (r1 == 0) goto L_0x056d
            java.util.List r0 = r1.A0A
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            if (r1 == 0) goto L_0x056d
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0576
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0576
        L_0x056d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.complete(r0)
            goto L_0x1300
        L_0x0576:
            java.util.Iterator r1 = r1.iterator()
        L_0x057a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x056d
            java.lang.Object r0 = r1.next()
            X.Q8n r0 = (X.Q8n) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x057a
            r2 = 1
            goto L_0x056d
        L_0x058c:
            r1 = 0
            goto L_0x0554
        L_0x058e:
            X.0eS.A00(r11)
            java.lang.Object r2 = r0.A01
            X.1yd r2 = (X.1yd) r2
            com.instagram.common.session.UserSession r5 = r2.A00
            X.0Tu r4 = X.0Tu.A06
            r2 = 36604335527695401(0x820b73005e1429, double:3.212067409318534E-306)
            long r2 = X.182.A01(r4, r5, r2)
            r0.A00 = r6
            java.lang.Object r2 = X.C241603Pv.A01(r0, r2)
            if (r2 != r1) goto L_0x054a
            return r1
        L_0x05ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05b0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x05c1
            if (r2 == r6) goto L_0x1299
            if (r2 == r5) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05c1:
            X.0eS.A00(r11)
            java.lang.Object r2 = r0.A02
            X.4Cq r2 = (X.C262224Cq) r2
            X.4Cc r3 = r2.ArX()
            X.12d r2 = X.C262104Cd.A00
            r3.get(r2)
            java.lang.Object r7 = r0.A01
            X.Kl0 r7 = (X.C62700Kl0) r7
            boolean r2 = r7 instanceof X.C60802JrX
            if (r2 == 0) goto L_0x05fe
            java.lang.Object r5 = r0.A03
            com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler r5 = (com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler) r5
            X.JrX r7 = (X.C60802JrX) r7
            com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper r2 = r7.A00
            r5.A01 = r2
            com.facebook.quicklog.QuickPerformanceLogger r4 = r5.A07
            r3 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r2 = "avatar_download_end"
            r4.markerPoint(r3, r2)
            boolean r2 = r7.A02
            if (r2 == 0) goto L_0x05f6
            java.lang.String r2 = "avatar_cache"
            r4.markerAnnotate(r3, r2, r6)
        L_0x05f6:
            r0.A00 = r6
            java.lang.Object r0 = com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler.A01(r5, r0)
            goto L_0x12bb
        L_0x05fe:
            boolean r2 = r7 instanceof X.C60801JrW
            if (r2 == 0) goto L_0x1300
            java.lang.Object r6 = r0.A03
            com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler r6 = (com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler) r6
            X.JrW r7 = (X.C60801JrW) r7
            java.lang.Integer r4 = r7.A00
            java.lang.String r3 = r7.A01
            r0.A00 = r5
            java.lang.String r2 = "ODRCDLHandler"
            X.0KC.A0C(r2, r3)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            if (r4 == 0) goto L_0x062a
            java.lang.Integer r5 = X.AnonymousClass05K.A1F
            java.lang.String r2 = "cdl_error"
        L_0x061b:
            X.0sK r4 = r6.A09
            X.JrG r3 = new X.JrG
            r3.<init>(r2, r5)
            X.JrI r2 = r6.A00
            java.lang.Object r0 = r4.invoke(r3, r2, r0)
            goto L_0x0eee
        L_0x062a:
            java.lang.String r2 = ""
            goto L_0x061b
        L_0x062d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0658
            if (r2 != r4) goto L_0x067a
            X.0eS.A00(r11)
        L_0x0639:
            boolean r1 = X.AnonymousClass7TE.A1a(r11)
            if (r1 == 0) goto L_0x0678
        L_0x063f:
            java.lang.Object r3 = r0.A02
            java.io.File r3 = (java.io.File) r3
            java.lang.String r2 = ""
            java.nio.charset.Charset r1 = X.AnonymousClass15Q.A05
            X.C272134kB.A01(r3, r2, r1)
            java.lang.Object r0 = r0.A03
            java.lang.String r0 = X.DbT.A10(r0)
            X.C272134kB.A01(r3, r0, r1)
        L_0x0653:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            return r1
        L_0x0658:
            X.0eS.A00(r11)
            java.lang.Object r3 = r0.A02
            java.io.File r3 = (java.io.File) r3
            boolean r2 = r3.exists()
            if (r2 != 0) goto L_0x063f
            boolean r2 = r3.exists()
            if (r2 != 0) goto L_0x0678
            java.lang.Object r2 = r0.A01
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r2 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r2
            r0.A00 = r4
            java.lang.Object r11 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A00(r2, r3, r0)
            if (r11 != r1) goto L_0x0639
            return r1
        L_0x0678:
            r4 = 0
            goto L_0x0653
        L_0x067a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x067f:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 3
            r8 = 2
            r10 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0694
            if (r2 == r10) goto L_0x1299
            if (r2 == r8) goto L_0x06ef
            if (r2 == r7) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0694:
            X.0eS.A00(r11)
            java.lang.Object r4 = r0.A02
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r9 = r0.A03
            com.facebook.avatar.expresso.instagram.ExpressoImpl r9 = (com.facebook.avatar.expresso.instagram.ExpressoImpl) r9
            java.util.HashMap r3 = r9.A02
            boolean r2 = r3.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x06cb
            X.0V2 r5 = r9.A09
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r3)
            java.lang.Object r4 = X.C51971G9r.A0p(r2)
            if (r4 == 0) goto L_0x06c6
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.JrD r2 = new X.JrD
            r2.<init>(r4, r3)
            r0.A00 = r10
            java.lang.Object r0 = r5.emit(r2, r0)
            goto L_0x12bb
        L_0x06c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x06cb:
            java.lang.Object r5 = r0.A01
            X.LOq r5 = (X.C64122LOq) r5
            r3 = 43
            X.MH2 r2 = new X.MH2
            r2.<init>((java.lang.Object) r9, (java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r3)
            X.1Er r4 = X.C51966G9m.A1L(r2, r4)
            X.0eM r2 = r9.A07
            java.lang.Object r3 = r2.getValue()
            com.facebook.avatar.expresso.odr.ODRController r3 = (com.facebook.avatar.expresso.odr.ODRController) r3
            java.lang.String r2 = r5.A00
            r0.A02 = r4
            r0.A00 = r8
            java.lang.Object r11 = r3.A0B(r2, r0)
            if (r11 != r1) goto L_0x06f6
            return r1
        L_0x06ef:
            java.lang.Object r4 = r0.A02
            X.4Co r4 = (X.C262204Co) r4
            X.0eS.A00(r11)
        L_0x06f6:
            boolean r2 = X.AnonymousClass7TE.A1a(r11)
            if (r2 == 0) goto L_0x1300
            r0.A02 = r6
            r0.A00 = r7
            r4.AG7(r6)
            java.lang.Object r0 = r4.CfH(r0)
            goto L_0x0eee
        L_0x0709:
            X.0eS.A00(r11)
            java.lang.Object r5 = r0.A03
            X.4uI r5 = (X.C277014uI) r5
            if (r5 == 0) goto L_0x1300
            java.lang.Object r4 = r0.A02
            X.4tV r4 = (X.C276544tV) r4
            X.6Tl r3 = new X.6Tl
            r3.<init>()
            int r1 = r0.A00
            float r2 = (float) r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r1
            java.lang.Float r1 = X.C51965G9l.A0q(r2)
            r3.A01(r1)
            java.lang.Object r1 = r0.A01
            X.6Rm r1 = (X.C307786Rm) r1
            r3.A02(r1)
            X.6Tm r0 = r3.A00()
            X.C307886Rw.A03(r1, r4, r0, r5)
            goto L_0x1300
        L_0x0738:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x074f
            if (r2 != r4) goto L_0x0765
            java.lang.Object r3 = r0.A02
            X.T0V r3 = (X.T0V) r3
            X.0eS.A00(r11)
        L_0x0748:
            X.39x r0 = r3.A00
            r0.A07(r11)
            goto L_0x1300
        L_0x074f:
            X.0eS.A00(r11)
            java.lang.Object r3 = r0.A01
            X.T0V r3 = (X.T0V) r3
            java.lang.Object r2 = r0.A03
            androidx.work.CoroutineWorker r2 = (androidx.work.CoroutineWorker) r2
            r0.A02 = r3
            r0.A00 = r4
            java.lang.Object r11 = r2.A04(r0)
            if (r11 != r1) goto L_0x0748
            return r1
        L_0x0765:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x076a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0778
            if (r2 == r5) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0778:
            X.0eS.A00(r11)
            java.lang.Object r4 = r0.A03
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r2 = r0.A02
            X.3jv r2 = (X.C249523jv) r2
            androidx.paging.SimpleProducerScopeImpl r3 = new androidx.paging.SimpleProducerScopeImpl
            r3.<init>(r4, r2)
            java.lang.Object r2 = r0.A01
            X.0sL r2 = (X.0sL) r2
            r0.A00 = r5
            java.lang.Object r0 = r2.invoke(r3, r0)
            goto L_0x12bb
        L_0x0794:
            X.1Hj r1 = X.1Hj.A02
            int r5 = r0.A00
            r9 = 3
            r4 = 2
            r2 = 1
            r3 = 0
            if (r5 == 0) goto L_0x07da
            if (r5 == r2) goto L_0x086b
            if (r5 == r4) goto L_0x086b
            if (r5 != r9) goto L_0x0866
            X.0eS.A00(r11)
        L_0x07a7:
            java.lang.Object r9 = r0.A03
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r9 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r9
            X.La7 r11 = r9.A01
            java.lang.Object r8 = r0.A01
            X.Kou r8 = (X.C62942Kou) r8
            X.LFe r7 = r9.A05
            X.0qQ.A0B(r8, r3)
            X.0qQ.A0B(r7, r2)
            boolean r6 = r8 instanceof androidx.paging.PageEvent$Insert
            if (r6 == 0) goto L_0x084f
            r5 = r8
            androidx.paging.PageEvent$Insert r5 = (androidx.paging.PageEvent$Insert) r5
            java.util.List r13 = r5.A05
            java.util.Iterator r10 = r13.iterator()
            r12 = 0
        L_0x07c7:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0870
            java.lang.Object r1 = r10.next()
            X.LRX r1 = (X.LRX) r1
            java.util.List r1 = r1.A01
            int r12 = X.DbT.A01(r1, r12)
            goto L_0x07c7
        L_0x07da:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A01
            X.Kou r7 = (X.C62942Kou) r7
            boolean r5 = r7 instanceof androidx.paging.PageEvent$Insert
            if (r5 == 0) goto L_0x080f
            r8 = r7
            androidx.paging.PageEvent$Insert r8 = (androidx.paging.PageEvent$Insert) r8
            X.Kfy r6 = r8.A04
            X.Kfy r5 = X.C62448Kfy.REFRESH
            if (r6 != r5) goto L_0x080f
            java.lang.Object r7 = r0.A03
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r7 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r7
            java.util.List r11 = r8.A05
            int r5 = r8.A01
            int r4 = r8.A00
            X.LP3 r9 = r8.A03
            X.LP3 r10 = r8.A02
            java.lang.Object r3 = r0.A02
            X.Hzs r3 = (X.C56521Hzs) r3
            X.MRP r8 = r3.A00
            r0.A00 = r2
            r12 = r0
            r13 = r5
            r14 = r4
            r15 = r2
            java.lang.Object r2 = androidx.paging.AsyncPagingDataDiffer$differBase$1.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x080c:
            if (r2 != r1) goto L_0x0916
            return r1
        L_0x080f:
            boolean r5 = r7 instanceof androidx.paging.PageEvent$StaticList
            java.lang.Object r6 = r0.A03
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r6 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r6
            if (r5 == 0) goto L_0x0840
            androidx.paging.PageEvent$StaticList r7 = (androidx.paging.PageEvent$StaticList) r7
            java.util.List r5 = r7.A02
            X.LRX r2 = new X.LRX
            r2.<init>(r3, r5)
            java.util.List r10 = X.AnonymousClass7TE.A1I(r2)
            X.LP3 r8 = r7.A01
            if (r8 != 0) goto L_0x082d
            X.LP3 r2 = r7.A00
            r14 = 0
            if (r2 == 0) goto L_0x082e
        L_0x082d:
            r14 = 1
        L_0x082e:
            X.LP3 r9 = r7.A00
            java.lang.Object r2 = r0.A02
            X.Hzs r2 = (X.C56521Hzs) r2
            X.MRP r7 = r2.A00
            r0.A00 = r4
            r11 = r0
            r12 = r3
            r13 = r3
            java.lang.Object r2 = androidx.paging.AsyncPagingDataDiffer$differBase$1.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x080c
        L_0x0840:
            androidx.paging.AsyncPagingDataDiffer r5 = r6.A0D
            boolean r5 = r5.A00
            if (r5 == 0) goto L_0x07a7
            r0.A00 = r9
            java.lang.Object r5 = X.AnonymousClass1Wu.A00(r0)
            if (r5 != r1) goto L_0x07a7
            return r1
        L_0x084f:
            boolean r1 = r8 instanceof X.C60335Jje
            if (r1 == 0) goto L_0x085b
            r1 = r8
            X.Jje r1 = (X.C60335Jje) r1
            X.LP3 r10 = r1.A01
            X.LP3 r5 = r1.A00
            goto L_0x08b8
        L_0x085b:
            boolean r1 = r8 instanceof androidx.paging.PageEvent$StaticList
            if (r1 == 0) goto L_0x08c9
            java.lang.String r0 = "Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0866:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x086b:
            X.0eS.A00(r11)
            goto L_0x0916
        L_0x0870:
            int r16 = r11.getSize()
            X.Kfy r1 = r5.A04
            int r1 = r1.ordinal()
            if (r1 == r3) goto L_0x09af
            if (r1 == r2) goto L_0x0975
            if (r1 != r4) goto L_0x08b4
            int r1 = r11.A00
            int r14 = java.lang.Math.min(r1, r12)
            int r10 = r11.A01
            int r1 = r11.A02
            int r10 = r10 + r1
            int r4 = r12 - r14
            int r2 = r10 + r14
            java.util.List r15 = r11.A03
            int r1 = r15.size()
            r15.addAll(r1, r13)
            int r1 = r11.A02
            int r1 = r1 + r12
            r11.A02 = r1
            int r1 = r5.A00
            r11.A00 = r1
            r7.A00(r10, r14)
            r7.A01(r2, r4)
            int r2 = r11.getSize()
            int r1 = r2 - r16
            int r1 = r1 - r4
            if (r1 <= 0) goto L_0x096d
            int r2 = r2 - r1
            r7.A01(r2, r1)
        L_0x08b4:
            X.LP3 r10 = r5.A03
            X.LP3 r5 = r5.A02
        L_0x08b8:
            X.0qQ.A0B(r10, r3)
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r1 = r7.A00
            X.LQS r4 = r1.A04
            r2 = 16
            X.Iwy r1 = new X.Iwy
            r1.<init>(r2, r5, r4, r10)
            X.LQS.A01(r4, r1)
        L_0x08c9:
            if (r6 == 0) goto L_0x0916
            X.LQS r1 = r9.A04
            X.0Ud r1 = r1.A02
            java.lang.Object r1 = r1.getValue()
            X.LFx r1 = (X.C63970LFx) r1
            if (r1 == 0) goto L_0x09a8
            X.LP3 r2 = r1.A04
            X.KzI r1 = r2.A01
            boolean r5 = r1.A00
            X.KzI r1 = r2.A00
            boolean r4 = r1.A00
            androidx.paging.PageEvent$Insert r8 = (androidx.paging.PageEvent$Insert) r8
            X.Kfy r2 = r8.A04
            X.Kfy r1 = X.C62448Kfy.PREPEND
            if (r2 != r1) goto L_0x08eb
            if (r5 != 0) goto L_0x096b
        L_0x08eb:
            X.Kfy r1 = X.C62448Kfy.APPEND
            if (r2 != r1) goto L_0x08f1
            if (r4 != 0) goto L_0x096b
        L_0x08f1:
            r4 = 1
        L_0x08f2:
            java.util.List r2 = r8.A05
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0951
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0951
        L_0x08fe:
            r2 = 1
        L_0x08ff:
            if (r4 == 0) goto L_0x094e
            boolean r1 = r9.A0C
            if (r1 != 0) goto L_0x0938
            if (r2 == 0) goto L_0x0916
        L_0x0907:
            X.MRP r3 = r9.A00
            if (r3 == 0) goto L_0x0916
            X.La7 r2 = r9.A01
            int r1 = r9.A0B
            X.Jjz r1 = r2.A02(r1)
            r3.A78(r1)
        L_0x0916:
            java.lang.Object r2 = r0.A01
            boolean r1 = r2 instanceof androidx.paging.PageEvent$Insert
            if (r1 != 0) goto L_0x0920
            boolean r1 = r2 instanceof androidx.paging.PageEvent$StaticList
            if (r1 == 0) goto L_0x1300
        L_0x0920:
            java.lang.Object r0 = r0.A03
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r0 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x092a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1300
            java.lang.Object r0 = r1.next()
            X.DbS.A1U(r0)
            goto L_0x092a
        L_0x0938:
            if (r2 != 0) goto L_0x0907
            int r2 = r9.A0B
            X.La7 r1 = r9.A01
            int r1 = r1.A01
            if (r2 < r1) goto L_0x0907
            int r4 = r9.A0B
            X.La7 r1 = r9.A01
            int r2 = r1.A01
            int r1 = r1.A02
            int r2 = r2 + r1
            if (r4 <= r2) goto L_0x094e
            goto L_0x0907
        L_0x094e:
            r9.A0C = r3
            goto L_0x0916
        L_0x0951:
            java.util.Iterator r2 = r2.iterator()
        L_0x0955:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x08fe
            java.lang.Object r1 = r2.next()
            X.LRX r1 = (X.LRX) r1
            java.util.List r1 = r1.A01
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0955
            r2 = 0
            goto L_0x08ff
        L_0x096b:
            r4 = 0
            goto L_0x08f2
        L_0x096d:
            if (r1 >= 0) goto L_0x08b4
            int r1 = -r1
            r7.A02(r2, r1)
            goto L_0x08b4
        L_0x0975:
            int r10 = r11.A01
            int r4 = java.lang.Math.min(r10, r12)
            int r10 = r10 - r4
            int r2 = r12 - r4
            java.util.List r1 = r11.A03
            r1.addAll(r3, r13)
            int r1 = r11.A02
            int r1 = r1 + r12
            r11.A02 = r1
            int r1 = r5.A01
            r11.A01 = r1
            r7.A00(r10, r4)
            r7.A01(r3, r2)
            int r1 = r11.getSize()
            int r1 = r1 - r16
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x09a0
            r7.A01(r3, r1)
            goto L_0x08b4
        L_0x09a0:
            if (r1 >= 0) goto L_0x08b4
            int r1 = -r1
            r7.A02(r3, r1)
            goto L_0x08b4
        L_0x09a8:
            java.lang.String r0 = "PagingDataDiffer.combinedLoadStatesCollection.stateFlow shouldnot hold null CombinedLoadStates after Insert event."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x09af:
            java.lang.String r0 = "Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x09b6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x09c4
            if (r2 == r7) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09c4:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A02
            java.lang.Object r2 = r0.A01
            X.3jw r2 = (X.C249533jw) r2
            X.05Y r5 = X.0u9.A03(r2)
            java.lang.Object r4 = r0.A03
            r3 = 3
            X.MCn r2 = new X.MCn
            r2.<init>((int) r3, (java.lang.Object) r6, (java.lang.Object) r4)
            r0.A00 = r7
            java.lang.Object r0 = r5.collect(r2, r0)
            goto L_0x12bb
        L_0x09e1:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x09ef
            if (r2 == r6) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09ef:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A02
            r8 = 0
            java.lang.Object r9 = r0.A03
            androidx.paging.PageFetcher r9 = (androidx.paging.PageFetcher) r9
            X.LNp r2 = r9.A00
            X.0r6 r5 = r2.A00
            r4 = 32
            r3 = 42
            X.MH2 r2 = new X.MH2
            r2.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r8, (int) r4, (int) r3)
            X.0rn r4 = new X.0rn
            r4.<init>(r2, r5)
            androidx.paging.PageFetcher$flow$1$2 r2 = new androidx.paging.PageFetcher$flow$1$2
            r2.<init>(r9, r8)
            X.JUk r3 = new X.JUk
            r3.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r8, (X.0sK) r2, (X.AnonymousClass0r6) r4)
            X.05E r2 = new X.05E
            r2.<init>(r3)
            X.0qC r5 = new X.0qC
            r5.<init>(r2)
            X.MHg r4 = new X.MHg
            r4.<init>(r9, r8, r8, r6)
            r3 = 24
            X.MHP r2 = new X.MHP
            r2.<init>((X.AnonymousClass4D7) r8, (X.0sK) r4, (X.AnonymousClass0r6) r5, (int) r3)
            X.0r6 r4 = X.C62958KpA.A00(r2)
            r3 = 0
            X.MBl r2 = new X.MBl
            r2.<init>(r7, r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            goto L_0x12bb
        L_0x0a3d:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0a6e
            if (r3 == r6) goto L_0x0acf
            if (r3 != r2) goto L_0x0b60
            java.lang.Object r13 = r0.A02
            java.lang.Object r12 = r0.A01
            androidx.paging.PagingSource r12 = (androidx.paging.PagingSource) r12
            X.0eS.A00(r11)
        L_0x0a52:
            X.Kkt r11 = (X.C62693Kkt) r11
            boolean r1 = r11 instanceof X.C60345Jjq
            if (r1 == 0) goto L_0x0afa
            java.lang.Object r0 = r0.A03
            X.Jfr r0 = (X.C60110Jfr) r0
            X.MCx r3 = r0.A00
            X.Kfy r2 = X.C62448Kfy.REFRESH
            r1 = 0
            X.Jjb r0 = new X.Jjb
            r0.<init>(r1)
            r3.A04(r0, r2)
            r12.A03()
            goto L_0x1300
        L_0x0a6e:
            X.0eS.A00(r11)
            java.lang.Object r8 = r0.A03
            X.Jfr r8 = (X.C60110Jfr) r8
            X.MCx r4 = r8.A00
            boolean r3 = r4 instanceof X.C60339Jjk
            if (r3 == 0) goto L_0x0ab5
            X.Jjk r4 = (X.C60339Jjk) r4
            androidx.paging.PagingSource r5 = r4.A05
        L_0x0a7f:
            X.0sa r4 = r8.A04
            r3 = 0
            X.0qQ.A0B(r4, r3)
            X.LFy r3 = r5.A00
            r3.A01(r4)
            X.0sa r3 = r8.A05
            java.lang.Object r12 = r3.invoke()
            androidx.paging.PagingSource r12 = (androidx.paging.PagingSource) r12
            X.LFy r3 = r12.A00
            r3.A00(r4)
            boolean r3 = r12 instanceof X.C60348Jjt
            if (r3 == 0) goto L_0x0aba
            r7 = r12
            X.Jjt r7 = (X.C60348Jjt) r7
            r5 = 15
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r3) goto L_0x0ab8
            if (r5 == r4) goto L_0x0ab8
            java.lang.String r1 = "Page size is already set to "
            r0 = 46
            java.lang.String r0 = X.002.A0I(r1, r0, r4)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0ab5:
            androidx.paging.PagingSource r5 = r4.A03
            goto L_0x0a7f
        L_0x0ab8:
            r7.A00 = r5
        L_0x0aba:
            X.4CZ r7 = r8.A07
            r5 = 0
            r4 = 10
            X.JUv r3 = new X.JUv
            r3.<init>(r8, r5, r4)
            r0.A01 = r12
            r0.A00 = r6
            java.lang.Object r3 = X.1Eo.A00(r0, r7, r3)
            if (r3 != r1) goto L_0x0ad6
            return r1
        L_0x0acf:
            java.lang.Object r12 = r0.A01
            androidx.paging.PagingSource r12 = (androidx.paging.PagingSource) r12
            X.0eS.A00(r11)
        L_0x0ad6:
            java.lang.Object r4 = r0.A03
            X.Jfr r4 = (X.C60110Jfr) r4
            X.MCx r3 = r4.A00
            java.lang.Object r13 = r3.A00()
            X.Kp9 r4 = r4.A02
            r3 = 0
            X.0qQ.A0B(r4, r3)
            r4 = 45
            X.Jjp r3 = new X.Jjp
            r3.<init>(r4, r13, r6)
            r0.A01 = r12
            r0.A02 = r13
            r0.A00 = r2
            java.lang.Object r11 = r12.A04(r3, r0)
            if (r11 != r1) goto L_0x0a52
            return r1
        L_0x0afa:
            boolean r1 = r11 instanceof X.C60346Jjr
            if (r1 == 0) goto L_0x0b14
            java.lang.Object r0 = r0.A03
            X.Jfr r0 = (X.C60110Jfr) r0
            X.MCx r3 = r0.A00
            X.Kfy r2 = X.C62448Kfy.REFRESH
            X.Jjr r11 = (X.C60346Jjr) r11
            java.lang.Throwable r1 = r11.A00
            X.Jjc r0 = new X.Jjc
            r0.<init>(r1)
            r3.A04(r0, r2)
            goto L_0x1300
        L_0x0b14:
            boolean r1 = r11 instanceof X.C60347Jjs
            if (r1 == 0) goto L_0x1300
            X.Jjs r11 = (X.C60347Jjs) r11
            java.lang.Object r3 = r0.A03
            X.Jfr r3 = (X.C60110Jfr) r3
            X.4Cq r5 = r3.A08
            X.4CZ r14 = r3.A07
            X.4CZ r15 = r3.A06
            r4 = 0
            X.Kp9 r10 = r3.A02
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.AnonymousClass7TG.A0w(r2, r5, r14, r15)
            r0 = 6
            X.0qQ.A0B(r10, r0)
            if (r11 != 0) goto L_0x0b4a
            r0 = 45
            X.Jjp r2 = new X.Jjp
            r2.<init>(r0, r13, r6)
            r0 = 35
            X.MH2 r1 = new X.MH2
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r12, (X.AnonymousClass4D7) r4, (int) r0)
            X.19B r0 = X.19B.A00
            java.lang.Object r11 = X.C67351tA.A00(r0, r1)
            X.Jjs r11 = (X.C60347Jjs) r11
        L_0x0b4a:
            X.Jjk r9 = new X.Jjk
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            X.MCx r0 = r3.A00
            r0.A00 = r4
            java.lang.Runnable r0 = r3.A03
            r9.A00 = r0
            r3.A00 = r9
            r3.A0A(r9)
            goto L_0x1300
        L_0x0b60:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b65:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0ba3
            if (r2 != r7) goto L_0x0c10
            X.0eS.A00(r11)
        L_0x0b71:
            java.lang.Object r2 = r0.A02
            X.LDd r11 = (X.C63922LDd) r11
            java.util.List r5 = r11.A04
            boolean r0 = r5.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x0ba0
            boolean r0 = r2 instanceof X.C60343Jjo
            if (r0 == 0) goto L_0x0ba0
            r0 = r4
        L_0x0b83:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0b9d
            boolean r1 = r2 instanceof X.C60342Jjn
            if (r1 == 0) goto L_0x0b9d
        L_0x0b8d:
            int r3 = r11.A01
            int r2 = r11.A00
            X.Jjs r1 = new X.Jjs
            r6 = r1
            r7 = r0
            r8 = r4
            r9 = r5
            r10 = r3
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            return r1
        L_0x0b9d:
            java.lang.Object r4 = r11.A02
            goto L_0x0b8d
        L_0x0ba0:
            java.lang.Object r0 = r11.A03
            goto L_0x0b83
        L_0x0ba3:
            X.0eS.A00(r11)
            java.lang.Object r2 = r0.A03
            X.Jjt r2 = (X.C60348Jjt) r2
            X.KzH r6 = r2.A01
            java.lang.Object r4 = r0.A01
            X.L8i r4 = (X.C63827L8i) r4
            r0.A00 = r7
            X.Jja r6 = (X.C60331Jja) r6
            X.Kfy r3 = r4.A02
            X.Kfy r2 = X.C62448Kfy.REFRESH
            if (r3 != r2) goto L_0x0bd2
            X.Kp8 r3 = new X.Kp8
            r3.<init>()
            X.1IW r5 = X.JTS.A0s(r0)
            X.LLz r2 = new X.LLz
            r2.<init>(r5)
            r6.A01(r3, r2)
        L_0x0bcb:
            java.lang.Object r11 = r5.A0E()
        L_0x0bcf:
            if (r11 != r1) goto L_0x0b71
            return r1
        L_0x0bd2:
            java.lang.Object r5 = r4.A03
            if (r5 != 0) goto L_0x0be3
            X.0sn r14 = X.0sn.A00
            r12 = 0
            r15 = 0
            X.LDd r11 = new X.LDd
            r13 = r12
            r16 = r15
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x0bcf
        L_0x0be3:
            X.Kfy r2 = X.C62448Kfy.PREPEND
            if (r3 != r2) goto L_0x0bfa
            X.KzJ r4 = new X.KzJ
            r4.<init>(r5)
            X.1IW r5 = X.JTS.A0s(r0)
            r3 = 0
            X.LNq r2 = new X.LNq
            r2.<init>(r5, r3)
            r6.A03(r4, r2)
            goto L_0x0bcb
        L_0x0bfa:
            X.Kfy r2 = X.C62448Kfy.APPEND
            if (r3 != r2) goto L_0x0c15
            X.KzJ r3 = new X.KzJ
            r3.<init>(r5)
            X.1IW r5 = X.JTS.A0s(r0)
            X.LNq r2 = new X.LNq
            r2.<init>(r5, r7)
            r6.A02(r3, r2)
            goto L_0x0bcb
        L_0x0c10:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c15:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported type "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r3, r0, r1)
            throw r0
        L_0x0c20:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0c2e
            if (r2 == r8) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c2e:
            X.0eS.A00(r11)
            java.lang.Object r2 = r0.A03
            X.3jv r2 = (X.C249523jv) r2
            java.lang.Object r7 = r0.A01
            X.0r6 r7 = (X.AnonymousClass0r6) r7
            X.MCB r6 = new X.MCB
            r6.<init>(r2)
            java.lang.Object r5 = r0.A02
            r4 = 0
            r3 = 23
            X.MHP r2 = new X.MHP
            r2.<init>((java.lang.Object) r6, (java.lang.Object) r5, (X.AnonymousClass4D7) r4, (int) r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r7)
            goto L_0x12bb
        L_0x0c50:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0c5e
            if (r2 == r5) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c5e:
            X.0eS.A00(r11)
            java.lang.Object r4 = r0.A03
            java.lang.Object r3 = r0.A02
            X.0sK r3 = (X.0sK) r3
            java.lang.Object r2 = r0.A01
            r0.A00 = r5
            java.lang.Object r0 = r3.invoke(r2, r4, r0)
            goto L_0x12bb
        L_0x0c71:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0c7f
            if (r2 == r8) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c7f:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A03
            X.0rm r6 = X.C51965G9l.A11()
            java.lang.Object r2 = X.C63511KyM.A00
            r6.A00 = r2
            java.lang.Object r5 = r0.A02
            X.0r6 r5 = (X.AnonymousClass0r6) r5
            java.lang.Object r4 = r0.A01
            r3 = 0
            X.MCf r2 = new X.MCf
            r2.<init>((int) r3, (java.lang.Object) r7, (java.lang.Object) r4, (java.lang.Object) r6)
            r0.A00 = r8
            java.lang.Object r0 = r5.collect(r2, r0)
            goto L_0x12bb
        L_0x0ca0:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0cae
            if (r2 == r6) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0cae:
            X.0eS.A00(r11)
            java.lang.Object r5 = r0.A03
            java.lang.Object r4 = r0.A02
            X.4Co r4 = (X.C262204Co) r4
            r3 = 6
            X.MMt r2 = new X.MMt
            r2.<init>(r5, r3)
            r4.CO3(r2)
            java.lang.Object r2 = r0.A01
            X.0sL r2 = (X.0sL) r2
            r0.A00 = r6
            java.lang.Object r0 = r2.invoke(r5, r0)
            goto L_0x12bb
        L_0x0ccc:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0cf9
            if (r2 == r4) goto L_0x0d11
            if (r2 != r5) goto L_0x0d27
            java.lang.Object r4 = r0.A02
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r2 = r0.A01
            X.02o r3 = X.JTO.A1H(r2, r11)
        L_0x0ce2:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x1300
            java.lang.Object r2 = r4.next()
            r0.A01 = r3
            r0.A02 = r4
            r0.A00 = r5
            java.lang.Object r2 = r3.emit(r2, r0)
            if (r2 != r1) goto L_0x0ce2
            return r1
        L_0x0cf9:
            X.0eS.A00(r11)
            java.lang.Object r3 = r0.A01
            X.02o r3 = (X.02o) r3
            java.lang.Object r2 = r0.A03
            X.L8h r2 = (X.C63826L8h) r2
            androidx.paging.FlattenedPageController r2 = r2.A00
            r0.A01 = r3
            r0.A00 = r4
            java.lang.Object r11 = r2.A01(r0)
            if (r11 != r1) goto L_0x0d17
            return r1
        L_0x0d11:
            java.lang.Object r2 = r0.A01
            X.02o r3 = X.JTO.A1H(r2, r11)
        L_0x0d17:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.A03
            X.L8h r2 = (X.C63826L8h) r2
            X.4Co r2 = r2.A01
            r2.EwR()
            java.util.Iterator r4 = r11.iterator()
            goto L_0x0ce2
        L_0x0d27:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d2c:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0d3d
            if (r2 == r6) goto L_0x1299
            if (r2 == r8) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d3d:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A02
            X.4Cc r7 = (X.C262094Cc) r7
            X.19B r2 = X.19B.A00
            boolean r2 = X.0qQ.A0K(r7, r2)
            if (r2 == 0) goto L_0x0d60
            java.lang.Object r5 = r0.A03
            X.0r6 r5 = (X.AnonymousClass0r6) r5
            java.lang.Object r4 = r0.A01
            r3 = 5
            X.MCh r2 = new X.MCh
            r2.<init>(r4, r3)
            r0.A00 = r6
            java.lang.Object r0 = r5.collect(r2, r0)
            goto L_0x12bb
        L_0x0d60:
            java.lang.Object r6 = r0.A03
            java.lang.Object r5 = r0.A01
            r4 = 0
            r3 = 29
            X.MH2 r2 = new X.MH2
            r2.<init>((java.lang.Object) r6, (java.lang.Object) r5, (X.AnonymousClass4D7) r4, (int) r3)
            r0.A00 = r8
            java.lang.Object r0 = X.1Eo.A00(r0, r7, r2)
            goto L_0x12bb
        L_0x0d74:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0d85
            if (r2 == r4) goto L_0x1299
            if (r2 == r8) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d85:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A03
            java.lang.Object r6 = r0.A01
            X.4Cc r6 = (X.C262094Cc) r6
            X.19B r2 = X.19B.A00
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x0da7
            java.lang.Object r3 = r0.A02
            X.0r6 r3 = (X.AnonymousClass0r6) r3
            X.MCh r2 = new X.MCh
            r2.<init>(r7, r4)
            r0.A00 = r4
            java.lang.Object r0 = r3.collect(r2, r0)
            goto L_0x12bb
        L_0x0da7:
            java.lang.Object r5 = r0.A02
            r4 = 0
            r3 = 19
            X.MH2 r2 = new X.MH2
            r2.<init>((java.lang.Object) r5, (java.lang.Object) r7, (X.AnonymousClass4D7) r4, (int) r3)
            r0.A00 = r8
            java.lang.Object r0 = X.1Eo.A00(r0, r6, r2)
            goto L_0x12bb
        L_0x0db9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0dc7
            if (r2 == r5) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0dc7:
            X.0eS.A00(r11)
            java.lang.Object r4 = r0.A03
            java.lang.Object r3 = r0.A01
            X.0sK r3 = (X.0sK) r3
            java.lang.Object r2 = r0.A02
            r0.A00 = r5
            java.lang.Object r0 = r3.invoke(r4, r2, r0)
            goto L_0x12bb
        L_0x0dda:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0de8
            if (r2 == r7) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0de8:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            java.lang.Object r4 = r0.A02
            r3 = 42
            X.Ivr r2 = new X.Ivr
            r2.<init>(r4, r3)
            X.05E r5 = X.C3025664b.A02(r2)
            java.lang.Object r4 = r0.A01
            r3 = 3
            X.IkW r2 = new X.IkW
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r6)
            r0.A00 = r7
            java.lang.Object r0 = r5.collect(r2, r0)
            goto L_0x12bb
        L_0x0e0a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0e18
            if (r2 == r8) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e18:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A03
            X.6FR r7 = (X.AnonymousClass6FR) r7
            r2 = r7
            X.4cD r2 = (X.C267794cD) r2
            X.5R6 r2 = X.AnonymousClass5WH.A02(r2)
            X.5RG r2 = r2.A0B
            X.Hlq r6 = new X.Hlq
            r6.<init>(r2)
            java.lang.Object r5 = r0.A01
            X.JLM r5 = (X.JLM) r5
            java.lang.Object r4 = r0.A02
            X.JQx r4 = (X.C59629JQx) r4
            r3 = 0
            X.IlG r2 = new X.IlG
            r2.<init>(r4, r6, r5, r3)
            r0.A00 = r8
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r7, r0, r2)
            goto L_0x12bb
        L_0x0e43:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0e51
            if (r3 == r2) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e51:
            X.0eS.A00(r11)
            java.lang.Object r4 = r0.A03
            java.lang.Object r6 = r0.A02
            java.lang.Object r5 = r0.A01
            r7 = 0
            r8 = 0
            r9 = 42
            X.MGj r3 = new X.MGj
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (X.AnonymousClass4D7) r7, (int) r8, (int) r9)
            r0.A00 = r2
            java.lang.Object r0 = X.19E.A00(r0, r3)
            goto L_0x12bb
        L_0x0e6b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0e79
            if (r2 == r7) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e79:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            X.6FR r6 = (X.AnonymousClass6FR) r6
            java.lang.Object r5 = r0.A01
            java.lang.Object r4 = r0.A02
            r2 = 33
            X.J6U r3 = new X.J6U
            r3.<init>(r2, r5, r4)
            r0.A00 = r7
            X.0sK r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A05(r6, r0, r3, r2)
            goto L_0x12bb
        L_0x0e95:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r10 = 1
            if (r2 == 0) goto L_0x0ea3
            if (r2 == r10) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ea3:
            X.0eS.A00(r11)
            java.lang.Object r4 = r0.A03
            X.5zJ r4 = (X.C301465zJ) r4
            X.6Ia r9 = r4.A00
            java.lang.Object r3 = r0.A02
            X.4ch r3 = (X.C268064ch) r3
            java.lang.Object r2 = r0.A01
            X.0sa r2 = (X.C62320sa) r2
            X.MIY r5 = new X.MIY
            r5.<init>(r4, r3, r2)
            r0.A00 = r10
            X.6IZ r9 = (X.AnonymousClass6IZ) r9
            java.lang.Object r4 = r5.invoke()
            X.5VN r4 = (X.AnonymousClass5VN) r4
            if (r4 == 0) goto L_0x0f60
            long r2 = r9.A00
            boolean r2 = X.AnonymousClass6IZ.A04(r9, r4, r2)
            if (r2 != 0) goto L_0x0f60
            X.1IW r11 = X.JTS.A0s(r0)
            X.6Ic r12 = new X.6Ic
            r12.<init>(r5, r11)
            X.6Ib r4 = r9.A08
            X.0sa r0 = r12.A00
            java.lang.Object r8 = r0.invoke()
            X.5VN r8 = (X.AnonymousClass5VN) r8
            r7 = 0
            if (r8 != 0) goto L_0x0ef2
            X.1IX r2 = r12.A01
            X.0gF r0 = X.C60340gF.A00
            r2.resumeWith(r0)
        L_0x0eea:
            java.lang.Object r0 = r11.A0E()
        L_0x0eee:
            if (r0 != r1) goto L_0x0f60
            goto L_0x12bb
        L_0x0ef2:
            X.1IX r3 = r12.A01
            r2 = 14
            X.J6U r0 = new X.J6U
            r0.<init>(r2, r12, r4)
            r3.CO0(r0)
            X.5Pl r6 = r4.A00
            int r2 = r6.A00
            int r2 = r2 - r10
            X.2HY r0 = new X.2HY
            r0.<init>(r7, r2)
            int r5 = r0.A00
            int r4 = r0.A01
            if (r5 > r4) goto L_0x0f5c
        L_0x0f0e:
            java.lang.Object[] r0 = r6.A02
            r0 = r0[r4]
            X.6Ic r0 = (X.AnonymousClass6Ic) r0
            X.0sa r0 = r0.A00
            java.lang.Object r3 = r0.invoke()
            X.5VN r3 = (X.AnonymousClass5VN) r3
            if (r3 == 0) goto L_0x0f57
            X.5VN r2 = r8.A04(r3)
            boolean r0 = X.0qQ.A0K(r2, r8)
            if (r0 == 0) goto L_0x0f35
            int r0 = r4 + 1
            r6.A04(r0, r12)
        L_0x0f2d:
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x0eea
            X.AnonymousClass6IZ.A03(r9)
            goto L_0x0eea
        L_0x0f35:
            boolean r0 = X.0qQ.A0K(r2, r3)
            if (r0 != 0) goto L_0x0f57
            java.lang.String r0 = "bringIntoView call interrupted by a newer, non-overlapping call"
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            r3.<init>(r0)
            int r2 = r6.A00
            int r2 = r2 - r10
            if (r2 > r4) goto L_0x0f57
        L_0x0f47:
            java.lang.Object[] r0 = r6.A02
            r0 = r0[r4]
            X.6Ic r0 = (X.AnonymousClass6Ic) r0
            X.1IX r0 = r0.A01
            r0.AG9(r3)
            if (r2 == r4) goto L_0x0f57
            int r2 = r2 + 1
            goto L_0x0f47
        L_0x0f57:
            if (r4 == r5) goto L_0x0f5c
            int r4 = r4 + -1
            goto L_0x0f0e
        L_0x0f5c:
            r6.A04(r7, r12)
            goto L_0x0f2d
        L_0x0f60:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x12bb
        L_0x0f64:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0f73
            if (r2 != r6) goto L_0x0f6e
            goto L_0x0f9e
        L_0x0f6e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0f73:
            X.0eS.A00(r11)
            java.lang.Object r5 = r0.A03     // Catch:{ all -> 0x0fb2 }
            X.I4b r5 = (X.C56602I4b) r5     // Catch:{ all -> 0x0fb2 }
            X.5b4 r7 = r5.A07     // Catch:{ all -> 0x0fb2 }
            java.lang.Float r9 = X.JTP.A0h()     // Catch:{ all -> 0x0fb2 }
            java.lang.Object r8 = r0.A02     // Catch:{ all -> 0x0fb2 }
            X.5b8 r8 = (X.AnonymousClass5b8) r8     // Catch:{ all -> 0x0fb2 }
            java.lang.Object r4 = r0.A01     // Catch:{ all -> 0x0fb2 }
            androidx.compose.ui.graphics.layer.GraphicsLayer r4 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r4     // Catch:{ all -> 0x0fb2 }
            r3 = 27
            X.J6U r2 = new X.J6U     // Catch:{ all -> 0x0fb2 }
            r2.<init>(r3, r4, r5)     // Catch:{ all -> 0x0fb2 }
            r0.A00 = r6     // Catch:{ all -> 0x0fb2 }
            java.lang.Object r10 = r7.A02()     // Catch:{ all -> 0x0fb2 }
            r11 = r0
            r12 = r2
            java.lang.Object r2 = r7.A04(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0fb2 }
            if (r2 != r1) goto L_0x0fa1
            return r1
        L_0x0f9e:
            X.0eS.A00(r11)     // Catch:{ all -> 0x0fb2 }
        L_0x0fa1:
            java.lang.Object r2 = r0.A03     // Catch:{ all -> 0x0fb2 }
            X.I4b r2 = (X.C56602I4b) r2     // Catch:{ all -> 0x0fb2 }
            X.5Oz r1 = r2.A09     // Catch:{ all -> 0x0fb2 }
            X.C51967G9n.A16(r1, r6)     // Catch:{ all -> 0x0fb2 }
            r1 = 0
            X.5Oz r0 = r2.A0A
            X.C51967G9n.A16(r0, r1)
            goto L_0x1300
        L_0x0fb2:
            r4 = move-exception
            java.lang.Object r0 = r0.A03
            X.I4b r0 = (X.C56602I4b) r0
            r1 = 0
            X.5Oz r0 = r0.A0A
            goto L_0x1069
        L_0x0fbc:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0fca
            if (r2 == r4) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0fca:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A01
            X.0sK r7 = (X.0sK) r7
            java.lang.Object r6 = r0.A02
            java.lang.Object r2 = r0.A03
            goto L_0x0fef
        L_0x0fd6:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0fe4
            if (r2 == r4) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0fe4:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A02
            X.0sK r7 = (X.0sK) r7
            java.lang.Object r6 = r0.A03
            java.lang.Object r2 = r0.A01
        L_0x0fef:
            X.GPU r2 = (X.GPU) r2
            long r2 = r2.A06
            X.5dM r5 = new X.5dM
            r5.<init>(r2)
            r0.A00 = r4
            java.lang.Object r0 = r7.invoke(r6, r5, r0)
            goto L_0x12bb
        L_0x1000:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x100e
            if (r2 == r7) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x100e:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A02
            java.lang.Object r5 = r0.A01
            X.0sL r5 = (X.0sL) r5
            java.lang.Object r4 = r0.A03
            r3 = 16
            X.J6U r2 = new X.J6U
            r2.<init>(r3, r6, r4)
            r0.A00 = r7
            java.lang.Object r0 = r5.invoke(r2, r0)
            goto L_0x12bb
        L_0x1028:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x103a
            if (r2 != r4) goto L_0x1035
            X.0eS.A00(r11)     // Catch:{ all -> 0x1061 }
            goto L_0x1055
        L_0x1035:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x103a:
            X.0eS.A00(r11)
            java.lang.Object r3 = r0.A02
            java.lang.Object r2 = r0.A03
            X.6Gz r2 = (X.C305216Gz) r2
            X.5Oz r2 = r2.A04
            X.C51967G9n.A16(r2, r4)
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x1061 }
            X.0sL r2 = (X.0sL) r2     // Catch:{ all -> 0x1061 }
            r0.A00 = r4     // Catch:{ all -> 0x1061 }
            java.lang.Object r2 = r2.invoke(r3, r0)     // Catch:{ all -> 0x1061 }
            if (r2 != r1) goto L_0x1055
            return r1
        L_0x1055:
            java.lang.Object r0 = r0.A03
            X.6Gz r0 = (X.C305216Gz) r0
            X.5Oz r1 = r0.A04
            r0 = 0
            X.C51967G9n.A16(r1, r0)
            goto L_0x1300
        L_0x1061:
            r4 = move-exception
            java.lang.Object r0 = r0.A03
            X.6Gz r0 = (X.C305216Gz) r0
            X.5Oz r0 = r0.A04
            r1 = 0
        L_0x1069:
            X.C51967G9n.A16(r0, r1)
            throw r4
        L_0x106d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x107b
            if (r2 == r3) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x107b:
            X.0eS.A00(r11)
            java.lang.Object r2 = r0.A03
            X.IEh r2 = (X.C56836IEh) r2
            X.6H2 r5 = r2.A00
            X.JNO r7 = r2.A01
            java.lang.Object r4 = r0.A02
            java.lang.Object r6 = r0.A01
            r0.A00 = r3
            r8 = 0
            r9 = 0
            X.9KU r3 = new X.9KU
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = X.19E.A00(r0, r3)
            goto L_0x12bb
        L_0x1099:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r10 = 4
            r9 = 3
            r8 = 2
            r7 = 1
            r6 = 0
            if (r2 == 0) goto L_0x10c7
            if (r2 == r7) goto L_0x10bd
            if (r2 == r8) goto L_0x10b9
            if (r2 == r9) goto L_0x1299
            if (r2 == r10) goto L_0x10b1
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0x()
            throw r4
        L_0x10b1:
            java.lang.Object r4 = r0.A01
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            X.0eS.A00(r11)
            throw r4
        L_0x10b9:
            X.0eS.A00(r11)     // Catch:{ all -> 0x1145 }
            goto L_0x1133
        L_0x10bd:
            java.lang.Object r12 = r0.A02
            X.5b9 r12 = (X.AnonymousClass5b9) r12
            java.lang.Object r5 = r0.A01
            X.0eS.A00(r11)
            goto L_0x1120
        L_0x10c7:
            X.0eS.A00(r11)
            java.lang.Object r5 = r0.A01
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 == 0) goto L_0x1300
            java.lang.Object r11 = r0.A03
            X.5WU r11 = (X.AnonymousClass5WU) r11
            int r15 = r11.A03
            float r13 = r5.floatValue()
            int r12 = r11.A02
            int r4 = r11.A01
            float r3 = r11.A00
            X.5R6 r2 = X.AnonymousClass5WH.A02(r11)
            X.4cd r2 = r2.A0C
            float r2 = r2.F06(r3)
            float r3 = java.lang.Math.abs(r2)
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r2
            float r13 = r13 / r3
            double r2 = (double) r13
            double r2 = java.lang.Math.ceil(r2)
            float r13 = (float) r2
            int r3 = (int) r13
            X.JNL r2 = X.C52518GVv.A02
            X.GQC r13 = new X.GQC
            r13.<init>(r2, r3, r4)
            int r2 = -r4
            int r2 = r2 + r12
            int r2 = -r2
            long r2 = (long) r2
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            X.IER r12 = new X.IER
            r16 = r2
            r12.<init>(r13, r14, r15, r16)
            X.5b4 r3 = r11.A05
            java.lang.Float r2 = X.JTP.A0h()
            r0.A01 = r5
            r0.A02 = r12
            r0.A00 = r7
            java.lang.Object r2 = r3.A05(r2, r0)
            if (r2 != r1) goto L_0x1120
            return r1
        L_0x1120:
            java.lang.Object r2 = r0.A03     // Catch:{ all -> 0x1145 }
            X.5WU r2 = (X.AnonymousClass5WU) r2     // Catch:{ all -> 0x1145 }
            X.5b4 r2 = r2.A05     // Catch:{ all -> 0x1145 }
            r0.A01 = r6     // Catch:{ all -> 0x1145 }
            r0.A02 = r6     // Catch:{ all -> 0x1145 }
            r0.A00 = r8     // Catch:{ all -> 0x1145 }
            java.lang.Object r2 = X.JTQ.A0V(r2, r12, r5, r0)     // Catch:{ all -> 0x1145 }
            if (r2 != r1) goto L_0x1133
            return r1
        L_0x1133:
            java.lang.Object r2 = r0.A03
            X.5WU r2 = (X.AnonymousClass5WU) r2
            X.5b4 r3 = r2.A05
            java.lang.Float r2 = X.JTP.A0h()
            r0.A00 = r9
            java.lang.Object r0 = r3.A05(r2, r0)
            goto L_0x12bb
        L_0x1145:
            r4 = move-exception
            java.lang.Object r2 = r0.A03
            X.5WU r2 = (X.AnonymousClass5WU) r2
            X.5b4 r3 = r2.A05
            java.lang.Float r2 = X.JTP.A0h()
            r0.A01 = r4
            r0.A02 = r6
            r0.A00 = r10
            java.lang.Object r0 = r3.A05(r2, r0)
            if (r0 != r1) goto L_0x1177
            return r1
        L_0x115d:
            X.1Hj r1 = X.1Hj.A02
            int r8 = r0.A00
            r5 = 4
            r7 = 3
            r6 = 1
            r4 = 603995461(0x24003d45, float:2.7807473E-17)
            r3 = 0
            r2 = 2
            if (r8 == 0) goto L_0x1178
            if (r8 == r6) goto L_0x11c8
            if (r8 == r2) goto L_0x127e
            if (r8 == r7) goto L_0x12be
            if (r8 == r5) goto L_0x1299
            java.lang.IllegalStateException r4 = X.AnonymousClass7TE.A0x()
        L_0x1177:
            throw r4
        L_0x1178:
            X.0eS.A00(r11)
            java.lang.Object r5 = r0.A02
            X.Kkw r5 = (X.C62696Kkw) r5
            boolean r8 = r5 instanceof X.C60785JrG
            r10 = 0
            if (r8 == 0) goto L_0x11fd
            X.JrG r5 = (X.C60785JrG) r5
            java.lang.Integer r8 = r5.A00
            int r2 = r8.intValue()
            switch(r2) {
                case 0: goto L_0x1194;
                case 1: goto L_0x1194;
                case 2: goto L_0x1194;
                case 3: goto L_0x1194;
                case 4: goto L_0x1194;
                case 5: goto L_0x1194;
                case 6: goto L_0x1194;
                case 7: goto L_0x1194;
                case 8: goto L_0x1194;
                case 9: goto L_0x1194;
                case 10: goto L_0x1194;
                case 11: goto L_0x1194;
                default: goto L_0x118f;
            }
        L_0x118f:
            X.Wub r4 = X.AnonymousClass7TE.A1K()
            throw r4
        L_0x1194:
            java.lang.String r9 = X.C62967KpJ.A00(r8)
            java.lang.String r10 = r5.A01
            java.lang.Object r11 = r0.A03
            com.facebook.avatar.expresso.instagram.ExpressoImpl r11 = (com.facebook.avatar.expresso.instagram.ExpressoImpl) r11
            com.facebook.quicklog.QuickPerformanceLogger r8 = r11.A00
            java.lang.String r2 = "error"
            r8.markerAnnotate(r4, r2, r9)
            java.util.HashMap r9 = r11.A02
            java.lang.Object r2 = r0.A01
            X.LOq r2 = (X.C64122LOq) r2
            java.lang.String r8 = r2.A00
            java.lang.Integer r2 = r5.A00
            java.lang.String r2 = X.C62967KpJ.A00(r2)
            r9.put(r8, r2)
            X.0V2 r8 = r11.A09
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.JrD r2 = new X.JrD
            r2.<init>(r10, r5)
            r0.A00 = r6
            java.lang.Object r2 = r8.emit(r2, r0)
            if (r2 != r1) goto L_0x11cb
            return r1
        L_0x11c8:
            X.0eS.A00(r11)
        L_0x11cb:
            java.lang.Object r5 = r0.A03
            com.facebook.avatar.expresso.instagram.ExpressoImpl r5 = (com.facebook.avatar.expresso.instagram.ExpressoImpl) r5
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A05
            r0.set(r3)
            com.facebook.quicklog.QuickPerformanceLogger r0 = r5.A00
            r0.markerEnd(r4, r7)
            X.0eM r0 = r5.A07
            java.lang.Object r2 = r0.getValue()
            com.facebook.avatar.expresso.odr.ODRController r2 = (com.facebook.avatar.expresso.odr.ODRController) r2
            X.WGr r0 = r2.A02
            r1 = 0
            if (r0 == 0) goto L_0x11eb
            X.UIF r0 = r0.A00
            r0.A02()
        L_0x11eb:
            X.MTI r0 = r2.A00
            if (r0 == 0) goto L_0x11f2
            r0.onDestroy()
        L_0x11f2:
            r2.A00 = r1
            X.LRf r0 = r2.A03
            if (r0 == 0) goto L_0x12d4
            r0.A03()
            goto L_0x12d4
        L_0x11fd:
            boolean r8 = r5 instanceof X.C60787JrI
            if (r8 == 0) goto L_0x123d
            X.JrI r5 = (X.C60787JrI) r5
            java.lang.String r6 = r5.A09
            java.lang.String r4 = "file://"
            java.lang.String r4 = X.002.A0R(r4, r6)
            com.instagram.common.typedurl.SimpleImageUrl r6 = X.DbS.A0V(r4)
            java.lang.Object r4 = r0.A01
            X.LOq r4 = (X.C64122LOq) r4
            java.lang.Integer r7 = r4.A02
            int r14 = r5.A02
            int r15 = r5.A03
            int r4 = r5.A00
            java.lang.String r8 = r5.A0B
            java.lang.String r9 = r5.A05
            java.lang.String r10 = r5.A08
            java.lang.String r11 = r5.A06
            java.lang.String r12 = r5.A04
            java.lang.String r13 = r5.A07
            X.JrE r5 = new X.JrE
            r16 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r0.A03
            com.facebook.avatar.expresso.instagram.ExpressoImpl r4 = (com.facebook.avatar.expresso.instagram.ExpressoImpl) r4
            X.0V2 r4 = r4.A09
            r0.A00 = r2
            java.lang.Object r2 = r4.emit(r5, r0)
            if (r2 != r1) goto L_0x1281
            return r1
        L_0x123d:
            boolean r8 = r5 instanceof X.C60786JrH
            if (r8 == 0) goto L_0x1281
            X.JrH r5 = (X.C60786JrH) r5
            java.lang.Object r8 = r0.A03
            com.facebook.avatar.expresso.instagram.ExpressoImpl r8 = (com.facebook.avatar.expresso.instagram.ExpressoImpl) r8
            X.0V2 r8 = r8.A09
            java.lang.String r9 = "file://"
            java.io.File r5 = r5.A00
            if (r5 == 0) goto L_0x1253
            java.lang.String r10 = r5.getCanonicalPath()
        L_0x1253:
            java.lang.String r5 = X.002.A0R(r9, r10)
            com.instagram.common.typedurl.SimpleImageUrl r10 = X.DbS.A0V(r5)
            java.lang.Object r5 = r0.A01
            X.LOq r5 = (X.C64122LOq) r5
            java.lang.Integer r11 = r5.A02
            r18 = 400(0x190, float:5.6E-43)
            java.lang.String r12 = ""
            X.JrE r9 = new X.JrE
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r19 = r18
            r20 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.A00 = r7
            java.lang.Object r5 = r8.emit(r9, r0)
            if (r5 != r1) goto L_0x12c1
            return r1
        L_0x127e:
            X.0eS.A00(r11)
        L_0x1281:
            java.lang.Object r5 = r0.A03
            com.facebook.avatar.expresso.instagram.ExpressoImpl r5 = (com.facebook.avatar.expresso.instagram.ExpressoImpl) r5
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A05
            r0.set(r3)
            goto L_0x12d4
        L_0x128b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x129d
            if (r2 == r8) goto L_0x1299
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1299:
            X.0eS.A00(r11)
            goto L_0x1300
        L_0x129d:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A03
            java.lang.Object r6 = r0.A01
            r5 = 0
            X.Ivr r2 = new X.Ivr
            r2.<init>(r6, r5)
            X.05E r4 = X.C3025664b.A02(r2)
            java.lang.Object r3 = r0.A02
            X.IkS r2 = new X.IkS
            r2.<init>(r5, r7, r3, r6)
            r0.A00 = r8
            java.lang.Object r0 = r4.collect(r2, r0)
        L_0x12bb:
            if (r0 != r1) goto L_0x1300
            return r1
        L_0x12be:
            X.0eS.A00(r11)
        L_0x12c1:
            java.lang.Object r5 = r0.A03
            com.facebook.avatar.expresso.instagram.ExpressoImpl r5 = (com.facebook.avatar.expresso.instagram.ExpressoImpl) r5
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A05
            r0.set(r3)
            com.facebook.quicklog.QuickPerformanceLogger r1 = r5.A00
            java.lang.String r0 = "is_odr_sticker_cache_hit"
            r1.markerAnnotate(r4, r0, r6)
            r1.markerEnd(r4, r2)
        L_0x12d4:
            java.util.concurrent.ConcurrentLinkedQueue r0 = r5.A03
            java.lang.Object r0 = r0.poll()
            X.LOq r0 = (X.C64122LOq) r0
            if (r0 != 0) goto L_0x1303
            X.0eM r0 = r5.A07
            java.lang.Object r2 = r0.getValue()
            com.facebook.avatar.expresso.odr.ODRController r2 = (com.facebook.avatar.expresso.odr.ODRController) r2
            X.WGr r0 = r2.A02
            r1 = 0
            if (r0 == 0) goto L_0x12f0
            X.UIF r0 = r0.A00
            r0.A02()
        L_0x12f0:
            X.MTI r0 = r2.A00
            if (r0 == 0) goto L_0x12f7
            r0.onDestroy()
        L_0x12f7:
            r2.A00 = r1
            X.LRf r0 = r2.A03
            if (r0 == 0) goto L_0x1300
            r0.A03()
        L_0x1300:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x1303:
            com.facebook.avatar.expresso.instagram.ExpressoImpl.A01(r0, r5)
            goto L_0x1300
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MHP) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHP(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A04 = i;
        this.A03 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHP(PressGestureScopeImpl pressGestureScopeImpl, GPU gpu, AnonymousClass4D7 r4, 0sK r5, int i) {
        super(2, r4);
        this.A04 = i;
        switch (i) {
            case 5:
            case 6:
                this.A02 = r5;
                this.A03 = pressGestureScopeImpl;
                this.A01 = gpu;
                break;
            default:
                this.A01 = r5;
                this.A02 = pressGestureScopeImpl;
                this.A03 = gpu;
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHP(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHP(C307786Rm r2, C276544tV r3, C277014uI r4, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A04 = 32;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = i;
        this.A01 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHP(Object obj, Object obj2, AnonymousClass4D7 r4, int i, int i2) {
        super(2, r4);
        this.A04 = i;
        this.A03 = obj;
        this.A01 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHP(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A04 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }
}
