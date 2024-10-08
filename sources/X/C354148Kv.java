package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;

/* renamed from: X.8Kv  reason: invalid class name and case insensitive filesystem */
public final class C354148Kv {
    public final Context A00;
    public final UserSession A01;
    public final TargetViewSizeProvider A02;
    public final CachingVideoSaver A03;
    public final AnonymousClass8KN A04;
    public final C262224Cq A05;
    public final AnonymousClass12T A06;
    public final 0nV A07;

    public C354148Kv(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, CachingVideoSaver cachingVideoSaver, AnonymousClass8KN r8) {
        0qQ.A0B(targetViewSizeProvider, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = targetViewSizeProvider;
        this.A04 = r8;
        this.A03 = cachingVideoSaver;
        AnonymousClass12T r1 = AnonymousClass12T.A00;
        this.A06 = r1;
        0nV CO6 = r1.CO6(460, 3);
        this.A07 = CO6;
        this.A05 = 19E.A02(CO6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e3, code lost:
        if (r0 != null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013c, code lost:
        if (r0 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0150, code lost:
        if (r0 != null) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0181, code lost:
        if (r0 != null) goto L_0x0158;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.LBC A00(android.graphics.Bitmap r23, android.graphics.Bitmap r24, com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r25, X.C364758lx r26, X.C354148Kv r27, X.C352218Cl r28, java.lang.String r29, boolean r30, boolean r31, boolean r32) {
        /*
            r15 = r24
            r4 = 0
            r0 = r26
            r1 = r27
            r2 = r28
            if (r26 == 0) goto L_0x01cd
            com.instagram.camera.effect.models.CameraAREffect r3 = r0.A01
            if (r3 == 0) goto L_0x01ce
            android.content.Context r12 = r1.A00
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r5 = r1.A02
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r5 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r5
            X.81W r5 = r5.A0K
            int r10 = r5.getWidth()
            int r9 = r5.getHeight()
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r8 = r0.A03
            com.instagram.common.session.UserSession r11 = r1.A01
            r7 = 1
            X.0qQ.A0B(r2, r7)
            int r5 = r2.A07
            int r6 = r2.A09
            int r14 = r2.A06
            int r13 = r5 % 180
            r5 = r14
            if (r13 != 0) goto L_0x0034
            r5 = r6
            r6 = r14
        L_0x0034:
            r20 = 0
            if (r6 <= r5) goto L_0x003a
            r20 = 1
        L_0x003a:
            boolean r21 = X.C343127pi.A00(r12)
            r16 = r12
            r17 = r11
            r18 = r5
            r19 = r6
            android.graphics.Point r5 = X.AEW.A02(r16, r17, r18, r19, r20, r21)
            int r6 = r5.x
            int r5 = r5.y
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r5 = X.C364738lv.A00(r6, r5, r10, r9, r7)
            if (r8 == 0) goto L_0x005b
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r7 = r8.A08
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r6 = r5.A08
            r6.A00(r7)
        L_0x005b:
            r5.A03()
        L_0x005e:
            if (r24 != 0) goto L_0x00c2
            java.lang.String r13 = r2.A06()
            if (r3 != 0) goto L_0x01c7
            android.content.Context r7 = r1.A00
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r6 = r1.A02
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r6 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r6
            X.81W r6 = r6.A0K
            int r9 = r6.getWidth()
            int r10 = r6.getHeight()
            int r6 = r2.A07
            int r6 = r6 % 180
            r11 = 0
            if (r6 != 0) goto L_0x007e
            r11 = 1
        L_0x007e:
            com.instagram.common.session.UserSession r6 = r1.A01
            boolean r12 = X.C343127pi.A00(r7)
            r8 = r6
            android.graphics.Point r11 = X.AEW.A02(r7, r8, r9, r10, r11, r12)
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            int r6 = r2.A09
            float r7 = (float) r6
            int r6 = r2.A06
            float r6 = (float) r6
            r12 = 0
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>(r12, r12, r7, r6)
            int r6 = r11.x
            float r8 = (float) r6
            int r6 = r11.y
            float r6 = (float) r6
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r12, r12, r8, r6)
            android.graphics.Matrix$ScaleToFit r6 = android.graphics.Matrix.ScaleToFit.CENTER
            r10.setRectToRect(r9, r7, r6)
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeFile(r13)
            if (r9 != 0) goto L_0x01a2
            r15 = 0
        L_0x00b1:
            if (r15 != 0) goto L_0x00c2
            java.lang.String r7 = "created mediaBitmapForRendering is null, postCaptureAREffect.id = "
            if (r3 == 0) goto L_0x019f
            java.lang.String r6 = r3.A0K
        L_0x00b9:
            java.lang.String r7 = X.002.A0R(r7, r6)
            java.lang.String r6 = "PhotoToVideoSaver"
            X.0kD.A07(r6, r7, r4)
        L_0x00c2:
            r22 = r29
            r28 = r30
            r26 = r31
            r27 = r32
            r12 = r25
            X.ADT r13 = X.ADT.A00
            android.content.Context r14 = r1.A00
            if (r29 == 0) goto L_0x013f
            com.instagram.common.session.UserSession r8 = r1.A01
            r7 = 0
            if (r0 == 0) goto L_0x00e1
            java.util.LinkedHashMap r6 = r0.A07
            if (r6 == 0) goto L_0x00e1
            java.util.Set r24 = r6.keySet()
            if (r24 != 0) goto L_0x00e5
        L_0x00e1:
            X.0sl r24 = X.0sl.A00
            if (r0 == 0) goto L_0x013c
        L_0x00e5:
            X.8PW r6 = r0.A05
            if (r6 == 0) goto L_0x013c
            java.util.LinkedHashMap r4 = r6.A09
        L_0x00eb:
            com.instagram.camera.effect.models.CameraAREffect r7 = r0.A01
        L_0x00ed:
            X.8KN r6 = r1.A04
            X.L83 r20 = r6.A00()
            if (r0 == 0) goto L_0x013a
            int r6 = r0.A00
        L_0x00f7:
            r23 = r4
            r25 = r6
            r17 = r7
            r18 = r8
        L_0x00ff:
            r19 = r5
            r21 = r2
            r16 = r12
            X.LBC r7 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.3Q2 r6 = r7.A06
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r1.A02
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r1 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r1
            X.81W r5 = r1.A0K
            int r1 = r5.getWidth()
            float r4 = (float) r1
            int r1 = r5.getHeight()
            float r1 = (float) r1
            float r4 = r4 / r1
            r6.A02 = r4
            if (r3 != 0) goto L_0x0139
            r1 = 1
            r6.A5z = r1
            if (r0 == 0) goto L_0x0129
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r0.A03
            if (r0 != 0) goto L_0x0137
        L_0x0129:
            int r3 = r5.getWidth()
            int r1 = r5.getHeight()
            r0 = 1065353216(0x3f800000, float:1.0)
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = X.C364738lv.A02(r2, r0, r3, r1)
        L_0x0137:
            r6.A16 = r0
        L_0x0139:
            return r7
        L_0x013a:
            r6 = 0
            goto L_0x00f7
        L_0x013c:
            if (r0 == 0) goto L_0x00ed
            goto L_0x00eb
        L_0x013f:
            com.instagram.common.session.UserSession r11 = r1.A01
            r9 = 0
            if (r0 == 0) goto L_0x014e
            java.util.LinkedHashMap r6 = r0.A07
            if (r6 == 0) goto L_0x014e
            java.util.Set r24 = r6.keySet()
            if (r24 != 0) goto L_0x0152
        L_0x014e:
            X.0sl r24 = X.0sl.A00
            if (r0 == 0) goto L_0x0181
        L_0x0152:
            X.8PW r6 = r0.A05
            if (r6 == 0) goto L_0x0181
            java.util.LinkedHashMap r4 = r6.A09
        L_0x0158:
            com.instagram.camera.effect.models.CameraAREffect r9 = r0.A01
        L_0x015a:
            X.8KN r6 = r1.A04
            X.L83 r20 = r6.A00()
            if (r0 == 0) goto L_0x017f
            int r8 = r0.A00
        L_0x0164:
            r6 = 2
            X.0qQ.A0B(r2, r6)
            r6 = 14
            X.0qQ.A0B(r12, r6)
            r22 = 0
            r7 = r23
            if (r23 == 0) goto L_0x0195
            r10 = 1
            java.io.File r6 = X.AnonymousClass45F.A00()
            X.AEI.A02(r7, r6, r10)
            X.0qQ.A07(r6)
            goto L_0x0184
        L_0x017f:
            r8 = 0
            goto L_0x0164
        L_0x0181:
            if (r0 == 0) goto L_0x015a
            goto L_0x0158
        L_0x0184:
            java.lang.String r22 = r6.getCanonicalPath()     // Catch:{ IOException -> 0x0189 }
            goto L_0x0195
        L_0x0189:
            r10 = move-exception
            java.lang.String r7 = "PhotoToVideoTaskFactory_createPendingMediaForPhotoToVideoConversion"
            X.0sm r6 = X.0Yt.A0E()
            X.0kD.A0I(r7, r10, r6)
            java.lang.String r22 = ""
        L_0x0195:
            r23 = r4
            r25 = r8
            r17 = r9
            r18 = r11
            goto L_0x00ff
        L_0x019f:
            r6 = r4
            goto L_0x00b9
        L_0x01a2:
            int r8 = r11.x
            int r7 = r11.y
            android.graphics.Bitmap$Config r6 = r9.getConfig()
            X.0qQ.A0A(r6)
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r8, r7, r6)
            X.0qQ.A07(r15)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r15)
            r7 = 3
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r7)
            r8.drawBitmap(r9, r10, r6)
            r9.recycle()
            goto L_0x00b1
        L_0x01c7:
            android.graphics.Bitmap r15 = android.graphics.BitmapFactory.decodeFile(r13)
            goto L_0x00b1
        L_0x01cd:
            r3 = r4
        L_0x01ce:
            r5 = r4
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354148Kv.A00(android.graphics.Bitmap, android.graphics.Bitmap, com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain, X.8lx, X.8Kv, X.8Cl, java.lang.String, boolean, boolean, boolean):X.LBC");
    }
}
