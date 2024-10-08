package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.M9y  reason: case insensitive filesystem */
public final class C66065M9y implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ImageView A03;
    public final /* synthetic */ C62320sa A04;

    public C66065M9y(Bitmap bitmap, View view, View view2, ImageView imageView, C62320sa r5) {
        this.A03 = imageView;
        this.A00 = bitmap;
        this.A02 = view;
        this.A01 = view2;
        this.A04 = r5;
    }

    public final void run() {
        Number number;
        ImageView imageView = this.A03;
        Bitmap bitmap = this.A00;
        View view = this.A02;
        View view2 = this.A01;
        C62320sa r7 = this.A04;
        int measuredWidth = imageView.getMeasuredWidth();
        float A05 = (float) JTT.A05(imageView, R.dimen.abc_dropdownitem_icon_width);
        float f = ((float) measuredWidth) * 0.5f;
        ViewParent parent = imageView.getParent();
        0qQ.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int width = ((View) parent).getWidth();
        Object tag = imageView.getTag();
        if (tag instanceof Integer) {
            number = (Number) tag;
        } else {
            number = null;
        }
        int i = -1;
        int A022 = DbX.A02(number);
        boolean z = false;
        if (A022 == -1) {
            z = true;
            i = 1;
        }
        imageView.setTag(Integer.valueOf(i));
        imageView.setImageBitmap(bitmap);
        imageView.clearAnimation();
        imageView.setX(view.getX());
        imageView.setY(view.getY());
        JTR.A1B(imageView);
        view.setVisibility(8);
        if (view2 != null) {
            view2.setScaleX(0.75f);
            view2.setScaleY(0.75f);
            view2.setAlpha(0.0f);
        }
        imageView.setRotation(0.0f);
        imageView.setVisibility(0);
        imageView.animate().scaleX(0.85f).scaleY(0.85f).y(imageView.getY() + A05).setDuration(150).withEndAction(new MAC(imageView, r7, f, A022, width, measuredWidth, z));
    }
}
