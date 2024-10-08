package com.facebook.mediastreaming.opt.source.video;

import X.C20826X0a;
import X.Y9L;
import com.facebook.mediastreaming.opt.common.SurfaceHolder;
import com.facebook.mediastreaming.opt.source.SurfaceTextureHolder;

public interface AndroidVideoInput {
    boolean enableCaptureRenderer();

    C20826X0a getFrameSchedulerFactory();

    void pauseOutputSurface(int i);

    void removeErrorListener(Y9L y9l);

    void resumeOutputSurface(int i);

    void setErrorListener(Y9L y9l);

    void setOutputSurface(int i, SurfaceHolder surfaceHolder);

    void setOutputSurface(SurfaceTextureHolder surfaceTextureHolder, boolean z);

    void startRenderingToOutput();

    void stopRenderingToOutput();
}
