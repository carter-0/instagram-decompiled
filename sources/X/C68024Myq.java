package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Myq  reason: case insensitive filesystem */
public final class C68024Myq extends C249703kE {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final C252063oV A03;
    public final GradientSpinnerAvatarView A04;
    public final /* synthetic */ C68621NPr A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68024Myq(View view, C68621NPr nPr) {
        super(view);
        this.A05 = nPr;
        this.A00 = view;
        this.A04 = (GradientSpinnerAvatarView) AnonymousClass7TE.A0b(view, R.id.user_row_image_view);
        this.A02 = Dba.A0E(view, R.id.user_row_text_view);
        this.A01 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.user_row_message_icon);
        this.A03 = C66581MXm.A0T(view, R.id.notes_user_row_subtitle_view_stub);
    }
}
