package com.instagram.creation.capture.assetpicker.cutout.data;

import X.02m;
import X.0Tu;
import X.0sP;
import X.182;
import X.1OC;
import X.AnonymousClass000;
import X.AnonymousClass43D;
import X.AnonymousClass7TF;
import X.C11039S6r;
import X.C21444Xaw;
import X.C252733pa;
import X.C273654mx;
import X.L9Z;
import android.content.Context;
import android.graphics.Bitmap;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.cutout.services.CutoutStickerUploadService;

public final class CutoutStickerRepository extends C252733pa {
    public Bitmap A00;
    public final Context A01;
    public final UserSession A02;
    public final CutoutStickerUploadService A03;
    public final C21444Xaw A04;
    public final L9Z A05;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME8, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(android.graphics.Bitmap r14, X.1ua r15, java.lang.String r16, java.lang.String r17, X.AnonymousClass4D7 r18) {
        /*
            r13 = this;
            r4 = 1
            r5 = r18
            boolean r0 = X.ME8.A03(r4, r5)
            r8 = r13
            if (r0 == 0) goto L_0x0049
            r3 = r5
            X.ME8 r3 = (X.ME8) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0049
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r2 = r3.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            if (r0 == 0) goto L_0x002a
            if (r0 != r4) goto L_0x0051
            X.0eS.A00(r2)
        L_0x0025:
            X.0eR r2 = (X.0eR) r2
            java.lang.Object r0 = r2.A00
            return r0
        L_0x002a:
            X.0eS.A00(r2)
            X.4Cq r0 = r13.A01
            X.4Cc r0 = r0.ArX()
            r11 = 0
            r12 = 3
            X.JVS r5 = new X.JVS
            r7 = r14
            r6 = r15
            r10 = r16
            r9 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3.A00 = r4
            java.lang.Object r2 = X.1Eo.A00(r3, r0, r5)
            if (r2 != r1) goto L_0x0025
            return r1
        L_0x0049:
            r0 = 42
            X.ME8 r3 = new X.ME8
            r3.<init>(r13, r5, r4, r0)
            goto L_0x0018
        L_0x0051:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository.A00(android.graphics.Bitmap, X.1ua, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutoutStickerRepository(Context context, UserSession userSession) {
        super(C273654mx.A00(2234), AnonymousClass43D.A00(483880845));
        CutoutStickerUploadService cutoutStickerUploadService = new CutoutStickerUploadService(userSession, context);
        C21444Xaw xaw = new C21444Xaw(context, userSession);
        L9Z l9z = new L9Z(context, userSession);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = cutoutStickerUploadService;
        this.A04 = xaw;
        this.A05 = l9z;
    }

    public final void A01() {
        0sP r5;
        L9Z l9z = this.A05;
        if (182.A06(0Tu.A05, l9z.A04, 36320064525115333L)) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = l9z.A01;
            videoStickerAnythingProcessorV2.A01 = 15;
            videoStickerAnythingProcessorV2.A0G = true;
            r5 = null;
            videoStickerAnythingProcessorV2.A0E = null;
            videoStickerAnythingProcessorV2.A0D = null;
            C11039S6r s6r = videoStickerAnythingProcessorV2.A06;
            if (s6r != null) {
                s6r.A00(AnonymousClass000.A00(1328));
            }
            1OC r0 = videoStickerAnythingProcessorV2.A0A;
            if (r0 != null) {
                r0.onCancel();
            }
            videoStickerAnythingProcessorV2.A03.removeCallbacksAndMessages((Object) null);
        } else {
            VideoStickerAnythingProcessor videoStickerAnythingProcessor = l9z.A00;
            videoStickerAnythingProcessor.A02 = 15;
            videoStickerAnythingProcessor.A01 = 15;
            videoStickerAnythingProcessor.A0F = false;
            videoStickerAnythingProcessor.A0E = true;
            videoStickerAnythingProcessor.A0L.clear();
            r5 = null;
            videoStickerAnythingProcessor.A0D = null;
            videoStickerAnythingProcessor.A0C = null;
            VideoStickerAnythingProcessor.A03(AnonymousClass7TF.A0w(AnonymousClass000.A00(537), AnonymousClass000.A00(1328)));
            02m.A0p.markerEnd(900937655, 4);
            1OC r02 = videoStickerAnythingProcessor.A09;
            if (r02 != null) {
                r02.onCancel();
            }
            videoStickerAnythingProcessor.A09 = null;
            videoStickerAnythingProcessor.A04.removeCallbacksAndMessages((Object) null);
            videoStickerAnythingProcessor.A05.removeCallbacksAndMessages((Object) null);
        }
        l9z.A02 = r5;
    }
}
