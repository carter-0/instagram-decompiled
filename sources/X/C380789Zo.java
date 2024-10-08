package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapAlphaFilter;

/* renamed from: X.9Zo  reason: invalid class name and case insensitive filesystem */
public final class C380789Zo extends C367538r5 {
    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        0qQ.A0B(filterManagerImpl, 0);
        GainmapAlphaFilter gainmapAlphaFilter = (GainmapAlphaFilter) this.A00;
        filterManagerImpl.setFloatArrayParameter("texture_transform", gainmapAlphaFilter.A03);
        filterManagerImpl.setFloatArrayParameter("content_transform", gainmapAlphaFilter.A02);
    }

    public final void ACC(FilterManagerImpl filterManagerImpl) {
    }
}
