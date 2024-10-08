package X;

import android.graphics.PointF;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;

/* renamed from: X.9Zp  reason: invalid class name and case insensitive filesystem */
public final class C380799Zp extends C367538r5 {
    public final void ACC(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        TiltShiftFilter tiltShiftFilter = (TiltShiftFilter) this.A00;
        filterManagerImpl.setIntParameter(DatePickerDialogModule.ARG_MODE, AE9.A01(tiltShiftFilter.A05));
        Integer num = tiltShiftFilter.A05;
        if (num == AnonymousClass05K.A01) {
            PointF pointF = tiltShiftFilter.A04;
            filterManagerImpl.setFloatArrayParameter("center", new float[]{pointF.x, pointF.y});
            filterManagerImpl.setFloatParameter("radius", tiltShiftFilter.A00);
        } else if (num == AnonymousClass05K.A0C) {
            PointF pointF2 = tiltShiftFilter.A03;
            filterManagerImpl.setFloatArrayParameter("center", new float[]{pointF2.x, pointF2.y});
            filterManagerImpl.setFloatParameter("radius", tiltShiftFilter.A02);
            filterManagerImpl.setFloatParameter("angle", -tiltShiftFilter.A01);
        }
    }

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        AnonymousClass7TG.A1T(filterManagerImpl, fArr, fArr2);
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr);
        filterManagerImpl.setFloatArrayParameter("content_transform", fArr2);
    }
}
