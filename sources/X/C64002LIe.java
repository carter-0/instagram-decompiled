package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.LIe  reason: case insensitive filesystem */
public abstract class C64002LIe {
    public static final void A01(FilterGroupModel filterGroupModel, Integer num) {
        0qQ.A0B(num, 1);
        TiltShiftFilter tiltShiftFilter = (TiltShiftFilter) filterGroupModel.B5u(19);
        if (tiltShiftFilter != null) {
            tiltShiftFilter.A05 = num;
        }
        A00(filterGroupModel).A06 = num;
        Integer num2 = AnonymousClass05K.A00;
        boolean z = true;
        filterGroupModel.EWl(19, C51969G9p.A1a(num, num2));
        if (num == num2) {
            z = false;
        }
        filterGroupModel.EWl(21, z);
        if (num == num2) {
            A00(filterGroupModel).A00 = 0.0f;
        }
    }

    public static final TiltShiftOverlayFilter A00(FilterGroupModel filterGroupModel) {
        FilterModel B5u = filterGroupModel.B5u(21);
        if (B5u != null) {
            return (TiltShiftOverlayFilter) B5u;
        }
        throw AnonymousClass7TE.A0y();
    }
}
