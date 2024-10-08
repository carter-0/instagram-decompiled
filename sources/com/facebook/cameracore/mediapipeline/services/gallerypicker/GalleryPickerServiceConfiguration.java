package com.facebook.cameracore.mediapipeline.services.gallerypicker;

import X.C312446eR;
import X.C371618yh;
import X.C371628yi;

public class GalleryPickerServiceConfiguration extends C371618yh {
    public static final C371628yi A01 = new C371628yi(C312446eR.GalleryPickerService);
    public final GalleryPickerServiceDataSource A00;

    public GalleryPickerServiceDataSource getDataSource() {
        return this.A00;
    }

    public GalleryPickerServiceConfiguration(GalleryPickerServiceDataSource galleryPickerServiceDataSource) {
        this.A00 = galleryPickerServiceDataSource;
    }
}
