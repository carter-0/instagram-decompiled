package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ZoomTransitionFilter;

/* renamed from: X.9Zy  reason: invalid class name */
public final class AnonymousClass9Zy extends AnonymousClass9Zz {
    public final void ACC(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        super.ACC(filterManagerImpl);
        ZoomTransitionFilter zoomTransitionFilter = (ZoomTransitionFilter) this.A00;
        filterManagerImpl.setFloatParameter("max_blur", zoomTransitionFilter.A00);
        filterManagerImpl.setFloatParameter("strength", zoomTransitionFilter.A01);
    }
}
