package X;

import android.opengl.Matrix;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;

/* renamed from: X.8rA  reason: invalid class name and case insensitive filesystem */
public final class C367548rA extends C367538r5 {
    public boolean A00 = true;
    public final float[] A01 = new float[16];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C367548rA(InstagramFilterFactoryProvider instagramFilterFactoryProvider, ColorFilter colorFilter) {
        super(instagramFilterFactoryProvider, colorFilter);
        0qQ.A0B(colorFilter, 1);
        0qQ.A0B(instagramFilterFactoryProvider, 2);
    }

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        ColorFilter colorFilter;
        float[] fArr3;
        0qQ.A0B(filterManagerImpl, 0);
        float[] fArr4 = fArr;
        0qQ.A0B(fArr, 1);
        0qQ.A0B(fArr2, 2);
        if (this.A00) {
            fArr3 = this.A01;
            colorFilter = (ColorFilter) this.A00;
            Matrix.multiplyMM(fArr3, 0, fArr4, 0, colorFilter.A07, 0);
        } else {
            colorFilter = (ColorFilter) this.A00;
            float[] fArr5 = colorFilter.A07;
            fArr3 = this.A01;
            0Yw.A0S(fArr5, fArr3, fArr5.length);
        }
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr3);
        if (!colorFilter.A05) {
            fArr2 = colorFilter.A06;
        }
        filterManagerImpl.setFloatArrayParameter("content_transform", fArr2);
    }

    public final void ACC(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        ColorFilter colorFilter = (ColorFilter) this.A00;
        if (!colorFilter.A01 || 0qQ.A0K(colorFilter.A04, "normal")) {
            filterManagerImpl.setFloatParameter("strength", colorFilter.A00);
            if (0qQ.A0K(colorFilter.A04, "normal")) {
                filterManagerImpl.setBoolParameter("is_blend_enabled", colorFilter.A01);
                return;
            }
            return;
        }
        throw new IllegalStateException("Alpha blending is only supported in the normal color filter");
    }
}
