package X;

/* renamed from: X.MdF  reason: case insensitive filesystem */
public final /* synthetic */ class C66823MdF extends 0Yk implements 0sG {
    public C66823MdF(Object obj) {
        super(7, obj, C2615249x.class, "mergeDataSources", "mergeDataSources(Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/instagram/direct/inbox/notes/models/NoteItemViewModel;Ljava/util/List;)Ljava/util/List;", 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0206, code lost:
        if (r8 == true) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0216, code lost:
        if (X.0qQ.A0K(r4.A0D, r6.A0A) == false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0372, code lost:
        if (r15.contains(r8) != false) goto L_0x0374;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0201 A[EDGE_INSN: B:234:0x0201->B:98:0x0201 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x02da A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r55, java.lang.Object r56, java.lang.Object r57, java.lang.Object r58, java.lang.Object r59, java.lang.Object r60, java.lang.Object r61) {
        /*
            r54 = this;
            r5 = r60
            r6 = r59
            r15 = r58
            r19 = r57
            r20 = r56
            r7 = r55
            java.util.Map r7 = (java.util.Map) r7
            r0 = r20
            java.util.List r0 = (java.util.List) r0
            r20 = r0
            r0 = r19
            java.util.List r0 = (java.util.List) r0
            r19 = r0
            java.util.List r15 = (java.util.List) r15
            X.4AB r6 = (X.AnonymousClass4AB) r6
            java.util.List r5 = (java.util.List) r5
            r0 = r54
            java.lang.Object r0 = r0.receiver
            X.49x r0 = (X.C2615249x) r0
            if (r7 != 0) goto L_0x005d
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x002c:
            X.0qQ.A07(r1)
            com.instagram.common.session.UserSession r2 = r0.A04
            r11 = 0
            X.0Tu r8 = X.0Tu.A06
            r3 = 36324329423843335(0x810cc900033007, double:3.0349904217484065E-306)
            boolean r3 = X.182.A06(r8, r2, r3)
            if (r3 != 0) goto L_0x0041
            X.0sn r15 = X.0sn.A00
        L_0x0041:
            r18 = 10
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r20)
            java.util.Iterator r4 = r20.iterator()
        L_0x004b:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0089
            java.lang.Object r3 = r4.next()
            X.4zZ r3 = (X.C279864zZ) r3
            java.lang.String r3 = r3.A0K
            r8.add(r3)
            goto L_0x004b
        L_0x005d:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = X.AnonymousClass7TF.A0v(r7)
        L_0x0065:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x002c
            java.lang.Object r10 = r11.next()
            X.3mU r10 = (X.C251053mU) r10
            long r2 = r10.A01
            r8 = 0
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0065
            long r2 = java.lang.System.currentTimeMillis()
            boolean r2 = X.C250993mO.A06(r10, r2)
            if (r2 == 0) goto L_0x0065
            java.lang.String r2 = r10.A04
            r1.add(r2)
            goto L_0x0065
        L_0x0089:
            java.util.Set r8 = X.00k.A0k(r8)
            java.util.Set r4 = r7.keySet()
            r3 = r19
            java.util.LinkedHashSet r3 = X.094.A00(r3, r4)
            java.util.Set r4 = r0.A0A
            java.util.LinkedHashSet r3 = X.094.A00(r4, r3)
            java.util.Set r10 = X.094.A02(r3, r8)
            boolean r3 = X.C66580MXl.A1b(r10)
            if (r3 == 0) goto L_0x00f5
            X.018.A16(r10, r4)
            X.4A0 r7 = r0.A08
            monitor-enter(r7)
            X.1OC r3 = r7.A03     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x00f4
            com.instagram.common.session.UserSession r9 = r7.A07     // Catch:{ all -> 0x00f1 }
            X.1Av r3 = X.1Au.A00(r9)     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3.A21()     // Catch:{ all -> 0x00f1 }
            if (r3 == 0) goto L_0x00f4
            java.lang.Class<X.9V9> r4 = X.AnonymousClass9V9.class
            X.9V8 r3 = new X.9V8     // Catch:{ all -> 0x00f1 }
            r3.<init>(r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Object r12 = r9.A01(r4, r3)     // Catch:{ all -> 0x00f1 }
            X.9V9 r12 = (X.AnonymousClass9V9) r12     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = ","
            r8 = 0
            java.lang.String r4 = X.DbT.A0z(r3, r10, r8)     // Catch:{ all -> 0x00f1 }
            java.util.ArrayList r3 = r12.A00     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x00f4
            java.lang.String[] r3 = new java.lang.String[r11]     // Catch:{ all -> 0x00f1 }
            java.lang.Object[] r4 = r10.toArray(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x00f1 }
            int r3 = r4.length     // Catch:{ all -> 0x00f1 }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x00f1 }
            X.1OC r4 = X.AnonymousClass4A0.A00(r9, r3)     // Catch:{ all -> 0x00f1 }
            r3 = 1
            X.AnonymousClass4A0.A01(r4, r7, r8, r11, r3)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        L_0x00f4:
            monitor-exit(r7)
        L_0x00f5:
            X.0Tu r7 = X.0Tu.A05
            r3 = 36318428138575995(0x81076b0000187b, double:3.031258425182772E-306)
            boolean r3 = X.182.A06(r7, r2, r3)
            if (r3 == 0) goto L_0x014b
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r20.iterator()
        L_0x010a:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x012b
            java.lang.Object r7 = r8.next()
            r3 = r7
            X.4zZ r3 = (X.C279864zZ) r3
            java.lang.String r4 = r3.A0K
            boolean r3 = r1.contains(r4)
            if (r3 != 0) goto L_0x0127
            java.lang.String r3 = r2.A06
            boolean r3 = X.0qQ.A0K(r3, r4)
            if (r3 == 0) goto L_0x010a
        L_0x0127:
            r9.add(r7)
            goto L_0x010a
        L_0x012b:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r20.iterator()
        L_0x0133:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0147
            java.lang.Object r4 = r7.next()
            boolean r3 = r9.contains(r4)
            if (r3 != 0) goto L_0x0133
            r8.add(r4)
            goto L_0x0133
        L_0x0147:
            java.util.ArrayList r20 = X.00k.A0S(r8, r9)
        L_0x014b:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r20.iterator()
        L_0x0153:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x018d
            java.lang.Object r12 = r13.next()
            r3 = r12
            X.4zZ r3 = (X.C279864zZ) r3
            X.5y2 r4 = r3.A0A
            r3 = 0
            if (r4 == 0) goto L_0x018a
            X.60F r9 = r4.A0B
            if (r9 == 0) goto L_0x018b
            java.lang.String r4 = r9.A02
        L_0x016b:
            X.0qQ.A0B(r5, r11)
            int r8 = r5.indexOf(r4)
            r7 = 1
            r4 = 0
            if (r8 != 0) goto L_0x0177
            r4 = 1
        L_0x0177:
            if (r9 == 0) goto L_0x017b
            java.lang.String r3 = r9.A02
        L_0x017b:
            boolean r3 = X.00k.A0u(r5, r3)
            if (r3 == 0) goto L_0x0184
            if (r4 != 0) goto L_0x0184
            r7 = 0
        L_0x0184:
            if (r7 == 0) goto L_0x0153
            r10.add(r12)
            goto L_0x0153
        L_0x018a:
            r9 = r3
        L_0x018b:
            r4 = r3
            goto L_0x016b
        L_0x018d:
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r10.iterator()
        L_0x0195:
            boolean r4 = r17.hasNext()
            r3 = 0
            r16 = 1
            if (r4 == 0) goto L_0x026f
            java.lang.Object r4 = r17.next()
            X.4zZ r4 = (X.C279864zZ) r4
            X.5y2 r7 = r4.A0A
            if (r7 == 0) goto L_0x026c
            X.60F r10 = r7.A0B
        L_0x01aa:
            if (r10 == 0) goto L_0x0269
            java.lang.String r8 = r10.A02
        L_0x01ae:
            X.0qQ.A0B(r5, r11)
            int r8 = r5.indexOf(r8)
            r31 = 0
            if (r8 != 0) goto L_0x01bb
            r31 = 1
        L_0x01bb:
            com.instagram.direct.inbox.notes.NotesRepository r8 = r0.A06
            java.lang.String r9 = r2.A06
            int r24 = r8.A05(r9)
            java.lang.String r12 = r4.A0K
            boolean r26 = r1.contains(r12)
            boolean r13 = X.0qQ.A0K(r9, r12)
            if (r13 == 0) goto L_0x025d
            com.instagram.user.model.User r12 = X.AnonymousClass69P.A05(r2)
        L_0x01d3:
            boolean r27 = X.AnonymousClass9O2.A00(r12)
        L_0x01d7:
            java.lang.String r13 = r0.A00
            java.lang.String r12 = r4.A0H
            boolean r28 = X.0qQ.A0K(r13, r12)
            X.0Ud r8 = r8.A0r
            java.lang.Object r8 = r8.getValue()
            java.util.Map r8 = (java.util.Map) r8
            if (r10 == 0) goto L_0x01eb
            java.lang.String r3 = r10.A02
        L_0x01eb:
            java.lang.Object r3 = r8.get(r3)
            X.4zc r3 = (X.C279894zc) r3
            if (r3 == 0) goto L_0x0208
            java.util.List r8 = r3.A05
            if (r8 == 0) goto L_0x0208
            boolean r3 = r8 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0242
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L_0x0242
        L_0x0201:
            r8 = 0
        L_0x0202:
            r29 = 1
            r3 = r16
            if (r8 == r3) goto L_0x020a
        L_0x0208:
            r29 = 0
        L_0x020a:
            if (r6 == 0) goto L_0x0218
            com.instagram.user.model.User r8 = r4.A0D
            com.instagram.user.model.User r3 = r6.A0A
            boolean r3 = X.0qQ.A0K(r8, r3)
            r30 = 1
            if (r3 != 0) goto L_0x021a
        L_0x0218:
            r30 = 0
        L_0x021a:
            int r25 = r5.size()
            if (r7 == 0) goto L_0x023f
            X.60F r3 = r7.A0B
            if (r3 == 0) goto L_0x023f
            java.lang.Boolean r3 = r3.A00
            if (r3 == 0) goto L_0x023f
            boolean r32 = r3.booleanValue()
        L_0x022c:
            boolean r3 = r4.A0R
            r23 = 0
            r33 = r3
            r21 = r4
            r22 = r2
            X.4AB r3 = X.AnonymousClass911.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r14.add(r3)
            goto L_0x0195
        L_0x023f:
            r32 = 0
            goto L_0x022c
        L_0x0242:
            java.util.Iterator r8 = r8.iterator()
        L_0x0246:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0201
            r8.next()
            com.instagram.user.model.User r3 = r4.A0D
            java.lang.String r3 = r3.getId()
            boolean r3 = X.0qQ.A0K(r3, r9)
            if (r3 == 0) goto L_0x0246
            r8 = 1
            goto L_0x0202
        L_0x025d:
            X.17i r13 = r0.A09
            com.instagram.user.model.User r12 = r13.A02(r12)
            if (r12 != 0) goto L_0x01d3
            r27 = 0
            goto L_0x01d7
        L_0x0269:
            r8 = r3
            goto L_0x01ae
        L_0x026c:
            r10 = r3
            goto L_0x01aa
        L_0x026f:
            r0.A00 = r3
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r20)
            java.util.Iterator r5 = r20.iterator()
        L_0x0279:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x028b
            java.lang.Object r4 = r5.next()
            X.4zZ r4 = (X.C279864zZ) r4
            java.lang.String r4 = r4.A0K
            r7.add(r4)
            goto L_0x0279
        L_0x028b:
            boolean r4 = r14 instanceof java.util.Collection
            if (r4 == 0) goto L_0x02b4
            boolean r4 = r14.isEmpty()
            if (r4 == 0) goto L_0x02b4
        L_0x0295:
            r12 = 0
        L_0x0296:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r15.iterator()
        L_0x029e:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x02dc
            java.lang.Object r5 = r6.next()
            boolean r4 = r7.contains(r5)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x029e
            r8.add(r5)
            goto L_0x029e
        L_0x02b4:
            java.util.Iterator r8 = r14.iterator()
        L_0x02b8:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0295
            java.lang.Object r6 = r8.next()
            X.4AB r6 = (X.AnonymousClass4AB) r6
            com.instagram.user.model.User r4 = r6.A0A
            java.lang.String r5 = r4.getId()
            java.lang.String r4 = r2.A06
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 == 0) goto L_0x02d7
            boolean r5 = r6.A0S
            r4 = 1
            if (r5 == 0) goto L_0x02d8
        L_0x02d7:
            r4 = 0
        L_0x02d8:
            if (r4 == 0) goto L_0x02b8
            r12 = 1
            goto L_0x0296
        L_0x02dc:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r8.iterator()
        L_0x02e4:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x034f
            java.lang.Object r8 = r9.next()
            java.lang.String r8 = (java.lang.String) r8
            X.17i r5 = r0.A09
            com.instagram.user.model.User r6 = r5.A02(r8)
            if (r6 == 0) goto L_0x034d
            boolean r42 = r1.contains(r8)
            X.0sn r35 = X.0sn.A00
            java.lang.String r31 = X.AnonymousClass911.A01(r2, r6)
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r11)
            X.4AB r5 = new X.4AB
            r22 = r3
            r23 = r3
            r24 = r3
            r25 = r6
            r27 = r3
            r28 = r3
            r29 = r3
            r30 = r3
            r32 = r3
            r33 = r3
            r34 = r3
            r36 = r3
            r37 = r3
            r38 = r3
            r39 = r3
            r40 = r3
            r41 = r11
            r43 = r16
            r44 = r11
            r45 = r11
            r46 = r11
            r47 = r11
            r48 = r11
            r49 = r11
            r50 = r11
            r51 = r11
            r52 = r11
            r53 = r11
            r20 = r5
            r21 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
        L_0x0347:
            if (r5 == 0) goto L_0x02e4
            r4.add(r5)
            goto L_0x02e4
        L_0x034d:
            r5 = r3
            goto L_0x0347
        L_0x034f:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r19.iterator()
        L_0x0357:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x037b
            java.lang.Object r8 = r10.next()
            boolean r5 = r1.contains(r8)
            if (r5 == 0) goto L_0x0374
            boolean r5 = r7.contains(r8)
            if (r5 != 0) goto L_0x0374
            boolean r6 = r15.contains(r8)
            r5 = 1
            if (r6 == 0) goto L_0x0375
        L_0x0374:
            r5 = 0
        L_0x0375:
            if (r5 == 0) goto L_0x0357
            r9.add(r8)
            goto L_0x0357
        L_0x037b:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r9.iterator()
        L_0x0383:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x03ec
            java.lang.Object r5 = r7.next()
            java.lang.String r5 = (java.lang.String) r5
            X.17i r1 = r0.A09
            com.instagram.user.model.User r5 = r1.A02(r5)
            if (r5 == 0) goto L_0x03ea
            X.0sn r34 = X.0sn.A00
            java.lang.String r30 = X.AnonymousClass911.A01(r2, r5)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r11)
            X.4AB r1 = new X.4AB
            r19 = r1
            r20 = r3
            r21 = r3
            r22 = r3
            r23 = r3
            r24 = r5
            r26 = r3
            r27 = r3
            r28 = r3
            r29 = r3
            r31 = r3
            r32 = r3
            r33 = r3
            r35 = r3
            r36 = r3
            r37 = r3
            r38 = r3
            r39 = r3
            r40 = r11
            r41 = r16
            r42 = r11
            r43 = r11
            r44 = r11
            r45 = r11
            r46 = r11
            r47 = r11
            r48 = r11
            r49 = r11
            r50 = r11
            r51 = r11
            r52 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
        L_0x03e4:
            if (r1 == 0) goto L_0x0383
            r6.add(r1)
            goto L_0x0383
        L_0x03ea:
            r1 = r3
            goto L_0x03e4
        L_0x03ec:
            java.util.ArrayList r1 = X.00k.A0S(r4, r14)
            java.util.ArrayList r7 = X.00k.A0S(r6, r1)
            java.util.Iterator r6 = r7.iterator()
            r5 = 0
        L_0x03f9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0421
            java.lang.Object r4 = r6.next()
            int r3 = r5 + 1
            if (r5 >= 0) goto L_0x040f
            X.0sr.A1T()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x040f:
            X.4AB r4 = (X.AnonymousClass4AB) r4
            boolean r1 = X.AnonymousClass3HF.A02(r2)
            int r5 = r5 + r1
            r1 = r12 ^ 1
            int r5 = r5 + r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r4.A02 = r1
            r5 = r3
            goto L_0x03f9
        L_0x0421:
            monitor-enter(r0)
            r1 = r18
            int r1 = X.0Yv.A1E(r7, r1)     // Catch:{ all -> 0x0462 }
            int r2 = X.0se.A0L(r1)     // Catch:{ all -> 0x0462 }
            r1 = 16
            if (r2 >= r1) goto L_0x0432
            r2 = 16
        L_0x0432:
            java.util.LinkedHashMap r6 = X.DbS.A0x(r2)     // Catch:{ all -> 0x0462 }
            java.util.Iterator r5 = r7.iterator()     // Catch:{ all -> 0x0462 }
        L_0x043a:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0462 }
            if (r1 == 0) goto L_0x045e
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0462 }
            r3 = r4
            X.4AB r3 = (X.AnonymousClass4AB) r3     // Catch:{ all -> 0x0462 }
            java.lang.String r2 = r3.A0F     // Catch:{ all -> 0x0462 }
            boolean r1 = r3.A0Q     // Catch:{ all -> 0x0462 }
            if (r1 == 0) goto L_0x0450
            if (r2 == 0) goto L_0x0450
            goto L_0x045a
        L_0x0450:
            java.lang.String r2 = r3.A0G     // Catch:{ all -> 0x0462 }
            if (r2 != 0) goto L_0x045a
            com.instagram.user.model.User r1 = r3.A0A     // Catch:{ all -> 0x0462 }
            java.lang.String r2 = r1.getId()     // Catch:{ all -> 0x0462 }
        L_0x045a:
            r6.put(r2, r4)     // Catch:{ all -> 0x0462 }
            goto L_0x043a
        L_0x045e:
            r0.A01 = r6     // Catch:{ all -> 0x0462 }
            monitor-exit(r0)
            return r7
        L_0x0462:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66823MdF.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
