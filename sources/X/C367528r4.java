package X;

import android.opengl.Matrix;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;

/* renamed from: X.8r4  reason: invalid class name and case insensitive filesystem */
public final class C367528r4 extends C367538r5 {
    public final float[] A00 = new float[16];

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.A00;
        Matrix.multiplyMM(fArr3, 0, fArr, 0, ((GradientTransformFilter) this.A00).A0C, 0);
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr3);
    }

    public final void ACC(FilterManagerImpl filterManagerImpl) {
        GradientTransformFilter gradientTransformFilter = (GradientTransformFilter) this.A00;
        filterManagerImpl.setFloatArrayParameter("u_topColor", gradientTransformFilter.A08);
        filterManagerImpl.setFloatArrayParameter("u_bottomColor", gradientTransformFilter.A07);
        filterManagerImpl.setBoolParameter("u_isGainmapEnabled", gradientTransformFilter.A05);
        filterManagerImpl.setBoolParameter("u_isInputSamplingDisabled", gradientTransformFilter.A06);
        filterManagerImpl.setFloatParameter("u_inputWidth", gradientTransformFilter.A02);
        filterManagerImpl.setFloatParameter("u_inputHeight", gradientTransformFilter.A01);
        filterManagerImpl.setFloatParameter("u_cornerRadius", gradientTransformFilter.A00);
    }

    public C367528r4(InstagramFilterFactoryProvider instagramFilterFactoryProvider, GradientTransformFilter gradientTransformFilter) {
        super(instagramFilterFactoryProvider, gradientTransformFilter);
    }
}
