package X;

import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.JEy  reason: case insensitive filesystem */
public final class C59320JEy extends 0Yg implements 0sL {
    public static final C59320JEy A00 = new C59320JEy();

    public C59320JEy() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) C51976G9y.A08((ViewGroup) obj2);
        ImageView.ScaleType scaleType = imageView.getScaleType();
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return C51965G9l.A0f(new C58188Ins(49, scaleType, imageView));
    }
}
