package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Hnn  reason: case insensitive filesystem */
public final class C55807Hnn {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    public C55807Hnn(View view) {
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.row_feed_media_notice);
        this.A02 = DbX.A0J(view, R.id.row_feed_media_notice_icon);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.row_feed_media_notice_text);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.row_feed_media_notice_sub_text);
        this.A01 = DbX.A0J(view, R.id.row_feed_media_notice_chevron);
    }
}
