package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.4AL  reason: invalid class name */
public final class AnonymousClass4AL extends C232222tE {
    public final AnonymousClass07V A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final 2el A03;
    public final NotesRepository A04;
    public final AnonymousClass4AF A05;
    public final AnonymousClass4AM A06;
    public final C62320sa A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AnonymousClass4AL(AnonymousClass07V r7, AnonymousClass0iw r8, UserSession userSession, 2el r10, AnonymousClass4AF r11, C62320sa r12, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r7, 4);
        this.A02 = userSession;
        this.A01 = r8;
        this.A08 = z;
        this.A00 = r7;
        this.A05 = r11;
        this.A03 = r10;
        this.A09 = z2;
        this.A07 = r12;
        this.A04 = AnonymousClass43C.A00(userSession);
        this.A06 = new AnonymousClass4AM(userSession);
        this.A0A = 182.A01(0Tu.A05, userSession, 36604949705528447L) > 0;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Context context = layoutInflater.getContext();
        0qQ.A07(context);
        Resources resources = context.getResources();
        0qQ.A07(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.featured_user_story_ring_size);
        Context context2 = layoutInflater.getContext();
        0qQ.A07(context2);
        Resources resources2 = context2.getResources();
        0qQ.A07(resources2);
        return new AnonymousClass50C(2Su.A01(layoutInflater2, new ViewGroup.LayoutParams(dimensionPixelSize, resources2.getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxxlarge)), viewGroup, R.layout.item_pog, false, this.A0A), this);
    }

    /* JADX WARNING: type inference failed for: r7v71, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v240, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x044e, code lost:
        if (X.AnonymousClass4AJ.A08(r4.A02) == false) goto L_0x0450;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04fc, code lost:
        if (X.AnonymousClass50C.A05(r3, r2) == false) goto L_0x04ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0508, code lost:
        if (X.AnonymousClass4AJ.A08(r4.A02) == false) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0540, code lost:
        if (X.AnonymousClass4AJ.A02(r9) == false) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0705, code lost:
        if (X.0mp.A00(r13) > 3) goto L_0x0707;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f0, code lost:
        if (r10 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x091c, code lost:
        if (X.0mp.A00(r16) > 3) goto L_0x091e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x095f, code lost:
        if (r15 == false) goto L_0x054c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0575  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0926  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0929  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x09da  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x09f8  */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0b1f  */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0b2f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r38, X.C249703kE r39) {
        /*
            r37 = this;
            r2 = r39
            r3 = r38
            X.4AB r3 = (X.AnonymousClass4AB) r3
            X.50C r2 = (X.AnonymousClass50C) r2
            r1 = 0
            X.0qQ.A0B(r3, r1)
            r5 = 1
            X.0qQ.A0B(r2, r5)
            r0 = r37
            boolean r9 = r0.A08
            X.30a r10 = r3.A00
            com.instagram.api.schemas.NotePogVideoDict r6 = r3.A08
            r18 = 0
            if (r6 == 0) goto L_0x0047
            X.4AL r12 = r2.A0D
            com.instagram.common.session.UserSession r11 = r12.A02
            X.0Tu r4 = X.0Tu.A05
            r7 = 36324569941946530(0x810d01000230a2, double:3.035142526365356E-306)
            boolean r0 = X.182.A06(r4, r11, r7)
            if (r0 == 0) goto L_0x0047
            r7 = 36606044918715744(0x820d0100031560, double:3.213148435082964E-306)
            X.182.A01(r4, r11, r7)
            if (r10 == 0) goto L_0x00f8
            X.0iw r0 = r12.A01
            java.lang.String r7 = r0.getModuleName()
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r4 = r2.A0B
            X.Mly r0 = new X.Mly
            r0.<init>(r11, r4, r7)
            r10.A00(r0)
        L_0x0047:
            boolean r0 = r3.A0S
            r19 = r0
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r3.A0R
            if (r0 != 0) goto L_0x00f0
            X.4AL r4 = r2.A0D
            com.instagram.common.session.UserSession r8 = r4.A02
            boolean r0 = X.AnonymousClass4AJ.A0E(r8)
            if (r0 == 0) goto L_0x00f0
            if (r10 == 0) goto L_0x00f4
            com.instagram.direct.inbox.notes.NotesRepository r7 = r4.A04
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r4 = r2.A0B
            X.Ozg r0 = new X.Ozg
            r0.<init>(r8, r7, r4)
            r10.A00(r0)
        L_0x0069:
            X.30Y r8 = r10.A01()
        L_0x006d:
            X.4AL r4 = r2.A0D
            X.2el r7 = r4.A03
            android.view.View r0 = r2.A05
            r36 = r0
            r7.A05(r0, r8)
            r2.A01 = r3
            android.view.ViewGroup$LayoutParams r7 = r36.getLayoutParams()
            if (r7 == 0) goto L_0x008a
            if (r9 == 0) goto L_0x0085
            r0 = -1
            r7.width = r0
        L_0x0085:
            r0 = r36
            r0.setLayoutParams(r7)
        L_0x008a:
            if (r6 != 0) goto L_0x008f
            X.AnonymousClass50C.A03(r2)
        L_0x008f:
            com.instagram.common.ui.base.IgTextView r9 = r2.A07
            r0 = r18
            r9.setTypeface(r0, r1)
            boolean r0 = r3.A0R
            r16 = r0
            r0 = 8
            if (r16 == 0) goto L_0x00fc
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r11 = r2.A0B
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r7 = r11.A0H
            r7.setVisibility(r0)
            com.instagram.direct.inbox.notes.ui.SquareAvatarWithBadgeView r7 = r11.A0G
            r7.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r11.getPromptPogAvatar()
            r7.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r15 = r11.A09
            X.NQk r8 = X.AnonymousClass50C.A00(r3, r2, r5)
            int r10 = r3.A05
            r14 = 4
            r7 = 3
            if (r10 <= r7) goto L_0x00be
            r7 = 4
        L_0x00be:
            android.content.Context r21 = r11.getContext()
            java.util.List r13 = java.util.Collections.nCopies(r7, r8)
            android.content.res.Resources r8 = r21.getResources()
            r7 = 2131165235(0x7f070033, float:1.7944681E38)
            int r25 = r8.getDimensionPixelSize(r7)
            java.lang.Integer r22 = X.AnonymousClass05K.A00
            r24 = 1064011039(0x3f6b851f, float:0.92)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r8 = 0
        L_0x00dc:
            int r7 = r13.size()
            int r7 = java.lang.Math.min(r14, r7)
            if (r8 >= r7) goto L_0x041a
            java.lang.Object r7 = r13.get(r8)
            r12.add(r7)
            int r8 = r8 + 1
            goto L_0x00dc
        L_0x00f0:
            if (r10 == 0) goto L_0x00f4
            goto L_0x0069
        L_0x00f4:
            r8 = r18
            goto L_0x006d
        L_0x00f8:
            r10 = r18
            goto L_0x0047
        L_0x00fc:
            if (r19 == 0) goto L_0x0151
            java.util.List r7 = r3.A0M
            if (r7 == 0) goto L_0x0151
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r8 = r2.A0B
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r7 = r8.A0H
            r7.setVisibility(r0)
            com.instagram.direct.inbox.notes.ui.SquareAvatarWithBadgeView r7 = r8.A0G
            r7.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r7 = r8.A09
            r7.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r8.getPromptPogAvatar()
            r7.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r8.getPromptPogAvatar()
            X.NQk r7 = X.AnonymousClass50C.A00(r3, r2, r1)
            r8.setImageDrawable(r7)
            java.lang.Integer r11 = r3.A0D
            if (r11 == 0) goto L_0x0149
            int r7 = r11.intValue()
            android.content.res.Resources r10 = r36.getResources()
            r8 = 2131970845(0x7f134b1d, float:1.9578653E38)
            if (r7 > r5) goto L_0x0139
            r8 = 2131970849(0x7f134b21, float:1.957866E38)
        L_0x0139:
            java.lang.Object[] r7 = new java.lang.Object[]{r11}
            java.lang.String r7 = r10.getString(r8, r7)
            r9.setText(r7)
            X.AnonymousClass50C.A02(r3, r2)
            goto L_0x0443
        L_0x0149:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0151:
            boolean r7 = r3.A0Q
            if (r7 == 0) goto L_0x01d2
            java.util.List r8 = r3.A0L
            if (r8 == 0) goto L_0x01d2
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r12 = r2.A0B
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r7 = r12.A0H
            r7.setVisibility(r0)
            com.instagram.direct.inbox.notes.ui.SquareAvatarWithBadgeView r7 = r12.A0G
            r7.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r12.getPromptPogAvatar()
            r7.setVisibility(r1)
            com.instagram.common.ui.base.IgSimpleImageView r7 = r12.A09
            r7.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r12.getPromptPogAvatar()
            r7 = 10
            int r7 = X.0Yv.A1E(r8, r7)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r7)
            java.util.Iterator r13 = r8.iterator()
        L_0x0184:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x0199
            java.lang.Object r8 = r13.next()
            java.lang.String r8 = (java.lang.String) r8
            com.instagram.common.typedurl.SimpleImageUrl r7 = new com.instagram.common.typedurl.SimpleImageUrl
            r7.<init>(r8)
            r10.add(r7)
            goto L_0x0184
        L_0x0199:
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r12.getPromptPogAvatar()
            android.content.Context r21 = r7.getContext()
            X.0qQ.A07(r21)
            com.instagram.common.session.UserSession r8 = r4.A02
            X.NQk r7 = new X.NQk
            r20 = r7
            r22 = r8
            r23 = r10
            r24 = r1
            r25 = r1
            r20.<init>(r21, r22, r23, r24, r25)
            r11.setImageDrawable(r7)
            java.lang.Integer r7 = r3.A0C
            if (r7 == 0) goto L_0x01d0
            int r10 = r7.intValue()
        L_0x01c0:
            android.content.res.Resources r12 = r36.getResources()
            r11 = 2131968534(0x7f134216, float:1.9573965E38)
            if (r10 > r5) goto L_0x01cc
            r11 = 2131968537(0x7f134219, float:1.9573971E38)
        L_0x01cc:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            goto L_0x0436
        L_0x01d0:
            r10 = 0
            goto L_0x01c0
        L_0x01d2:
            if (r19 != 0) goto L_0x0443
            if (r7 != 0) goto L_0x0443
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r11 = r2.A0B
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r11.getPromptPogAvatar()
            r7.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r7 = r11.A09
            r7.setVisibility(r0)
            boolean r7 = X.AnonymousClass50C.A05(r3, r2)
            if (r7 == 0) goto L_0x0366
            boolean r7 = X.AnonymousClass50C.A05(r3, r2)
            if (r7 == 0) goto L_0x0202
            boolean r7 = r4.A09
            if (r7 != 0) goto L_0x0202
            java.util.List r8 = r3.A0N
            if (r8 == 0) goto L_0x0202
            boolean r7 = r8 instanceof java.util.Collection
            if (r7 == 0) goto L_0x02ee
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x02ee
        L_0x0202:
            boolean r7 = r3.A04
            if (r7 == 0) goto L_0x022b
            boolean r7 = r4.A09
            if (r7 != 0) goto L_0x0229
            r7 = 3
            float[] r7 = new float[r7]
            r7 = {1065353216, 1066192077, 1065353216} // fill-array
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofFloat(r7)
            r7 = 500(0x1f4, double:2.47E-321)
            r10.setDuration(r7)
            r7 = 300(0x12c, double:1.48E-321)
            r10.setStartDelay(r7)
            X.Oeb r7 = new X.Oeb
            r7.<init>(r11)
            r10.addUpdateListener(r7)
            r10.start()
        L_0x0229:
            r3.A04 = r1
        L_0x022b:
            android.content.Context r8 = r9.getContext()
            boolean r10 = r4.A09
            r7 = 2130970277(0x7f0406a5, float:1.754926E38)
            if (r10 == 0) goto L_0x0239
            r7 = 2130970310(0x7f0406c6, float:1.7549327E38)
        L_0x0239:
            int r7 = X.2Yu.A0H(r8, r7)
            int r7 = r8.getColor(r7)
            r9.setTextColor(r7)
            android.content.res.Resources r8 = r36.getResources()
            r7 = 2131976968(0x7f136308, float:1.9591072E38)
            if (r10 == 0) goto L_0x0250
            r7 = 2131970848(0x7f134b20, float:1.9578659E38)
        L_0x0250:
            java.lang.String r7 = r8.getString(r7)
            r9.setText(r7)
        L_0x0257:
            if (r6 == 0) goto L_0x03ec
            java.util.List r8 = r6.A03
            if (r8 == 0) goto L_0x03ec
            boolean r7 = r8.isEmpty()
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x03ec
            java.lang.Object r7 = r8.get(r1)
            com.instagram.model.mediasize.VideoVersion r7 = (com.instagram.model.mediasize.VideoVersion) r7
            java.lang.String r14 = r7.A06
            com.instagram.model.mediasize.ImageInfo r7 = r6.A00
            java.util.List r7 = r7.Al9()
            r10 = 0
            if (r7 == 0) goto L_0x02ec
            java.lang.Object r7 = r7.get(r1)
            com.instagram.model.mediasize.ExtendedImageUrl r7 = (com.instagram.model.mediasize.ExtendedImageUrl) r7
            if (r7 == 0) goto L_0x02ec
            java.lang.String r7 = r7.A0A
            if (r7 == 0) goto L_0x02ec
            com.instagram.common.typedurl.SimpleImageUrl r12 = new com.instagram.common.typedurl.SimpleImageUrl
            r12.<init>(r7)
        L_0x0287:
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r7 = r11.A0H
            r7.setVisibility(r0)
            com.instagram.direct.inbox.notes.ui.SquareAvatarWithBadgeView r7 = r11.A0G
            r7.setVisibility(r0)
            androidx.cardview.widget.CardView r7 = r11.A02
            r7.setVisibility(r1)
            com.instagram.common.ui.base.IgSimpleImageView r7 = r11.A0A
            r7.setVisibility(r1)
            if (r12 == 0) goto L_0x02af
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = r11.A0B
            r7.setVisibility(r1)
            com.instagram.common.ui.base.IgFrameLayout r8 = r11.A05
            r7 = 4
            r8.setVisibility(r7)
            com.instagram.common.ui.widget.imageview.CircularImageView r8 = r11.A0B
            X.0iw r7 = r4.A01
            r8.setUrl(r12, r7)
        L_0x02af:
            com.instagram.common.session.UserSession r13 = r4.A02
            boolean r7 = X.AnonymousClass4AJ.A0F(r13)
            if (r7 != 0) goto L_0x02be
            androidx.cardview.widget.CardView r8 = r11.A02
            android.view.View$OnAttachStateChangeListener r7 = r2.A03
            r8.addOnAttachStateChangeListener(r7)
        L_0x02be:
            X.0Tu r12 = X.0Tu.A05
            r7 = 36324569941946530(0x810d01000230a2, double:3.035142526365356E-306)
            boolean r8 = X.182.A06(r12, r13, r7)
            X.3oV r7 = r11.A0D
            android.view.View r7 = r7.getView()
            if (r8 != 0) goto L_0x03df
            r7.setVisibility(r0)
            X.3oV r7 = r11.A0E
            android.view.View r11 = r7.getView()
            android.widget.VideoView r11 = (android.widget.VideoView) r11
            r11.setAudioFocusRequest(r1)
            r7 = 36326025935730134(0x810e54000035d6, double:3.036063302696923E-306)
            boolean r7 = X.182.A06(r12, r13, r7)
            if (r7 == 0) goto L_0x03ba
            goto L_0x0374
        L_0x02ec:
            r12 = r10
            goto L_0x0287
        L_0x02ee:
            java.util.Iterator r10 = r8.iterator()
        L_0x02f2:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x0202
            java.lang.Object r7 = r10.next()
            com.instagram.api.schemas.NoteEmojiReactionInfo r7 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r7
            java.lang.Boolean r8 = r7.A01
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            boolean r7 = X.0qQ.A0K(r8, r7)
            if (r7 == 0) goto L_0x02f2
            com.instagram.common.session.UserSession r10 = r4.A02
            boolean r7 = X.AnonymousClass4AJ.A08(r10)
            if (r7 == 0) goto L_0x0202
            X.61R r8 = r11.A03
            if (r8 == 0) goto L_0x0327
            boolean r7 = r8.isPlaying()
            if (r7 != r5) goto L_0x0327
            r8.stop()
            X.61R r8 = r11.A03
            if (r8 == 0) goto L_0x0327
            r7 = 0
            r8.EL2(r7)
        L_0x0327:
            com.instagram.common.ui.base.IgSimpleImageView r8 = r11.A07
            X.61R r7 = r11.A03
            r8.setImageDrawable(r7)
            com.instagram.common.ui.base.IgSimpleImageView r7 = r11.A07
            android.view.ViewGroup$LayoutParams r12 = r7.getLayoutParams()
            android.content.Context r7 = r11.getContext()
            android.content.res.Resources r8 = r7.getResources()
            r7 = 2131165274(0x7f07005a, float:1.794476E38)
            int r7 = r8.getDimensionPixelSize(r7)
            r12.width = r7
            com.instagram.common.ui.base.IgSimpleImageView r7 = r11.A07
            r7.setVisibility(r1)
            com.instagram.common.ui.base.IgSimpleImageView r8 = r11.A07
            X.PVw r7 = new X.PVw
            r7.<init>(r11)
            r8.post(r7)
            com.instagram.direct.inbox.notes.NotesRepository r7 = r4.A04
            r7.A0B()
            X.60k r10 = X.C3018660j.A01(r10)
            java.lang.String r8 = "consumption"
            java.lang.String r7 = "unseen_likes"
            r10.A0R(r8, r7)
            goto L_0x0202
        L_0x0366:
            com.instagram.user.model.User r7 = r3.A0A
            java.lang.String r7 = r7.B8Q()
            r9.setText(r7)
            X.AnonymousClass50C.A02(r3, r2)
            goto L_0x0257
        L_0x0374:
            java.lang.Class<android.widget.VideoView> r8 = android.widget.VideoView.class
            java.lang.String r7 = "mSHCallback"
            java.lang.reflect.Field r15 = r8.getDeclaredField(r7)     // Catch:{ Exception -> 0x03aa }
            r15.setAccessible(r5)     // Catch:{ Exception -> 0x03aa }
            java.lang.Object r12 = r15.get(r11)     // Catch:{ Exception -> 0x03aa }
            java.lang.String r7 = "null cannot be cast to non-null type android.view.SurfaceHolder.Callback"
            X.0qQ.A0C(r12, r7)     // Catch:{ Exception -> 0x03aa }
            android.view.SurfaceHolder$Callback r12 = (android.view.SurfaceHolder.Callback) r12     // Catch:{ Exception -> 0x03aa }
            java.lang.String r7 = "mMediaPlayer"
            java.lang.reflect.Field r7 = r8.getDeclaredField(r7)     // Catch:{ Exception -> 0x03aa }
            r7.setAccessible(r5)     // Catch:{ Exception -> 0x03aa }
            X.Sab r8 = new X.Sab     // Catch:{ Exception -> 0x03aa }
            r8.<init>(r12, r11, r4, r7)     // Catch:{ Exception -> 0x03aa }
            android.view.SurfaceHolder r7 = r11.getHolder()     // Catch:{ Exception -> 0x03aa }
            r7.removeCallback(r12)     // Catch:{ Exception -> 0x03aa }
            android.view.SurfaceHolder r7 = r11.getHolder()     // Catch:{ Exception -> 0x03aa }
            r7.addCallback(r8)     // Catch:{ Exception -> 0x03aa }
            r15.set(r11, r8)     // Catch:{ Exception -> 0x03aa }
            goto L_0x03ba
        L_0x03aa:
            r7 = move-exception
            java.lang.String r8 = "Error during reflection on VideoView: "
            java.lang.String r7 = r7.getMessage()
            java.lang.String r8 = X.002.A0R(r8, r7)
            java.lang.String r7 = "CFHubPogItemDefinition"
            X.0wb.A03(r7, r8)
        L_0x03ba:
            if (r14 == 0) goto L_0x03c0
            android.net.Uri r10 = X.0cp.A03(r14)
        L_0x03c0:
            r11.setVideoURI(r10)
            boolean r7 = X.AnonymousClass4AJ.A0F(r13)
            if (r7 != 0) goto L_0x03ce
            android.view.View$OnAttachStateChangeListener r7 = r2.A04
            r11.addOnAttachStateChangeListener(r7)
        L_0x03ce:
            X.OgU r7 = new X.OgU
            r7.<init>(r11, r3, r2, r4)
            r11.setOnPreparedListener(r7)
            X.OgQ r7 = new X.OgQ
            r7.<init>(r3, r2)
            r11.setOnErrorListener(r7)
            goto L_0x0443
        L_0x03df:
            r7.setVisibility(r1)
            X.3oV r7 = r11.A0E
            android.view.View r7 = r7.getView()
            r7.setVisibility(r0)
            goto L_0x0443
        L_0x03ec:
            com.instagram.api.schemas.NotePogImageDict r7 = r3.A07
            if (r7 == 0) goto L_0x0416
            java.lang.String r8 = r7.A01
            if (r8 == 0) goto L_0x0416
            int r7 = r8.length()
            if (r7 <= 0) goto L_0x0416
            com.instagram.common.typedurl.SimpleImageUrl r10 = new com.instagram.common.typedurl.SimpleImageUrl
            r10.<init>(r8)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r7 = r11.A0H
            r7.setVisibility(r1)
            com.instagram.direct.inbox.notes.ui.SquareAvatarWithBadgeView r7 = r11.A0G
            r7.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r7 = r11.A0A
            r7.setVisibility(r1)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r8 = r11.A0H
            X.0iw r7 = r4.A01
            r8.setSingleAvatarUrlAndVisibility(r10, r7)
            goto L_0x0443
        L_0x0416:
            X.AnonymousClass50C.A01(r3, r2)
            goto L_0x0443
        L_0x041a:
            X.3b0 r7 = new X.3b0
            r23 = r12
            r26 = r5
            r20 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r15.setImageDrawable(r7)
            com.instagram.common.ui.base.IgSimpleImageView r7 = r11.A09
            r7.setVisibility(r1)
            android.content.res.Resources r12 = r36.getResources()
            r11 = 2131968708(0x7f1342c4, float:1.9574318E38)
            java.lang.Object[] r8 = new java.lang.Object[r5]
        L_0x0436:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r8[r1] = r7
            java.lang.String r7 = r12.getString(r11, r8)
            r9.setText(r7)
        L_0x0443:
            boolean r10 = r4.A09
            if (r10 != 0) goto L_0x0450
            com.instagram.common.session.UserSession r7 = r4.A02
            boolean r7 = X.AnonymousClass4AJ.A08(r7)
            r11 = 1
            if (r7 != 0) goto L_0x0451
        L_0x0450:
            r11 = 0
        L_0x0451:
            boolean r7 = X.AnonymousClass50C.A05(r3, r2)
            if (r7 == 0) goto L_0x048a
            java.util.List r8 = r3.A0N
            if (r8 == 0) goto L_0x048a
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L_0x048a
            if (r11 != 0) goto L_0x046d
            if (r10 == 0) goto L_0x048a
            com.instagram.common.session.UserSession r7 = r4.A02
            boolean r7 = X.AnonymousClass4AJ.A05(r7)
            if (r7 == 0) goto L_0x048a
        L_0x046d:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0476:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x0493
            java.lang.Object r7 = r8.next()
            com.instagram.api.schemas.NoteEmojiReactionInfo r7 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r7
            com.instagram.user.model.User r7 = r7.A00
            if (r7 == 0) goto L_0x0476
            r11.add(r7)
            goto L_0x0476
        L_0x048a:
            r9.setVisibility(r1)
            X.3oV r7 = r2.A09
            r7.setVisibility(r0)
            goto L_0x04ee
        L_0x0493:
            r9.setVisibility(r0)
            X.3oV r7 = r2.A09
            r7.setVisibility(r1)
            android.view.View r8 = r7.getView()
            r7 = 2131441076(0x7f0b35b4, float:1.8504153E38)
            android.view.View r8 = r8.findViewById(r7)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.view.View r7 = r8.getRootView()
            android.content.Context r20 = r7.getContext()
            X.0qQ.A07(r20)
            X.0iw r7 = r4.A01
            java.lang.String r28 = r7.getModuleName()
            r9 = 1098907648(0x41800000, float:16.0)
            android.view.View r7 = r8.getRootView()
            android.content.Context r7 = r7.getContext()
            X.0qQ.A07(r7)
            float r7 = X.C61380mr.A00(r7, r9)
            int r7 = (int) r7
            java.lang.Integer r23 = X.AnonymousClass05K.A00
            r21 = r18
            r22 = r18
            r24 = r18
            r25 = r18
            r26 = r18
            r27 = r18
            r29 = r11
            r30 = r7
            r31 = r5
            r32 = r1
            r33 = r1
            r34 = r5
            r35 = r1
            android.graphics.drawable.Drawable r7 = X.C244283aw.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r8.setImageDrawable(r7)
        L_0x04ee:
            r11 = 0
            if (r19 != 0) goto L_0x04fe
            if (r16 != 0) goto L_0x04fe
            boolean r7 = r3.A0Q
            if (r7 != 0) goto L_0x04fe
            boolean r7 = X.AnonymousClass50C.A05(r3, r2)
            r9 = 0
            if (r7 == 0) goto L_0x04ff
        L_0x04fe:
            r9 = 1
        L_0x04ff:
            if (r10 != 0) goto L_0x050a
            com.instagram.common.session.UserSession r7 = r4.A02
            boolean r7 = X.AnonymousClass4AJ.A08(r7)
            r8 = 1
            if (r7 != 0) goto L_0x050b
        L_0x050a:
            r8 = 0
        L_0x050b:
            java.lang.String r7 = r3.A0E
            if (r7 == 0) goto L_0x051e
            if (r9 != 0) goto L_0x051e
            if (r8 != 0) goto L_0x051d
            if (r10 == 0) goto L_0x051e
            com.instagram.common.session.UserSession r7 = r4.A02
            boolean r7 = X.AnonymousClass4AJ.A05(r7)
            if (r7 == 0) goto L_0x051e
        L_0x051d:
            r11 = 1
        L_0x051e:
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r10 = r2.A0B
            boolean r7 = X.AnonymousClass50C.A04(r3)
            if (r11 == 0) goto L_0x09a3
            if (r7 == 0) goto L_0x099d
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r10.A0M
            r7.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r10.A0N
        L_0x052f:
            r7.setVisibility(r0)
            com.instagram.common.session.UserSession r9 = r4.A02
            X.0qQ.A0B(r9, r5)
            boolean r7 = r3.A0W
            if (r7 == 0) goto L_0x0542
            boolean r7 = X.AnonymousClass4AJ.A02(r9)
            r15 = 1
            if (r7 != 0) goto L_0x0543
        L_0x0542:
            r15 = 0
        L_0x0543:
            boolean r7 = X.AnonymousClass50C.A05(r3, r2)
            r11 = 0
            if (r7 == 0) goto L_0x0931
            if (r15 != 0) goto L_0x0931
        L_0x054c:
            com.instagram.user.model.User r7 = r3.A0A
            r23 = r7
            java.lang.String r8 = r23.getId()
            java.lang.String r7 = r9.A06
            r22 = r7
            boolean r7 = X.0qQ.A0K(r8, r7)
            if (r7 != 0) goto L_0x092e
            boolean r7 = r3.A0T
            if (r7 == 0) goto L_0x092e
            boolean r7 = X.AnonymousClass4AJ.A0A(r9)
            if (r7 == 0) goto L_0x092e
        L_0x0568:
            r14 = 1
        L_0x0569:
            android.content.Context r8 = r10.getContext()
            android.content.res.Resources r12 = r8.getResources()
            r7 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r14 == 0) goto L_0x0578
            r7 = 2131165213(0x7f07001d, float:1.7944637E38)
        L_0x0578:
            int r12 = r12.getDimensionPixelOffset(r7)
            android.content.res.Resources r13 = r8.getResources()
            r7 = 2131165207(0x7f070017, float:1.7944625E38)
            if (r14 == 0) goto L_0x0588
            r7 = 2131165218(0x7f070022, float:1.7944647E38)
        L_0x0588:
            int r13 = r13.getDimensionPixelOffset(r7)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r7 = r10.A0H
            r7.setBadgeOffset(r13)
            if (r15 == 0) goto L_0x0929
            r13 = 28
            X.9MH r7 = new X.9MH
            r7.<init>((int) r13, (java.lang.Object) r10, (java.lang.Object) r4, (java.lang.Object) r3)
            r10.setBadgeDrawableOnClickDelegate(r7)
        L_0x059d:
            if (r6 == 0) goto L_0x0926
            java.util.List r7 = r6.A03
            if (r7 == 0) goto L_0x0926
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ 1
        L_0x05a9:
            r10.A0E(r11, r12, r7)
            r7 = r23
            r10.A0G(r7)
            java.lang.String r11 = ""
            r12 = r18
            r10.setBubbleContent(r12, r1, r11, r12)
            java.util.List r7 = r3.A0J
            r21 = r7
            java.util.Iterator r20 = r21.iterator()
        L_0x05c0:
            boolean r7 = r20.hasNext()
            if (r7 == 0) goto L_0x09b4
            java.lang.Object r14 = r20.next()
            X.913 r14 = (X.AnonymousClass913) r14
            X.0qQ.A0B(r14, r1)
            com.instagram.direct.inbox.notes.NotesRepository r7 = r4.A04
            X.0Ud r7 = r7.A0q
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x06a5
            X.4zZ r13 = r14.BWY()
            java.lang.String r12 = r13.A0K
            r7 = r22
            boolean r7 = X.0qQ.A0K(r7, r12)
            if (r7 == 0) goto L_0x06a5
            X.5y2 r7 = r13.A0A
            if (r7 == 0) goto L_0x05f5
            X.60F r7 = r7.A0B
            if (r7 != 0) goto L_0x06a5
        L_0x05f5:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r7 = r10.getNoteBubbleView()
            r7.setVisibility(r1)
            com.instagram.common.ui.base.IgSimpleImageView r7 = r10.A08
            r7.setVisibility(r0)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r7 = r10.getNoteBubbleView()
            X.C319756rA.A00(r7)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r14 = r10.getNoteBubbleView()
            androidx.cardview.widget.CardView r7 = r14.A03
            if (r7 != 0) goto L_0x0635
            android.view.View r12 = r14.A00
            r7 = 2131437078(0x7f0b2616, float:1.8496044E38)
            android.view.View r7 = r12.findViewById(r7)
            android.view.ViewStub r7 = (android.view.ViewStub) r7
            android.view.View r12 = r7.inflate()
            r7 = 2131437077(0x7f0b2615, float:1.8496042E38)
            android.view.View r7 = r12.requireViewById(r7)
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            r14.A03 = r7
            r7 = 2131435629(0x7f0b206d, float:1.8493106E38)
            android.view.View r7 = r12.requireViewById(r7)
            com.instagram.ui.widget.spinner.SpinnerImageView r7 = (com.instagram.ui.widget.spinner.SpinnerImageView) r7
            r14.A0H = r7
        L_0x0635:
            X.07V r12 = r14.A04
            if (r12 == 0) goto L_0x063e
            X.Tl7 r7 = r14.A0e
            r12.A0A(r7)
        L_0x063e:
            X.07V r12 = r14.A04
            if (r12 == 0) goto L_0x0647
            X.Tl7 r7 = r14.A0e
            r12.A09(r7)
        L_0x0647:
            X.07V r7 = r14.A04
            r14.A04 = r7
            androidx.cardview.widget.CardView r7 = r14.A03
            if (r7 == 0) goto L_0x0652
            r7.setVisibility(r1)
        L_0x0652:
            androidx.cardview.widget.CardView r12 = r14.A03
            if (r12 == 0) goto L_0x065b
            float r7 = r14.A0b
            r12.setRadius(r7)
        L_0x065b:
            com.instagram.ui.widget.spinner.SpinnerImageView r12 = r14.A0H
            if (r12 == 0) goto L_0x0664
            X.3uy r7 = X.C255943uy.LOADING
            r12.setLoadingStatus(r7)
        L_0x0664:
            com.instagram.common.ui.base.IgLinearLayout r7 = r14.A07
            r7.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r7 = r14.getTextView()
            r7.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r14.A0A
            r7.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r14.A0D
            r7.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r14.A0C
            r7.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r14.A0B
            r7.setVisibility(r0)
            androidx.cardview.widget.CardView r7 = r14.A01
            r7.setVisibility(r0)
            com.instagram.common.ui.base.IgLinearLayout r13 = r14.A06
            int r12 = r14.A0c
            int r7 = r14.A0d
            r13.setPadding(r12, r7, r12, r12)
            X.3oV r7 = r14.A0F
            r7.setVisibility(r0)
            androidx.cardview.widget.CardView r7 = r14.A02
            if (r7 == 0) goto L_0x069e
            r7.setVisibility(r0)
        L_0x069e:
            X.3oV r7 = r14.A0E
            r7.setVisibility(r0)
            goto L_0x05c0
        L_0x06a5:
            r7 = 5
            boolean r7 = X.AnonymousClass9IJ.A00(r7, r14)
            if (r7 == 0) goto L_0x06b5
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r7 = r10.getNoteBubbleView()
            r7.setVisibility(r0)
            goto L_0x05c0
        L_0x06b5:
            boolean r7 = r14 instanceof X.AnonymousClass91B
            r12 = 3
            r13 = 1
            r16 = r11
            r15 = 0
            if (r7 == 0) goto L_0x06dd
            X.91B r14 = (X.AnonymousClass91B) r14
            X.4zZ r14 = r14.A00
            java.lang.String r7 = r14.A0J
            r16 = r7
            java.lang.CharSequence r15 = X.C66889MeU.A04(r9, r7)
            boolean r7 = r14.A0Q
            if (r7 == 0) goto L_0x06db
            int r7 = X.0mp.A00(r16)
            if (r7 > r12) goto L_0x06db
        L_0x06d4:
            com.instagram.api.schemas.NoteCustomThemeImpl r7 = r14.A06
            r10.setBubbleContent(r15, r13, r11, r7)
            goto L_0x05c0
        L_0x06db:
            r13 = 0
            goto L_0x06d4
        L_0x06dd:
            r7 = 2
            boolean r7 = X.AnonymousClass9IJ.A00(r7, r14)
            if (r7 != 0) goto L_0x08fb
            boolean r7 = X.AnonymousClass9IJ.A00(r12, r14)
            if (r7 != 0) goto L_0x08fb
            boolean r7 = X.AnonymousClass9IJ.A00(r5, r14)
            if (r7 == 0) goto L_0x070f
            X.9IJ r14 = (X.AnonymousClass9IJ) r14
            java.lang.Object r15 = r14.A01
            X.4zZ r15 = (X.C279864zZ) r15
            java.lang.String r13 = r15.A0J
            java.lang.CharSequence r14 = X.C66889MeU.A04(r9, r13)
            boolean r7 = r15.A0Q
            if (r7 == 0) goto L_0x0707
            int r13 = X.0mp.A00(r13)
            r7 = 1
            if (r13 <= r12) goto L_0x0708
        L_0x0707:
            r7 = 0
        L_0x0708:
            com.instagram.api.schemas.NoteCustomThemeImpl r12 = r15.A06
            r10.setBubbleContent(r14, r7, r11, r12)
            goto L_0x05c0
        L_0x070f:
            boolean r7 = r14 instanceof X.AnonymousClass912
            if (r7 == 0) goto L_0x07d7
            X.912 r14 = (X.AnonymousClass912) r14
            X.4zZ r7 = r14.A00
            X.5y2 r13 = r7.A0A
            if (r13 == 0) goto L_0x07a5
            com.instagram.api.schemas.MusicNoteResponseInfo r12 = r13.A07
            if (r12 == 0) goto L_0x07a5
            com.instagram.api.schemas.MusicInfo r12 = r12.A00
            r17 = r12
        L_0x0723:
            android.view.View r12 = r2.itemView
            android.content.Context r16 = r12.getContext()
            if (r17 == 0) goto L_0x05c0
            if (r13 == 0) goto L_0x07a9
            com.instagram.api.schemas.MusicNoteResponseInfo r12 = r13.A07
            if (r12 == 0) goto L_0x07a9
            java.lang.String r14 = r12.A05
            if (r14 == 0) goto L_0x07a9
            X.0Tu r15 = X.0Tu.A05
            r12 = 36328143354674133(0x81104100013bd5, double:3.03740236696327E-306)
            boolean r12 = X.182.A06(r15, r9, r12)
            if (r12 == 0) goto L_0x07a9
            android.view.View r7 = r2.itemView
            android.content.Context r12 = r7.getContext()
            X.0qQ.A07(r12)
            android.view.View r7 = r2.itemView
            android.content.res.Resources r13 = r7.getResources()
            r7 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r15 = r13.getDimensionPixelSize(r7)
            r7 = 1065353216(0x3f800000, float:1.0)
            X.6KL r13 = X.AnonymousClass6KK.A00(r7, r15, r5)
            int r7 = X.2Yu.A0B(r12)
            int r12 = r12.getColor(r7)
            android.graphics.Paint r7 = r13.A0A
            r7.setColor(r12)
            r13.setBounds(r1, r1, r15, r15)
            r2.A00 = r13
            r7 = 32
            java.lang.String r7 = X.002.A0D(r14, r7)
            android.text.SpannableString r12 = new android.text.SpannableString
            r12.<init>(r7)
            android.graphics.drawable.Drawable r7 = r2.A00
            if (r7 == 0) goto L_0x09ac
            X.46l r13 = new X.46l
            r13.<init>(r7)
            r14 = 1082130432(0x40800000, float:4.0)
            X.0qQ.A0A(r16)
            r7 = r16
            float r7 = X.C61380mr.A00(r7, r14)
            int r7 = (int) r7
            r13.A01 = r7
            r7 = 33
            r12.setSpan(r13, r1, r5, r7)
            r7 = r18
            r10.setBubbleContent(r12, r1, r11, r7)
            android.os.Handler r12 = r2.A02
            X.Mlt r7 = r2.A0A
            r12.post(r7)
            goto L_0x05c0
        L_0x07a5:
            r17 = r18
            goto L_0x0723
        L_0x07a9:
            com.instagram.api.schemas.TrackData r12 = r17.BUk()
            java.lang.String r13 = r12.getDisplayArtist()
            if (r13 != 0) goto L_0x07b4
            r13 = r11
        L_0x07b4:
            com.instagram.api.schemas.TrackData r12 = r17.BUk()
            java.lang.String r14 = r12.getTitle()
            if (r14 != 0) goto L_0x07bf
            r14 = r11
        L_0x07bf:
            java.lang.String r12 = r7.A0J
            java.lang.CharSequence r15 = X.C66889MeU.A04(r9, r12)
            com.instagram.api.schemas.TrackData r12 = r17.BUk()
            boolean r16 = r12.isExplicit()
            com.instagram.api.schemas.NoteCustomThemeImpl r7 = r7.A06
            r12 = r10
            r17 = r7
            r12.setMusicBubbleContent(r13, r14, r15, r16, r17)
            goto L_0x05c0
        L_0x07d7:
            boolean r7 = X.C382039cz.A00(r5, r14)
            if (r7 == 0) goto L_0x07fa
            X.9cz r14 = (X.C382039cz) r14
            java.lang.Object r13 = r14.A01
            X.4zZ r13 = (X.C279864zZ) r13
            X.5y2 r7 = r13.A0A
            if (r7 == 0) goto L_0x05c0
            com.instagram.api.schemas.LocationNoteResponseInfo r7 = r7.A06
            if (r7 == 0) goto L_0x05c0
            java.lang.String r12 = r7.BNl()
            java.lang.String r7 = r13.A0J
            java.lang.CharSequence r7 = X.C66889MeU.A04(r9, r7)
            r10.setLocationBubbleContent(r12, r7, r11)
            goto L_0x05c0
        L_0x07fa:
            boolean r7 = X.AnonymousClass9IJ.A00(r1, r14)
            if (r7 == 0) goto L_0x087e
            X.9IJ r14 = (X.AnonymousClass9IJ) r14
            java.lang.Object r12 = r14.A01
            X.4zZ r12 = (X.C279864zZ) r12
            X.5y2 r7 = r12.A0A
            if (r7 == 0) goto L_0x05c0
            com.instagram.api.schemas.ListeningNowResponseInfo r13 = r7.A04
            if (r13 == 0) goto L_0x05c0
            com.instagram.api.schemas.MusicInfo r7 = r13.A01
            if (r7 == 0) goto L_0x0856
            com.instagram.api.schemas.TrackData r13 = r7.BUk()
            if (r13 == 0) goto L_0x081e
            java.lang.String r14 = r13.getDisplayArtist()
            if (r14 != 0) goto L_0x081f
        L_0x081e:
            r14 = r11
        L_0x081f:
            com.instagram.api.schemas.TrackData r13 = r7.BUk()
            if (r13 == 0) goto L_0x082d
            java.lang.String r13 = r13.getTitle()
            if (r13 == 0) goto L_0x082d
            r16 = r13
        L_0x082d:
            java.lang.String r12 = r12.A0J
            java.lang.CharSequence r13 = X.C66889MeU.A04(r9, r12)
            com.instagram.api.schemas.TrackData r7 = r7.BUk()
            if (r7 == 0) goto L_0x083d
            boolean r15 = r7.isExplicit()
        L_0x083d:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r7 = r10.getNoteBubbleView()
            r7.setVisibility(r1)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r7 = r10.getNoteBubbleView()
            r7.A0E()
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r12 = r10.getNoteBubbleView()
            r7 = r16
            r12.A0G(r13, r14, r7, r15)
            goto L_0x05c0
        L_0x0856:
            com.instagram.api.schemas.ListeningNowState r14 = r13.A00
            com.instagram.api.schemas.ListeningNowState r13 = com.instagram.api.schemas.ListeningNowState.NOT_LISTENING
            java.lang.String r7 = r12.A0J
            java.lang.CharSequence r12 = X.C66889MeU.A04(r9, r7)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r7 = r10.getNoteBubbleView()
            r7.setVisibility(r1)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r7 = r10.getNoteBubbleView()
            r7.A0E()
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r7 = r10.getNoteBubbleView()
            if (r14 != r13) goto L_0x0879
            r7.A0H(r12, r5)
            goto L_0x05c0
        L_0x0879:
            r7.A0H(r12, r1)
            goto L_0x05c0
        L_0x087e:
            boolean r7 = X.C382039cz.A00(r1, r14)
            if (r7 == 0) goto L_0x08e7
            X.9cz r14 = (X.C382039cz) r14
            java.lang.Object r14 = r14.A01
            X.4zZ r14 = (X.C279864zZ) r14
            java.lang.String r7 = r14.A0J
            r16 = r7
            java.lang.CharSequence r15 = X.C66889MeU.A04(r9, r7)
            boolean r7 = r14.A0Q
            if (r7 == 0) goto L_0x08e5
            int r7 = X.0mp.A00(r16)
            if (r7 > r12) goto L_0x08e5
        L_0x089c:
            com.instagram.api.schemas.NoteCustomThemeImpl r7 = r14.A06
            r10.setBubbleContent(r15, r13, r11, r7)
            X.5y2 r7 = r14.A0A
            if (r7 == 0) goto L_0x05c0
            com.instagram.api.schemas.GIFNoteResponseInfo r7 = r7.A02
            if (r7 == 0) goto L_0x05c0
            com.instagram.api.schemas.CommentGiphyMediaInfoIntf r7 = r7.B9E()
            if (r7 == 0) goto L_0x05c0
            com.instagram.api.schemas.CommentGiphyMediaInfo r13 = r7.F1x()
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r7 = r10.A0H
            r7.setVisibility(r0)
            boolean r7 = X.AnonymousClass4AJ.A04(r9)
            if (r7 == 0) goto L_0x08cf
            com.instagram.direct.inbox.notes.ui.SquareAvatarWithBadgeView r7 = r10.A0G
            r7.setVisibility(r1)
            X.PaS r7 = new X.PaS
            r7.<init>(r13, r2, r4)
        L_0x08c8:
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r10.post(r7)
            goto L_0x05c0
        L_0x08cf:
            androidx.cardview.widget.CardView r7 = r10.A02
            r7.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = r10.A0B
            r7.setVisibility(r1)
            com.instagram.common.ui.base.IgFrameLayout r12 = r10.A05
            r7 = 4
            r12.setVisibility(r7)
            X.PaT r7 = new X.PaT
            r7.<init>(r13, r2, r4)
            goto L_0x08c8
        L_0x08e5:
            r13 = 0
            goto L_0x089c
        L_0x08e7:
            r7 = 4
            boolean r7 = X.AnonymousClass9IJ.A00(r7, r14)
            if (r7 == 0) goto L_0x05c0
            X.9IJ r14 = (X.AnonymousClass9IJ) r14
            java.lang.Object r7 = r14.A01
            X.4zZ r7 = (X.C279864zZ) r7
            java.lang.String r7 = r7.A0J
            r10.setUnsupportedBubbleContent(r7)
            goto L_0x05c0
        L_0x08fb:
            X.4zZ r14 = r14.BWY()
            X.5y2 r7 = r14.A0A
            if (r7 == 0) goto L_0x090d
            X.60F r7 = r7.A0B
            if (r7 == 0) goto L_0x090d
            java.lang.String r7 = r7.A03
            if (r7 == 0) goto L_0x090d
            r16 = r7
        L_0x090d:
            r7 = r16
            java.lang.CharSequence r15 = X.C66889MeU.A04(r9, r7)
            boolean r7 = r14.A0Q
            if (r7 == 0) goto L_0x091e
            int r13 = X.0mp.A00(r16)
            r7 = 1
            if (r13 <= r12) goto L_0x091f
        L_0x091e:
            r7 = 0
        L_0x091f:
            com.instagram.api.schemas.NoteCustomThemeImpl r12 = r14.A06
            r10.setPromptBubbleContent(r15, r7, r11, r12)
            goto L_0x05c0
        L_0x0926:
            r7 = 0
            goto L_0x05a9
        L_0x0929:
            r10.A0D()
            goto L_0x059d
        L_0x092e:
            r14 = 0
            goto L_0x0569
        L_0x0931:
            com.instagram.user.model.User r7 = r3.A0A
            r23 = r7
            java.lang.String r8 = r23.getId()
            java.lang.String r7 = r9.A06
            r22 = r7
            boolean r7 = X.0qQ.A0K(r8, r7)
            if (r7 != 0) goto L_0x0963
            boolean r7 = r3.A0T
            if (r7 == 0) goto L_0x0963
            boolean r7 = X.AnonymousClass4AJ.A0A(r9)
            if (r7 == 0) goto L_0x0963
            boolean r11 = r3.A0U
            android.content.Context r8 = r10.getContext()
            r7 = 2131239800(0x7f082378, float:1.8095917E38)
            if (r11 == 0) goto L_0x095b
            r7 = 2131239908(0x7f0823e4, float:1.8096136E38)
        L_0x095b:
            android.graphics.drawable.Drawable r11 = r8.getDrawable(r7)
            if (r15 != 0) goto L_0x0568
            goto L_0x054c
        L_0x0963:
            if (r15 == 0) goto L_0x097d
            android.content.Context r8 = r10.getContext()
            X.0qQ.A07(r8)
            r7 = 2131231136(0x7f0801a0, float:1.8078344E38)
            android.graphics.drawable.Drawable r11 = r8.getDrawable(r7)
            if (r11 != 0) goto L_0x0568
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x097d:
            boolean r7 = r3.A0P
            if (r7 == 0) goto L_0x054c
            android.content.Context r8 = r10.getContext()
            X.0qQ.A07(r8)
            r7 = 2130970843(0x7f0408db, float:1.7550408E38)
            int r7 = X.2Yu.A0H(r8, r7)
            android.graphics.drawable.Drawable r11 = r8.getDrawable(r7)
            if (r11 != 0) goto L_0x054c
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x099d:
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r10.A0N
            r7.setVisibility(r1)
            goto L_0x09a8
        L_0x09a3:
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r10.A0N
            r7.setVisibility(r0)
        L_0x09a8:
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r10.A0M
            goto L_0x052f
        L_0x09ac:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x09b4:
            android.content.res.Resources r12 = r36.getResources()
            X.0qQ.A07(r12)
            X.TtQ r4 = new X.TtQ
            r4.<init>(r12)
            r0 = r36
            X.03v.A0B(r0, r4)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = r23.B8Q()
            r11.append(r0)
            java.lang.String r13 = " "
            r11.append(r13)
            boolean r7 = r3.A0P
            if (r7 == 0) goto L_0x09e7
            r0 = 2131954897(0x7f130cd1, float:1.9546306E38)
            java.lang.String r0 = r12.getString(r0)
            r11.append(r0)
            r11.append(r13)
        L_0x09e7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r18 = r21.iterator()
            r17 = 0
        L_0x09f2:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0a60
            java.lang.Object r15 = r18.next()
            int r16 = r17 + 1
            if (r17 >= 0) goto L_0x0a08
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0a08:
            X.913 r15 = (X.AnonymousClass913) r15
            r14 = r13
            if (r7 != 0) goto L_0x0a0f
            if (r17 == 0) goto L_0x0a1c
        L_0x0a0f:
            r0 = 2131954898(0x7f130cd2, float:1.9546308E38)
            java.lang.String r0 = r12.getString(r0)
            r4.append(r0)
            r4.append(r13)
        L_0x0a1c:
            boolean r0 = r15 instanceof X.AnonymousClass91B
            if (r0 == 0) goto L_0x0a51
            r0 = 2131954899(0x7f130cd3, float:1.954631E38)
            java.lang.String r0 = r12.getString(r0)
            r4.append(r0)
            r4.append(r13)
            X.91B r15 = (X.AnonymousClass91B) r15
            X.4zZ r15 = r15.A00
            java.lang.String r0 = r15.A0J
            r4.append(r0)
            r4.append(r13)
            X.5y2 r0 = r15.A0A
            if (r0 == 0) goto L_0x0a4e
            X.60C r0 = r0.A09
            if (r0 == 0) goto L_0x0a4e
            r0 = 2131954900(0x7f130cd4, float:1.9546312E38)
            java.lang.String r0 = r12.getString(r0)
            r4.append(r0)
        L_0x0a4b:
            r4.append(r14)
        L_0x0a4e:
            r17 = r16
            goto L_0x09f2
        L_0x0a51:
            r0 = 5
            boolean r0 = X.AnonymousClass9IJ.A00(r0, r15)
            if (r0 == 0) goto L_0x0a4e
            r0 = 2131954901(0x7f130cd5, float:1.9546314E38)
            java.lang.String r14 = r12.getString(r0)
            goto L_0x0a4b
        L_0x0a60:
            java.lang.String r0 = r4.toString()
            X.0qQ.A07(r0)
            r11.append(r0)
            java.lang.String r4 = r11.toString()
            X.0qQ.A07(r4)
            r0 = r36
            r0.setContentDescription(r4)
            X.1Av r4 = X.1Au.A00(r9)
            java.lang.Integer r0 = r3.A02
            if (r0 == 0) goto L_0x0aec
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x0aec
            boolean r0 = r21.isEmpty()
            if (r0 == 0) goto L_0x0a8c
            if (r6 == 0) goto L_0x0aec
        L_0x0a8c:
            if (r19 != 0) goto L_0x0aec
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x0aec
            boolean r0 = r3.A0Q
            if (r0 != 0) goto L_0x0aec
            boolean r0 = X.AnonymousClass4AJ.A08(r9)
            if (r0 == 0) goto L_0x0aec
            X.0xa r6 = r4.A01
            java.lang.String r0 = "notes_lightweight_feedback_tooltip_seen_count1"
            int r6 = r6.getInt(r0, r1)
            r0 = 3
            if (r6 >= r0) goto L_0x0aec
            java.lang.String r0 = "notes_lightweight_feedback_tooltip_last_impression_timestamp_ms"
            r6 = 1
            boolean r0 = X.1Av.A07(r4, r0, r6)
            if (r0 == 0) goto L_0x0aec
            r0 = 2131964959(0x7f13341f, float:1.9566714E38)
            java.lang.String r2 = r8.getString(r0)
            X.0qQ.A07(r2)
            X.Imt r1 = new X.Imt
            r1.<init>(r4)
        L_0x0ac0:
            X.0sa r1 = (X.C62320sa) r1
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0aeb
            r1.invoke()
            android.app.Activity r8 = (android.app.Activity) r8
            X.6jx r0 = new X.6jx
            r0.<init>((java.lang.CharSequence) r2)
            X.5Gt r1 = new X.5Gt
            r1.<init>(r8, r0)
            r1.A03(r10)
            X.2fy r0 = X.C226262fy.BELOW_ANCHOR
            r1.A06(r0)
            X.5Gv r0 = r1.A00()
            X.FqC r2 = new X.FqC
            r2.<init>(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r10.postDelayed(r2, r0)
        L_0x0aeb:
            return
        L_0x0aec:
            boolean r11 = r3.A0Q
            if (r11 == 0) goto L_0x0b2f
            boolean r0 = X.AnonymousClass50C.A05(r3, r2)
            if (r0 != 0) goto L_0x0b2f
            java.lang.Boolean r6 = r3.A0B
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x0b2f
            X.0xa r6 = r4.A01
            r0 = 3635(0xe33, float:5.094E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r6 = r6.getInt(r0, r1)
            r0 = 3
            if (r6 >= r0) goto L_0x0b2f
            r0 = 3634(0xe32, float:5.092E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6 = 1
            boolean r0 = X.1Av.A07(r4, r0, r6)
            if (r0 == 0) goto L_0x0b2f
            r0 = 2131968527(0x7f13420f, float:1.9573951E38)
            java.lang.String r2 = r8.getString(r0)
            X.0qQ.A07(r2)
            X.Imu r1 = new X.Imu
            r1.<init>(r4)
            goto L_0x0ac0
        L_0x0b2f:
            java.lang.Integer r0 = r3.A02
            if (r0 == 0) goto L_0x0b74
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x0b74
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x0b74
            if (r19 != 0) goto L_0x0b74
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x0b74
            if (r11 != 0) goto L_0x0b74
            X.0s0 r6 = r4.A4E
            X.0YZ[] r5 = X.1Av.A8a
            r0 = 400(0x190, float:5.6E-43)
            r0 = r5[r0]
            java.lang.Object r0 = r6.CDM(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0b74
            boolean r0 = X.AnonymousClass4AJ.A08(r9)
            if (r0 != 0) goto L_0x0b74
            r0 = 2131968621(0x7f13426d, float:1.9574142E38)
            java.lang.String r2 = r8.getString(r0)
            X.0qQ.A07(r2)
            r0 = 14
            X.Pm4 r1 = new X.Pm4
            r1.<init>(r4, r0)
            goto L_0x0ac0
        L_0x0b74:
            boolean r0 = X.AnonymousClass50C.A05(r3, r2)
            if (r0 != 0) goto L_0x0aeb
            java.lang.Integer r0 = r3.A02
            if (r0 == 0) goto L_0x0aeb
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0aeb
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x0aeb
            if (r19 != 0) goto L_0x0aeb
            if (r11 != 0) goto L_0x0aeb
            boolean r0 = r3.A0T
            if (r0 == 0) goto L_0x0aeb
            X.0xa r2 = r4.A01
            r0 = 3639(0xe37, float:5.1E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r1 = r2.getInt(r0, r1)
            r0 = 3
            if (r1 >= r0) goto L_0x0aeb
            r0 = 3638(0xe36, float:5.098E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = 1
            boolean r0 = X.1Av.A07(r4, r2, r0)
            if (r0 == 0) goto L_0x0aeb
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321310062290180(0x810a0a000a2504, double:3.033080965344198E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x0aeb
            r0 = 2131968621(0x7f13426d, float:1.9574142E38)
            java.lang.String r2 = r8.getString(r0)
            X.0qQ.A07(r2)
            X.Imv r1 = new X.Imv
            r1.<init>(r4)
            goto L_0x0ac0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4AL.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return AnonymousClass4AB.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        AnonymousClass50C r32 = (AnonymousClass50C) r3;
        0qQ.A0B(r32, 0);
        r32.A0D.A03.A04(r32.A05);
        r32.A02.removeCallbacks(r32.A0A);
    }

    public AnonymousClass4AL() {
    }
}
