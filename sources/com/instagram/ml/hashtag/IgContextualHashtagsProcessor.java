package com.instagram.ml.hashtag;

import X.0Cp;
import android.content.Context;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class IgContextualHashtagsProcessor {
    public final 0Cp A00 = new 0Cp(TimeUnit.MINUTES, IgNetworkConsentStorage.MAX_ENTRIES);
    public final Context A01;
    public final UserSession A02;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f A[Catch:{ Exception -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082 A[Catch:{ Exception -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.MSY r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r8 = this;
            r3 = 4
            boolean r0 = X.C66147MDz.A02(r3, r11)
            if (r0 == 0) goto L_0x002c
            r7 = r11
            X.MDz r7 = (X.C66147MDz) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r7.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r5) goto L_0x0032
            java.lang.Object r9 = r7.A03
            X.MSY r9 = (X.MSY) r9
            java.lang.Object r10 = r7.A02
            java.lang.Object r2 = r7.A01
            com.instagram.ml.hashtag.IgContextualHashtagsProcessor r2 = (com.instagram.ml.hashtag.IgContextualHashtagsProcessor) r2
            goto L_0x0066
        L_0x002c:
            X.MDz r7 = new X.MDz
            r7.<init>(r8, r11, r3)
            goto L_0x0015
        L_0x0032:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0037:
            X.0eS.A00(r1)
            X.0Cp r0 = r8.A00
            java.lang.Object r0 = r0.A00(r10)
            if (r0 == 0) goto L_0x004e
            if (r9 == 0) goto L_0x004b
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r9.DV8(r0, r5)
        L_0x004b:
            X.0gF r6 = X.C60340gF.A00
        L_0x004d:
            return r6
        L_0x004e:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r10)     // Catch:{ Exception -> 0x008a }
            com.aiplatform.tools.upload.ig.ImageUploadTool r2 = com.aiplatform.tools.upload.ig.ImageUploadTool.A00     // Catch:{ Exception -> 0x008a }
            X.0qQ.A0A(r3)     // Catch:{ Exception -> 0x008a }
            com.instagram.common.session.UserSession r1 = r8.A02     // Catch:{ Exception -> 0x008a }
            android.content.Context r0 = r8.A01     // Catch:{ Exception -> 0x008a }
            X.C66147MDz.A00(r8, r10, r9, r7, r5)     // Catch:{ Exception -> 0x008a }
            java.lang.Object r1 = r2.A01(r0, r3, r1, r7)     // Catch:{ Exception -> 0x008a }
            if (r1 == r6) goto L_0x004d
            r2 = r8
            goto L_0x0069
        L_0x0066:
            X.0eS.A00(r1)     // Catch:{ Exception -> 0x008a }
        L_0x0069:
            X.Kku r1 = (X.C62694Kku) r1     // Catch:{ Exception -> 0x008a }
            boolean r0 = r1 instanceof X.C60736JqT     // Catch:{ Exception -> 0x008a }
            if (r0 == 0) goto L_0x0082
            X.JqT r1 = (X.C60736JqT) r1     // Catch:{ Exception -> 0x008a }
            java.lang.String r1 = r1.A00     // Catch:{ Exception -> 0x008a }
            X.0Cp r0 = r2.A00     // Catch:{ Exception -> 0x008a }
            r0.A01(r10, r1)     // Catch:{ Exception -> 0x008a }
            if (r9 == 0) goto L_0x004b
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)     // Catch:{ Exception -> 0x008a }
            r9.DV8(r0, r5)     // Catch:{ Exception -> 0x008a }
            goto L_0x004b
        L_0x0082:
            if (r9 == 0) goto L_0x004b
            X.0sn r0 = X.0sn.A00     // Catch:{ Exception -> 0x008a }
            r9.DV8(r0, r4)     // Catch:{ Exception -> 0x008a }
            goto L_0x004b
        L_0x008a:
            if (r9 == 0) goto L_0x004b
            X.0sn r0 = X.0sn.A00
            r9.DV8(r0, r4)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ml.hashtag.IgContextualHashtagsProcessor.A00(X.MSY, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r0 != null) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099 A[Catch:{ Exception -> 0x00d0, all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5 A[Catch:{ Exception -> 0x00d0, all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8 A[Catch:{ Exception -> 0x00d0, all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.MSY r18, java.lang.String r19, X.AnonymousClass4D7 r20, long r21) {
        /*
            r17 = this;
            r3 = r18
            r7 = r19
            r4 = 25
            r5 = r20
            boolean r0 = X.ME0.A02(r4, r5)
            r10 = r17
            if (r0 == 0) goto L_0x0039
            r9 = r5
            X.ME0 r9 = (X.ME0) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0039
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x001e:
            java.lang.Object r1 = r9.A05
            X.1Hj r8 = X.1Hj.A02
            int r0 = r9.A00
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r6) goto L_0x003f
            java.lang.Object r11 = r9.A04
            android.media.MediaMetadataRetriever r11 = (android.media.MediaMetadataRetriever) r11
            java.lang.Object r3 = r9.A03
            X.MSY r3 = (X.MSY) r3
            java.lang.Object r7 = r9.A02
            java.lang.Object r2 = r9.A01
            com.instagram.ml.hashtag.IgContextualHashtagsProcessor r2 = (com.instagram.ml.hashtag.IgContextualHashtagsProcessor) r2
            goto L_0x00ac
        L_0x0039:
            X.ME0 r9 = new X.ME0
            r9.<init>(r10, r5, r4)
            goto L_0x001e
        L_0x003f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0044:
            X.0eS.A00(r1)
            X.0Cp r0 = r10.A00
            java.lang.Object r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x005b
            if (r18 == 0) goto L_0x0058
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r3.DV8(r0, r6)
        L_0x0058:
            X.0gF r8 = X.C60340gF.A00
        L_0x005a:
            return r8
        L_0x005b:
            android.media.MediaMetadataRetriever r11 = new android.media.MediaMetadataRetriever
            r11.<init>()
            r11.setDataSource(r7)     // Catch:{ Exception -> 0x00d0 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r12 = r21 * r0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00d0 }
            r5 = 0
            r0 = 30
            if (r1 < r0) goto L_0x0083
            r14 = 2
            r15 = 720(0x2d0, float:1.009E-42)
            r16 = r15
            android.graphics.Bitmap r0 = r11.getScaledFrameAtTime(r12, r14, r15, r16)     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x0097
        L_0x0079:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x00d0 }
            android.graphics.Bitmap r5 = r0.copy(r1, r6)     // Catch:{ Exception -> 0x00d0 }
            r0.recycle()     // Catch:{ Exception -> 0x00d0 }
            goto L_0x0097
        L_0x0083:
            r0 = 2
            android.graphics.Bitmap r2 = r11.getFrameAtTime(r12, r0)     // Catch:{ Exception -> 0x00d0 }
            if (r2 == 0) goto L_0x0097
            r1 = 1144258560(0x44340000, float:720.0)
            float r0 = X.JTO.A02(r2)     // Catch:{ Exception -> 0x00d0 }
            float r0 = r1 / r0
            android.graphics.Bitmap r0 = X.JTT.A0C(r2, r1, r0)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x0079
        L_0x0097:
            if (r5 == 0) goto L_0x00d7
            com.aiplatform.tools.upload.ig.ImageUploadTool r2 = com.aiplatform.tools.upload.ig.ImageUploadTool.A00     // Catch:{ Exception -> 0x00d0 }
            com.instagram.common.session.UserSession r1 = r10.A02     // Catch:{ Exception -> 0x00d0 }
            android.content.Context r0 = r10.A01     // Catch:{ Exception -> 0x00d0 }
            X.ME0.A00(r10, r7, r3, r11, r9)     // Catch:{ Exception -> 0x00d0 }
            r9.A00 = r6     // Catch:{ Exception -> 0x00d0 }
            java.lang.Object r1 = r2.A01(r0, r5, r1, r9)     // Catch:{ Exception -> 0x00d0 }
            if (r1 == r8) goto L_0x005a
            r2 = r10
            goto L_0x00af
        L_0x00ac:
            X.0eS.A00(r1)     // Catch:{ Exception -> 0x00d0 }
        L_0x00af:
            X.Kku r1 = (X.C62694Kku) r1     // Catch:{ Exception -> 0x00d0 }
            boolean r0 = r1 instanceof X.C60736JqT     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x00c8
            X.JqT r1 = (X.C60736JqT) r1     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r1 = r1.A00     // Catch:{ Exception -> 0x00d0 }
            X.0Cp r0 = r2.A00     // Catch:{ Exception -> 0x00d0 }
            r0.A01(r7, r1)     // Catch:{ Exception -> 0x00d0 }
            if (r3 == 0) goto L_0x00d7
            java.util.List r0 = X.AnonymousClass7TE.A1I(r1)     // Catch:{ Exception -> 0x00d0 }
            r3.DV8(r0, r6)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00d7
        L_0x00c8:
            if (r3 == 0) goto L_0x00d7
            X.0sn r0 = X.0sn.A00     // Catch:{ Exception -> 0x00d0 }
            r3.DV8(r0, r4)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00d7
        L_0x00d0:
            if (r3 == 0) goto L_0x00d7
            X.0sn r0 = X.0sn.A00     // Catch:{ all -> 0x00dc }
            r3.DV8(r0, r4)     // Catch:{ all -> 0x00dc }
        L_0x00d7:
            r11.release()
            goto L_0x0058
        L_0x00dc:
            r0 = move-exception
            r11.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ml.hashtag.IgContextualHashtagsProcessor.A01(X.MSY, java.lang.String, X.4D7, long):java.lang.Object");
    }

    public IgContextualHashtagsProcessor(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
    }
}
