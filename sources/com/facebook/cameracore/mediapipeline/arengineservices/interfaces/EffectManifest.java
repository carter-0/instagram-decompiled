package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.C312446eR;
import X.C368668t8;
import X.C368678t9;
import com.facebook.jni.HybridData;
import java.util.Collections;
import java.util.List;

public class EffectManifest {
    public final boolean frameDataNeeded;
    public final C368678t9 frameFormatForPostProcessing;
    public final boolean horizontalTrackableDetectionNeeded;
    public HybridData mHybridData;
    public final boolean multipleOutputsSupported;
    public final boolean platformAlgorithmDataNeeded;
    public final boolean realScaleEstimationNeeded;
    public final boolean sLAMNeeded;
    public final C368668t8 specifiedCameraFacing;
    public final boolean supportsLandscape;
    public final boolean supportsLongPressGesture;
    public final boolean supportsPanGesture;
    public final boolean supportsPinchGesture;
    public final boolean supportsPortrait;
    public final boolean supportsRawTouchGesture;
    public final boolean supportsRotateGesture;
    public final boolean supportsTapGesture;
    public final boolean usesAssistantCapability;
    public final boolean usesGalleryPicker;
    public final boolean usesGeoanchorCapability;
    public final boolean usesMultiplane;
    public final boolean usesPickerCapability;
    public final boolean usesSceneDepth;
    public final boolean usesSliderCapability;
    public final boolean usesTouchService;
    public final boolean usesWOLF;
    public final boolean usesWorldTracking;
    public final boolean usesWorldTrackingEnvironmentLight;
    public final boolean verticalTrackableDetectionNeeded;

    public static native EffectManifest createFromDir(String str);

    private native List nativeGetEnabledCapabilities();

    private native boolean nativeGetServiceNeeded(int i);

    public List getEnabledCapabilities() {
        if (this.mHybridData != null) {
            return nativeGetEnabledCapabilities();
        }
        return Collections.emptyList();
    }

    public boolean getServiceNeeded(C312446eR r2) {
        if (this.mHybridData != null) {
            return nativeGetServiceNeeded(r2.ordinal());
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EffectManifest(com.facebook.jni.HybridData r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, int r31, int r32) {
        /*
            r3 = this;
            r3.<init>()
            r3.mHybridData = r4
            r3.supportsPortrait = r5
            r3.supportsLandscape = r6
            r3.supportsTapGesture = r7
            r3.supportsPanGesture = r8
            r3.supportsPinchGesture = r9
            r3.supportsRotateGesture = r10
            r3.supportsLongPressGesture = r11
            r3.supportsRawTouchGesture = r12
            r3.usesTouchService = r13
            r3.usesWorldTracking = r14
            r3.usesWorldTrackingEnvironmentLight = r15
            r0 = r16
            r3.usesMultiplane = r0
            r0 = r17
            r3.usesSceneDepth = r0
            r0 = r18
            r3.usesWOLF = r0
            r0 = r19
            r3.usesGalleryPicker = r0
            r0 = r20
            r3.usesSliderCapability = r0
            r0 = r21
            r3.usesPickerCapability = r0
            r0 = r22
            r3.usesAssistantCapability = r0
            r0 = r23
            r3.usesGeoanchorCapability = r0
            r0 = r24
            r3.frameDataNeeded = r0
            r0 = r25
            r3.sLAMNeeded = r0
            r0 = r26
            r3.horizontalTrackableDetectionNeeded = r0
            r0 = r27
            r3.verticalTrackableDetectionNeeded = r0
            r0 = r28
            r3.realScaleEstimationNeeded = r0
            r0 = r29
            r3.platformAlgorithmDataNeeded = r0
            r0 = r30
            r3.multipleOutputsSupported = r0
            r0 = -1
            r1 = 1
            r2 = r31
            if (r2 == r0) goto L_0x007c
            if (r31 == 0) goto L_0x0079
            if (r2 != r1) goto L_0x007c
            X.8t8 r0 = X.C368668t8.BACK
        L_0x0063:
            r3.specifiedCameraFacing = r0
            r2 = r32
            if (r32 == 0) goto L_0x0076
            if (r2 == r1) goto L_0x0073
            r0 = 2
            if (r2 != r0) goto L_0x0076
            X.8t9 r0 = X.C368678t9.Y
        L_0x0070:
            r3.frameFormatForPostProcessing = r0
            return
        L_0x0073:
            X.8t9 r0 = X.C368678t9.YUV
            goto L_0x0070
        L_0x0076:
            X.8t9 r0 = X.C368678t9.A01
            goto L_0x0070
        L_0x0079:
            X.8t8 r0 = X.C368668t8.FRONT
            goto L_0x0063
        L_0x007c:
            X.8t8 r0 = X.C368668t8.UNSPECIFIED
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest.<init>(com.facebook.jni.HybridData, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int):void");
    }

    public EffectManifest() {
        this((HybridData) null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0);
    }
}
