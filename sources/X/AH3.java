package X;

import android.content.Context;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource;
import com.instagram.common.session.UserSession;

public final class AH3 {
    public static final AnonymousClass6eG A0G = new Object();
    public static final C312326eE A0H = new Object();
    public C345607tn A00;
    public C371838zD A01 = null;
    public GalleryPickerServiceDataSource A02 = null;
    public C312366eJ A03 = new Object();
    public C312396eM A04 = new Object();
    public O9O A05;
    public final AnonymousClass82S A06;
    public final AnonymousClass82T A07;
    public final Context A08;
    public final C312706ez A09;
    public final MusicServiceDataSource A0A;
    public final AnonymousClass82G A0B = new C68312N9z(this, 1);
    public final AnonymousClass82M A0C;
    public final C312306eC A0D;
    public final UserSession A0E;
    public final String A0F;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v8, types: [com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource, X.8yr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v10, types: [com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetLocalDataSource, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v25, types: [X.8zS, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v17, types: [X.8yq, java.lang.Object, X.8yh] */
    /* JADX WARNING: type inference failed for: r5v31, types: [java.lang.Object, X.A8o] */
    /* JADX WARNING: type inference failed for: r6v22, types: [java.lang.Object, X.A8o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C348407yO A01(X.C371458yK r45, X.C314366i5 r46, X.C380949am r47, X.B0V r48, X.B0W r49, java.lang.String r50) {
        /*
            r44 = this;
            r5 = r45
            java.util.List r1 = r5.A05
            int r0 = r1.size()
            r4 = 1
            if (r0 != r4) goto L_0x044e
            r11 = 0
            java.lang.Object r3 = r1.get(r11)
            X.8yY r3 = (X.C371528yY) r3
            if (r3 == 0) goto L_0x044e
            java.lang.String r0 = r3.A01
            r23 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r23)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x044e
            r21 = 0
            r13 = 0
            r25 = 0
            r26 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            java.lang.String r6 = "0"
            r28 = r6
            r1 = r44
            android.content.Context r12 = r1.A08
            X.8yu r0 = X.C371698yt.A00(r12, r4)
            java.lang.String r14 = r3.A02
            r27 = r14
            boolean r2 = r14.isEmpty()
            if (r2 == 0) goto L_0x0049
            r27 = r6
        L_0x0049:
            java.lang.String r2 = r3.A04
            r17 = r2
            com.google.common.collect.ImmutableList r2 = r3.A00
            r16 = r2
            java.lang.String r2 = r1.A0F
            r20 = r2
            X.6el r19 = X.C312596el.USER_INTERACTION
            java.lang.String r2 = r5.A01
            r22 = r2
            java.lang.String r15 = r5.A02
            java.lang.String r2 = r3.A03
            if (r2 == 0) goto L_0x006a
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0068
            r2 = r6
        L_0x0068:
            r28 = r2
        L_0x006a:
            X.8yX r3 = r5.A04
            boolean r2 = r3.A02
            r37 = 4
            if (r2 == 0) goto L_0x0074
            r37 = 0
        L_0x0074:
            boolean r6 = r3.A01
            boolean r3 = r3.A03
            com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig r2 = new com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig
            r35 = r2
            r36 = r3
            r38 = r6
            r39 = r6
            r40 = r4
            r35.<init>(r36, r37, r38, r39, r40)
            r0.A04 = r2
            X.8LL r2 = r5.A00
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Facetracker
            java.util.Map r2 = r2.A00
            java.lang.Object r3 = r2.get(r3)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r3 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r3
            if (r3 == 0) goto L_0x013c
            X.8LN r5 = X.AnonymousClass8LN.FaceTrackerFaceDetect
            java.lang.String r7 = r3.getModelPath(r5)
            X.8LN r5 = X.AnonymousClass8LN.FaceTrackerFaceAlign
            java.lang.String r10 = r3.getModelPath(r5)
            X.8LN r5 = X.AnonymousClass8LN.FaceTrackerFaceContour
            java.lang.String r9 = r3.getModelPath(r5)
            X.8LN r5 = X.AnonymousClass8LN.FaceTrackerFaceMesh
            java.lang.String r8 = r3.getModelPath(r5)
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.lang.String[] r13 = X.AnonymousClass901.A00
            r5 = r13[r11]
            r6.put(r5, r7)
            r5 = r13[r4]
            r6.put(r5, r10)
            r5 = 2
            r5 = r13[r5]
            r6.put(r5, r9)
            r5 = 3
            r5 = r13[r5]
            r6.put(r5, r8)
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>(r6)
            java.util.HashMap r9 = X.C372228zz.A00(r3)
            java.util.Set r6 = r9.keySet()
            java.lang.String[] r5 = new java.lang.String[r11]
            java.lang.Object[] r6 = r6.toArray(r5)
            java.lang.String[] r6 = (java.lang.String[]) r6
            int r7 = r6.length
            java.lang.String[] r10 = new java.lang.String[r7]
            r5 = 0
        L_0x00e4:
            if (r5 >= r7) goto L_0x00f1
            r8 = r6[r5]
            java.lang.Object r8 = r9.get(r8)
            r10[r5] = r8
            int r5 = r5 + 1
            goto L_0x00e4
        L_0x00f1:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r5 = com.facebook.cameracore.ardelivery.model.VersionedCapability.FaceExpressionFitting
            java.lang.Object r5 = r2.get(r5)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r5 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r5
            if (r5 == 0) goto L_0x044a
            X.8LN r7 = X.AnonymousClass8LN.ExpressionFitting
            java.lang.String r26 = r5.getModelPath(r7)
            java.lang.String r40 = r5.getModelPath(r7)
        L_0x0105:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r5 = com.facebook.cameracore.ardelivery.model.VersionedCapability.FaceExpressionFittingRTRRetargeting
            java.lang.Object r5 = r2.get(r5)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r5 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r5
            if (r5 == 0) goto L_0x0115
            X.8LN r7 = X.AnonymousClass8LN.RuntimeRigRetargetingConfig
            java.lang.String r34 = r5.getModelPath(r7)
        L_0x0115:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r5 = com.facebook.cameracore.ardelivery.model.VersionedCapability.FaceWave
            java.lang.Object r5 = r2.get(r5)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r5 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r5
            if (r5 == 0) goto L_0x0125
            X.8LN r7 = X.AnonymousClass8LN.PytorchModel
            java.lang.String r25 = r5.getModelPath(r7)
        L_0x0125:
            java.lang.Integer r37 = X.AnonymousClass05K.A00
            X.8zq r5 = new X.8zq
            r35 = r5
            r36 = r21
            r38 = r21
            r39 = r21
            r41 = r6
            r42 = r10
            r43 = r11
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)
            r0.A00 = r5
        L_0x013c:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r5 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Segmentation
            java.lang.Object r6 = r2.get(r5)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r6 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r6
            com.facebook.cameracore.ardelivery.model.VersionedCapability r5 = com.facebook.cameracore.ardelivery.model.VersionedCapability.MulticlassSegmentation
            java.lang.Object r5 = r2.get(r5)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r5 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r5
            if (r6 != 0) goto L_0x0150
            if (r5 == 0) goto L_0x01e8
        L_0x0150:
            if (r3 == 0) goto L_0x017a
            X.8LN r7 = X.AnonymousClass8LN.Caffe2InitNet
            java.lang.String r32 = r3.getModelPath(r7)
            X.8LN r7 = X.AnonymousClass8LN.Caffe2PredictNet
            java.lang.String r33 = r3.getModelPath(r7)
            X.8LN r7 = X.AnonymousClass8LN.MulticlassInitNet
            java.util.Map r8 = r3.mModelPaths
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x016c
            java.lang.String r30 = r3.getModelPath(r7)
        L_0x016c:
            X.8LN r7 = X.AnonymousClass8LN.MulticlassPredictNet
            java.util.Map r8 = r3.mModelPaths
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x017a
            java.lang.String r31 = r3.getModelPath(r7)
        L_0x017a:
            r8 = 512(0x200, float:7.175E-43)
            X.9ZR r7 = X.AnonymousClass9ZR.A00
            X.AHF r3 = new X.AHF
            r3.<init>(r7, r8)
            if (r6 == 0) goto L_0x0446
            X.8LN r7 = X.AnonymousClass8LN.Caffe2InitNet
            int r8 = A00(r3, r7, r6)
            X.8LN r7 = X.AnonymousClass8LN.Caffe2PredictNet
            int r7 = A00(r3, r7, r6)
        L_0x0191:
            if (r5 == 0) goto L_0x0442
            X.8LN r6 = X.AnonymousClass8LN.MulticlassInitNet
            int r6 = A00(r3, r6, r5)
            X.8LN r9 = X.AnonymousClass8LN.MulticlassPredictNet
            int r5 = A00(r3, r9, r5)
        L_0x019f:
            r9 = 6
            r3.A08(r9)
            r9 = 3
            r3.A0A(r9, r5)
            r5 = 2
            r3.A0A(r5, r6)
            r3.A0A(r4, r7)
            r3.A0A(r11, r8)
            r7 = 5
            r3.A0B(r4, r11)
            java.nio.ByteBuffer r6 = r3.A07
            int r5 = r3.A03
            int r5 = r5 + -1
            r3.A03 = r5
            r6.put(r5, r4)
            r3.A07(r7)
            int r5 = r3.A01()
            r3.A06(r5)
            java.lang.Class<X.9ZU> r5 = X.AnonymousClass9ZU.class
            r3.A04()
            java.nio.ByteBuffer r6 = r3.A07
            X.ACv r3 = new X.ACv
            r3.<init>(r5, r6)
            X.A8o r6 = new X.A8o
            r6.<init>()
            r6.A00(r3)
            X.6eR r5 = X.C312446eR.PersonSegmentationDataProvider
            X.A4o r3 = new X.A4o
            r3.<init>(r5, r6)
            r0.A01(r3)
        L_0x01e8:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HairSegmentation
            java.lang.Object r5 = r2.get(r3)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r5 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r5
            if (r5 == 0) goto L_0x020e
            X.8yi r7 = X.C380939al.A03
            X.8LN r3 = X.AnonymousClass8LN.Caffe2InitNet
            java.lang.String r6 = r5.getModelPath(r3)
            r6.getClass()
            X.8LN r3 = X.AnonymousClass8LN.Caffe2PredictNet
            java.lang.String r5 = r5.getModelPath(r3)
            r5.getClass()
            X.9al r3 = new X.9al
            r3.<init>(r6, r5, r11)
            r0.A00(r7, r3)
        L_0x020e:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HandTracker
            java.lang.Object r3 = r2.get(r3)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r3 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r3
            if (r3 == 0) goto L_0x024d
            X.8LN r5 = X.AnonymousClass8LN.Caffe2InitNet
            java.lang.String r6 = r3.getModelPath(r5)
            if (r6 == 0) goto L_0x024d
            X.8LN r6 = X.AnonymousClass8LN.Caffe2PredictNet
            java.lang.String r7 = r3.getModelPath(r6)
            if (r7 == 0) goto L_0x024d
            java.lang.String r7 = r3.getModelPath(r5)
            r7.getClass()
            java.lang.String r8 = r3.getModelPath(r6)
            r8.getClass()
            java.lang.String r9 = r3.getModelPath(r5)
            r9.getClass()
            java.lang.String r10 = r3.getModelPath(r6)
            r10.getClass()
            X.8zr r3 = new X.8zr
            r5 = r3
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A01 = r3
        L_0x024d:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.BodyTracking
            java.lang.Object r2 = r2.get(r3)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r2 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r2
            if (r2 == 0) goto L_0x0293
            r5 = 256(0x100, float:3.59E-43)
            X.9ZR r3 = X.AnonymousClass9ZR.A00
            X.AHF r6 = new X.AHF
            r6.<init>(r3, r5)
            X.8LN r3 = X.AnonymousClass8LN.Caffe2InitNet
            int r5 = A00(r6, r3, r2)
            X.8LN r3 = X.AnonymousClass8LN.Caffe2PredictNet
            int r3 = A00(r6, r3, r2)
            int r2 = r2.mVersion
            int r2 = X.AnonymousClass9ZV.A00(r6, r5, r3, r2)
            r6.A06(r2)
            java.lang.Class<X.9ZV> r3 = X.AnonymousClass9ZV.class
            r6.A04()
            java.nio.ByteBuffer r5 = r6.A07
            X.ACv r2 = new X.ACv
            r2.<init>(r3, r5)
            X.A8o r5 = new X.A8o
            r5.<init>()
            r5.A00(r2)
            X.6eR r3 = X.C312446eR.BodyTrackingDataProvider
            X.A4o r2 = new X.A4o
            r2.<init>(r3, r5)
            r0.A01(r2)
        L_0x0293:
            X.8yi r5 = X.C371988zT.A01
            X.8zU r3 = new X.8zU
            r3.<init>()
            X.8zT r2 = new X.8zT
            r2.<init>(r3)
            r0.A00(r5, r2)
            com.instagram.common.session.UserSession r2 = r1.A0E
            X.0qQ.A0B(r2, r11)
            X.0qQ.A0B(r12, r4)
            int r5 = X.C278524x1.A00(r2)
            r3 = 15
            if (r5 > r3) goto L_0x02ba
            int r5 = X.AnonymousClass0Ke.A00(r12)
            r3 = 2016(0x7e0, float:2.825E-42)
            if (r5 < r3) goto L_0x02d7
        L_0x02ba:
            X.6eC r3 = r1.A0D
            X.0eM r3 = r3.A00
            java.lang.Object r3 = r3.getValue()
            X.8zg r3 = (X.C372098zg) r3
            X.ADx r3 = r3.A01
            if (r3 == 0) goto L_0x043b
            X.A9V r3 = r3.A01
            if (r3 == 0) goto L_0x043b
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig r5 = X.C372088zf.A00(r3)
            X.8zi r3 = new X.8zi
            r3.<init>(r12, r5)
        L_0x02d5:
            r0.A03 = r3
        L_0x02d7:
            r6 = r50
            if (r50 == 0) goto L_0x02e5
            X.8yi r5 = X.C380899ah.A01
            X.9ah r3 = new X.9ah
            r3.<init>(r6)
            r0.A00(r5, r3)
        L_0x02e5:
            r6 = r48
            if (r48 == 0) goto L_0x02f3
            X.8yi r5 = X.C380909ai.A01
            X.9ai r3 = new X.9ai
            r3.<init>(r6)
            r0.A00(r5, r3)
        L_0x02f3:
            r6 = r49
            if (r49 == 0) goto L_0x0301
            X.8yi r5 = X.C380919aj.A01
            X.9aj r3 = new X.9aj
            r3.<init>(r6)
            r0.A00(r5, r3)
        L_0x0301:
            com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource r6 = r1.A02
            if (r6 == 0) goto L_0x030f
            X.8yi r5 = com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration.A01
            com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration r3 = new com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration
            r3.<init>(r6)
            r0.A00(r5, r3)
        L_0x030f:
            X.8yr r6 = new X.8yr
            r6.<init>()
            android.content.res.Resources r3 = r12.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            java.util.Locale r3 = r3.locale
            java.lang.String r3 = r3.toString()
            r6.setDeviceLocaleIdentifier(r3)
            X.8yi r5 = X.C371888zI.A01
            X.8zI r3 = new X.8zI
            r3.<init>(r6)
            r0.A00(r5, r3)
            X.8yi r6 = X.C371828zA.A01
            com.facebook.cameracore.mediapipeline.services.externalasset.ExampleExternalAssetLocalDataSource r5 = new com.facebook.cameracore.mediapipeline.services.externalasset.ExampleExternalAssetLocalDataSource
            r5.<init>()
            X.8zA r3 = new X.8zA
            r3.<init>(r5)
            r0.A00(r6, r3)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.8z1 r5 = new X.8z1
            r5.<init>(r12, r3, r4)
            X.8yi r4 = X.C371738z0.A01
            X.8z0 r3 = new X.8z0
            r3.<init>(r5)
            r0.A00(r4, r3)
            X.8yi r5 = X.C371908zL.A01
            com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource r4 = r1.A0A
            X.8zL r3 = new X.8zL
            r3.<init>(r4)
            r0.A00(r5, r3)
            X.8yi r6 = X.C371838zD.A02
            X.8zD r5 = r1.A01
            if (r5 != 0) goto L_0x036a
            X.82T r4 = r1.A07
            X.82S r3 = r1.A06
            X.8zD r5 = new X.8zD
            r5.<init>(r4, r3)
        L_0x036a:
            r0.A00(r6, r5)
            X.8yi r4 = X.C371918zM.A01
            X.8zN r3 = new X.8zN
            r3.<init>(r12)
            X.8zM r5 = new X.8zM
            r5.<init>(r3)
            r0.A00(r4, r5)
            r4 = r47
            if (r47 == 0) goto L_0x0385
            X.8yi r3 = X.C380949am.A05
            r0.A00(r3, r4)
        L_0x0385:
            X.8yi r4 = X.C371608yg.A02
            X.6eG r37 = A0G
            X.6eJ r6 = r1.A03
            X.6eM r5 = r1.A04
            X.6eE r39 = A0H
            X.8yg r3 = new X.8yg
            r35 = r3
            r36 = r6
            r38 = r5
            r40 = r14
            r35.<init>(r36, r37, r38, r39, r40)
            r0.A00(r4, r3)
            X.8zS r3 = new X.8zS
            r3.<init>()
            r0.A02 = r3
            X.8yi r4 = X.C371678yq.A01
            X.6e8 r3 = new X.6e8
            r3.<init>(r11)
            X.8yq r5 = new X.8yq
            r5.<init>()
            r5.A00 = r3
            r0.A00(r4, r5)
            X.8yi r5 = X.C372008zW.A01
            X.8zX r4 = new X.8zX
            r4.<init>()
            X.8zW r3 = new X.8zW
            r3.<init>(r4)
            r0.A00(r5, r3)
            X.8yi r5 = X.C371728yy.A01
            X.82M r4 = r1.A0C
            X.8yy r3 = new X.8yy
            r3.<init>(r4)
            r0.A00(r5, r3)
            X.8yi r7 = X.C371848zE.A05
            X.8zF r6 = new X.8zF
            r6.<init>(r2, r14)
            X.82P r37 = new X.82P
            r37.<init>()
            X.8zG r38 = new X.8zG
            r38.<init>()
            X.6ez r2 = r1.A09
            com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache r5 = r2.A01()
            com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache r4 = r2.A02()
            com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory r2 = com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory.$redex_init_class
            X.0nl r2 = X.C61560nl.A00()
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r2.A00
            com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory r3 = new com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory
            r3.<init>(r2)
            X.8zH r2 = new X.8zH
            r2.<init>(r14, r5, r4, r3)
            X.8zG r40 = new X.8zG
            r40.<init>()
            X.8zE r3 = new X.8zE
            r35 = r3
            r36 = r6
            r39 = r2
            r35.<init>(r36, r37, r38, r39, r40)
            r0.A00(r7, r3)
            X.8yt r3 = new X.8yt
            r3.<init>(r0)
            X.8zo r0 = new X.8zo
            r2 = r46
            r0.<init>(r2)
            X.8xy r2 = new X.8xy
            r29 = r17
            r35 = r13
            r36 = r16
            r37 = r21
            r16 = r2
            r17 = r0
            r18 = r3
            r24 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.82G r0 = r1.A0B
            X.7yO r1 = new X.7yO
            r1.<init>(r2, r0)
            return r1
        L_0x043b:
            X.8zi r3 = new X.8zi
            r3.<init>(r12)
            goto L_0x02d5
        L_0x0442:
            r6 = 0
            r5 = 0
            goto L_0x019f
        L_0x0446:
            r8 = 0
            r7 = 0
            goto L_0x0191
        L_0x044a:
            r40 = 0
            goto L_0x0105
        L_0x044e:
            r0 = 0
            X.7yO r1 = new X.7yO
            r1.<init>(r0, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AH3.A01(X.8yK, X.6i5, X.9am, X.B0V, X.B0W, java.lang.String):X.7yO");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6eM, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.6eJ, java.lang.Object] */
    public AH3(Context context, UserSession userSession, String str) {
        this.A08 = context;
        this.A0E = userSession;
        this.A0F = str;
        this.A0A = new C314396iB(context);
        AnonymousClass82S r1 = new AnonymousClass82S();
        this.A06 = r1;
        this.A07 = new AnonymousClass82T(r1, userSession);
        this.A0D = new C312306eC();
        this.A0C = new AnonymousClass82M(userSession);
        this.A09 = C392459uq.A00(userSession);
    }

    public static int A00(AHF ahf, AnonymousClass8LN r2, ModelPathsHolder modelPathsHolder) {
        String modelPath = modelPathsHolder.getModelPath(r2);
        modelPath.getClass();
        return ahf.A03(modelPath);
    }
}
