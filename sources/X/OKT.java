package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

public final class OKT {
    public ImageView A00;
    public final C333547Zj A01;

    public OKT(View view, C333547Zj r4) {
        0qQ.A0B(r4, 2);
        this.A01 = r4;
        ImageView imageView = (ImageView) 2b1.A01(view.requireViewById(R.id.row_thread_composer_send_silently), false, false).getView();
        this.A00 = imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.A00;
        if (imageView2 != null) {
            C71402Ok1.A00(imageView2, 9, this);
        }
    }

    public final void A00() {
        ImageView imageView = this.A00;
        if (imageView != null) {
            boolean BJG = this.A01.BJG();
            int i = R.drawable.instagram_alert_off_pano_outline_24;
            if (BJG) {
                i = R.drawable.instagram_alert_off_pano_filled_24;
            }
            imageView.setImageResource(i);
        }
    }
}
