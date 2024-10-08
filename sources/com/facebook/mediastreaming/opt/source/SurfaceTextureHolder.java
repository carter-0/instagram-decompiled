package com.facebook.mediastreaming.opt.source;

import android.graphics.SurfaceTexture;

public interface SurfaceTextureHolder {
    int getHeight();

    SurfaceTexture getSurfaceTexture();

    int getWidth();
}
