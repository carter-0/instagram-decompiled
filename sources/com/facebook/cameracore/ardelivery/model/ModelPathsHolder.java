package com.facebook.cameracore.ardelivery.model;

import X.0KC;
import X.AnonymousClass8LN;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Map;

public class ModelPathsHolder {
    public static final String TAG = "ModelPathsHolder";
    public static final int UNKNOWN_VERSION = -1;
    public final VersionedCapability mCapability;
    public final Map mModelPaths;
    public final int mVersion;

    public static ModelPathsHolder create(int i, int i2, int[] iArr, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            hashMap.put(AnonymousClass8LN.values()[iArr[i3]], strArr[i3]);
        }
        return new ModelPathsHolder(VersionedCapability.fromXplatValue(i), i2, hashMap);
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public String getModelPath(AnonymousClass8LN r5) {
        String str = (String) this.mModelPaths.get(r5);
        if (str == null) {
            0KC.A0E(TAG, StringFormatUtil.formatStrLocaleSafe("Failed to get model path for model asset type: %s, for capability: %s", r5.name(), this.mCapability.name()));
        }
        return str;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean modelPathsExists(AnonymousClass8LN r2) {
        return this.mModelPaths.containsKey(r2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ModelPathsHolder{mCapability=");
        sb.append(this.mCapability);
        sb.append(", mVersion=");
        sb.append(this.mVersion);
        sb.append(", mModelPaths=");
        sb.append(this.mModelPaths);
        sb.append('}');
        return sb.toString();
    }

    public ModelPathsHolder(VersionedCapability versionedCapability, int i, Map map) {
        this.mCapability = versionedCapability;
        this.mVersion = i;
        this.mModelPaths = map;
    }
}
