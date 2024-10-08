package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.AOh  reason: case insensitive filesystem */
public final class C40025AOh implements View.OnLayoutChangeListener {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ RoundedCornerImageView A01;

    public C40025AOh(Bitmap bitmap, RoundedCornerImageView roundedCornerImageView) {
        this.A01 = roundedCornerImageView;
        this.A00 = bitmap;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ? r1 = this.A01;
        r1.setDrawable(this.A00);
        r1.removeOnLayoutChangeListener(r1.A02);
        r1.A02 = null;
    }
}
