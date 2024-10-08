package X;

import android.graphics.PointF;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;

/* renamed from: X.9Zq  reason: invalid class name and case insensitive filesystem */
public final class C380809Zq extends C367538r5 {
    public final void ACC(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        TiltShiftOverlayFilter tiltShiftOverlayFilter = (TiltShiftOverlayFilter) this.A00;
        filterManagerImpl.setIntParameter(DatePickerDialogModule.ARG_MODE, AE9.A01(tiltShiftOverlayFilter.A06));
        filterManagerImpl.setIntParameter(AnonymousClass000.A00(2703), 1);
        filterManagerImpl.setFloatParameter(AnonymousClass000.A00(3711), tiltShiftOverlayFilter.A00);
        Integer num = tiltShiftOverlayFilter.A06;
        if (num == AnonymousClass05K.A01) {
            PointF pointF = tiltShiftOverlayFilter.A05;
            filterManagerImpl.setFloatArrayParameter("center", new float[]{pointF.x, pointF.y});
            filterManagerImpl.setFloatParameter("radius", tiltShiftOverlayFilter.A01);
        } else if (num == AnonymousClass05K.A0C) {
            PointF pointF2 = tiltShiftOverlayFilter.A04;
            filterManagerImpl.setFloatArrayParameter("center", new float[]{pointF2.x, pointF2.y});
            filterManagerImpl.setFloatParameter("radius", tiltShiftOverlayFilter.A03);
            filterManagerImpl.setFloatParameter("angle", -tiltShiftOverlayFilter.A02);
        }
    }

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        AnonymousClass7TG.A1T(filterManagerImpl, fArr, fArr2);
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr);
        filterManagerImpl.setFloatArrayParameter("content_transform", fArr2);
    }
}
