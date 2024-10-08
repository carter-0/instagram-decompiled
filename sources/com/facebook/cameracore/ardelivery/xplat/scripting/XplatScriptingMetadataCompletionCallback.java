package com.facebook.cameracore.ardelivery.xplat.scripting;

import X.0dV;
import X.CU8;
import com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata;
import com.facebook.jni.HybridData;

public final class XplatScriptingMetadataCompletionCallback {
    public static final CU8 Companion = new Object();
    public final HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(ScriptingPackageMetadata scriptingPackageMetadata);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CU8] */
    static {
        0dV.A0C("ard-scripting-downloader");
    }

    public XplatScriptingMetadataCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
