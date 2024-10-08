package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.textview.UpdatableButton;

/* renamed from: X.Myv  reason: case insensitive filesystem */
public final class C68029Myv extends C249703kE {
    public final ImageView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final UpdatableButton A05;

    public C68029Myv(View view) {
        super(view);
        this.A04 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.suggested_channel_image);
        this.A03 = Dba.A0E(view, R.id.suggested_channels_title);
        this.A02 = Dba.A0E(view, R.id.suggested_channels_subtitle);
        this.A01 = Dba.A0E(view, R.id.suggested_channels_member_count);
        this.A05 = (UpdatableButton) AnonymousClass7TE.A0b(view, R.id.suggested_channels_join_button);
        this.A00 = (ImageView) AnonymousClass7TE.A0b(view, R.id.suggested_channels_dismiss_button);
    }
}
