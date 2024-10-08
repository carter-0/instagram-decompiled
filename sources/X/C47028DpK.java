package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.DpK  reason: case insensitive filesystem */
public final class C47028DpK extends C249703kE {
    public final ViewGroup A00;
    public final LinearLayout A01;
    public final LinearLayout A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final NoteBubbleView A07;
    public final RoundedCornerConstraintLayout A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47028DpK(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = DbX.A0I(view, R.id.direct_share_sheet_grid_view_pog);
        this.A01 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.grid_view_action_pog_avatar_container);
        this.A04 = DbX.A0a(view, R.id.grid_view_action_pog_avatar_view);
        this.A02 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.grid_view_action_label_container);
        this.A03 = DbX.A0Z(view, R.id.grid_view_action_pog_text_view);
        this.A06 = DbX.A0b(view, R.id.grid_view_action_pog_chevron);
        this.A07 = (NoteBubbleView) AnonymousClass7TF.A0F(view, R.id.grid_view_add_note_bubble_view);
        this.A08 = (RoundedCornerConstraintLayout) AnonymousClass7TF.A0F(view, R.id.content_notes_rounded_image_container);
        this.A05 = DbX.A0b(view, R.id.content_notes_rounded_image_view);
    }
}
