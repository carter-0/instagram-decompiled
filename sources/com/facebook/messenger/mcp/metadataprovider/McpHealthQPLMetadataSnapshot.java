package com.facebook.messenger.mcp.metadataprovider;

import X.SBG;
import com.facebook.simplejni.NativeHolder;

public class McpHealthQPLMetadataSnapshot {
    public final NativeHolder mNativeHolder;

    static {
        SBG.A00();
    }

    public McpHealthQPLMetadataSnapshot(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
