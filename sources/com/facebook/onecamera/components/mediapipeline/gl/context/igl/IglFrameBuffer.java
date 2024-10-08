package com.facebook.onecamera.components.mediapipeline.gl.context.igl;

import X.0dV;
import X.C346337v0;
import X.C368998tf;
import X.C381069b7;
import X.C393099vt;
import com.facebook.jni.HybridData;

public final class IglFrameBuffer implements C368998tf {
    public static final C393099vt Companion = new Object();
    public static final String TEXTURE_DESCRIPTION = "IglFrameBufferTexture";
    public final int frameBufferId = getFrameBufferIdNative();
    public final int height = getHeightNative();
    public final boolean is10Bit;
    public final HybridData mHybridData;
    public final C346337v0 texture = new C381069b7(getIglTexture());
    public final int width = getWidthNative();

    private final native void bindNative();

    private final native int getFrameBufferIdNative();

    private final native int getHeightNative();

    private final native IglTexture getIglTexture();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native int getWidthNative();

    private final native void releaseNative();

    private final native void unbindNative();

    public void lock() {
    }

    public void unlock() {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9vt] */
    static {
        0dV.A0C("mediapipeline-igl-context");
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public C346337v0 getTexture() {
        return this.texture;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean is10Bit() {
        return this.is10Bit;
    }

    public void release() {
        this.texture.A01();
        releaseNative();
    }

    public IglFrameBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void bind() {
        bindNative();
    }

    public void unbind() {
        unbindNative();
    }
}
