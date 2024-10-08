package com.instagram.direct.inbox.notes.creation;

import X.0qQ;
import X.AnonymousClass0iw;
import X.C252063oV;
import X.DbT;
import X.DbU;
import X.DbV;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

public final class NotesCreationPogView extends IgLinearLayout {
    public CardView A00;
    public IgFrameLayout A01;
    public CircularImageView A02;
    public CircularImageView A03;
    public RoundedCornerImageView A04;
    public C252063oV A05;
    public C252063oV A06;
    public ReelAvatarWithBadgeView A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NotesCreationPogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void setAvatarView(ReelAvatarWithBadgeView reelAvatarWithBadgeView) {
        0qQ.A0B(reelAvatarWithBadgeView, 0);
        this.A07 = reelAvatarWithBadgeView;
    }

    public final void setCircleView(CircularImageView circularImageView) {
        0qQ.A0B(circularImageView, 0);
        this.A02 = circularImageView;
    }

    public final void setProfilePhotoPog(ImageUrl imageUrl, AnonymousClass0iw r4) {
        0qQ.A0B(r4, 1);
        this.A07.setSingleAvatarUrlAndVisibility(imageUrl, r4);
        A00(this);
        this.A07.setVisibility(0);
    }

    public final void setSimpleVideoLayoutView(C252063oV r2) {
        0qQ.A0B(r2, 0);
        this.A05 = r2;
    }

    public final void setSquareView(RoundedCornerImageView roundedCornerImageView) {
        0qQ.A0B(roundedCornerImageView, 0);
        this.A04 = roundedCornerImageView;
    }

    public final void setVideoView(C252063oV r2) {
        0qQ.A0B(r2, 0);
        this.A06 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A00(NotesCreationPogView notesCreationPogView) {
        notesCreationPogView.A07.setVisibility(8);
        notesCreationPogView.A02.setVisibility(8);
        notesCreationPogView.A04.setVisibility(8);
        notesCreationPogView.A00.setVisibility(8);
        notesCreationPogView.A05.setVisibility(8);
        notesCreationPogView.A06.setVisibility(8);
        notesCreationPogView.A01.setVisibility(8);
        notesCreationPogView.A03.setVisibility(8);
    }

    public final ReelAvatarWithBadgeView getAvatarView() {
        return this.A07;
    }

    public final CircularImageView getCircleView() {
        return this.A02;
    }

    public final C252063oV getSimpleVideoLayoutView() {
        return this.A05;
    }

    public final RoundedCornerImageView getSquareView() {
        return this.A04;
    }

    public final C252063oV getVideoView() {
        return this.A06;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotesCreationPogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View A0D = DbT.A0D(LayoutInflater.from(context), this, R.layout.layout_notes_creation_pog_view, false);
        this.A07 = (ReelAvatarWithBadgeView) A0D.requireViewById(R.id.avatar);
        this.A02 = DbU.A0X(A0D, R.id.circle_pog_in_note_creation);
        this.A04 = (RoundedCornerImageView) A0D.requireViewById(R.id.square_pog_in_note_creation);
        this.A00 = (CardView) A0D.requireViewById(R.id.video_preview_container);
        this.A06 = DbV.A0T(A0D, R.id.notes_video_view_stub, false);
        this.A05 = DbV.A0T(A0D, R.id.notes_video_player_layout_stub, false);
        this.A03 = DbU.A0X(A0D, R.id.note_chat_create_avatar_view);
        this.A01 = (IgFrameLayout) A0D.requireViewById(R.id.note_chat_avatar_container);
        addView(A0D);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NotesCreationPogView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
