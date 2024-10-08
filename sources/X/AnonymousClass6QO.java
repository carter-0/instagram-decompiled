package X;

import android.widget.ImageView;

/* renamed from: X.6QO  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass6QO {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        try {
            iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        A00 = iArr;
        AnonymousClass05K.A00(7);
        AnonymousClass05K.A00(3);
    }
}
