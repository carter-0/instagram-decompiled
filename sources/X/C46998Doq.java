package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.Doq  reason: case insensitive filesystem */
public final class C46998Doq extends C249703kE {
    public final IgLinearLayout A00;
    public final CircularImageView A01;
    public final IgImageView A02;
    public final NoteBubbleView A03;
    public final RoundedCornerConstraintLayout A04;

    public C46998Doq(View view) {
        super(view);
        this.A00 = (IgLinearLayout) AnonymousClass7TE.A0b(view, R.id.row_container);
        this.A01 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.avatar_image_view);
        this.A04 = (RoundedCornerConstraintLayout) AnonymousClass7TE.A0b(view, R.id.content_notes_rounded_image_container);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.content_notes_rounded_image_view);
        this.A03 = (NoteBubbleView) AnonymousClass7TE.A0b(view, R.id.add_note_bubble_view);
    }
}
