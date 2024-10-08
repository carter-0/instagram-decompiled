package X;

import java.util.Map;

/* renamed from: X.A8i  reason: case insensitive filesystem */
public final class C39768A8i {
    public Map A00 = AnonymousClass7TE.A1H();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.ARh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: X.AhZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: X.AS1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: X.AhY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: X.8zq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.8zq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: X.8zq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: X.8zq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: X.AS1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: X.AS1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: X.AhX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: X.AS1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: X.AS1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: X.AS1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: X.ARs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: X.AS1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: X.ARe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: X.AS1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: X.AS1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: X.AS1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: X.8zq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: X.AS1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: X.ARs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: X.ARs} */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.A8o] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.8zr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v6, types: [X.8zY, X.9b2] */
    /* JADX WARNING: type inference failed for: r3v48, types: [com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetLocalDataSource, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v7, types: [com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource, X.ARw] */
    /* JADX WARNING: type inference failed for: r13v12, types: [X.8zO, X.ARx] */
    /* JADX WARNING: type inference failed for: r13v13 */
    /* JADX WARNING: type inference failed for: r13v14, types: [com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource] */
    /* JADX WARNING: type inference failed for: r13v15, types: [java.lang.Object, X.ARz] */
    /* JADX WARNING: type inference failed for: r7v12, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r13v18, types: [X.82N, X.ARy] */
    /* JADX WARNING: type inference failed for: r3v74, types: [X.8yq, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v36 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00(java.util.List r23) {
        /*
            r22 = this;
            r2 = 0
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r23.iterator()
        L_0x0009:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x03b4
            java.lang.Object r4 = r12.next()
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.Class<com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig> r0 = com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r4.setClassLoader(r0)
            java.lang.String r3 = "serviceType"
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x0382
            int r0 = r4.getInt(r3)
            r3 = 12
            if (r0 != r3) goto L_0x008f
            java.lang.String r9 = "safeAreaTop"
            boolean r3 = r4.containsKey(r9)
            if (r3 == 0) goto L_0x008d
            java.lang.String r8 = "safeAreaLeft"
            boolean r3 = r4.containsKey(r8)
            if (r3 == 0) goto L_0x008d
            java.lang.String r7 = "safeAreaBottom"
            boolean r3 = r4.containsKey(r7)
            if (r3 == 0) goto L_0x008d
            java.lang.String r6 = "safeAreaRight"
            boolean r3 = r4.containsKey(r6)
            if (r3 == 0) goto L_0x008d
            java.lang.String r5 = "zoomFactor"
            boolean r3 = r4.containsKey(r5)
            if (r3 == 0) goto L_0x008d
            int r14 = r4.getInt(r9)
            int r15 = r4.getInt(r8)
            int r16 = r4.getInt(r7)
            int r17 = r4.getInt(r6)
            float r18 = r4.getFloat(r5)
            X.ARs r13 = new X.ARs
            r13.<init>(r14, r15, r16, r17, r18)
        L_0x006f:
            if (r13 == 0) goto L_0x0009
            X.8yq r3 = new X.8yq
            r3.<init>()
            r3.A00 = r13
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventServiceConfigurationHybrid r4 = new com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventServiceConfigurationHybrid
            r4.<init>(r3)
        L_0x007d:
            r1.add(r4)
        L_0x0080:
            r3 = r22
            java.util.Map r3 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r0, r13)
            goto L_0x0009
        L_0x008d:
            r13 = 0
            goto L_0x006f
        L_0x008f:
            r3 = 38
            if (r0 != r3) goto L_0x00a3
            X.ARy r13 = new X.ARy
            r13.<init>()
            X.8yy r3 = new X.8yy
            r3.<init>(r13)
            com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceConfigurationHybrid r4 = new com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceConfigurationHybrid
            r4.<init>(r3)
            goto L_0x007d
        L_0x00a3:
            r3 = 24
            if (r0 != r3) goto L_0x0132
            java.lang.String r3 = "executionMode"
            boolean r0 = r4.containsKey(r3)
            r7 = 0
            if (r0 == 0) goto L_0x0120
            java.lang.String r6 = "modelFiles"
            boolean r0 = r4.containsKey(r6)
            if (r0 == 0) goto L_0x0120
            java.lang.String r9 = "filePaths"
            boolean r0 = r4.containsKey(r9)
            if (r0 == 0) goto L_0x0120
            java.lang.String r8 = "expressionFittingModelPath"
            boolean r0 = r4.containsKey(r8)
            if (r0 == 0) goto L_0x0120
            java.lang.String r5 = "useRandomSampling"
            boolean r0 = r4.containsKey(r5)
            if (r0 == 0) goto L_0x0120
            int r3 = r4.getInt(r3)
            if (r3 == 0) goto L_0x012f
            r0 = 1
            if (r3 != r0) goto L_0x0120
            java.lang.Integer r15 = X.AnonymousClass05K.A01
        L_0x00db:
            java.lang.String[] r6 = r4.getStringArray(r6)
            java.lang.String[] r0 = r4.getStringArray(r9)
            java.lang.String r18 = r4.getString(r8)
            boolean r21 = r4.getBoolean(r5)
            java.lang.String r5 = "maxDetectionDim"
            boolean r3 = r4.containsKey(r5)
            if (r3 == 0) goto L_0x012c
            int r3 = r4.getInt(r5)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)
        L_0x00fb:
            java.lang.String r5 = "maxDetectionScales"
            boolean r3 = r4.containsKey(r5)
            if (r3 == 0) goto L_0x010b
            int r3 = r4.getInt(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
        L_0x010b:
            if (r6 != 0) goto L_0x010f
            java.lang.String[] r6 = new java.lang.String[r2]
        L_0x010f:
            if (r0 != 0) goto L_0x0113
            java.lang.String[] r0 = new java.lang.String[r2]
        L_0x0113:
            r14 = 0
            X.8zq r13 = new X.8zq
            r17 = r7
            r19 = r6
            r20 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r7 = r13
        L_0x0120:
            if (r7 == 0) goto L_0x0009
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid r3 = new com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid
            r3.<init>(r7)
        L_0x0127:
            r1.add(r3)
            goto L_0x0009
        L_0x012c:
            r16 = r7
            goto L_0x00fb
        L_0x012f:
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            goto L_0x00db
        L_0x0132:
            r3 = 58
            if (r0 != r3) goto L_0x0151
            X.AhY r13 = new X.AhY
            r13.<init>()
            X.6eH r5 = r13.A06
            X.6eJ r4 = r13.A05
            X.6eM r6 = r13.A07
            X.6eF r7 = r13.A08
            java.lang.String r8 = ""
            X.8yg r3 = new X.8yg
            r3.<init>(r4, r5, r6, r7, r8)
            com.facebook.cameracore.mediapipeline.services.uicontrol.UIControlServiceConfigurationHybrid r4 = new com.facebook.cameracore.mediapipeline.services.uicontrol.UIControlServiceConfigurationHybrid
            r4.<init>(r3)
            goto L_0x007d
        L_0x0151:
            r3 = 46
            if (r0 != r3) goto L_0x0180
            java.lang.String r5 = "locale"
            boolean r3 = r4.containsKey(r5)
            if (r3 == 0) goto L_0x017e
            java.lang.String r3 = r4.getString(r5)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            r3 = 1
            X.0qQ.A0B(r4, r3)
            X.ARz r13 = new X.ARz
            r13.<init>()
            r13.A00 = r4
        L_0x0170:
            if (r13 == 0) goto L_0x0009
            X.8zI r3 = new X.8zI
            r3.<init>(r13)
            com.facebook.cameracore.mediapipeline.services.locale.LocaleServiceConfigurationHybrid r4 = new com.facebook.cameracore.mediapipeline.services.locale.LocaleServiceConfigurationHybrid
            r4.<init>(r3)
            goto L_0x007d
        L_0x017e:
            r13 = 0
            goto L_0x0170
        L_0x0180:
            r3 = 37
            if (r0 != r3) goto L_0x0195
            X.ARx r13 = new X.ARx
            r13.<init>()
            X.8zM r3 = new X.8zM
            r3.<init>(r13)
            com.facebook.cameracore.mediapipeline.services.haptic.HapticServiceConfigurationHybrid r4 = new com.facebook.cameracore.mediapipeline.services.haptic.HapticServiceConfigurationHybrid
            r4.<init>(r3)
            goto L_0x007d
        L_0x0195:
            r3 = 51
            if (r0 != r3) goto L_0x01c1
            java.lang.String r5 = "executionMode"
            boolean r3 = r4.containsKey(r5)
            if (r3 == 0) goto L_0x01bf
            int r3 = r4.getInt(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            X.ARe r13 = new X.ARe
            r13.<init>(r3)
        L_0x01ae:
            if (r13 == 0) goto L_0x0009
            X.8z0 r4 = new X.8z0
            r4.<init>(r13)
            com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataProviderConfigurationHybrid r3 = new com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataProviderConfigurationHybrid
            r3.<init>(r4)
        L_0x01ba:
            r1.add(r3)
            goto L_0x0080
        L_0x01bf:
            r13 = 0
            goto L_0x01ae
        L_0x01c1:
            r3 = 29
            if (r0 != r3) goto L_0x01d6
            X.ARw r13 = new X.ARw
            r13.<init>()
            com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration r3 = new com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration
            r3.<init>(r13)
            com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfigurationHybrid r4 = new com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfigurationHybrid
            r4.<init>(r3)
            goto L_0x007d
        L_0x01d6:
            r3 = 22
            if (r0 != r3) goto L_0x01eb
            com.facebook.cameracore.mediapipeline.services.externalasset.ExampleExternalAssetLocalDataSource r3 = new com.facebook.cameracore.mediapipeline.services.externalasset.ExampleExternalAssetLocalDataSource
            r3.<init>()
            X.8zA r0 = new X.8zA
            r0.<init>(r3)
            com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetProviderConfigurationHybrid r3 = new com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetProviderConfigurationHybrid
            r3.<init>(r0)
            goto L_0x0127
        L_0x01eb:
            r3 = 91
            if (r0 != r3) goto L_0x01ff
            X.9b2 r13 = new X.9b2
            r13.<init>()
            X.8zW r4 = new X.8zW
            r4.<init>(r13)
            com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchGesturesDataProviderConfigurationHybrid r3 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchGesturesDataProviderConfigurationHybrid
            r3.<init>(r4)
            goto L_0x01ba
        L_0x01ff:
            r3 = 101(0x65, float:1.42E-43)
            if (r0 != r3) goto L_0x0210
            X.8zj r0 = X.C392679vC.A00(r4)
            if (r0 == 0) goto L_0x0009
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerDataProviderConfigurationHybrid r3 = new com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerDataProviderConfigurationHybrid
            r3.<init>(r0)
            goto L_0x0127
        L_0x0210:
            r3 = 64
            if (r0 != r3) goto L_0x022e
            X.AhZ r13 = new X.AhZ
            r13.<init>()
            X.9av r5 = r13.A04
            X.9av r6 = r13.A03
            X.9av r7 = r13.A00
            X.9av r8 = r13.A01
            X.9av r9 = r13.A02
            X.8zE r4 = new X.8zE
            r4.<init>(r5, r6, r7, r8, r9)
            com.facebook.cameracore.mediapipeline.services.persistence.implementation.PersistenceServiceConfigurationHybrid r3 = new com.facebook.cameracore.mediapipeline.services.persistence.implementation.PersistenceServiceConfigurationHybrid
            r3.<init>(r4)
            goto L_0x01ba
        L_0x022e:
            r3 = 67
            if (r0 != r3) goto L_0x0245
            X.ARh r13 = new X.ARh
            r13.<init>()
            X.82S r3 = r13.A00
            X.8zD r4 = new X.8zD
            r4.<init>(r13, r3)
            com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsDataProviderConfigurationHybrid r3 = new com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsDataProviderConfigurationHybrid
            r3.<init>(r4)
            goto L_0x01ba
        L_0x0245:
            r3 = 36
            if (r0 != r3) goto L_0x0299
            java.lang.String r7 = "detectionInitNetPath"
            boolean r0 = r4.containsKey(r7)
            if (r0 == 0) goto L_0x0297
            java.lang.String r6 = "detectionPredictNetPath"
            boolean r0 = r4.containsKey(r6)
            if (r0 == 0) goto L_0x0297
            java.lang.String r5 = "pointerInitNetPath"
            boolean r0 = r4.containsKey(r5)
            if (r0 == 0) goto L_0x0297
            java.lang.String r3 = "pointerPredictNetPath"
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x0297
            java.lang.String r7 = r4.getString(r7)
            java.lang.String r6 = r4.getString(r6)
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r3 = r4.getString(r3)
            if (r7 == 0) goto L_0x0297
            if (r6 == 0) goto L_0x0297
            if (r5 == 0) goto L_0x0297
            if (r3 == 0) goto L_0x0297
            X.8zr r0 = new X.8zr
            r0.<init>()
            r0.A00 = r7
            r0.A01 = r6
            r0.A02 = r5
            r0.A03 = r3
        L_0x028e:
            if (r0 == 0) goto L_0x0009
            com.facebook.cameracore.mediapipeline.dataproviders.handtracking.implementation.HandTrackingDataProviderConfigurationHybrid r3 = new com.facebook.cameracore.mediapipeline.dataproviders.handtracking.implementation.HandTrackingDataProviderConfigurationHybrid
            r3.<init>(r0)
            goto L_0x0127
        L_0x0297:
            r0 = 0
            goto L_0x028e
        L_0x0299:
            r3 = 34
            if (r0 != r3) goto L_0x02e0
            java.lang.String r6 = "initNetPath"
            boolean r3 = r4.containsKey(r6)
            if (r3 == 0) goto L_0x02de
            java.lang.String r5 = "predictNetPath"
            boolean r3 = r4.containsKey(r5)
            if (r3 == 0) goto L_0x02de
            java.lang.String r7 = "isFullyAsync"
            boolean r3 = r4.containsKey(r7)
            if (r3 == 0) goto L_0x02de
            java.lang.String r6 = r4.getString(r6)
            java.lang.String r5 = r4.getString(r5)
            boolean r3 = r4.getBoolean(r7)
            if (r6 == 0) goto L_0x02de
            if (r5 == 0) goto L_0x02de
            X.AhX r13 = new X.AhX
            r13.<init>(r6, r5, r3)
        L_0x02ca:
            if (r13 == 0) goto L_0x0009
            java.lang.String r6 = r13.A00
            java.lang.String r5 = r13.A01
            boolean r3 = r13.A02
            X.9al r4 = new X.9al
            r4.<init>(r6, r5, r3)
            com.facebook.cameracore.mediapipeline.dataproviders.hairsegmentation.implementation.HairSegmentationDataProviderConfigurationHybrid r3 = new com.facebook.cameracore.mediapipeline.dataproviders.hairsegmentation.implementation.HairSegmentationDataProviderConfigurationHybrid
            r3.<init>(r4)
            goto L_0x01ba
        L_0x02de:
            r13 = 0
            goto L_0x02ca
        L_0x02e0:
            X.6eR r5 = X.C312446eR.PersonSegmentationDataProvider
            r3 = 65
            if (r0 == r3) goto L_0x0334
            X.6eR r5 = X.C312446eR.BodyTrackingDataProvider
            r3 = 7
            if (r0 == r3) goto L_0x0334
            r3 = 32
            if (r0 != r3) goto L_0x0009
            java.lang.String r8 = "accessToken"
            boolean r3 = r4.containsKey(r8)
            r0 = 0
            if (r3 == 0) goto L_0x0379
            java.lang.String r7 = "userAgent"
            boolean r3 = r4.containsKey(r7)
            if (r3 == 0) goto L_0x0379
            java.lang.String r6 = "sandbox"
            boolean r3 = r4.containsKey(r6)
            if (r3 == 0) goto L_0x0379
            java.lang.String r5 = "schemaType"
            boolean r3 = r4.containsKey(r5)
            if (r3 == 0) goto L_0x0379
            java.lang.String r11 = r4.getString(r8)
            java.lang.String r10 = r4.getString(r7)
            java.lang.String r9 = r4.getString(r6)
            int r8 = r4.getInt(r5)
            r3 = 6
            java.lang.Integer[] r7 = X.AnonymousClass05K.A00(r3)
            int r6 = r7.length
            r5 = 0
        L_0x0327:
            if (r5 >= r6) goto L_0x036b
            r4 = r7[r5]
            int r3 = X.C392739vI.A00(r4)
            if (r3 == r8) goto L_0x036c
            int r5 = r5 + 1
            goto L_0x0327
        L_0x0334:
            X.A8o r8 = new X.A8o
            r8.<init>()
            X.A4o r7 = new X.A4o
            r7.<init>(r5, r8)
            X.AS1 r13 = new X.AS1
            r13.<init>(r5, r8)
            java.lang.String r5 = "messageType"
            boolean r3 = r4.containsKey(r5)
            if (r3 == 0) goto L_0x0364
            java.lang.String r6 = "buffer"
            boolean r3 = r4.containsKey(r6)
            if (r3 == 0) goto L_0x0364
            int r5 = r4.getInt(r5)
            byte[] r3 = r4.getByteArray(r6)
            if (r3 == 0) goto L_0x0364
            X.ACv r3 = X.C39874ACv.A00(r3, r5)
            r8.A00(r3)
        L_0x0364:
            com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid r3 = new com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid
            r3.<init>(r7)
            goto L_0x01ba
        L_0x036b:
            r4 = r0
        L_0x036c:
            if (r11 == 0) goto L_0x0379
            if (r10 == 0) goto L_0x0379
            if (r9 == 0) goto L_0x0379
            if (r4 == 0) goto L_0x0379
            X.8zb r0 = new X.8zb
            r0.<init>(r4, r11, r10, r9)
        L_0x0379:
            if (r0 == 0) goto L_0x0009
            com.facebook.cameracore.mediapipeline.services.graphql.implementation.GraphQLServiceConfigurationHybrid r3 = new com.facebook.cameracore.mediapipeline.services.graphql.implementation.GraphQLServiceConfigurationHybrid
            r3.<init>(r0)
            goto L_0x0127
        L_0x0382:
            java.lang.String r3 = "requiredDownloadableModules"
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x0009
            java.util.ArrayList r0 = r4.getStringArrayList(r3)
            if (r0 != 0) goto L_0x0392
            X.0sn r0 = X.0sn.A00
        L_0x0392:
            java.util.Iterator r4 = r0.iterator()     // Catch:{ RuntimeException -> 0x03aa }
        L_0x0396:
            boolean r0 = r4.hasNext()     // Catch:{ RuntimeException -> 0x03aa }
            if (r0 == 0) goto L_0x0009
            java.lang.String r3 = X.AnonymousClass7TE.A18(r4)     // Catch:{ RuntimeException -> 0x03aa }
            X.1US r0 = X.1US.A04     // Catch:{ RuntimeException -> 0x03aa }
            X.1US r0 = X.1UY.A00(r3)     // Catch:{ RuntimeException -> 0x03aa }
            X.C392599v4.A00(r0)     // Catch:{ RuntimeException -> 0x03aa }
            goto L_0x0396
        L_0x03aa:
            r4 = move-exception
            java.lang.String r3 = "InstagramServiceConfigurationProvider"
            java.lang.String r0 = "Failed to load module: "
            X.0KC.A0F(r3, r0, r4)
            goto L_0x0009
        L_0x03b4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39768A8i.A00(java.util.List):java.util.ArrayList");
    }
}
