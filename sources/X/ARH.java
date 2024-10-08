package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection.DetectionFilterModel;

public final class ARH implements C366548pF {
    public final InstagramFilterFactoryProvider A00;
    public final DetectionFilterModel A01;

    public final void ABv(FilterManagerImpl filterManagerImpl, C346337v0 r2, String str) {
    }

    public final void AC0(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        DetectionFilterModel detectionFilterModel = this.A01;
        if (filterManagerImpl.mCachedModel != detectionFilterModel) {
            filterManagerImpl.mCachedModel = detectionFilterModel;
            filterManagerImpl.createFilter(this.A00.createFilterFactory(detectionFilterModel.getFilterName()));
        }
    }

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
    }

    public final void ACC(FilterManagerImpl filterManagerImpl) {
    }

    public final FilterModel B5t() {
        return this.A01;
    }

    public ARH(InstagramFilterFactoryProvider instagramFilterFactoryProvider, DetectionFilterModel detectionFilterModel) {
        AnonymousClass7TG.A1O(detectionFilterModel, instagramFilterFactoryProvider);
        this.A01 = detectionFilterModel;
        this.A00 = instagramFilterFactoryProvider;
    }
}
