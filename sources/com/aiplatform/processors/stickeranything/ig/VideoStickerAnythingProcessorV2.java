package com.aiplatform.processors.stickeranything.ig;

import X.0qQ;
import X.1NY;
import X.1OC;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass1QX;
import X.AnonymousClass3Q2;
import X.AnonymousClass7TG;
import X.C10922S1a;
import X.C11039S6r;
import X.C11224SFy;
import X.C12390Sse;
import X.C12854TAu;
import X.C13288TTn;
import X.C13514Tbj;
import X.C13685Tf2;
import X.C13764Tgc;
import X.C13794ThC;
import X.Pxf;
import X.Pxg;
import X.RRD;
import X.RRN;
import X.S1R;
import X.SgI;
import X.TF4;
import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import java.net.URI;

public final class VideoStickerAnythingProcessorV2 extends RRD implements C13514Tbj {
    public int A00 = 1;
    public int A01 = 15;
    public RectF A02 = new RectF(1.0E-4f, 1.0E-4f, 0.9999f, 0.9999f);
    public Handler A03;
    public C13764Tgc A04;
    public C13794ThC A05;
    public C11039S6r A06;
    public C13685Tf2 A07;
    public C10922S1a A08;
    public C11224SFy A09;
    public 1OC A0A;
    public AnonymousClass3Q2 A0B;
    public S1R A0C;
    public String A0D;
    public String A0E;
    public URI A0F;
    public boolean A0G = true;
    public final Context A0H;
    public final HandlerThread A0I;
    public final RRN A0J;
    public final C12390Sse A0K;
    public final UserSession A0L;

    public VideoStickerAnythingProcessorV2(Context context, RRN rrn, UserSession userSession) {
        this.A0H = context;
        this.A0L = userSession;
        this.A0J = rrn;
        HandlerThread A0I2 = Pxf.A0I("polling_thread_segment_anything");
        this.A0I = A0I2;
        this.A0K = new C12390Sse(this);
        this.A03 = Pxg.A0N(A0I2);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C11020S5r r9, com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2 r10, X.AnonymousClass4D7 r11, boolean r12) {
        /*
            r7 = 1
            boolean r0 = X.C66140MDs.A01(r7, r11)
            if (r0 == 0) goto L_0x009c
            r6 = r11
            X.MDs r6 = (X.C66140MDs) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0052
            if (r0 != r7) goto L_0x00a3
            boolean r12 = r6.A05
            java.lang.Object r9 = r6.A02
            X.S5r r9 = (X.C11020S5r) r9
            java.lang.Object r10 = r6.A01
            com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2 r10 = (com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2) r10
            X.0eS.A00(r1)
        L_0x002c:
            boolean r0 = r1 instanceof X.KS7
            if (r0 == 0) goto L_0x0049
            java.util.List r2 = r9.A01
            java.lang.String r0 = r10.A0E
            if (r0 == 0) goto L_0x0046
            r10.A0E = r0
            android.os.HandlerThread r0 = r10.A0I
            android.os.Handler r1 = X.Pxf.A0H(r0)
            X.TI8 r0 = new X.TI8
            r0.<init>(r10, r2, r12)
            r1.post(r0)
        L_0x0046:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x0049:
            boolean r0 = r1 instanceof X.KS8
            if (r0 != 0) goto L_0x0091
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0052:
            X.0eS.A00(r1)
            X.S6r r2 = r10.A06
            if (r2 == 0) goto L_0x0061
            java.lang.String r1 = "upload_mask_start"
            X.TTr r0 = X.C13292TTr.A00
            r2.A02(r1, r0)
        L_0x0061:
            android.graphics.Bitmap r5 = r9.A00
            if (r5 == 0) goto L_0x0091
            com.instagram.common.session.UserSession r4 = r10.A0L
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
            r6.A01 = r10
            r6.A02 = r9
            r6.A05 = r12
            r6.A00 = r7
            java.lang.Object r1 = r2.FMY(r0, r6)
            if (r1 != r8) goto L_0x002c
            return r8
        L_0x0091:
            X.S6r r1 = r10.A06
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = "upload_mask_start"
            r1.A01(r0)
            goto L_0x0046
        L_0x009c:
            X.MDs r6 = new X.MDs
            r6.<init>(r10, r11, r7)
            goto L_0x0015
        L_0x00a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2.A00(X.S5r, com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2, X.4D7, boolean):java.lang.Object");
    }

    public final void Dge(String str, String str2) {
        0qQ.A0B(str2, 1);
        C11039S6r s6r = this.A06;
        if (s6r != null) {
            s6r.A02("configure_sticker_start", C13288TTn.A00);
        }
        1NY A0a = AnonymousClass7TG.A0a(this.A0L);
        A0a.A0R = true;
        A0a.A0A("media/configure_to_cutout_sticker/");
        A0a.A0C(AnonymousClass000.A00(815), 6);
        A0a.A9m("upload_id", str2);
        AnonymousClass1QX A0N = A0a.A0N();
        if (str != null) {
            A0N.A02.A01("retry_context", str);
        }
        this.A03.post(new TF4(this, A0N));
    }

    public static final void A01(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2) {
        URI uri = videoStickerAnythingProcessorV2.A0F;
        if (uri != null) {
            videoStickerAnythingProcessorV2.A01--;
            C10922S1a s1a = videoStickerAnythingProcessorV2.A08;
            if (s1a == null || !uri.equals(s1a.A02)) {
                videoStickerAnythingProcessorV2.A08 = new C10922S1a(videoStickerAnythingProcessorV2.A07, new SgI(videoStickerAnythingProcessorV2, uri), uri);
            }
            C10922S1a s1a2 = videoStickerAnythingProcessorV2.A08;
            if (s1a2 != null) {
                videoStickerAnythingProcessorV2.A0A = s1a2.A00();
                videoStickerAnythingProcessorV2.A03.postDelayed(new C12854TAu(videoStickerAnythingProcessorV2), (long) (videoStickerAnythingProcessorV2.A00 * IgNetworkConsentStorage.MAX_ENTRIES));
                return;
            }
            0qQ.A0F("oilDownloadProcess");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
