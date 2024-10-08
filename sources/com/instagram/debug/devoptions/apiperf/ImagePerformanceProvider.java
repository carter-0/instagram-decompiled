package com.instagram.debug.devoptions.apiperf;

import com.instagram.common.typedurl.ImageUrl;

public interface ImagePerformanceProvider {
    void onEnterViewport();

    void onImageFailure(String str, Object obj);

    void onImageSuccess(String str);

    void onLeaveViewportRendered(ImageUrl imageUrl);

    void onLeaveViewportUnrendered(ImageUrl imageUrl);

    void onRender(long j);
}
