package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class Ez2 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;

    public Ez2(View view) {
        this.A00 = view;
        this.A03 = DbT.A0b(view, R.id.row_newsfeed_media_image);
        this.A02 = Dba.A06(view);
        this.A01 = DbU.A0G(view, R.id.text);
    }
}
