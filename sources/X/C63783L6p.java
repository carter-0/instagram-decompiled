package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.L6p  reason: case insensitive filesystem */
public final class C63783L6p {
    public final ImageView A00;
    public final TextView A01;
    public final ColorFilterAlphaImageView A02;

    public C63783L6p(View view) {
        this.A00 = DbU.A0F(view, R.id.family_bridges_feed_unit_header_image);
        this.A01 = DbU.A0G(view, R.id.family_bridges_feed_unit_header_title);
        this.A02 = (ColorFilterAlphaImageView) view.requireViewById(R.id.family_bridges_feed_unit_more_button);
    }
}
