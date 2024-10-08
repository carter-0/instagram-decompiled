package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KwY  reason: case insensitive filesystem */
public abstract class C63412KwY {
    public static final Rect A00(View view, IgImageView igImageView, int i, int i2) {
        double width = ((double) view.getWidth()) / 2.8d;
        int bottom = (((igImageView.getBottom() - igImageView.getTop()) - igImageView.getDrawable().getIntrinsicHeight()) / 2) + igImageView.getTop() + i2;
        return new Rect((int) width, bottom, (int) (((double) i) + width), igImageView.getDrawable().getIntrinsicHeight() + bottom);
    }
}
