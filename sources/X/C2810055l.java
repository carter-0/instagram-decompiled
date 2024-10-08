package X;

/* renamed from: X.55l  reason: invalid class name and case insensitive filesystem */
public final class C2810055l extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ AnonymousClass1MT A03;

    public C2810055l(0lg r1, AnonymousClass1MT r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0138 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0178 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r21) {
        /*
            r20 = this;
            r8 = r21
            r0 = -690245403(0xffffffffd6dbb0e5, float:-1.20776401E14)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.55j r8 = (X.C2809855j) r8
            r0 = -742844693(0xffffffffd3b916eb, float:-1.5899069E12)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r7 = r20
            X.C2810055l.super.onSuccess(r8)
            java.lang.String r1 = r8.A04
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = "off"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
        L_0x0023:
            X.1MT r0 = r7.A03
            java.util.concurrent.Semaphore r0 = r0.A05
            r0.release()
            r0 = -2054823010(0xffffffff8585e39e, float:-1.2590873E-35)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -2062260267(0xffffffff851467d5, float:-6.9779975E-36)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x0037:
            int r1 = r8.A00
            int r0 = r7.A01
            if (r1 < r0) goto L_0x0242
            X.1MT r9 = r7.A03
            X.0lg r4 = r7.A02
            int r3 = r7.A00
            X.55o r11 = r8.A01
            X.CFJ r0 = r11.A00
            if (r0 == 0) goto L_0x00d6
            android.content.Context r10 = X.C60960kU.A00
            java.util.Set r1 = r0.A00
            java.lang.Class<X.XVU> r19 = X.XVU.class
            monitor-enter(r19)
            if (r1 == 0) goto L_0x00d3
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0253 }
            if (r0 != 0) goto L_0x00d3
            X.0qQ.A0A(r10)     // Catch:{ all -> 0x0253 }
            X.1BO r2 = new X.1BO     // Catch:{ all -> 0x0253 }
            r2.<init>(r10)     // Catch:{ all -> 0x0253 }
            java.util.Iterator r18 = r1.iterator()     // Catch:{ all -> 0x0253 }
            r17 = 0
            r16 = 0
        L_0x0068:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r0 = r18.next()     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0253 }
            r15 = 1
            X.0qQ.A0B(r0, r15)     // Catch:{ all -> 0x0253 }
            java.lang.String r14 = X.SBZ.A00(r0)     // Catch:{ all -> 0x0253 }
            int r0 = r14.length()     // Catch:{ all -> 0x0253 }
            r13 = 0
            if (r0 == 0) goto L_0x00c3
            java.lang.String[] r12 = X.SBZ.A00     // Catch:{ all -> 0x0253 }
            r10 = 3
            r1 = 0
        L_0x0087:
            r0 = r12[r1]     // Catch:{ all -> 0x0253 }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0253 }
            if (r0 != 0) goto L_0x00c3
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x0087
            java.lang.String r10 = java.io.File.separator     // Catch:{ all -> 0x0253 }
            java.lang.String r12 = X.002.A0R(r14, r10)     // Catch:{ all -> 0x0253 }
            java.lang.String r1 = "__i_know_what_i_am_doing__"
            X.0qQ.A0B(r1, r15)     // Catch:{ all -> 0x0253 }
            boolean r0 = r14.endsWith(r1)     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = ""
            java.lang.String r0 = X.00p.A0g(r14, r1, r0, r13)     // Catch:{ all -> 0x0253 }
            java.lang.String r1 = X.SBZ.A00(r0)     // Catch:{ all -> 0x0253 }
            int r0 = r1.length()     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x00c3
            java.lang.String r12 = X.002.A0R(r1, r10)     // Catch:{ all -> 0x0253 }
        L_0x00b8:
            if (r12 == 0) goto L_0x00c3
            java.io.File r0 = r2.A01(r12)     // Catch:{ all -> 0x0253 }
            boolean r16 = X.0Gw.A02(r0)     // Catch:{ all -> 0x0253 }
            goto L_0x0068
        L_0x00c3:
            r17 = 1
            goto L_0x0068
        L_0x00c6:
            if (r17 == 0) goto L_0x00cb
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0253 }
            goto L_0x00d9
        L_0x00cb:
            if (r16 == 0) goto L_0x00d0
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0253 }
            goto L_0x00d9
        L_0x00d0:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0253 }
            goto L_0x00d9
        L_0x00d3:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0253 }
            goto L_0x00d9
        L_0x00d6:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            goto L_0x00e9
        L_0x00d9:
            monitor-exit(r19)
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x0228
            r0 = 2
            if (r1 == r0) goto L_0x0228
            r0 = 0
            if (r1 == r0) goto L_0x00d6
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
        L_0x00e9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0110
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x0104
            X.183 r1 = X.183.A01
            r1.getClass()
            X.0yO r0 = X.0yO.A03
            X.0mD r0 = r1.A00(r4, r0)
            r2.add(r0)
        L_0x0104:
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x0110
            X.183 r0 = X.183.A01
            r0.getClass()
            r0.A08(r4)
        L_0x0110:
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x0122
            X.183 r1 = X.183.A01
            r1.getClass()
            X.0yO r0 = X.0yO.A02
            X.0mD r0 = r1.A00(r4, r0)
            r2.add(r0)
        L_0x0122:
            java.util.Iterator r12 = r2.iterator()
        L_0x0126:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0138
            java.lang.Object r1 = r12.next()
            X.0mD r1 = (X.AnonymousClass0mD) r1
            java.util.concurrent.CountDownLatch r0 = r1.A02     // Catch:{ InterruptedException -> 0x0144 }
            r0.await()     // Catch:{ InterruptedException -> 0x0144 }
            goto L_0x0144
        L_0x0138:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0141
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x0174
        L_0x0141:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0174
        L_0x0144:
            java.lang.Object r11 = r1.A00
            X.5kf r11 = (X.C293395kf) r11
            int r1 = r11.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0172
            r0 = 0
            if (r1 == r0) goto L_0x0172
            r0 = 3
            if (r1 == r0) goto L_0x0126
            r0 = 2
            if (r1 == r0) goto L_0x0126
            java.lang.Class<X.1MT> r0 = X.AnonymousClass1MT.class
            java.lang.String r2 = r0.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unhandled SynchronizationResult in EmergencyPush: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            X.0wb.A03(r2, r0)
        L_0x0172:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
        L_0x0174:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r10 == r2) goto L_0x0180
            if (r1 == r2) goto L_0x0180
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r10 != r0) goto L_0x0235
            if (r1 != r0) goto L_0x0235
        L_0x0180:
            X.0xm r0 = r9.A04
            int r10 = r8.A00
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "preference_emergency_push_version"
            r1.E5Z(r0, r10)
            boolean r0 = r1.commit()
            if (r0 == 0) goto L_0x022c
            java.lang.Integer r0 = r8.A03
            int r11 = r8.A00
            int r12 = r0.intValue()
            r0 = 1
            if (r12 == r0) goto L_0x0211
            r0 = 2
            if (r12 == r0) goto L_0x0211
        L_0x01a3:
            java.lang.String r1 = "ig_emergency_push_will_execute_instructions"
            r0 = 0
            r1.getClass()
            X.0xI r2 = X.0xI.A01(r1, r0)
            r0 = 0
            r10 = 1
            if (r12 == r0) goto L_0x01c7
            r0 = 2
            if (r12 == r10) goto L_0x020f
            if (r12 == r0) goto L_0x01c8
            java.lang.Class<X.55j> r0 = X.C2809855j.class
            java.lang.String r12 = r0.getSimpleName()
            java.lang.String r1 = "Unhandled emergency push handler type: "
            java.lang.String r0 = "NO_OP"
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0wb.A03(r12, r0)
        L_0x01c7:
            r0 = 0
        L_0x01c8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "handler_type_will_execute"
            r2.A08(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "previous_version"
            r2.A08(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.String r0 = "current_version"
            r2.A08(r1, r0)
            X.0xN r0 = X.C60510iO.A00(r4)
            r0.EHF(r2)
            java.lang.Integer r0 = r8.A03
            java.lang.Integer r2 = r8.A02
            int r1 = r0.intValue()
            if (r1 == r10) goto L_0x0256
            r0 = 2
            if (r1 != r0) goto L_0x0023
            r9.A01 = r10
            if (r2 == 0) goto L_0x0023
            r9.A00 = r10
            android.os.Handler r8 = r9.A02
            X.0ng r4 = r9.A03
            int r0 = r2.intValue()
            long r2 = (long) r0
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r0
            r8.postDelayed(r4, r2)
            goto L_0x0023
        L_0x020f:
            r0 = 1
            goto L_0x01c8
        L_0x0211:
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            X.0xa r0 = r0.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "preference_emergency_push_should_log_after_induced_crash"
            r0 = 1
            r2.E5T(r1, r0)
            r2.commit()
            goto L_0x01a3
        L_0x0228:
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            goto L_0x00e9
        L_0x022c:
            int r0 = r8.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "failed_to_save_version"
            goto L_0x023d
        L_0x0235:
            int r0 = r8.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "failed_action_handler"
        L_0x023d:
            X.C9827Rhp.A00(r4, r2, r1, r0, r3)
            goto L_0x0023
        L_0x0242:
            X.0lg r4 = r7.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            int r2 = r7.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "invalid_server_version"
            X.C9827Rhp.A00(r4, r3, r1, r0, r2)
            goto L_0x0023
        L_0x0253:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        L_0x0256:
            X.WuZ r0 = new X.WuZ
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2810055l.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r7) {
        int A032 = AnonymousClass0fD.A03(1105788208);
        C2810055l.super.onFail(r7);
        C9827Rhp.A00(this.A02, AnonymousClass05K.A01, Integer.valueOf(this.A01), "failed_fetch_instructions", this.A00);
        this.A03.A05.release();
        AnonymousClass0fD.A0A(-1033418420, A032);
    }
}
