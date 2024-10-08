package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.UnC  reason: case insensitive filesystem */
public final class C16023UnC extends UBE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgImageView A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16023UnC(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A05 = DbX.A0b(view, R.id.header_image);
        this.A02 = DbX.A0Z(view, R.id.title_text_view);
        this.A01 = DbX.A0Z(view, R.id.title_text_view_smaller);
        this.A04 = DbX.A0a(view, R.id.profile_image);
        this.A03 = DbX.A0Z(view, R.id.username_text_view);
        this.A00 = DbX.A0Z(view, R.id.follower_number_text_view);
    }
}
