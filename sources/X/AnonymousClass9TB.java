package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;

/* renamed from: X.9TB  reason: invalid class name */
public abstract class AnonymousClass9TB {
    public static final FilterGroupModelImpl A01(FilterModel filterModel) {
        FilterGroupModelImpl filterGroupModelImpl = new FilterGroupModelImpl(new FilterChain(), (PhotoFilter) null, AnonymousClass05K.A01, -1, true);
        filterGroupModelImpl.EWj(filterModel, 8);
        SplitScreenFilter splitScreenFilter = new SplitScreenFilter();
        ColorFilter colorFilter = new ColorFilter(C366508p8.A01(0), true);
        splitScreenFilter.A01 = colorFilter;
        splitScreenFilter.A02 = colorFilter;
        splitScreenFilter.A00 = 1.0f;
        filterGroupModelImpl.EWj(splitScreenFilter, 17);
        return filterGroupModelImpl;
    }

    public static final FilterGroupModelImpl A00() {
        return new FilterGroupModelImpl(new FilterChain(), (PhotoFilter) null, AnonymousClass05K.A00, -1, true);
    }
}
