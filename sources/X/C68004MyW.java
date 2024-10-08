package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.MyW  reason: case insensitive filesystem */
public final class C68004MyW extends C249703kE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final CircularImageView A03;

    public C68004MyW(View view) {
        super(view);
        this.A03 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.suggested_channel_row_image);
        this.A02 = Dba.A0E(view, R.id.suggested_channel_row_title);
        this.A01 = Dba.A0E(view, R.id.suggested_channel_row_subtitle);
        this.A00 = Dba.A0E(view, R.id.suggested_channel_row_member_count);
    }
}
