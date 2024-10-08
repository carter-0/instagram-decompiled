package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class IJC implements AnonymousClass2WT {
    public static final IJC A00 = new IJC();

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.ImageView, java.lang.Object, X.Ge7] */
    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        0qQ.A0B(context, 0);
        ? imageView = new ImageView(context);
        imageView.A00 = AnonymousClass7TE.A0W();
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        C226742hm r1 = (C226742hm) C226722hk.A00().ALv();
        0qQ.A0C(r1, AnonymousClass000.A00(13));
        imageView.setImageDrawable((Drawable) r1);
        return imageView;
    }
}
