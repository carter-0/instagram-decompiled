package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import java.net.URI;
import java.util.Queue;
import org.json.JSONObject;

/* renamed from: X.SgG  reason: case insensitive filesystem */
public final class C11769SgG implements C13794ThC, C13685Tf2 {
    public int A00 = 15;
    public boolean A01;
    public final C10963S2v A02;
    public final RRD A03;
    public final RRN A04;
    public final C11039S6r A05;
    public final C10155RnW A06;
    public final Integer A07;
    public final Queue A08 = Pxe.A1A();

    public final void AR5(URI uri, JSONObject jSONObject) {
        URI uri2 = uri;
        JSONObject jSONObject2 = jSONObject;
        AnonymousClass7TG.A1N(uri, jSONObject);
        RRD rrd = this.A03;
        int i = this.A00;
        if (rrd instanceof VideoStickerAnythingProcessorV2) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = (VideoStickerAnythingProcessorV2) rrd;
            C10392RrT A002 = C266784aL.A00(jSONObject);
            S1R s1r = videoStickerAnythingProcessorV2.A0C;
            if (s1r != null) {
                s1r.A00(new QNA(videoStickerAnythingProcessorV2.A05, videoStickerAnythingProcessorV2.A06, uri2, jSONObject2, i), A002, AnonymousClass05K.A01, uri, AnonymousClass7TE.A1H());
            } else {
                0qQ.A0F("httpRequestExecutor");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        this.A00--;
    }

    public final void DBL(String str, URI uri) {
        0qQ.A0B(str, 1);
        C11039S6r s6r = this.A05;
        0eP A1L = AnonymousClass7TE.A1L("edit_id", new QGF(str));
        s6r.A03(DbY.A0p(AnonymousClass000.A00(88), new QGF(DbT.A10(uri)), A1L));
        Db4(C8917RFk.IGMLSegmentAnythingVideoStatusPolling);
        RRD rrd = this.A03;
        if (rrd instanceof VideoStickerAnythingProcessorV2) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = (VideoStickerAnythingProcessorV2) rrd;
            videoStickerAnythingProcessorV2.A0F = uri;
            videoStickerAnythingProcessorV2.A0D = str;
            VideoStickerAnythingProcessorV2.A01(videoStickerAnythingProcessorV2);
        }
    }

    public final void DBM(String str) {
        0qQ.A0B(str, 0);
        Db5(C8917RFk.IGMLSegmentAnythingVideoStatusRequestingEdit, str);
    }

    public final void Db4(C8917RFk rFk) {
        0qQ.A0B(rFk, 0);
        this.A05.A02(rFk.A01, TTj.A00);
    }

    public final void Dvg(String str) {
        this.A01 = true;
        RRD rrd = this.A03;
        if (rrd instanceof VideoStickerAnythingProcessorV2) {
            ((VideoStickerAnythingProcessorV2) rrd).A0E = str;
        }
        this.A05.A02("upload_finish", TTk.A00);
        Queue queue = this.A08;
        if (!queue.isEmpty()) {
            ((Runnable) queue.poll()).run();
        }
    }

    public final void A00(S5Q s5q, 0sP r4, 0sP r5) {
        Queue queue = this.A08;
        if (!queue.isEmpty()) {
            return;
        }
        if (!this.A01) {
            queue.add(new TJU(s5q, this, r4, r5));
        } else {
            this.A02.A00(s5q, r4, r5);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.Srl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r35v1, types: [X.Tfv, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01e0, code lost:
        if (X.0qQ.A0K(r8, "270") != false) goto L_0x01e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Object r62, X.0sP r63, long r64, long r66, boolean r68) {
        /*
            r61 = this;
            r16 = r66
            r7 = r62
            r23 = 0
            r0 = r23
            X.0qQ.A0B(r7, r0)
            r60 = r61
            r1 = r60
            r1.A01 = r0
            X.RnW r4 = r1.A06
            X.S6r r5 = r1.A05
            X.TTl r8 = X.TTl.A00
            r0 = r23
            X.0qQ.A0B(r8, r0)
            X.S1Z r0 = r5.A02
            r59 = r0
            X.4Cq r1 = r0.A02
            r22 = 0
            r6 = 15
            X.Pxi.A1J(r0, r1, r6)
            long r2 = r5.A01
            java.util.concurrent.ExecutorService r1 = r5.A03
            X.TJT r0 = new X.TJT
            r9 = r0
            r10 = r59
            r11 = r5
            r12 = r8
            r13 = r2
            r9.<init>(r10, r11, r12, r13)
            r1.execute(r0)
            java.lang.String r1 = "upload_start"
            X.TTm r0 = X.C13287TTm.A00
            r5.A02(r1, r0)
            X.RRD r2 = r4.A00
            boolean r0 = r2 instanceof com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2
            if (r0 == 0) goto L_0x030c
            com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2 r2 = (com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2) r2
            com.instagram.common.gallery.Medium r7 = (com.instagram.common.gallery.Medium) r7
            r2.A01 = r6
            r11 = 1
            r2.A0G = r11
            r0 = r22
            r2.A0E = r0
            r2.A0D = r0
            X.1OC r0 = r2.A0A
            if (r0 == 0) goto L_0x005f
            r0.onCancel()
        L_0x005f:
            int r1 = r7.A0B
            int r0 = r7.A04
            X.7zv r8 = new X.7zv
            r8.<init>(r7, r1, r0, r11)
            java.lang.String r0 = r8.A0k
            java.io.File r21 = X.AnonymousClass7TE.A0t(r0)
            int r4 = r8.A0K
            int r3 = r8.A08
            com.instagram.common.session.UserSession r0 = r2.A0L
            r40 = r0
            r1 = r0
            r0 = r22
            com.instagram.pendingmedia.model.ClipInfo r28 = X.AnonymousClass9T4.A00(r1, r8, r0, r4, r3)
            android.content.Context r0 = r2.A0H
            r58 = r0
            r24 = r22
            r25 = r22
            r26 = r1
            r27 = r22
            r29 = r8
            r30 = r22
            r31 = r22
            r32 = r23
            X.3Q2 r9 = X.C59797JYq.A01(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.0qQ.A07(r9)
            r0 = 7
            r9.A0N = r0
            X.1iA r0 = X.1iA.A0a
            r9.A1G = r0
            r1 = r63
            if (r63 == 0) goto L_0x00a8
            java.lang.String r0 = r9.A3t
            r1.invoke(r0)
        L_0x00a8:
            X.4aP r15 = new X.4aP
            r15.<init>()
            X.4aE r3 = X.C266714aE.VIDEO
            java.util.concurrent.TimeUnit r20 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 0
            r0 = r20
            long r0 = r0.toMicros(r5)
            java.lang.String r4 = "main"
            X.4aJ r10 = new X.4aJ
            r10.<init>(r3, r4, r0)
            r12 = 1065353216(0x3f800000, float:1.0)
            r10.A00(r12)
            X.4aH r14 = new X.4aH
            r0 = r21
            r14.<init>(r0)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            r18 = r64
            r3 = r18
            r0 = r16
            X.4aF r0 = X.Pxe.A0V(r13, r3, r0)
            X.Pxg.A1K(r0, r10, r14)
            if (r68 == 0) goto L_0x0104
            X.4aE r3 = X.C266714aE.AUDIO
            r0 = r20
            long r0 = r0.toMicros(r5)
            java.lang.String r4 = "audio"
            X.4aJ r5 = new X.4aJ
            r5.<init>(r3, r4, r0)
            r5.A00(r12)
            X.4aH r12 = new X.4aH
            r0 = r21
            r12.<init>(r0)
            r3 = r18
            r0 = r16
            X.4aF r0 = X.Pxe.A0V(r13, r3, r0)
            r12.A03 = r0
            X.Pxh.A1F(r15, r5, r12)
        L_0x0104:
            X.Pxf.A1F(r15, r10)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r12 = new com.facebook.videolite.transcoder.base.composition.MediaComposition
            r12.<init>(r15)
            X.S1R r1 = new X.S1R
            r0 = r40
            r1.<init>(r0)
            r2.A0C = r1
            r2.A0B = r9
            X.SFy r0 = X.C64171LRw.A00()
            r2.A09 = r0
            java.lang.Integer r47 = X.AnonymousClass05K.A00
            X.S1Q r1 = new X.S1Q
            r0 = r40
            r1.<init>(r0, r9)
            X.QeG r5 = new X.QeG
            r5.<init>(r1)
            X.SFy r4 = r2.A09
            if (r4 == 0) goto L_0x0343
            X.S1R r3 = r2.A0C
            if (r3 == 0) goto L_0x0340
            java.lang.String r1 = r9.A3t
            X.RwU r21 = new X.RwU
            r0 = r21
            r0.<init>(r4, r5, r3, r1)
            java.lang.String r0 = r8.A0k
            r26 = r0
            r56 = 0
            java.util.HashMap r51 = X.Pxf.A0r(r0, r11)
            X.SFy r15 = r2.A09
            if (r15 == 0) goto L_0x0343
            X.S1R r0 = r2.A0C
            r20 = r0
            if (r0 == 0) goto L_0x0340
            X.Q1i r14 = new X.Q1i
            r1 = r58
            r0 = r23
            r14.<init>(r1, r0)
            if (r68 == 0) goto L_0x015d
            r56 = 1
        L_0x015d:
            java.io.File r0 = r58.getCacheDir()
            X.SrY r5 = new X.SrY
            r5.<init>(r0)
            X.Q0h r0 = X.C9955RkA.A00
            X.Srw r4 = new X.Srw
            r4.<init>(r0, r11)
            X.Srk r34 = new X.Srk
            r34.<init>()
            X.Srl r6 = new X.Srl
            r6.<init>()
            r6.A00 = r0
            X.Q1f r11 = new X.Q1f
            r11.<init>()
            r10 = r1
            r3 = r22
            r0 = r23
            X.AVr r1 = X.C392569v1.A00(r10, r3, r3, r0)
            X.SsN r0 = new X.SsN
            r0.<init>(r11, r1)
            java.util.HashSet r39 = X.AnonymousClass7TE.A1F()
            X.SFw r30 = new X.SFw
            r31 = r10
            r32 = r3
            r33 = r5
            r35 = r6
            r36 = r4
            r37 = r3
            r38 = r0
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.SrR r35 = new X.SrR
            r35.<init>()
            X.ThC r1 = r2.A05
            X.Tf2 r0 = r2.A07
            X.Ssc r13 = new X.Ssc
            r13.<init>(r1, r0)
            java.lang.String r1 = r8.A0k
            int r0 = r7.A0B
            r25 = r0
            int r0 = r7.A04
            r24 = r0
            r0 = r23
            X.0qQ.A0B(r1, r0)
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r0.setDataSource(r1)
            r1 = 24
            java.lang.String r8 = r0.extractMetadata(r1)
            java.lang.String r0 = "90"
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 != 0) goto L_0x01e2
            java.lang.String r0 = "270"
            boolean r0 = X.0qQ.A0K(r8, r0)
            r6 = r25
            r11 = r24
            if (r0 == 0) goto L_0x01e6
        L_0x01e2:
            r11 = r25
            r6 = r24
        L_0x01e6:
            X.SOn r5 = new X.SOn
            r5.<init>()
            X.RRN r10 = r2.A0J
            long r3 = r10.A03
            double r0 = (double) r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 * r3
            int r3 = java.lang.Math.min(r6, r11)
            double r3 = (double) r3
            double r0 = r0 / r3
            double r3 = (double) r6
            double r3 = r3 * r0
            int r6 = (int) r3
            int r3 = r6 % 2
            if (r3 == 0) goto L_0x0202
            int r6 = r6 + 1
        L_0x0202:
            double r3 = (double) r11
            double r0 = r0 * r3
            int r3 = (int) r0
            int r0 = r3 % 2
            if (r0 == 0) goto L_0x020b
            int r3 = r3 + 1
        L_0x020b:
            if (r8 == 0) goto L_0x0213
            int r0 = java.lang.Integer.parseInt(r8)
            r5.A07 = r0
        L_0x0213:
            r5.A0C = r6
            r5.A0A = r3
            r0 = 3000000(0x2dc6c0, float:4.203895E-39)
            r5.A01 = r0
            long r0 = r10.A02
            int r4 = (int) r0
            r5.A02 = r4
            X.S6r r4 = r2.A06
            if (r4 == 0) goto L_0x026a
            java.lang.String r0 = java.lang.String.valueOf(r6)
            X.QGF r1 = new X.QGF
            r1.<init>(r0)
            java.lang.String r0 = "input_height_px"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            X.QGF r1 = new X.QGF
            r1.<init>(r0)
            java.lang.String r0 = "input_width_px"
            X.0eP r8 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r24)
            X.QGF r1 = new X.QGF
            r1.<init>(r0)
            java.lang.String r0 = "original_height_px"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r25)
            X.QGF r1 = new X.QGF
            r1.<init>(r0)
            java.lang.String r0 = "original_width_px"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r1, r6, r8, r3)
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            r4.A03(r0)
        L_0x026a:
            X.Rp9 r3 = new X.Rp9
            r3.<init>(r12)
            java.lang.String r4 = r9.A3t
            X.Sse r1 = r2.A0K
            X.Q1Q r0 = new X.Q1Q
            r6 = r40
            r0.<init>(r6)
            r52 = -1
            X.RzP r24 = new X.RzP
            r28 = r22
            r29 = r22
            r31 = r22
            r33 = r22
            r34 = r22
            r36 = r14
            r37 = r5
            r38 = r22
            r39 = r3
            r40 = r22
            r41 = r22
            r42 = r21
            r43 = r22
            r44 = r13
            r45 = r22
            r46 = r20
            r48 = r22
            r49 = r26
            r50 = r22
            r54 = r52
            r57 = r23
            r25 = r15
            r26 = r22
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r56, r57)
            X.STN r8 = new X.STN
            r9 = r58
            r10 = r0
            r11 = r24
            r12 = r1
            r13 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            r8.A06()
            X.S6r r4 = r2.A06
            if (r4 == 0) goto L_0x02d4
            long r16 = r66 - r64
            java.lang.String r0 = java.lang.String.valueOf(r16)
            X.QGF r3 = new X.QGF
            r3.<init>(r0)
            java.lang.String r1 = "input_duration_ms"
            X.S1Z r0 = r4.A02
            r0.A00(r3, r1)
        L_0x02d4:
            X.S6r r3 = r2.A06
            if (r3 == 0) goto L_0x02eb
            int r0 = r7.A03
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.QGF r2 = new X.QGF
            r2.<init>(r0)
            java.lang.String r1 = "original_duration_ms"
            X.S1Z r0 = r3.A02
            r0.A00(r2, r1)
        L_0x02eb:
            r0 = r60
            java.lang.Integer r0 = r0.A07
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0309
            java.lang.String r0 = "AUTODUBBING"
        L_0x02f7:
            java.lang.String r0 = X.AnonymousClass7TF.A0j(r0)
            X.QGF r2 = new X.QGF
            r2.<init>(r0)
            java.lang.String r1 = "use_case"
            r0 = r59
            r0.A00(r2, r1)
            return
        L_0x0309:
            java.lang.String r0 = "STICKER_ANYTHING"
            goto L_0x02f7
        L_0x030c:
            boolean r0 = r2 instanceof com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor
            if (r0 != 0) goto L_0x0348
            X.QGH r2 = (X.QGH) r2
            X.3Q2 r7 = (X.AnonymousClass3Q2) r7
            java.lang.String r4 = r7.A3t
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            X.QGF r1 = new X.QGF
            r1.<init>(r4)
            java.lang.String r0 = "upload_id"
            r3.put(r0, r1)
            X.S6r r0 = r2.A02
            if (r0 == 0) goto L_0x032c
            r0.A03(r3)
        L_0x032c:
            X.3QD r1 = r7.A1f
            X.3QD r0 = X.AnonymousClass3QD.UPLOADED
            if (r1 == r0) goto L_0x0336
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            if (r1 != r0) goto L_0x02eb
        L_0x0336:
            if (r4 == 0) goto L_0x02eb
            X.ThC r0 = r2.A01
            if (r0 == 0) goto L_0x02eb
            r0.Dvg(r4)
            goto L_0x02eb
        L_0x0340:
            java.lang.String r0 = "httpRequestExecutor"
            goto L_0x0345
        L_0x0343:
            java.lang.String r0 = "igUploaderConfig"
        L_0x0345:
            X.0qQ.A0F(r0)
        L_0x0348:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11769SgG.A01(java.lang.Object, X.0sP, long, long, boolean):void");
    }

    public C11769SgG(RRN rrn, RRD rrd, Integer num) {
        this.A03 = rrd;
        this.A04 = rrn;
        this.A07 = num;
        C11039S6r s6r = new C11039S6r(((long) rrn.A00) * 1000);
        this.A05 = s6r;
        this.A02 = new C10963S2v(rrn, s6r, rrd);
        this.A06 = new C10155RnW(rrd);
        boolean z = rrd instanceof VideoStickerAnythingProcessorV2;
        if (z) {
            ((VideoStickerAnythingProcessorV2) rrd).A06 = s6r;
        } else {
            if (!(rrd instanceof VideoStickerAnythingProcessor)) {
                ((QGH) rrd).A02 = s6r;
            }
            throw AnonymousClass00P.createAndThrow();
        }
        if (z) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = (VideoStickerAnythingProcessorV2) rrd;
            videoStickerAnythingProcessorV2.A05 = this;
            videoStickerAnythingProcessorV2.A07 = this;
            return;
        }
        if (!(rrd instanceof VideoStickerAnythingProcessor)) {
            QGH qgh = (QGH) rrd;
            qgh.A01 = this;
            qgh.A03 = this;
            return;
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Db5(C8917RFk rFk, String str) {
        C13764Tgc tgc;
        AnonymousClass7TG.A1N(rFk, str);
        RRD rrd = this.A03;
        rrd.A05(rFk);
        this.A05.A01(rFk.A01);
        if (rrd instanceof VideoStickerAnythingProcessorV2) {
            tgc = ((VideoStickerAnythingProcessorV2) rrd).A04;
        } else if (rrd instanceof VideoStickerAnythingProcessor) {
            tgc = ((VideoStickerAnythingProcessor) rrd).A06;
        } else {
            return;
        }
        if (tgc != null) {
            tgc.DEg(rFk, str);
        }
    }
}
