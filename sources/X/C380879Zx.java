package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter;

/* renamed from: X.9Zx  reason: invalid class name and case insensitive filesystem */
public final class C380879Zx extends AnonymousClass9Zz {
    public final void ACC(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        super.ACC(filterManagerImpl);
        BlurTransitionFilter blurTransitionFilter = (BlurTransitionFilter) this.A00;
        filterManagerImpl.setFloatParameter("max_blur", blurTransitionFilter.A01);
        filterManagerImpl.setFloatParameter("brightness", blurTransitionFilter.A00);
    }
}
