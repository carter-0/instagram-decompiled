package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.UDv  reason: case insensitive filesystem */
public final class C14893UDv extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final CircularImageView A02;
    public final C252063oV A03;
    public final ImageView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14893UDv(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.row_container);
        this.A01 = Dba.A0E(view, R.id.row_title);
        this.A02 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.row_primary_image);
        this.A03 = C66581MXm.A0T(view, R.id.row_user_stacked_avatar);
        this.A04 = (ImageView) AnonymousClass7TE.A0b(view, R.id.row_end_image);
    }
}
