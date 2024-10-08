package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.7fc  reason: invalid class name and case insensitive filesystem */
public final class C337057fc {
    public C337127fk A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final Matrix A04 = new Matrix();
    public final ViewGroup A05;
    public final AnonymousClass3NM A06;
    public final ConstrainedImageView A07;
    public final ConstrainedImageView A08;

    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public C337057fc(ViewGroup viewGroup, int i) {
        ? r4 = (ConstrainedImageView) viewGroup.requireViewById(R.id.item_emoji);
        ? r2 = (ConstrainedImageView) viewGroup.requireViewById(R.id.item_emoji_overlay);
        this.A05 = viewGroup;
        this.A08 = r4;
        this.A07 = r2;
        Context context = r4.getContext();
        this.A02 = 0nA.A0H(context).densityDpi;
        this.A03 = i;
        r2.setImageResource(R.drawable.right_bottom_triangle);
        AnonymousClass3NG r1 = new AnonymousClass3NG(r4);
        r1.A0C = true;
        r1.A07 = true;
        r1.A04 = new C337067fd(this);
        this.A06 = r1.A00();
        ViewGroup.LayoutParams layoutParams = r4.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        r4.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = r2.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = i;
        r2.setLayoutParams(layoutParams2);
        this.A01 = ((float) i) / ((float) context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen));
    }
}
