package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.9z4  reason: invalid class name and case insensitive filesystem */
public abstract class C395019z4 {
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter] */
    public static final SurfaceCropFilter A00(FilterGroupModel filterGroupModel, String str) {
        String A0R;
        SurfaceCropFilterModel surfaceCropFilterModel;
        if (filterGroupModel == null) {
            A0R = "FilterGroupModel was null when calling getSurfaceCropFilter()";
        } else {
            FilterModel B5u = filterGroupModel.B5u(3);
            if (!(B5u instanceof SurfaceCropFilterModel) || (surfaceCropFilterModel = (SurfaceCropFilterModel) B5u) == null) {
                A0R = 002.A0R("SurfaceCropFilter was null when calling getSurfaceCropFilter(). FeatureMode is: ", AB4.A01(((FilterGroupModelImpl) filterGroupModel).A03));
            } else {
                ? obj = new Object();
                obj.A00 = surfaceCropFilterModel;
                return obj;
            }
        }
        0kD.A0C(str, A0R, (Throwable) null);
        return null;
    }
}
