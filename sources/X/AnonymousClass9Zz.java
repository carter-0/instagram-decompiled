package X;

import android.opengl.Matrix;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter;

/* renamed from: X.9Zz  reason: invalid class name */
public abstract class AnonymousClass9Zz extends C367538r5 {
    public final float[] A00 = new float[16];

    public final void ACB(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        0qQ.A0B(filterManagerImpl, 0);
        AnonymousClass7TG.A1O(fArr, fArr2);
        float[] fArr3 = this.A00;
        Matrix.multiplyMM(fArr3, 0, fArr, 0, this.A00.getTextureTransform(), 0);
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr3);
        filterManagerImpl.setFloatArrayParameter("content_transform", fArr2);
    }

    public void ACC(FilterManagerImpl filterManagerImpl) {
        0qQ.A0B(filterManagerImpl, 0);
        filterManagerImpl.setFloatParameter("transition_progress", ((TransitionFilter) this.A00).C9V());
    }

    public AnonymousClass9Zz(InstagramFilterFactoryProvider instagramFilterFactoryProvider, TransitionFilter transitionFilter) {
        super(instagramFilterFactoryProvider, transitionFilter);
    }
}
