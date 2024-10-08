package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.DpQ  reason: case insensitive filesystem */
public final class C47034DpQ extends C249703kE {
    public final View A00;
    public final ViewStub A01;
    public final FrameLayout A02;
    public final ConstraintLayout A03;
    public final ConstraintLayout A04;
    public final IgTextView A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final IgImageView A09;
    public final NoteBubbleView A0A;
    public final RoundedCornerConstraintLayout A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47034DpQ(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A05 = DbX.A0Z(view, R.id.label);
        this.A04 = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.button_container);
        this.A07 = DbX.A0b(view, R.id.button);
        this.A06 = DbX.A0b(view, R.id.avatar_image_view);
        this.A03 = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.content_note_avatar_image_view_container);
        this.A09 = DbX.A0b(view, R.id.story_avatar_image_view);
        this.A02 = (FrameLayout) AnonymousClass7TF.A0F(view, R.id.story_button_container);
        this.A01 = (ViewStub) AnonymousClass7TF.A0F(view, R.id.own_reel_badge_stub);
        this.A0B = (RoundedCornerConstraintLayout) AnonymousClass7TF.A0F(view, R.id.content_notes_rounded_image_container);
        this.A08 = DbX.A0b(view, R.id.content_notes_rounded_image_view);
        this.A0A = (NoteBubbleView) AnonymousClass7TF.A0F(view, R.id.add_note_bubble_view);
    }
}
