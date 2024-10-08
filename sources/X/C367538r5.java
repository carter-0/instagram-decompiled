package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;

/* renamed from: X.8r5  reason: invalid class name and case insensitive filesystem */
public abstract class C367538r5 implements C366548pF {
    public final FilterModel A00;
    public final InstagramFilterFactoryProvider A01;

    public final void ABv(FilterManagerImpl filterManagerImpl, C346337v0 r3, String str) {
        if (this instanceof C380779Zn) {
            0qQ.A0B(filterManagerImpl, 0);
            0qQ.A0B(str, 1);
            0qQ.A0B(r3, 2);
            if ("dual".equals(str)) {
                filterManagerImpl.setTextureInput(str, r3);
            }
        }
    }

    public void AC0(FilterManagerImpl filterManagerImpl) {
        FilterModel filterModel = this.A00;
        if (filterManagerImpl.mCachedModel != filterModel) {
            filterManagerImpl.mCachedModel = filterModel;
            filterManagerImpl.createFilter(this.A01.createFilterFactory(filterModel.getFilterName()));
        }
    }

    public final FilterModel B5t() {
        return this.A00;
    }

    public C367538r5(InstagramFilterFactoryProvider instagramFilterFactoryProvider, FilterModel filterModel) {
        this.A01 = instagramFilterFactoryProvider;
        this.A00 = filterModel;
    }
}
