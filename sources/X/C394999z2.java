package X;

import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.9z2  reason: invalid class name and case insensitive filesystem */
public abstract class C394999z2 {
    public static final PhotoFilter A00(FilterGroupModel filterGroupModel, String str) {
        0qQ.A0B(str, 1);
        if (filterGroupModel == null) {
            0kD.A0C(str, "FilterGroupModel was null when calling getPhotoFilter()", (Throwable) null);
            return null;
        }
        FilterGroupModelImpl filterGroupModelImpl = (FilterGroupModelImpl) filterGroupModel;
        PhotoFilter photoFilter = filterGroupModelImpl.A01;
        if (photoFilter == null) {
            0kD.A0C(str, 002.A0R("PhotoFilter was null when calling getPhotoFilter(). FeatureMode is: ", AB4.A01(filterGroupModelImpl.A03)), (Throwable) null);
        }
        return photoFilter;
    }
}
