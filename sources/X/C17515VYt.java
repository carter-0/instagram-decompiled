package X;

/* renamed from: X.VYt  reason: case insensitive filesystem */
public final class C17515VYt {
    public C21046XBn A00;
    public final C17793Vg5 A01 = new C17793Vg5();
    public final 0lg A02;
    public final C271514iy A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.X2v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.X2v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.X2v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.X2v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: X.X2v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.X2v} */
    /* JADX WARNING: type inference failed for: r17v0, types: [java.lang.Object, X.VIz] */
    /* JADX WARNING: type inference failed for: r16v0, types: [java.lang.Object, X.VIy] */
    /* JADX WARNING: type inference failed for: r15v0, types: [X.VIx, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r24v0, types: [X.V6s, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v20, types: [X.X6A, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r2 != false) goto L_0x0039;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17515VYt(X.0lg r32) {
        /*
            r31 = this;
            r0 = r31
            r0.<init>()
            X.Vg5 r1 = new X.Vg5
            r1.<init>()
            r0.A01 = r1
            r1 = r32
            r0.A02 = r1
            X.4iy r11 = X.C271504ix.A00(r1)
            r0.A03 = r11
            monitor-enter(r11)
            monitor-exit(r11)
            r10 = 0
            X.0lg r7 = r0.A02
            boolean r1 = r7 instanceof com.instagram.common.session.UserSession
            if (r1 == 0) goto L_0x0237
            boolean r1 = r11.A00()
            if (r1 != 0) goto L_0x0039
            monitor-enter(r11)
            java.lang.Boolean r1 = r11.A00     // Catch:{ all -> 0x022f }
            if (r1 == 0) goto L_0x002f
            boolean r2 = r1.booleanValue()     // Catch:{ all -> 0x022f }
            goto L_0x0036
        L_0x002f:
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x022f }
            r11.A00 = r1     // Catch:{ all -> 0x022f }
        L_0x0036:
            monitor-exit(r11)
            if (r2 == 0) goto L_0x0237
        L_0x0039:
            X.VQA r5 = new X.VQA
            r5.<init>(r0)
            java.lang.Class<X.VQ5> r2 = X.VQ5.class
            r1 = 8
            java.lang.Object r4 = X.C20405Wqp.A00(r7, r2, r1)
            X.VQ5 r4 = (X.VQ5) r4
            java.lang.Class<X.VU9> r2 = X.VU9.class
            r1 = 9
            java.lang.Object r3 = X.C20405Wqp.A00(r7, r2, r1)
            X.VU9 r3 = (X.VU9) r3
            X.VIz r17 = new X.VIz
            r17.<init>()
            X.VIy r16 = new X.VIy
            r16.<init>()
            java.lang.Class<X.VQ9> r2 = X.VQ9.class
            r1 = 11
            java.lang.Object r1 = X.C20405Wqp.A00(r7, r2, r1)
            X.VQ9 r1 = (X.VQ9) r1
            X.VIx r15 = new X.VIx
            r15.<init>()
            X.WLw r9 = new X.WLw
            r12 = r9
            r13 = r4
            r14 = r3
            r18 = r1
            r19 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.VQ7 r5 = new X.VQ7
            r5.<init>(r7)
            X.Vg5 r4 = r0.A01
            r2 = 0
            r8 = 0
            r1 = 0
            r12 = r7
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            boolean r3 = r11.A00()
            if (r3 == 0) goto L_0x00b0
            X.VQ4 r14 = new X.VQ4
            r14.<init>()
            java.lang.Class<X.VU7> r3 = X.VU7.class
            r2 = 6
            java.lang.Object r13 = X.C20405Wqp.A00(r12, r3, r2)
            X.VU7 r13 = (X.VU7) r13
            java.lang.Class<X.VQ8> r3 = X.VQ8.class
            r2 = 10
            java.lang.Object r6 = X.C20405Wqp.A00(r12, r3, r2)
            X.VQ8 r6 = (X.VQ8) r6
            java.lang.Class<X.VU8> r3 = X.VU8.class
            r2 = 7
            java.lang.Object r3 = X.C20405Wqp.A00(r12, r3, r2)
            X.VU8 r3 = (X.VU8) r3
            X.WLy r2 = new X.WLy
            r2.<init>(r13, r14, r3, r6)
        L_0x00b0:
            monitor-enter(r11)
            java.lang.Boolean r3 = r11.A00     // Catch:{ all -> 0x022f }
            if (r3 == 0) goto L_0x00ba
            boolean r6 = r3.booleanValue()     // Catch:{ all -> 0x022f }
            goto L_0x00c1
        L_0x00ba:
            r6 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x022f }
            r11.A00 = r3     // Catch:{ all -> 0x022f }
        L_0x00c1:
            monitor-exit(r11)
            if (r6 == 0) goto L_0x00dd
            X.S1W r11 = new X.S1W
            r11.<init>(r12)
            java.lang.Class<X.VQ8> r3 = X.VQ8.class
            r1 = 10
            java.lang.Object r6 = X.C20405Wqp.A00(r12, r3, r1)
            X.VQ8 r6 = (X.VQ8) r6
            X.VQ7 r3 = new X.VQ7
            r3.<init>(r7)
            X.WLx r1 = new X.WLx
            r1.<init>(r3, r6, r11)
        L_0x00dd:
            r13 = 0
            r16 = 0
            X.VV3 r15 = new X.VV3
            r15.<init>()
            r18 = 0
            r22 = 0
            r7 = r8
            r6 = r8
            X.WM2 r3 = new X.WM2
            r3.<init>()
            X.Vk4 r27 = new X.Vk4
            r27.<init>()
            X.0qJ r11 = X.C62670v5.A0B
            X.0v5 r11 = r11.A01()
            android.net.NetworkInfo r11 = r11.A03()
            if (r11 == 0) goto L_0x01b8
            int r11 = r11.getType()
        L_0x0105:
            java.lang.String r29 = "none"
            switch(r11) {
                case 0: goto L_0x0190;
                case 1: goto L_0x0198;
                case 2: goto L_0x019c;
                case 3: goto L_0x01a0;
                case 4: goto L_0x01a4;
                case 5: goto L_0x01a8;
                case 6: goto L_0x01ac;
                case 7: goto L_0x01b0;
                case 8: goto L_0x010a;
                case 9: goto L_0x01b4;
                default: goto L_0x010a;
            }
        L_0x010a:
            boolean r11 = X.14i.A08()
            r30 = r11 ^ 1
            X.V6s r24 = new X.V6s
            r24.<init>()
            X.WM1 r28 = new X.WM1
            r28.<init>()
            X.WM2 r25 = new X.WM2
            r25.<init>()
            X.WM2 r26 = new X.WM2
            r26.<init>()
            X.Vsu r14 = new X.Vsu
            r23 = r14
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            X.WM2.A00(r3, r9)
            if (r2 == 0) goto L_0x013e
            X.VsQ r13 = r2.A00()
            r18 = 1
            X.WLC r7 = new X.WLC
            r7.<init>()
            X.WM2.A00(r3, r2)
        L_0x013e:
            if (r1 == 0) goto L_0x014e
            X.VsR r16 = r1.A00()
            r22 = 1
            X.WLE r6 = new X.WLE
            r6.<init>()
            X.WM2.A00(r3, r1)
        L_0x014e:
            X.VcC r12 = new X.VcC
            r19 = r10
            r20 = r10
            r21 = r10
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.WLF r9 = new X.WLF
            r9.<init>(r7, r6)
            X.WL7 r6 = new X.WL7
            r6.<init>()
            X.WM2 r11 = new X.WM2
            r11.<init>()
            java.util.Iterator r7 = r3.iterator()
        L_0x016e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x01bc
            java.lang.Object r1 = r7.next()
            X.X6C r1 = (X.X6C) r1
            X.WM2 r1 = r1.BI7()
            java.util.Iterator r2 = r1.iterator()
        L_0x0182:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x016e
            java.lang.Object r1 = r2.next()
            X.WM2.A00(r11, r1)
            goto L_0x0182
        L_0x0190:
            r11 = 1603(0x643, float:2.246E-42)
            java.lang.String r29 = X.AnonymousClass000.A00(r11)
            goto L_0x010a
        L_0x0198:
            java.lang.String r29 = "wifi"
            goto L_0x010a
        L_0x019c:
            java.lang.String r29 = "mobile_mms"
            goto L_0x010a
        L_0x01a0:
            java.lang.String r29 = "mobile_supl"
            goto L_0x010a
        L_0x01a4:
            java.lang.String r29 = "mobile_dun"
            goto L_0x010a
        L_0x01a8:
            java.lang.String r29 = "mobile_hipri"
            goto L_0x010a
        L_0x01ac:
            java.lang.String r29 = "wimax"
            goto L_0x010a
        L_0x01b0:
            java.lang.String r29 = "bluetooth"
            goto L_0x010a
        L_0x01b4:
            java.lang.String r29 = "ethernet"
            goto L_0x010a
        L_0x01b8:
            r11 = 8
            goto L_0x0105
        L_0x01bc:
            X.WL6 r7 = new X.WL6
            r7.<init>(r11)
            X.WM2 r11 = new X.WM2
            r11.<init>()
            r2 = 2
            X.WLB r1 = new X.WLB
            r1.<init>(r5, r2)
            X.WM2.A00(r11, r1)
            X.WLA r1 = new X.WLA
            r1.<init>()
            X.WM2.A00(r11, r1)
            r5 = 1
            X.WLf r1 = new X.WLf
            r1.<init>()
            X.X6A[] r2 = new X.X6A[]{r1, r6, r7}
            X.WLB r1 = new X.WLB
            r1.<init>(r2, r5)
            X.WM2.A00(r11, r1)
            X.X2u[] r2 = new X.C20890X2u[r10]
            java.util.ArrayList r1 = r11.A00
            java.lang.Object[] r1 = r1.toArray(r2)
            X.X2u[] r1 = (X.C20890X2u[]) r1
            X.WLB r2 = X.C16810V6r.A00(r1)
            X.WLJ r1 = new X.WLJ
            r1.<init>(r9, r4, r12)
            X.XBn r5 = r2.ASY(r1)
            r4.A00 = r5
            r4.A00()
            r7.A00 = r5
            java.util.Iterator r3 = r3.iterator()
        L_0x020b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0232
            java.lang.Object r1 = r3.next()
            X.X6C r1 = (X.X6C) r1
            X.WM2 r1 = r1.Bp9()
            java.util.Iterator r2 = r1.iterator()
        L_0x021f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x020b
            java.lang.Object r1 = r2.next()
            X.X69 r1 = (X.X69) r1
            r6.A00(r1, r8)
            goto L_0x021f
        L_0x022f:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x0232:
            X.0Sd.A00(r5)
            r0.A00 = r5
        L_0x0237:
            X.0lg r1 = r0.A02
            X.3kW r8 = X.AnonymousClass1Qz.A00(r1)
            X.XBn r7 = r0.A00
            if (r7 == 0) goto L_0x02c3
            java.util.Map r0 = X.VKL.A00
            X.WM1 r6 = new X.WM1
            r6.<init>()
            X.1R7 r0 = r8.C82()
            java.util.Set r0 = r0.A0C
            java.util.Iterator r2 = X.Pxg.A16(r0)
        L_0x0252:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x026b
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = X.VKL.A00
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0265
            r1 = r0
        L_0x0265:
            java.util.HashSet r0 = r6.A00
            r0.add(r1)
            goto L_0x0252
        L_0x026b:
            X.WM2 r5 = new X.WM2
            r5.<init>()
            X.1R7 r0 = r8.C82()
            java.util.List r0 = r0.A0B
            java.util.Iterator r3 = X.Pxg.A16(r0)
        L_0x027a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0293
            java.lang.Object r0 = r3.next()
            X.1R4 r0 = (X.1R4) r0
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r0.A01
            X.Vg6 r0 = new X.Vg6
            r0.<init>(r2, r1)
            X.WM2.A00(r5, r0)
            goto L_0x027a
        L_0x0293:
            X.WM2 r4 = new X.WM2
            r4.<init>()
            X.1R7 r0 = r8.C82()
            java.util.List r0 = r0.A0A
            java.util.Iterator r3 = X.Pxg.A16(r0)
        L_0x02a2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02bb
            java.lang.Object r0 = r3.next()
            X.1R4 r0 = (X.1R4) r0
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r0.A01
            X.Vg6 r0 = new X.Vg6
            r0.<init>(r2, r1)
            X.WM2.A00(r4, r0)
            goto L_0x02a2
        L_0x02bb:
            X.UVX r0 = new X.UVX
            r0.<init>(r5, r4, r6)
            r7.APd(r0)
        L_0x02c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17515VYt.<init>(X.0lg):void");
    }
}
