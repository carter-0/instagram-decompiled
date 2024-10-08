package X;

import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Nsn  reason: case insensitive filesystem */
public abstract class C69826Nsn {
    public static float A00(GifUrlImpl gifUrlImpl) {
        float floatValue = gifUrlImpl.A03.floatValue() / gifUrlImpl.A02.floatValue();
        if (Float.isNaN(floatValue)) {
            return 1.0f;
        }
        return floatValue;
    }
}
