package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Eyc  reason: case insensitive filesystem */
public final class C49567Eyc {
    public final TextView A00;
    public final TextView A01;
    public final CircularImageView A02;

    public C49567Eyc(View view) {
        this.A02 = (CircularImageView) view.findViewById(R.id.support_inbox_event_row_icon);
        this.A01 = AnonymousClass7TE.A0d(view, R.id.support_inbox_event_row_title);
        this.A00 = AnonymousClass7TE.A0d(view, R.id.support_inbox_event_row_subtitle);
    }
}
