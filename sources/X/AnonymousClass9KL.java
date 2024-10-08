package X;

import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;

/* renamed from: X.9KL  reason: invalid class name */
public final class AnonymousClass9KL extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KL(ClipsAudioStore clipsAudioStore, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A05 = 3;
        this.A04 = clipsAudioStore;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r3 = new X.AnonymousClass9KL(r1, r2, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r3.A02 = r5;
        r3.A03 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        return r3.invokeSuspend(X.C60340gF.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            r4 = this;
            int r0 = r4.A05
            X.4D7 r7 = (X.AnonymousClass4D7) r7
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0027;
                case 2: goto L_0x0039;
                case 3: goto L_0x003f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A04
            r0 = 4
        L_0x000c:
            X.9KL r3 = new X.9KL
            r3.<init>(r1, r2, r7, r0)
        L_0x0011:
            r3.A02 = r5
            r3.A03 = r6
        L_0x0015:
            X.0gF r0 = X.C60340gF.A00
            java.lang.Object r0 = r3.invokeSuspend(r0)
            return r0
        L_0x001c:
            java.lang.Object r2 = r4.A04
            java.lang.Object r1 = r4.A01
            r0 = 0
            X.9KL r3 = new X.9KL
            r3.<init>(r2, r1, r7, r0)
            goto L_0x0011
        L_0x0027:
            java.lang.Object r1 = r4.A01
            X.7uZ r1 = (X.C346077uZ) r1
            java.lang.Object r0 = r4.A02
            X.3Ii r0 = (X.C239803Ii) r0
            X.9KL r3 = new X.9KL
            r3.<init>(r1, r0, r7)
            r3.A03 = r5
            r3.A04 = r6
            goto L_0x0015
        L_0x0039:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A04
            r0 = 2
            goto L_0x000c
        L_0x003f:
            java.lang.Object r0 = r4.A04
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = (com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore) r0
            X.9KL r3 = new X.9KL
            r3.<init>(r0, r7)
            r3.A01 = r5
            r3.A02 = r6
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KL.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9KL, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v19, types: [X.SHv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v88, types: [java.lang.Object, X.TdG] */
    /* JADX WARNING: type inference failed for: r3v90, types: [X.Q1d, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x029b, code lost:
        r0 = r10.emit(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02b8, code lost:
        r0 = r0.emit(r15, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bc, code lost:
        if (r0 != r1) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02be, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02eb, code lost:
        r9 = (X.C381809cM) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ed, code lost:
        if (r9 == null) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ef, code lost:
        r4 = (X.AnonymousClass83I) r2.A04;
        r6 = (long) ((X.AnonymousClass831) r4.A03.A03.getValue()).A00;
        r29 = r4.A00;
        r28 = r4.A01;
        r2.A02 = r0;
        r2.A03 = null;
        r2.A00 = 3;
        r3 = X.1IW.A02;
        r3 = new X.1IW(1, X.1Ey.A02(r2));
        r3.A0I();
        r11 = new java.io.File(((X.2Nn) r2.A01).C4W(), X.002.A0e("sfx_overlay_track_", ".mp4", java.lang.System.currentTimeMillis())).getPath();
        r10 = new X.C266824aP();
        r20 = X.C266714aE.AUDIO;
        r4 = new X.C266764aJ(r20);
        r13 = new X.C266744aH(new java.io.File(r9.A04));
        r19 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r23 = r19;
        r13.A03 = new X.C266724aF(r23, 0, r6);
        r4.A02(r13.A00());
        r10.A04(new X.C266794aM(r4));
        r18 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x037f, code lost:
        if (r18.hasNext() == false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0381, code lost:
        r15 = (X.C381669c8) r18.next();
        r6 = r15.A01;
        r12 = new X.C266764aJ(r20, "", r19.toMicros(r6));
        r4 = r15.A02;
        r13 = new X.C266744aH(new java.io.File(r4.A04));
        r4 = r4.A01;
        r3 = r9.A01 - ((int) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03af, code lost:
        if (r4 <= r3) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03b1, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03b2, code lost:
        r13.A03 = new X.C266724aF(r23, 0, (long) r4);
        r12.A02(r13.A00());
        r10.A04(new X.C266794aM(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03ce, code lost:
        r12 = new com.facebook.videolite.transcoder.base.composition.MediaComposition(r10);
        X.0qQ.A0A(r11);
        r6 = new X.C383749gA(r9, r11, r3);
        X.0qQ.A0B(r11, 1);
        r7 = new X.SQv();
        r7.A0Q = true;
        r7.A0C = new X.SFQ(new X.SF8());
        r7.A08 = r12;
        r7.A0H = false;
        r7.A0I = true;
        r7.A0E = "b";
        r7.A0F = r11;
        r7.A07 = r6;
        r6 = r29.getCacheDir();
        X.0qQ.A07(r6);
        r4 = new X.C10683RwN(r28, r6, true, false);
        r6 = new java.lang.Object();
        r6.A0C = new X.C10862RzN(r7);
        r6.A00 = r29;
        r6.A07 = r4.A00;
        r6.A0E = java.util.concurrent.Executors.newCachedThreadPool();
        r6.A0A = r4.A03;
        r6.A08 = r4.A01;
        r6.A09 = r4.A02;
        r6.A06 = new X.C12322SrS(r29);
        r6.A04 = new java.lang.Object();
        r6.A01 = new X.Q1Q(r28);
        r6.A03 = new java.lang.Object();
        r3.CO0(new X.MP5(X.SRj.A00(r6.A01()), 35));
        r9 = r3.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x046e, code lost:
        if (r9 != r1) goto L_0x0478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0470, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0478, code lost:
        r9 = (X.C361278fx) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x047a, code lost:
        if (r9 != null) goto L_0x047e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x047c, code lost:
        r9 = X.C361268fw.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0480, code lost:
        if ((r9 instanceof X.C361268fw) == false) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0482, code lost:
        r4 = X.C361268fw.A00;
        r2.A02 = null;
        r2.A03 = null;
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0489, code lost:
        r2.A00 = r3;
        r0 = r0.emit(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0495, code lost:
        if (r9.A01() == false) goto L_0x049f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0497, code lost:
        r4 = X.C361338g4.A00;
        r2.A02 = null;
        r2.A03 = null;
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04a1, code lost:
        if ((r9 instanceof X.AnonymousClass8Y4) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04a3, code lost:
        r4 = new X.AnonymousClass8Y4(new X.AnonymousClass51I((com.facebook.videolite.transcoder.base.composition.MediaEffect) null, X.AnonymousClass51J.A06, (java.lang.Float) null, ((X.C381809cM) r9.A00()).A04, (java.lang.String) null, (java.lang.String) null, 1.0f, 1.0f, 0, 0, -1));
        r2.A02 = null;
        r2.A03 = null;
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        X.0eS.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        r15 = new X.C348337yH(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            r30 = this;
            r2 = r30
            r9 = r31
            int r0 = r2.A05
            switch(r0) {
                case 0: goto L_0x0017;
                case 1: goto L_0x006e;
                case 2: goto L_0x00f6;
                case 3: goto L_0x0218;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 0
            switch(r0) {
                case 0: goto L_0x02a0;
                case 1: goto L_0x0011;
                case 2: goto L_0x02e0;
                case 3: goto L_0x0471;
                default: goto L_0x0011;
            }
        L_0x0011:
            X.0eS.A00(r9)
        L_0x0014:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0017:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r8 = 0
            r7 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r5) goto L_0x0011
            if (r0 == r6) goto L_0x005d
            if (r0 == r7) goto L_0x0011
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x002f:
            X.0eS.A00(r9)
            java.lang.Object r4 = r2.A02
            X.02o r4 = (X.02o) r4
            java.lang.Object r3 = r2.A03
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0046
            r2.A02 = r8
            r2.A00 = r5
            java.lang.Object r0 = r4.emit(r3, r2)
            goto L_0x02bc
        L_0x0046:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x04cb
            java.lang.Object r3 = r2.A04
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService r3 = (com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService) r3
            java.lang.Object r0 = r2.A01
            X.849 r0 = (X.AnonymousClass849) r0
            r2.A02 = r4
            r2.A00 = r6
            java.lang.Object r9 = com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService.A00(r3, r0, r2)
            if (r9 != r1) goto L_0x0064
            return r1
        L_0x005d:
            java.lang.Object r4 = r2.A02
            X.02o r4 = (X.02o) r4
            X.0eS.A00(r9)
        L_0x0064:
            r2.A02 = r8
            r2.A00 = r7
            java.lang.Object r0 = r4.emit(r9, r2)
            goto L_0x02bc
        L_0x006e:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0082
            if (r0 == r7) goto L_0x0011
            if (r0 == r5) goto L_0x0011
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0082:
            X.0eS.A00(r9)
            java.lang.Object r10 = r2.A03
            X.02o r10 = (X.02o) r10
            java.lang.Object r4 = r2.A04
            X.7ul r4 = (X.C346197ul) r4
            r6 = 0
            java.lang.Object r9 = r2.A01
            X.7uZ r9 = (X.C346077uZ) r9
            if (r4 == 0) goto L_0x00b0
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            java.lang.Object r0 = r4.A00
            X.9Ih r0 = (X.C376519Ih) r0
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r9.A01(r0, r3)
            X.3Ih r0 = new X.3Ih
            r0.<init>(r4)
            r2.A03 = r6
            r2.A00 = r7
            goto L_0x029b
        L_0x00b0:
            X.02m r8 = X.02m.A0p
            X.0qQ.A07(r8)
            int r7 = X.C346077uZ.A00(r9)
            X.4dm r3 = r9.A00
            if (r3 == 0) goto L_0x00f3
            boolean r0 = r3 instanceof X.C268664dn
            if (r0 == 0) goto L_0x00ec
            java.lang.String r3 = "exception"
        L_0x00c3:
            r4 = 17631244(0x10d080c, float:2.5903383E-38)
            java.lang.String r0 = "failure_reason"
            r8.markerAnnotate(r4, r7, r0, r3)
            int r3 = X.C346077uZ.A00(r9)
            r0 = 3
            r8.markerEnd(r4, r3, r0)
            java.lang.Object r0 = r2.A02
            X.3Ii r0 = (X.C239803Ii) r0
            X.5sO r0 = (X.C297815sO) r0
            java.lang.Object r3 = r0.A00
            boolean r0 = r3 instanceof X.C384759hq
            if (r0 != 0) goto L_0x00e1
            X.9hr r3 = X.C384769hr.A00
        L_0x00e1:
            X.5sO r0 = new X.5sO
            r0.<init>(r3)
            r2.A03 = r6
            r2.A00 = r5
            goto L_0x029b
        L_0x00ec:
            boolean r0 = r3 instanceof X.C268674do
            if (r0 == 0) goto L_0x04d1
            java.lang.String r3 = "http_error"
            goto L_0x00c3
        L_0x00f3:
            java.lang.String r3 = ""
            goto L_0x00c3
        L_0x00f6:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r10 = 1
            if (r0 == 0) goto L_0x0107
            if (r0 == r10) goto L_0x0011
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0107:
            X.0eS.A00(r9)
            java.lang.Object r0 = r2.A02
            X.02o r0 = (X.02o) r0
            java.lang.Object r12 = r2.A03
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            X.3Ii[] r12 = (X.C239803Ii[]) r12
            java.lang.Object r11 = r2.A01
            X.8cK r11 = (X.C359238cK) r11
            java.lang.Object r9 = r2.A04
            com.instagram.camera.effect.mq.effectmetadata.EffectTrayService r9 = (com.instagram.camera.effect.mq.effectmetadata.EffectTrayService) r9
            X.0nE r4 = r9.A03
            r8 = 0
            X.0qQ.A0B(r12, r8)
            r6 = 1
            X.0qQ.A0B(r11, r10)
            r3 = 2
            X.0qQ.A0B(r4, r3)
            int r7 = r12.length
            r5 = 0
        L_0x012c:
            if (r5 >= r7) goto L_0x017c
            r4 = r12[r5]
            boolean r3 = r4 instanceof X.C297815sO
            if (r3 == 0) goto L_0x0179
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r3 = r4.A00
            boolean r3 = r3 instanceof X.C384769hr
            if (r3 == 0) goto L_0x0179
        L_0x013c:
            X.7yH r15 = new X.7yH
            r15.<init>(r6)
        L_0x0141:
            boolean r3 = r11.A05
            if (r3 == 0) goto L_0x016f
            boolean r3 = r15 instanceof X.C348117xu
            if (r3 == 0) goto L_0x016f
            r7 = r15
            X.7xu r7 = (X.C348117xu) r7
            boolean r3 = r7.A05
            if (r3 != 0) goto L_0x016f
            X.82X r6 = r9.A02
            X.8cI r3 = r11.A01
            X.84A r3 = r3.A00
            int r4 = r3.ordinal()
            r3 = 5
            if (r4 == r3) goto L_0x0176
            if (r4 == r10) goto L_0x0173
            java.lang.String r5 = "instagram_stories"
        L_0x0161:
            java.util.List r4 = r7.A04
            X.0qQ.A0B(r4, r10)
            com.instagram.camera.effect.mq.IgCameraEffectsController r3 = r6.A05
            X.6dz r3 = r3.A0L
            if (r3 == 0) goto L_0x016f
            r3.E3c(r5, r4)
        L_0x016f:
            r2.A00 = r10
            goto L_0x02b8
        L_0x0173:
            java.lang.String r5 = "instagram_direct"
            goto L_0x0161
        L_0x0176:
            java.lang.String r5 = "instagram_reels"
            goto L_0x0161
        L_0x0179:
            int r5 = r5 + 1
            goto L_0x012c
        L_0x017c:
            r16 = 0
            r4 = 0
        L_0x017f:
            r3 = r4
            int r4 = r4 + 1
            if (r3 < r7) goto L_0x017f
            r5 = 0
        L_0x0185:
            if (r5 >= r7) goto L_0x019a
            r4 = r12[r5]
            boolean r3 = r4 instanceof X.C297815sO
            if (r3 == 0) goto L_0x0197
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r3 = r4.A00
            boolean r3 = r3 instanceof X.C384759hq
            if (r3 == 0) goto L_0x0197
            r6 = 3
            goto L_0x013c
        L_0x0197:
            int r5 = r5 + 1
            goto L_0x0185
        L_0x019a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5 = 0
        L_0x01a0:
            if (r5 >= r7) goto L_0x01b9
            r4 = r12[r5]
            java.lang.String r3 = "null cannot be cast to non-null type com.meta.kotlin.Try.Success<com.instagram.ar.core.effectcollection.models.EffectCollection>"
            X.0qQ.A0C(r4, r3)
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r3 = r4.A00
            X.9Ih r3 = (X.C376519Ih) r3
            java.lang.Object r3 = r3.A02
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            X.018.A16(r3, r6)
            int r5 = r5 + 1
            goto L_0x01a0
        L_0x01b9:
            java.util.List r13 = X.00k.A0W(r6)
            r22 = 0
            r4 = 0
        L_0x01c0:
            if (r4 >= r7) goto L_0x0215
            r5 = r12[r4]
            java.lang.String r3 = "null cannot be cast to non-null type com.meta.kotlin.Try.Success<com.instagram.ar.core.effectcollection.models.EffectCollection>"
            X.0qQ.A0C(r5, r3)
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r3 = r5.A00
            X.9Ih r3 = (X.C376519Ih) r3
            boolean r3 = r3.A05
            int r4 = r4 + 1
            if (r3 != 0) goto L_0x01c0
        L_0x01d5:
            r23 = 0
            r6 = 0
        L_0x01d8:
            if (r6 >= r7) goto L_0x01fe
            r4 = r12[r6]
            java.lang.String r3 = "null cannot be cast to non-null type com.meta.kotlin.Try.Success<com.instagram.ar.core.effectcollection.models.EffectCollection>"
            X.0qQ.A0C(r4, r3)
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r5 = r4.A00
            X.9Ih r5 = (X.C376519Ih) r5
            long r14 = java.lang.System.currentTimeMillis()
            long r3 = r11.A00
            long r14 = r14 - r3
            java.lang.Object r3 = r5.A04
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x0212
            long r4 = r3.longValue()
            int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x0212
            r23 = 1
        L_0x01fe:
            X.0qQ.A0B(r13, r8)
            X.7xu r15 = new X.7xu
            r17 = r16
            r18 = r16
            r19 = r13
            r20 = r16
            r21 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0141
        L_0x0212:
            int r6 = r6 + 1
            goto L_0x01d8
        L_0x0215:
            r22 = 1
            goto L_0x01d5
        L_0x0218:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r8 = 3
            r11 = 2
            r4 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0230
            if (r0 == r4) goto L_0x0011
            if (r0 == r11) goto L_0x0279
            if (r0 == r8) goto L_0x0011
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0230:
            X.0eS.A00(r9)
            java.lang.Object r10 = r2.A01
            X.02o r10 = (X.02o) r10
            java.lang.Object r6 = r2.A02
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r9 = r2.A04
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r9 = (com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore) r9
            X.2Nn r3 = r9.A0B
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x0250
            r2.A01 = r7
            r2.A00 = r4
            java.lang.Object r0 = r10.emit(r7, r2)
            goto L_0x02bc
        L_0x0250:
            java.io.File r4 = r3.C4W()
            java.lang.String r3 = "raw_karaoke_bleep.mp4"
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x0288
            X.4Cc r5 = r9.A0D
            r4 = 39
            X.MGV r3 = new X.MGV
            r3.<init>(r9, r0, r7, r4)
            r2.A01 = r10
            r2.A02 = r6
            r2.A03 = r0
            r2.A00 = r11
            java.lang.Object r3 = X.1Eo.A00(r2, r5, r3)
            if (r3 != r1) goto L_0x0288
            return r1
        L_0x0279:
            java.lang.Object r0 = r2.A03
            java.io.File r0 = (java.io.File) r0
            java.lang.Object r6 = r2.A02
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r10 = r2.A01
            X.02o r10 = (X.02o) r10
            X.0eS.A00(r9)
        L_0x0288:
            java.lang.String r0 = r0.getAbsolutePath()
            X.0qQ.A07(r0)
            X.8Yw r0 = X.AHJ.A03(r0, r6)
            r2.A01 = r7
            r2.A02 = r7
            r2.A03 = r7
            r2.A00 = r8
        L_0x029b:
            java.lang.Object r0 = r10.emit(r0, r2)
            goto L_0x02bc
        L_0x02a0:
            X.0eS.A00(r9)
            java.lang.Object r0 = r2.A02
            X.02o r0 = (X.02o) r0
            java.lang.Object r12 = r2.A03
            java.util.List r12 = (java.util.List) r12
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L_0x02bf
            X.8fw r15 = X.C361268fw.A00
            r2.A02 = r5
            r3 = 1
            r2.A00 = r3
        L_0x02b8:
            java.lang.Object r0 = r0.emit(r15, r2)
        L_0x02bc:
            if (r0 != r1) goto L_0x0014
            return r1
        L_0x02bf:
            java.lang.Object r6 = r2.A01
            X.2Nn r6 = (X.2Nn) r6
            r3 = 0
            java.lang.Object r3 = r12.get(r3)
            X.9c8 r3 = (X.C381669c8) r3
            X.9cM r3 = r3.A02
            java.lang.String r4 = r3.A04
            if (r4 != 0) goto L_0x02d2
            java.lang.String r4 = ""
        L_0x02d2:
            r2.A02 = r0
            r2.A03 = r12
            r3 = 2
            r2.A00 = r3
            java.lang.Object r9 = com.instagram.creation.capture.quickcapture.sundial.sfx.SfxStitchingHelper.A00(r6, r4, r2)
            if (r9 != r1) goto L_0x02eb
            return r1
        L_0x02e0:
            java.lang.Object r12 = r2.A03
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r0 = r2.A02
            X.02o r0 = (X.02o) r0
            X.0eS.A00(r9)
        L_0x02eb:
            X.9cM r9 = (X.C381809cM) r9
            if (r9 == 0) goto L_0x047c
            java.lang.Object r4 = r2.A04
            X.83I r4 = (X.AnonymousClass83I) r4
            java.lang.Object r10 = r2.A01
            X.2Nn r10 = (X.2Nn) r10
            X.836 r3 = r4.A03
            X.0Ud r3 = r3.A03
            java.lang.Object r3 = r3.getValue()
            X.831 r3 = (X.AnonymousClass831) r3
            int r3 = r3.A00
            long r6 = (long) r3
            android.content.Context r3 = r4.A00
            r29 = r3
            com.instagram.common.session.UserSession r3 = r4.A01
            r28 = r3
            r2.A02 = r0
            r2.A03 = r5
            r3 = 3
            r2.A00 = r3
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = X.1IW.A02
            X.4D7 r4 = X.1Ey.A02(r2)
            r8 = 1
            X.1IW r21 = new X.1IW
            r3 = r21
            r3.<init>(r8, r4)
            r21.A0I()
            long r3 = java.lang.System.currentTimeMillis()
            java.io.File r13 = r10.C4W()
            java.lang.String r11 = "sfx_overlay_track_"
            java.lang.String r10 = ".mp4"
            java.lang.String r4 = X.002.A0e(r11, r10, r3)
            java.io.File r3 = new java.io.File
            r3.<init>(r13, r4)
            java.lang.String r11 = r3.getPath()
            X.4aP r10 = new X.4aP
            r10.<init>()
            X.4aE r20 = X.C266714aE.AUDIO
            X.4aJ r4 = new X.4aJ
            r3 = r20
            r4.<init>(r3)
            java.lang.String r13 = r9.A04
            java.io.File r3 = new java.io.File
            r3.<init>(r13)
            X.4aH r13 = new X.4aH
            r13.<init>(r3)
            r24 = 0
            java.util.concurrent.TimeUnit r19 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.4aF r3 = new X.4aF
            r22 = r3
            r23 = r19
            r26 = r6
            r22.<init>(r23, r24, r26)
            r13.A03 = r3
            X.4aI r3 = r13.A00()
            r4.A02(r3)
            X.4aM r3 = new X.4aM
            r3.<init>(r4)
            r10.A04(r3)
            java.util.Iterator r18 = r12.iterator()
        L_0x037b:
            boolean r3 = r18.hasNext()
            if (r3 == 0) goto L_0x03ce
            java.lang.Object r15 = r18.next()
            X.9c8 r15 = (X.C381669c8) r15
            long r6 = r15.A01
            r3 = r19
            long r16 = r3.toMicros(r6)
            java.lang.String r3 = ""
            X.4aJ r12 = new X.4aJ
            r14 = r20
            r13 = r3
            r3 = r16
            r12.<init>(r14, r13, r3)
            X.9cM r4 = r15.A02
            java.lang.String r13 = r4.A04
            java.io.File r3 = new java.io.File
            r3.<init>(r13)
            X.4aH r13 = new X.4aH
            r13.<init>(r3)
            int r4 = r4.A01
            int r3 = r9.A01
            int r14 = (int) r6
            int r3 = r3 - r14
            if (r4 <= r3) goto L_0x03b2
            r4 = r3
        L_0x03b2:
            long r3 = (long) r4
            X.4aF r6 = new X.4aF
            r22 = r6
            r26 = r3
            r22.<init>(r23, r24, r26)
            r13.A03 = r6
            X.4aI r3 = r13.A00()
            r12.A02(r3)
            X.4aM r3 = new X.4aM
            r3.<init>(r12)
            r10.A04(r3)
            goto L_0x037b
        L_0x03ce:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r12 = new com.facebook.videolite.transcoder.base.composition.MediaComposition
            r12.<init>(r10)
            X.0qQ.A0A(r11)
            X.9gA r6 = new X.9gA
            r3 = r21
            r6.<init>(r9, r11, r3)
            r9 = 0
            X.0qQ.A0B(r11, r8)
            X.SQv r7 = new X.SQv
            r7.<init>()
            r7.A0Q = r8
            X.SF8 r4 = new X.SF8
            r4.<init>()
            X.SFQ r3 = new X.SFQ
            r3.<init>(r4)
            r7.A0C = r3
            r7.A08 = r12
            r7.A0H = r9
            r7.A0I = r8
            java.lang.String r3 = "b"
            r7.A0E = r3
            r7.A0F = r11
            r7.A07 = r6
            java.io.File r6 = r29.getCacheDir()
            X.0qQ.A07(r6)
            X.RwN r4 = new X.RwN
            r3 = r28
            r4.<init>(r3, r6, r8, r9)
            X.SHv r6 = new X.SHv
            r6.<init>()
            X.RzN r3 = new X.RzN
            r3.<init>(r7)
            r6.A0C = r3
            r3 = r29
            r6.A00 = r3
            X.TdH r3 = r4.A00
            r6.A07 = r3
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newCachedThreadPool()
            r6.A0E = r3
            X.ThT r3 = r4.A03
            r6.A0A = r3
            X.TdI r3 = r4.A01
            r6.A08 = r3
            X.Tgv r3 = r4.A02
            r6.A09 = r3
            X.SrS r4 = new X.SrS
            r3 = r29
            r4.<init>(r3)
            r6.A06 = r4
            X.SrO r3 = new X.SrO
            r3.<init>()
            r6.A04 = r3
            X.Q1Q r4 = new X.Q1Q
            r3 = r28
            r4.<init>(r3)
            r6.A01 = r4
            X.Q1d r3 = new X.Q1d
            r3.<init>()
            r6.A03 = r3
            X.Rz8 r3 = r6.A01()
            X.Tgt r6 = X.SRj.A00(r3)
            r3 = 35
            X.MP5 r4 = new X.MP5
            r4.<init>(r6, r3)
            r3 = r21
            r3.CO0(r4)
            java.lang.Object r9 = r21.A0E()
            if (r9 != r1) goto L_0x0478
            return r1
        L_0x0471:
            java.lang.Object r0 = r2.A02
            X.02o r0 = (X.02o) r0
            X.0eS.A00(r9)
        L_0x0478:
            X.8fx r9 = (X.C361278fx) r9
            if (r9 != 0) goto L_0x047e
        L_0x047c:
            X.8fw r9 = X.C361268fw.A00
        L_0x047e:
            boolean r3 = r9 instanceof X.C361268fw
            if (r3 == 0) goto L_0x0491
            X.8fw r4 = X.C361268fw.A00
            r2.A02 = r5
            r2.A03 = r5
            r3 = 4
        L_0x0489:
            r2.A00 = r3
            java.lang.Object r0 = r0.emit(r4, r2)
            goto L_0x02bc
        L_0x0491:
            boolean r3 = r9.A01()
            if (r3 == 0) goto L_0x049f
            X.8g4 r4 = X.C361338g4.A00
            r2.A02 = r5
            r2.A03 = r5
            r3 = 5
            goto L_0x0489
        L_0x049f:
            boolean r3 = r9 instanceof X.AnonymousClass8Y4
            if (r3 == 0) goto L_0x0014
            java.lang.Object r3 = r9.A00()
            X.9cM r3 = (X.C381809cM) r3
            java.lang.String r4 = r3.A04
            X.51J r8 = X.AnonymousClass51J.SOUND_EFFECTS
            r13 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r17 = -1
            X.51I r3 = new X.51I
            r6 = r3
            r7 = r5
            r9 = r5
            r10 = r4
            r11 = r5
            r12 = r5
            r14 = r13
            r16 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.8Y4 r4 = new X.8Y4
            r4.<init>(r3)
            r2.A02 = r5
            r2.A03 = r5
            r3 = 6
            goto L_0x0489
        L_0x04cb:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x04d1:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KL(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(3, r4);
        this.A05 = i;
        this.A04 = obj;
        this.A01 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KL(C346077uZ r2, C239803Ii r3, AnonymousClass4D7 r4) {
        super(3, r4);
        this.A05 = 1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
