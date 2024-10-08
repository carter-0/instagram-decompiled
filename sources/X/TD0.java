package X;

public final class TD0 implements Runnable {
    public final /* synthetic */ STN A00;

    public TD0(STN stn) {
        this.A00 = stn;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v76, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, X.RR8] */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0314, code lost:
        if (r3.A03 >= 0) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0519, code lost:
        if (r11.equals(r10) == false) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x053d, code lost:
        if (X.STq.A01(r1, r10) == false) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fa, code lost:
        if (r8 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0621 A[Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x063a A[Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x06d8 A[Catch:{ Exception -> 0x074e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r48 = this;
            r47 = r48
            r0 = r47
            X.STN r0 = r0.A00     // Catch:{ Exception -> 0x07c4 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x07c4 }
            X.Thq r1 = r0.A0M     // Catch:{ all -> 0x07c1 }
            r1.onStart()     // Catch:{ all -> 0x07c1 }
            X.Tij r1 = r0.A0L     // Catch:{ all -> 0x07c1 }
            r46 = r1
            X.RzP r3 = r0.A0H     // Catch:{ all -> 0x07c1 }
            r1.DmL(r3)     // Catch:{ all -> 0x07c1 }
            X.Rzi r7 = r0.A0K     // Catch:{ all -> 0x07c1 }
            java.lang.String r4 = X.C9609Rdn.A00(r3)     // Catch:{ all -> 0x07c1 }
            r24 = 0
            r1 = r24
            X.0qQ.A0B(r4, r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = "content"
            r1 = 1
            X.0qQ.A0B(r2, r1)     // Catch:{ all -> 0x07c1 }
            android.content.Context r12 = r0.A0C     // Catch:{ all -> 0x07c1 }
            java.io.File r4 = X.C266784aL.A01(r12, r4)     // Catch:{ all -> 0x07c1 }
            r0.A08 = r4     // Catch:{ all -> 0x07c1 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r0.A04     // Catch:{ all -> 0x07c1 }
            r0.A04 = r2     // Catch:{ all -> 0x07c1 }
            r0.A03 = r2     // Catch:{ all -> 0x07c1 }
            if (r2 == 0) goto L_0x0046
            X.Rzi r1 = r3.A01     // Catch:{ all -> 0x07c1 }
            boolean r1 = r1.A00()     // Catch:{ all -> 0x07c1 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            r2.A0A(r1)     // Catch:{ all -> 0x07c1 }
            goto L_0x0053
        L_0x0046:
            X.Rp9 r1 = r3.A0J     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x007d
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r1.A00     // Catch:{ all -> 0x07c1 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r24)     // Catch:{ all -> 0x07c1 }
            r2.A0A(r1)     // Catch:{ all -> 0x07c1 }
        L_0x0053:
            X.S31 r5 = r0.A0G     // Catch:{ all -> 0x07c1 }
            X.MUb r4 = r0.A01     // Catch:{ all -> 0x07c1 }
            if (r4 == 0) goto L_0x07af
            java.util.concurrent.ExecutorService r6 = r0.A0P     // Catch:{ all -> 0x07c1 }
            if (r6 == 0) goto L_0x07aa
            r2 = 2
            X.0qQ.A0B(r5, r2)     // Catch:{ all -> 0x07c1 }
            X.RR8 r1 = new X.RR8     // Catch:{ all -> 0x07c1 }
            r1.<init>()     // Catch:{ all -> 0x07c1 }
            r1.A03 = r3     // Catch:{ all -> 0x07c1 }
            r1.A02 = r5     // Catch:{ all -> 0x07c1 }
            r1.A00 = r2     // Catch:{ all -> 0x07c1 }
            r1.A01 = r4     // Catch:{ all -> 0x07c1 }
            r1.A04 = r6     // Catch:{ all -> 0x07c1 }
            r0.A07 = r1     // Catch:{ all -> 0x07c1 }
            boolean r4 = r7 instanceof X.C7969QeH     // Catch:{ all -> 0x07c1 }
            if (r4 != 0) goto L_0x00aa
            X.STN.A02(r0)     // Catch:{ all -> 0x07c1 }
            X.STN.A03(r0)     // Catch:{ all -> 0x07c1 }
            goto L_0x00aa
        L_0x007d:
            boolean r1 = r4.exists()     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x0089
            boolean r1 = r4.canRead()     // Catch:{ all -> 0x07c1 }
            if (r1 != 0) goto L_0x00a6
        L_0x0089:
            boolean r1 = r7.A00()     // Catch:{ all -> 0x07c1 }
            if (r1 != 0) goto L_0x0094
            X.STN.A04(r0, r4)     // Catch:{ all -> 0x07c1 }
            goto L_0x07b7
        L_0x0094:
            java.io.File r1 = r4.getCanonicalFile()     // Catch:{ IOException -> 0x07b4 }
            boolean r1 = r1.canRead()     // Catch:{ IOException -> 0x07b4 }
            if (r1 != 0) goto L_0x00a6
            X.STN.A04(r0, r4)     // Catch:{ IOException -> 0x07b4 }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x07b4 }
            throw r1     // Catch:{ IOException -> 0x07b4 }
        L_0x00a6:
            r4.length()     // Catch:{ all -> 0x07c1 }
            goto L_0x0053
        L_0x00aa:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r8 = r0.A03     // Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }
            if (r8 == 0) goto L_0x00cf
            X.Tfv r2 = r3.A0F     // Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }
            X.Tfv r1 = r3.A0G     // Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }
            if (r4 == 0) goto L_0x00b7
            r16 = 1
            goto L_0x00b9
        L_0x00b7:
            r16 = 0
        L_0x00b9:
            if (r4 == 0) goto L_0x00c2
            r17 = 1
        L_0x00bd:
            if (r4 == 0) goto L_0x00c5
            r18 = 1
            goto L_0x00c7
        L_0x00c2:
            r17 = 0
            goto L_0x00bd
        L_0x00c5:
            r18 = 0
        L_0x00c7:
            r13 = r2
            r14 = r1
            r15 = r8
            X.Q0d r1 = X.S9V.A00(r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }
            goto L_0x00df
        L_0x00cf:
            java.lang.String r8 = "Required value was null."
            X.Tfv r2 = r3.A0G     // Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }
            java.io.File r1 = r0.A08     // Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }
            if (r1 == 0) goto L_0x00e2
            android.net.Uri r1 = android.net.Uri.fromFile(r1)     // Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }
            X.Q0d r1 = r2.AU7(r1)     // Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }
        L_0x00df:
            r0.A02 = r1     // Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }
            goto L_0x00ff
        L_0x00e2:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r8)     // Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }
            throw r1     // Catch:{ IOException -> 0x00f2, RuntimeException -> 0x00e7 }
        L_0x00e7:
            r9 = move-exception
            X.TdF r8 = r3.A0D     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = "videolite-video-upload"
            java.lang.String r1 = "MediaMetadata extraction failed"
            if (r8 == 0) goto L_0x00ff
            goto L_0x00fc
        L_0x00f2:
            r9 = move-exception
            X.TdF r8 = r3.A0D     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = "videolite-video-upload"
            java.lang.String r1 = "MediaMetadata extraction failed"
            if (r8 == 0) goto L_0x00ff
        L_0x00fc:
            r8.Chx(r9, r2, r1)     // Catch:{ all -> 0x07c1 }
        L_0x00ff:
            java.io.File r1 = r0.A08     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x07bc
            java.lang.String r2 = X.JTP.A0t(r1)     // Catch:{ all -> 0x07c1 }
            long r8 = X.Pxf.A0F(r2)     // Catch:{ all -> 0x07c1 }
            java.util.Map r11 = r5.A05     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "video_alias_file_path"
            r11.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "file_size"
            r11.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            r1 = 869(0x365, float:1.218E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)     // Catch:{ all -> 0x07c1 }
            r11.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            X.Q0d r8 = r0.A02     // Catch:{ all -> 0x07c1 }
            if (r8 == 0) goto L_0x01cb
            int r1 = r8.A05     // Catch:{ all -> 0x07c1 }
            long r1 = (long) r1     // Catch:{ all -> 0x07c1 }
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "source_width"
            r11.put(r1, r9)     // Catch:{ all -> 0x07c1 }
            int r1 = r8.A03     // Catch:{ all -> 0x07c1 }
            long r1 = (long) r1     // Catch:{ all -> 0x07c1 }
            java.lang.String r10 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "source_height"
            r11.put(r1, r10)     // Catch:{ all -> 0x07c1 }
            int r1 = r8.A01     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = X.S91.A00(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "source_color_space"
            r11.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            int r1 = r8.A02     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = X.S91.A01(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "source_color_transfer"
            r11.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            long r1 = r8.A06     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "source_bit_rate"
            r11.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            int r1 = r8.A04     // Catch:{ all -> 0x07c1 }
            long r1 = (long) r1     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "source_rotation_angle"
            r11.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            long r1 = r8.A07     // Catch:{ all -> 0x07c1 }
            java.lang.String r14 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r13 = "original_video_duration"
            r11.put(r13, r14)     // Catch:{ all -> 0x07c1 }
            java.lang.String r14 = r8.A0A     // Catch:{ all -> 0x07c1 }
            java.lang.String r13 = "orig_audio_codec"
            r11.put(r13, r14)     // Catch:{ all -> 0x07c1 }
            java.lang.String r14 = r8.A0B     // Catch:{ all -> 0x07c1 }
            java.lang.String r13 = "orig_video_codec"
            r11.put(r13, r14)     // Catch:{ all -> 0x07c1 }
            boolean r13 = r8.A0K     // Catch:{ all -> 0x07c1 }
            java.lang.String r14 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x07c1 }
            java.lang.String r13 = "has_audio_track"
            r11.put(r13, r14)     // Catch:{ all -> 0x07c1 }
            java.lang.String r14 = r8.A0D     // Catch:{ all -> 0x07c1 }
            java.lang.String r13 = "media_source_attribution"
            r11.put(r13, r14)     // Catch:{ all -> 0x07c1 }
            java.lang.String r13 = r8.toString()     // Catch:{ all -> 0x07c1 }
            java.lang.String r8 = "media_metadata"
            r11.put(r8, r13)     // Catch:{ all -> 0x07c1 }
            java.lang.String r8 = "original_photo_width"
            boolean r8 = r11.containsKey(r8)     // Catch:{ all -> 0x07c1 }
            if (r8 == 0) goto L_0x01c9
            java.lang.String r8 = "original_photo_height"
            boolean r8 = r11.containsKey(r8)     // Catch:{ all -> 0x07c1 }
            if (r8 == 0) goto L_0x01c9
            java.lang.String r8 = "generated_video_width"
            r11.put(r8, r9)     // Catch:{ all -> 0x07c1 }
            java.lang.String r8 = "generated_video_height"
            r11.put(r8, r10)     // Catch:{ all -> 0x07c1 }
        L_0x01c9:
            r5.A01 = r1     // Catch:{ all -> 0x07c1 }
        L_0x01cb:
            java.lang.Integer r2 = r0.A09     // Catch:{ all -> 0x07c1 }
            r1 = r24
            X.0qQ.A0B(r2, r1)     // Catch:{ all -> 0x07c1 }
            int r1 = r2.intValue()     // Catch:{ all -> 0x07c1 }
            switch(r1) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x01f4;
                default: goto L_0x01d9;
            }     // Catch:{ all -> 0x07c1 }
        L_0x01d9:
            java.lang.String r2 = "RECOVERY_SUCCESS"
        L_0x01db:
            java.lang.String r1 = "crash_recovery_mode"
            r11.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            X.Ssa r2 = new X.Ssa     // Catch:{ all -> 0x07c1 }
            r2.<init>(r0)     // Catch:{ all -> 0x07c1 }
            java.util.List r8 = r3.A0R     // Catch:{ all -> 0x07c1 }
            java.lang.String r9 = "Required value was null."
            X.Ssb r19 = new X.Ssb     // Catch:{ all -> 0x07c1 }
            r1 = r19
            r1.<init>(r2, r6)     // Catch:{ all -> 0x07c1 }
            goto L_0x01f7
        L_0x01f1:
            java.lang.String r2 = "NO_RECORD"
            goto L_0x01db
        L_0x01f4:
            java.lang.String r2 = "RECOVERY_FAILED"
            goto L_0x01db
        L_0x01f7:
            if (r8 != 0) goto L_0x07a3
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x07c1 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r0.A03     // Catch:{ all -> 0x07c1 }
            r23 = 1
            if (r2 == 0) goto L_0x020e
            boolean r1 = X.STq.A03(r2)     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x020e
            X.4aE r1 = X.C266714aE.VIDEO     // Catch:{ all -> 0x07c1 }
            X.STq.A00(r1, r2)     // Catch:{ all -> 0x07c1 }
        L_0x020e:
            r6 = 0
            if (r4 == 0) goto L_0x0777
            X.QeH r7 = (X.C7969QeH) r7     // Catch:{ all -> 0x07c1 }
            X.SRa r1 = r7.A00     // Catch:{ all -> 0x07c1 }
            boolean r1 = r1.A08()     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x0777
            java.io.File r1 = r0.A08     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x0772
            java.lang.String r4 = r1.getPath()     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = "video/mp4"
            java.lang.String r4 = X.Q1U.A00(r4, r2, r6)     // Catch:{ all -> 0x07c1 }
            java.lang.String r35 = "video"
            r38 = 0
            r2 = r35
            boolean r1 = X.00p.A0k(r4, r2, r6)     // Catch:{ all -> 0x07c1 }
            if (r1 != 0) goto L_0x023f
            java.lang.String r2 = "image"
            boolean r1 = X.00p.A0k(r4, r2, r6)     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x0240
        L_0x023f:
            r6 = 1
        L_0x0240:
            X.Q0d r4 = r0.A02     // Catch:{ all -> 0x07c1 }
            if (r4 == 0) goto L_0x0767
            if (r6 == 0) goto L_0x0767
            X.S1R r1 = r3.A0N     // Catch:{ all -> 0x07c1 }
            r45 = r1
            java.lang.String r1 = r0.A0N     // Catch:{ all -> 0x07c1 }
            r44 = r1
            com.facebook.videolite.transcoder.base.composition.MediaComposition r6 = r0.A03     // Catch:{ all -> 0x07c1 }
            X.Tj9 r2 = r0.A0D     // Catch:{ all -> 0x07c1 }
            X.SNK r1 = r0.A06     // Catch:{ all -> 0x07c1 }
            r43 = r1
            r1 = 6
            X.0qQ.A0B(r2, r1)     // Catch:{ all -> 0x07c1 }
            X.SFy r1 = r3.A06     // Catch:{ all -> 0x07c1 }
            r25 = r1
            if (r1 != 0) goto L_0x0264
            X.SFy r1 = r3.A05     // Catch:{ all -> 0x07c1 }
            r25 = r1
        L_0x0264:
            java.util.HashMap r5 = r5.A00()     // Catch:{ all -> 0x07c1 }
            X.RuM r20 = new X.RuM     // Catch:{ all -> 0x07c1 }
            r1 = r20
            r1.<init>(r2, r5)     // Catch:{ all -> 0x07c1 }
            java.lang.String r34 = "context"
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x07c1 }
            X.RxS r10 = r3.A0M     // Catch:{ all -> 0x07c1 }
            if (r10 != 0) goto L_0x0287
            java.lang.String r1 = "VideoUploadSettingsParams should not be null"
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x07c1 }
            r3.<init>(r1)     // Catch:{ all -> 0x07c1 }
        L_0x0280:
            r1 = r19
            r1.onFailure(r3)     // Catch:{ all -> 0x07c1 }
            goto L_0x07a8
        L_0x0287:
            r36 = 1
            int r22 = r44.length()     // Catch:{ all -> 0x07c1 }
            if (r22 == 0) goto L_0x0296
            java.lang.String r2 = "composer_session_id"
            r1 = r44
            r5.put(r2, r1)     // Catch:{ all -> 0x07c1 }
        L_0x0296:
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x07c1 }
            long r1 = r4.A07     // Catch:{ all -> 0x07c1 }
            r32 = 1000(0x3e8, double:4.94E-321)
            long r8 = r1 / r32
            r30 = 1
            long r8 = r8 + r30
            java.lang.Long r9 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x07c1 }
            java.lang.String r8 = "video_duration_milliseconds"
            r7.put(r8, r9)     // Catch:{ all -> 0x07c1 }
            long r8 = r4.A06     // Catch:{ all -> 0x07c1 }
            java.lang.Long r9 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x07c1 }
            java.lang.String r8 = "video_bit_rate_bps"
            r7.put(r8, r9)     // Catch:{ all -> 0x07c1 }
            int r8 = r4.A00     // Catch:{ all -> 0x07c1 }
            java.lang.Long r9 = X.DbS.A0j(r8)     // Catch:{ all -> 0x07c1 }
            java.lang.String r8 = "audio_bit_rate_bps"
            r7.put(r8, r9)     // Catch:{ all -> 0x07c1 }
            java.lang.String r9 = r4.A0A     // Catch:{ all -> 0x07c1 }
            java.lang.String r8 = "audio_codec_type"
            r7.put(r8, r9)     // Catch:{ all -> 0x07c1 }
            int r8 = r4.A05     // Catch:{ all -> 0x07c1 }
            java.lang.Long r9 = X.DbS.A0j(r8)     // Catch:{ all -> 0x07c1 }
            java.lang.String r8 = "video_width"
            r7.put(r8, r9)     // Catch:{ all -> 0x07c1 }
            int r8 = r4.A03     // Catch:{ all -> 0x07c1 }
            java.lang.Long r9 = X.DbS.A0j(r8)     // Catch:{ all -> 0x07c1 }
            r8 = 424(0x1a8, float:5.94E-43)
            java.lang.String r8 = X.C273654mx.A00(r8)     // Catch:{ all -> 0x07c1 }
            r7.put(r8, r9)     // Catch:{ all -> 0x07c1 }
            int r8 = r4.A04     // Catch:{ all -> 0x07c1 }
            java.lang.Long r9 = X.DbS.A0j(r8)     // Catch:{ all -> 0x07c1 }
            java.lang.String r8 = "video_rotation_angle"
            r7.put(r8, r9)     // Catch:{ all -> 0x07c1 }
            long r8 = r4.A08     // Catch:{ all -> 0x07c1 }
            java.lang.Long r9 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x07c1 }
            java.lang.String r8 = "video_original_file_size"
            r7.put(r8, r9)     // Catch:{ all -> 0x07c1 }
            java.lang.String r9 = r4.A0B     // Catch:{ all -> 0x07c1 }
            java.lang.String r8 = "source_video_codec"
            r7.put(r8, r9)     // Catch:{ all -> 0x07c1 }
            long r13 = r3.A04     // Catch:{ all -> 0x07c1 }
            r15 = 0
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x0316
            long r8 = r3.A03     // Catch:{ all -> 0x07c1 }
            int r17 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            r8 = 0
            if (r17 < 0) goto L_0x0317
        L_0x0316:
            r8 = 1
        L_0x0317:
            r28 = -1
            if (r8 == 0) goto L_0x0332
            r26 = r13
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x0323
            r26 = 0
        L_0x0323:
            long r8 = r3.A03     // Catch:{ all -> 0x07c1 }
            int r17 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r17 < 0) goto L_0x032a
            r1 = r8
        L_0x032a:
            long r1 = r1 - r26
            int r8 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x0332
            r28 = r1
        L_0x0332:
            int r1 = (r28 > r15 ? 1 : (r28 == r15 ? 0 : -1))
            if (r1 < 0) goto L_0x033a
            long r28 = r28 / r32
            long r28 = r28 + r30
        L_0x033a:
            java.lang.Long r2 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "target_duration"
            r7.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = r4.A0H     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "PHOTO"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x07c1 }
            if (r1 != 0) goto L_0x0388
            X.RwV r8 = X.C9612Rdq.A00(r12, r3)     // Catch:{ all -> 0x07c1 }
            if (r8 == 0) goto L_0x0388
            int r1 = r8.A00     // Catch:{ all -> 0x07c1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "video_fps"
            r7.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            int r1 = r8.A01     // Catch:{ all -> 0x07c1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "video_gop_size_sec"
            r7.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            int r1 = r8.A02     // Catch:{ all -> 0x07c1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "video_key_frame_size_bytes"
            r7.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            int r1 = r8.A03     // Catch:{ all -> 0x07c1 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "video_partial_frame_size_bytes"
            r7.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            int r1 = r8.A00     // Catch:{ all -> 0x07c1 }
            r10.A00 = r1     // Catch:{ all -> 0x07c1 }
        L_0x0388:
            java.lang.String r1 = "asset_id"
            java.lang.String r2 = X.DbT.A11(r1, r11)     // Catch:{ all -> 0x07c1 }
            r7.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            boolean r1 = r10.A01     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x039e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r23)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "enable_video_dimension_upscale"
            r7.put(r1, r2)     // Catch:{ all -> 0x07c1 }
        L_0x039e:
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x07c1 }
            r1 = 40
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "battery"
            r8.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = r10.A04     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "quality"
            r8.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = r10.A03     // Catch:{ all -> 0x07c1 }
            r33 = r1
            java.lang.String r2 = "source_type"
            r8.put(r2, r1)     // Catch:{ all -> 0x07c1 }
            long r1 = r10.A02     // Catch:{ all -> 0x07c1 }
            r31 = r1
            java.lang.Long r2 = java.lang.Long.valueOf(r31)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "target_id"
            r8.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            java.util.HashSet r11 = X.AnonymousClass7TE.A1F()     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "video/hevc"
            r11.add(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "video/avc"
            r11.add(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            r11.add(r1)     // Catch:{ all -> 0x07c1 }
            java.util.HashMap r28 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x07c1 }
            android.media.MediaCodecInfo[] r27 = X.Pxg.A1Z(r23)     // Catch:{ all -> 0x07c1 }
            r1 = r27
            int r1 = r1.length     // Catch:{ all -> 0x07c1 }
            r30 = r1
            r10 = 0
        L_0x03f1:
            r1 = r30
            if (r10 >= r1) goto L_0x04bb
            r26 = r27[r10]     // Catch:{ all -> 0x07c1 }
            boolean r1 = r26.isEncoder()     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x04b7
            java.lang.String[] r21 = r26.getSupportedTypes()     // Catch:{ all -> 0x07c1 }
            r1 = r21
            int r1 = r1.length     // Catch:{ all -> 0x07c1 }
            r29 = r1
            r9 = 0
        L_0x0407:
            r1 = r29
            if (r9 >= r1) goto L_0x04b7
            r1 = r21[r9]     // Catch:{ all -> 0x07c1 }
            X.0qQ.A04(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = X.AnonymousClass7TF.A0j(r1)     // Catch:{ all -> 0x07c1 }
            boolean r1 = r11.contains(r2)     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x04b3
            r1 = r26
            android.media.MediaCodecInfo$CodecCapabilities r18 = r1.getCapabilitiesForType(r2)     // Catch:{ all -> 0x07c1 }
            if (r18 == 0) goto L_0x04b3
            r1 = r28
            java.util.List r12 = X.Pxe.A1B(r2, r1)     // Catch:{ all -> 0x07c1 }
            if (r12 != 0) goto L_0x04ab
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x07c1 }
            r1.put(r2, r12)     // Catch:{ all -> 0x07c1 }
        L_0x0431:
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x07c1 }
            r12.add(r2)     // Catch:{ all -> 0x07c1 }
            java.lang.String r12 = r26.getName()     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "encoder_name"
            r2.put(r1, r12)     // Catch:{ all -> 0x07c1 }
            int r1 = r18.getMaxSupportedInstances()     // Catch:{ all -> 0x07c1 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "max_instances"
            r2.put(r1, r12)     // Catch:{ all -> 0x07c1 }
            android.media.MediaCodecInfo$VideoCapabilities r17 = r18.getVideoCapabilities()     // Catch:{ all -> 0x07c1 }
            if (r17 == 0) goto L_0x0499
            android.util.Range r12 = r17.getSupportedWidths()     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "width"
            X.C11292SKa.A02(r12, r1, r2)     // Catch:{ all -> 0x07c1 }
            android.util.Range r12 = r17.getSupportedHeights()     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "height"
            X.C11292SKa.A02(r12, r1, r2)     // Catch:{ all -> 0x07c1 }
            int r1 = r17.getWidthAlignment()     // Catch:{ all -> 0x07c1 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "width_alignment"
            r2.put(r1, r12)     // Catch:{ all -> 0x07c1 }
            int r1 = r17.getHeightAlignment()     // Catch:{ all -> 0x07c1 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "height_alignment"
            r2.put(r1, r12)     // Catch:{ all -> 0x07c1 }
            android.util.Range r12 = r17.getBitrateRange()     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "bitrate"
            X.C11292SKa.A02(r12, r1, r2)     // Catch:{ all -> 0x07c1 }
            android.util.Range r12 = r17.getSupportedFrameRates()     // Catch:{ all -> 0x07c1 }
            r1 = 3156(0xc54, float:4.422E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ all -> 0x07c1 }
            X.C11292SKa.A02(r12, r1, r2)     // Catch:{ all -> 0x07c1 }
        L_0x0499:
            android.media.MediaCodecInfo$EncoderCapabilities r1 = r18.getEncoderCapabilities()     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x04b3
            android.util.Range r12 = r1.getComplexityRange()     // Catch:{ all -> 0x07c1 }
            if (r12 == 0) goto L_0x04b3
            java.lang.String r1 = "complexity"
            X.C11292SKa.A02(r12, r1, r2)     // Catch:{ all -> 0x07c1 }
            goto L_0x04b3
        L_0x04ab:
            int r2 = r12.size()     // Catch:{ all -> 0x07c1 }
            r1 = r23
            if (r2 != r1) goto L_0x0431
        L_0x04b3:
            int r9 = r9 + 1
            goto L_0x0407
        L_0x04b7:
            int r10 = r10 + 1
            goto L_0x03f1
        L_0x04bb:
            X.LEi r10 = r3.A0C     // Catch:{ all -> 0x07c1 }
            if (r10 == 0) goto L_0x0509
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = "ig_dummy"
            int r1 = r2.length()     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x04db
            java.lang.String r1 = "network_connection_name"
            r9.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "download_bandwidth_connection_quality"
            r9.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "download_latency_connection_quality"
            r9.put(r1, r2)     // Catch:{ all -> 0x07c1 }
        L_0x04db:
            double r11 = r10.A00()     // Catch:{ all -> 0x07c1 }
            r17 = 0
            int r1 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r1 <= 0) goto L_0x04f2
            double r1 = r10.A00()     // Catch:{ all -> 0x07c1 }
            java.lang.Double r2 = java.lang.Double.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "download_bandwidth"
            r9.put(r1, r2)     // Catch:{ all -> 0x07c1 }
        L_0x04f2:
            double r11 = r10.A01()     // Catch:{ all -> 0x07c1 }
            int r1 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r1 <= 0) goto L_0x0510
            double r1 = r10.A01()     // Catch:{ all -> 0x07c1 }
            java.lang.Double r2 = java.lang.Double.valueOf(r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "upload_bandwidth"
            r9.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            goto L_0x0510
        L_0x0509:
            java.util.Map r9 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x07c1 }
            X.0qQ.A0A(r9)     // Catch:{ all -> 0x07c1 }
        L_0x0510:
            r21 = 0
            if (r6 == 0) goto L_0x051b
            goto L_0x0569
        L_0x0515:
            boolean r1 = r11.equals(r10)     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x05ad
        L_0x051b:
            X.STq r11 = X.STq.A00     // Catch:{ all -> 0x07c1 }
            X.Rp9 r1 = r3.A0J     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x055e
            com.facebook.videolite.transcoder.base.composition.MediaComposition r10 = r1.A00     // Catch:{ all -> 0x07c1 }
            X.4aE r2 = X.C266714aE.VIDEO     // Catch:{ all -> 0x07c1 }
            boolean r1 = X.STq.A02(r2, r10, r11)     // Catch:{ all -> 0x07c1 }
            if (r1 != 0) goto L_0x053f
            X.4aE r1 = X.C266714aE.AUDIO     // Catch:{ all -> 0x07c1 }
            boolean r11 = X.STq.A02(r1, r10, r11)     // Catch:{ all -> 0x07c1 }
            if (r11 != 0) goto L_0x053f
            boolean r2 = X.STq.A01(r2, r10)     // Catch:{ all -> 0x07c1 }
            if (r2 != 0) goto L_0x053f
            boolean r1 = X.STq.A01(r1, r10)     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x05ad
        L_0x053f:
            X.SFw r2 = r3.A0A     // Catch:{ all -> 0x07c1 }
            X.ThT r1 = r2.A09     // Catch:{ all -> 0x07c1 }
            boolean r1 = r1.AFw()     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x05ad
            X.Tgv r1 = r2.A08     // Catch:{ all -> 0x07c1 }
            boolean r1 = r1.AFw()     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x05ad
            int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r1 > 0) goto L_0x05ad
            boolean r1 = X.STq.A06(r3)     // Catch:{ all -> 0x07c1 }
            if (r1 != 0) goto L_0x05ad
            r21 = 1
            goto L_0x05ad
        L_0x055e:
            int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r1 >= 0) goto L_0x053f
            long r1 = r3.A03     // Catch:{ all -> 0x07c1 }
            int r10 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r10 < 0) goto L_0x05ad
            goto L_0x053f
        L_0x0569:
            X.4aE r2 = X.C266714aE.VIDEO     // Catch:{ all -> 0x07c1 }
            boolean r1 = X.Q1Z.A04(r2, r6)     // Catch:{ all -> 0x07c1 }
            if (r1 != 0) goto L_0x05ad
            boolean r1 = r6.A0B(r2)     // Catch:{ all -> 0x07c1 }
            if (r1 != 0) goto L_0x05ad
            X.4aE r1 = X.C266714aE.AUDIO     // Catch:{ all -> 0x07c1 }
            boolean r10 = X.Q1Z.A04(r1, r6)     // Catch:{ all -> 0x07c1 }
            if (r10 != 0) goto L_0x05ad
            boolean r10 = r6.A0B(r1)     // Catch:{ all -> 0x07c1 }
            if (r10 != 0) goto L_0x05ad
            boolean r10 = X.STq.A01(r2, r6)     // Catch:{ all -> 0x07c1 }
            if (r10 != 0) goto L_0x05ad
            boolean r10 = X.STq.A01(r1, r6)     // Catch:{ all -> 0x07c1 }
            if (r10 != 0) goto L_0x05ad
            X.4aI r11 = X.STq.A00(r2, r6)     // Catch:{ all -> 0x07c1 }
            X.4aI r10 = X.STq.A00(r1, r6)     // Catch:{ all -> 0x07c1 }
            if (r11 == 0) goto L_0x0622
            long r1 = r11.A02     // Catch:{ all -> 0x07c1 }
            int r12 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r12 > 0) goto L_0x05ad
            X.4aF r2 = r11.A03     // Catch:{ all -> 0x07c1 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x07c1 }
            long r17 = r2.A03(r1)     // Catch:{ all -> 0x07c1 }
            int r1 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x0622
        L_0x05ad:
            boolean r1 = X.STq.A04(r6, r3)     // Catch:{ all -> 0x07c1 }
            r11 = r1 ^ 1
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x07c1 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r21)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "transmuxing_eligible"
            r10.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x07c1 }
            java.lang.String r1 = "transcoding_required"
            r10.put(r1, r2)     // Catch:{ all -> 0x07c1 }
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x07c1 }
            java.lang.String r11 = "upload_settings_version"
            java.lang.String r2 = "v0.1"
            r1.put(r11, r2)     // Catch:{ all -> 0x07c1 }
            r2 = r35
            r1.put(r2, r7)     // Catch:{ all -> 0x07c1 }
            r2 = r34
            r1.put(r2, r8)     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = "network"
            r1.put(r2, r9)     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = "creative_tools"
            r1.put(r2, r10)     // Catch:{ all -> 0x07c1 }
            java.lang.String r7 = "codec"
            r2 = r28
            r1.put(r7, r2)     // Catch:{ all -> 0x07c1 }
            java.lang.String r7 = X.JTQ.A0c(r1)     // Catch:{ all -> 0x07c1 }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x07c1 }
            java.lang.String r2 = "upload_setting_properties"
            r5.put(r2, r7)     // Catch:{ all -> 0x07c1 }
            r7 = r20
            X.Tj9 r9 = r7.A01     // Catch:{ all -> 0x07c1 }
            long r7 = r9.now()     // Catch:{ all -> 0x07c1 }
            r10 = r20
            r10.A00 = r7     // Catch:{ all -> 0x07c1 }
            java.lang.String r39 = "media_upload_fetch_upload_settings_start"
            r41 = -1
            java.util.Map r7 = r10.A02     // Catch:{ all -> 0x07c1 }
            r37 = r9
            r40 = r7
            X.C9596Rda.A00(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x07c1 }
            X.Rzi r8 = r3.A01     // Catch:{ all -> 0x07c1 }
            boolean r8 = r8 instanceof X.C7969QeH     // Catch:{ all -> 0x07c1 }
            if (r8 == 0) goto L_0x063a
            goto L_0x0638
        L_0x0622:
            if (r10 == 0) goto L_0x0632
            X.4aF r2 = r10.A03     // Catch:{ all -> 0x07c1 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x07c1 }
            long r17 = r2.A03(r1)     // Catch:{ all -> 0x07c1 }
            int r1 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x0632
            goto L_0x05ad
        L_0x0632:
            if (r11 == 0) goto L_0x051b
            if (r10 == 0) goto L_0x051b
            goto L_0x0515
        L_0x0638:
            r8 = 1
            goto L_0x063b
        L_0x063a:
            r8 = 0
        L_0x063b:
            r12 = 0
            if (r8 == 0) goto L_0x06d8
            java.lang.String r11 = ""
            int r8 = r11.length()     // Catch:{ all -> 0x07c1 }
            if (r8 == 0) goto L_0x0650
            r10 = r33
            r8 = r24
            boolean r8 = X.00l.A0d(r11, r10, r8)     // Catch:{ all -> 0x07c1 }
            if (r8 == 0) goto L_0x06d8
        L_0x0650:
            r5 = r25
            java.lang.String r8 = r5.A09     // Catch:{ Exception -> 0x074e }
            if (r8 == 0) goto L_0x065c
            int r5 = r8.length()     // Catch:{ Exception -> 0x074e }
            if (r5 != 0) goto L_0x0665
        L_0x065c:
            java.lang.String r8 = "facebook.com"
            java.lang.String r5 = "rupload."
            java.lang.String r8 = X.002.A0R(r5, r8)     // Catch:{ Exception -> 0x074e }
        L_0x0665:
            android.net.Uri$Builder r11 = X.Pxe.A0I()     // Catch:{ Exception -> 0x074e }
            java.lang.String r5 = "https"
            android.net.Uri$Builder r5 = r11.scheme(r5)     // Catch:{ Exception -> 0x074e }
            android.net.Uri$Builder r5 = r5.encodedAuthority(r8)     // Catch:{ Exception -> 0x074e }
            java.lang.String r10 = "upload_settings"
            android.net.Uri$Builder r8 = r5.appendPath(r10)     // Catch:{ Exception -> 0x074e }
            java.lang.String r5 = X.AnonymousClass7TF.A0b()     // Catch:{ Exception -> 0x074e }
            r8.appendPath(r5)     // Catch:{ Exception -> 0x074e }
            java.net.URI r14 = X.Pxg.A11(r11)     // Catch:{ Exception -> 0x074e }
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x074e }
            java.lang.String r11 = "_settings"
            r8 = r44
            java.lang.String r12 = X.002.A0R(r8, r11)     // Catch:{ Exception -> 0x074e }
            r8 = r23
            java.util.HashMap r11 = X.Pxf.A0r(r12, r8)     // Catch:{ Exception -> 0x074e }
            java.lang.String r8 = "X_FB_VIDEO_WATERFALL_ID"
            r11.put(r8, r12)     // Catch:{ Exception -> 0x074e }
            r5.putAll(r11)     // Catch:{ Exception -> 0x074e }
            java.lang.String r11 = "Offset"
            java.lang.String r8 = "0"
            r5.put(r11, r8)     // Catch:{ Exception -> 0x074e }
            java.lang.String r11 = "X-Entity-Type"
            java.lang.String r8 = "application/json"
            r5.put(r11, r8)     // Catch:{ Exception -> 0x074e }
            java.lang.String r8 = "X-Entity-Name"
            r5.put(r8, r10)     // Catch:{ Exception -> 0x074e }
            r8 = r25
            java.util.Map r10 = r8.A0B     // Catch:{ Exception -> 0x074e }
            java.lang.String r11 = "X-Auth-Type"
            java.lang.Object r8 = r10.get(r11)     // Catch:{ Exception -> 0x074e }
            if (r8 == 0) goto L_0x06c1
            r5.put(r11, r8)     // Catch:{ Exception -> 0x074e }
        L_0x06c1:
            java.lang.String r13 = "devserver-forward-host"
            java.lang.Object r12 = r10.get(r13)     // Catch:{ Exception -> 0x074e }
            java.lang.String r11 = "enable-upload-settings-forwarding"
            java.lang.Object r8 = r10.get(r11)     // Catch:{ Exception -> 0x074e }
            java.lang.String r10 = "1"
            boolean r8 = r10.equals(r8)     // Catch:{ Exception -> 0x074e }
            if (r8 == 0) goto L_0x0710
            if (r12 == 0) goto L_0x0710
            goto L_0x070a
        L_0x06d8:
            r36 = 0
            android.net.Uri$Builder r10 = X.Pxe.A0I()     // Catch:{ Exception -> 0x074e }
            java.lang.String r2 = "https"
            android.net.Uri$Builder r11 = r10.scheme(r2)     // Catch:{ Exception -> 0x074e }
            java.lang.String r8 = "graph-video."
            java.lang.String r2 = "facebook.com"
            java.lang.String r2 = X.002.A0R(r8, r2)     // Catch:{ Exception -> 0x074e }
            android.net.Uri$Builder r8 = r11.encodedAuthority(r2)     // Catch:{ Exception -> 0x074e }
            java.lang.String r2 = "v2.6"
            android.net.Uri$Builder r8 = r8.appendPath(r2)     // Catch:{ Exception -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ Exception -> 0x074e }
            android.net.Uri$Builder r8 = r8.appendPath(r2)     // Catch:{ Exception -> 0x074e }
            java.lang.String r2 = "videos"
            r8.appendPath(r2)     // Catch:{ Exception -> 0x074e }
            java.net.URI r14 = X.Pxg.A11(r10)     // Catch:{ Exception -> 0x074e }
            goto L_0x0729
        L_0x070a:
            r5.put(r11, r10)     // Catch:{ Exception -> 0x074e }
            r5.put(r13, r12)     // Catch:{ Exception -> 0x074e }
        L_0x0710:
            org.json.JSONObject r11 = X.DbS.A11()     // Catch:{ Exception -> 0x074e }
            if (r22 == 0) goto L_0x071d
            java.lang.String r10 = "composer_session_id"
            r8 = r44
            r11.put(r10, r8)     // Catch:{ Exception -> 0x074e }
        L_0x071d:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x074e }
            r8.<init>(r1)     // Catch:{ Exception -> 0x074e }
            r11.put(r2, r8)     // Catch:{ Exception -> 0x074e }
            X.RrT r12 = X.C266784aL.A00(r11)     // Catch:{ Exception -> 0x074e }
        L_0x0729:
            java.lang.Integer r13 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x074e }
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x074e }
            r2.<init>(r5)     // Catch:{ Exception -> 0x074e }
            X.QNC r27 = new X.QNC     // Catch:{ Exception -> 0x074e }
            r28 = r20
            r29 = r4
            r30 = r6
            r31 = r3
            r32 = r43
            r33 = r19
            r34 = r46
            r35 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ Exception -> 0x074e }
            r10 = r45
            r11 = r27
            r15 = r2
            r10.A00(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x074e }
            goto L_0x07a8
        L_0x074e:
            r3 = move-exception
            r1 = r20
            long r1 = r1.A00     // Catch:{ all -> 0x07c1 }
            long r12 = X.C13886Tj9.A00(r9, r1)     // Catch:{ all -> 0x07c1 }
            java.lang.String r10 = "media_upload_fetch_upload_settings_failure"
            r11 = r7
            r8 = r9
            r9 = r3
            X.C9596Rda.A00(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x07c1 }
            r1 = r46
            r1.DFP(r3)     // Catch:{ all -> 0x07c1 }
            goto L_0x0280
        L_0x0767:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r0.A03     // Catch:{ all -> 0x07c1 }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x07c1 }
            boolean r1 = X.STq.A04(r1, r3)     // Catch:{ all -> 0x07c1 }
            goto L_0x0794
        L_0x0772:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r9)     // Catch:{ all -> 0x07c1 }
            goto L_0x07c0
        L_0x0777:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r4 = r0.A03     // Catch:{ all -> 0x07c1 }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x07c1 }
            X.SOn r2 = r3.A0H     // Catch:{ all -> 0x07c1 }
            boolean r1 = r3.A0T     // Catch:{ all -> 0x07c1 }
            if (r1 == 0) goto L_0x0791
            X.REA r1 = X.REA.NON_SEGMENTED_TRANSCODE     // Catch:{ all -> 0x07c1 }
        L_0x0785:
            X.SJC r1 = X.Pxh.A0R(r2, r1)     // Catch:{ all -> 0x07c1 }
            r5.add(r1)     // Catch:{ all -> 0x07c1 }
            boolean r1 = X.STq.A04(r4, r3)     // Catch:{ all -> 0x07c1 }
            goto L_0x0794
        L_0x0791:
            X.REA r1 = X.REA.SEGMENTED_TRANSCODE     // Catch:{ all -> 0x07c1 }
            goto L_0x0785
        L_0x0794:
            if (r1 == 0) goto L_0x07a0
            X.REA r2 = X.REA.RAW     // Catch:{ all -> 0x07c1 }
            r1 = 0
            X.SJC r1 = X.Pxh.A0R(r1, r2)     // Catch:{ all -> 0x07c1 }
            r5.add(r1)     // Catch:{ all -> 0x07c1 }
        L_0x07a0:
            r8.addAll(r5)     // Catch:{ all -> 0x07c1 }
        L_0x07a3:
            r1 = r19
            r1.D56(r8)     // Catch:{ all -> 0x07c1 }
        L_0x07a8:
            monitor-exit(r0)     // Catch:{ Exception -> 0x07c4 }
            return
        L_0x07aa:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x07c1 }
            goto L_0x07c0
        L_0x07af:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x07c1 }
            goto L_0x07c0
        L_0x07b4:
            X.STN.A04(r0, r4)     // Catch:{ all -> 0x07c1 }
        L_0x07b7:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x07c0
        L_0x07bc:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x07c1 }
        L_0x07c0:
            throw r1     // Catch:{ all -> 0x07c1 }
        L_0x07c1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x07c4 }
            throw r1     // Catch:{ Exception -> 0x07c4 }
        L_0x07c4:
            r4 = move-exception
            r0 = r47
            X.STN r3 = r0.A00
            X.RzP r0 = r3.A0H
            X.TdF r2 = r0.A0D
            java.lang.String r1 = "videolite-video-upload"
            java.lang.String r0 = "doUpload failed"
            if (r2 == 0) goto L_0x07d7
            r2.Chx(r4, r1, r0)
        L_0x07d7:
            X.STN.A05(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TD0.run():void");
    }
}
