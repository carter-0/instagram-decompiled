package X;

import android.widget.ImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Wvi  reason: case insensitive filesystem */
public final /* synthetic */ class C20601Wvi extends 03J implements 0sL {
    public static final C20601Wvi A00 = new C20601Wvi();

    public C20601Wvi() {
        super(2, IgProgressImageView.class, "setScaleType", AnonymousClass000.A00(5220), 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        IgProgressImageView igProgressImageView = (IgProgressImageView) obj;
        ImageView.ScaleType scaleType = (ImageView.ScaleType) obj2;
        AnonymousClass7TG.A1N(igProgressImageView, scaleType);
        igProgressImageView.setScaleType(scaleType);
        return C60340gF.A00;
    }
}
