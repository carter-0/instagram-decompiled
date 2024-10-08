package com.facebook.onecamera.components.mediapipeline.gl.context.igl;

import X.0dV;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C346337v0;
import X.C368998tf;
import X.C393119vv;

public final class IglTextureCreator {
    public static final C393119vv Companion = new Object();
    public final IglContext iglContext;

    public IglTextureCreator(IglContext iglContext2) {
        0qQ.A0B(iglContext2, 1);
        this.iglContext = iglContext2;
    }

    private final native IglFrameBuffer createFrameBufferNative(IglContext iglContext2, boolean z, int i, int i2, int i3, int i4);

    private final native IglTexture createOesTextureNative(IglContext iglContext2, int i, int i2);

    public final C368998tf createFrameBuffer(int i, int i2, C346337v0 r10, boolean z) {
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        if (r10 != null) {
            i3 = r10.A00;
            i4 = r10.A01;
            r10.A00(i, i2);
        } else {
            i3 = -1;
            i4 = -1;
        }
        IglFrameBuffer createFrameBufferNative = createFrameBufferNative(this.iglContext, z, i5, i6, i3, i4);
        if (createFrameBufferNative != null) {
            return createFrameBufferNative;
        }
        throw AnonymousClass7TE.A15("failed to create framebuffer natively");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9vv] */
    static {
        0dV.A0C("mediapipeline-igl-context");
    }

    public static /* synthetic */ IglTexture createOesTexture$default(IglTextureCreator iglTextureCreator, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return iglTextureCreator.createOesTexture(i, i2);
    }

    public final IglTexture createOesTexture(int i, int i2) {
        IglTexture createOesTextureNative = createOesTextureNative(this.iglContext, i, i2);
        if (createOesTextureNative != null) {
            return createOesTextureNative;
        }
        throw AnonymousClass7TE.A15("failed to create oes texture natively");
    }
}
