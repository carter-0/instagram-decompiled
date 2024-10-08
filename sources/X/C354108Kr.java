package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.8Kr  reason: invalid class name and case insensitive filesystem */
public final class C354108Kr implements C354078Ko {
    public FilterGroupModel A00;
    public final C354028Kj A01;

    public final void DYe() {
        boolean z;
        String filterName;
        Integer num = this.A01.A01;
        if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) {
            z = true;
        } else {
            FilterGroupModel filterGroupModel = this.A00;
            if (filterGroupModel != null) {
                FilterModel B5u = filterGroupModel.B5u(17);
                if (B5u instanceof ColorFilter) {
                    filterName = ((ColorFilter) B5u).A04;
                } else {
                    0qQ.A0C(B5u, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter");
                    SplitScreenFilter splitScreenFilter = (SplitScreenFilter) B5u;
                    FilterModel filterModel = splitScreenFilter.A01;
                    if (filterModel == null && (filterModel = splitScreenFilter.A03) == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    filterName = filterModel.getFilterName();
                }
                z = !0qQ.A0K(filterName, A2R.A00);
            }
            0qQ.A0F("filterGroupModel");
            throw AnonymousClass00P.createAndThrow();
        }
        FilterGroupModel filterGroupModel2 = this.A00;
        if (filterGroupModel2 != null) {
            filterGroupModel2.EWl(17, z);
            return;
        }
        0qQ.A0F("filterGroupModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public C354108Kr(C354028Kj r1) {
        this.A01 = r1;
    }
}
