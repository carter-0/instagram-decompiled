package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

public final class F37 {
    public final Context A00;
    public final ImageView A01;

    public F37(Context context, ImageView imageView) {
        0qQ.A0B(imageView, 2);
        this.A00 = context;
        this.A01 = imageView;
    }

    public final void A00() {
        this.A01.setVisibility(8);
    }

    public final void A01() {
        ImageView imageView = this.A01;
        imageView.setVisibility(0);
        imageView.setOnClickListener((View.OnClickListener) null);
        imageView.setFocusable(false);
        imageView.setClickable(false);
        imageView.setContentDescription((CharSequence) null);
        imageView.setImageResource(R.drawable.instagram_check_outline_16);
        C49948FGd.A01(imageView, 2Yu.A0H(this.A00, R.attr.igds_color_success));
    }
}
