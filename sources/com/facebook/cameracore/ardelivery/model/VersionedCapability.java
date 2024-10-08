package com.facebook.cameracore.ardelivery.model;

import X.0KC;
import X.C2809455e;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public enum VersionedCapability {
    Facetracker(r3, 1, r5),
    HandTracker(r9, 2, r11),
    Segmentation(r9, 3, XplatAssetType.SegmentationModel),
    HairSegmentation(r9, 4, XplatAssetType.HairSegmentationModel),
    XRay(r9, 5, XplatAssetType.XRayModel),
    RingTryOn(r9, 6, r11),
    FaceExpressionFitting(r3, 7, XplatAssetType.FittedExpressionTrackerModel),
    MSuggestionsCore(r9, 8, XplatAssetType.MSuggestionsCoreModel),
    GazeCorrection(r9, 9, r11),
    Nametag(r9, 10, XplatAssetType.NametagModel),
    BiBytedoc(r17, 11, r19),
    BiDeepText(r9, 12, r11),
    PytorchTest(r17, 13, r19),
    BiXray(r17, 14, r19),
    BodyTracking(r9, 15, r11),
    Safechat(r17, 16, r19),
    IiReducedFaceTracker(r17, 17, r19),
    MulticlassSegmentation(r11, 18, XplatAssetType.MulticlassSegmentationModel),
    EnlightenGAN(r17, 19, r19),
    SceneUnderstanding(r11, 20, r19),
    Ocr2goCreditCard(r17, 21, XplatAssetType.Ocr2goCreditCardModel),
    IiIdDetector(r17, 22, r19),
    Recognition(r9, 23, XplatAssetType.RecognitionModel),
    IGReelsXRay(r17, 24, r19),
    SkySegmentation(r9, 25, r11),
    DepthEstimation(r17, 26, r19),
    IiFaceTracker(r3, 27, r5),
    HandGesture(r17, 28, r19),
    FaceWave(r7, 29, r9),
    Saliency(r17, 30, r19),
    MultitaskPeopleSegmentation(r7, 31, r9),
    EgoDetectorTracker(r17, 32, r19),
    FaceExpressionFittingRTRRetargeting(r3, 33, XplatAssetType.FittedExpressionTrackerRuntimeRigRetargetingConfig),
    VideoHighlights(r17, 34, r19),
    MobileVisionImageUnderstanding(r3, 35, r5),
    VideoHighlightsTemporal(r17, 36, r19),
    MetaDetTrack(r3, 37, r5),
    SegmentAnything(r17, 38, r19),
    UTwoNet(r3, 39, r5),
    BodyTracking3D(r17, 40, XplatAssetType.BodyTracking3DModel);
    
    public static final String TAG = "VersionedCapability";
    public static final Map UPPER_STRING_TO_CAPABILITY_MAP = null;
    public static final SparseArray XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = null;
    public final XplatAssetType mAssetType;
    public final C2809455e mMLFrameworkType;
    public final int mXplatValue;

    /* access modifiers changed from: public */
    static {
        XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = new SparseArray(values().length + 1);
        UPPER_STRING_TO_CAPABILITY_MAP = new HashMap();
        for (VersionedCapability versionedCapability : values()) {
            UPPER_STRING_TO_CAPABILITY_MAP.put(versionedCapability.name().toUpperCase(Locale.US), versionedCapability);
            XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.put(versionedCapability.getXplatValue(), versionedCapability);
        }
    }

    public static VersionedCapability fromServerValue(String str) {
        VersionedCapability versionedCapability = (VersionedCapability) UPPER_STRING_TO_CAPABILITY_MAP.get(str.toUpperCase(Locale.US));
        if (versionedCapability != null) {
            return versionedCapability;
        }
        0KC.A0Q(TAG, "Unsupported capability: %s", new Object[]{str});
        return null;
    }

    public static VersionedCapability fromXplatValue(int i) {
        return (VersionedCapability) XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.get(i);
    }

    public C2809455e getMLFrameworkType() {
        return this.mMLFrameworkType;
    }

    public XplatAssetType getXplatAssetType() {
        return this.mAssetType;
    }

    public int getXplatValue() {
        return this.mXplatValue;
    }

    /* access modifiers changed from: public */
    VersionedCapability(C2809455e r3, int i, XplatAssetType xplatAssetType) {
        this.mMLFrameworkType = r3;
        this.mXplatValue = i;
        this.mAssetType = xplatAssetType;
    }

    public String toServerValue() {
        return name();
    }
}
