package com.facebook.cameracore.ardelivery.model;

import X.0JA;
import X.AnonymousClass80A;

public enum XplatAssetType {
    Unknown(0),
    AREffect(1),
    Async(2),
    StyleTransferEffect(3),
    LegacyEffect(4),
    ARLink(5),
    Remote(6),
    FaceTrackerModel(7),
    HairSegmentationModel(8),
    SegmentationModel(9),
    XRayModel(10),
    FittedExpressionTrackerModel(11),
    MSuggestionsCoreModel(12),
    NametagModel(13),
    PyTorchModel(14),
    Caffe2Model(15),
    MulticlassSegmentationModel(16),
    ScriptingPackage(17),
    Ocr2goCreditCardModel(18),
    RecognitionModel(19),
    AR3DObject(20),
    SparkVision(21),
    FittedExpressionTrackerRuntimeRigRetargetingConfig(22),
    BodyTracking3DModel(23);
    
    public static final XplatAssetType[] cppValueToEnumArray = null;
    public final int mCppValue;

    /* access modifiers changed from: public */
    static {
        int i;
        cppValueToEnumArray = new XplatAssetType[values().length];
        for (XplatAssetType xplatAssetType : values()) {
            cppValueToEnumArray[xplatAssetType.mCppValue] = xplatAssetType;
        }
    }

    public static XplatAssetType fromARRequestAsset(ARRequestAsset aRRequestAsset) {
        AnonymousClass80A r3 = aRRequestAsset.A02;
        ARAssetType aRAssetType = r3.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal == 0) {
            return AREffect;
        }
        if (ordinal == 2) {
            return Async;
        }
        if (ordinal == 3) {
            return Remote;
        }
        if (ordinal == 4) {
            return ScriptingPackage;
        }
        if (ordinal == 1) {
            boolean z = false;
            if (aRAssetType == ARAssetType.SUPPORT) {
                z = true;
            }
            0JA.A09(z, "Cannot get VersionedCapability from Effect Asset");
            VersionedCapability versionedCapability = r3.A00;
            if (versionedCapability != null) {
                return fromVersionedCapability(versionedCapability);
            }
            throw new NullPointerException(String.valueOf("SUPPORT ARRequestAsset should have versioned capability field"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown ARRequestAsset type : ");
        sb.append(aRAssetType);
        throw new IllegalArgumentException(sb.toString());
    }

    public static XplatAssetType ofCppValue(int i) {
        if (i >= 0 && i < values().length) {
            return cppValueToEnumArray[i];
        }
        throw new IllegalArgumentException("Invalid cpp value for AssetType");
    }

    public int getValue() {
        return this.mCppValue;
    }

    /* access modifiers changed from: public */
    XplatAssetType(int i) {
        this.mCppValue = i;
    }

    public static XplatAssetType fromVersionedCapability(VersionedCapability versionedCapability) {
        return versionedCapability.getXplatAssetType();
    }
}
