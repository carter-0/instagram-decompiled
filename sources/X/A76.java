package X;

import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

public final class A76 {
    public final TransformMatrixConfig A00;
    public final L83 A01;
    public final FilterGroupModel A02;
    public final AnonymousClass3Q2 A03;
    public final /* synthetic */ AnonymousClass8KO A04;

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02aa, code lost:
        if (r4.isEmpty() != false) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02bc, code lost:
        if (r4.isEmpty() != false) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0176, code lost:
        if (r9.A02.A01.A0I != true) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0202, code lost:
        if (X.AnonymousClass9SF.A05(r1) == false) goto L_0x0204;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x035d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00db A[Catch:{ IOException -> 0x00ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00dc A[Catch:{ IOException -> 0x00ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A76(com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r48, X.B1O r49, X.C364758lx r50, X.AnonymousClass8KO r51, X.A6R r52, X.C273814nE r53, X.AnonymousClass8VT r54, X.C352218Cl r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.util.Set r59, boolean r60, boolean r61) {
        /*
            r47 = this;
            r46 = r47
            r5 = r51
            r23 = r48
            r22 = r56
            r0 = r46
            r0.A04 = r5
            r46.<init>()
            r6 = r50
            r4 = r55
            r0 = r23
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r8 = r5.A02(r0, r6, r4)
            r0 = r46
            r0.A00 = r8
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r3 = r5.A05(r8, r6, r4)
            r0.A02 = r3
            r7 = 0
            if (r50 == 0) goto L_0x00cd
            com.instagram.camera.effect.models.CameraAREffect r0 = r6.A01
        L_0x0028:
            r2 = 1
            if (r0 == 0) goto L_0x00b3
            android.content.Context r11 = r5.A00
            r0 = r23
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r10 = r0.getWidth()
            int r9 = r0.getHeight()
            com.instagram.common.session.UserSession r14 = r5.A02
            r0 = 0
            X.0qQ.A0B(r11, r0)
            int r13 = r4.A07
            int r12 = r4.A09
            int r7 = r4.A06
            android.graphics.Rect r15 = r4.A00()
            float r1 = (float) r10
            float r0 = (float) r9
            float r1 = r1 / r0
            r18 = r7
            r19 = r13
            r20 = r2
            r16 = r1
            r17 = r12
            com.instagram.creation.base.CropInfo r0 = X.C364818m3.A00(r15, r16, r17, r18, r19, r20)
            android.graphics.Rect r0 = r0.A02
            int r1 = r0.width()
            int r12 = r0.height()
            int r7 = r13 % 180
            r0 = r12
            if (r7 != 0) goto L_0x006d
            r0 = r1
            r1 = r12
        L_0x006d:
            r15 = 0
            if (r1 <= r0) goto L_0x0071
            r15 = 1
        L_0x0071:
            boolean r16 = X.C343127pi.A00(r11)
            r12 = r14
            r13 = r0
            r14 = r1
            android.graphics.Point r0 = X.AEW.A02(r11, r12, r13, r14, r15, r16)
            int r1 = r0.x
            int r0 = r0.y
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r7 = X.C364738lv.A00(r1, r0, r10, r9, r2)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = r8.A08
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r0 = r7.A08
            r0.A00(r1)
            r7.A03()
            int r9 = r7.A02
            int r0 = r7.A01
        L_0x0092:
            X.L83 r1 = new X.L83
            r1.<init>(r9, r0, r2, r2)
        L_0x0097:
            r0 = r46
            r0.A01 = r1
            android.content.Context r9 = r5.A00
            java.lang.String r1 = r4.A06()
            r21 = 0
            r0 = r21
            X.0qQ.A0B(r9, r0)
            boolean r0 = X.1Wr.isLocationEnabled(r9)
            r37 = 0
            if (r0 == 0) goto L_0x00fa
            if (r1 == 0) goto L_0x00fa
            goto L_0x00d0
        L_0x00b3:
            X.80D r0 = r5.A04
            if (r0 == 0) goto L_0x00c6
            java.lang.String r1 = r0.A2q
            java.lang.String r0 = "story_selfie_reply"
            boolean r0 = r0.equals(r1)
            if (r0 != r2) goto L_0x00c6
            int r9 = r4.A09
            int r0 = r4.A06
            goto L_0x0092
        L_0x00c6:
            X.8KN r0 = r5.A05
            X.L83 r1 = r0.A00()
            goto L_0x0097
        L_0x00cd:
            r0 = r7
            goto L_0x0028
        L_0x00d0:
            X.2kK r0 = new X.2kK     // Catch:{ IOException -> 0x00ee }
            r0.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x00ee }
            double[] r10 = X.C379829Vm.A04(r0)     // Catch:{ IOException -> 0x00ee }
            if (r10 != 0) goto L_0x00dc
            goto L_0x00f7
        L_0x00dc:
            java.lang.String r0 = "media_exif"
            android.location.Location r9 = new android.location.Location     // Catch:{ IOException -> 0x00ee }
            r9.<init>(r0)     // Catch:{ IOException -> 0x00ee }
            r0 = r10[r21]     // Catch:{ IOException -> 0x00ee }
            r9.setLatitude(r0)     // Catch:{ IOException -> 0x00ee }
            r0 = r10[r2]     // Catch:{ IOException -> 0x00ee }
            r9.setLongitude(r0)     // Catch:{ IOException -> 0x00ee }
            goto L_0x00f8
        L_0x00ee:
            r9 = move-exception
            java.lang.String r1 = "QuickCaptureLocationHelper"
            java.lang.String r0 = "Couldn't read file exif data"
            X.0kD.A07(r1, r0, r9)
            goto L_0x00fa
        L_0x00f7:
            r9 = 0
        L_0x00f8:
            r37 = r9
        L_0x00fa:
            com.instagram.common.session.UserSession r14 = r5.A02
            X.82p r9 = r5.A03
            r16 = 0
            if (r9 == 0) goto L_0x01cb
            X.82o r0 = r9.A02
            X.82Y r0 = r0.A01
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat r0 = r0.A03
            if (r0 == 0) goto L_0x01c8
            java.lang.String r10 = r0.A03
        L_0x010c:
            X.28D r1 = r5.A01
            if (r9 == 0) goto L_0x01c4
            X.82o r0 = r9.A02
            X.82Y r0 = r0.A01
            X.8Yz r0 = r0.A0X
            if (r0 == 0) goto L_0x01c4
            X.80m r0 = r0.A09
            java.lang.Object r0 = r0.A00
            java.util.Set r0 = (java.util.Set) r0
        L_0x011e:
            r24 = r1
            r25 = r14
            r26 = r23
            r28 = r8
            r29 = r4
            r30 = r10
            r31 = r0
            r27 = r49
            X.3Q2 r8 = X.C59797JYq.A02(r24, r25, r26, r27, r28, r29, r30, r31)
            X.0qQ.A07(r8)
            r10 = r52
            if (r52 == 0) goto L_0x01bd
            X.JYe r1 = new X.JYe
            r1.<init>(r8)
            java.lang.String r0 = r10.A02
            r1.A01(r0)
            int r10 = r10.A01
            long r0 = X.AnonymousClass7TG.A0I()
            long r10 = (long) r10
            long r0 = r0 - r10
            r8.A0e = r0
        L_0x014d:
            r20 = 1
            if (r9 == 0) goto L_0x0163
            X.82o r0 = r9.A02
            X.82Y r0 = r0.A01
            X.82g r0 = r0.A0c
            if (r0 == 0) goto L_0x0163
            java.util.List r1 = r0.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0163
            r8.A4Q = r1
        L_0x0163:
            if (r50 == 0) goto L_0x02db
            java.lang.String r0 = r8.A2V
            if (r0 == 0) goto L_0x01ab
            java.lang.Integer r45 = X.C393989xM.A00(r0)
        L_0x016d:
            if (r9 == 0) goto L_0x0178
            X.82o r0 = r9.A02
            X.82Y r0 = r0.A01
            boolean r1 = r0.A0I
            r0 = 1
            if (r1 == r2) goto L_0x0179
        L_0x0178:
            r0 = 0
        L_0x0179:
            r8.A4v = r0
            java.util.LinkedHashMap r11 = r6.A07
            X.8PW r0 = r6.A05
            r19 = r0
            com.instagram.creation.base.CropInfo r10 = r6.A02
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r6.A03
            r18 = r0
            if (r9 == 0) goto L_0x01a6
            X.82o r0 = r9.A02
            X.82Y r1 = r0.A01
            java.lang.Integer r0 = r1.A0D
            r44 = r0
            X.802 r40 = r1.A02()
        L_0x0195:
            com.instagram.camera.effect.models.CameraAREffect r0 = r6.A01
            r38 = r0
            boolean r15 = r6.A0A
            r17 = 1
            if (r11 == 0) goto L_0x0207
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0207
            goto L_0x01cf
        L_0x01a6:
            r44 = r16
            r40 = r16
            goto L_0x0195
        L_0x01ab:
            if (r9 == 0) goto L_0x01ba
            X.82o r1 = r9.A02
            X.82Y r0 = r1.A01
            X.8Yz r0 = r0.A0X
            if (r0 == 0) goto L_0x01ba
            java.lang.Integer r45 = r1.A03()
            goto L_0x016d
        L_0x01ba:
            java.lang.Integer r45 = X.AnonymousClass05K.A05
            goto L_0x016d
        L_0x01bd:
            long r0 = X.AnonymousClass7TG.A0I()
            r8.A0e = r0
            goto L_0x014d
        L_0x01c4:
            r0 = r16
            goto L_0x011e
        L_0x01c8:
            r10 = 0
            goto L_0x010c
        L_0x01cb:
            r10 = r16
            goto L_0x010c
        L_0x01cf:
            X.AB8.A01(r14, r8, r11)     // Catch:{ IOException -> 0x01d3 }
            goto L_0x01dc
        L_0x01d3:
            r2 = move-exception
            java.lang.String r1 = "failed to prepare media for animated stickers"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x01dc:
            java.util.Set r1 = r11.keySet()
            r0 = r21
            X.0qQ.A0B(r1, r0)
            r12 = 4658815484840378368(0x40a7700000000000, double:3000.0)
            r0 = r38
            int r0 = X.AJ8.A00(r0, r14, r1, r12)
            r8.A0F = r0
            if (r15 != 0) goto L_0x0204
            java.util.Set r1 = r11.keySet()
            r0 = r21
            X.0qQ.A0B(r1, r0)
            boolean r1 = X.AnonymousClass9SF.A05(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0205
        L_0x0204:
            r0 = 0
        L_0x0205:
            r8.A69 = r0
        L_0x0207:
            if (r10 == 0) goto L_0x0273
            int r13 = r10.A01
            int r12 = r10.A00
            X.4nL r10 = new X.4nL
            r10.<init>()
            r11 = 17
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r3.B5u(r11)
            r0.getClass()
            boolean r1 = r0 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter
            if (r1 == 0) goto L_0x04d9
            java.lang.String r1 = r0.getFilterName()
            int r1 = X.C366508p8.A00(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.A0P = r1
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter) r0
        L_0x022f:
            float r0 = r0.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r10.A07 = r0
        L_0x0237:
            r0 = 22
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r3.B5u(r0)
            if (r0 == 0) goto L_0x024b
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x024b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r10.A0N = r0
        L_0x024b:
            float r11 = (float) r13
            float r1 = (float) r12
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r11, r1)
            r10.A01 = r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r24 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r26 = r16
            r27 = r16
            r28 = r16
            r29 = r16
            r30 = r16
            r31 = r16
            r32 = r16
            r33 = r16
            r34 = r16
            r35 = r16
            r36 = r21
            r25 = r16
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r8.A1a = r10
        L_0x0273:
            r0 = r18
            r8.A16 = r0
            if (r18 != 0) goto L_0x027b
            r17 = 0
        L_0x027b:
            r0 = r17
            r8.A5z = r0
            if (r19 == 0) goto L_0x028c
            r42 = r54
            r39 = r14
            r41 = r19
            r43 = r8
            X.C59797JYq.A09(r37, r38, r39, r40, r41, r42, r43, r44, r45)
        L_0x028c:
            com.instagram.camera.effect.models.CameraAREffect r0 = r6.A01
            if (r0 == 0) goto L_0x029b
            X.8KN r0 = r5.A05
            X.L83 r1 = r0.A00()
            int r0 = r6.A00
            X.AJ8.A06(r7, r1, r8, r4, r0)
        L_0x029b:
            com.instagram.camera.effect.models.CameraAREffect r0 = r6.A01
            if (r0 != 0) goto L_0x02a1
            r20 = 0
        L_0x02a1:
            java.util.LinkedHashMap r4 = r6.A07
            if (r4 == 0) goto L_0x02ac
            boolean r1 = r4.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x02ad
        L_0x02ac:
            r0 = 0
        L_0x02ad:
            if (r20 != 0) goto L_0x02b1
            if (r0 == 0) goto L_0x02db
        L_0x02b1:
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r3 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r3
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r3 = r3.A02
            if (r4 == 0) goto L_0x02be
            boolean r1 = r4.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x02bf
        L_0x02be:
            r0 = 1
        L_0x02bf:
            r0 = r0 ^ 1
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r1 = r3.deepCopy()
            if (r0 == 0) goto L_0x02cc
            if (r20 != 0) goto L_0x02cc
            X.AJ8.A05(r1)
        L_0x02cc:
            if (r9 == 0) goto L_0x04d5
            X.82o r0 = r9.A02
            X.82Y r0 = r0.A01
            X.8Yz r0 = r0.A0X
        L_0x02d4:
            boolean r0 = X.C379509Ue.A00(r0)
            X.AJ8.A03(r1, r8, r0)
        L_0x02db:
            if (r9 == 0) goto L_0x02ef
            X.82o r0 = r9.A02
            X.82Y r0 = r0.A01
            X.82m r0 = r0.A0a
            if (r0 == 0) goto L_0x02ef
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x02ef
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r8.A4Q = r0
        L_0x02ef:
            X.JYe r0 = new X.JYe
            r0.<init>(r8)
            X.3Q2 r1 = r0.A00
            r0 = r58
            r1.A3z = r0
            if (r9 == 0) goto L_0x0304
            X.82o r0 = r9.A02
            X.82Y r0 = r0.A01
            java.lang.String r16 = r0.A05()
        L_0x0304:
            r0 = r16
            r1.A2e = r0
            r0 = r60
            r8.A6C = r0
            if (r60 == 0) goto L_0x031d
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325733878084777(0x810e10000234a9, double:3.035878604265978E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            if (r0 == 0) goto L_0x04d1
            r8.A53 = r2
        L_0x031d:
            r0 = r53
            r8.A1R = r0
            r0 = r46
            r0.A03 = r8
            if (r56 != 0) goto L_0x0329
            java.lang.String r22 = ""
        L_0x0329:
            r0 = r22
            r8.A3x = r0
            r0 = r57
            r8.A3k = r0
            r19 = r59
            if (r59 == 0) goto L_0x0522
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x0522
            if (r50 == 0) goto L_0x0522
            X.8PW r0 = r6.A05
            if (r0 == 0) goto L_0x0522
            java.util.Map r1 = r0.A0K
            if (r1 == 0) goto L_0x0522
            X.6Ma r0 = X.C306406Ma.A00
            r0 = r23
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r18 = r0.getWidth()
            int r15 = r0.getHeight()
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = X.AnonymousClass7TF.A0u(r1)
        L_0x035d:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0517
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r17)
            java.lang.Object r3 = r0.getKey()
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            java.lang.Object r13 = r0.getValue()
            X.8un r13 = (X.C369458un) r13
            X.9sm r6 = X.C391369sm.MUSIC_SOUNDWAVE
            r0 = r19
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x041f
            boolean r0 = r3 instanceof X.AnonymousClass5MJ
            if (r0 == 0) goto L_0x041f
            boolean r0 = r3 instanceof X.B3e
            if (r0 == 0) goto L_0x041f
            android.graphics.Rect r1 = X.AnonymousClass7TE.A0X(r3)
            X.B3e r3 = (X.B3e) r3
            X.9cA r3 = r3.Bxe()
            float r10 = r13.A01
            float r0 = r1.exactCenterX()
            float r10 = r10 + r0
            float r9 = r13.A02
            float r0 = r1.exactCenterY()
            float r9 = r9 + r0
            float r0 = r3.A00
            float r7 = r10 - r0
            float r0 = r3.A01
            float r5 = r9 + r0
            float r4 = r13.A06
            float r0 = r13.A05
            android.graphics.Matrix r1 = X.AnonymousClass7TE.A0U()
            r1.postScale(r4, r4, r10, r9)
            r1.postRotate(r0, r10, r9)
            r0 = 2
            float[] r0 = new float[r0]
            r0[r21] = r7
            r0[r2] = r5
            r1.mapPoints(r0)
            r11 = r0[r21]
            r10 = r0[r2]
            float r5 = r13.A06
            float r0 = r3.A03
            float r9 = r5 * r0
            float r0 = r3.A02
            float r5 = r5 * r0
            r0 = r18
            float r1 = (float) r0
            float r11 = r11 / r1
            float r4 = (float) r15
            float r10 = r10 / r4
            float r9 = r9 / r1
            float r5 = r5 / r4
            int r7 = r13.A09
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r7 * r0
            int r0 = r13.A0B
            int r7 = r7 + r0
            java.lang.String r6 = r6.A00
            X.9sJ r0 = X.C391079sJ.GIF
            r3 = 0
            X.ADJ r12 = new X.ADJ
            r12.<init>(r0, r6)
            java.lang.Float r0 = java.lang.Float.valueOf(r11)
            r12.A09 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            r12.A0A = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r12.A0F = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r12.A08 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r12.A06 = r0
            float r0 = r13.A05
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r12.A07 = r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            X.AD7 r5 = new X.AD7
            r5.<init>(r1, r0, r3, r3)
        L_0x0418:
            r12.A01 = r5
            r14.add(r12)
            goto L_0x035d
        L_0x041f:
            X.9sm r1 = X.C391369sm.GIPHY
            r0 = r19
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x035d
            boolean r4 = r3 instanceof X.C347017w8
            if (r4 == 0) goto L_0x0438
            r0 = r3
            X.7w8 r0 = (X.C347017w8) r0
            android.graphics.drawable.Drawable r0 = r0.A04()
            boolean r0 = r0 instanceof X.C321016tR
            if (r0 != 0) goto L_0x04c8
        L_0x0438:
            boolean r0 = r3 instanceof X.C321016tR
            if (r0 == 0) goto L_0x035d
            if (r4 != 0) goto L_0x04c8
            r11 = r3
        L_0x043f:
            X.0qQ.A09(r11)
            boolean r0 = r11 instanceof X.C321016tR
            if (r0 == 0) goto L_0x035d
            X.6tR r11 = (X.C321016tR) r11
            boolean r0 = r11.A0M
            if (r0 == 0) goto L_0x035d
            android.graphics.Rect r3 = X.AnonymousClass7TE.A0X(r3)
            float r10 = r13.A01
            float r0 = r3.exactCenterX()
            float r10 = r10 + r0
            float r9 = r13.A02
            float r0 = r3.exactCenterY()
            float r9 = r9 + r0
            r0 = r18
            float r7 = (float) r0
            float r10 = r10 / r7
            float r6 = (float) r15
            float r9 = r9 / r6
            float r5 = r13.A06
            int r0 = r3.width()
            float r0 = (float) r0
            float r5 = r5 * r0
            float r5 = r5 / r7
            float r4 = r13.A06
            int r0 = r3.height()
            float r0 = (float) r0
            float r4 = r4 * r0
            float r4 = r4 / r6
            int r3 = r13.A09
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r0
            int r0 = r13.A0B
            int r3 = r3 + r0
            java.lang.String r0 = r1.A00
            r1 = r0
            X.9sJ r0 = X.C391079sJ.GIF
            r16 = 0
            X.ADJ r12 = new X.ADJ
            r12.<init>(r0, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            r12.A09 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r12.A0A = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r12.A0F = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r12.A08 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            r12.A06 = r0
            float r0 = r13.A05
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r12.A07 = r0
            java.lang.Float r4 = java.lang.Float.valueOf(r7)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            java.lang.String r1 = r11.A0E
            if (r1 != 0) goto L_0x04bf
            java.lang.String r1 = r11.A0l
        L_0x04bf:
            X.AD7 r5 = new X.AD7
            r0 = r16
            r5.<init>(r4, r3, r0, r1)
            goto L_0x0418
        L_0x04c8:
            r0 = r3
            X.7w8 r0 = (X.C347017w8) r0
            android.graphics.drawable.Drawable r11 = r0.A04()
            goto L_0x043f
        L_0x04d1:
            r8.A4x = r2
            goto L_0x031d
        L_0x04d5:
            r0 = r16
            goto L_0x02d4
        L_0x04d9:
            boolean r1 = r0 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup
            if (r1 == 0) goto L_0x0504
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup) r0
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r11)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r0
            r0.getClass()
        L_0x04ea:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r0.A00()
            boolean r1 = r0 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter
            if (r1 == 0) goto L_0x0237
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter) r0
            java.lang.String r1 = r0.A04
            int r1 = X.C366508p8.A00(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.A0P = r1
            goto L_0x022f
        L_0x0504:
            boolean r1 = r0 instanceof com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter
            if (r1 != 0) goto L_0x04ea
            java.lang.String r1 = "Unsupported filter model "
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x0517:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0522
            java.util.Set r0 = r8.A4t
            r0.addAll(r14)
        L_0x0522:
            if (r61 == 0) goto L_0x0526
            r8.A5q = r2
        L_0x0526:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A76.<init>(com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.B1O, X.8lx, X.8KO, X.A6R, X.4nE, X.8VT, X.8Cl, java.lang.String, java.lang.String, java.lang.String, java.util.Set, boolean, boolean):void");
    }
}
