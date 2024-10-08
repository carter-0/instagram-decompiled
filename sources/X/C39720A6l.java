package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.A6l  reason: case insensitive filesystem */
public final class C39720A6l {
    public final View A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final ColorFilterAlphaImageView A03;

    public C39720A6l(View view) {
        this.A00 = view;
        this.A01 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.persisted_reel_container);
        this.A03 = (ColorFilterAlphaImageView) AnonymousClass7TF.A0F(view, R.id.persisted_reel_archive_icon);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.persisted_reel_text);
    }
}
