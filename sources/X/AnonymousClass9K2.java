package X;

/* renamed from: X.9K2  reason: invalid class name */
public final class AnonymousClass9K2 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K2(int i, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A03 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        AnonymousClass4D7 r5 = (AnonymousClass4D7) obj3;
        switch (this.A03) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            default:
                i = 7;
                break;
        }
        AnonymousClass9K2 r1 = new AnonymousClass9K2(i, r5);
        r1.A01 = obj;
        r1.A02 = obj2;
        return r1.invokeSuspend(C60340gF.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: X.51I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: X.9pf} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.9K2, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02bc, code lost:
        r0 = r4.emit(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02c0, code lost:
        if (r0 != r2) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c2, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c3, code lost:
        X.0eS.A00(r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c8, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b8, code lost:
        if (r3 != false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ba, code lost:
        r4 = X.C361268fw.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0200, code lost:
        r4 = new X.AnonymousClass8Y4(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0205, code lost:
        r0.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0208, code lost:
        r0.A00 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x022a, code lost:
        r4 = X.C361338g4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0273, code lost:
        r0 = r1.emit(r4, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.A03
            switch(r1) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0041;
                case 2: goto L_0x0067;
                case 3: goto L_0x00d0;
                case 4: goto L_0x00e1;
                case 5: goto L_0x0144;
                case 6: goto L_0x022d;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r5 = 1
            if (r1 == 0) goto L_0x02a4
            if (r1 == r5) goto L_0x02c3
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0018:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r6) goto L_0x02c3
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0029:
            X.0eS.A00(r24)
            java.lang.Object r1 = r0.A01
            X.02o r1 = (X.02o) r1
            java.lang.Object r5 = r0.A02
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.util.List[] r5 = (java.util.List[]) r5
            r3 = 0
            r4 = r5[r3]
            r3 = r5[r6]
            java.util.ArrayList r4 = X.00k.A0S(r3, r4)
            goto L_0x0208
        L_0x0041:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x0052
            if (r1 == r4) goto L_0x02c3
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0052:
            X.0eS.A00(r24)
            java.lang.Object r3 = r0.A01
            X.02o r3 = (X.02o) r3
            java.lang.Object r1 = r0.A02
            X.L3W r1 = (X.L3W) r1
            X.0pa r1 = r1.A01
            r0.A00 = r4
            java.lang.Object r0 = X.AnonymousClass11O.A02(r0, r1, r3)
            goto L_0x02c0
        L_0x0067:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r9 = 3
            r8 = 2
            r3 = 1
            if (r1 != 0) goto L_0x02c3
            X.0eS.A00(r24)
            java.lang.Object r4 = r0.A01
            X.02o r4 = (X.02o) r4
            java.lang.Object r5 = r0.A02
            X.8fx r5 = (X.C361278fx) r5
            boolean r1 = r5.A01()
            r7 = 0
            if (r1 == 0) goto L_0x008a
            X.8g4 r1 = X.C361338g4.A00
            r0.A01 = r7
            r0.A00 = r3
            goto L_0x02bc
        L_0x008a:
            r3 = 1065353216(0x3f800000, float:1.0)
            r1 = 30
            X.3QS r6 = new X.3QS
            r6.<init>(r3, r1)
            boolean r1 = r5 instanceof X.AnonymousClass8Y4
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r1 = r5.A00()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r5 = r1.iterator()
        L_0x00a1:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r3 = r5.next()
            r1 = 0
            X.0qQ.A0B(r3, r1)
            java.util.List r1 = r6.A03
            r1.add(r3)
            goto L_0x00a1
        L_0x00b5:
            java.util.List r1 = r6.A03
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00c5
            X.8fw r1 = X.C361268fw.A00
            r0.A01 = r7
            r0.A00 = r8
            goto L_0x02bc
        L_0x00c5:
            X.8Y4 r1 = new X.8Y4
            r1.<init>(r6)
            r0.A01 = r7
            r0.A00 = r9
            goto L_0x02bc
        L_0x00d0:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x01bd
            if (r1 == r6) goto L_0x02c3
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00e1:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 1
            if (r1 == 0) goto L_0x00f2
            if (r1 == r7) goto L_0x02c3
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            X.0eS.A00(r24)
            java.lang.Object r4 = r0.A01
            X.02o r4 = (X.02o) r4
            java.lang.Object r5 = r0.A02
            java.util.List r5 = (java.util.List) r5
            r1 = 10
            int r1 = X.0Yv.A1E(r5, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Iterator r8 = r5.iterator()
        L_0x010c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0138
            java.lang.Object r5 = r8.next()
            X.9c8 r5 = (X.C381669c8) r5
            X.9cM r1 = r5.A02
            java.lang.String r13 = r1.A04
            long r5 = r5.A01
            int r1 = (int) r5
            r10 = 0
            X.51J r11 = X.AnonymousClass51J.SOUND_EFFECTS
            r16 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r20 = -1
            X.51I r9 = new X.51I
            r12 = r10
            r14 = r10
            r15 = r10
            r17 = r16
            r19 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3.add(r9)
            goto L_0x010c
        L_0x0138:
            X.8Y4 r1 = new X.8Y4
            r1.<init>(r3)
            r3 = 0
            r0.A01 = r3
            r0.A00 = r7
            goto L_0x02bc
        L_0x0144:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r6 = 1
            if (r1 == 0) goto L_0x0155
            if (r1 == r6) goto L_0x02c3
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0155:
            X.0eS.A00(r24)
            java.lang.Object r1 = r0.A01
            X.02o r1 = (X.02o) r1
            java.lang.Object r3 = r0.A02
            java.util.List r3 = (java.util.List) r3
            r8 = 0
            X.0qQ.A0B(r3, r8)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r10 = r3.iterator()
        L_0x016d:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x01b4
            java.lang.Object r9 = r10.next()
            X.9cC r9 = (X.C381709cC) r9
            X.8fx r4 = r9.A04
            boolean r3 = r4.A01()
            if (r3 != 0) goto L_0x022a
            boolean r3 = r4 instanceof X.AnonymousClass8Y4
            if (r3 == 0) goto L_0x016d
            java.lang.String r15 = r9.A00()
            if (r15 == 0) goto L_0x01ac
            float r5 = r9.A00
            int r4 = r9.A02
            int r3 = r9.A01
            X.51J r13 = X.AnonymousClass51J.VIDEO_STICKER
            r12 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            X.9pe r11 = new X.9pe
            r14 = r12
            r16 = r12
            r17 = r12
            r20 = r8
            r21 = r4
            r22 = r3
            r18 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r7.add(r11)
            goto L_0x016d
        L_0x01ac:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01b4:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L_0x0200
        L_0x01ba:
            X.8fw r4 = X.C361268fw.A00
            goto L_0x0205
        L_0x01bd:
            X.0eS.A00(r24)
            java.lang.Object r1 = r0.A01
            X.02o r1 = (X.02o) r1
            java.lang.Object r3 = r0.A02
            X.0eP r3 = (X.0eP) r3
            java.lang.Object r4 = r3.A00
            X.8fx r4 = (X.C361278fx) r4
            java.lang.Object r3 = r3.A01
            java.lang.Number r3 = (java.lang.Number) r3
            float r14 = r3.floatValue()
            r3 = 0
            X.0qQ.A0B(r4, r3)
            boolean r3 = r4.A01()
            if (r3 != 0) goto L_0x022a
            boolean r3 = r4 instanceof X.AnonymousClass8Y4
            if (r3 == 0) goto L_0x01ba
            r3 = 0
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x01ba
            java.lang.Object r7 = r4.A00()
            X.51I r7 = (X.AnonymousClass51I) r7
            boolean r3 = r7 instanceof X.C389459pf
            if (r3 == 0) goto L_0x020b
            java.lang.String r8 = r7.A05
            float r5 = r7.A00
            int r4 = r7.A03
            X.9pf r7 = (X.C389459pf) r7
            java.lang.String r3 = r7.A00
            X.9pf r7 = new X.9pf
            r7.<init>(r8, r3, r4, r5)
        L_0x0200:
            X.8Y4 r4 = new X.8Y4
            r4.<init>(r7)
        L_0x0205:
            r3 = 0
            r0.A01 = r3
        L_0x0208:
            r0.A00 = r6
            goto L_0x0273
        L_0x020b:
            java.lang.String r11 = r7.A05
            int r5 = r7.A02
            int r4 = r7.A03
            int r3 = r7.A01
            java.lang.String r12 = r7.A07
            X.51J r9 = r7.A04
            java.lang.String r13 = r7.A06
            r10 = 0
            com.facebook.videolite.transcoder.base.composition.MediaEffect r8 = r7.A09
            r15 = 1065353216(0x3f800000, float:1.0)
            X.51I r7 = new X.51I
            r16 = r5
            r17 = r4
            r18 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0200
        L_0x022a:
            X.8g4 r4 = X.C361338g4.A00
            goto L_0x0205
        L_0x022d:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r9 = 1
            if (r1 == 0) goto L_0x023e
            if (r1 == r9) goto L_0x02c3
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x023e:
            X.0eS.A00(r24)
            java.lang.Object r1 = r0.A01
            X.02o r1 = (X.02o) r1
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            X.0qQ.A0B(r4, r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r4.iterator()
        L_0x0256:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x0295
            java.lang.Object r8 = r11.next()
            X.JvY r8 = (X.C61034JvY) r8
            java.lang.Object r4 = r8.A02
            X.8fx r4 = (X.C361278fx) r4
            boolean r3 = r4.A01()
            if (r3 == 0) goto L_0x0278
            X.8g4 r4 = X.C361338g4.A00
        L_0x026e:
            r3 = 0
            r0.A01 = r3
            r0.A00 = r9
        L_0x0273:
            java.lang.Object r0 = r1.emit(r4, r0)
            goto L_0x02c0
        L_0x0278:
            boolean r3 = r4 instanceof X.AnonymousClass8Y4
            if (r3 == 0) goto L_0x0256
            java.lang.String r7 = r8.A00()
            if (r7 == 0) goto L_0x02c9
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = r8.A01
            java.lang.Object r3 = r8.A03
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r3 = (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r3
            java.lang.String r4 = r3.A02
            X.9pf r3 = new X.9pf
            r3.<init>(r7, r4, r5, r6)
            r10.add(r3)
            goto L_0x0256
        L_0x0295:
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L_0x029e
            X.8fw r4 = X.C361268fw.A00
            goto L_0x026e
        L_0x029e:
            X.8Y4 r4 = new X.8Y4
            r4.<init>(r10)
            goto L_0x026e
        L_0x02a4:
            X.0eS.A00(r24)
            java.lang.Object r4 = r0.A01
            X.02o r4 = (X.02o) r4
            java.lang.Object r3 = r0.A02
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r1 = 0
            X.0qQ.A0B(r3, r1)
            java.util.List r1 = java.util.Arrays.asList(r3)
            X.0qQ.A07(r1)
            r0.A00 = r5
        L_0x02bc:
            java.lang.Object r0 = r4.emit(r1, r0)
        L_0x02c0:
            if (r0 != r2) goto L_0x02c6
            return r2
        L_0x02c3:
            X.0eS.A00(r24)
        L_0x02c6:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x02c9:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9K2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
