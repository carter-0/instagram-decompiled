package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class Ez5 {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final IgImageView A03;

    public Ez5(View view) {
        this.A00 = view;
        this.A01 = DbU.A0F(view, R.id.row_newsfeed_icon);
        this.A02 = DbU.A0G(view, R.id.row_newsfeed_text);
        this.A03 = DbT.A0b(view, R.id.row_newsfeed_media_image);
    }
}
