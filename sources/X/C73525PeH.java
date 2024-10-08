package X;

/* renamed from: X.PeH  reason: case insensitive filesystem */
public final class C73525PeH implements 02o {
    public final int A00;
    public final Object A01;

    public C73525PeH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r1 == false) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60340gF A00(X.AnonymousClass4D7 r14, X.C69283Nij r15) {
        /*
            r13 = this;
            r3 = 40
            boolean r0 = X.ME5.A03(r3, r14)
            if (r0 == 0) goto L_0x0022
            r5 = r14
            X.ME5 r5 = (X.ME5) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            int r0 = r5.A00
            r2 = 1
            java.lang.String r3 = "Zero_IgZeroMain"
            if (r0 == 0) goto L_0x0031
            if (r0 != r2) goto L_0x002c
            goto L_0x0027
        L_0x0022:
            X.ME5 r5 = X.ME5.A01(r13, r14, r3)
            goto L_0x0016
        L_0x0027:
            X.0eS.A00(r1)     // Catch:{ Exception -> 0x0118 }
            goto L_0x0115
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0031:
            X.0eS.A00(r1)
            X.Nij r0 = X.C69283Nij.ZERO_BALANCE     // Catch:{ Exception -> 0x0118 }
            if (r15 != r0) goto L_0x00fc
            java.lang.Object r4 = r13.A01     // Catch:{ Exception -> 0x0118 }
            com.instagram.zero.main.IgZeroMain r4 = (com.instagram.zero.main.IgZeroMain) r4     // Catch:{ Exception -> 0x0118 }
            r5.A00 = r2     // Catch:{ Exception -> 0x0118 }
            X.OD7 r5 = r4.A02     // Catch:{ Exception -> 0x0118 }
            X.0Ud r0 = r5.A01     // Catch:{ Exception -> 0x0118 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x0118 }
            X.3OD r1 = X.AnonymousClass3OD.FREE     // Catch:{ Exception -> 0x0118 }
            if (r0 == r1) goto L_0x0115
            X.05G r0 = r5.A00     // Catch:{ Exception -> 0x0118 }
            r0.Epw(r1)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = "OPTIN_GROUP_INTERSTITIAL"
            X.1R7 r0 = r4.A01()     // Catch:{ Exception -> 0x0118 }
            if (r0 == 0) goto L_0x0067
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r1)     // Catch:{ Exception -> 0x0118 }
            java.util.Set r0 = r0.A0C     // Catch:{ Exception -> 0x0118 }
            boolean r1 = r0.contains(r1)     // Catch:{ Exception -> 0x0118 }
            r0 = 1
            if (r1 != 0) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            r8 = 2
            r5 = 0
            if (r0 == 0) goto L_0x00d2
            java.lang.String r12 = X.AnonymousClass7TF.A0b()     // Catch:{ Exception -> 0x0118 }
            r7 = 238955141(0xe3e2a85, float:2.343978E-30)
            X.0qQ.A0B(r12, r8)     // Catch:{ Exception -> 0x0118 }
            X.2SP r0 = X.2SP.A01     // Catch:{ Exception -> 0x0118 }
            int r6 = r0.A03()     // Catch:{ Exception -> 0x0118 }
            X.02m r5 = X.C51965G9l.A0l()     // Catch:{ Exception -> 0x0118 }
            r5.A0U(r7, r6, r12)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r0 = "optin_user_eligible"
            r11 = 0
            r5.markerPoint(r7, r6, r0)     // Catch:{ Exception -> 0x0118 }
            com.instagram.common.session.UserSession r10 = r4.A00     // Catch:{ Exception -> 0x0118 }
            X.2ZQ r9 = X.C71172bH.A00()     // Catch:{ Exception -> 0x0118 }
            java.lang.String r0 = "null cannot be cast to non-null type android.content.Context"
            X.0qQ.A0C(r9, r0)     // Catch:{ Exception -> 0x0118 }
            android.content.Context r9 = (android.content.Context) r9     // Catch:{ Exception -> 0x0118 }
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()     // Catch:{ Exception -> 0x0118 }
            java.util.BitSet r1 = new java.util.BitSet     // Catch:{ Exception -> 0x0118 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r0 = "qpl_join_id"
            r4.put(r0, r12)     // Catch:{ Exception -> 0x0118 }
            r1.set(r11)     // Catch:{ Exception -> 0x0118 }
            int r0 = r1.nextClearBit(r11)     // Catch:{ Exception -> 0x0118 }
            if (r0 < r2) goto L_0x00cb
            X.0sm r2 = X.0Yt.A0E()     // Catch:{ Exception -> 0x0118 }
            java.util.Map r0 = X.0Yt.A0B(r4)     // Catch:{ Exception -> 0x0118 }
            X.FRE r1 = new X.FRE     // Catch:{ Exception -> 0x0118 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0118 }
            X.Pay r0 = new X.Pay     // Catch:{ Exception -> 0x0118 }
            r0.<init>(r9, r1, r10)     // Catch:{ Exception -> 0x0118 }
            X.11Z.A02(r0)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r0 = "optin_launched_screen"
            r5.markerPoint(r7, r6, r0)     // Catch:{ Exception -> 0x0118 }
            r5.markerEndAtPoint(r7, r6, r8, r0)     // Catch:{ Exception -> 0x0118 }
            goto L_0x0115
        L_0x00cb:
            java.lang.String r0 = "Missing required params"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x0118 }
            throw r0     // Catch:{ Exception -> 0x0118 }
        L_0x00d2:
            java.lang.String r1 = "IG_ZBD_INTERSTITIAL"
            X.1R7 r0 = r4.A01()     // Catch:{ Exception -> 0x0118 }
            if (r0 == 0) goto L_0x0115
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r1)     // Catch:{ Exception -> 0x0118 }
            java.util.Set r0 = r0.A0C     // Catch:{ Exception -> 0x0118 }
            boolean r0 = r0.contains(r1)     // Catch:{ Exception -> 0x0118 }
            if (r0 == 0) goto L_0x0115
            r1 = 240488536(0xe559058, float:2.6323776E-30)
            r0 = 3
            X.19S r2 = X.AnonymousClass1HX.A02(r1, r0)     // Catch:{ Exception -> 0x0118 }
            r1 = 32
            X.MHK r0 = new X.MHK     // Catch:{ Exception -> 0x0118 }
            r0.<init>(r4, r5, r1)     // Catch:{ Exception -> 0x0118 }
            X.AnonymousClass7TE.A1Z(r0, r2)     // Catch:{ Exception -> 0x0118 }
            goto L_0x0115
        L_0x00fc:
            X.Nij r0 = X.C69283Nij.DATA_BALANCE     // Catch:{ Exception -> 0x0118 }
            if (r15 != r0) goto L_0x0115
            java.lang.Object r0 = r13.A01     // Catch:{ Exception -> 0x0118 }
            com.instagram.zero.main.IgZeroMain r0 = (com.instagram.zero.main.IgZeroMain) r0     // Catch:{ Exception -> 0x0118 }
            X.OD7 r2 = r0.A02     // Catch:{ Exception -> 0x0118 }
            X.0Ud r0 = r2.A01     // Catch:{ Exception -> 0x0118 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x0118 }
            X.3OD r1 = X.AnonymousClass3OD.PAID     // Catch:{ Exception -> 0x0118 }
            if (r0 == r1) goto L_0x0115
            X.05G r0 = r2.A00     // Catch:{ Exception -> 0x0118 }
            r0.Epw(r1)     // Catch:{ Exception -> 0x0118 }
        L_0x0115:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0118:
            r1 = move-exception
            java.lang.String r0 = "Error while listening to Zero Balance Detection"
            X.0KC.A0F(r3, r0, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73525PeH.A00(X.4D7, X.Nij):X.0gF");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: X.MEB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: X.MEB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: X.MEB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: X.MEB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v236, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v62, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v63, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v237, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v238, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v66, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v68, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v239, resolved type: X.Nih} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v240, resolved type: X.Nih} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v241, resolved type: X.Nih} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v71, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v72, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v74, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v242, resolved type: X.Nfz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v243, resolved type: X.Ng1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v244, resolved type: X.Ng0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v245, resolved type: X.Nfy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v80, resolved type: X.MEB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v81, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v246, resolved type: X.Ng4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v248, resolved type: X.Ng2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v249, resolved type: X.Ng3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v82, resolved type: X.MEB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v76, resolved type: X.MEB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v77, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v250, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v78, resolved type: X.MEB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v83, resolved type: X.MEB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v84, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v251, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v85, resolved type: X.MEB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v79, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v252, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v81, resolved type: X.MEB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v84, resolved type: X.MEB} */
    /* JADX WARNING: type inference failed for: r1v14, types: [X.3B3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.instagram.rtc.activity.RtcCallIntentHandlerActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r7v10, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v183, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0caf: MOVE  (r1v9 X.2t9) = (r1v8 X.2t9)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0652  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0844  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0858  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0868  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x08c1  */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x09c2  */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x09d4  */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r31, X.AnonymousClass4D7 r32) {
        /*
            r30 = this;
            r8 = r30
            r0 = r31
            int r1 = r8.A00
            r6 = r32
            switch(r1) {
                case 0: goto L_0x0a7e;
                case 1: goto L_0x0a1b;
                case 2: goto L_0x0a10;
                case 3: goto L_0x0a03;
                case 4: goto L_0x09f8;
                case 5: goto L_0x09a3;
                case 6: goto L_0x0972;
                case 7: goto L_0x0957;
                case 8: goto L_0x093f;
                case 9: goto L_0x08d7;
                case 10: goto L_0x07bb;
                case 11: goto L_0x07ad;
                case 12: goto L_0x078c;
                case 13: goto L_0x0702;
                case 14: goto L_0x067a;
                case 15: goto L_0x0633;
                case 16: goto L_0x05d9;
                case 17: goto L_0x0c17;
                case 18: goto L_0x0580;
                case 19: goto L_0x0539;
                case 20: goto L_0x0488;
                case 21: goto L_0x0432;
                case 22: goto L_0x03d4;
                case 23: goto L_0x0350;
                case 24: goto L_0x02b8;
                case 25: goto L_0x029c;
                case 26: goto L_0x021e;
                case 27: goto L_0x0207;
                case 28: goto L_0x01a5;
                case 29: goto L_0x015c;
                case 30: goto L_0x0012;
                case 31: goto L_0x0145;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.Nij r0 = (X.C69283Nij) r0
            X.0gF r4 = r8.A00(r6, r0)
            return r4
        L_0x0012:
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r4 = r8.A01
            com.instagram.zero.dogfooding.IgZeroDogfoodingInit r4 = (com.instagram.zero.dogfooding.IgZeroDogfoodingInit) r4
            java.lang.Object r3 = r0.A00
            X.1RA r3 = (X.1RA) r3
            java.lang.Object r0 = r0.A01
            X.1RA r0 = (X.1RA) r0
            boolean r2 = r0.A06
            if (r2 == 0) goto L_0x002e
            android.content.Context r0 = X.C60960kU.A00
            boolean r0 = X.0oI.A09(r0)
            if (r0 == 0) goto L_0x002e
            goto L_0x0c36
        L_0x002e:
            if (r3 == 0) goto L_0x0046
            boolean r0 = r3.A06
            if (r2 == r0) goto L_0x0046
            java.lang.String r0 = "ig_zero_dogfooding_device"
            X.0tX r0 = X.0xn.A01(r0)
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "enabled"
            r1.E5T(r0, r2)
            r1.commit()
        L_0x0046:
            r1 = 1
            if (r2 == 0) goto L_0x00ee
            if (r3 == 0) goto L_0x0051
            boolean r0 = r3.A06
            if (r0 != r1) goto L_0x0051
            goto L_0x0c36
        L_0x0051:
            X.OtS r8 = X.C71942OtS.A00
            monitor-enter(r8)
            boolean r0 = X.14i.A05     // Catch:{ all -> 0x013f }
            r5 = 0
            r7 = 0
            X.15Y r0 = X.15Y.A02     // Catch:{ all -> 0x013f }
            X.14i.A04(r0, r8, r1, r7)     // Catch:{ all -> 0x013f }
            X.1R9 r0 = X.AnonymousClass1R9.A03     // Catch:{ all -> 0x013f }
            boolean r3 = X.14i.A08()     // Catch:{ all -> 0x013f }
            X.05G r6 = r0.A01     // Catch:{ all -> 0x013f }
        L_0x0065:
            java.lang.Object r2 = r6.getValue()     // Catch:{ all -> 0x013f }
            r1 = r2
            X.1RA r1 = (X.1RA) r1     // Catch:{ all -> 0x013f }
            r0 = 2045(0x7fd, float:2.866E-42)
            X.1RA r0 = X.1RA.A01(r1, r5, r0, r7, r3)     // Catch:{ all -> 0x013f }
            boolean r0 = r6.AIY(r2, r0)     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0065
            monitor-exit(r8)
            X.OYU r3 = X.OYU.A01
            monitor-enter(r3)
            X.4Co r0 = X.OYU.A00     // Catch:{ all -> 0x0142 }
            if (r0 != 0) goto L_0x0092
            X.4CZ r0 = X.AnonymousClass12W.A02     // Catch:{ all -> 0x0142 }
            X.19S r2 = X.19E.A02(r0)     // Catch:{ all -> 0x0142 }
            r1 = 3
            X.Pez r0 = new X.Pez     // Catch:{ all -> 0x0142 }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x0142 }
            X.1Er r0 = X.C51966G9m.A1L(r0, r2)     // Catch:{ all -> 0x0142 }
            X.OYU.A00 = r0     // Catch:{ all -> 0x0142 }
        L_0x0092:
            monitor-exit(r3)
            X.0lg r3 = r4.A00
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0c36
            java.lang.Class<com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository> r2 = com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository.class
            r1 = 25
            X.Ivv r0 = new X.Ivv
            r0.<init>(r3, r1)
            java.lang.Object r4 = r3.A01(r2, r0)
            com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository r4 = (com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository) r4
            monitor-enter(r4)
            X.4Co r0 = r4.A00     // Catch:{ all -> 0x00eb }
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "ig_zero_dogfooding_device"
            X.0tX r1 = X.0xn.A01(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "dogfooding_mode"
            java.lang.String r0 = r1.getString(r0, r5)     // Catch:{ all -> 0x00eb }
            java.lang.Integer r3 = X.C70350O3c.A00(r0)     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x00d2
        L_0x00bf:
            java.lang.Object r2 = r6.getValue()     // Catch:{ all -> 0x00eb }
            r1 = r2
            X.1RA r1 = (X.1RA) r1     // Catch:{ all -> 0x00eb }
            r0 = 2043(0x7fb, float:2.863E-42)
            X.1RA r0 = X.1RA.A01(r1, r3, r0, r7, r7)     // Catch:{ all -> 0x00eb }
            boolean r0 = r6.AIY(r2, r0)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x00bf
        L_0x00d2:
            X.12T r1 = X.AnonymousClass12T.A00     // Catch:{ all -> 0x00eb }
            r0 = 1081942649(0x407d2279, float:3.955229)
            X.19S r2 = X.JTR.A17(r1, r0)     // Catch:{ all -> 0x00eb }
            r1 = 23
            X.ImS r0 = new X.ImS     // Catch:{ all -> 0x00eb }
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r5, (int) r1)     // Catch:{ all -> 0x00eb }
            X.1Er r0 = X.C51966G9m.A1L(r0, r2)     // Catch:{ all -> 0x00eb }
            r4.A00 = r0     // Catch:{ all -> 0x00eb }
        L_0x00e8:
            monitor-exit(r4)
            goto L_0x0c36
        L_0x00eb:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x00ee:
            if (r3 == 0) goto L_0x0c36
            boolean r0 = r3.A06
            if (r0 != r1) goto L_0x0c36
            X.0lg r3 = r4.A00
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0119
            java.lang.Class<com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository> r2 = com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository.class
            r1 = 25
            X.Ivv r0 = new X.Ivv
            r0.<init>(r3, r1)
            java.lang.Object r2 = r3.A01(r2, r0)
            com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository r2 = (com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository) r2
            monitor-enter(r2)
            X.4Co r1 = r2.A00     // Catch:{ all -> 0x0115 }
            r0 = 0
            if (r1 == 0) goto L_0x0112
            r1.AG7(r0)     // Catch:{ all -> 0x0115 }
        L_0x0112:
            r2.A00 = r0     // Catch:{ all -> 0x0115 }
            goto L_0x0118
        L_0x0115:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0118:
            monitor-exit(r2)
        L_0x0119:
            X.OYU r3 = X.OYU.A01
            monitor-enter(r3)
            X.4Co r0 = X.OYU.A00     // Catch:{ all -> 0x0142 }
            r2 = 0
            if (r0 == 0) goto L_0x0124
            r0.AG7(r2)     // Catch:{ all -> 0x0142 }
        L_0x0124:
            X.OYU.A00 = r2     // Catch:{ all -> 0x0142 }
            android.content.Context r1 = X.C60960kU.A00     // Catch:{ all -> 0x0142 }
            X.1Fs r0 = new X.1Fs     // Catch:{ all -> 0x0142 }
            r0.<init>(r1)     // Catch:{ all -> 0x0142 }
            r1 = 1909066919(0x71ca0ca7, float:2.0010006E30)
            android.app.NotificationManager r0 = r0.A00     // Catch:{ all -> 0x0142 }
            r0.cancel(r2, r1)     // Catch:{ all -> 0x0142 }
            monitor-exit(r3)
            X.OtS r8 = X.C71942OtS.A00
            monitor-enter(r8)
            X.14i.A07(r8)     // Catch:{ all -> 0x013f }
            monitor-exit(r8)
            goto L_0x0c36
        L_0x013f:
            r1 = move-exception
            monitor-exit(r8)
            throw r1
        L_0x0142:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x0145:
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r2 = r8.A01
            com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository r2 = (com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository) r2
            java.lang.Object r1 = r0.A00
            X.1RA r1 = (X.1RA) r1
            java.lang.Object r0 = r0.A01
            X.1RA r0 = (X.1RA) r0
            java.lang.Object r4 = com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository.A00(r2, r1, r0, r6)
            X.1Hj r0 = X.1Hj.A02
            if (r4 != r0) goto L_0x0c36
            return r4
        L_0x015c:
            X.JwL r0 = (X.C61083JwL) r0
            if (r0 == 0) goto L_0x019e
            java.lang.Object r4 = r0.A00
            java.io.File r4 = (java.io.File) r4
            if (r4 == 0) goto L_0x0184
            java.lang.Object r3 = r8.A01
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r3 = (com.instagram.xme.threed.view.IgGltfSceneLayoutView) r3
            X.PRx r2 = r3.A02
            if (r2 == 0) goto L_0x0174
            java.lang.Long r1 = X.C51968G9o.A0u()
            r2.A00 = r1
        L_0x0174:
            java.lang.String r1 = X.JTP.A0t(r4)
            com.instagram.xme.threed.view.IgGltfSceneLayoutView.A01(r3, r1)
            r1 = 1
            r3.setRenderingEnabled(r1)
            com.instagram.xme.threed.view.IgGltfSceneTextureView r1 = r3.A03
            r1.A00()
        L_0x0184:
            java.lang.Object r2 = r0.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r2 != r1) goto L_0x0193
            java.lang.Object r0 = r8.A01
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r0 = (com.instagram.xme.threed.view.IgGltfSceneLayoutView) r0
        L_0x018e:
            com.instagram.xme.threed.view.IgGltfSceneLayoutView.A00(r0, r1)
            goto L_0x0c36
        L_0x0193:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 != r0) goto L_0x0c36
            java.lang.Object r0 = r8.A01
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r0 = (com.instagram.xme.threed.view.IgGltfSceneLayoutView) r0
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x018e
        L_0x019e:
            java.lang.Object r0 = r8.A01
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r0 = (com.instagram.xme.threed.view.IgGltfSceneLayoutView) r0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x018e
        L_0x01a5:
            X.UOF r0 = (X.UOF) r0
            java.lang.Object r5 = r8.A01
            X.Mty r5 = (X.C67745Mty) r5
            X.05G r6 = r5.A05
            X.OUk r7 = X.OUk.A00
            com.instagram.common.session.UserSession r10 = r5.A00
            com.instagram.model.reels.Reel r11 = r0.A00
            X.3uh r12 = r0.A01
            X.6d8 r13 = r5.A01
            X.OAL r14 = r5.A04
            r1 = 23
            X.JJS r15 = new X.JJS
            r15.<init>(r1, r5, r0)
            com.instagram.common.session.UserSession r4 = r14.A00
            X.0Tu r3 = X.0Tu.A05
            r1 = 36320481132945902(0x810949000021ee, double:3.032556747089046E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0202
            r1 = 36320481133076975(0x810949000221ef, double:3.0325567471719373E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0202
            r8 = 0
        L_0x01db:
            r1 = 36320481132945902(0x810949000021ee, double:3.032556747089046E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0200
            r1 = 36320481133076975(0x810949000221ef, double:3.0325567471719373E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0200
            android.view.View$OnClickListener r9 = X.C67745Mty.A00(r0, r5)
        L_0x01f5:
            r16 = 0
            X.N3z r0 = r7.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r6.Epw(r0)
            goto L_0x0c36
        L_0x0200:
            r9 = 0
            goto L_0x01f5
        L_0x0202:
            android.view.View$OnClickListener r8 = X.C67745Mty.A00(r0, r5)
            goto L_0x01db
        L_0x0207:
            X.MfE r0 = (X.C66920MfE) r0
            java.lang.Object r2 = r8.A01
            X.0sL r2 = (X.0sL) r2
            int r1 = r0.A01
            java.lang.Integer r1 = X.JTO.A0w(r1)
            boolean r0 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.invoke(r1, r0)
            goto L_0x0c36
        L_0x021e:
            X.Nii r1 = X.C69282Nii.FETCHED
            if (r0 == r1) goto L_0x022a
            X.3OD r1 = X.AnonymousClass3OD.FREE
            if (r0 == r1) goto L_0x022a
            X.3OD r1 = X.AnonymousClass3OD.PAID
            if (r0 != r1) goto L_0x0c36
        L_0x022a:
            X.OSR r0 = X.AnonymousClass3OC.A00
            if (r0 == 0) goto L_0x0252
            com.instagram.zero.main.IgZeroMain r0 = com.instagram.zero.main.IgZeroMain.A08
            if (r0 == 0) goto L_0x0252
            X.1R7 r0 = r0.A01()
            if (r0 == 0) goto L_0x0252
            java.util.List r0 = r0.A0B
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
            com.instagram.service.tigon.interceptors.zerorewritenative.ZeroNativeRequestInterceptor r1 = X.C69640NpN.A00
            if (r1 == 0) goto L_0x02b4
            com.instagram.service.tigon.interceptors.zerorewritenative.ZeroNativeRequestInterceptor$Companion r0 = com.instagram.service.tigon.interceptors.zerorewritenative.ZeroNativeRequestInterceptor.Companion
            com.instagram.service.tigon.interceptors.zerorewritenative.ZeroNativeDataBuilder r0 = new com.instagram.service.tigon.interceptors.zerorewritenative.ZeroNativeDataBuilder
            r0.<init>()
            r0.addRewriteRules(r2)
            r0.buildNative()
            r1.setData(r0)
        L_0x0252:
            com.instagram.service.tigon.interceptors.zerorewritenative.ZeroNativeRequestInterceptor r5 = X.C69640NpN.A00
            if (r5 == 0) goto L_0x02b4
            java.lang.Object r0 = r8.A01
            X.0Ud r0 = (X.AnonymousClass0Ud) r0
            java.lang.Object r1 = r0.getValue()
            X.3OD r0 = X.AnonymousClass3OD.FREE
            boolean r4 = X.AnonymousClass7TF.A1W(r1, r0)
            X.OSR r0 = X.AnonymousClass3OC.A00
            if (r0 == 0) goto L_0x0287
            com.instagram.zero.main.IgZeroMain r0 = com.instagram.zero.main.IgZeroMain.A08
            if (r0 == 0) goto L_0x0283
            X.1R7 r0 = r0.A01()
            if (r0 == 0) goto L_0x0283
            java.lang.String r1 = r0.A08
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0281
            java.lang.String r0 = "2,"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x028e
            r3 = r1
        L_0x0281:
            if (r3 != 0) goto L_0x0285
        L_0x0283:
            java.lang.String r3 = ""
        L_0x0285:
            if (r3 != 0) goto L_0x0289
        L_0x0287:
            java.lang.String r3 = ""
        L_0x0289:
            r5.setZeroRatingStateMetadata(r4, r3)
            goto L_0x0c36
        L_0x028e:
            java.lang.String r0 = ","
            java.lang.String[] r2 = r1.split(r0)
            int r1 = r2.length
            r0 = 3
            if (r1 != r0) goto L_0x0281
            r0 = 1
            r3 = r2[r0]
            goto L_0x0281
        L_0x029c:
            java.lang.Object r0 = r8.A01
            X.0Ud r0 = (X.AnonymousClass0Ud) r0
            r0.getValue()
            com.instagram.service.tigon.interceptors.zerorewritenative.ZeroNativeRequestInterceptor r1 = X.C69640NpN.A00
            if (r1 == 0) goto L_0x02b4
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = r0.toString()
            r1.setZeroBalanceState(r0)
            goto L_0x0c36
        L_0x02b4:
            java.lang.String r0 = "interceptor"
            goto L_0x0c23
        L_0x02b8:
            r4 = 7
            boolean r1 = X.MEB.A03(r4, r6)
            if (r1 == 0) goto L_0x02dd
            r5 = r6
            X.MEB r5 = (X.MEB) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x02dd
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x02cd:
            java.lang.Object r6 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r9 = 1
            if (r1 == 0) goto L_0x02e3
            if (r1 == r9) goto L_0x09cf
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x02dd:
            X.MEB r5 = new X.MEB
            r5.<init>(r8, r6, r4)
            goto L_0x02cd
        L_0x02e3:
            X.0eS.A00(r6)
            java.lang.Object r6 = r8.A01
            X.02o r6 = (X.02o) r6
            X.N4N r0 = (X.N4N) r0
            java.util.List r2 = r0.A0H
            int r1 = r0.A03
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r1, r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0300:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0312
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C297005r0
            if (r0 == 0) goto L_0x0300
            r3.add(r1)
            goto L_0x0300
        L_0x0312:
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x031a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x032c
            java.lang.Object r0 = r1.next()
            X.5r0 r0 = (X.C297005r0) r0
            java.util.List r0 = r0.A02
            r2.add(r0)
            goto L_0x031a
        L_0x032c:
            java.util.ArrayList r0 = X.0Yv.A1F(r2)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0338:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03d0
            java.lang.Object r2 = r3.next()
            boolean r0 = r2 instanceof X.C296985qy
            if (r0 == 0) goto L_0x0338
            X.5qy r2 = (X.C296985qy) r2
            X.1Xj r0 = r2.A01
            if (r0 == 0) goto L_0x0338
            r1.add(r0)
            goto L_0x0338
        L_0x0350:
            r4 = 6
            boolean r1 = X.MEB.A03(r4, r6)
            if (r1 == 0) goto L_0x0375
            r5 = r6
            X.MEB r5 = (X.MEB) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0375
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x0365:
            java.lang.Object r6 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r9 = 1
            if (r1 == 0) goto L_0x037b
            if (r1 == r9) goto L_0x09cf
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0375:
            X.MEB r5 = new X.MEB
            r5.<init>(r8, r6, r4)
            goto L_0x0365
        L_0x037b:
            X.0eS.A00(r6)
            java.lang.Object r6 = r8.A01
            X.02o r6 = (X.02o) r6
            java.util.List r0 = (java.util.List) r0
            r12 = 0
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r11 = r0.iterator()
        L_0x038d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x03d0
            java.lang.Object r10 = r11.next()
            X.5r0 r10 = (X.C297005r0) r10
            java.util.List r0 = r10.A02
            java.util.Iterator r8 = r0.iterator()
        L_0x039f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x03cc
            java.lang.Object r2 = r8.next()
            X.5qt r2 = (X.C296935qt) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.util.Map r0 = r10.A03
            java.lang.Object r0 = r0.get(r2)
            X.0qQ.A0A(r0)
            X.5qz r0 = (X.C296995qz) r0
            java.lang.String r7 = r2.getKey()
            int r3 = r0.A01
            int r3 = r3 + r12
            int r2 = r0.A00
            X.5qz r0 = new X.5qz
            r0.<init>(r3, r2)
            r1.put(r7, r0)
            goto L_0x039f
        L_0x03cc:
            int r0 = r10.A00
            int r12 = r12 + r0
            goto L_0x038d
        L_0x03d0:
            r5.A00 = r9
            goto L_0x09f1
        L_0x03d4:
            r5 = 5
            boolean r1 = X.MEB.A03(r5, r6)
            if (r1 == 0) goto L_0x03f9
            r3 = r6
            X.MEB r3 = (X.MEB) r3
            int r4 = r3.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r2
            if (r1 == 0) goto L_0x03f9
            int r4 = r4 - r2
            r3.A00 = r4
        L_0x03e9:
            java.lang.Object r6 = r3.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            r7 = 1
            if (r1 == 0) goto L_0x03ff
            if (r1 == r7) goto L_0x09cf
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x03f9:
            X.MEB r3 = new X.MEB
            r3.<init>(r8, r6, r5)
            goto L_0x03e9
        L_0x03ff:
            X.0eS.A00(r6)
            java.lang.Object r6 = r8.A01
            X.02o r6 = (X.02o) r6
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x0410:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x042e
            java.lang.Object r2 = r5.next()
            boolean r0 = r2 instanceof X.C296985qy
            if (r0 == 0) goto L_0x0410
            X.5qy r2 = (X.C296985qy) r2
            X.1Xj r0 = r2.A01
            if (r0 == 0) goto L_0x0410
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0410
            r1.add(r0)
            goto L_0x0410
        L_0x042e:
            r3.A00 = r7
            goto L_0x04dc
        L_0x0432:
            r4 = 4
            boolean r1 = X.MEB.A03(r4, r6)
            if (r1 == 0) goto L_0x0457
            r5 = r6
            X.MEB r5 = (X.MEB) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0457
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x0447:
            java.lang.Object r6 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x045d
            if (r1 == r3) goto L_0x09cf
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0457:
            X.MEB r5 = new X.MEB
            r5.<init>(r8, r6, r4)
            goto L_0x0447
        L_0x045d:
            X.0eS.A00(r6)
            java.lang.Object r6 = r8.A01
            X.02o r6 = (X.02o) r6
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x046e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0480
            java.lang.Object r0 = r1.next()
            X.5r0 r0 = (X.C297005r0) r0
            java.util.List r0 = r0.A02
            r2.add(r0)
            goto L_0x046e
        L_0x0480:
            java.util.ArrayList r1 = X.0Yv.A1F(r2)
            r5.A00 = r3
            goto L_0x09f1
        L_0x0488:
            r2 = 1
            boolean r1 = X.MEB.A03(r2, r6)
            if (r1 == 0) goto L_0x04ac
            r3 = r6
            X.MEB r3 = (X.MEB) r3
            int r5 = r3.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r4
            if (r1 == 0) goto L_0x04ac
            int r5 = r5 - r4
            r3.A00 = r5
        L_0x049d:
            java.lang.Object r6 = r3.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            if (r1 == 0) goto L_0x04b2
            if (r1 == r2) goto L_0x09cf
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x04ac:
            X.MEB r3 = new X.MEB
            r3.<init>(r8, r6, r2)
            goto L_0x049d
        L_0x04b2:
            X.0eS.A00(r6)
            java.lang.Object r6 = r8.A01
            X.02o r6 = (X.02o) r6
            X.N4N r0 = (X.N4N) r0
            X.N3M r7 = r0.A07
            if (r7 == 0) goto L_0x0536
            java.lang.Integer r10 = r7.A01
            r5 = 3
            if (r10 == 0) goto L_0x04e2
            int r1 = r10.intValue()
            if (r1 != r5) goto L_0x04e2
            X.01N r0 = X.0jo.A1H()
            r0.add(r7)
            X.01N r0 = X.0jo.A1I(r0)
            X.Ng3 r1 = new X.Ng3
            r1.<init>(r0)
        L_0x04da:
            r3.A00 = r2
        L_0x04dc:
            java.lang.Object r0 = r6.emit(r1, r3)
            goto L_0x09f5
        L_0x04e2:
            boolean r1 = r0.A0L
            if (r1 != 0) goto L_0x0536
            X.01N r8 = X.0jo.A1H()
            r8.add(r7)
            java.util.List r9 = X.C70278O0i.A00(r7)
            boolean r5 = r9.isEmpty()
            r1 = 0
            if (r5 == 0) goto L_0x04f9
            r1 = 1
        L_0x04f9:
            r5 = r1 ^ 1
            if (r5 == 0) goto L_0x0504
            X.Jw7 r1 = X.C18690Vwo.A01()
            r8.add(r1)
        L_0x0504:
            r8.addAll(r9)
            boolean r1 = r0.A0N
            if (r1 == 0) goto L_0x052b
            boolean r1 = X.AnonymousClass7TE.A1b(r9)
            if (r1 == 0) goto L_0x052b
            if (r10 == 0) goto L_0x052b
            int r1 = r10.intValue()
            if (r1 != r2) goto L_0x052b
            X.UqG r0 = new X.UqG
            r0.<init>(r7)
        L_0x051e:
            r8.add(r0)
        L_0x0521:
            X.01N r0 = X.0jo.A1I(r8)
            X.Ng2 r1 = new X.Ng2
            r1.<init>(r0)
            goto L_0x04da
        L_0x052b:
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0521
            if (r5 == 0) goto L_0x0521
            X.Jw7 r0 = X.C18690Vwo.A00()
            goto L_0x051e
        L_0x0536:
            X.Ng4 r1 = X.Ng4.A00
            goto L_0x04da
        L_0x0539:
            r4 = 0
            boolean r1 = X.MEB.A03(r4, r6)
            if (r1 == 0) goto L_0x055e
            r7 = r6
            X.MEB r7 = (X.MEB) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x055e
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x054e:
            java.lang.Object r6 = r7.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r7.A00
            r5 = 1
            if (r1 == 0) goto L_0x0564
            if (r1 == r5) goto L_0x09cf
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x055e:
            X.MEB r7 = new X.MEB
            r7.<init>(r8, r6, r4)
            goto L_0x054e
        L_0x0564:
            X.0eS.A00(r6)
            java.lang.Object r3 = r8.A01
            X.02o r3 = (X.02o) r3
            r2 = r0
            X.N4N r2 = (X.N4N) r2
            int r1 = r2.A04
            if (r1 != r5) goto L_0x0c36
            java.lang.Integer r2 = r2.A0C
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r2 != r1) goto L_0x0c36
            r7.A00 = r5
            java.lang.Object r0 = r3.emit(r0, r7)
            goto L_0x09f5
        L_0x0580:
            r4 = 49
            boolean r1 = X.MEA.A03(r4, r6)
            if (r1 == 0) goto L_0x05a6
            r5 = r6
            X.MEA r5 = (X.MEA) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x05a6
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x0596:
            java.lang.Object r6 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x05ac
            if (r1 == r3) goto L_0x09cf
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x05a6:
            X.MEA r5 = new X.MEA
            r5.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r6, (int) r4)
            goto L_0x0596
        L_0x05ac:
            X.0eS.A00(r6)
            java.lang.Object r6 = r8.A01
            X.02o r6 = (X.02o) r6
            X.N4N r0 = (X.N4N) r0
            java.lang.Integer r2 = r0.A0C
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r2 != r1) goto L_0x05bf
            X.Nfy r1 = X.C69175Nfy.A00
            goto L_0x09ef
        L_0x05bf:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 == r1) goto L_0x05d5
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r2 == r1) goto L_0x05d5
            X.NpA r0 = r0.A0A
            boolean r0 = r0 instanceof X.C69173Nfw
            if (r0 == 0) goto L_0x05d1
            X.Ng0 r1 = X.Ng0.A00
            goto L_0x09ef
        L_0x05d1:
            X.Ng1 r1 = X.Ng1.A00
            goto L_0x09ef
        L_0x05d5:
            X.Nfz r1 = X.C69176Nfz.A00
            goto L_0x09ef
        L_0x05d9:
            r4 = 40
            boolean r1 = X.MEA.A03(r4, r6)
            if (r1 == 0) goto L_0x05ff
            r5 = r6
            X.MEA r5 = (X.MEA) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x05ff
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x05ef:
            java.lang.Object r6 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0605
            if (r1 == r3) goto L_0x09cf
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x05ff:
            X.MEA r5 = new X.MEA
            r5.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r6, (int) r4)
            goto L_0x05ef
        L_0x0605:
            X.0eS.A00(r6)
            java.lang.Object r6 = r8.A01
            X.02o r6 = (X.02o) r6
            X.N4R r0 = (X.N4R) r0
            java.lang.Object r1 = r0.A02
            X.N9J r1 = (X.N9J) r1
            java.lang.Integer r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x062f
            java.lang.Object r0 = r0.A00
            com.instagram.rtc.rsys.models.EngineModel r0 = (com.instagram.rtc.rsys.models.EngineModel) r0
            if (r0 == 0) goto L_0x062b
            com.instagram.rtc.rsys.models.IgCallModel r0 = r0.callModel
            if (r0 == 0) goto L_0x062b
            int r1 = r0.inCallState
            r0 = 4
            if (r1 != r0) goto L_0x062b
            X.Nih r1 = X.C69281Nih.RINGING_OUTGOING
            goto L_0x09ef
        L_0x062b:
            X.Nih r1 = X.C69281Nih.CONTACTING
            goto L_0x09ef
        L_0x062f:
            X.Nih r1 = X.C69281Nih.A03
            goto L_0x09ef
        L_0x0633:
            r4 = 38
            boolean r1 = X.MEA.A03(r4, r6)
            if (r1 == 0) goto L_0x0659
            r5 = r6
            X.MEA r5 = (X.MEA) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0659
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x0649:
            java.lang.Object r6 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x065f
            if (r1 == r3) goto L_0x09cf
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0659:
            X.MEA r5 = new X.MEA
            r5.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r6, (int) r4)
            goto L_0x0649
        L_0x065f:
            X.0eS.A00(r6)
            java.lang.Object r6 = r8.A01
            X.02o r6 = (X.02o) r6
            X.N4R r0 = (X.N4R) r0
            java.lang.Object r0 = r0.A00
            com.instagram.rtc.rsys.models.EngineModel r0 = (com.instagram.rtc.rsys.models.EngineModel) r0
            if (r0 == 0) goto L_0x0676
            com.instagram.rtc.rsys.models.IgCallModel r0 = r0.callModel
            if (r0 == 0) goto L_0x0676
            java.lang.String r1 = r0.instagramVideoCallId
            if (r1 != 0) goto L_0x09ef
        L_0x0676:
            java.lang.String r1 = ""
            goto L_0x09ef
        L_0x067a:
            X.N9N r0 = (X.N9N) r0
            java.lang.Object r3 = r8.A01
            X.38Y r3 = (X.AnonymousClass38Y) r3
            X.05G r1 = r3.A0D
            boolean r9 = r0.A04
            boolean r10 = r0.A06
            boolean r11 = r0.A05
            boolean r12 = r0.A07
            java.lang.Long r7 = r0.A01
            java.lang.Long r8 = r0.A02
            boolean r13 = r0.A0A
            X.38c r6 = new X.38c
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r5 = 0
            X.0qQ.A0B(r1, r5)
            r1.FIA(r6)
            X.0eM r1 = r3.A0B
            boolean r1 = X.AnonymousClass7TF.A1Z(r1)
            if (r1 != 0) goto L_0x0c36
            r3.A02 = r5
            java.lang.Boolean r1 = r0.A00
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r2)
            if (r1 == 0) goto L_0x0c36
            if (r9 == 0) goto L_0x06b3
            if (r13 != 0) goto L_0x06bb
        L_0x06b3:
            boolean r1 = r0.A09
            if (r1 == 0) goto L_0x06db
            boolean r1 = r0.A08
            if (r1 == 0) goto L_0x06db
        L_0x06bb:
            boolean r1 = X.C69733NrI.A00()
            if (r1 == 0) goto L_0x06cb
            boolean r1 = X.14i.A08()
            if (r1 != 0) goto L_0x06d8
            boolean r1 = X.14i.A04
            if (r1 != 0) goto L_0x06d8
        L_0x06cb:
            X.OJ9 r2 = com.instagram.rtc.service.OngoingCallServiceWithMic.A05
            android.content.Context r1 = r3.A04
            java.lang.String r0 = r0.A03
            r2.A00(r1, r7, r0, r11)
        L_0x06d4:
            r3.A00 = r5
            goto L_0x0c36
        L_0x06d8:
            r3.A02 = r2
            goto L_0x06d4
        L_0x06db:
            if (r13 != 0) goto L_0x06e2
            int r1 = r3.A00
            r0 = 3
            if (r1 >= r0) goto L_0x0c36
        L_0x06e2:
            android.content.Context r4 = r3.A04
            android.content.Context r1 = r4.getApplicationContext()
            java.lang.Class<com.instagram.rtc.service.OngoingCallServiceWithMic> r0 = com.instagram.rtc.service.OngoingCallServiceWithMic.class
            android.content.Intent r2 = X.C66580MXl.A0A(r1, r0)
            android.content.Context r1 = r4.getApplicationContext()
            X.0b6 r0 = X.0kR.A00
            X.0R3 r0 = r0.A07()
            r0.A0D(r1, r2)
            if (r13 != 0) goto L_0x06d4
            int r0 = r3.A00
            int r5 = r0 + 1
            goto L_0x06d4
        L_0x0702:
            X.N9J r0 = (X.N9J) r0
            java.lang.Integer r4 = r0.A01
            int r2 = r4.intValue()
            r3 = 0
            r13 = 1
            r1 = 2
            java.lang.Object r0 = r8.A01
            X.38Y r0 = (X.AnonymousClass38Y) r0
            if (r2 == r1) goto L_0x076c
            X.1XA r0 = r0.A08
            if (r2 == r3) goto L_0x0767
            X.1X8 r0 = r0.A00
            java.util.WeakHashMap r2 = r0.A06
            java.util.Set r0 = r2.keySet()
            X.0qQ.A07(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0726:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0730
            r1.next()
            goto L_0x0726
        L_0x0730:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r4 != r0) goto L_0x0735
            r3 = 1
        L_0x0735:
            java.util.Set r0 = r2.keySet()
            X.0qQ.A07(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0740:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0c36
            java.lang.Object r1 = r2.next()
            X.MYF r1 = (X.MYF) r1
            android.content.Context r5 = r1.A00
            boolean r0 = X.MYF.A00(r5)
            if (r0 == 0) goto L_0x0740
            if (r3 != 0) goto L_0x0740
            X.OVo r4 = X.C70993OVo.A00
            com.instagram.common.session.UserSession r6 = r1.A01
            r7 = 0
            r14 = 0
            r15 = 0
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r4.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0740
        L_0x0767:
            r0.A00(r13)
            goto L_0x0c36
        L_0x076c:
            X.1XA r2 = r0.A08
            X.1X8 r0 = r2.A00
            java.util.WeakHashMap r0 = r0.A06
            java.util.Set r0 = r0.keySet()
            X.0qQ.A07(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x077d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0787
            r1.next()
            goto L_0x077d
        L_0x0787:
            r2.A00(r3)
            goto L_0x0c36
        L_0x078c:
            X.N9B r0 = (X.N9B) r0
            java.lang.Object r1 = r8.A01
            com.instagram.rtc.service.OngoingCallServiceWithMic r1 = (com.instagram.rtc.service.OngoingCallServiceWithMic) r1
            boolean r0 = com.instagram.rtc.service.OngoingCallServiceWithMic.A01(r1, r0)
            if (r0 == 0) goto L_0x0c36
            android.app.Notification r0 = r1.A00
            if (r0 != 0) goto L_0x07a8
            X.0eM r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            X.AIZ r0 = (X.AIZ) r0
            android.app.Notification r0 = r0.A03()
        L_0x07a8:
            com.instagram.rtc.service.OngoingCallServiceWithMic.A00(r0, r1)
            goto L_0x0c36
        L_0x07ad:
            java.lang.Object r2 = r8.A01
            X.0sP r2 = (X.0sP) r2
            X.PZj r1 = new X.PZj
            r1.<init>(r2, r0)
            X.11Z.A02(r1)
            goto L_0x0c36
        L_0x07bb:
            X.N4R r0 = (X.N4R) r0
            java.lang.Object r3 = r8.A01
            X.OVd r3 = (X.C70989OVd) r3
            X.Oaz r5 = r3.A0K
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r6 = r0.A02
            X.N9J r6 = (X.N9J) r6
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.N4R r1 = new X.N4R
            r1.<init>((X.N9J) r6, (java.lang.Integer) r2)
            X.C71080Oaz.A02(r1, r5)
            X.Nev r2 = r3.A0C
            java.lang.Object r1 = r0.A00
            com.instagram.rtc.rsys.models.EngineModel r1 = (com.instagram.rtc.rsys.models.EngineModel) r1
            if (r1 == 0) goto L_0x07fa
            com.instagram.rtc.rsys.models.IgCallModel r8 = r1.callModel
            if (r8 == 0) goto L_0x07fa
            X.0V2 r7 = r2.A02
            java.lang.Object r1 = X.C66583MXo.A0h(r7)
            X.N9L r1 = (X.N9L) r1
            if (r1 == 0) goto L_0x07fa
            java.lang.String r6 = r1.A01
            java.util.List r2 = r1.A02
            X.0qQ.A0B(r6, r4)
            X.N9L r1 = new X.N9L
            r1.<init>(r8, r6, r2)
            r7.FIA(r1)
        L_0x07fa:
            java.lang.Object r6 = r0.A00
            com.instagram.rtc.rsys.models.EngineModel r6 = (com.instagram.rtc.rsys.models.EngineModel) r6
            X.N4R r0 = r5.A00
            java.lang.Object r1 = r0.A00
            X.N9J r1 = (X.N9J) r1
            X.N4R r0 = new X.N4R
            r0.<init>((com.instagram.rtc.rsys.models.EngineModel) r6, (X.N9J) r1)
            X.C70989OVd.A00(r0, r3)
            if (r6 == 0) goto L_0x0c36
            java.util.Map r0 = r6.rawModels
            X.0qQ.A07(r0)
            X.NDp r2 = new X.NDp
            r2.<init>(r0)
            X.OEO r10 = r3.A03
            X.PxA r0 = r10.A00
            if (r0 == 0) goto L_0x0886
            long r0 = r0.C8y()
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L_0x0826:
            com.instagram.common.session.UserSession r7 = r10.A02
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316173280808967(0x81055e00011007, double:3.02983244405132E-306)
            boolean r0 = X.182.A06(r8, r7, r0)
            if (r0 == 0) goto L_0x0880
            if (r9 != 0) goto L_0x0873
            java.lang.String r1 = "invalid_traceId_null"
        L_0x0839:
            X.PxA r0 = r10.A00
            if (r0 == 0) goto L_0x0840
            r0.AG6(r1)
        L_0x0840:
            com.facebook.rsys.livevideo.gen.LiveVideoModel r0 = r6.liveVideoModel
            if (r0 == 0) goto L_0x084e
            int r1 = r0.liveStreamStatus
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x084e
            if (r1 != 0) goto L_0x085b
        L_0x084e:
            X.0eM r0 = r3.A0f
            java.lang.Object r0 = r0.getValue()
            X.OdA r0 = (X.C71116OdA) r0
            if (r0 == 0) goto L_0x085b
            X.C71116OdA.A00(r2, r0, r4, r4)
        L_0x085b:
            com.instagram.common.session.UserSession r7 = r3.A02
            r0 = 36316499698258337(0x8105aa000011a1, double:3.0300388717606795E-306)
            boolean r0 = X.182.A06(r8, r7, r0)
            if (r0 == 0) goto L_0x08bd
            X.PeW r0 = X.OYW.A00
            java.lang.String r1 = "RpStores.dispatchNewRsysAppModel"
            r0 = -123846215(0xfffffffff89e41b9, float:-2.5678622E34)
            X.0fh.A01(r1, r0)
            goto L_0x0888
        L_0x0873:
            X.Pvr r0 = r10.A01
            X.PxA r0 = r0.C90(r9)
            boolean r0 = r0 instanceof X.NE3
            if (r0 == 0) goto L_0x0880
            java.lang.String r1 = "invalid_trace_noop"
            goto L_0x0839
        L_0x0880:
            X.Pvr r0 = r10.A01
            r0.DgO(r2, r9)
            goto L_0x0840
        L_0x0886:
            r9 = 0
            goto L_0x0826
        L_0x0888:
            X.2LV r1 = com.facebook.rsys.state.gen.State.CONVERTER     // Catch:{ all -> 0x08af }
            X.0qQ.A08(r1)     // Catch:{ all -> 0x08af }
            X.OKD r0 = r2.A00     // Catch:{ all -> 0x08af }
            java.lang.Object r0 = r0.A00(r1)     // Catch:{ all -> 0x08af }
            com.facebook.rsys.state.gen.State r0 = (com.facebook.rsys.state.gen.State) r0     // Catch:{ all -> 0x08af }
            if (r0 == 0) goto L_0x08a5
            java.lang.String r0 = r0.localCallId     // Catch:{ all -> 0x08af }
            if (r0 == 0) goto L_0x08a5
            X.PeW r0 = X.OYW.A00(r0)     // Catch:{ all -> 0x08af }
            X.0sP r0 = r0.A00     // Catch:{ all -> 0x08af }
            r0.invoke(r2)     // Catch:{ all -> 0x08af }
            goto L_0x08b7
        L_0x08a5:
            X.OWb r2 = X.C71004OWb.A00     // Catch:{ all -> 0x08af }
            java.lang.String r1 = "RpStores"
            java.lang.String r0 = "LocalCallId == null, NOT DISPATCHING RsysAppModel"
            r2.A00(r1, r0)     // Catch:{ all -> 0x08af }
            goto L_0x08b7
        L_0x08af:
            r1 = move-exception
            r0 = 1884264634(0x704f98ba, float:2.5699213E29)
            X.0fh.A00(r0)
            throw r1
        L_0x08b7:
            r0 = -641701284(0xffffffffd9c06a5c, float:-6.7700174E15)
            X.0fh.A00(r0)
        L_0x08bd:
            int r0 = r6.state
            if (r0 != 0) goto L_0x0c36
            X.05G r3 = r3.A0h
            X.N4R r0 = r5.A00
            java.lang.Object r2 = r0.A00
            X.N9J r2 = (X.N9J) r2
            r1 = 0
            X.N4R r0 = new X.N4R
            r0.<init>((com.instagram.rtc.rsys.models.EngineModel) r1, (X.N9J) r2)
            X.0qQ.A0B(r3, r4)
            r3.FIA(r0)
            goto L_0x0c36
        L_0x08d7:
            X.N4R r0 = (X.N4R) r0
            java.lang.Object r0 = r0.A00
            com.instagram.rtc.rsys.models.EngineModel r0 = (com.instagram.rtc.rsys.models.EngineModel) r0
            if (r0 == 0) goto L_0x092f
            com.instagram.rtc.rsys.models.IgCallModel r2 = r0.callModel
            com.facebook.rsys.rooms.gen.RoomModel r1 = r0.roomModel
            com.facebook.rsys.livevideo.gen.LiveVideoModel r0 = r0.liveVideoModel
            if (r1 == 0) goto L_0x08fe
            java.lang.Object r0 = r8.A01
            X.Nf7 r0 = (X.C69126Nf7) r0
            X.0eM r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            X.Mrt r3 = (X.C67663Mrt) r3
            r2 = 1
            r1 = 3
        L_0x08f5:
            X.N3m r0 = new X.N3m
            r0.<init>(r1, r2, r2, r2)
            r3.A00 = r0
            goto L_0x0c36
        L_0x08fe:
            if (r0 == 0) goto L_0x092f
            int r0 = r0.liveStreamStatus
            if (r0 != 0) goto L_0x092f
            if (r2 == 0) goto L_0x092f
            com.facebook.djinni.msys.infra.McfReference r0 = r2.dropInModel
            if (r0 == 0) goto L_0x0923
            r2 = 0
            r1 = 1
            r0 = 15
            X.N3m r9 = new X.N3m
            r9.<init>(r0, r2, r2, r1)
        L_0x0913:
            java.lang.Object r0 = r8.A01
            X.Nf7 r0 = (X.C69126Nf7) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.Mrt r0 = (X.C67663Mrt) r0
            r0.A00 = r9
            goto L_0x0c36
        L_0x0923:
            r11 = 1
            r10 = 0
            X.N3m r9 = new X.N3m
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x0913
        L_0x092f:
            java.lang.Object r0 = r8.A01
            X.Nf7 r0 = (X.C69126Nf7) r0
            X.0eM r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            X.Mrt r3 = (X.C67663Mrt) r3
            r2 = 0
            r1 = 31
            goto L_0x08f5
        L_0x093f:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0c36
            java.lang.Object r0 = r8.A01
            X.Nf7 r0 = (X.C69126Nf7) r0
            X.0eM r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            X.Mrt r1 = (X.C67663Mrt) r1
            r0 = 5
            r1.A00(r0)
            goto L_0x0c36
        L_0x0957:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0c36
            java.lang.Object r2 = r8.A01
            X.Nf7 r2 = (X.C69126Nf7) r2
            X.0eM r0 = r2.A06
            java.lang.Object r1 = r0.getValue()
            X.Mrt r1 = (X.C67663Mrt) r1
            r0 = 4
            r1.A00(r0)
            r0 = 1
            r2.A01 = r0
            goto L_0x0c36
        L_0x0972:
            X.N9J r0 = (X.N9J) r0
            java.lang.Object r3 = r8.A01
            X.Nf7 r3 = (X.C69126Nf7) r3
            java.lang.Integer r0 = r0.A01
            int r2 = r0.intValue()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x0996
            if (r2 == r1) goto L_0x0c36
            r1 = 3
            r0 = 2
            if (r2 == r0) goto L_0x0992
            if (r2 == r1) goto L_0x0c36
            r0 = 4
            if (r2 == r0) goto L_0x0c36
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0992:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0c36
        L_0x0996:
            X.0eM r0 = r3.A06
            java.lang.Object r0 = r0.getValue()
            X.Mrt r0 = (X.C67663Mrt) r0
            r0.A00(r1)
            goto L_0x0c36
        L_0x09a3:
            r4 = 28
            boolean r1 = X.MEA.A03(r4, r6)
            if (r1 == 0) goto L_0x09c9
            r5 = r6
            X.MEA r5 = (X.MEA) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x09c9
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x09b9:
            java.lang.Object r6 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x09d4
            if (r1 == r3) goto L_0x09cf
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x09c9:
            X.MEA r5 = new X.MEA
            r5.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r6, (int) r4)
            goto L_0x09b9
        L_0x09cf:
            X.0eS.A00(r6)
            goto L_0x0c36
        L_0x09d4:
            X.0eS.A00(r6)
            java.lang.Object r6 = r8.A01
            X.02o r6 = (X.02o) r6
            X.N9B r0 = (X.N9B) r0
            X.Nj8 r2 = r0.A00
            X.Nj8 r1 = X.C69307Nj8.UNAVAILABLE
            if (r2 != r1) goto L_0x09ea
            java.lang.Integer r2 = r0.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 0
            if (r2 != r1) goto L_0x09eb
        L_0x09ea:
            r0 = 1
        L_0x09eb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x09ef:
            r5.A00 = r3
        L_0x09f1:
            java.lang.Object r0 = r6.emit(r1, r5)
        L_0x09f5:
            if (r0 != r4) goto L_0x0c36
            return r4
        L_0x09f8:
            X.N9H r0 = (X.N9H) r0
            java.lang.Object r1 = r8.A01
            X.NfI r1 = (X.C69137NfI) r1
            X.C69137NfI.A04(r1, r0)
            goto L_0x0c36
        L_0x0a03:
            X.N9H r0 = (X.N9H) r0
            java.lang.Object r1 = r8.A01
            X.NfG r1 = (X.C69135NfG) r1
            r1.A02 = r0
            X.C69135NfG.A02(r1)
            goto L_0x0c36
        L_0x0a10:
            java.lang.Object r1 = r8.A01
            X.ONx r1 = (X.C70845ONx) r1
            X.0sP r1 = r1.A06
            r1.invoke(r0)
            goto L_0x0c36
        L_0x0a1b:
            X.N9J r0 = (X.N9J) r0
            java.lang.String r4 = "RtcCallIntentHandlerActivity.IncomingCallOperation"
            java.lang.Integer r1 = r0.A01
            int r2 = r1.intValue()
            r1 = 1
            if (r2 == r1) goto L_0x0a3e
            r0 = 4
            if (r2 == r0) goto L_0x0c36
            r0 = 3
            if (r2 == r0) goto L_0x0c36
            r0 = 0
            if (r2 == r0) goto L_0x0a39
            r0 = 2
            if (r2 == r0) goto L_0x0a39
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0a39:
            java.lang.Object r5 = r8.A01
            X.PJe r5 = (X.C72766PJe) r5
            goto L_0x0a63
        L_0x0a3e:
            com.instagram.model.rtc.RtcCallKey r1 = r0.A00
            java.lang.Object r5 = r8.A01
            X.PJe r5 = (X.C72766PJe) r5
            com.instagram.model.rtc.RtcCallKey r3 = r5.A04
            boolean r1 = X.0qQ.A0K(r1, r3)
            if (r1 == 0) goto L_0x0a68
            X.PxB r1 = r5.A01
            java.lang.String r0 = "launch_call_activity"
            r1.AIe(r0)
            X.OMf r4 = r5.A05
            java.lang.String r3 = "incoming_call_notification"
            long r1 = r1.C8y()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r4.A00(r3, r0)
        L_0x0a63:
            r5.AIa()
            goto L_0x0c36
        L_0x0a68:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Unexpected conflicting incoming call for "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = ": "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r0, r1, r2)
            X.0KC.A0E(r4, r0)
            goto L_0x0a63
        L_0x0a7e:
            X.N9J r0 = (X.N9J) r0
            X.OWb r6 = X.C71004OWb.A00
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Current call state: "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r0, r1, r2)
            java.lang.String r5 = "RtcCallIntentHandlerActivity.EnterCallOperation"
            r7 = 0
            r9 = 3
            r6.A00(r5, r1)
            java.lang.Integer r1 = r0.A01
            int r4 = r1.intValue()
            r1 = 2
            r2 = 0
            if (r4 == r1) goto L_0x0bd0
            if (r4 == r2) goto L_0x0bd0
            r3 = 1
            if (r4 == r3) goto L_0x0b85
            if (r4 == r9) goto L_0x0b71
            r0 = 4
            if (r4 != r0) goto L_0x0b6c
            java.lang.String r0 = "EnterCallOperation - IDLE"
            r6.A00(r5, r0)
            java.lang.Object r1 = r8.A01
            X.PJf r1 = (X.C72767PJf) r1
            com.instagram.model.rtc.RtcCallKey r11 = r1.A08
            java.lang.String r10 = "Required value was null."
            if (r11 != 0) goto L_0x0b14
            java.lang.String r0 = "Initiating new call"
            r6.A00(r5, r0)
            X.OyC r13 = r1.A0G
            java.lang.String r9 = r1.A0O
            if (r9 == 0) goto L_0x0b0f
            java.lang.String r8 = r1.A0P
            if (r8 != 0) goto L_0x0ac7
            java.lang.String r8 = ""
        L_0x0ac7:
            java.lang.String r12 = r1.A0N
            java.lang.String r11 = r1.A0I
            java.lang.String r7 = r1.A0M
            X.Nm9 r14 = r1.A02
            X.Nid r15 = r1.A05
            java.util.List r6 = r1.A0R
            java.util.List r5 = r1.A0Q
            java.lang.String r4 = r1.A0J
            java.lang.String r3 = r1.A0K
            boolean r2 = r1.A0U
            java.lang.Boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x0b0a
            boolean r29 = r0.booleanValue()
            com.instagram.model.rtc.RtcEnterCallArgs r10 = r1.A0A
            com.instagram.model.rtc.RtcCallSource r17 = r10.Bxh()
            com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r0 = r1.A0C
            com.instagram.model.rtc.RtcCallFunnelSessionId r16 = r10.AjV()
            r27 = r5
            r28 = r2
            r25 = r3
            r26 = r6
            r21 = r12
            r22 = r11
            r23 = r7
            r24 = r4
            r18 = r0
            r19 = r9
            r20 = r8
            r13.A03(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0c36
        L_0x0b0a:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r10)
            throw r1
        L_0x0b0f:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r10)
            throw r1
        L_0x0b14:
            boolean r0 = X.C72767PJf.A00(r1)
            if (r0 == 0) goto L_0x0c07
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "joiningCall: callKey="
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r11, r0, r4)
            r13 = 0
            r6.A00(r5, r0)
            X.Nid r8 = r1.A05
            X.Nid r0 = X.C69277Nid.NO_E2EE
            if (r8 == r0) goto L_0x0b62
            java.lang.String r14 = r1.A0O
            r12 = r14
        L_0x0b31:
            X.OyC r7 = r1.A0G
            if (r12 == 0) goto L_0x0b67
            X.Nie r9 = r1.A06
            java.util.List r0 = r1.A0R
            int r0 = r0.size()
            boolean r19 = X.C51970G9q.A1W(r0, r3)
            java.lang.String r15 = r1.A0K
            boolean r5 = r1.A0U
            X.7Rj r0 = r1.A09
            java.lang.String r4 = r0.A00
            java.lang.String r3 = r1.A0J
            java.util.List r0 = r1.A0Q
            com.instagram.model.rtc.RtcEnterCallArgs r1 = r1.A0A
            com.instagram.model.rtc.RtcCallFunnelSessionId r10 = r1.AjV()
            r20 = r2
            r21 = r5
            r16 = r4
            r17 = r3
            r18 = r0
            r7.A04(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0c36
        L_0x0b62:
            r14 = 0
            java.lang.String r12 = r1.A0O
            r13 = r12
            goto L_0x0b31
        L_0x0b67:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r10)
            throw r1
        L_0x0b6c:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0b71:
            java.lang.String r0 = "EnterCallOperation - ENDED"
            r6.A00(r5, r0)
            java.lang.Object r0 = r8.A01
            X.PJf r0 = (X.C72767PJf) r0
            X.OyC r0 = r0.A0G
            X.OVd r0 = r0.A09
            X.Odx r0 = r0.A0Z
            r0.A08(r7)
            goto L_0x0c36
        L_0x0b85:
            com.instagram.model.rtc.RtcCallKey r4 = r0.A00
            java.lang.Object r1 = r8.A01
            X.PJf r1 = (X.C72767PJf) r1
            com.instagram.model.rtc.RtcCallKey r3 = r1.A08
            boolean r0 = X.0qQ.A0K(r4, r3)
            if (r0 != 0) goto L_0x0bb1
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Call key mismatch: "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = " != "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r0, r2)
            r6.A00(r5, r0)
            X.OyC r1 = r1.A0G
            java.lang.String r0 = "startWithPermissions: key mismatch"
            r1.A07(r0)
            goto L_0x0c36
        L_0x0bb1:
            boolean r0 = X.C72767PJf.A00(r1)
            if (r0 == 0) goto L_0x0bc6
            java.lang.String r0 = "Accepting incoming call"
            r6.A00(r5, r0)
            X.OyC r3 = r1.A0G
            com.instagram.rtc.activity.RtcCallIntentHandlerActivity r2 = r1.A0E
            X.7Rj r0 = r1.A09
            r3.A02(r2, r0)
            goto L_0x0c36
        L_0x0bc6:
            java.lang.String r0 = "Unable to join call because videoCallId is null"
            r6.A00(r5, r0)
            X.OyC r2 = r1.A0G
            java.lang.String r0 = "startWithPermissions: no vcid"
            goto L_0x0c10
        L_0x0bd0:
            java.lang.Object r1 = r8.A01
            X.PJf r1 = (X.C72767PJf) r1
            com.instagram.model.rtc.RtcCallKey r4 = r1.A08
            if (r4 == 0) goto L_0x0bfd
            com.instagram.model.rtc.RtcCallKey r2 = r0.A00
            boolean r2 = X.0qQ.A0K(r2, r4)
            if (r2 != 0) goto L_0x0bfd
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "EnterCallOperation callKey '"
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = "' does not match current call state model '"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ".callKey'"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r3)
            r6.A04(r5, r0, r7)
        L_0x0bfd:
            X.OMf r2 = r1.A0D
            X.7Rj r0 = r1.A09
            java.lang.String r0 = r0.A00
            r2.A00(r0, r7)
            goto L_0x0c13
        L_0x0c07:
            java.lang.String r0 = "Unable to join call because videoCallId is null"
            r6.A00(r5, r0)
            X.OyC r2 = r1.A0G
            java.lang.String r0 = "initiateOrJoinCall: novcid"
        L_0x0c10:
            r2.A07(r0)
        L_0x0c13:
            r1.AIa()
            goto L_0x0c36
        L_0x0c17:
            X.N62 r0 = (X.N62) r0
            java.lang.Object r1 = r8.A01
            X.UZq r1 = (X.C15286UZq) r1
            X.TpO r2 = r1.A06
            if (r2 != 0) goto L_0x0c2b
            java.lang.String r0 = "grid"
        L_0x0c23:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0c2b:
            androidx.recyclerview.widget.RecyclerView r3 = r2.A01
            if (r3 == 0) goto L_0x0c36
            if (r0 != 0) goto L_0x0c39
            r12 = 8
        L_0x0c33:
            r3.setVisibility(r12)
        L_0x0c36:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0c39:
            X.2Rw r1 = r3.A0A
            if (r1 != 0) goto L_0x0c6d
            X.G7A r4 = r2.A0H
            if (r4 == 0) goto L_0x0c6d
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r3)
            r5 = 0
            X.DbV.A1A(r1, r3)
            X.2tC r2 = X.AnonymousClass2t9.A00(r1)
            X.EGw r1 = new X.EGw
            r1.<init>(r4)
            X.2t9 r4 = X.DbU.A0U(r2, r1)
            java.util.ArrayList r1 = r3.A12
            int r2 = r1.size()
            r1 = 1
            if (r2 >= r1) goto L_0x0c67
            X.MvO r1 = new X.MvO
            r1.<init>()
            r3.A11(r1)
        L_0x0c67:
            r3.setClipToPadding(r5)
            r3.setAdapter(r4)
        L_0x0c6d:
            com.instagram.common.recyclerview.ViewModelListUpdate r2 = X.DbS.A0R()
            android.content.res.Resources r4 = X.DbU.A05(r3)
            r1 = 2131972829(0x7f1352dd, float:1.9582677E38)
            java.lang.String r8 = X.AnonymousClass7TF.A0d(r4, r1)
            r5 = 0
            r12 = 0
            r1 = 2131238406(0x7f081e06, float:1.809309E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            X.QP5 r6 = r0.A01
            java.lang.String r9 = ""
            X.UO1 r4 = new X.UO1
            r10 = r9
            r11 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.A00(r4)
            java.util.List r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x0c99:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0ca9
            java.lang.Object r0 = r1.next()
            X.UO1 r0 = (X.UO1) r0
            r2.A00(r0)
            goto L_0x0c99
        L_0x0ca9:
            X.2Rw r1 = r3.A0A
            boolean r0 = r1 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x0c33
            X.2t9 r1 = (X.AnonymousClass2t9) r1
            if (r1 == 0) goto L_0x0c33
            r1.A05(r2)
            goto L_0x0c33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73525PeH.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
