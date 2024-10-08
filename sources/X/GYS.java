package X;

import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final /* synthetic */ class GYS extends 03J implements 0sL {
    public static final GYS A00 = new GYS();

    public GYS() {
        super(2, IgImageView.class, "setScaleType", "setScaleType(Landroid/widget/ImageView$ScaleType;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        0qQ.A0B(imageView, 0);
        imageView.setScaleType((ImageView.ScaleType) obj2);
        return C60340gF.A00;
    }
}
