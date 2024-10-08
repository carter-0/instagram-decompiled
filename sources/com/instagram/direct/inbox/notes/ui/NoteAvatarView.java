package com.instagram.direct.inbox.notes.ui;

import X.0Tu;
import X.0qQ;
import X.0yU;
import X.182;
import X.2Su;
import X.2Yu;
import X.2b1;
import X.AnonymousClass00P;
import X.AnonymousClass07V;
import X.AnonymousClass0yP;
import X.AnonymousClass4AJ;
import X.AnonymousClass61R;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C240943Ng;
import X.C249223jK;
import X.C252063oV;
import X.C303756Aq;
import X.C319756rA;
import X.C51965G9l;
import X.C51973G9u;
import X.C62320sa;
import X.C67273Ml8;
import X.C67288MlN;
import X.C67305Mlf;
import X.C67320Mlu;
import X.C71397Ojw;
import X.C73217PYv;
import X.C73252PZW;
import X.C73764PjP;
import X.C73924Pm4;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbX;
import X.DbY;
import X.JTP;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;

public final class NoteAvatarView extends ConstraintLayout {
    public Drawable A00;
    public ViewGroup A01;
    public CardView A02;
    public AnonymousClass61R A03;
    public NoteActivationType A04;
    public IgFrameLayout A05;
    public IgSimpleImageView A06;
    public IgSimpleImageView A07;
    public IgSimpleImageView A08;
    public IgSimpleImageView A09;
    public IgSimpleImageView A0A;
    public CircularImageView A0B;
    public IgImageView A0C;
    public C252063oV A0D;
    public C252063oV A0E;
    public NoteBubbleView A0F;
    public SquareAvatarWithBadgeView A0G;
    public ReelAvatarWithBadgeView A0H;
    public AnonymousClass07V A0I;
    public UserSession A0J;
    public CircularImageView A0K;
    public boolean A0L;
    public final IgImageView A0M;
    public final IgImageView A0N;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoteAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View, com.instagram.direct.inbox.notes.ui.CornerPunchedRoundedCornerImageView] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.View, com.instagram.direct.inbox.notes.ui.CornerPunchedRoundedCornerImageView] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    public final void A0E(Drawable drawable, int i, boolean z) {
        SquareAvatarWithBadgeView squareAvatarWithBadgeView;
        boolean z2;
        ? r1;
        IgSimpleImageView igSimpleImageView = this.A0A;
        if (z) {
            igSimpleImageView.setImageDrawable(drawable);
            ViewGroup.LayoutParams layoutParams = this.A0A.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            z2 = false;
            this.A0H.A02((Drawable) null, 0);
            squareAvatarWithBadgeView = this.A0G;
            Drawable drawable2 = squareAvatarWithBadgeView.A00;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                squareAvatarWithBadgeView.A00 = null;
                r1 = squareAvatarWithBadgeView.A02;
            } else {
                return;
            }
        } else {
            igSimpleImageView.setImageDrawable((Drawable) null);
            this.A0H.A02(drawable, i);
            squareAvatarWithBadgeView = this.A0G;
            Drawable drawable3 = squareAvatarWithBadgeView.A00;
            if (drawable3 != drawable) {
                if (drawable3 != null) {
                    drawable3.setCallback((Drawable.Callback) null);
                }
                squareAvatarWithBadgeView.A00 = drawable;
                ? r12 = squareAvatarWithBadgeView.A02;
                if (drawable != null) {
                    r12.A00 = true;
                    r12.invalidate();
                    drawable.setCallback(squareAvatarWithBadgeView);
                    drawable.setBounds(0, 0, i, i);
                    squareAvatarWithBadgeView.invalidate();
                }
                z2 = false;
                r1 = r12;
            } else {
                return;
            }
        }
        r1.A00 = z2;
        r1.invalidate();
        squareAvatarWithBadgeView.post(new C67320Mlu(squareAvatarWithBadgeView));
        squareAvatarWithBadgeView.invalidate();
    }

    public final void A0F(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        this.A0J = userSession;
        setNoteBubbleView((NoteBubbleView) requireViewById(R.id.pog_note_bubble_view));
        NoteBubbleView noteBubbleView = getNoteBubbleView();
        boolean A072 = C249223jK.A00.A07(userSession);
        0Tu r3 = 0Tu.A05;
        noteBubbleView.A0I(A072, 182.A06(r3, userSession, 36326713131153346L), C249223jK.A05(userSession), 182.A06(r3, userSession, 36330084679827900L));
        boolean A092 = AnonymousClass4AJ.A09(userSession);
        int i = R.id.prompt_note_pog_avatar_view;
        if (A092) {
            i = R.id.prompt_note_pog_avatar_view_square;
        }
        setPromptPogAvatar(DbX.A0b(this, i));
        this.A0H.setForceTrackingForProfileImageEnabled(C51965G9l.A1a(r3, userSession, 36323242797247514L));
        this.A0L = AnonymousClass7TF.A1R(DbS.A04(r3, userSession, 36604949705725058L));
    }

    public final void setAvatar(ReelAvatarWithBadgeView reelAvatarWithBadgeView) {
        0qQ.A0B(reelAvatarWithBadgeView, 0);
        this.A0H = reelAvatarWithBadgeView;
    }

    public final void setAvatarContainer(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        this.A01 = viewGroup;
    }

    public final void setAvatarMediaThumbnail(CircularImageView circularImageView) {
        0qQ.A0B(circularImageView, 0);
        this.A0B = circularImageView;
    }

    public final void setAvatarSimpleVideoLayout(C252063oV r2) {
        0qQ.A0B(r2, 0);
        this.A0D = r2;
    }

    public final void setAvatarVideoView(C252063oV r2) {
        0qQ.A0B(r2, 0);
        this.A0E = r2;
    }

    public final void setAvatarVideoViewContainer(CardView cardView) {
        0qQ.A0B(cardView, 0);
        this.A02 = cardView;
    }

    public final void setAvatarVideoViewLayout(IgFrameLayout igFrameLayout) {
        0qQ.A0B(igFrameLayout, 0);
        this.A05 = igFrameLayout;
    }

    public final void setBadgeDrawableOnClickDelegate(C62320sa r4) {
        0qQ.A0B(r4, 0);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0H;
        reelAvatarWithBadgeView.post(new C73252PZW(reelAvatarWithBadgeView, C73924Pm4.A01(r4, 40)));
        SquareAvatarWithBadgeView squareAvatarWithBadgeView = this.A0G;
        squareAvatarWithBadgeView.post(new C73217PYv(squareAvatarWithBadgeView, C73924Pm4.A01(r4, 41)));
        this.A0A.setOnClickListener(new C71397Ojw(r4, 33));
    }

    public final void setBubbleContent(CharSequence charSequence, boolean z, String str, NoteCustomTheme noteCustomTheme) {
        0qQ.A0B(str, 2);
        if (charSequence == null || charSequence.length() == 0) {
            getNoteBubbleView().setVisibility(8);
            this.A08.setVisibility(8);
        } else {
            getNoteBubbleView().setVisibility(0);
            A00(noteCustomTheme);
        }
        NoteBubbleView noteBubbleView = getNoteBubbleView();
        if (charSequence == null) {
            charSequence = "";
        }
        noteBubbleView.setText(charSequence, z, str, C73924Pm4.A01(this, 42));
        NoteBubbleView.setContentLayout$default(getNoteBubbleView(), 0, 1, (Object) null);
        invalidate();
    }

    public final void setCreationContent(String str) {
        if (str == null || str.length() == 0) {
            getNoteBubbleView().setVisibility(8);
            this.A08.setVisibility(8);
        } else {
            getNoteBubbleView().setVisibility(0);
        }
        NoteBubbleView noteBubbleView = getNoteBubbleView();
        if (str == null) {
            str = "";
        }
        noteBubbleView.setText(str, false, "", C67305Mlf.A00);
        C319756rA.A00(getNoteBubbleView());
        getNoteBubbleView().setContentLayout(2Yu.A08(getContext()));
        invalidate();
    }

    public final void setGroupPogAvatar(CircularImageView circularImageView) {
        0qQ.A0B(circularImageView, 0);
        this.A0K = circularImageView;
    }

    public final void setLifecycle(AnonymousClass07V r2) {
        0qQ.A0B(r2, 0);
        this.A0I = r2;
    }

    public final void setLikeAnimationImageView(IgSimpleImageView igSimpleImageView) {
        0qQ.A0B(igSimpleImageView, 0);
        this.A06 = igSimpleImageView;
    }

    public final void setLocationBubbleContent(String str, CharSequence charSequence, String str2) {
        C51973G9u.A1E(str, charSequence, str2);
        getNoteBubbleView().setVisibility(0);
        getNoteBubbleView().A0D();
        getNoteBubbleView().setLocationContent(str, charSequence, str2);
    }

    public final void setMultiHeartAnimationView(IgSimpleImageView igSimpleImageView) {
        0qQ.A0B(igSimpleImageView, 0);
        this.A07 = igSimpleImageView;
    }

    public final void setMusicBubbleContent(String str, String str2, CharSequence charSequence, boolean z, NoteCustomTheme noteCustomTheme) {
        C51973G9u.A1E(str, str2, charSequence);
        getNoteBubbleView().setVisibility(0);
        if (!(str2.length() == 0 && charSequence.length() == 0)) {
            A00(noteCustomTheme);
        }
        NoteBubbleView noteBubbleView = getNoteBubbleView();
        AnonymousClass07V r0 = this.A0I;
        if (r0 != null) {
            noteBubbleView.setMusicContentLayout(r0);
            getNoteBubbleView().A0F(charSequence, str, str2, z);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void setNoteBubbleView(NoteBubbleView noteBubbleView) {
        0qQ.A0B(noteBubbleView, 0);
        this.A0F = noteBubbleView;
    }

    public final void setNoteCustomActivationView(IgSimpleImageView igSimpleImageView) {
        0qQ.A0B(igSimpleImageView, 0);
        this.A08 = igSimpleImageView;
    }

    public final void setPromptBubbleContent(CharSequence charSequence, boolean z, String str, NoteCustomTheme noteCustomTheme) {
        0qQ.A0B(str, 2);
        if (charSequence == null || charSequence.length() == 0) {
            getNoteBubbleView().setVisibility(8);
            this.A08.setVisibility(8);
        } else {
            getNoteBubbleView().setVisibility(0);
            A00(noteCustomTheme);
        }
        NoteBubbleView noteBubbleView = getNoteBubbleView();
        if (charSequence == null) {
            charSequence = "";
        }
        noteBubbleView.setText(charSequence, z, str, C73924Pm4.A01(this, 43));
        NoteBubbleView.setContentLayout$default(getNoteBubbleView(), 0, 1, (Object) null);
        invalidate();
    }

    public final void setPromptPogAvatar(IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        this.A0C = igImageView;
    }

    public final void setPromptStackedPogAvatar(IgSimpleImageView igSimpleImageView) {
        0qQ.A0B(igSimpleImageView, 0);
        this.A09 = igSimpleImageView;
    }

    public final void setSquareAvatar(SquareAvatarWithBadgeView squareAvatarWithBadgeView) {
        0qQ.A0B(squareAvatarWithBadgeView, 0);
        this.A0G = squareAvatarWithBadgeView;
    }

    public final void setUnsupportedBubbleContent(String str) {
        0qQ.A0B(str, 0);
        getNoteBubbleView().setVisibility(0);
        getNoteBubbleView().setContentLayout(2Yu.A08(getContext()));
        getNoteBubbleView().setText(str, false, "", C73764PjP.A00);
    }

    public final void setVideoBadge(IgSimpleImageView igSimpleImageView) {
        0qQ.A0B(igSimpleImageView, 0);
        this.A0A = igSimpleImageView;
    }

    public static /* synthetic */ void setBubbleContent$default(NoteAvatarView noteAvatarView, CharSequence charSequence, boolean z, String str, NoteCustomTheme noteCustomTheme, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            noteCustomTheme = null;
        }
        noteAvatarView.setBubbleContent(charSequence, z, str, noteCustomTheme);
    }

    public static /* synthetic */ void setLocationBubbleContent$default(NoteAvatarView noteAvatarView, String str, CharSequence charSequence, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        noteAvatarView.setLocationBubbleContent(str, charSequence, str2);
    }

    public static /* synthetic */ void setMusicBubbleContent$default(NoteAvatarView noteAvatarView, String str, String str2, CharSequence charSequence, boolean z, NoteCustomTheme noteCustomTheme, int i, Object obj) {
        if ((i & 16) != 0) {
            noteCustomTheme = null;
        }
        noteAvatarView.setMusicBubbleContent(str, str2, charSequence, z, noteCustomTheme);
    }

    public static /* synthetic */ void setPromptBubbleContent$default(NoteAvatarView noteAvatarView, CharSequence charSequence, boolean z, String str, NoteCustomTheme noteCustomTheme, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            noteCustomTheme = null;
        }
        noteAvatarView.setPromptBubbleContent(charSequence, z, str, noteCustomTheme);
    }

    public final void A0D() {
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0H;
        reelAvatarWithBadgeView.post(new C67273Ml8(reelAvatarWithBadgeView));
        SquareAvatarWithBadgeView squareAvatarWithBadgeView = this.A0G;
        squareAvatarWithBadgeView.post(new C67320Mlu(squareAvatarWithBadgeView));
        this.A0A.setOnClickListener((View.OnClickListener) null);
    }

    public final void A0G(User user) {
        UserSession userSession = this.A0J;
        if (userSession != null && C240943Ng.A02(userSession, user)) {
            UserSession userSession2 = this.A0J;
            if (userSession2 == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            } else if (DbY.A1Y(0Tu.A05, userSession2, 36319510470532554L)) {
                this.A0H.setSingleAvatarBirthdayConfettiAnimation(true);
                this.A0G.setSingleAvatarBirthdayConfettiAnimation(true);
            }
        }
    }

    public final ReelAvatarWithBadgeView getAvatar() {
        return this.A0H;
    }

    public final ViewGroup getAvatarContainer() {
        return this.A01;
    }

    public final IgImageView getAvatarFilledLikeView() {
        return this.A0M;
    }

    public final CircularImageView getAvatarMediaThumbnail() {
        return this.A0B;
    }

    public final C252063oV getAvatarSimpleVideoLayout() {
        return this.A0D;
    }

    public final C252063oV getAvatarVideoView() {
        return this.A0E;
    }

    public final CardView getAvatarVideoViewContainer() {
        return this.A02;
    }

    public final IgFrameLayout getAvatarVideoViewLayout() {
        return this.A05;
    }

    public final IgImageView getFilledLikeView() {
        return this.A0N;
    }

    public final CircularImageView getGroupPogAvatar() {
        return this.A0K;
    }

    public final IgSimpleImageView getLikeAnimationImageView() {
        return this.A06;
    }

    public final AnonymousClass61R getMultiHeartAnimation() {
        return this.A03;
    }

    public final IgSimpleImageView getMultiHeartAnimationView() {
        return this.A07;
    }

    public final NoteBubbleView getNoteBubbleView() {
        NoteBubbleView noteBubbleView = this.A0F;
        if (noteBubbleView != null) {
            return noteBubbleView;
        }
        0qQ.A0F("noteBubbleView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgSimpleImageView getNoteCustomActivationView() {
        return this.A08;
    }

    public final IgImageView getPromptPogAvatar() {
        IgImageView igImageView = this.A0C;
        if (igImageView != null) {
            return igImageView;
        }
        0qQ.A0F("promptPogAvatar");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgSimpleImageView getPromptStackedPogAvatar() {
        return this.A09;
    }

    public final SquareAvatarWithBadgeView getSquareAvatar() {
        return this.A0G;
    }

    public final IgSimpleImageView getVideoBadge() {
        return this.A0A;
    }

    private final void A00(NoteCustomTheme noteCustomTheme) {
        NoteActivationType noteActivationType;
        int color;
        boolean equals;
        String Aej;
        getNoteBubbleView().setCustomTheme(noteCustomTheme);
        if (noteCustomTheme != null) {
            noteActivationType = noteCustomTheme.AYd();
        } else {
            noteActivationType = null;
        }
        this.A04 = noteActivationType;
        if (noteCustomTheme == null || (Aej = noteCustomTheme.Aej()) == null || Aej.length() == 0) {
            Context context = getContext();
            color = context.getColor(2Yu.A02(context));
        } else {
            color = Color.parseColor(noteCustomTheme.Aej());
        }
        AnonymousClass7TE.A1R(this.A0N.getBackground(), color);
        NoteActivationType noteActivationType2 = this.A04;
        String str = null;
        if (noteActivationType2 != null) {
            str = noteActivationType2.name();
        }
        int i = 0;
        if (str == null) {
            equals = false;
        } else {
            equals = str.equals("WNBA_NOTES");
        }
        IgSimpleImageView igSimpleImageView = this.A08;
        if (!equals) {
            i = 8;
        }
        igSimpleImageView.setVisibility(i);
    }

    public final void setMultiHeartAnimation(AnonymousClass61R r1) {
        this.A03 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoteAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        int i2 = 0yU.A07(AnonymousClass0yP.A00(36323474730658994L)) ? R.layout.cf_hub_avatar_view_v2 : R.layout.cf_hub_avatar_view;
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        2Su.A01(from, new ViewGroup.LayoutParams(-2, -1), this, i2, true, this.A0L);
        this.A01 = DbU.A0C(this, R.id.avatar_container);
        this.A0H = (ReelAvatarWithBadgeView) requireViewById(R.id.avatar);
        this.A0G = (SquareAvatarWithBadgeView) requireViewById(R.id.square_avatar);
        this.A02 = (CardView) requireViewById(R.id.video_preview_container);
        this.A05 = (IgFrameLayout) requireViewById(R.id.layout_video_view);
        this.A0E = 2b1.A01(findViewById(R.id.notes_video_view_stub), false, false);
        this.A0D = DbU.A0Y(this, R.id.notes_video_player_layout_stub);
        this.A0B = DbU.A0X(this, R.id.video_view_thumbnail);
        this.A0K = DbU.A0X(this, R.id.group_note_pog_avatar_view);
        this.A09 = JTP.A0T(this, R.id.prompt_note_stacked_pog_avatar_view);
        this.A0A = JTP.A0T(this, R.id.video_badge_view);
        this.A06 = JTP.A0T(this, R.id.like_animation_image_view);
        this.A0N = DbT.A0b(this, R.id.filled_like_view);
        this.A0M = DbT.A0b(this, R.id.avatar_filled_like_view);
        this.A07 = JTP.A0T(this, R.id.multi_heart_animation_view);
        this.A03 = C303756Aq.A00(context, R.raw.story_likes_crowd_noise);
        IgSimpleImageView A0T = JTP.A0T(this, R.id.note_custom_activation_view);
        this.A08 = A0T;
        A0T.setBackground(new C67288MlN());
        setClipChildren(false);
        setClipToPadding(false);
        this.A04 = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoteAvatarView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
