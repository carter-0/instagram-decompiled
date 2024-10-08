package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;

/* renamed from: X.Krq  reason: case insensitive filesystem */
public abstract class C63122Krq {
    public static final void A00(FilterChain filterChain, int i, int i2) {
        ColorFilter colorFilter = new ColorFilter(C366508p8.A01(i));
        colorFilter.A00 = ((float) i2) / 100.0f;
        filterChain.A01(colorFilter, 17);
    }
}
