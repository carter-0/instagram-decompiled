package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.JEz  reason: case insensitive filesystem */
public final class C59321JEz extends 0Yg implements 0sL {
    public static final C59321JEz A00 = new C59321JEz();

    public C59321JEz() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        View childAt = C51969G9p.A0Q(obj2).getChildAt(0);
        0qQ.A0C(childAt, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView");
        ImageView imageView = (ImageView) childAt;
        ImageView.ScaleType scaleType = imageView.getScaleType();
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return C51965G9l.A0f(new GNG(0, scaleType, imageView));
    }
}
