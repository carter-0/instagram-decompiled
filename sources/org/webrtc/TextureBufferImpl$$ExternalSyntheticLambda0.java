package org.webrtc;

import java.util.concurrent.Callable;

public final /* synthetic */ class TextureBufferImpl$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ TextureBufferImpl f$0;

    public /* synthetic */ TextureBufferImpl$$ExternalSyntheticLambda0(TextureBufferImpl textureBufferImpl) {
        this.f$0 = textureBufferImpl;
    }

    public final Object call() {
        TextureBufferImpl textureBufferImpl = this.f$0;
        return textureBufferImpl.yuvConverter.convert(textureBufferImpl);
    }
}
