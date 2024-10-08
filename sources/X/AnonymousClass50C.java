package X;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.VideoView;
import com.instagram.android.R;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import java.util.List;

/* renamed from: X.50C  reason: invalid class name */
public final class AnonymousClass50C extends C249703kE {
    public Drawable A00;
    public AnonymousClass4AB A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final View.OnAttachStateChangeListener A03;
    public final View.OnAttachStateChangeListener A04;
    public final View A05;
    public final IgFrameLayout A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final C252063oV A09;
    public final C67319Mlt A0A = new C67319Mlt(this);
    public final NoteAvatarView A0B;
    public final C13907Tl7 A0C;
    public final /* synthetic */ AnonymousClass4AL A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass50C(View view, AnonymousClass4AL r8) {
        super(view);
        0qQ.A0B(view, 2);
        this.A0D = r8;
        View findViewById = view.findViewById(R.id.pog_root_view);
        this.A05 = findViewById;
        View findViewById2 = view.findViewById(R.id.pog_avatar_view);
        0qQ.A07(findViewById2);
        NoteAvatarView noteAvatarView = (NoteAvatarView) findViewById2;
        this.A0B = noteAvatarView;
        this.A07 = view.findViewById(R.id.pog_name);
        this.A09 = 2b1.A01(findViewById.findViewById(R.id.self_note_reactions_layout), false, false);
        this.A06 = (IgFrameLayout) view.findViewById(R.id.note_pill_container);
        this.A08 = view.findViewById(R.id.note_pill_text);
        C67545Mpf mpf = new C67545Mpf(this, r8);
        this.A0C = mpf;
        this.A04 = new C67547Mph(this, r8);
        this.A03 = new C67546Mpg(this);
        UserSession userSession = r8.A02;
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36326451137492747L)) {
            r8.A00.A09(mpf);
        }
        noteAvatarView.A0F(userSession);
        noteAvatarView.A0H.setBadgeOffset(noteAvatarView.getContext().getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material));
        noteAvatarView.A01.setOnTouchListener(new C67548Mpi(C319726r6.POG, this));
        noteAvatarView.getNoteBubbleView().setOnTouchListener(new C67548Mpi(C319726r6.NOTE_BUBBLE, this));
        noteAvatarView.setLifecycle(r8.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r5.A0O != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C68631NQk A00(X.AnonymousClass4AB r5, X.AnonymousClass50C r6, boolean r7) {
        /*
            java.util.List r1 = r5.A0M
            if (r1 == 0) goto L_0x004d
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
            r4.add(r0)
            goto L_0x0013
        L_0x0028:
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r0 = r6.A0B
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r0.getPromptPogAvatar()
            android.content.Context r2 = r0.getContext()
            X.0qQ.A07(r2)
            X.4AL r0 = r6.A0D
            com.instagram.common.session.UserSession r3 = r0.A02
            int r1 = r4.size()
            r0 = 1
            if (r1 != r0) goto L_0x0045
            boolean r0 = r5.A0O
            r6 = 1
            if (r0 == 0) goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            X.NQk r1 = new X.NQk
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x004d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass50C.A00(X.4AB, X.50C, boolean):X.NQk");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass4AB r12, X.AnonymousClass50C r13) {
        /*
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r6 = r13.A0B
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r0 = r6.A0H
            r4 = 0
            r0.setVisibility(r4)
            com.instagram.direct.inbox.notes.ui.SquareAvatarWithBadgeView r0 = r6.A0G
            r5 = 8
            r0.setVisibility(r5)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r6.A0A
            r0.setVisibility(r5)
            X.4AL r8 = r13.A0D
            X.4AM r9 = r8.A06
            com.instagram.user.model.User r0 = r12.A0A
            java.lang.String r2 = r0.getId()
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
            X.48P r0 = new X.48P
            r0.<init>(r1, r2)
            com.instagram.common.typedurl.ImageUrl r7 = r9.E6y(r0)
            java.util.List r0 = r12.A0I
            r10 = 0
            if (r0 == 0) goto L_0x0036
            java.lang.Object r10 = X.00k.A0J(r0)
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
        L_0x0036:
            java.util.List r1 = r12.A0K
            if (r1 == 0) goto L_0x0047
            X.00k.A0J(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00b3
        L_0x0047:
            r11 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x00a8
            r6.setAlpha(r0)
        L_0x004f:
            java.lang.String r2 = r10.getId()
            com.instagram.common.typedurl.ImageUrl r1 = r10.Bh3()
            X.48P r0 = new X.48P
            r0.<init>(r1, r2)
            com.instagram.common.typedurl.ImageUrl r9 = r9.E6y(r0)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r3 = r6.A0H
            X.0iw r2 = r8.A01
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165235(0x7f070033, float:1.7944681E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.A03(r2, r7, r9, r0)
        L_0x0076:
            boolean r0 = r12.A0Q
            if (r0 == 0) goto L_0x0095
            android.view.View r0 = r13.A05
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            android.text.SpannableString r1 = X.C69989NvT.A00(r0)
        L_0x0087:
            com.instagram.common.ui.base.IgFrameLayout r0 = r13.A06
            X.0qQ.A06(r0)
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r0 = r13.A08
            r0.setText(r1)
            return
        L_0x0095:
            if (r11 == 0) goto L_0x00dd
            android.content.Context r1 = r6.getContext()
            r0 = 2131956242(0x7f131212, float:1.9549034E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            goto L_0x0087
        L_0x00a8:
            r6.setAlpha(r0)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r6.A0H
            X.0iw r0 = r8.A01
            r1.A04(r7, r0)
            goto L_0x0076
        L_0x00b3:
            java.util.Iterator r3 = r1.iterator()
        L_0x00b7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r3.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r2 = r0.getId()
            com.instagram.common.session.UserSession r1 = r8.A02
            java.lang.String r0 = r1.A06
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x00b7
            r11 = 1
            r0 = 1056964608(0x3f000000, float:0.5)
            r6.setAlpha(r0)
            com.instagram.user.model.User r10 = X.AnonymousClass69P.A05(r1)
            goto L_0x004f
        L_0x00dd:
            com.instagram.common.ui.base.IgFrameLayout r0 = r13.A06
            X.0qQ.A06(r0)
            r0.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass50C.A01(X.4AB, X.50C):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36321310062355717L) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36321310062224643L) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass4AB r9, X.AnonymousClass50C r10) {
        /*
            X.4AL r8 = r10.A0D
            boolean r7 = r8.A09
            r4 = 1
            r5 = 0
            if (r7 != 0) goto L_0x001f
            boolean r0 = r9.A0Y
            if (r0 != r4) goto L_0x001f
            com.instagram.common.session.UserSession r3 = r8.A02
            X.0qQ.A0B(r3, r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321310062224643(0x810a0a00092503, double:3.0330809653027523E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r6 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r6 = 0
        L_0x0020:
            if (r7 == 0) goto L_0x0039
            boolean r0 = r9.A0V
            if (r0 == 0) goto L_0x0039
            com.instagram.common.session.UserSession r3 = r8.A02
            X.0qQ.A0B(r3, r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321310062355717(0x810a0a000b2505, double:3.033080965385644E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r6 != 0) goto L_0x003e
            if (r0 == 0) goto L_0x00a0
        L_0x003e:
            com.instagram.common.ui.base.IgTextView r6 = r10.A07
            android.content.Context r8 = r6.getContext()
            r0 = 2130970844(0x7f0408dc, float:1.755041E38)
            int r0 = X.2Yu.A0H(r8, r0)
            android.graphics.drawable.Drawable r7 = r8.getDrawable(r0)
            if (r7 == 0) goto L_0x00a0
            android.graphics.drawable.Drawable r2 = r7.mutate()
            r0 = 2130970270(0x7f04069e, float:1.7549245E38)
            int r0 = X.2Yu.A0H(r8, r0)
            int r1 = r8.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            r2 = 2131165195(0x7f07000b, float:1.79446E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r8.getResources()
            int r0 = r0.getDimensionPixelSize(r2)
            r7.setBounds(r5, r5, r1, r0)
            java.lang.CharSequence r0 = r6.getText()
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            int r2 = r3.length()
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.C263324Kh.A02(r7, r3, r2, r0, r5)
            r6.setText(r3)
            r0 = 0
            r6.setTypeface(r0, r4)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass50C.A02(X.4AB, X.50C):void");
    }

    public static final void A03(AnonymousClass50C r3) {
        NoteAvatarView noteAvatarView = r3.A0B;
        noteAvatarView.A02.setVisibility(8);
        noteAvatarView.A02.removeOnAttachStateChangeListener(r3.A03);
        VideoView videoView = (VideoView) noteAvatarView.A0E.getView();
        videoView.setVideoURI((Uri) null);
        videoView.removeOnAttachStateChangeListener(r3.A04);
        videoView.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
        videoView.setOnErrorListener((MediaPlayer.OnErrorListener) null);
    }

    public static final boolean A04(AnonymousClass4AB r4) {
        List list;
        NotePogVideoDict notePogVideoDict = r4.A08;
        if (notePogVideoDict == null || (list = notePogVideoDict.A03) == null || !(!list.isEmpty())) {
            return false;
        }
        List list2 = r4.A0J;
        if (list2.size() != 1 || !AnonymousClass9IJ.A00(5, list2.get(0))) {
            return false;
        }
        return true;
    }

    public static final boolean A05(AnonymousClass4AB r1, AnonymousClass50C r2) {
        return 0qQ.A0K(r1.A0A.getId(), 0eE.A00(r2.A0D.A02).A00().getId());
    }
}
