package com.aiplatform.processors.stickeranything.ig;

import X.02m;
import X.0eP;
import X.0qQ;
import X.1NY;
import X.1OC;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass1QX;
import X.AnonymousClass3Q2;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10392RrT;
import X.C10922S1a;
import X.C11224SFy;
import X.C11770SgH;
import X.C12389Ssd;
import X.C13514Tbj;
import X.C13685Tf2;
import X.C13764Tgc;
import X.C13794ThC;
import X.C266784aL;
import X.C65836M1c;
import X.C8917RFk;
import X.DbS;
import X.DbT;
import X.DbY;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.QNB;
import X.RRD;
import X.RRN;
import X.S1R;
import X.TF1;
import X.TF2;
import X.TI7;
import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class VideoStickerAnythingProcessor extends RRD implements C13794ThC, C13685Tf2, C13514Tbj {
    public int A00 = 1;
    public int A01 = 15;
    public int A02 = 15;
    public RectF A03 = new RectF(1.0E-4f, 1.0E-4f, 0.9999f, 0.9999f);
    public Handler A04;
    public Handler A05;
    public C13764Tgc A06;
    public C10922S1a A07;
    public C11224SFy A08;
    public 1OC A09;
    public AnonymousClass3Q2 A0A;
    public S1R A0B;
    public String A0C;
    public String A0D;
    public boolean A0E = true;
    public boolean A0F;
    public URI A0G;
    public final Context A0H;
    public final RRN A0I;
    public final C12389Ssd A0J;
    public final UserSession A0K;
    public final Queue A0L = Pxe.A1A();
    public final HandlerThread A0M;
    public final HandlerThread A0N;

    public VideoStickerAnythingProcessor(Context context, RRN rrn, UserSession userSession) {
        this.A0H = context;
        this.A0K = userSession;
        this.A0I = rrn;
        HandlerThread A0I2 = Pxf.A0I("polling_thread_segment_anything");
        this.A0M = A0I2;
        HandlerThread A0I3 = Pxf.A0I("creation_timeout_segment_anything");
        this.A0N = A0I3;
        this.A0J = new C12389Ssd(this);
        A0I2.start();
        this.A05 = Pxg.A0N(A0I3);
        this.A04 = Pxf.A0H(A0I2);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C11020S5r r9, com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor r10, X.AnonymousClass4D7 r11, boolean r12) {
        /*
            r3 = 0
            boolean r0 = X.C66140MDs.A01(r3, r11)
            if (r0 == 0) goto L_0x008d
            r7 = r11
            X.MDs r7 = (X.C66140MDs) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008d
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r7.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 != r6) goto L_0x0098
            boolean r12 = r7.A05
            java.lang.Object r9 = r7.A02
            X.S5r r9 = (X.C11020S5r) r9
            java.lang.Object r10 = r7.A01
            com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor r10 = (com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor) r10
            X.0eS.A00(r3)
        L_0x002d:
            X.Kmx r3 = (X.C62821Kmx) r3
            boolean r0 = r3 instanceof X.KS7
            if (r0 == 0) goto L_0x003b
            java.util.List r0 = r9.A01
            A02(r10, r0, r12)
        L_0x0038:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x003b:
            boolean r0 = r3 instanceof X.KS8
            if (r0 == 0) goto L_0x0093
            X.RFk r2 = X.C8917RFk.IGMLSegmentAnythingVideoStatusUploadingMask
            java.lang.String r1 = "Mask bitmap upload failure "
            X.KS8 r3 = (X.KS8) r3
            java.lang.String r0 = r3.A00
            java.lang.String r0 = X.002.A0R(r1, r0)
            r10.Db5(r2, r0)
            goto L_0x0038
        L_0x004f:
            X.0eS.A00(r3)
            X.RFk r1 = X.C8917RFk.IGMLSegmentAnythingVideoStatusUploadingMask
            r10.Db4(r1)
            android.graphics.Bitmap r5 = r9.A00
            if (r5 == 0) goto L_0x0087
            com.instagram.common.session.UserSession r4 = r10.A0K
            android.content.Context r3 = r10.A0H
            r1 = 0
            r0 = 12
            com.instagram.genai.imageservice.service.GenAIImageService r2 = new com.instagram.genai.imageservice.service.GenAIImageService
            r2.<init>(r3, r1, r4, r0)
            java.lang.String r0 = X.C51972G9s.A0n()
            X.0qQ.A0A(r5)
            X.JwE r1 = new X.JwE
            r1.<init>((android.graphics.Bitmap) r5, (java.lang.String) r0)
            X.JwG r0 = new X.JwG
            r0.<init>((X.C61076JwE) r1)
            r7.A01 = r10
            r7.A02 = r9
            r7.A05 = r12
            r7.A00 = r6
            java.lang.Object r3 = r2.FMY(r0, r7)
            if (r3 != r8) goto L_0x002d
            return r8
        L_0x0087:
            java.lang.String r0 = "Mask Bitmap not found"
            r10.Db5(r1, r0)
            goto L_0x0038
        L_0x008d:
            X.MDs r7 = new X.MDs
            r7.<init>(r10, r11, r3)
            goto L_0x0015
        L_0x0093:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0098:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor.A00(X.S5r, com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor, X.4D7, boolean):java.lang.Object");
    }

    public final void AR5(URI uri, JSONObject jSONObject) {
        URI uri2 = uri;
        JSONObject jSONObject2 = jSONObject;
        AnonymousClass7TG.A1N(uri, jSONObject);
        C10392RrT A002 = C266784aL.A00(jSONObject);
        S1R s1r = this.A0B;
        if (s1r != null) {
            s1r.A00(new QNB(this, this.A0K, uri2, jSONObject2, this.A01), A002, AnonymousClass05K.A01, uri, AnonymousClass7TE.A1H());
            this.A01--;
            return;
        }
        0qQ.A0F("httpRequestExecutor");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DBL(String str, URI uri) {
        0qQ.A0B(str, 1);
        0eP A1L = AnonymousClass7TE.A1L("edit_id", str);
        A03(DbY.A0p(AnonymousClass000.A00(88), uri.toString(), A1L));
        this.A0G = uri;
        this.A0C = str;
        this.A00 = 1;
        Db4(C8917RFk.IGMLSegmentAnythingVideoStatusPolling);
        A01(this);
    }

    public final void DBM(String str) {
        0qQ.A0B(str, 0);
        Db5(C8917RFk.IGMLSegmentAnythingVideoStatusRequestingEdit, str);
    }

    public final void Db4(C8917RFk rFk) {
        long j;
        0qQ.A0B(rFk, 0);
        02m.A0p.markerPoint(900937655, rFk.A01);
        Handler handler = this.A05;
        handler.removeCallbacksAndMessages((Object) null);
        TF2 tf2 = new TF2(rFk, this);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (rFk.ordinal() == 7) {
            j = 72;
        } else {
            j = (long) this.A0I.A00;
        }
        handler.postDelayed(tf2, timeUnit.toMillis(j));
    }

    public final void Dge(String str, String str2) {
        0qQ.A0B(str2, 1);
        Db4(C8917RFk.IGMLSegmentAnythingVideoStatusConfigureSticker);
        1NY A0a = AnonymousClass7TG.A0a(this.A0K);
        A0a.A0R = true;
        A0a.A0A("media/configure_to_cutout_sticker/");
        A0a.A0C(AnonymousClass000.A00(815), 6);
        A0a.A9m("upload_id", str2);
        AnonymousClass1QX A0N2 = A0a.A0N();
        if (str != null) {
            A0N2.A02.A01("retry_context", str);
        }
        this.A04.post(new TF1(this, A0N2));
    }

    public final void Dvg(String str) {
        this.A0F = true;
        this.A0D = str;
        this.A05.removeCallbacksAndMessages((Object) null);
        Queue queue = this.A0L;
        if (!queue.isEmpty()) {
            ((Runnable) queue.poll()).run();
        }
    }

    public static final void A01(VideoStickerAnythingProcessor videoStickerAnythingProcessor) {
        URI uri = videoStickerAnythingProcessor.A0G;
        if (uri != null) {
            videoStickerAnythingProcessor.A02--;
            C10922S1a s1a = videoStickerAnythingProcessor.A07;
            if (s1a == null || !uri.equals(s1a.A02)) {
                videoStickerAnythingProcessor.A07 = new C10922S1a(videoStickerAnythingProcessor, new C11770SgH(videoStickerAnythingProcessor, uri), uri);
            }
            C10922S1a s1a2 = videoStickerAnythingProcessor.A07;
            if (s1a2 != null) {
                videoStickerAnythingProcessor.A09 = s1a2.A00();
                videoStickerAnythingProcessor.A04.postDelayed(new C65836M1c(videoStickerAnythingProcessor), (long) (videoStickerAnythingProcessor.A00 * IgNetworkConsentStorage.MAX_ENTRIES));
                return;
            }
            0qQ.A0F("oilDownloadProcess");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A02(VideoStickerAnythingProcessor videoStickerAnythingProcessor, List list, boolean z) {
        String str = videoStickerAnythingProcessor.A0D;
        if (str != null) {
            videoStickerAnythingProcessor.A0D = str;
            Pxf.A0H(videoStickerAnythingProcessor.A0M).post(new TI7(videoStickerAnythingProcessor, list, z));
        }
    }

    public static final void A03(Map map) {
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            02m.A0p.markerAnnotate(900937655, DbT.A13(A1J), DbS.A0s(A1J));
        }
    }

    public final void Db5(C8917RFk rFk, String str) {
        AnonymousClass7TG.A1N(rFk, str);
        A05(rFk);
        02m.A0p.markerEndAtPoint(900937655, 0, 3, rFk.A01);
        this.A05.removeCallbacksAndMessages((Object) null);
        C13764Tgc tgc = this.A06;
        if (tgc != null) {
            tgc.DEg(rFk, str);
        }
    }
}
