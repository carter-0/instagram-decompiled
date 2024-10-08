package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class MH7 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MH7(Object obj, Object obj2, String str, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A04 = i;
        this.A03 = obj;
        this.A05 = obj2;
        this.A06 = str;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MH7, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MH7, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MH7, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6, types: [X.MH7, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8, types: [X.MH7, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v28, types: [X.MH7] */
    /* JADX WARNING: type inference failed for: r4v21, types: [X.MH7] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cc, code lost:
        r4 = new X.MH7(r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0113, code lost:
        return new X.MH7(r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0129, code lost:
        r5 = new X.MH7(r6, r7, r0, r9, r10, 42);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0132, code lost:
        r3.A02 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0134, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0146, code lost:
        return new X.MH7(r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r3 = new X.MH7(r4, r5, r0, r14, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r3.A01 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            int r2 = r12.A04
            r9 = r14
            switch(r2) {
                case 0: goto L_0x0030;
                case 1: goto L_0x003b;
                case 2: goto L_0x0018;
                case 3: goto L_0x0048;
                case 4: goto L_0x0054;
                case 5: goto L_0x0061;
                case 6: goto L_0x006e;
                case 7: goto L_0x0079;
                case 8: goto L_0x0084;
                case 9: goto L_0x0092;
                case 10: goto L_0x00a0;
                case 11: goto L_0x00ab;
                case 12: goto L_0x00c2;
                case 13: goto L_0x00d3;
                case 14: goto L_0x00e0;
                case 15: goto L_0x00e9;
                case 16: goto L_0x00f6;
                case 17: goto L_0x0103;
                case 18: goto L_0x0114;
                case 19: goto L_0x0121;
                case 20: goto L_0x0020;
                case 21: goto L_0x0135;
                case 22: goto L_0x0147;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r5 = r12.A05
            java.lang.Object r4 = r12.A03
            java.lang.String r0 = r12.A06
            r8 = 23
        L_0x000e:
            X.MH7 r3 = new X.MH7
            r6 = r0
            r7 = r14
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.String) r6, (X.AnonymousClass4D7) r7, (int) r8)
        L_0x0015:
            r3.A01 = r13
            return r3
        L_0x0018:
            java.lang.Object r4 = r12.A03
            java.lang.Object r5 = r12.A05
            java.lang.String r0 = r12.A06
            r8 = 2
            goto L_0x000e
        L_0x0020:
            java.lang.Object r4 = r12.A03
            java.lang.String r2 = r12.A06
            java.lang.Object r5 = r12.A05
            r8 = 20
            X.MH7 r3 = new X.MH7
            r6 = r2
            r7 = r14
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.String) r6, (X.AnonymousClass4D7) r7, (int) r8)
            goto L_0x0015
        L_0x0030:
            java.lang.Object r5 = r12.A01
            java.lang.Object r6 = r12.A05
            java.lang.String r8 = r12.A06
            java.lang.Object r7 = r12.A03
            r10 = 0
            goto L_0x00cc
        L_0x003b:
            java.lang.Object r6 = r12.A03
            java.lang.String r8 = r12.A06
            java.lang.Object r7 = r12.A05
            java.lang.Object r5 = r12.A01
            java.lang.Object r4 = r12.A02
            r10 = 1
            goto L_0x0141
        L_0x0048:
            r6 = 0
            java.lang.String r8 = r12.A06
            java.lang.Object r7 = r12.A05
            java.lang.Object r5 = r12.A01
            java.lang.Object r4 = r12.A02
            r10 = 3
            goto L_0x0141
        L_0x0054:
            java.lang.Object r6 = r12.A03
            java.lang.String r8 = r12.A06
            java.lang.Object r7 = r12.A05
            java.lang.Object r4 = r12.A02
            java.lang.Object r5 = r12.A01
            r10 = 4
            goto L_0x0141
        L_0x0061:
            java.lang.Object r6 = r12.A03
            java.lang.String r8 = r12.A06
            java.lang.Object r4 = r12.A02
            java.lang.Object r5 = r12.A01
            java.lang.Object r7 = r12.A05
            r10 = 5
            goto L_0x0141
        L_0x006e:
            java.lang.Object r7 = r12.A03
            java.lang.String r8 = r12.A06
            java.lang.Object r5 = r12.A01
            java.lang.Object r6 = r12.A05
            r10 = 6
            goto L_0x010d
        L_0x0079:
            java.lang.Object r7 = r12.A03
            java.lang.String r8 = r12.A06
            java.lang.Object r5 = r12.A01
            java.lang.Object r6 = r12.A05
            r10 = 7
            goto L_0x010d
        L_0x0084:
            java.lang.Object r4 = r12.A02
            java.lang.Object r5 = r12.A01
            java.lang.Object r6 = r12.A03
            java.lang.Object r7 = r12.A05
            java.lang.String r8 = r12.A06
            r10 = 8
            goto L_0x0141
        L_0x0092:
            java.lang.Object r6 = r12.A03
            java.lang.Object r7 = r12.A05
            java.lang.String r8 = r12.A06
            java.lang.Object r5 = r12.A01
            java.lang.Object r4 = r12.A02
            r10 = 9
            goto L_0x0141
        L_0x00a0:
            java.lang.Object r6 = r12.A05
            java.lang.Object r7 = r12.A03
            java.lang.String r8 = r12.A06
            java.lang.Object r5 = r12.A01
            r10 = 10
            goto L_0x010d
        L_0x00ab:
            java.lang.String r1 = r12.A06
            java.lang.Object r4 = r12.A05
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r12.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r0 = r12.A01
            X.0sL r0 = (X.0sL) r0
            X.MH7 r3 = new X.MH7
            r6 = r1
            r7 = r14
            r8 = r0
            r3.<init>((android.content.Context) r4, (com.instagram.common.session.UserSession) r5, (java.lang.String) r6, (X.AnonymousClass4D7) r7, (X.0sL) r8)
            return r3
        L_0x00c2:
            java.lang.Object r7 = r12.A03
            java.lang.String r8 = r12.A06
            java.lang.Object r6 = r12.A05
            java.lang.Object r5 = r12.A01
            r10 = 12
        L_0x00cc:
            X.MH7 r3 = new X.MH7
            r4 = r3
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (X.AnonymousClass4D7) r9, (int) r10)
            goto L_0x0132
        L_0x00d3:
            java.lang.Object r5 = r12.A01
            java.lang.Object r6 = r12.A03
            java.lang.Object r4 = r12.A02
            java.lang.Object r7 = r12.A05
            java.lang.String r8 = r12.A06
            r10 = 13
            goto L_0x0141
        L_0x00e0:
            java.lang.Object r7 = r12.A05
            java.lang.Object r6 = r12.A01
            java.lang.String r0 = r12.A06
            r10 = 14
            goto L_0x0129
        L_0x00e9:
            java.lang.Object r6 = r12.A03
            java.lang.Object r4 = r12.A02
            java.lang.Object r7 = r12.A05
            java.lang.Object r5 = r12.A01
            java.lang.String r8 = r12.A06
            r10 = 15
            goto L_0x0141
        L_0x00f6:
            java.lang.Object r4 = r12.A02
            java.lang.Object r5 = r12.A01
            java.lang.Object r6 = r12.A03
            java.lang.Object r7 = r12.A05
            java.lang.String r8 = r12.A06
            r10 = 16
            goto L_0x0141
        L_0x0103:
            java.lang.Object r7 = r12.A03
            java.lang.String r8 = r12.A06
            java.lang.Object r5 = r12.A01
            java.lang.Object r6 = r12.A05
            r10 = 17
        L_0x010d:
            X.MH7 r3 = new X.MH7
            r4 = r3
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (X.AnonymousClass4D7) r9, (int) r10)
            return r3
        L_0x0114:
            java.lang.Object r6 = r12.A03
            java.lang.Object r7 = r12.A05
            java.lang.String r8 = r12.A06
            java.lang.Object r4 = r12.A02
            java.lang.Object r5 = r12.A01
            r10 = 18
            goto L_0x0141
        L_0x0121:
            java.lang.Object r6 = r12.A01
            java.lang.Object r7 = r12.A05
            java.lang.String r0 = r12.A06
            r10 = 19
        L_0x0129:
            r11 = 42
            X.MH7 r3 = new X.MH7
            r5 = r3
            r8 = r0
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (X.AnonymousClass4D7) r9, (int) r10, (int) r11)
        L_0x0132:
            r3.A02 = r13
            return r3
        L_0x0135:
            java.lang.Object r6 = r12.A03
            java.lang.String r8 = r12.A06
            java.lang.Object r7 = r12.A05
            java.lang.Object r4 = r12.A02
            java.lang.Object r5 = r12.A01
            r10 = 21
        L_0x0141:
            X.MH7 r3 = new X.MH7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L_0x0147:
            java.lang.Object r4 = r12.A03
            java.lang.String r1 = r12.A06
            java.lang.Object r5 = r12.A05
            r8 = 22
            X.MH7 r3 = new X.MH7
            r6 = r1
            r7 = r14
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.String) r6, (X.AnonymousClass4D7) r7, (int) r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MH7.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: com.facebook.hyperthrift.HyperThriftBase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: com.facebook.hyperthrift.HyperThriftBase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: com.facebook.hyperthrift.HyperThriftBase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: com.facebook.hyperthrift.HyperThriftBase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: com.facebook.hyperthrift.HyperThriftBase} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.MH7, X.4D7] */
    /* JADX WARNING: type inference failed for: r15v13, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v12, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v27, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v12, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v8, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v9, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v13, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v10, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v34, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v35, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v12, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v60, types: [com.instagram.model.direct.DirectSearchMetaAIResponse, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v111, types: [X.MH7, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v123 */
    /* JADX WARNING: type inference failed for: r0v124 */
    /* JADX WARNING: type inference failed for: r0v125 */
    /* JADX WARNING: type inference failed for: r0v126 */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07e3, code lost:
        r5 = new X.MH6(r6, r7, r8, r9, r10);
        r0.A00 = r3;
        r0 = X.AnonymousClass3DM.A00(r1, r2, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x08dd, code lost:
        if (r1 != true) goto L_0x08df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0954, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0af0, code lost:
        X.0eS.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0b2b, code lost:
        if (r0 != r4) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0b2d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0c3c, code lost:
        r10 = new X.NDK();
        r8 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0c47, code lost:
        if (r8.A00() == false) goto L_0x0fab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0c49, code lost:
        r35 = (com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper) r2.A08.invoke(X.JTQ.A0T(r2.A03));
        r3 = (X.C60940Jty) r0.A05;
        r7 = r3.A01;
        r11 = r3.A00;
        r3 = r8.A01;
        r51 = r3;
        r5 = X.182.A01(X.0Tu.A05, r3, 36604150837941269L);
        r34 = (X.C62920KoY) r2.A07.invoke(r7);
        r9 = r35.A00.getData();
        r33 = java.lang.String.valueOf(r11);
        r50 = (int) r5;
        r11 = new java.lang.Object[25];
        r11[1] = "";
        r5 = r9.transactionId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0c99, code lost:
        if (r5 != null) goto L_0x0c9d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0c9b, code lost:
        r5 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0c9d, code lost:
        r11[2] = r5;
        r5 = r9.signalingId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0ca3, code lost:
        if (r5 != null) goto L_0x0ca7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0ca5, code lost:
        r5 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0ca7, code lost:
        r11[8] = r5;
        r11[12] = 15;
        r5 = X.1sa.A00(X.C51968G9o.A1Z(4001, 4002));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0cc5, code lost:
        if (r5 != null) goto L_0x0cc9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0cc7, code lost:
        r5 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0cc9, code lost:
        r11[21] = r5;
        r11[0] = 0;
        r11[3] = (short) 0;
        r12 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r11);
        com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r12, 6);
        com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r12, 21);
        r27 = new java.lang.Object();
        r26 = X.AnonymousClass000.A00(2840);
        r27.A02(r26, r12);
        r11 = new java.lang.Object[3];
        r5 = r9.sdpString;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0cff, code lost:
        if (r5 != null) goto L_0x0d03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0d01, code lost:
        r5 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0d03, code lost:
        r11[0] = r5;
        r12 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r11);
        r25 = new java.lang.Object();
        r25.A02(X.AnonymousClass000.A00(2841), r12);
        r18 = X.1sa.A00(new java.lang.Integer[]{3, 4, 5, 7, 8, 10, 11, 13, 14, 15, 16, 17, 18});
        r13 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(new java.lang.Object[]{0});
        r17 = new java.lang.Object();
        r17.A02(X.AnonymousClass000.A00(2837), r13);
        r11 = new java.lang.Object[3];
        r11[0] = 0;
        r11[1] = false;
        r13 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r11);
        r16 = new java.lang.Object();
        r16.A02(X.AnonymousClass000.A00(2836), r13);
        r12 = X.AnonymousClass7TE.A1E();
        r37 = r9.audioTrack;
        r14 = new java.lang.Object[9];
        r14[0] = true;
        r14[4] = 0;
        r14[5] = 0;
        r11 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r14);
        r15 = new java.lang.Object();
        r14 = X.AnonymousClass000.A00(2832);
        r15.A02(r14, r11);
        r12.put(r37, r15);
        r11 = r9.videoTrack;
        r9 = new java.lang.Object[9];
        r9[0] = false;
        r9[4] = 1;
        r9[5] = 0;
        r15 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r9);
        r9 = new java.lang.Object();
        r9.A02(r14, r15);
        r12.put(r11, r9);
        r12 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(new java.lang.Object[]{r12});
        r11 = new java.lang.Object();
        r11.A02(X.AnonymousClass000.A00(2831), r12);
        r9 = new java.lang.Object[7];
        r9[1] = "";
        r14 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r9);
        com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r14, 2);
        com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r14, 4);
        r12 = new java.lang.Object();
        r12.A02(X.AnonymousClass000.A00(2833), r14);
        r14 = new java.lang.Object[3];
        r14[0] = X.AnonymousClass000.A00(3479);
        r9 = "{\"calling_tags\":0,\"is_meta_ai_call\":true}".getBytes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0e2d, code lost:
        if (r9 != null) goto L_0x0e31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0e2f, code lost:
        r9 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0e31, code lost:
        r14[1] = r9;
        r15 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r14);
        r14 = new java.lang.Object();
        r14.A02(X.AnonymousClass000.A00(2830), r15);
        r9 = new java.lang.Object[9];
        r9[0] = r14;
        r15 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r9);
        r14 = new java.lang.Object();
        r14.A02(X.AnonymousClass000.A00(2835), r15);
        r6 = new java.lang.Object[3];
        r6[0] = r12;
        r6[2] = r14;
        r9 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r6);
        r12 = new java.lang.Object();
        r12.A02(X.AnonymousClass000.A00(2834), r9);
        r6 = "".getBytes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0e79, code lost:
        if (r6 != null) goto L_0x0e7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0e7b, code lost:
        r6 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0e7d, code lost:
        r9 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(new java.lang.Object[]{1, r6});
        r14 = new java.lang.Object();
        r14.A02(X.AnonymousClass000.A00(2842), r9);
        r14 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(new java.lang.Object[]{X.AnonymousClass7TE.A1E(), X.Dba.A0f(1, r14)});
        r9 = new java.lang.Object();
        r9.A02(X.AnonymousClass000.A00(2843), r14);
        r14 = new java.lang.Object[21];
        r15 = java.lang.Integer.valueOf(r50);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0ebb, code lost:
        if (r15 != null) goto L_0x0ebf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0ebd, code lost:
        r15 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0ebf, code lost:
        r14[20] = r15;
        r14[14] = r16;
        r14[0] = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0ec7, code lost:
        if (r18 != null) goto L_0x0ecb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0ec9, code lost:
        r18 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0ecb, code lost:
        r14[1] = r18;
        r6 = "".getBytes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0ed1, code lost:
        if (r6 != null) goto L_0x0ed5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0ed3, code lost:
        r6 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0ed5, code lost:
        r14[4] = r6;
        r6 = X.1sa.A00(new java.lang.Object[]{r33});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0edf, code lost:
        if (r6 != null) goto L_0x0ee3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0ee1, code lost:
        r6 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0ee3, code lost:
        r14[2] = r6;
        r13 = X.1sa.A00(new java.lang.Object[]{1, 2, 5});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0ef5, code lost:
        if (r13 != null) goto L_0x0ef9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0ef7, code lost:
        r13 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0ef9, code lost:
        r14[19] = r13;
        r14[16] = 1;
        r14[17] = r17;
        r14[10] = r11;
        r14[12] = r9;
        r5 = java.util.Collections.singletonList(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0f0b, code lost:
        if (r5 != null) goto L_0x0f0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0f0d, code lost:
        r5 = com.facebook.hyperthrift.HyperThriftBase.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0f0f, code lost:
        r14[6] = r5;
        r9 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r14);
        com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r9, 1);
        com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r9, 2);
        com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r9, 6);
        com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r9, 13);
        com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r9, 19);
        r6 = new java.lang.Object();
        r6.A02(X.AnonymousClass000.A00(2838), r9);
        r5 = new java.lang.Object[30];
        r5[0] = r6;
        r6 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r5);
        r13 = new java.lang.Object();
        r12 = X.AnonymousClass000.A00(73);
        r13.A02(r12, r6);
        r11 = new java.io.ByteArrayOutputStream();
        r9 = new X.AnonymousClass46B(new X.C2605145y((java.io.OutputStream) r11));
        r7 = r34.A00;
        r7.A01(r27, r9, r26);
        r7.A01(r13, r9, r12);
        r6 = r11.toByteArray();
        r6.getClass();
        ((com.instagram.realtimeclient.RealtimeClientManager) X.AnonymousClass7TE.A14(r8.A03)).publish(X.C66579MXk.A00(463), X.0Yw.A0X(new byte[]{0}, r6), X.AnonymousClass46Y.ACKNOWLEDGED_DELIVERY, (X.C13775Tgq) null);
        X.C71143Odx.A06(X.C66953Mfm.A00(r8.A00, r51).A09.A0Z, X.C74137Ppe.A00, false, false);
        r3 = new X.C73912Pln(r35, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:?, code lost:
        r11 = r0.A06;
        r9 = (X.C60940Jty) r0.A05;
        r17 = java.lang.String.valueOf(r9.A00);
        r12 = r9.A03;
        r7 = new X.C73912Pln(r2, 6);
        r3 = new X.C63579KzS();
        r14 = r3.A00;
        r14[4610(0x1202, float:6.46E-42)] = 1;
        r14[3318(0xcf6, float:4.65E-42)] = 1;
        r14[4344(0x10f8, float:6.087E-42)] = 0;
        r14[3319(0xcf7, float:4.651E-42)] = 2;
        r14[675(0x2a3, float:9.46E-43)] = 0;
        r14[3433(0xd69, float:4.81E-42)] = 1;
        r14[4463(0x116f, float:6.254E-42)] = 1;
        r14[3511(0xdb7, float:4.92E-42)] = 1;
        r14[1928(0x788, float:2.702E-42)] = 0;
        r14[4359(0x1107, float:6.108E-42)] = 20;
        r14[2927(0xb6f, float:4.102E-42)] = 20;
        r14[2337(0x921, float:3.275E-42)] = 20;
        r14[1543(0x607, float:2.162E-42)] = 20;
        r14[2920(0xb68, float:4.092E-42)] = 20;
        r14[2960(0xb90, float:4.148E-42)] = 20;
        r14[1529(0x5f9, float:2.143E-42)] = 20;
        r14[3139(0xc43, float:4.399E-42)] = 20;
        r14[4419(0x1143, float:6.192E-42)] = 1;
        r14[4420(0x1144, float:6.194E-42)] = 1;
        r14[778(0x30a, float:1.09E-42)] = 1;
        r13 = new X.C53388GnK(r10, r3, r11, r17, r12, (X.C62320sa) r7, (X.C62320sa) r36, (X.0sP) X.JTO.A1C(r2, 2), r9.A05);
        r0.A01 = r52;
        r0.A02 = r10;
        r0.A00 = 1;
        r7 = X.C66953Mfm.A00(r8.A00, r8.A01);
        r13 = r7.A00();
        r13 = new X.C70705OHa(new X.ODE(r13, r8, r13), new X.C64439Lbu((X.C63579KzS) r13.A02), (com.instagram.model.rtc.RtcCallSource) r8.A02.getValue(), r13.A06, r13.A07, r13.A08, (X.C62320sa) r13.A04);
        r7.A03.addKeepAliveCondition(X.C66579MXk.A00(100));
        r9 = r7.A09.A0Z;
        r8 = X.JTS.A0s(r0);
        r12 = X.C71004OWb.A00;
        r12.A01("RtcRsysInteractor", X.002.A0R("startSession() started with localCallId ", r13.A02));
        r9.A0J.A00(true, false, X.Xm7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x10a2, code lost:
        if (r9.A05 == null) goto L_0x10b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x10a4, code lost:
        r12.A00("RtcRsysInteractor", "Already have pending Meta AI session. Not attempting to start another.");
        r8.EJ1(X.C66345MOc.A00, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x10ae, code lost:
        r2 = r8.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x10b3, code lost:
        r9.A05 = new X.C70585OCi(new X.C74186PqS(20, (java.lang.Object) r13, (java.lang.Object) r8), new X.C73651PhQ(r13.A00, 0));
        X.C71143Odx.A06(r9, new X.C74186PqS(21, (java.lang.Object) r9, (java.lang.Object) r13), false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x10d1, code lost:
        if (r2 != r4) goto L_0x10d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x10d3, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x1106, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x1107, code lost:
        r6 = X.C71004OWb.A00;
        r6.A00("MetaAiRsysSdk", "Scope cancelled before session ready");
        r2 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk) r0.A03;
        r4 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x1116, code lost:
        if (r4 != null) goto L_0x1118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x1120, code lost:
        if (X.0qQ.A0K(r4.A05, r0.A06) != false) goto L_0x1122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x1122, code lost:
        r6.A00("MetaAiRsysSdk", "Session UI closed before StartSessionResult available, ending session.");
        r4.A00().end(1, "call_ui_closed_before_session_ready", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x1130, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x113e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x1165, code lost:
        r1 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x1167, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:?, code lost:
        r2.A04.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x116e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r1.remove(r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:613:0x11c1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x06f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x071c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0a78 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0154 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0bcc  */
    /* JADX WARNING: Removed duplicated region for block: B:668:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            r53 = this;
            r0 = r53
            r2 = r54
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x0155;
                case 1: goto L_0x01c0;
                case 2: goto L_0x0be9;
                case 3: goto L_0x022d;
                case 4: goto L_0x023b;
                case 5: goto L_0x0290;
                case 6: goto L_0x02e9;
                case 7: goto L_0x036c;
                case 8: goto L_0x03ef;
                case 9: goto L_0x0414;
                case 10: goto L_0x044f;
                case 11: goto L_0x117f;
                case 12: goto L_0x0495;
                case 13: goto L_0x1131;
                case 14: goto L_0x0653;
                case 15: goto L_0x0767;
                case 16: goto L_0x07bf;
                case 17: goto L_0x07f0;
                case 18: goto L_0x086d;
                case 19: goto L_0x0a04;
                case 20: goto L_0x0a79;
                case 21: goto L_0x0ae2;
                case 22: goto L_0x0b7e;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r12 = 3
            r10 = 2
            r9 = 1
            r8 = 0
            if (r1 == 0) goto L_0x002e
            if (r1 == r9) goto L_0x0108
            X.0eS.A00(r2)
        L_0x0018:
            java.lang.Object r1 = r0.A03
            com.instagram.wonderwall.repository.WallPendingPostManager r1 = (com.instagram.wonderwall.repository.WallPendingPostManager) r1
            java.util.Map r1 = r1.A01
            java.lang.Object r0 = r0.A05
            com.instagram.wonderwall.model.WallPostItem r0 = (com.instagram.wonderwall.model.WallPostItem) r0
            com.instagram.wonderwall.model.WallPostInfo r0 = r0.BeB()
            java.lang.String r0 = r0.A06
        L_0x0028:
            r1.remove(r0)
        L_0x002b:
            X.0gF r4 = X.C60340gF.A00
        L_0x002d:
            return r4
        L_0x002e:
            X.0eS.A00(r2)
            java.lang.Object r6 = r0.A01
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r5 = r0.A05
            com.instagram.wonderwall.model.WallPostItem r5 = (com.instagram.wonderwall.model.WallPostItem) r5
            com.instagram.wonderwall.model.WallPostInfo r7 = r5.BeB()
            boolean r1 = r5 instanceof com.instagram.wonderwall.model.WallMediaPostItem
            if (r1 == 0) goto L_0x0146
            r11 = r5
            com.instagram.wonderwall.model.WallMediaPostItem r11 = (com.instagram.wonderwall.model.WallMediaPostItem) r11
            com.instagram.common.gallery.Medium r1 = r11.A00
            if (r1 == 0) goto L_0x0146
            java.lang.Object r3 = r0.A03
            com.instagram.wonderwall.repository.WallPendingPostManager r3 = (com.instagram.wonderwall.repository.WallPendingPostManager) r3
            java.lang.String r2 = r0.A06
            X.HMM r1 = X.HMM.UPLOADING
            com.instagram.wonderwall.model.WallPostItem r1 = com.instagram.wonderwall.repository.WallPendingPostManager.A00(r5, r1)
            com.instagram.wonderwall.repository.WallPendingPostManager.A02(r1, r3, r2)
            com.instagram.common.gallery.Medium r5 = r11.A00
            if (r5 == 0) goto L_0x0131
            X.L8f r3 = r3.A00
            r0.A01 = r6
            r0.A02 = r7
            r0.A00 = r9
            com.instagram.common.session.UserSession r14 = r3.A00
            boolean r11 = r5.CeS()
            r2 = 0
            java.lang.String r1 = X.JTQ.A0Z()
            if (r11 == 0) goto L_0x0102
            X.3Q2 r1 = X.AnonymousClass9T3.A02(r1)
        L_0x0074:
            java.lang.String r15 = r5.A0X
            int r11 = r5.A03
            long r11 = (long) r11
            r18 = 60000(0xea60, double:2.9644E-319)
            r16 = r11
            com.instagram.pendingmedia.model.ClipInfo r13 = X.Q0X.A03(r14, r15, r16, r18)
            boolean r11 = r1.A12()
            if (r11 != 0) goto L_0x0092
            com.instagram.pendingmedia.model.ClipInfo r13 = X.JTT.A0d(r5)
            float r11 = r5.A00()
            r13.A00 = r11
        L_0x0092:
            X.Q0X.A04(r13, r1)
            java.lang.String r12 = r5.A0X
            r1.A33 = r12
            r1.A3L = r12
            float r11 = r13.A00
            r1.A02 = r11
            r1.A0K = r2
            boolean r2 = r1.A12()
            if (r2 == 0) goto L_0x00b6
            java.lang.String r2 = r5.A0a
            r1.A33 = r2
            java.util.HashMap r2 = X.Q0Y.A02(r12)
            r1.A44 = r2
            java.lang.String r2 = r5.A0X
            X.JTS.A1R(r1, r2)
        L_0x00b6:
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.WONDER_WALL
            r1.A0e(r2)
            r2 = 15
            r1.A0N = r2
            X.1vN r2 = new X.1vN
            r2.<init>()
            r1.A0a(r2)
            boolean r2 = r1.A12()
            X.1ua r12 = r3.A01
            X.JTQ.A1J(r1, r12, r2)
            java.lang.String r13 = r1.A3t
            X.3Pl r11 = X.JTQ.A0m(r0)
            X.3Q2 r5 = X.JTQ.A0M(r14, r13)
            if (r5 != 0) goto L_0x00e6
            r11.resumeWith(r8)
        L_0x00df:
            java.lang.Object r2 = r11.A00()
            if (r2 != r4) goto L_0x0112
            return r4
        L_0x00e6:
            java.lang.String r1 = r5.A35
            r12.A07(r8, r1, r9)
            X.LgN r2 = new X.LgN
            r2.<init>(r3, r11, r13, r9)
            X.1Ng r9 = X.AnonymousClass1Nd.A00(r14)
            java.lang.Class<X.Lg0> r1 = X.C64674Lg0.class
            r9.A01(r2, r1)
            java.util.Map r1 = r3.A02
            r1.put(r13, r2)
            r12.A0B(r5)
            goto L_0x00df
        L_0x0102:
            X.3Q2 r1 = X.AnonymousClass9T3.A01(r1)
            goto L_0x0074
        L_0x0108:
            java.lang.Object r7 = r0.A02
            com.instagram.wonderwall.model.WallPostInfo r7 = (com.instagram.wonderwall.model.WallPostInfo) r7
            java.lang.Object r1 = r0.A01
            X.4Cq r6 = X.JTO.A1D(r1, r2)
        L_0x0112:
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x0131
            com.instagram.wonderwall.model.WallMediaPostItem r5 = new com.instagram.wonderwall.model.WallMediaPostItem
            r5.<init>(r2, r7)
            java.lang.Object r3 = r0.A03
            com.instagram.wonderwall.repository.WallPendingPostManager r3 = (com.instagram.wonderwall.repository.WallPendingPostManager) r3
            java.lang.String r2 = r0.A06
            com.instagram.wonderwall.repository.WallPendingPostManager.A02(r5, r3, r2)
            boolean r1 = X.19E.A07(r6)
            if (r1 == 0) goto L_0x0018
            r0.A01 = r8
            r0.A02 = r8
            r0.A00 = r10
            goto L_0x014e
        L_0x0131:
            java.lang.Object r4 = r0.A03
            com.instagram.wonderwall.repository.WallPendingPostManager r4 = (com.instagram.wonderwall.repository.WallPendingPostManager) r4
            java.lang.String r3 = r0.A06
            java.lang.Object r2 = r0.A05
            com.instagram.wonderwall.model.WallPostItem r2 = (com.instagram.wonderwall.model.WallPostItem) r2
            X.HMM r1 = X.HMM.UPLOAD_FAILED
            com.instagram.wonderwall.model.WallPostItem r1 = com.instagram.wonderwall.repository.WallPendingPostManager.A00(r2, r1)
            com.instagram.wonderwall.repository.WallPendingPostManager.A02(r1, r4, r3)
            goto L_0x0018
        L_0x0146:
            java.lang.Object r3 = r0.A03
            com.instagram.wonderwall.repository.WallPendingPostManager r3 = (com.instagram.wonderwall.repository.WallPendingPostManager) r3
            java.lang.String r2 = r0.A06
            r0.A00 = r12
        L_0x014e:
            java.lang.Object r1 = com.instagram.wonderwall.repository.WallPendingPostManager.A01(r5, r3, r2, r0)
            if (r1 != r4) goto L_0x0018
            return r4
        L_0x0155:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x0163
            if (r1 == r6) goto L_0x0af0
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x0163:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A02
            X.4Cq r1 = (X.C262224Cq) r1
            boolean r1 = X.19E.A07(r1)
            if (r1 == 0) goto L_0x01ab
            java.lang.Object r3 = r0.A01
            X.Kkz r3 = (X.C62699Kkz) r3
            boolean r1 = r3 instanceof X.C60796JrR
            if (r1 == 0) goto L_0x018c
            java.lang.Object r4 = r0.A05
            X.0sP r4 = (X.0sP) r4
            java.lang.String r1 = r0.A06
            X.JrR r3 = (X.C60796JrR) r3
            com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder r0 = r3.A00
            X.N1W r3 = new X.N1W
            r3.<init>(r0, r1)
        L_0x0187:
            r4.invoke(r3)
            goto L_0x002b
        L_0x018c:
            boolean r1 = r3 instanceof X.C60797JrS
            if (r1 == 0) goto L_0x01a2
            java.lang.Object r4 = r0.A05
            X.0sP r4 = (X.0sP) r4
            java.lang.String r2 = r0.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.JrS r3 = (X.C60797JrS) r3
            java.lang.String r0 = r3.A00
            X.JrW r3 = new X.JrW
            r3.<init>(r2, r1, r0)
            goto L_0x0187
        L_0x01a2:
            boolean r0 = r3 instanceof X.C60798JrT
            if (r0 != 0) goto L_0x002b
            X.Wub r3 = X.AnonymousClass7TE.A1K()
            throw r3
        L_0x01ab:
            java.lang.Object r5 = r0.A03
            com.facebook.commonavatarliveediting.CdlProviderImpl r5 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r5
            java.lang.String r3 = r0.A06
            java.lang.Object r2 = r0.A05
            X.FyJ r1 = new X.FyJ
            r1.<init>(r2, r6)
            r0.A00 = r6
            java.lang.Object r0 = com.facebook.commonavatarliveediting.CdlProviderImpl.A02(r5, r3, r0, r1)
            goto L_0x0b2b
        L_0x01c0:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 3
            r6 = 2
            r9 = 1
            if (r1 == 0) goto L_0x01d2
            if (r1 == r9) goto L_0x01ec
            if (r1 != r6) goto L_0x0af0
            X.0eS.A00(r2)     // Catch:{ CancellationException -> 0x0217 }
            goto L_0x002b
        L_0x01d2:
            X.0eS.A00(r2)
            java.lang.Object r8 = r0.A03
            com.facebook.commonavatarliveediting.CdlProviderImpl r8 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r8
            java.lang.String r5 = r0.A06
            java.lang.Object r3 = r0.A05
            r2 = 0
            X.FyJ r1 = new X.FyJ
            r1.<init>(r3, r2)
            r0.A00 = r9
            java.lang.Object r2 = com.facebook.commonavatarliveediting.CdlProviderImpl.A01(r8, r5, r0, r1)
            if (r2 != r4) goto L_0x01ef
            return r4
        L_0x01ec:
            X.0eS.A00(r2)
        L_0x01ef:
            boolean r1 = X.AnonymousClass7TE.A1a(r2)
            if (r1 == 0) goto L_0x002b
            java.lang.Object r9 = r0.A03     // Catch:{ CancellationException -> 0x0217 }
            com.facebook.commonavatarliveediting.CdlProviderImpl r9 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r9     // Catch:{ CancellationException -> 0x0217 }
            X.4CZ r1 = r9.A07     // Catch:{ CancellationException -> 0x0217 }
            java.lang.String r10 = r0.A06     // Catch:{ CancellationException -> 0x0217 }
            java.lang.Object r11 = r0.A01     // Catch:{ CancellationException -> 0x0217 }
            java.util.Map r11 = (java.util.Map) r11     // Catch:{ CancellationException -> 0x0217 }
            java.lang.Object r14 = r0.A02     // Catch:{ CancellationException -> 0x0217 }
            java.lang.Float[] r14 = (java.lang.Float[]) r14     // Catch:{ CancellationException -> 0x0217 }
            java.lang.Object r13 = r0.A05     // Catch:{ CancellationException -> 0x0217 }
            X.0sP r13 = (X.0sP) r13     // Catch:{ CancellationException -> 0x0217 }
            r12 = 0
            X.MGR r8 = new X.MGR     // Catch:{ CancellationException -> 0x0217 }
            r8.<init>((com.facebook.commonavatarliveediting.CdlProviderImpl) r9, (java.lang.String) r10, (java.util.Map) r11, (X.AnonymousClass4D7) r12, (X.0sP) r13, (java.lang.Float[]) r14)     // Catch:{ CancellationException -> 0x0217 }
            r0.A00 = r6     // Catch:{ CancellationException -> 0x0217 }
            java.lang.Object r0 = X.1Eo.A00(r0, r1, r8)     // Catch:{ CancellationException -> 0x0217 }
            goto L_0x0b2b
        L_0x0217:
            java.lang.Object r5 = r0.A03
            com.facebook.commonavatarliveediting.CdlProviderImpl r5 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r5
            java.lang.String r3 = r0.A06
            java.lang.Object r2 = r0.A05
            X.MIh r1 = new X.MIh
            r1.<init>(r2, r6)
            r0.A00 = r7
            java.lang.Object r0 = com.facebook.commonavatarliveediting.CdlProviderImpl.A02(r5, r3, r0, r1)
            if (r0 != r4) goto L_0x002b
            return r4
        L_0x022d:
            int r3 = r0.A00
            java.lang.String r1 = "Required value was null."
            r0 = 1
            if (r3 == 0) goto L_0x11dd
            if (r3 == r0) goto L_0x0af0
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x023b:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r3 = 1
            if (r1 == 0) goto L_0x0279
            if (r1 != r3) goto L_0x11ea
            X.0eS.A00(r2)
        L_0x0247:
            java.lang.Object r4 = r0.A05
            X.6Rx r4 = (X.C307896Rx) r4
            java.lang.Object r3 = r0.A02
            X.4uI r3 = (X.C277014uI) r3
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0270
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.lang.Object r1 = X.C299275ur.A00(r4, r1, r3)
            X.3Ih r2 = X.C41845B3m.A0d(r1)
        L_0x025d:
            java.lang.Object r1 = r0.A01
            X.4uI r1 = (X.C277014uI) r1
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x002b
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x11e5
            X.6Tm r0 = X.AnonymousClass6Tm.A01
            X.C299275ur.A00(r4, r0, r1)
            goto L_0x002b
        L_0x0270:
            boolean r1 = r2 instanceof X.C297815sO
            if (r1 != 0) goto L_0x025d
            X.Wub r3 = X.AnonymousClass7TE.A1K()
            throw r3
        L_0x0279:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            com.instagram.payout.api.PayoutApi r2 = new com.instagram.payout.api.PayoutApi
            r2.<init>(r1)
            java.lang.String r1 = r0.A06
            r0.A00 = r3
            java.lang.Object r2 = r2.A00(r1, r0)
            if (r2 != r4) goto L_0x0247
            return r4
        L_0x0290:
            X.1Hj r4 = X.1Hj.A02
            int r3 = r0.A00
            r1 = 1
            if (r3 == 0) goto L_0x029e
            if (r3 == r1) goto L_0x0af0
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x029e:
            X.0eS.A00(r2)
            r2 = 1041998071(0x3e1ba0f7, float:0.15198122)
            X.19S r2 = X.AnonymousClass43D.A00(r2)
            X.0qQ.A0B(r2, r1)
            java.lang.Object r12 = r0.A03
            com.instagram.business.promote.activity.PromoteActivity r12 = (com.instagram.business.promote.activity.PromoteActivity) r12
            com.instagram.common.session.UserSession r6 = r12.A0n()
            java.lang.String r8 = r0.A06
            com.instagram.business.promote.model.PromoteData r3 = r12.A00
            java.lang.String r2 = "promoteData"
            if (r3 != 0) goto L_0x02c0
            X.0qQ.A0F(r2)
            goto L_0x0950
        L_0x02c0:
            java.lang.String r7 = r3.A1A
            java.lang.String r9 = r3.A1b
            java.lang.String r10 = r3.A1H
            X.Dba.A0j(r1, r6, r8)
            r11 = 0
            X.TTB r5 = new X.TTB
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.032 r2 = X.AnonymousClass0Zq.A00(r5)
            java.lang.Object r14 = r0.A02
            java.lang.Object r11 = r0.A01
            java.lang.Object r13 = r0.A05
            X.WrA r10 = new X.WrA
            r15 = r8
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.A00 = r1
            java.lang.Object r0 = r2.collect(r10, r0)
            goto L_0x0b2b
        L_0x02e9:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r9 = 0
            r7 = 3
            r8 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0332
            if (r1 == r6) goto L_0x034e
            if (r1 != r8) goto L_0x0af0
            X.0eS.A00(r2)
        L_0x02fa:
            if (r2 == 0) goto L_0x002b
            java.lang.Object r3 = r0.A01
            X.0sa r3 = (X.C62320sa) r3
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0329
            r3.invoke()
            X.3Ih r2 = X.C51967G9n.A0d()
        L_0x030b:
            java.lang.Object r6 = r0.A05
            X.0sa r6 = (X.C62320sa) r6
            java.lang.Object r5 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            java.lang.String r3 = r0.A06
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x002b
            boolean r1 = r2 instanceof X.C297815sO
            if (r1 == 0) goto L_0x11ef
            r6.invoke()
            r0.A00 = r7
            r1 = 0
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A06(r5, r3, r0, r1)
            goto L_0x0b2b
        L_0x0329:
            boolean r1 = r2 instanceof X.C297815sO
            if (r1 != 0) goto L_0x030b
            X.Wub r3 = X.AnonymousClass7TE.A1K()
            throw r3
        L_0x0332:
            X.0eS.A00(r2)
            java.lang.Object r3 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r3 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r3
            X.7aH r2 = X.C51968G9o.A0g(r3)
            java.lang.String r1 = r0.A06
            X.7dj r5 = X.C335067cK.A01(r2, r1, r9)
            r0.A02 = r5
            r0.A00 = r6
            java.lang.Object r1 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A06(r3, r1, r0, r6)
            if (r1 != r4) goto L_0x0355
            return r4
        L_0x034e:
            java.lang.Object r5 = r0.A02
            X.7dj r5 = (X.C335907dj) r5
            X.0eS.A00(r2)
        L_0x0355:
            if (r5 == 0) goto L_0x002b
            java.lang.Object r1 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r1 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r1
            com.instagram.common.session.UserSession r3 = r1.A0B
            java.lang.String r2 = r5.A0M
            java.lang.String r1 = r5.A0K
            r0.A02 = r9
            r0.A00 = r8
            java.lang.Object r2 = com.instagram.comments.mvvm.data.network.MediaCommentPinUnpinNetworkRequestsKt.A00(r3, r2, r1, r0)
            if (r2 != r4) goto L_0x02fa
            return r4
        L_0x036c:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r9 = 0
            r8 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x03b4
            if (r1 == r7) goto L_0x03d1
            if (r1 != r6) goto L_0x0af0
            X.0eS.A00(r2)
        L_0x037d:
            if (r2 == 0) goto L_0x002b
            java.lang.Object r3 = r0.A01
            X.0sa r3 = (X.C62320sa) r3
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x03ab
            r3.invoke()
            X.3Ih r2 = X.C51967G9n.A0d()
        L_0x038e:
            java.lang.Object r6 = r0.A05
            X.0sa r6 = (X.C62320sa) r6
            java.lang.Object r5 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            java.lang.String r3 = r0.A06
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x002b
            boolean r1 = r2 instanceof X.C297815sO
            if (r1 == 0) goto L_0x11f4
            r6.invoke()
            r0.A00 = r8
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A06(r5, r3, r0, r7)
            goto L_0x0b2b
        L_0x03ab:
            boolean r1 = r2 instanceof X.C297815sO
            if (r1 != 0) goto L_0x038e
            X.Wub r3 = X.AnonymousClass7TE.A1K()
            throw r3
        L_0x03b4:
            X.0eS.A00(r2)
            java.lang.Object r3 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r3 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r3
            X.7aH r1 = X.C51968G9o.A0g(r3)
            java.lang.String r2 = r0.A06
            X.7dj r5 = X.C335067cK.A01(r1, r2, r9)
            r0.A02 = r5
            r0.A00 = r7
            r1 = 0
            java.lang.Object r1 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A06(r3, r2, r0, r1)
            if (r1 != r4) goto L_0x03d8
            return r4
        L_0x03d1:
            java.lang.Object r5 = r0.A02
            X.7dj r5 = (X.C335907dj) r5
            X.0eS.A00(r2)
        L_0x03d8:
            if (r5 == 0) goto L_0x002b
            java.lang.Object r1 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r1 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r1
            com.instagram.common.session.UserSession r3 = r1.A0B
            java.lang.String r2 = r5.A0M
            java.lang.String r1 = r5.A0K
            r0.A02 = r9
            r0.A00 = r6
            java.lang.Object r2 = com.instagram.comments.mvvm.data.network.MediaCommentPinUnpinNetworkRequestsKt.A01(r3, r2, r1, r0)
            if (r2 != r4) goto L_0x037d
            return r4
        L_0x03ef:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r3 = 1
            if (r1 == 0) goto L_0x03fd
            if (r1 == r3) goto L_0x0af0
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x03fd:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A02
            X.07V r2 = X.JTO.A0J(r1)
            java.lang.Object r1 = r0.A01
            X.07U r1 = (X.07U) r1
            r9 = 0
            java.lang.Object r6 = r0.A03
            java.lang.Object r7 = r0.A05
            java.lang.String r8 = r0.A06
            r10 = 4
            goto L_0x07e3
        L_0x0414:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x0422
            if (r1 == r9) goto L_0x0af0
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x0422:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A03
            X.Jg2 r1 = (X.C60121Jg2) r1
            X.6dC r8 = r1.A00
            com.instagram.common.session.UserSession r7 = r1.A01
            java.lang.Object r6 = r0.A05
            X.1Xo r6 = (X.AnonymousClass1Xo) r6
            java.lang.String r5 = r0.A06
            java.lang.Object r3 = r0.A01
            X.9tK r3 = (X.C391589tK) r3
            java.lang.Object r2 = r0.A02
            X.28D r2 = (X.28D) r2
            r0.A00 = r9
            r1 = 2252(0x8cc, float:3.156E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r1)
            r9 = r3
            r10 = r2
            r11 = r7
            r12 = r6
            r13 = r5
            r15 = r0
            java.lang.Object r0 = r8.A01(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0b2b
        L_0x044f:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0460
            if (r1 == r7) goto L_0x0483
            if (r1 == r8) goto L_0x0af0
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x0460:
            X.0eS.A00(r2)
            java.lang.Object r6 = r0.A05
            X.3jv r6 = (X.C249523jv) r6
            java.lang.Object r1 = r0.A03
            X.KWV r1 = (X.KWV) r1
            com.instagram.genai.imageservice.service.GenAIImagineService r5 = r1.A01
            java.lang.String r3 = r0.A06
            java.lang.Object r2 = r0.A01
            X.Khb r2 = (X.C62545Khb) r2
            X.KS6 r1 = new X.KS6
            r1.<init>(r2, r3)
            r0.A02 = r6
            r0.A00 = r7
            java.lang.Object r2 = r5.A02(r1, r0)
            if (r2 != r4) goto L_0x048a
            return r4
        L_0x0483:
            java.lang.Object r6 = r0.A02
            X.3jv r6 = (X.C249523jv) r6
            X.0eS.A00(r2)
        L_0x048a:
            r1 = 0
            r0.A02 = r1
            r0.A00 = r8
            java.lang.Object r0 = r6.ELH(r2, r0)
            goto L_0x0b2b
        L_0x0495:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x049f
            if (r1 != r6) goto L_0x11f9
            goto L_0x04c1
        L_0x049f:
            X.0eS.A00(r2)
            java.lang.Object r5 = r0.A03
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r5 = (com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController) r5
            java.lang.String r3 = r0.A06
            X.0eM r1 = r5.A0P     // Catch:{ all -> 0x04c7 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x04c7 }
            com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r2 = (com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl) r2     // Catch:{ all -> 0x04c7 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x04c7 }
            r1.toString()     // Catch:{ all -> 0x04c7 }
            java.lang.String r1 = r5.A06     // Catch:{ all -> 0x04c7 }
            r0.A00 = r6     // Catch:{ all -> 0x04c7 }
            java.lang.Object r2 = r2.A00(r3, r1, r0)     // Catch:{ all -> 0x04c7 }
            if (r2 != r4) goto L_0x04c4
            goto L_0x11fe
        L_0x04c1:
            X.0eS.A00(r2)     // Catch:{ all -> 0x04c7 }
        L_0x04c4:
            X.LOo r2 = (X.C64121LOo) r2     // Catch:{ all -> 0x04c7 }
            goto L_0x04cc
        L_0x04c7:
            r1 = move-exception
            X.0eQ r2 = X.JTO.A1B(r1)
        L_0x04cc:
            java.lang.Object r1 = r0.A03
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r1 = (com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController) r1
            java.lang.Object r3 = r0.A01
            X.0sa r3 = (X.C62320sa) r3
            boolean r0 = r2 instanceof X.0eQ
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0620
            r0 = r2
            X.LOo r0 = (X.C64121LOo) r0
            java.lang.String r14 = X.C51972G9s.A0n()
            java.util.List r5 = r0.A01
            boolean r0 = X.AnonymousClass7TE.A1b(r5)
            if (r0 == 0) goto L_0x05fb
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r5.iterator()
        L_0x04f1:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x050d
            java.lang.Object r8 = r9.next()
            X.LFl r8 = (X.C63961LFl) r8
            java.lang.Integer r7 = r8.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r7 != r0) goto L_0x050b
            java.lang.String r0 = r8.A01
        L_0x0505:
            if (r0 == 0) goto L_0x04f1
            r4.add(r0)
            goto L_0x04f1
        L_0x050b:
            r0 = 0
            goto L_0x0505
        L_0x050d:
            X.9JF r0 = r1.A0S
            java.lang.String r7 = r0.A05
            java.lang.String r0 = r1.A05
            boolean r7 = X.0qQ.A0K(r7, r0)
            X.9JF r0 = r1.A0S
            java.lang.Object r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r7 == 0) goto L_0x0524
            if (r0 == 0) goto L_0x0524
            r6 = 0
        L_0x0524:
            r0 = 10
            if (r6 == 0) goto L_0x0563
            X.LeP r13 = r1.A0C
            java.lang.String r15 = r1.A04
            java.lang.String r9 = r1.A05
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r12 = r5.iterator()
        L_0x0536:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x0550
            java.lang.Object r7 = r12.next()
            X.LFl r7 = (X.C63961LFl) r7
            java.lang.String r7 = r7.A01
            long r10 = X.DbZ.A07(r7)
            java.lang.Long r7 = X.JTO.A0y(r10)
            r8.add(r7)
            goto L_0x0536
        L_0x0550:
            X.N4G r7 = r1.A01
            int r7 = r7.A00
            java.lang.String r17 = java.lang.String.valueOf(r7)
            r20 = 1
            r18 = r8
            r19 = r4
            r16 = r9
            r13.A00(r14, r15, r16, r17, r18, r19, r20)
        L_0x0563:
            X.0eM r7 = r1.A0Q
            java.lang.Object r7 = r7.getValue()
            X.MVY r7 = (X.MVY) r7
            java.util.List r7 = r7.AjS(r5)
            int r9 = r7.size()
            X.0eM r8 = r1.A0L
            int r8 = X.DbX.A07(r8)
            if (r9 < r8) goto L_0x05fb
            if (r6 == 0) goto L_0x05d1
            X.LeP r15 = r1.A0C
            java.lang.String r10 = r1.A04
            java.lang.String r9 = r1.A05
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r13 = r7.iterator()
        L_0x058b:
            boolean r11 = r13.hasNext()
            if (r11 == 0) goto L_0x05ba
            X.6o8 r12 = X.JTO.A0a(r13)
            java.lang.String r11 = r12.A0a
            X.0qQ.A07(r11)
            java.lang.Long r11 = X.00y.A0n(r0, r11)
            if (r11 != 0) goto L_0x05b5
            java.lang.String r11 = r12.A0S
            X.0qQ.A07(r11)
            java.lang.Long r11 = X.00y.A0n(r0, r11)
            if (r11 != 0) goto L_0x05b5
            r11 = 0
        L_0x05ad:
            java.lang.Long r11 = X.JTO.A0y(r11)
            r8.add(r11)
            goto L_0x058b
        L_0x05b5:
            long r11 = r11.longValue()
            goto L_0x05ad
        L_0x05ba:
            X.N4G r0 = r1.A01
            int r0 = r0.A00
            java.lang.String r19 = java.lang.String.valueOf(r0)
            r22 = 0
            r16 = r14
            r17 = r10
            r18 = r9
            r20 = r8
            r21 = r4
            r15.A00(r16, r17, r18, r19, r20, r21, r22)
        L_0x05d1:
            if (r6 == 0) goto L_0x05f8
            X.0eM r0 = r1.A0N
            boolean r0 = X.G9t.A1b(r0)
            if (r0 == 0) goto L_0x05df
            java.util.List r7 = X.0jo.A1G(r7)
        L_0x05df:
            java.lang.String r4 = r1.A05
            X.9JF r0 = new X.9JF
            r0.<init>(r4, r14, r5, r7)
        L_0x05e6:
            r1.A0S = r0
            X.0eM r0 = r1.A0J
            boolean r0 = X.G9t.A1b(r0)
            if (r0 != 0) goto L_0x0620
            java.util.concurrent.Executor r4 = r1.A0D
            X.M3y r0 = new X.M3y
            r0.<init>(r3)
            goto L_0x061b
        L_0x05f8:
            X.9JF r0 = r1.A0S
            goto L_0x05e6
        L_0x05fb:
            X.9JF r6 = r1.A0S
            java.lang.String r5 = r1.A05
            X.0sn r4 = X.0sn.A00
            X.9JF r0 = new X.9JF
            r0.<init>(r5, r14, r4, r4)
            r1.A0S = r0
            java.lang.Object r0 = r6.A02
            if (r0 == 0) goto L_0x0620
            X.0eM r0 = r1.A0J
            boolean r0 = X.G9t.A1b(r0)
            if (r0 != 0) goto L_0x0620
            java.util.concurrent.Executor r4 = r1.A0D
            X.M3z r0 = new X.M3z
            r0.<init>(r3)
        L_0x061b:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r4.execute(r0)
        L_0x0620:
            java.lang.Throwable r7 = X.0eR.A00(r2)
            if (r7 == 0) goto L_0x002b
            X.9JF r6 = r1.A0S
            java.lang.String r5 = X.C51972G9s.A0n()
            java.lang.String r4 = r1.A05
            X.0sn r2 = X.0sn.A00
            X.9JF r0 = new X.9JF
            r0.<init>(r4, r5, r2, r2)
            r1.A0S = r0
            boolean r0 = r7 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x002b
            java.lang.Object r0 = r6.A02
            if (r0 == 0) goto L_0x002b
            X.0eM r0 = r1.A0J
            boolean r0 = X.G9t.A1b(r0)
            if (r0 != 0) goto L_0x002b
            java.util.concurrent.Executor r1 = r1.A0D
            X.M40 r0 = new X.M40
            r0.<init>(r3)
            r1.execute(r0)
            goto L_0x002b
        L_0x0653:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r10 = 3
            r8 = 2
            r7 = 1
            r11 = 0
            if (r1 == 0) goto L_0x06bd
            if (r1 == r7) goto L_0x06cf
            if (r1 == r8) goto L_0x06f5
            java.lang.Object r3 = r0.A03
            X.3JC r3 = (X.AnonymousClass3JC) r3
            java.lang.Object r6 = r0.A02
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            X.0eS.A00(r2)
        L_0x066c:
            X.3JC r2 = (X.AnonymousClass3JC) r2
            java.lang.Object r5 = r3.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0720
            java.lang.Class<X.Box> r4 = X.C42981Box.class
            r9 = 0
            r1 = 1961(0x7a9, float:2.748E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            r1 = 1954061238(0x74789bb6, float:7.87871E31)
            X.3lr r5 = r5.getOptionalTreeField(r9, r3, r4, r1)
            if (r5 == 0) goto L_0x0720
            java.lang.Class<X.Bow> r4 = X.C42980Bow.class
            r1 = 1905(0x771, float:2.67E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            r1 = 1298474816(0x4d652740, float:2.40284672E8)
            com.google.common.collect.ImmutableList r1 = r5.getRequiredCompactedTreeListField(r9, r3, r4, r1)
            if (r1 == 0) goto L_0x0720
            X.3kO r8 = r1.iterator()
            X.0qQ.A07(r8)
        L_0x069e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0720
            X.3lr r3 = X.C41845B3m.A0V(r8)
            java.lang.String r1 = "suggestion"
            java.lang.String r5 = r3.getOptionalStringField(r9, r1)
            if (r5 == 0) goto L_0x069e
            X.9VB r4 = X.AnonymousClass9VB.TEXT
            java.lang.String r3 = ""
            com.instagram.model.direct.DirectSearchPrompt r1 = new com.instagram.model.direct.DirectSearchPrompt
            r1.<init>(r4, r5, r3, r3)
            r6.add(r1)
            goto L_0x069e
        L_0x06bd:
            X.0eS.A00(r2)
            java.lang.Object r9 = r0.A02
            X.4Cq r9 = (X.C262224Cq) r9
            r0.A02 = r9
            r0.A00 = r7
            java.lang.Object r1 = X.C241603Pv.A00(r0)
            if (r1 != r4) goto L_0x06d5
            return r4
        L_0x06cf:
            java.lang.Object r1 = r0.A02
            X.4Cq r9 = X.JTO.A1D(r1, r2)
        L_0x06d5:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.lang.Object r5 = r0.A01
            java.lang.String r3 = r0.A06
            r2 = 35
            X.MFW r1 = new X.MFW
            r1.<init>(r5, r3, r11, r2)
            X.2Q8 r1 = X.JTO.A1E(r1, r9)
            r0.A02 = r9
            r0.A03 = r6
            r0.A00 = r8
            java.lang.Object r2 = r1.A0E(r0)
            if (r2 != r4) goto L_0x06ff
            return r4
        L_0x06f5:
            java.lang.Object r6 = r0.A03
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r1 = r0.A02
            X.4Cq r9 = X.JTO.A1D(r1, r2)
        L_0x06ff:
            X.3JC r2 = (X.AnonymousClass3JC) r2
            java.lang.Object r8 = r0.A01
            java.lang.String r5 = r0.A06
            r3 = 34
            X.MFW r1 = new X.MFW
            r1.<init>(r8, r5, r11, r3)
            X.2Q8 r1 = X.JTO.A1E(r1, r9)
            r0.A02 = r6
            r0.A03 = r2
            r0.A00 = r10
            java.lang.Object r1 = r1.A0E(r0)
            if (r1 == r4) goto L_0x002d
            r3 = r2
            r2 = r1
            goto L_0x066c
        L_0x0720:
            java.lang.Object r5 = r2.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0744
            java.lang.Class<X.BoY> r3 = X.BoY.class
            r4 = 0
            r1 = 1960(0x7a8, float:2.747E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 427598018(0x197ca0c2, float:1.30605594E-23)
            X.3lr r3 = r5.getOptionalTreeField(r4, r2, r3, r1)
            if (r3 == 0) goto L_0x0744
            X.NkX r2 = X.C69393NkX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "destination"
            java.lang.Enum r2 = r3.getOptionalEnumField(r4, r1, r2)
            X.NkX r2 = (X.C69393NkX) r2
            if (r2 != 0) goto L_0x0746
        L_0x0744:
            X.NkX r2 = X.C69393NkX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
        L_0x0746:
            java.lang.Object r1 = r0.A05
            X.OAH r1 = (X.OAH) r1
            X.0qQ.A0B(r6, r7)
            com.instagram.model.direct.DirectSearchMetaAIResponse r0 = new com.instagram.model.direct.DirectSearchMetaAIResponse
            r0.<init>()
            r0.A01 = r6
            r0.A00 = r2
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.PPd r1 = r1.A00
            r1.A01 = r0
            X.7fw r0 = r1.A00
            if (r0 == 0) goto L_0x002b
            r0.Dam(r1)
            goto L_0x002b
        L_0x0767:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 1
            if (r1 == 0) goto L_0x0775
            if (r1 == r8) goto L_0x0af0
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x0775:
            X.0eS.A00(r2)
            java.lang.Object r10 = r0.A03
            X.Ne7 r10 = (X.C69068Ne7) r10
            com.instagram.common.session.UserSession r5 = r10.A00
            X.0Tu r3 = X.0Tu.A05
            r1 = 36325385985733550(0x810dbf000233ae, double:3.035658595742212E-306)
            boolean r1 = X.182.A06(r3, r5, r1)
            r9 = 0
            java.lang.Object r7 = r0.A02
            X.0r6 r7 = (X.AnonymousClass0r6) r7
            java.lang.Object r6 = r0.A05
            X.0r6 r6 = (X.AnonymousClass0r6) r6
            if (r1 == 0) goto L_0x07b2
            java.lang.Object r5 = r0.A01
            X.0r6 r5 = (X.AnonymousClass0r6) r5
            java.lang.String r3 = r0.A06
            r2 = 0
            X.MHt r1 = new X.MHt
            r1.<init>(r10, r3, r9, r2)
            X.0pt r1 = X.AnonymousClass10H.A00(r1, r7, r6, r5)
        L_0x07a4:
            r2 = 20
            X.MCm r2 = X.MCm.A00(r10, r2)
            r0.A00 = r8
            java.lang.Object r0 = r1.collect(r2, r0)
            goto L_0x0b2b
        L_0x07b2:
            java.lang.String r3 = r0.A06
            r2 = 0
            X.Ima r1 = new X.Ima
            r1.<init>((X.C69068Ne7) r10, (java.lang.String) r3, (X.AnonymousClass4D7) r9, (int) r2)
            X.0pm r1 = X.AnonymousClass10H.A03(r1, r7, r6)
            goto L_0x07a4
        L_0x07bf:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r3 = 1
            if (r1 == 0) goto L_0x07cd
            if (r1 == r3) goto L_0x0af0
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x07cd:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A02
            X.07V r2 = X.JTO.A0J(r1)
            java.lang.Object r1 = r0.A01
            X.07U r1 = (X.07U) r1
            r9 = 0
            java.lang.Object r6 = r0.A03
            java.lang.Object r7 = r0.A05
            java.lang.String r8 = r0.A06
            r10 = 12
        L_0x07e3:
            X.MH6 r5 = new X.MH6
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A00 = r3
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r1, r2, r0, r5)
            goto L_0x0b2b
        L_0x07f0:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x084d
            if (r1 != r5) goto L_0x11ff
            java.lang.Object r3 = r0.A02
            X.4A6 r3 = (X.AnonymousClass4A6) r3
            X.0eS.A00(r2)
        L_0x0800:
            boolean r1 = X.AnonymousClass7TE.A1a(r2)
            if (r1 == 0) goto L_0x084a
            java.util.List r1 = r3.A05
            java.util.ArrayList r8 = X.00k.A0U(r1)
            java.lang.String r4 = r0.A06
            r2 = 32
            X.MYK r1 = new X.MYK
            r1.<init>(r4, r2)
            X.018.A1A(r8, r1)
            java.lang.Object r1 = r0.A03
            com.instagram.friendmap.data.FriendMapRepository r1 = (com.instagram.friendmap.data.FriendMapRepository) r1
            X.05G r2 = r1.A0I
        L_0x081e:
            java.lang.Object r4 = r2.getValue()
            X.4A5 r6 = r3.A04
            long r12 = r3.A03
            boolean r14 = r3.A07
            int r9 = r3.A00
            int r10 = r3.A01
            java.util.List r7 = r3.A06
            int r11 = r3.A02
            r1 = 0
            X.DbW.A1N(r6, r1, r7)
            r1 = 7
            X.0qQ.A0B(r8, r1)
            X.4A6 r5 = new X.4A6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14)
            boolean r1 = r2.AIY(r4, r5)
            if (r1 == 0) goto L_0x081e
            java.lang.Object r0 = r0.A01
        L_0x0845:
            X.DbS.A1U(r0)
            goto L_0x002b
        L_0x084a:
            java.lang.Object r0 = r0.A05
            goto L_0x0845
        L_0x084d:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A03
            com.instagram.friendmap.data.FriendMapRepository r2 = (com.instagram.friendmap.data.FriendMapRepository) r2
            X.05G r1 = r2.A0I
            java.lang.Object r3 = r1.getValue()
            X.4A6 r3 = (X.AnonymousClass4A6) r3
            X.4A4 r1 = r2.A09
            java.lang.String r2 = r0.A06
            r0.A02 = r3
            r0.A00 = r5
            com.instagram.friendmap.data.FriendMapGraphQLImpl r1 = r1.A00
            java.lang.Object r2 = r1.A06(r2, r0)
            if (r2 != r4) goto L_0x0800
            return r4
        L_0x086d:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r3 = 0
            r5 = 1
            if (r1 == 0) goto L_0x089a
            if (r1 != r5) goto L_0x1204
            X.0eS.A00(r2)
        L_0x087a:
            X.3Ii r2 = (X.C239803Ii) r2
            java.lang.Object r10 = r0.A03
            X.JgJ r10 = (X.C60138JgJ) r10
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x09fb
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.CEf r0 = (X.C43813CEf) r0
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            X.N2y r14 = r0.A01
            if (r14 != 0) goto L_0x08c7
            X.C41845B3m.A0v()
            X.00P r3 = X.AnonymousClass00P.createAndThrow()
            throw r3
        L_0x089a:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A03
            X.JgJ r1 = (X.C60138JgJ) r1
            com.instagram.common.session.UserSession r7 = r1.A00
            java.lang.Object r8 = r0.A05
            X.Nko r8 = (X.C69409Nko) r8
            java.lang.String r11 = r0.A06
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r6 = r0.A02
            X.JwI r6 = (X.C61080JwI) r6
            java.lang.Object r9 = r0.A01
            X.Nkk r9 = (X.C69406Nkk) r9
            r0.A00 = r5
            r12 = 10
            X.1OC r2 = X.C70307O1l.A00(r6, r7, r8, r9, r10, r11, r12)
            r1 = 1716110492(0x6649c49c, float:2.3820562E23)
            java.lang.Object r2 = r2.A00(r1, r0)
            if (r2 != r4) goto L_0x087a
            return r4
        L_0x08c7:
            com.instagram.common.session.UserSession r0 = r10.A00
            r26 = r0
            X.1E4.A00(r26)
            X.JwI r2 = r14.A00
            if (r2 == 0) goto L_0x08df
            java.lang.Object r0 = r2.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x08df
            boolean r1 = X.AnonymousClass7TE.A1b(r0)
            r0 = 1
            if (r1 == r5) goto L_0x08e0
        L_0x08df:
            r0 = 0
        L_0x08e0:
            if (r0 == 0) goto L_0x09af
            if (r2 == 0) goto L_0x09af
            java.lang.Object r0 = r2.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x09af
            java.util.ArrayList r19 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r18 = r0.iterator()
            r25 = 0
        L_0x08f4:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x09b1
            java.lang.Object r13 = r18.next()
            X.BHV r13 = (X.BHV) r13
            r0 = r26
            java.lang.String r15 = r0.A06
            java.util.List r2 = r13.A03
            com.instagram.api.schemas.StoryPromptTappableData r12 = r13.A00
            java.util.List r9 = r12.A0R
            java.util.List r8 = r13.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x0982
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            if (r0 == 0) goto L_0x0982
            boolean r0 = X.AnonymousClass7TE.A1b(r8)
            if (r0 == 0) goto L_0x0982
            int r1 = r2.size()
            int r0 = r9.size()
            if (r1 != r0) goto L_0x0982
            int r1 = r2.size()
            int r0 = r8.size()
            if (r1 != r0) goto L_0x0982
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r2)
            r4 = 0
            java.util.Iterator r17 = r2.iterator()
        L_0x093f:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x097d
            java.lang.Object r3 = r17.next()
            int r16 = r4 + 1
            if (r4 >= 0) goto L_0x0955
            X.0sr.A1T()
        L_0x0950:
            X.00P r3 = X.AnonymousClass00P.createAndThrow()
            throw r3
        L_0x0955:
            java.lang.String r3 = (java.lang.String) r3
            com.instagram.user.model.User r0 = X.DbS.A0g(r9, r4)
            X.1Nr r2 = new X.1Nr
            r2.<init>(r0)
            boolean r1 = X.DbV.A1Z(r0, r15)
            com.instagram.model.reels.Reel r0 = new com.instagram.model.reels.Reel
            r0.<init>(r2, r3, r1)
            com.instagram.reels.store.ReelStore r1 = com.instagram.reels.store.ReelStore.A03(r26)
            r1.A0X(r0)
            java.lang.Object r1 = r8.get(r4)
            r7.add(r1)
            r6.add(r0)
            r4 = r16
            goto L_0x093f
        L_0x097d:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r6, r7)
            goto L_0x0983
        L_0x0982:
            r0 = 0
        L_0x0983:
            X.BHW r3 = r13.A01
            r1 = 0
            if (r0 == 0) goto L_0x09ad
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
        L_0x0990:
            X.N5v r0 = new X.N5v
            r20 = r0
            r21 = r12
            r22 = r3
            r23 = r2
            r24 = r1
            r20.<init>(r21, r22, r23, r24, r25)
            r11.add(r0)
            int r25 = r25 + 1
            X.0gF r1 = X.C60340gF.A00
            r0 = r19
            r0.add(r1)
            goto L_0x08f4
        L_0x09ad:
            r2 = r1
            goto L_0x0990
        L_0x09af:
            r25 = 0
        L_0x09b1:
            java.util.List r1 = r14.A02
            if (r1 == 0) goto L_0x09e9
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 != r5) goto L_0x09e9
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x09c3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x09e9
            java.lang.Object r0 = r1.next()
            X.BHV r0 = (X.BHV) r0
            com.instagram.api.schemas.StoryPromptTappableData r4 = r0.A00
            X.BHW r0 = r0.A01
            r6 = 0
            X.N5v r3 = new X.N5v
            r5 = r0
            r7 = r6
            r8 = r25
            r3.<init>(r4, r5, r6, r7, r8)
            boolean r0 = r11.add(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.add(r0)
            goto L_0x09c3
        L_0x09e9:
            X.05G r3 = r10.A01
            java.util.List r2 = X.00k.A0a(r11)
            r1 = 31
            X.JwG r0 = new X.JwG
            r0.<init>((java.util.List) r2, (int) r1)
            r3.Epw(r0)
            goto L_0x002b
        L_0x09fb:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002b
            X.Wub r3 = X.AnonymousClass7TE.A1K()
            throw r3
        L_0x0a04:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r14 = 2
            r7 = 1
            r13 = 0
            if (r1 == 0) goto L_0x0a1e
            if (r1 == r7) goto L_0x0a57
            if (r1 != r14) goto L_0x1209
            java.lang.Object r1 = r0.A02
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            X.0eS.A00(r2)
        L_0x0a18:
            java.lang.String r2 = (java.lang.String) r2
            r1.A2M = r2
            goto L_0x002b
        L_0x0a1e:
            X.0eS.A00(r2)
            java.lang.Object r8 = r0.A02
            X.4Cq r8 = (X.C262224Cq) r8
            java.lang.Object r11 = r0.A01
            X.LP8 r11 = (X.LP8) r11
            X.37k r1 = r11.A0E
            X.3Q2 r6 = r11.A0D
            r1.EG0(r6)
            java.lang.Object r10 = r0.A05
            java.lang.String r12 = r0.A06
            X.MGk r9 = new X.MGk
            r9.<init>(r10, r11, r12, r13, r14)
            X.19B r5 = X.19B.A00
            X.2Q8 r3 = X.1Eo.A02(r5, r9, r8)
            r2 = 35
            X.Fy6 r1 = new X.Fy6
            r1.<init>((java.lang.Object) r11, (X.AnonymousClass4D7) r13, (int) r2)
            X.2Q8 r5 = X.1Eo.A02(r5, r1, r8)
            r0.A02 = r5
            r0.A03 = r6
            r0.A00 = r7
            java.lang.Object r2 = r3.A0E(r0)
            if (r2 != r4) goto L_0x0a62
            return r4
        L_0x0a57:
            java.lang.Object r6 = r0.A03
            X.3Q2 r6 = (X.AnonymousClass3Q2) r6
            java.lang.Object r5 = r0.A02
            X.2Q9 r5 = (X.AnonymousClass2Q9) r5
            X.0eS.A00(r2)
        L_0x0a62:
            java.lang.String r2 = (java.lang.String) r2
            r6.A2N = r2
            java.lang.Object r1 = r0.A01
            X.LP8 r1 = (X.LP8) r1
            X.3Q2 r1 = r1.A0D
            r0.A02 = r1
            r0.A03 = r13
            r0.A00 = r14
            java.lang.Object r2 = X.JTO.A10(r5, r0)
            if (r2 != r4) goto L_0x0a18
            return r4
        L_0x0a79:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 1
            if (r1 == 0) goto L_0x0aad
            if (r1 != r7) goto L_0x120e
            java.lang.Object r6 = r0.A02
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r1 = r0.A01
            X.4Cq r5 = X.JTO.A1D(r1, r2)
        L_0x0a8c:
            X.FGY r2 = (X.FGY) r2
            X.4Cc r1 = r5.ArX()
            boolean r1 = X.AnonymousClass5H8.A03(r1)
            if (r1 == 0) goto L_0x002b
            if (r2 == 0) goto L_0x002b
            android.view.View r2 = r2.A05(r6)
            if (r2 == 0) goto L_0x002b
            java.lang.Object r1 = r0.A05
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r2)
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x002b
        L_0x0aad:
            X.0eS.A00(r2)
            java.lang.Object r5 = r0.A01
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r1 = r0.A03
            X.E1K r1 = (X.E1K) r1
            androidx.fragment.app.FragmentActivity r6 = r1.requireActivity()
            X.0eM r1 = r1.A02
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.0xx r1 = X.AnonymousClass07a.A00(r6)
            com.instagram.nme.contextualpromo.ContextualPromoHelper r2 = new com.instagram.nme.contextualpromo.ContextualPromoHelper
            r2.<init>(r3, r1)
            X.Kiz r8 = X.C62628Kiz.INSET_BANNER
            java.lang.String r1 = r0.A06
            r11 = 0
            r0.A01 = r5
            r0.A02 = r6
            r0.A00 = r7
            java.lang.String r9 = "IG_ENHANCED_LINKS_CONSUMPTION_BOTTOM_SHEET"
            r7 = r2
            r10 = r1
            r12 = r0
            java.lang.Object r2 = r7.A00(r8, r9, r10, r11, r12)
            if (r2 != r4) goto L_0x0a8c
            return r4
        L_0x0ae2:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x0af5
            if (r1 == r6) goto L_0x0af0
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x0af0:
            X.0eS.A00(r2)
            goto L_0x002b
        L_0x0af5:
            X.0eS.A00(r2)
            java.lang.Object r3 = r0.A03
            X.U8e r3 = (X.C14768U8e) r3
            X.0V2 r7 = r3.A09
            java.lang.String r2 = r3.A06
            if (r2 == 0) goto L_0x0b30
            java.lang.String r1 = r0.A06
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0b30
            java.lang.String r1 = r3.A07
            if (r1 != 0) goto L_0x0b20
            X.0eM r1 = r3.A08
            java.lang.Object r1 = r1.getValue()
            X.17i r1 = (X.17i) r1
            com.instagram.user.model.User r1 = r1.A02(r2)
            if (r1 == 0) goto L_0x0b2e
            java.lang.String r1 = r1.getUsername()
        L_0x0b20:
            X.Ur7 r3 = new X.Ur7
            r3.<init>(r1)
        L_0x0b25:
            r0.A00 = r6
            java.lang.Object r0 = r7.emit(r3, r0)
        L_0x0b2b:
            if (r0 != r4) goto L_0x002b
            return r4
        L_0x0b2e:
            r1 = r2
            goto L_0x0b20
        L_0x0b30:
            java.lang.String r2 = r3.A04
            if (r2 == 0) goto L_0x0b5a
            java.lang.String r1 = r0.A06
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0b5a
            java.lang.String r1 = r3.A05
            if (r1 != 0) goto L_0x0b52
            X.0eM r1 = r3.A08
            java.lang.Object r1 = r1.getValue()
            X.17i r1 = (X.17i) r1
            com.instagram.user.model.User r1 = r1.A02(r2)
            if (r1 == 0) goto L_0x0b58
            java.lang.String r1 = r1.getUsername()
        L_0x0b52:
            X.Ur6 r3 = new X.Ur6
            r3.<init>(r1)
            goto L_0x0b25
        L_0x0b58:
            r1 = r2
            goto L_0x0b52
        L_0x0b5a:
            java.lang.Object r1 = r0.A05
            X.L5B r1 = (X.L5B) r1
            if (r1 == 0) goto L_0x0b70
            java.lang.String r5 = r1.A01
            java.lang.String r2 = "Required value was null."
            if (r5 == 0) goto L_0x1218
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x1213
            X.Ur9 r3 = new X.Ur9
            r3.<init>(r5, r1)
            goto L_0x0b25
        L_0x0b70:
            java.lang.Object r2 = r0.A02
            com.instagram.user.model.ProductCollection r2 = (com.instagram.user.model.ProductCollection) r2
            java.lang.Object r1 = r0.A01
            X.VWn r1 = (X.C17460VWn) r1
            X.Ur8 r3 = new X.Ur8
            r3.<init>(r1, r2)
            goto L_0x0b25
        L_0x0b7e:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0b97
            if (r1 == r7) goto L_0x0bbb
            if (r1 != r6) goto L_0x121d
            X.0eS.A00(r2)
        L_0x0b8d:
            java.lang.Object r1 = r0.A03
            X.KdH r1 = (X.C62283KdH) r1
            java.util.Map r1 = r1.A00
            java.lang.String r0 = r0.A06
            goto L_0x0028
        L_0x0b97:
            X.0eS.A00(r2)
            java.lang.Object r3 = r0.A03
            X.KdH r3 = (X.C62283KdH) r3
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r1 = r3.A07
            X.JvD r1 = X.JTQ.A0Q(r1)
            if (r1 == 0) goto L_0x0b8d
            java.lang.Object r5 = r0.A05
            X.M0V r5 = (X.M0V) r5
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r2 = r3.A08
            java.lang.String r1 = r1.A08
            r0.A01 = r3
            r0.A02 = r5
            r0.A00 = r7
            java.lang.Object r2 = r2.A0C(r5, r1, r0)
            if (r2 != r4) goto L_0x0bc6
            return r4
        L_0x0bbb:
            java.lang.Object r5 = r0.A02
            X.M0V r5 = (X.M0V) r5
            java.lang.Object r3 = r0.A01
            X.KdH r3 = (X.C62283KdH) r3
            X.0eS.A00(r2)
        L_0x0bc6:
            X.Jvg r2 = (X.C61042Jvg) r2
            boolean r1 = r2.A01
            if (r1 != 0) goto L_0x0b8d
            boolean r1 = r2.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5.A09 = r1
            X.3ju r3 = r3.A0B
            X.KdK r2 = new X.KdK
            r2.<init>(r5)
            r1 = 0
            r0.A01 = r1
            r0.A02 = r1
            r0.A00 = r6
            java.lang.Object r1 = r3.ELH(r2, r0)
            if (r1 != r4) goto L_0x0b8d
            return r4
        L_0x0be9:
            X.1Hj r4 = X.1Hj.A02
            int r3 = r0.A00
            r1 = 1
            if (r3 == 0) goto L_0x0bfd
            if (r3 != r1) goto L_0x0bf8
            java.lang.Object r10 = r0.A02
            X.NDK r10 = (X.NDK) r10
            goto L_0x10d4
        L_0x0bf8:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x0bfd:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A01
            r52 = r2
            java.lang.Object r2 = r0.A03
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk r2 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk) r2
            monitor-enter(r2)
            X.NCY r3 = r2.A00     // Catch:{ all -> 0x117c }
            r36 = 0
            if (r3 == 0) goto L_0x0c3b
            java.lang.String r3 = r3.A05     // Catch:{ all -> 0x117c }
            X.PeW r3 = X.OYW.A00(r3)     // Catch:{ all -> 0x117c }
            X.0sa r3 = r3.B9B()     // Catch:{ all -> 0x117c }
            java.lang.Object r3 = r3.invoke()     // Catch:{ all -> 0x117c }
            X.N4A r3 = (X.N4A) r3     // Catch:{ all -> 0x117c }
            X.Npk r3 = r3.A00     // Catch:{ all -> 0x117c }
            if (r3 == 0) goto L_0x116f
            com.facebook.rsys.state.gen.State r3 = X.C69726Nr9.A00(r3)     // Catch:{ all -> 0x117c }
            if (r3 == 0) goto L_0x116f
            int r3 = r3.callState     // Catch:{ all -> 0x117c }
            java.lang.Integer r5 = X.JTO.A0w(r3)     // Catch:{ all -> 0x117c }
            r3 = 3
            int r5 = r5.intValue()     // Catch:{ all -> 0x117c }
            if (r5 == r3) goto L_0x0c3b
            r3 = 4
            if (r5 == r3) goto L_0x0c3b
            if (r5 != 0) goto L_0x116f
        L_0x0c3b:
            monitor-exit(r2)
            X.NDK r10 = new X.NDK
            r10.<init>()
            X.OL3 r8 = r2.A02
            boolean r3 = r8.A00()
            if (r3 == 0) goto L_0x0fab
            X.0sP r5 = r2.A08
            java.lang.String r3 = r2.A03
            java.lang.Long r3 = X.JTQ.A0T(r3)
            java.lang.Object r35 = r5.invoke(r3)
            r3 = r35
            com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper r3 = (com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper) r3
            r35 = r3
            java.lang.Object r3 = r0.A05
            X.Jty r3 = (X.C60940Jty) r3
            android.content.Context r7 = r3.A01
            long r11 = r3.A00
            com.instagram.common.session.UserSession r3 = r8.A01
            r51 = r3
            X.0Tu r9 = X.0Tu.A05
            r5 = 36604150837941269(0x820b4800001415, double:3.211950610774335E-306)
            long r5 = X.182.A01(r9, r3, r5)
            r3 = 0
            X.0sP r9 = r2.A07
            java.lang.Object r34 = r9.invoke(r7)
            r7 = r34
            X.KoY r7 = (X.C62920KoY) r7
            r34 = r7
            r7 = r35
            com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp r7 = r7.A00
            com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdpData r9 = r7.getData()
            java.lang.String r33 = java.lang.String.valueOf(r11)
            int r7 = (int) r5
            r50 = r7
            r5 = 25
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r32 = ""
            r11[r1] = r32
            java.lang.String r5 = r9.transactionId
            r7 = 2
            if (r5 != 0) goto L_0x0c9d
            java.lang.Object r5 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0c9d:
            r11[r7] = r5
            java.lang.String r5 = r9.signalingId
            r13 = 8
            if (r5 != 0) goto L_0x0ca7
            java.lang.Object r5 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0ca7:
            r11[r13] = r5
            r5 = 15
            java.lang.Integer r46 = java.lang.Integer.valueOf(r5)
            r31 = 12
            r11[r31] = r46
            r5 = 4001(0xfa1, float:5.607E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r5 = 4002(0xfa2, float:5.608E-42)
            java.lang.Object[] r5 = X.C51968G9o.A1Z(r6, r5)
            java.util.Set r5 = X.1sa.A00(r5)
            r30 = 21
            if (r5 != 0) goto L_0x0cc9
            java.lang.Object r5 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0cc9:
            r11[r30] = r5
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r3)
            java.lang.Integer r28 = java.lang.Integer.valueOf(r3)
            r11[r3] = r28
            java.lang.Short r5 = java.lang.Short.valueOf(r3)
            r6 = 3
            r11[r6] = r5
            java.lang.Object[] r12 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r11)
            r5 = 6
            com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r12, r5)
            r5 = r30
            com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r12, r5)
            com.facebook.fbwebrtc.multiway.RtcMessageHeader r27 = new com.facebook.fbwebrtc.multiway.RtcMessageHeader
            r27.<init>()
            r5 = 2840(0xb18, float:3.98E-42)
            java.lang.String r26 = X.AnonymousClass000.A00(r5)
            r11 = r27
            r5 = r26
            r11.A02(r5, r12)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.lang.String r5 = r9.sdpString
            if (r5 != 0) goto L_0x0d03
            java.lang.Object r5 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0d03:
            r11[r3] = r5
            java.lang.Object[] r12 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r11)
            com.facebook.fbwebrtc.multiway.SessionDescription r25 = new com.facebook.fbwebrtc.multiway.SessionDescription
            r25.<init>()
            r5 = 2841(0xb19, float:3.981E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r5)
            r5 = r25
            r5.A02(r11, r12)
            r12 = 13
            java.lang.Integer r37 = java.lang.Integer.valueOf(r6)
            r5 = 4
            java.lang.Integer r38 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r24 = 5
            java.lang.Integer r23 = java.lang.Integer.valueOf(r24)
            r22 = 7
            java.lang.Integer r40 = java.lang.Integer.valueOf(r22)
            java.lang.Integer r41 = java.lang.Integer.valueOf(r13)
            r21 = 10
            java.lang.Integer r42 = java.lang.Integer.valueOf(r21)
            r11 = 11
            java.lang.Integer r43 = java.lang.Integer.valueOf(r11)
            r20 = 6
            java.lang.Integer r44 = java.lang.Integer.valueOf(r12)
            r11 = 14
            java.lang.Integer r45 = java.lang.Integer.valueOf(r11)
            r19 = 9
            r11 = 16
            java.lang.Integer r47 = java.lang.Integer.valueOf(r11)
            r11 = 17
            java.lang.Integer r48 = java.lang.Integer.valueOf(r11)
            r11 = 18
            java.lang.Integer r49 = java.lang.Integer.valueOf(r11)
            r39 = r23
            java.lang.Integer[] r11 = new java.lang.Integer[]{r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49}
            java.util.Set r18 = X.1sa.A00(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r28}
            java.lang.Object[] r13 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r11)
            com.facebook.fbwebrtc.multiway.EndpointSettings r17 = new com.facebook.fbwebrtc.multiway.EndpointSettings
            r17.<init>()
            r11 = 2837(0xb15, float:3.975E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r11)
            r11 = r17
            r11.A02(r12, r13)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r3] = r28
            r11[r1] = r29
            java.lang.Object[] r13 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r11)
            com.facebook.fbwebrtc.multiway.E2eeEnforcement r16 = new com.facebook.fbwebrtc.multiway.E2eeEnforcement
            r16.<init>()
            r11 = 2836(0xb14, float:3.974E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r11)
            r11 = r16
            r11.A02(r12, r13)
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            java.lang.String r11 = r9.audioTrack
            r37 = r11
            r11 = r19
            java.lang.Object[] r14 = new java.lang.Object[r11]
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            r14[r3] = r11
            r13 = 4
            r14[r13] = r28
            r14[r24] = r28
            java.lang.Object[] r11 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r14)
            com.facebook.fbwebrtc.multiway.ClientTrackInfo r15 = new com.facebook.fbwebrtc.multiway.ClientTrackInfo
            r15.<init>()
            r14 = 2832(0xb10, float:3.968E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r14)
            r15.A02(r14, r11)
            r11 = r37
            r12.put(r11, r15)
            java.lang.String r11 = r9.videoTrack
            r9 = r19
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r3] = r29
            r9[r13] = r5
            r9[r24] = r28
            java.lang.Object[] r15 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r9)
            com.facebook.fbwebrtc.multiway.ClientTrackInfo r9 = new com.facebook.fbwebrtc.multiway.ClientTrackInfo
            r9.<init>()
            r9.A02(r14, r15)
            r12.put(r11, r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r12}
            java.lang.Object[] r12 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r9)
            com.facebook.fbwebrtc.multiway.ClientMediaStatus r11 = new com.facebook.fbwebrtc.multiway.ClientMediaStatus
            r11.<init>()
            r9 = 2831(0xb0f, float:3.967E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r9)
            r11.A02(r9, r12)
            r9 = r22
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r1] = r32
            java.lang.Object[] r14 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r9)
            com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r14, r7)
            com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r14, r13)
            com.facebook.fbwebrtc.multiway.DataHeader r12 = new com.facebook.fbwebrtc.multiway.DataHeader
            r12.<init>()
            r9 = 2833(0xb11, float:3.97E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r9)
            r12.A02(r9, r14)
            java.lang.Object[] r14 = new java.lang.Object[r6]
            r9 = 3479(0xd97, float:4.875E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r9)
            r14[r3] = r9
            java.lang.String r9 = "{\"calling_tags\":0,\"is_meta_ai_call\":true}"
            byte[] r9 = r9.getBytes()
            if (r9 != 0) goto L_0x0e31
            java.lang.Object r9 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0e31:
            r14[r1] = r9
            java.lang.Object[] r15 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r14)
            com.facebook.fbwebrtc.GenericDataMessage r14 = new com.facebook.fbwebrtc.GenericDataMessage
            r14.<init>()
            r9 = 2830(0xb0e, float:3.966E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r9)
            r14.A02(r9, r15)
            r9 = r19
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r3] = r14
            java.lang.Object[] r15 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r9)
            com.facebook.fbwebrtc.multiway.DataMessageBody r14 = new com.facebook.fbwebrtc.multiway.DataMessageBody
            r14.<init>()
            r9 = 2835(0xb13, float:3.973E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r9)
            r14.A02(r9, r15)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r12
            r6[r7] = r14
            java.lang.Object[] r9 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r6)
            com.facebook.fbwebrtc.multiway.DataMessage r12 = new com.facebook.fbwebrtc.multiway.DataMessage
            r12.<init>()
            r6 = 2834(0xb12, float:3.971E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            r12.A02(r6, r9)
            byte[] r6 = r32.getBytes()
            if (r6 != 0) goto L_0x0e7d
            java.lang.Object r6 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0e7d:
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r6}
            java.lang.Object[] r9 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r6)
            com.facebook.fbwebrtc.multiway.State r14 = new com.facebook.fbwebrtc.multiway.State
            r14.<init>()
            r6 = 2842(0xb1a, float:3.982E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            r14.A02(r6, r9)
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r6 = X.Dba.A0f(r5, r14)
            java.lang.Object[] r6 = new java.lang.Object[]{r9, r6}
            java.lang.Object[] r14 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r6)
            com.facebook.fbwebrtc.multiway.SyncPayload r9 = new com.facebook.fbwebrtc.multiway.SyncPayload
            r9.<init>()
            r6 = 2843(0xb1b, float:3.984E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            r9.A02(r6, r14)
            r6 = r30
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r50)
            r6 = 20
            if (r15 != 0) goto L_0x0ebf
            java.lang.Object r15 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0ebf:
            r14[r6] = r15
            r6 = 14
            r14[r6] = r16
            r14[r3] = r25
            if (r18 != 0) goto L_0x0ecb
            java.lang.Object r18 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0ecb:
            r14[r1] = r18
            byte[] r6 = r32.getBytes()
            if (r6 != 0) goto L_0x0ed5
            java.lang.Object r6 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0ed5:
            r14[r13] = r6
            java.lang.Object[] r6 = new java.lang.Object[]{r33}
            java.util.Set r6 = X.1sa.A00(r6)
            if (r6 != 0) goto L_0x0ee3
            java.lang.Object r6 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0ee3:
            r14[r7] = r6
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            r6 = r23
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r13, r6}
            java.util.Set r13 = X.1sa.A00(r6)
            r6 = 19
            if (r13 != 0) goto L_0x0ef9
            java.lang.Object r13 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0ef9:
            r14[r6] = r13
            r13 = 16
            r14[r13] = r5
            r5 = 17
            r14[r5] = r17
            r14[r21] = r11
            r14[r31] = r9
            java.util.List r5 = java.util.Collections.singletonList(r12)
            if (r5 != 0) goto L_0x0f0f
            java.lang.Object r5 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0f0f:
            r14[r20] = r5
            java.lang.Object[] r9 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r14)
            com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r9, r1)
            com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r9, r7)
            r5 = r20
            com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r9, r5)
            r5 = 13
            com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r9, r5)
            com.facebook.hyperthrift.HyperThriftBase$Builder.A00(r9, r6)
            com.facebook.fbwebrtc.multiway.JoinRequest r6 = new com.facebook.fbwebrtc.multiway.JoinRequest
            r6.<init>()
            r5 = 2838(0xb16, float:3.977E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r6.A02(r5, r9)
            r5 = 30
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r6
            java.lang.Object[] r6 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r5)
            com.facebook.fbwebrtc.multiway.RtcMessageBody r13 = new com.facebook.fbwebrtc.multiway.RtcMessageBody
            r13.<init>()
            r5 = 73
            java.lang.String r12 = X.AnonymousClass000.A00(r5)
            r13.A02(r12, r6)
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream
            r11.<init>()
            X.45y r5 = new X.45y
            r5.<init>((java.io.OutputStream) r11)
            X.46B r9 = new X.46B
            r9.<init>(r5)
            r5 = r34
            X.4uV r7 = r5.A00
            r6 = r27
            r5 = r26
            r7.A01(r6, r9, r5)
            r7.A01(r13, r9, r12)
            byte[] r6 = r11.toByteArray()
            r6.getClass()
            X.0eM r5 = r8.A03
            java.lang.Object r11 = X.AnonymousClass7TE.A14(r5)
            com.instagram.realtimeclient.RealtimeClientManager r11 = (com.instagram.realtimeclient.RealtimeClientManager) r11
            byte[] r5 = new byte[r1]
            r5[r3] = r3
            byte[] r9 = X.0Yw.A0X(r5, r6)
            X.46Y r7 = X.AnonymousClass46Y.ACKNOWLEDGED_DELIVERY
            r5 = 463(0x1cf, float:6.49E-43)
            java.lang.String r6 = X.C66579MXk.A00(r5)
            r5 = r36
            r11.publish(r6, r9, r7, r5)
            android.content.Context r6 = r8.A00
            r5 = r51
            X.OyC r5 = X.C66953Mfm.A00(r6, r5)
            X.OVd r5 = r5.A09
            X.Odx r6 = r5.A0Z
            X.Ppe r5 = X.C74137Ppe.A00
            X.C71143Odx.A06(r6, r5, r3, r3)
            X.Pln r36 = new X.Pln
            r6 = r35
            r5 = r24
            r3 = r36
            r3.<init>(r6, r5)
        L_0x0fab:
            java.lang.String r11 = r0.A06     // Catch:{ CancellationException -> 0x1106 }
            java.lang.Object r9 = r0.A05     // Catch:{ CancellationException -> 0x1106 }
            X.Jty r9 = (X.C60940Jty) r9     // Catch:{ CancellationException -> 0x1106 }
            long r5 = r9.A00     // Catch:{ CancellationException -> 0x1106 }
            java.lang.String r17 = java.lang.String.valueOf(r5)     // Catch:{ CancellationException -> 0x1106 }
            java.lang.String r12 = r9.A03     // Catch:{ CancellationException -> 0x1106 }
            r3 = 6
            X.Pln r7 = new X.Pln     // Catch:{ CancellationException -> 0x1106 }
            r7.<init>(r2, r3)     // Catch:{ CancellationException -> 0x1106 }
            X.KzS r3 = new X.KzS     // Catch:{ CancellationException -> 0x1106 }
            r3.<init>()     // Catch:{ CancellationException -> 0x1106 }
            r5 = 4610(0x1202, float:6.46E-42)
            int[] r14 = r3.A00     // Catch:{ CancellationException -> 0x1106 }
            r14[r5] = r1     // Catch:{ CancellationException -> 0x1106 }
            r5 = 3318(0xcf6, float:4.65E-42)
            r14[r5] = r1     // Catch:{ CancellationException -> 0x1106 }
            r6 = 0
            r5 = 4344(0x10f8, float:6.087E-42)
            r14[r5] = r6     // Catch:{ CancellationException -> 0x1106 }
            r13 = 2
            r5 = 3319(0xcf7, float:4.651E-42)
            r14[r5] = r13     // Catch:{ CancellationException -> 0x1106 }
            r5 = 0
            r6 = 675(0x2a3, float:9.46E-43)
            r14[r6] = r5     // Catch:{ CancellationException -> 0x1106 }
            r6 = 3433(0xd69, float:4.81E-42)
            r14[r6] = r1     // Catch:{ CancellationException -> 0x1106 }
            r6 = 4463(0x116f, float:6.254E-42)
            r14[r6] = r1     // Catch:{ CancellationException -> 0x1106 }
            r6 = 3511(0xdb7, float:4.92E-42)
            r14[r6] = r1     // Catch:{ CancellationException -> 0x1106 }
            r6 = 1928(0x788, float:2.702E-42)
            r14[r6] = r5     // Catch:{ CancellationException -> 0x1106 }
            r6 = 20
            r15 = 4359(0x1107, float:6.108E-42)
            r14[r15] = r6     // Catch:{ CancellationException -> 0x1106 }
            r15 = 2927(0xb6f, float:4.102E-42)
            r14[r15] = r6     // Catch:{ CancellationException -> 0x1106 }
            r15 = 2337(0x921, float:3.275E-42)
            r14[r15] = r6     // Catch:{ CancellationException -> 0x1106 }
            r15 = 1543(0x607, float:2.162E-42)
            r14[r15] = r6     // Catch:{ CancellationException -> 0x1106 }
            r15 = 2920(0xb68, float:4.092E-42)
            r14[r15] = r6     // Catch:{ CancellationException -> 0x1106 }
            r15 = 2960(0xb90, float:4.148E-42)
            r14[r15] = r6     // Catch:{ CancellationException -> 0x1106 }
            r15 = 1529(0x5f9, float:2.143E-42)
            r14[r15] = r6     // Catch:{ CancellationException -> 0x1106 }
            r15 = 3139(0xc43, float:4.399E-42)
            r14[r15] = r6     // Catch:{ CancellationException -> 0x1106 }
            r15 = 4419(0x1143, float:6.192E-42)
            r14[r15] = r1     // Catch:{ CancellationException -> 0x1106 }
            r15 = 4420(0x1144, float:6.194E-42)
            r14[r15] = r1     // Catch:{ CancellationException -> 0x1106 }
            r15 = 778(0x30a, float:1.09E-42)
            r14[r15] = r1     // Catch:{ CancellationException -> 0x1106 }
            X.MId r21 = X.JTO.A1C(r2, r13)     // Catch:{ CancellationException -> 0x1106 }
            boolean r2 = r9.A05     // Catch:{ CancellationException -> 0x1106 }
            X.GnK r9 = new X.GnK     // Catch:{ CancellationException -> 0x1106 }
            r13 = r9
            r14 = r10
            r15 = r3
            r16 = r11
            r18 = r12
            r19 = r7
            r20 = r36
            r22 = r2
            r13.<init>((X.NDK) r14, (X.C63579KzS) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (X.C62320sa) r19, (X.C62320sa) r20, (X.0sP) r21, (boolean) r22)     // Catch:{ CancellationException -> 0x1106 }
            r2 = r52
            r0.A01 = r2     // Catch:{ CancellationException -> 0x1106 }
            r0.A02 = r10     // Catch:{ CancellationException -> 0x1106 }
            r0.A00 = r1     // Catch:{ CancellationException -> 0x1106 }
            com.instagram.common.session.UserSession r3 = r8.A01     // Catch:{ CancellationException -> 0x1106 }
            android.content.Context r2 = r8.A00     // Catch:{ CancellationException -> 0x1106 }
            X.OyC r7 = X.C66953Mfm.A00(r2, r3)     // Catch:{ CancellationException -> 0x1106 }
            com.facebook.rsys.audiomodule.gen.AudioModule r13 = r7.A00()     // Catch:{ CancellationException -> 0x1106 }
            java.lang.String r12 = r9.A06     // Catch:{ CancellationException -> 0x1106 }
            java.lang.String r11 = r9.A07     // Catch:{ CancellationException -> 0x1106 }
            java.lang.String r3 = r9.A08     // Catch:{ CancellationException -> 0x1106 }
            X.0eM r2 = r8.A02     // Catch:{ CancellationException -> 0x1106 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ CancellationException -> 0x1106 }
            com.instagram.model.rtc.RtcCallSource r2 = (com.instagram.model.rtc.RtcCallSource) r2     // Catch:{ CancellationException -> 0x1106 }
            X.ODE r14 = new X.ODE     // Catch:{ CancellationException -> 0x1106 }
            r14.<init>(r9, r8, r13)     // Catch:{ CancellationException -> 0x1106 }
            java.lang.Object r8 = r9.A02     // Catch:{ CancellationException -> 0x1106 }
            X.KzS r8 = (X.C63579KzS) r8     // Catch:{ CancellationException -> 0x1106 }
            X.Lbu r15 = new X.Lbu     // Catch:{ CancellationException -> 0x1106 }
            r15.<init>(r8)     // Catch:{ CancellationException -> 0x1106 }
            java.lang.Object r8 = r9.A04     // Catch:{ CancellationException -> 0x1106 }
            X.0sa r8 = (X.C62320sa) r8     // Catch:{ CancellationException -> 0x1106 }
            X.OHa r13 = new X.OHa     // Catch:{ CancellationException -> 0x1106 }
            r17 = r12
            r18 = r11
            r19 = r3
            r20 = r8
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ CancellationException -> 0x1106 }
            com.instagram.realtimeclient.RealtimeClientManager r3 = r7.A03     // Catch:{ CancellationException -> 0x1106 }
            r2 = 100
            java.lang.String r2 = X.C66579MXk.A00(r2)     // Catch:{ CancellationException -> 0x1106 }
            r3.addKeepAliveCondition(r2)     // Catch:{ CancellationException -> 0x1106 }
            X.OVd r2 = r7.A09     // Catch:{ CancellationException -> 0x1106 }
            X.Odx r9 = r2.A0Z     // Catch:{ CancellationException -> 0x1106 }
            X.1IW r8 = X.JTS.A0s(r0)     // Catch:{ CancellationException -> 0x1106 }
            X.OWb r12 = X.C71004OWb.A00     // Catch:{ CancellationException -> 0x1106 }
            java.lang.String r3 = "startSession() started with localCallId "
            java.lang.String r2 = r13.A02     // Catch:{ CancellationException -> 0x1106 }
            java.lang.String r2 = X.002.A0R(r3, r2)     // Catch:{ CancellationException -> 0x1106 }
            java.lang.String r11 = "RtcRsysInteractor"
            r7 = 0
            r12.A01(r11, r2)     // Catch:{ CancellationException -> 0x1106 }
            X.OKu r3 = r9.A0J     // Catch:{ CancellationException -> 0x1106 }
            boolean r2 = X.Xm7.A00     // Catch:{ CancellationException -> 0x1106 }
            r3.A00(r1, r5, r2)     // Catch:{ CancellationException -> 0x1106 }
            X.OCi r2 = r9.A05     // Catch:{ CancellationException -> 0x1106 }
            if (r2 == 0) goto L_0x10b3
            java.lang.String r2 = "Already have pending Meta AI session. Not attempting to start another."
            r12.A00(r11, r2)     // Catch:{ CancellationException -> 0x1106 }
            X.MOc r2 = X.C66345MOc.A00     // Catch:{ CancellationException -> 0x1106 }
            r8.EJ1(r2, r7)     // Catch:{ CancellationException -> 0x1106 }
        L_0x10ae:
            java.lang.Object r2 = r8.A0E()     // Catch:{ CancellationException -> 0x1106 }
            goto L_0x10d1
        L_0x10b3:
            X.ODE r2 = r13.A00     // Catch:{ CancellationException -> 0x1106 }
            X.PhQ r7 = new X.PhQ     // Catch:{ CancellationException -> 0x1106 }
            r7.<init>(r2, r5)     // Catch:{ CancellationException -> 0x1106 }
            X.PqS r3 = new X.PqS     // Catch:{ CancellationException -> 0x1106 }
            r3.<init>((int) r6, (java.lang.Object) r13, (java.lang.Object) r8)     // Catch:{ CancellationException -> 0x1106 }
            X.OCi r2 = new X.OCi     // Catch:{ CancellationException -> 0x1106 }
            r2.<init>(r3, r7)     // Catch:{ CancellationException -> 0x1106 }
            r9.A05 = r2     // Catch:{ CancellationException -> 0x1106 }
            r3 = 21
            X.PqS r2 = new X.PqS     // Catch:{ CancellationException -> 0x1106 }
            r2.<init>((int) r3, (java.lang.Object) r9, (java.lang.Object) r13)     // Catch:{ CancellationException -> 0x1106 }
            X.C71143Odx.A06(r9, r2, r5, r5)     // Catch:{ CancellationException -> 0x1106 }
            goto L_0x10ae
        L_0x10d1:
            if (r2 != r4) goto L_0x10d7
            return r4
        L_0x10d4:
            X.0eS.A00(r2)     // Catch:{ CancellationException -> 0x1106 }
        L_0x10d7:
            X.NCY r2 = (X.NCY) r2     // Catch:{ CancellationException -> 0x1106 }
            if (r2 != 0) goto L_0x10e1
            X.K0F r4 = new X.K0F     // Catch:{ CancellationException -> 0x1106 }
            r4.<init>()     // Catch:{ CancellationException -> 0x1106 }
            return r4
        L_0x10e1:
            java.lang.Object r1 = r0.A03
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk r1 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk) r1
            monitor-enter(r1)
            X.NCY r0 = r1.A00     // Catch:{ all -> 0x1103 }
            boolean r0 = X.0qQ.A0K(r0, r2)     // Catch:{ all -> 0x1103 }
            if (r0 == 0) goto L_0x10fc
            monitor-exit(r1)
            X.4Cc r1 = r1.A05
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = new com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession
            r0.<init>(r2, r10, r1)
            X.K0G r4 = new X.K0G
            r4.<init>(r0)
            return r4
        L_0x10fc:
            java.lang.String r0 = "callReadyCallback was not invoked"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x1103 }
            throw r0     // Catch:{ all -> 0x1103 }
        L_0x1103:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
        L_0x1106:
            r3 = move-exception
            X.OWb r6 = X.C71004OWb.A00
            java.lang.String r5 = "MetaAiRsysSdk"
            java.lang.String r2 = "Scope cancelled before session ready"
            r6.A00(r5, r2)
            java.lang.Object r2 = r0.A03
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk r2 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk) r2
            X.NCY r4 = r2.A00
            if (r4 == 0) goto L_0x1165
            java.lang.String r2 = r0.A06
            java.lang.String r0 = r4.A05
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x113e
            java.lang.String r0 = "Session UI closed before StartSessionResult available, ending session."
            r6.A00(r5, r0)
            com.facebook.rsys.callmanager.gen.CallApi r2 = r4.A00()
            java.lang.String r0 = "call_ui_closed_before_session_ready"
            r2.end(r1, r0, r1)
            throw r3
        L_0x1131:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r3 = 1
            if (r1 == 0) goto L_0x113f
            if (r1 == r3) goto L_0x115d
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
        L_0x113e:
            throw r3
        L_0x113f:
            X.0eS.A00(r2)
            java.lang.Object r1 = r0.A01
            X.0pa r1 = (X.C61770pa) r1
            java.lang.Object r7 = r0.A03
            java.lang.Object r6 = r0.A02
            java.lang.Object r8 = r0.A05
            java.lang.String r9 = r0.A06
            r10 = 0
            X.MCW r5 = new X.MCW
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A00 = r3
            java.lang.Object r0 = r1.collect(r5, r0)
            if (r0 != r4) goto L_0x1160
            return r4
        L_0x115d:
            X.0eS.A00(r2)
        L_0x1160:
            X.MCr r3 = X.C51965G9l.A0x()
            throw r3
        L_0x1165:
            java.lang.String r1 = r0.A06
            monitor-enter(r2)
            java.util.Set r0 = r2.A04     // Catch:{ all -> 0x117c }
            r0.add(r1)     // Catch:{ all -> 0x117c }
            monitor-exit(r2)
            throw r3
        L_0x116f:
            X.OWb r3 = X.C71004OWb.A00     // Catch:{ all -> 0x117c }
            java.lang.String r1 = "MetaAiRsysSdk"
            java.lang.String r0 = "MetaAI session already active"
            r3.A00(r1, r0)     // Catch:{ all -> 0x117c }
            X.K0H r4 = X.K0H.A00     // Catch:{ all -> 0x117c }
            monitor-exit(r2)
            return r4
        L_0x117c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x117f:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r5 = 1
            java.lang.String r3 = "MetaAIIntentsGeneratedVideoResultAdapter"
            if (r1 == 0) goto L_0x1197
            if (r1 != r5) goto L_0x1192
            java.lang.Object r8 = r0.A03
            android.media.MediaMetadataRetriever r8 = (android.media.MediaMetadataRetriever) r8
            X.0eS.A00(r2)     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            goto L_0x11d2
        L_0x1192:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x1197:
            X.0eS.A00(r2)
            android.media.MediaMetadataRetriever r8 = new android.media.MediaMetadataRetriever
            r8.<init>()
            r1 = 70000(0x11170, double:3.45846E-319)
            java.lang.Object r7 = r0.A05     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            android.content.Context r7 = (android.content.Context) r7     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            java.lang.String r10 = r0.A06     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            java.lang.Object r9 = r0.A02     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            java.lang.Object r12 = r0.A01     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            X.0sL r12 = (X.0sL) r12     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            r11 = 0
            X.MGR r6 = new X.MGR     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            r6.<init>((android.content.Context) r7, (android.media.MediaMetadataRetriever) r8, (com.instagram.common.session.UserSession) r9, (java.lang.String) r10, (X.AnonymousClass4D7) r11, (X.0sL) r12)     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            r0.A03 = r8     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            r0.A00 = r5     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            java.lang.Object r0 = X.I3P.A00(r0, r6, r1)     // Catch:{ IllegalArgumentException -> 0x11d2, 3EF -> 0x11c1 }
            if (r0 != r4) goto L_0x11d2
            return r4
        L_0x11c1:
            X.0wj r1 = X.0wj.A01     // Catch:{ all -> 0x11d8 }
            r0 = 245701013(0xea51995, float:4.0700275E-30)
            X.0f9 r1 = r1.AEf(r3, r0)     // Catch:{ all -> 0x11d8 }
            java.lang.String r0 = "Intents card prompt summarization timeout for video"
            r1.ABQ(r3, r0)     // Catch:{ all -> 0x11d8 }
            r1.report()     // Catch:{ all -> 0x11d8 }
        L_0x11d2:
            r8.release()
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x11d8:
            r3 = move-exception
            r8.release()
            throw r3
        L_0x11dd:
            X.0eS.A00(r2)
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r1)
            throw r3
        L_0x11e5:
            X.Wub r3 = X.AnonymousClass7TE.A1K()
            throw r3
        L_0x11ea:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x11ef:
            X.Wub r3 = X.AnonymousClass7TE.A1K()
            throw r3
        L_0x11f4:
            X.Wub r3 = X.AnonymousClass7TE.A1K()
            throw r3
        L_0x11f9:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x11fe:
            return r4
        L_0x11ff:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x1204:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x1209:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x120e:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        L_0x1213:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r2)
            throw r3
        L_0x1218:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r2)
            throw r3
        L_0x121d:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0x()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MH7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MH7) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MH7(Object obj, Object obj2, Object obj3, Object obj4, String str, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A04 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A06 = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MH7(Context context, UserSession userSession, String str, AnonymousClass4D7 r5, 0sL r6) {
        super(2, r5);
        this.A04 = 11;
        this.A06 = str;
        this.A05 = context;
        this.A02 = userSession;
        this.A01 = r6;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MH7(Object obj, Object obj2, Object obj3, String str, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A04 = i;
        this.A01 = obj;
        this.A05 = obj2;
        this.A06 = str;
        this.A03 = obj3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MH7(Object obj, Object obj2, String str, AnonymousClass4D7 r5, int i, int i2) {
        super(2, r5);
        this.A04 = i;
        this.A01 = obj;
        this.A05 = obj2;
        this.A06 = str;
    }
}
