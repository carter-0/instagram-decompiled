package X;

import com.facebook.commonavatarliveediting.CdlProviderImpl;
import java.util.Map;

public final class MFo extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05 = 1;
    public final Object A06;
    public final String A07;
    public final String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFo(C332377Us r2, String str, String str2, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A06 = r2;
        this.A07 = str;
        this.A08 = str2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.MFo] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MFo] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        AnonymousClass4D7 r10 = r14;
        if (this.A05 != 0) {
            return new MFo((C332377Us) this.A06, this.A07, this.A08, r14);
        }
        Map map = (Map) this.A02;
        return new MFo((CdlProviderImpl) this.A06, (Boolean) this.A03, (Integer) this.A04, this.A08, this.A07, map, r10, (0sL) this.A01);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, X.4D7, X.MFo] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd A[Catch:{ all -> 0x00cd }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0152 A[Catch:{ CancellationException -> 0x0153 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A05
            if (r0 == 0) goto L_0x00d9
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r2 = 3
            r8 = 2
            r7 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0047
            if (r1 == r7) goto L_0x0033
            if (r1 == r8) goto L_0x0026
            if (r1 != r2) goto L_0x0021
            java.lang.Object r6 = r14.A02
            X.7Us r6 = (X.C332377Us) r6
            java.lang.Object r4 = r14.A01
            X.136 r4 = (X.136) r4
            X.0eS.A00(r15)     // Catch:{ all -> 0x00d4 }
            goto L_0x00be
        L_0x0021:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0026:
            java.lang.Object r12 = r14.A03
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r6 = r14.A02
            X.7Us r6 = (X.C332377Us) r6
            java.lang.Object r4 = r14.A01
            X.136 r4 = (X.136) r4
            goto L_0x009f
        L_0x0033:
            java.lang.Object r13 = r14.A04
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r14.A03
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r6 = r14.A02
            X.7Us r6 = (X.C332377Us) r6
            java.lang.Object r4 = r14.A01
            X.136 r4 = (X.136) r4
            X.0eS.A00(r15)
            goto L_0x0065
        L_0x0047:
            X.0eS.A00(r15)
            java.lang.Object r6 = r14.A06
            X.7Us r6 = (X.C332377Us) r6
            X.136 r4 = r6.A0A
            java.lang.String r12 = r14.A07
            java.lang.String r13 = r14.A08
            r14.A01 = r4
            r14.A02 = r6
            r14.A03 = r12
            r14.A04 = r13
            r14.A00 = r7
            java.lang.Object r1 = X.136.A00(r14, r4)
            if (r1 != r0) goto L_0x0065
            return r0
        L_0x0065:
            com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsDatabase r9 = r6.A02     // Catch:{ all -> 0x00d2 }
            r3 = r9
            com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsDatabase_Impl r3 = (com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsDatabase_Impl) r3     // Catch:{ all -> 0x00d2 }
            X.7Uy r1 = r3.A00     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x008e
            X.7Uy r10 = r3.A00     // Catch:{ all -> 0x00d2 }
        L_0x0070:
            X.7Ux r11 = r9.A00()     // Catch:{ all -> 0x00d2 }
            r14.A01 = r4     // Catch:{ all -> 0x00d2 }
            r14.A02 = r6     // Catch:{ all -> 0x00d2 }
            r14.A03 = r12     // Catch:{ all -> 0x00d2 }
            r14.A04 = r5     // Catch:{ all -> 0x00d2 }
            r14.A00 = r8     // Catch:{ all -> 0x00d2 }
            X.0Gt r9 = X.AnonymousClass0Gt.A00     // Catch:{ all -> 0x00d2 }
            X.3oI r1 = r10.A02     // Catch:{ all -> 0x00d2 }
            X.MBY r8 = new X.MBY     // Catch:{ all -> 0x00d2 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00d2 }
            java.lang.Object r1 = X.AnonymousClass1t4.A00(r1, r14, r8)     // Catch:{ all -> 0x00d2 }
            if (r1 != r0) goto L_0x00a2
            goto L_0x009e
        L_0x008e:
            monitor-enter(r3)     // Catch:{ all -> 0x00d2 }
            X.7Uy r1 = r3.A00     // Catch:{ all -> 0x00cf }
            if (r1 != 0) goto L_0x009a
            X.7Uy r1 = new X.7Uy     // Catch:{ all -> 0x00cf }
            r1.<init>(r3)     // Catch:{ all -> 0x00cf }
            r3.A00 = r1     // Catch:{ all -> 0x00cf }
        L_0x009a:
            X.7Uy r10 = r3.A00     // Catch:{ all -> 0x00cf }
            monitor-exit(r3)     // Catch:{ all -> 0x00cf }
            goto L_0x0070
        L_0x009e:
            return r0
        L_0x009f:
            X.0eS.A00(r15)     // Catch:{ all -> 0x00cd }
        L_0x00a2:
            com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsDatabase r1 = r6.A02     // Catch:{ all -> 0x00cd }
            X.7Ux r3 = r1.A00()     // Catch:{ all -> 0x00cd }
            r14.A01 = r4     // Catch:{ all -> 0x00cd }
            r14.A02 = r6     // Catch:{ all -> 0x00cd }
            r14.A03 = r5     // Catch:{ all -> 0x00cd }
            r14.A00 = r2     // Catch:{ all -> 0x00cd }
            X.3oI r2 = r3.A00     // Catch:{ all -> 0x00cd }
            X.TPK r1 = new X.TPK     // Catch:{ all -> 0x00cd }
            r1.<init>(r12, r3, r7)     // Catch:{ all -> 0x00cd }
            java.lang.Object r15 = X.AnonymousClass1t4.A00(r2, r14, r1)     // Catch:{ all -> 0x00cd }
            if (r15 != r0) goto L_0x00be
            return r0
        L_0x00be:
            X.A6J r15 = (X.A6J) r15     // Catch:{ all -> 0x00cd }
            java.util.concurrent.ConcurrentHashMap r1 = r6.A03     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = r15.A01     // Catch:{ all -> 0x00cd }
            r1.put(r0, r15)     // Catch:{ all -> 0x00cd }
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x00cd }
            r4.A05(r5)
            return r0
        L_0x00cd:
            r0 = move-exception
            goto L_0x00d5
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            goto L_0x00d5
        L_0x00d4:
            r0 = move-exception
        L_0x00d5:
            r4.A05(r5)
            throw r0
        L_0x00d9:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r4 = 4
            r2 = 3
            r7 = 2
            r6 = 1
            if (r1 == 0) goto L_0x00f7
            if (r1 == r6) goto L_0x010d
            if (r1 == r7) goto L_0x00f3
            if (r1 == r2) goto L_0x00ef
            X.0eS.A00(r15)
        L_0x00ec:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00ef:
            X.0eS.A00(r15)     // Catch:{ CancellationException -> 0x0153 }
            goto L_0x00ec
        L_0x00f3:
            X.0eS.A00(r15)
            goto L_0x012a
        L_0x00f7:
            X.0eS.A00(r15)
            java.lang.Object r5 = r14.A06
            com.facebook.commonavatarliveediting.CdlProviderImpl r5 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r5
            java.lang.String r3 = r14.A08
            java.lang.Object r1 = r14.A01
            X.0sL r1 = (X.0sL) r1
            r14.A00 = r6
            java.lang.Object r15 = com.facebook.commonavatarliveediting.CdlProviderImpl.A01(r5, r3, r14, r1)
            if (r15 != r0) goto L_0x0110
            return r0
        L_0x010d:
            X.0eS.A00(r15)
        L_0x0110:
            boolean r1 = X.AnonymousClass7TE.A1a(r15)
            if (r1 == 0) goto L_0x00ec
            java.lang.Object r5 = r14.A01
            X.0sL r5 = (X.0sL) r5
            java.lang.String r3 = r14.A08
            X.JrY r1 = new X.JrY
            r1.<init>(r3)
            r14.A00 = r7
            java.lang.Object r1 = r5.invoke(r1, r14)
            if (r1 != r0) goto L_0x012a
            return r0
        L_0x012a:
            java.lang.Object r6 = r14.A06     // Catch:{ CancellationException -> 0x0153 }
            com.facebook.commonavatarliveediting.CdlProviderImpl r6 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r6     // Catch:{ CancellationException -> 0x0153 }
            X.4CZ r1 = r6.A07     // Catch:{ CancellationException -> 0x0153 }
            java.lang.String r9 = r14.A08     // Catch:{ CancellationException -> 0x0153 }
            java.lang.Object r11 = r14.A02     // Catch:{ CancellationException -> 0x0153 }
            java.util.Map r11 = (java.util.Map) r11     // Catch:{ CancellationException -> 0x0153 }
            java.lang.Object r7 = r14.A03     // Catch:{ CancellationException -> 0x0153 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ CancellationException -> 0x0153 }
            java.lang.Object r8 = r14.A04     // Catch:{ CancellationException -> 0x0153 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ CancellationException -> 0x0153 }
            java.lang.String r10 = r14.A07     // Catch:{ CancellationException -> 0x0153 }
            java.lang.Object r13 = r14.A01     // Catch:{ CancellationException -> 0x0153 }
            X.0sL r13 = (X.0sL) r13     // Catch:{ CancellationException -> 0x0153 }
            r12 = 0
            com.facebook.commonavatarliveediting.CdlProviderImpl$generateAvatar$2$1 r5 = new com.facebook.commonavatarliveediting.CdlProviderImpl$generateAvatar$2$1     // Catch:{ CancellationException -> 0x0153 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ CancellationException -> 0x0153 }
            r14.A00 = r2     // Catch:{ CancellationException -> 0x0153 }
            java.lang.Object r1 = X.1Eo.A00(r14, r1, r5)     // Catch:{ CancellationException -> 0x0153 }
            if (r1 != r0) goto L_0x00ec
            goto L_0x0166
        L_0x0153:
            java.lang.Object r3 = r14.A06
            com.facebook.commonavatarliveediting.CdlProviderImpl r3 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r3
            java.lang.String r2 = r14.A08
            java.lang.Object r1 = r14.A01
            X.0sL r1 = (X.0sL) r1
            r14.A00 = r4
            java.lang.Object r1 = com.facebook.commonavatarliveediting.CdlProviderImpl.A02(r3, r2, r14, r1)
            if (r1 != r0) goto L_0x00ec
            return r0
        L_0x0166:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFo) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFo(CdlProviderImpl cdlProviderImpl, Boolean bool, Integer num, String str, String str2, Map map, AnonymousClass4D7 r8, 0sL r9) {
        super(2, r8);
        this.A06 = cdlProviderImpl;
        this.A08 = str;
        this.A01 = r9;
        this.A02 = map;
        this.A03 = bool;
        this.A04 = num;
        this.A07 = str2;
    }
}
