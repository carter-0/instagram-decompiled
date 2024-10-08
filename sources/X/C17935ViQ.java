package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.ViQ  reason: case insensitive filesystem */
public final class C17935ViQ {
    public IgSimpleImageView A00;
    public IgSimpleImageView A01;
    public final View A02;
    public final ViewStub A03;
    public final ImageView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final ViewStub A08;
    public final ViewStub A09;

    public C17935ViQ(View view) {
        0qQ.A0B(view, 1);
        this.A04 = DbX.A0J(view, R.id.row_search_profile_image);
        View A0G = AnonymousClass7TF.A0G(view, R.id.row_hashtag_container);
        this.A02 = A0G;
        IgTextView A0Z = DbX.A0Z(view, R.id.row_hashtag_textview_tag_name);
        this.A05 = A0Z;
        C13988Tno.A16(A0Z, true);
        this.A06 = DbT.A0a(view, R.id.row_hashtag_textview_tag_subtitle);
        this.A07 = DbT.A0a(view, R.id.row_hashtag_textview_tag_subtitle_ultradense);
        this.A09 = DbU.A0D(view, R.id.selection_toggle_stub);
        this.A08 = DbU.A0D(view, R.id.dismiss_button_stub);
        this.A03 = DbU.A0D(view, R.id.icon_stub);
        C13988Tno.A0q(view.getContext(), A0G, R.attr.backgroundDrawable);
    }

    public final IgSimpleImageView A00() {
        IgSimpleImageView igSimpleImageView = this.A01;
        if (igSimpleImageView != null) {
            return igSimpleImageView;
        }
        IgSimpleImageView A0U = C13989Tnp.A0U(this.A08);
        this.A01 = A0U;
        return A0U;
    }
}
