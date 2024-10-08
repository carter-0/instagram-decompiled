package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram;

import X.0dV;
import X.0eO;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C366028o4;
import X.C367518qy;
import X.C377179Kv;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.TextureLoaderWeakPtr;
import com.facebook.jni.HybridData;

public final class IgTextureLoader implements C366028o4 {
    public static final C367518qy Companion = new Object();
    public final AnonymousClass0eM _textureLoaderWeakPtr$delegate = AnonymousClass0eN.A00(0eO.A02, new C377179Kv(this, 7));
    public final HybridData mHybridData = initHybrid();

    private final native void attachNative(IgluConfigHolder igluConfigHolder);

    /* access modifiers changed from: private */
    public final native TextureLoaderWeakPtr createTextureLoaderNative();

    private final native void detachNative();

    public static final native HybridData initHybrid();

    private final native void tryGPULoadingNative();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8qy, java.lang.Object] */
    static {
        0dV.A0C("mediapipeline-iglufilter-instagram");
    }

    public TextureLoaderWeakPtr getTextureLoaderWeakPtr() {
        return (TextureLoaderWeakPtr) this._textureLoaderWeakPtr$delegate.getValue();
    }

    public void detach() {
        detachNative();
    }

    public final void tryGPULoading() {
        tryGPULoadingNative();
    }

    public void attach(IgluConfigHolder igluConfigHolder) {
        attachNative(igluConfigHolder);
    }
}
