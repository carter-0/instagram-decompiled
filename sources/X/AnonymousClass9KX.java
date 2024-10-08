package X;

/* renamed from: X.9KX  reason: invalid class name */
public final class AnonymousClass9KX extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KX(Object obj, String str, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.4D7, X.9KX] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        String str = this.A03;
        switch (i2) {
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
            case 7:
                i = 7;
                break;
            default:
                i = 8;
                break;
        }
        return new AnonymousClass9KX(obj2, str, r6, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KX) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, X.9KX] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        r2 = r0.A03;
        r0.A00 = r4;
        r0 = r3.emit(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0205, code lost:
        X.0eS.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r0 != r1) goto L_0x0213;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r8 = r22
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x0143;
                case 1: goto L_0x00cf;
                case 2: goto L_0x0035;
                case 3: goto L_0x005b;
                case 4: goto L_0x006c;
                case 5: goto L_0x0162;
                case 6: goto L_0x008e;
                case 7: goto L_0x00a7;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 != 0) goto L_0x0205
            X.0eS.A00(r8)
            r4 = 3
            r3 = 0
            com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl r2 = new com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl
            r2.<init>(r3, r3, r3, r4)
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r3 = r0.A03
            r0.A00 = r5
            com.instagram.wellbeing.respectfulcommentnudge.data.RepositoryImpl r2 = r2.A01
            com.instagram.wellbeing.respectfulcommentnudge.data.RespectfulNudgeApi r2 = r2.A01
            java.lang.Object r0 = r2.A02(r4, r3, r0)
            if (r0 == r1) goto L_0x002e
            X.0gF r0 = X.C60340gF.A00
        L_0x002e:
            if (r0 == r1) goto L_0x0032
            X.0gF r0 = X.C60340gF.A00
        L_0x0032:
            if (r0 != r1) goto L_0x0213
            return r1
        L_0x0035:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 != 0) goto L_0x0205
            X.0eS.A00(r8)
            java.lang.Object r6 = r0.A02
            java.lang.String r5 = r0.A03
            r4 = 0
            r3 = 3
            X.9KZ r2 = new X.9KZ
            r2.<init>(r6, r5, r4, r3)
            X.05E r3 = new X.05E
            r3.<init>(r2)
            X.Av2 r2 = new X.Av2
            r2.<init>(r5, r6, r7)
            r0.A00 = r7
            java.lang.Object r0 = r3.collect(r2, r0)
            goto L_0x0032
        L_0x005b:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 != 0) goto L_0x0205
            X.0eS.A00(r8)
            java.lang.Object r2 = r0.A02
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r2
            X.0V2 r3 = r2.A0V
            goto L_0x009e
        L_0x006c:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 != 0) goto L_0x0205
            X.0eS.A00(r8)
            java.lang.Object r7 = r0.A02
            X.89T r7 = (X.AnonymousClass89T) r7
            java.lang.String r6 = r0.A03
            r0.A00 = r2
            r5 = 0
            X.4HW r4 = r7.A02
            r2 = 0
            X.9PR r3 = new X.9PR
            r3.<init>(r7, r6, r2, r5)
            java.lang.String r2 = "suspendRefreshReelXarConfig"
            java.lang.Object r0 = r4.A00(r2, r0, r3)
            goto L_0x0032
        L_0x008e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 != 0) goto L_0x0205
            X.0eS.A00(r8)
            java.lang.Object r2 = r0.A02
            com.instagram.direct.inbox.notes.NotesRepository r2 = (com.instagram.direct.inbox.notes.NotesRepository) r2
            X.0V2 r3 = r2.A0S
        L_0x009e:
            java.lang.String r2 = r0.A03
            r0.A00 = r4
            java.lang.Object r0 = r3.emit(r2, r0)
            goto L_0x0032
        L_0x00a7:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 451(0x1c3, float:6.32E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r2)
            r4 = 1
            if (r3 == 0) goto L_0x00b6
            goto L_0x0209
        L_0x00b6:
            X.0eS.A00(r8)
            r3 = 4
            java.lang.String r2 = "Syncing"
            X.0KC.A01(r3, r5, r2)     // Catch:{ Exception -> 0x020d }
            java.lang.Object r2 = r0.A02     // Catch:{ Exception -> 0x020d }
            X.11q r2 = (X.11q) r2     // Catch:{ Exception -> 0x020d }
            com.instagram.screentime.IGScreenTimeApi r3 = r2.A03     // Catch:{ Exception -> 0x020d }
            java.lang.String r2 = r0.A03     // Catch:{ Exception -> 0x020d }
            r0.A00 = r4     // Catch:{ Exception -> 0x020d }
            java.lang.Object r0 = r3.A00(r2, r0)     // Catch:{ Exception -> 0x020d }
            goto L_0x0032
        L_0x00cf:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x00fb
            X.0eS.A00(r8)
        L_0x00d9:
            X.3Ii r8 = (X.C239803Ii) r8
            java.lang.Object r2 = r0.A02
            X.87w r2 = (X.C3511787w) r2
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A00
            r0 = 0
            r1.set(r0)
            boolean r0 = r8 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x011e
            X.05G r1 = r2.A06
            X.3Ih r8 = (X.C239793Ih) r8
            java.lang.Object r0 = r8.A00
            r1.Epw(r0)
            X.05G r1 = r2.A07
            X.87x r0 = X.C3511887x.SUCCESS
            r1.Epw(r0)
            goto L_0x0213
        L_0x00fb:
            X.0eS.A00(r8)
            java.lang.Object r3 = r0.A02
            X.87w r3 = (X.C3511787w) r3
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A00
            r2.set(r4)
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = r3.A03
            java.lang.String r7 = r0.A03
            X.8cI r6 = X.C359218cI.A08
            long r11 = X.C39617A2h.A00
            r8 = 0
            X.0qQ.A0B(r7, r4)
            r0.A00 = r4
            r9 = r8
            r10 = r0
            java.lang.Object r8 = com.instagram.ar.core.effectcollection.EffectCollectionService.A03(r5, r6, r7, r8, r9, r10, r11)
            if (r8 != r1) goto L_0x00d9
            return r1
        L_0x011e:
            X.05G r1 = r2.A07
            X.87x r0 = X.C3511887x.FAIL
            r1.Epw(r0)
            android.app.Application r1 = r2.A00
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"
            X.0qQ.A0C(r1, r0)
            android.content.Context r3 = r1.getApplicationContext()
            X.0qQ.A07(r3)
            java.lang.Integer r2 = X.AnonymousClass05K.A02
            r0 = 2511(0x9cf, float:3.519E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 2131968398(0x7f13418e, float:1.957369E38)
            X.C64169LRs.A02(r3, r2, r1, r0)
            goto L_0x0213
        L_0x0143:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x014e
            X.0eS.A00(r8)
        L_0x014d:
            return r8
        L_0x014e:
            X.0eS.A00(r8)
            java.lang.Object r2 = r0.A02
            X.8g1 r2 = (X.C361308g1) r2
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r3 = r2.A00
            java.lang.String r2 = r0.A03
            r0.A00 = r4
            java.lang.Object r8 = r3.A07(r2, r0)
            if (r8 != r1) goto L_0x014d
            return r1
        L_0x0162:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0172
            X.0eS.A00(r8)
        L_0x016c:
            X.MCr r0 = new X.MCr
            r0.<init>()
            throw r0
        L_0x0172:
            X.0eS.A00(r8)
            java.lang.Object r5 = r0.A02
            X.7Zs r5 = (X.C333637Zs) r5
            X.7QQ r4 = r5.A03
            java.lang.String r2 = r0.A03
            r15 = 0
            X.0qQ.A0B(r2, r15)
            X.2IV r8 = new X.2IV
            r8.<init>()
            java.util.List r3 = java.util.Collections.singletonList(r2)
            X.0qQ.A07(r3)
            java.lang.String r2 = "bot_ids"
            r8.A05(r2, r3)
            r16 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r3 = new X.2IS
            r3.<init>()
            java.lang.String r2 = "input"
            r7.A00(r8, r2)
            X.2IY r2 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r10 = X.AnonymousClass1vS.A00()
            java.util.Map r12 = r7.getParamsCopy()
            java.util.Map r13 = r3.getParamsCopy()
            java.lang.Class<X.BtP> r14 = X.C43139BtP.class
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.lang.String r11 = "AiAgentBehaviorGraphQuery"
            java.lang.String r19 = "bot_embodiment_state_machine_video_info"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r15
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.instagram.common.session.UserSession r8 = r4.A00
            X.0Tu r7 = X.0Tu.A05
            r2 = 36600873779662866(0x82084d001b1012, double:3.2098781859234185E-306)
            long r2 = X.182.A01(r7, r8, r2)
            r9.setMaxToleratedCacheAgeMs(r2)
            r2 = 36600873779859477(0x82084d001e1015, double:3.209878186047756E-306)
            long r2 = X.182.A01(r7, r8, r2)
            r9.setFreshCacheAgeMs(r2)
            X.1vn r8 = r4.A03
            r2 = 9
            X.DFg r7 = new X.DFg
            r7.<init>(r4, r2)
            r3 = 2
            X.ASf r2 = new X.ASf
            r2.<init>(r4, r3)
            r8.ATL(r2, r7, r9)
            X.0Ud r4 = r4.A05
            r3 = 53
            X.MCi r2 = new X.MCi
            r2.<init>((java.lang.Object) r5, (int) r3)
            r0.A00 = r6
            java.lang.Object r0 = r4.collect(r2, r0)
            if (r0 != r1) goto L_0x016c
            return r1
        L_0x0205:
            X.0eS.A00(r8)
            goto L_0x0213
        L_0x0209:
            X.0eS.A00(r8)     // Catch:{ Exception -> 0x020d }
            goto L_0x0213
        L_0x020d:
            r1 = move-exception
            java.lang.String r0 = "SyncNow coroutine error"
            X.0KC.A0F(r5, r0, r1)
        L_0x0213:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KX.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
