package X;

/* renamed from: X.MbZ  reason: case insensitive filesystem */
public final class C66728MbZ implements Runnable {
    public boolean A00;
    public final Object A01;
    public final /* synthetic */ C67103MiN A02;

    public C66728MbZ(C67103MiN miN, Object obj) {
        this.A02 = miN;
        this.A01 = obj;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x00fa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x017f A[Catch:{ all -> 0x029f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r15 = r33
            X.MiN r7 = r15.A02
            X.MiP r0 = r7.A03
            java.lang.Object r6 = r15.A01
            java.util.List r6 = (java.util.List) r6
            r5 = 0
            X.0qQ.A0B(r6, r5)
            X.MbQ r1 = r0.A00
            X.Mau r4 = r1.A0C
            X.2EM r0 = r1.A00
            r32 = r0
            boolean r0 = r1.A03
            r31 = r0
            boolean r0 = r1.A06
            r27 = r0
            boolean r0 = r1.A04
            r28 = r0
            boolean r0 = r1.A05
            r29 = r0
            X.3sy r0 = r1.A01
            r30 = r0
            java.lang.String r0 = "DirectThreadRowViewModelFactory.createList"
            X.0lp r19 = X.0lq.A00(r0)
            int r18 = r6.size()     // Catch:{ all -> 0x029f }
            java.util.ArrayList r3 = X.DbS.A0v(r18)     // Catch:{ all -> 0x029f }
            X.MiR r0 = r4.A03     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0043
            X.34p r0 = r0.A00     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0043
            r0.A04()     // Catch:{ all -> 0x029f }
        L_0x0043:
            com.instagram.common.session.UserSession r10 = r4.A05     // Catch:{ all -> 0x029f }
            boolean r0 = X.C308556Us.A02(r10)     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0054
            android.content.Context r1 = r4.A04     // Catch:{ all -> 0x029f }
            X.MqI r0 = new X.MqI     // Catch:{ all -> 0x029f }
            r0.<init>(r10, r1)     // Catch:{ all -> 0x029f }
            r4.A02 = r0     // Catch:{ all -> 0x029f }
        L_0x0054:
            X.0nO r17 = X.0nY.A00()     // Catch:{ all -> 0x029f }
            android.content.Context r0 = r4.A04     // Catch:{ all -> 0x029f }
            X.MbI r12 = X.C66685Mas.A00(r0, r10)     // Catch:{ all -> 0x029f }
            boolean r0 = r12.A0C     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x01b7
            int r1 = r6.size()     // Catch:{ all -> 0x029f }
            int r0 = r12.A05     // Catch:{ all -> 0x029f }
            if (r1 > r0) goto L_0x01b7
            boolean r0 = r12.A02     // Catch:{ all -> 0x029f }
            if (r0 != 0) goto L_0x00f4
            java.util.Iterator r16 = r6.iterator()     // Catch:{ all -> 0x029f }
        L_0x0072:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r14 = r16.next()     // Catch:{ all -> 0x029f }
            X.2Ep r14 = (X.AnonymousClass2Ep) r14     // Catch:{ all -> 0x029f }
            java.lang.String r13 = r14.C6C()     // Catch:{ all -> 0x029f }
            X.1Av r11 = r12.A0B     // Catch:{ all -> 0x029f }
            java.lang.String r9 = "inbox_reminder_thread_map"
            java.util.HashMap r0 = X.1Av.A02(r11, r9)     // Catch:{ all -> 0x029f }
            boolean r0 = r0.containsKey(r13)     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0072
            X.3su r8 = X.AnonymousClass48N.A01(r14)     // Catch:{ all -> 0x029f }
            com.instagram.common.session.UserSession r2 = r12.A0A     // Catch:{ all -> 0x029f }
            android.content.Context r0 = r12.A09     // Catch:{ all -> 0x029f }
            r21 = r0
            X.MaI r0 = X.C66653MaM.A00(r0, r2)     // Catch:{ all -> 0x029f }
            X.Mar r1 = new X.Mar     // Catch:{ all -> 0x029f }
            r1.<init>(r2, r8, r14, r0)     // Catch:{ all -> 0x029f }
            if (r8 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r0 = 0
            goto L_0x00b9
        L_0x00a8:
            X.48T r25 = X.C66708MbF.A00(r2, r14)     // Catch:{ all -> 0x029f }
            X.MbE r0 = new X.MbE     // Catch:{ all -> 0x029f }
            r20 = r0
            r22 = r2
            r23 = r8
            r24 = r14
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x029f }
        L_0x00b9:
            X.N4R r2 = new X.N4R     // Catch:{ all -> 0x029f }
            r2.<init>((X.C74514Pw9) r0, (X.C74516PwB) r1)     // Catch:{ all -> 0x029f }
            java.util.HashMap r0 = X.1Av.A02(r11, r9)     // Catch:{ all -> 0x029f }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x029f }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ all -> 0x029f }
            r14 = 0
            if (r0 == 0) goto L_0x00d4
            double r0 = r0.doubleValue()     // Catch:{ all -> 0x029f }
            int r8 = (int) r0     // Catch:{ all -> 0x029f }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x029f }
        L_0x00d4:
            X.MkN[] r13 = X.C67227MkN.values()     // Catch:{ all -> 0x029f }
            int r11 = r13.length     // Catch:{ all -> 0x029f }
            r9 = 0
        L_0x00da:
            if (r9 >= r11) goto L_0x0072
            r8 = r13[r9]     // Catch:{ all -> 0x029f }
            int r1 = r8.A00     // Catch:{ all -> 0x029f }
            if (r14 == 0) goto L_0x00ee
            int r0 = r14.intValue()     // Catch:{ all -> 0x029f }
            if (r1 != r0) goto L_0x00ee
            java.util.Map r0 = r12.A01     // Catch:{ all -> 0x029f }
            r0.put(r8, r2)     // Catch:{ all -> 0x029f }
            goto L_0x0072
        L_0x00ee:
            int r9 = r9 + 1
            goto L_0x00da
        L_0x00f1:
            r0 = 1
            r12.A02 = r0     // Catch:{ all -> 0x029f }
        L_0x00f4:
            java.util.Map r9 = r12.A01     // Catch:{ all -> 0x029f }
            java.util.Iterator r16 = X.DbV.A16(r9)     // Catch:{ all -> 0x029f }
        L_0x00fa:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r8 = r16.next()     // Catch:{ all -> 0x029f }
            X.MkN r8 = (X.C67227MkN) r8     // Catch:{ all -> 0x029f }
            boolean r0 = r6 instanceof java.util.Collection     // Catch:{ all -> 0x029f }
            r11 = 1
            if (r0 == 0) goto L_0x013c
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x013c
        L_0x0111:
            boolean r0 = X.C66711MbI.A01(r12, r8)     // Catch:{ all -> 0x029f }
            if (r0 != 0) goto L_0x016f
            r0 = 0
            r9.put(r8, r0)     // Catch:{ all -> 0x029f }
            X.C66711MbI.A00(r12)     // Catch:{ all -> 0x029f }
            X.MkN r1 = X.C67227MkN.SENDER     // Catch:{ all -> 0x029f }
            X.1Av r0 = r12.A0B     // Catch:{ all -> 0x029f }
            if (r8 != r1) goto L_0x0133
            X.0xa r0 = r0.A01     // Catch:{ all -> 0x029f }
            X.0xY r1 = r0.AR4()     // Catch:{ all -> 0x029f }
            java.lang.String r0 = "inbox_sender_reminder_impression_count"
        L_0x012c:
            r1.E5Z(r0, r5)     // Catch:{ all -> 0x029f }
            r1.apply()     // Catch:{ all -> 0x029f }
            goto L_0x00fa
        L_0x0133:
            X.0xa r0 = r0.A01     // Catch:{ all -> 0x029f }
            X.0xY r1 = r0.AR4()     // Catch:{ all -> 0x029f }
            java.lang.String r0 = "inbox_receiver_reminder_impression_count"
            goto L_0x012c
        L_0x013c:
            java.util.Iterator r14 = r6.iterator()     // Catch:{ all -> 0x029f }
        L_0x0140:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0111
            java.lang.Object r13 = r14.next()     // Catch:{ all -> 0x029f }
            X.2Eu r13 = (X.2Eu) r13     // Catch:{ all -> 0x029f }
            java.lang.Object r0 = r9.get(r8)     // Catch:{ all -> 0x029f }
            X.N4R r0 = (X.N4R) r0     // Catch:{ all -> 0x029f }
            r2 = 0
            if (r0 == 0) goto L_0x0188
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x029f }
            X.Pw9 r0 = (X.C74514Pw9) r0     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0186
            java.lang.String r1 = r0.getId()     // Catch:{ all -> 0x029f }
        L_0x015f:
            X.3su r0 = r13.BKv()     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0169
            java.lang.String r2 = r0.A0g()     // Catch:{ all -> 0x029f }
        L_0x0169:
            boolean r0 = X.0qQ.A0K(r1, r2)     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x0140
        L_0x016f:
            java.util.Map r2 = r12.A00     // Catch:{ all -> 0x029f }
            java.lang.Object r1 = r2.get(r8)     // Catch:{ all -> 0x029f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x029f }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x00fa
            int r0 = r8.ordinal()     // Catch:{ all -> 0x029f }
            if (r0 == r5) goto L_0x018d
            goto L_0x018a
        L_0x0186:
            r1 = 0
            goto L_0x015f
        L_0x0188:
            r1 = r2
            goto L_0x015f
        L_0x018a:
            if (r0 != r11) goto L_0x029a
            goto L_0x0198
        L_0x018d:
            X.1Av r0 = r12.A0B     // Catch:{ all -> 0x029f }
            X.0xa r0 = r0.A01     // Catch:{ all -> 0x029f }
            X.0xY r13 = r0.AR4()     // Catch:{ all -> 0x029f }
            java.lang.String r1 = "inbox_sender_reminder_impression_count"
            goto L_0x01a2
        L_0x0198:
            X.1Av r0 = r12.A0B     // Catch:{ all -> 0x029f }
            X.0xa r0 = r0.A01     // Catch:{ all -> 0x029f }
            X.0xY r13 = r0.AR4()     // Catch:{ all -> 0x029f }
            java.lang.String r1 = "inbox_receiver_reminder_impression_count"
        L_0x01a2:
            int r0 = r0.getInt(r1, r5)     // Catch:{ all -> 0x029f }
            int r0 = r0 + 1
            r13.E5Z(r1, r0)     // Catch:{ all -> 0x029f }
            r13.apply()     // Catch:{ all -> 0x029f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x029f }
            r2.put(r8, r0)     // Catch:{ all -> 0x029f }
            goto L_0x00fa
        L_0x01b7:
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x029f }
            r0 = 36327576418990609(0x810fbd00013a11, double:3.0370438345541426E-306)
            boolean r9 = X.182.A06(r2, r10, r0)     // Catch:{ all -> 0x029f }
            r8 = 0
        L_0x01c3:
            r0 = r18
            if (r8 >= r0) goto L_0x022b
            X.MbD r20 = new X.MbD     // Catch:{ all -> 0x029f }
            r21 = r4
            r22 = r32
            r23 = r30
            r24 = r6
            r25 = r8
            r26 = r31
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x029f }
            if (r9 == 0) goto L_0x01f8
            java.lang.String r0 = "DirectThreadRowViewModelFactory.buildRowViewModelAsync"
            X.0lp r2 = X.0lq.A00(r0)     // Catch:{ all -> 0x029f }
            r23 = 671426005(0x280525d5, float:7.391187E-15)
            r24 = 2
            X.0nc r1 = new X.0nc     // Catch:{ all -> 0x0215 }
            r21 = r1
            r22 = r20
            r25 = r5
            r26 = r5
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0215 }
            r0 = r17
            r0.ATD(r1)     // Catch:{ all -> 0x0215 }
            goto L_0x020c
        L_0x01f8:
            java.lang.String r0 = "DirectThreadRowViewModelFactory.buildRowViewModelSync"
            X.0lp r2 = X.0lq.A00(r0)     // Catch:{ Exception -> 0x0225 }
            java.lang.Object r0 = r20.call()     // Catch:{ all -> 0x021b }
            X.Mb9 r0 = (X.C66702Mb9) r0     // Catch:{ all -> 0x021b }
            com.google.common.util.concurrent.ListenableFuture r1 = X.C255183ti.A03(r0)     // Catch:{ all -> 0x021b }
            r2.close()     // Catch:{ Exception -> 0x0225 }
            goto L_0x020f
        L_0x020c:
            r2.close()     // Catch:{ all -> 0x029f }
        L_0x020f:
            r3.add(r1)     // Catch:{ all -> 0x029f }
            int r8 = r8 + 1
            goto L_0x01c3
        L_0x0215:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0295 }
            goto L_0x029e
        L_0x021b:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0220 }
            goto L_0x0224
        L_0x0220:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ Exception -> 0x0225 }
        L_0x0224:
            throw r1     // Catch:{ Exception -> 0x0225 }
        L_0x0225:
            r0 = move-exception
            java.lang.RuntimeException r1 = X.C41845B3m.A0j(r0)     // Catch:{ all -> 0x029f }
            goto L_0x029e
        L_0x022b:
            java.lang.String r8 = "DirectThreadRowViewModelFactory"
            java.lang.String r0 = "DirectThreadRowViewModelFactory.collectRowViewModels"
            X.0lp r10 = X.0lq.A00(r0)     // Catch:{ all -> 0x029f }
            int r6 = r3.size()     // Catch:{ all -> 0x0290 }
            java.util.ArrayList r2 = X.DbS.A0v(r6)     // Catch:{ all -> 0x0290 }
        L_0x023b:
            if (r5 >= r6) goto L_0x0270
            java.lang.String r0 = "DirectThreadRowViewModelFactory.collectRowViewModels: row"
            X.0lp r9 = X.0lq.A00(r0)     // Catch:{ InterruptedException -> 0x0267, ExecutionException -> 0x0260 }
            java.lang.Object r0 = r3.get(r5)     // Catch:{ all -> 0x0256 }
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0     // Catch:{ all -> 0x0256 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0256 }
            X.Mb9 r0 = (X.C66702Mb9) r0     // Catch:{ all -> 0x0256 }
            r2.add(r0)     // Catch:{ all -> 0x0256 }
            r9.close()     // Catch:{ InterruptedException -> 0x0267, ExecutionException -> 0x0260 }
            goto L_0x026d
        L_0x0256:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x025b }
            goto L_0x025f
        L_0x025b:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ InterruptedException -> 0x0267, ExecutionException -> 0x0260 }
        L_0x025f:
            throw r1     // Catch:{ InterruptedException -> 0x0267, ExecutionException -> 0x0260 }
        L_0x0260:
            r1 = move-exception
            java.lang.String r0 = "ExecutionException in thread row creation"
            X.0KC.A0F(r8, r0, r1)     // Catch:{ all -> 0x0290 }
            goto L_0x026d
        L_0x0267:
            r1 = move-exception
            java.lang.String r0 = "InterruptedException in thread row creation"
            X.0KC.A0F(r8, r0, r1)     // Catch:{ all -> 0x0290 }
        L_0x026d:
            int r5 = r5 + 1
            goto L_0x023b
        L_0x0270:
            r10.close()     // Catch:{ all -> 0x029f }
            X.MiR r0 = r4.A03     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x027e
            X.34p r0 = r0.A00     // Catch:{ all -> 0x029f }
            if (r0 == 0) goto L_0x027e
            r0.A05()     // Catch:{ all -> 0x029f }
        L_0x027e:
            r19.close()
            android.os.Handler r1 = r7.A02
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            X.Mbg r0 = new X.Mbg
            r0.<init>(r15, r7, r2)
            r1.post(r0)
            return
        L_0x0290:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0295 }
            goto L_0x029e
        L_0x0295:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ all -> 0x029f }
            goto L_0x029e
        L_0x029a:
            X.Wub r1 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x029f }
        L_0x029e:
            throw r1     // Catch:{ all -> 0x029f }
        L_0x029f:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x02a4 }
            throw r1
        L_0x02a4:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66728MbZ.run():void");
    }
}
