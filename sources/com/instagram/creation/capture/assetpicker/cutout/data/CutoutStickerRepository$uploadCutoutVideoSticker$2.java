package com.instagram.creation.capture.assetpicker.cutout.data;

import X.0sL;
import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import com.instagram.common.gallery.Medium;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository$uploadCutoutVideoSticker$2", f = "CutoutStickerRepository.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class CutoutStickerRepository$uploadCutoutVideoSticker$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Medium A03;
    public final /* synthetic */ CutoutStickerRepository A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CutoutStickerRepository$uploadCutoutVideoSticker$2(Medium medium, CutoutStickerRepository cutoutStickerRepository, AnonymousClass4D7 r4, 0sP r5, long j, long j2, boolean z) {
        super(2, r4);
        this.A04 = cutoutStickerRepository;
        this.A03 = medium;
        this.A02 = j;
        this.A01 = j2;
        this.A06 = z;
        this.A05 = r5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository$uploadCutoutVideoSticker$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        CutoutStickerRepository cutoutStickerRepository = this.A04;
        return new CutoutStickerRepository$uploadCutoutVideoSticker$2(this.A03, cutoutStickerRepository, r12, this.A05, this.A02, this.A01, this.A06);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.Srl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r34v1, types: [X.Tfv, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01f7, code lost:
        if (X.0qQ.A0K(r6, "270") != false) goto L_0x01f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r60) {
        /*
            r59 = this;
            r2 = r59
            int r0 = r2.A00
            r8 = 1
            if (r0 == 0) goto L_0x000d
            X.0eS.A00(r60)
        L_0x000a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x000d:
            X.0eS.A00(r60)
            com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository r0 = r2.A04
            X.L9Z r4 = r0.A05
            com.instagram.common.gallery.Medium r0 = r2.A03
            r58 = r0
            long r0 = r2.A02
            r18 = r0
            long r0 = r2.A01
            r16 = r0
            boolean r0 = r2.A06
            r23 = r0
            X.0sP r1 = r2.A05
            r2.A00 = r8
            com.instagram.common.session.UserSession r5 = r4.A04
            X.0Tu r0 = X.0Tu.A05
            r2 = 36320064525115333(0x8108e8003d1fc5, double:3.0322932826194493E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x0047
            X.SgG r0 = r4.A03
            r2 = r0
            r3 = r58
            r4 = r1
            r5 = r18
            r7 = r16
            r9 = r23
            r2.A01(r3, r4, r5, r7, r9)
            goto L_0x000a
        L_0x0047:
            com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor r4 = r4.A00
            r22 = 0
            r2 = r22
            r0 = r58
            X.0qQ.A0B(r0, r2)
            com.instagram.common.session.UserSession r0 = r4.A0K
            r26 = r0
            X.02m r3 = X.02m.A0p
            r2 = 900937655(0x35b337b7, float:1.3352754E-6)
            r0 = r22
            r3.markerStart(r2, r0)
            r0 = 15
            r4.A02 = r0
            r4.A01 = r0
            r0 = r22
            r4.A0F = r0
            r4.A0E = r8
            java.util.Queue r0 = r4.A0L
            r0.clear()
            r21 = 0
            r0 = r21
            r4.A0D = r0
            r4.A0C = r0
            X.1OC r0 = r4.A09
            if (r0 == 0) goto L_0x0080
            r0.onCancel()
        L_0x0080:
            r0 = r21
            r4.A09 = r0
            r0 = r58
            int r3 = r0.A0B
            int r2 = r0.A04
            X.7zv r5 = new X.7zv
            r5.<init>(r0, r3, r2, r8)
            java.lang.String r0 = r5.A0k
            java.io.File r20 = X.AnonymousClass7TE.A0t(r0)
            int r6 = r5.A0K
            int r3 = r5.A08
            r2 = r26
            r0 = r21
            com.instagram.pendingmedia.model.ClipInfo r28 = X.AnonymousClass9T4.A00(r2, r5, r0, r6, r3)
            android.content.Context r0 = r4.A0H
            r57 = r0
            r24 = r21
            r25 = r21
            r27 = r21
            r29 = r5
            r30 = r21
            r31 = r21
            r32 = r22
            X.3Q2 r10 = X.C59797JYq.A01(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.0qQ.A07(r10)
            r0 = 7
            r10.A0N = r0
            X.1iA r0 = X.1iA.A0a
            r10.A1G = r0
            if (r1 == 0) goto L_0x00c8
            java.lang.String r0 = r10.A3t
            r1.invoke(r0)
        L_0x00c8:
            X.4aP r11 = new X.4aP
            r11.<init>()
            X.4aE r3 = X.C266714aE.VIDEO
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            r6 = 0
            long r0 = r13.toMicros(r6)
            java.lang.String r2 = "main"
            X.4aJ r9 = new X.4aJ
            r9.<init>(r3, r2, r0)
            r12 = 1065353216(0x3f800000, float:1.0)
            r9.A00(r12)
            X.4aH r15 = new X.4aH
            r0 = r20
            r15.<init>(r0)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = r18
            r0 = r16
            X.4aF r0 = X.Pxe.A0V(r14, r2, r0)
            X.Pxg.A1K(r0, r9, r15)
            if (r23 == 0) goto L_0x011e
            X.4aE r2 = X.C266714aE.AUDIO
            long r0 = r13.toMicros(r6)
            java.lang.String r3 = "audio"
            X.4aJ r7 = new X.4aJ
            r7.<init>(r2, r3, r0)
            r7.A00(r12)
            X.4aH r12 = new X.4aH
            r0 = r20
            r12.<init>(r0)
            r2 = r18
            r0 = r16
            X.4aF r0 = X.Pxe.A0V(r14, r2, r0)
            r12.A03 = r0
            X.Pxh.A1F(r11, r7, r12)
        L_0x011e:
            X.Pxf.A1F(r11, r9)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r9 = new com.facebook.videolite.transcoder.base.composition.MediaComposition
            r9.<init>(r11)
            X.S1R r1 = new X.S1R
            r0 = r26
            r1.<init>(r0)
            r4.A0B = r1
            r4.A0A = r10
            X.SFy r0 = X.C64171LRw.A00()
            r4.A08 = r0
            java.lang.Integer r46 = X.AnonymousClass05K.A00
            X.S1Q r1 = new X.S1Q
            r0 = r26
            r1.<init>(r0, r10)
            X.QeG r6 = new X.QeG
            r6.<init>(r1)
            X.SFy r3 = r4.A08
            if (r3 == 0) goto L_0x02dd
            X.S1R r2 = r4.A0B
            if (r2 == 0) goto L_0x02e0
            java.lang.String r1 = r10.A3t
            X.RwU r20 = new X.RwU
            r0 = r20
            r0.<init>(r3, r6, r2, r1)
            java.lang.String r0 = r5.A0k
            r25 = r0
            r55 = 0
            java.util.HashMap r50 = X.Pxf.A0r(r0, r8)
            X.SFy r14 = r4.A08
            if (r14 == 0) goto L_0x02dd
            X.S1R r0 = r4.A0B
            r15 = r0
            if (r0 == 0) goto L_0x02e0
            X.Q1i r13 = new X.Q1i
            r1 = r57
            r0 = r22
            r13.<init>(r1, r0)
            if (r23 == 0) goto L_0x0176
            r55 = 1
        L_0x0176:
            java.io.File r0 = r57.getCacheDir()
            X.SrY r6 = new X.SrY
            r6.<init>(r0)
            X.Q0h r0 = X.C9955RkA.A00
            X.Srw r3 = new X.Srw
            r3.<init>(r0, r8)
            X.Srk r33 = new X.Srk
            r33.<init>()
            X.Srl r7 = new X.Srl
            r7.<init>()
            r7.A00 = r0
            X.Q1f r11 = new X.Q1f
            r11.<init>()
            r8 = r1
            r2 = r21
            r0 = r22
            X.AVr r1 = X.C392569v1.A00(r8, r2, r2, r0)
            X.SsN r0 = new X.SsN
            r0.<init>(r11, r1)
            java.util.HashSet r38 = X.AnonymousClass7TE.A1F()
            X.SFw r29 = new X.SFw
            r30 = r8
            r32 = r6
            r34 = r7
            r35 = r3
            r36 = r2
            r37 = r0
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.SrR r34 = new X.SrR
            r34.<init>()
            X.Ssc r12 = new X.Ssc
            r12.<init>(r4, r4)
            java.lang.String r1 = r5.A0k
            r0 = r58
            int r0 = r0.A0B
            r24 = r0
            r0 = r58
            int r0 = r0.A04
            r23 = r0
            r0 = r22
            X.0qQ.A0B(r1, r0)
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            r2.setDataSource(r1)
            r0 = 24
            java.lang.String r6 = r2.extractMetadata(r0)
            java.lang.String r0 = "90"
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 != 0) goto L_0x01f9
            java.lang.String r0 = "270"
            boolean r0 = X.0qQ.A0K(r6, r0)
            r7 = r24
            r11 = r23
            if (r0 == 0) goto L_0x01fd
        L_0x01f9:
            r11 = r24
            r7 = r23
        L_0x01fd:
            X.SOn r5 = new X.SOn
            r5.<init>()
            X.RRN r8 = r4.A0I
            long r2 = r8.A03
            double r0 = (double) r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 * r2
            int r2 = java.lang.Math.min(r7, r11)
            double r2 = (double) r2
            double r0 = r0 / r2
            double r2 = (double) r7
            double r2 = r2 * r0
            int r7 = (int) r2
            int r2 = r7 % 2
            if (r2 == 0) goto L_0x0219
            int r7 = r7 + 1
        L_0x0219:
            double r2 = (double) r11
            double r0 = r0 * r2
            int r2 = (int) r0
            int r0 = r2 % 2
            if (r0 == 0) goto L_0x0222
            int r2 = r2 + 1
        L_0x0222:
            if (r6 == 0) goto L_0x022a
            int r0 = java.lang.Integer.parseInt(r6)
            r5.A07 = r0
        L_0x022a:
            r5.A0C = r7
            r5.A0A = r2
            r0 = 3000000(0x2dc6c0, float:4.203895E-39)
            r5.A01 = r0
            long r0 = r8.A02
            int r3 = (int) r0
            r5.A02 = r3
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "input_height_px"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "input_width_px"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r23)
            java.lang.String r0 = "original_height_px"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r24)
            java.lang.String r0 = "original_width_px"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r1, r3, r6, r2)
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor.A03(r0)
            X.Rp9 r1 = new X.Rp9
            r1.<init>(r9)
            java.lang.String r2 = r10.A3t
            X.Ssd r3 = r4.A0J
            X.Q1Q r0 = new X.Q1Q
            r4 = r26
            r0.<init>(r4)
            r51 = -1
            X.RzP r23 = new X.RzP
            r26 = r21
            r28 = r21
            r30 = r21
            r32 = r21
            r33 = r21
            r35 = r13
            r36 = r5
            r37 = r21
            r38 = r1
            r39 = r21
            r40 = r21
            r41 = r20
            r42 = r21
            r43 = r12
            r44 = r21
            r45 = r15
            r47 = r21
            r48 = r25
            r49 = r21
            r53 = r51
            r56 = r22
            r24 = r14
            r25 = r21
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r53, r55, r56)
            X.STN r4 = new X.STN
            r5 = r57
            r6 = r0
            r7 = r23
            r8 = r3
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r4.A06()
            long r16 = r16 - r18
            java.lang.String r1 = java.lang.String.valueOf(r16)
            java.lang.String r0 = "input_duration_ms"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            r0 = r58
            int r0 = r0.A03
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "original_duration_ms"
            java.util.LinkedHashMap r0 = X.DbY.A0p(r0, r1, r2)
            com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor.A03(r0)
            goto L_0x000a
        L_0x02dd:
            java.lang.String r0 = "igUploaderConfig"
            goto L_0x02e2
        L_0x02e0:
            java.lang.String r0 = "httpRequestExecutor"
        L_0x02e2:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository$uploadCutoutVideoSticker$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CutoutStickerRepository$uploadCutoutVideoSticker$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
