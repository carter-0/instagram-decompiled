package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class Ez4 {
    public final View A00;
    public final TextView A01;
    public final CircularImageView A02;
    public final IgImageView A03;

    public Ez4(View view) {
        this.A00 = view;
        this.A02 = DbU.A0X(view, R.id.row_newsfeed_user_imageview);
        this.A01 = DbU.A0G(view, R.id.row_newsfeed_text);
        this.A03 = DbT.A0b(view, R.id.row_newsfeed_media_image);
    }
}
