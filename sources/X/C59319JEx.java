package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.JEx  reason: case insensitive filesystem */
public final class C59319JEx extends 0Yg implements 0sL {
    public static final C59319JEx A00 = new C59319JEx();

    public C59319JEx() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        View childAt = C51969G9p.A0Q(obj2).getChildAt(0);
        0qQ.A0C(childAt, C273654mx.A00(87));
        ImageView imageView = (ImageView) childAt;
        ImageView.ScaleType scaleType = imageView.getScaleType();
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return C51965G9l.A0f(new C58188Ins(48, scaleType, imageView));
    }
}
