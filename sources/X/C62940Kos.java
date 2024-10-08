package X;

import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Kos  reason: case insensitive filesystem */
public abstract class C62940Kos {
    public ImageView A00;
    public TextView A01;
    public C71662eb A02;

    public final void A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            this.A02.A03(0);
            ImageView imageView = this.A00;
            imageView.getClass();
            imageView.setImageResource(R.drawable.instagram_user_circle_pano_filled_24);
            this.A00.setVisibility(0);
            TextView textView = this.A01;
            textView.getClass();
            textView.setVisibility(8);
        } else if (intValue == 0) {
            this.A02.A03(0);
            ImageView imageView2 = this.A00;
            imageView2.getClass();
            imageView2.setImageResource(R.drawable.instagram_shopping_bag_pano_filled_24);
            this.A00.setVisibility(0);
            TextView textView2 = this.A01;
            textView2.getClass();
            textView2.setText(2131976659);
            this.A01.setVisibility(0);
        } else if (intValue == 2) {
            this.A02.A03(8);
        }
    }
}
