package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;

/* renamed from: X.9Zn  reason: invalid class name and case insensitive filesystem */
public final class C380779Zn extends C367538r5 {
    public final void ACC(FilterManagerImpl filterManagerImpl) {
    }

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        AnonymousClass7TG.A1N(filterManagerImpl, fArr);
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr);
        filterManagerImpl.setFloatArrayParameter("content_transform", ((SurfaceCropFilterModel) this.A00).A0O);
    }
}
