package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.EzP  reason: case insensitive filesystem */
public final class C49606EzP {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    public C49606EzP(View view) {
        this.A00 = view;
        this.A03 = DbU.A0X(view, R.id.row_user_imageview);
        this.A02 = DbU.A0G(view, R.id.group_subtitle);
        this.A01 = DbU.A0G(view, R.id.group_follow_request_count);
    }
}
