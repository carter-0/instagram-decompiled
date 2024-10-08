package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteUserRowsRecyclerView;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class NKL extends AnonymousClass4DH implements C273494mf, C273414mX {
    public static final String __redex_internal_original_name = "SelfNoteBottomSheetFragment";
    public CardView A00;
    public ConstraintLayout A01;
    public LocationNoteResponseInfo A02;
    public NotePogImageDict A03;
    public NotePogVideoDict A04;
    public C2355930l A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public IgImageView A0C;
    public C252063oV A0D;
    public C252063oV A0E;
    public C252063oV A0F;
    public C252063oV A0G;
    public C252063oV A0H;
    public OIR A0I;
    public AnonymousClass4AD A0J;
    public C70556OBe A0K;
    public C67324Mm0 A0L;
    public C234502xy A0M;
    public ReelAvatarWithBadgeView A0N;
    public AnonymousClass37D A0O;
    public SpinnerImageView A0P;
    public IgSimpleImageView A0Q;
    public final AnonymousClass0eM A0R;
    public final AnonymousClass0eM A0S = C227642jf.A02(this);
    public final AnonymousClass0eM A0T;

    public final void Cyf() {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "note_self_note_bottom_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0042, code lost:
        if (X.182.A06(r6, X.AnonymousClass7TF.A0L(r2, 0), 36321237047256252L) == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r4 = 0
            r6 = r13
            X.0qQ.A0B(r13, r4)
            r9 = r12
            super.onViewCreated(r13, r14)
            X.07U r8 = X.07U.A04
            X.07Z r7 = r12.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r7)
            r10 = 0
            r11 = 33
            X.MHF r5 = new X.MHF
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.19B r3 = X.19B.A00
            X.1Eo.A05(r3, r5, r0)
            X.0eM r2 = r12.A0S
            X.0lg r5 = X.AnonymousClass7TF.A0L(r2, r4)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36321237047715005(0x8109f9000824bd, double:3.0330347906328514E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            r5 = 1
            if (r0 == 0) goto L_0x0044
            X.0lg r4 = X.AnonymousClass7TF.A0L(r2, r4)
            r0 = 36321237047256252(0x8109f9000124bc, double:3.033034790342734E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = X.AnonymousClass4AJ.A05(r0)
            if (r0 == 0) goto L_0x005d
            X.OIR r0 = r12.A0I
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x005d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x005e
        L_0x005d:
            r5 = 0
        L_0x005e:
            if (r1 != 0) goto L_0x0062
            if (r5 == 0) goto L_0x0083
        L_0x0062:
            X.07Z r7 = r12.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r7)
            r11 = 37
            X.MHI r6 = new X.MHI
            r6.<init>(r7, r8, r9, r10, r11)
            X.07Z r7 = X.JTP.A0I(r12, r3, r6, r0)
            X.0xx r0 = X.AnonymousClass07a.A00(r7)
            r11 = 38
            X.MHI r6 = new X.MHI
            r6.<init>(r7, r8, r9, r10, r11)
            X.1Eo.A05(r3, r6, r0)
        L_0x0083:
            X.0eM r0 = r12.A0R
            java.lang.Object r3 = r0.getValue()
            X.OLu r3 = (X.C70799OLu) r3
            com.instagram.direct.inbox.notes.ui.NoteUserRowsRecyclerView r0 = r3.A02
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = "userRowsRecyclerView"
        L_0x0091:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0099:
            X.3Ar r1 = X.C238103Ao.A00(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<@[FlexibleNullability] @[RawType] com.instagram.migration.scrollingviewproxy.ScrollingViewAdapterProxy<@[FlexibleNullability] kotlin.Any?>?>"
            X.0qQ.A0C(r1, r0)
            X.3As r1 = (X.C238143As) r1
            X.PVr r0 = new X.PVr
            r0.<init>(r3)
            r1.ErF(r0)
            X.PIF r0 = r3.A01
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "userRowsAdapter"
            goto L_0x0091
        L_0x00b3:
            r1.ENw(r0)
            r3.A03 = r1
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = X.AnonymousClass4AJ.A08(r0)
            if (r0 == 0) goto L_0x00f5
            X.60k r1 = X.C66582MXn.A0S(r2)
            X.OIR r0 = r12.A0I
            if (r0 == 0) goto L_0x00f6
            X.4zZ r0 = r0.A03
            if (r0 == 0) goto L_0x00f6
            X.5y4 r0 = r0.A07
            if (r0 == 0) goto L_0x00f6
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x00f6
            int r0 = r0.size()
            long r3 = (long) r0
        L_0x00db:
            X.0wc r1 = r1.A05
            java.lang.String r0 = "ig_notes_bottomsheet_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00f5
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "likes_received"
            r2.A9F(r0, r1)
            r2.Cgf()
        L_0x00f5:
            return
        L_0x00f6:
            r3 = 0
            goto L_0x00db
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKL.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(MusicInfo musicInfo, NKL nkl) {
        int i;
        Integer AdU;
        NKL nkl2 = nkl;
        Context A052 = DbT.A05(nkl2.requireContext());
        AnonymousClass0eM r3 = nkl2.A0S;
        nkl2.A0M = C234472xv.A00(A052, AnonymousClass7TE.A0l(r3), C227942kP.A01("note_self_note_bottom_sheet", true, true), new C234462xu(DbT.A05(nkl2.requireContext()), AnonymousClass7TE.A0l(r3)), __redex_internal_original_name, true);
        MusicInfo musicInfo2 = musicInfo;
        MusicConsumptionModel BUp = musicInfo2.BUp();
        if (BUp == null || (AdU = BUp.AdU()) == null) {
            i = 0;
        } else {
            i = AdU.intValue();
        }
        C234502xy r4 = nkl2.A0M;
        if (r4 != null) {
            r4.ETw(new MusicDataSource((Uri) null, AudioType.MUSIC, musicInfo2.BUk().getProgressiveDownloadUrl(), musicInfo2.BUk().getDashManifest(), musicInfo2.BUk().getAudioAssetId(), musicInfo2.BUk().getArtistId()), new C61986KUj(i, 0, musicInfo2, nkl2), musicInfo2.BUp().getDerivedContentId(), 0, -1, -1, false, false);
        }
        C234502xy r1 = nkl2.A0M;
        if (r1 != null) {
            r1.seekTo(i);
        }
        C234502xy r0 = nkl2.A0M;
        if (r0 != null) {
            r0.E2p();
        }
    }

    public static final void A03(NKL nkl) {
        AnonymousClass0eM r1 = nkl.A0S;
        if (AnonymousClass9O2.A00(AnonymousClass69P.A05(AnonymousClass7TE.A0l(r1))) && AnonymousClass4AJ.A02(AnonymousClass7TE.A0l(r1))) {
            ReelAvatarWithBadgeView reelAvatarWithBadgeView = nkl.A0N;
            if (reelAvatarWithBadgeView != null) {
                reelAvatarWithBadgeView.setBadgeOffset(DbV.A05(nkl).getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material));
                ReelAvatarWithBadgeView reelAvatarWithBadgeView2 = nkl.A0N;
                if (reelAvatarWithBadgeView2 != null) {
                    Drawable drawable = nkl.requireContext().getDrawable(R.drawable.birthday_pog_indicator);
                    if (drawable != null) {
                        reelAvatarWithBadgeView2.A02(drawable, DbV.A05(nkl).getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material));
                        ReelAvatarWithBadgeView reelAvatarWithBadgeView3 = nkl.A0N;
                        if (reelAvatarWithBadgeView3 != null) {
                            reelAvatarWithBadgeView3.post(new C73252PZW(reelAvatarWithBadgeView3, C73924Pm4.A01(nkl, 25)));
                            return;
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            0qQ.A0F("profilePicNoteHeader");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.NKL r8, X.C68766NWb r9) {
        /*
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r0 = r8.A0N
            java.lang.String r7 = "profilePicNoteHeader"
            if (r0 == 0) goto L_0x007c
            r1 = 0
            r0.setVisibility(r1)
            java.util.List r6 = r9.A0G
            boolean r0 = X.AnonymousClass7TE.A1b(r6)
            java.lang.String r5 = "Required value was null."
            if (r0 != 0) goto L_0x001c
            java.util.List r0 = r9.A0H
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0053
        L_0x001c:
            X.0eM r0 = r8.A0S
            X.0lg r3 = X.AnonymousClass7TF.A0L(r0, r1)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329577873686732(0x81118f000040cc, double:3.038309562563182E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0053
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r4 = r8.A0N
            if (r4 == 0) goto L_0x007c
            com.instagram.common.typedurl.ImageUrl r3 = r9.A09
            if (r3 == 0) goto L_0x004e
            java.lang.Object r0 = X.00k.A0J(r6)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 != 0) goto L_0x0064
            java.util.List r0 = r9.A0H
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 != 0) goto L_0x0064
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x004e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0053:
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r8.A0N
            if (r1 == 0) goto L_0x007c
            com.instagram.common.typedurl.ImageUrl r0 = r9.A09
            if (r0 == 0) goto L_0x005f
            r1.A04(r0, r8)
            goto L_0x0076
        L_0x005f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0064:
            com.instagram.common.typedurl.ImageUrl r2 = r0.Bh3()
            android.content.res.Resources r1 = X.DbV.A05(r8)
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.A03(r8, r3, r2, r0)
        L_0x0076:
            androidx.cardview.widget.CardView r0 = r8.A00
            if (r0 != 0) goto L_0x0084
            java.lang.String r7 = "avatarVideoViewContainer"
        L_0x007c:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0084:
            r1 = 8
            r0.setVisibility(r1)
            X.3oV r0 = r8.A0D
            if (r0 != 0) goto L_0x0090
            java.lang.String r7 = "avatarSimpleVideoLayout"
            goto L_0x007c
        L_0x0090:
            r0.setVisibility(r1)
            A03(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKL.A04(X.NKL, X.NWb):void");
    }

    public final void Cyc() {
        O7W o7w;
        boolean A062 = 182.A06(0Tu.A05, DbT.A0X(this.A0S), 36330754695316232L);
        C234502xy r1 = this.A0M;
        if (A062) {
            if (r1 != null) {
                r1.release();
            }
            this.A0M = null;
        } else if (r1 != null) {
            r1.EHu(false);
        }
        C70556OBe oBe = this.A0K;
        if (oBe != null && (o7w = oBe.A01.A03) != null) {
            o7w.A00.A05.Cyg();
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0S);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        NoteUserRowsRecyclerView noteUserRowsRecyclerView = ((C70799OLu) this.A0R.getValue()).A02;
        if (noteUserRowsRecyclerView == null || !JTP.A1Y(noteUserRowsRecyclerView)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public NKL() {
        C73924Pm4 A012 = C73924Pm4.A01(this, 30);
        C73924Pm4 A013 = C73924Pm4.A01(this, 27);
        0eO r6 = 0eO.A02;
        AnonymousClass0eM A002 = C73924Pm4.A00(A013, r6, 28);
        this.A0T = DbS.A0I(C73924Pm4.A01(A002, 29), A012, new C73916Plr(23, (Object) null, A002), DbS.A0z(C67760MuG.class));
        this.A0R = C73924Pm4.A00(this, r6, 26);
    }

    public static final SpannableStringBuilder A00(NKL nkl, String str, boolean z) {
        Drawable drawable;
        SpannableStringBuilder A0C2 = DbS.A0C(str);
        if (z && (drawable = nkl.requireContext().getDrawable(R.drawable.music_explicit)) != null) {
            int color = nkl.requireContext().getColor(2Yu.A09(nkl.getContext()));
            int A022 = DbZ.A02(nkl);
            drawable.setBounds(0, 0, A022, A022);
            drawable.mutate().setColorFilter(color, PorterDuff.Mode.SRC_IN);
            C263324Kh.A02(drawable, A0C2, A0C2.length(), 12, 12);
        }
        return A0C2;
    }

    public static final void A02(IgTextView igTextView, NKL nkl, C68766NWb nWb, String str) {
        DbT.A1H(igTextView);
        igTextView.setText(C66889MeU.A03(nkl.requireActivity(), AnonymousClass7TE.A0l(nkl.A0S), str, "note_self_note_bottom_sheet"));
        int i = 0;
        if (str.length() == 0) {
            i = 8;
        }
        igTextView.setVisibility(i);
        if (nWb.A0J) {
            DbY.A11(igTextView, igTextView.getContext());
            igTextView.setTypeface(Typeface.SANS_SERIF);
        }
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1004411872);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_bottom_sheet_header, viewGroup, false);
        this.A0N = (ReelAvatarWithBadgeView) inflate.findViewById(R.id.bottom_sheet_note_author_avatar);
        this.A0C = JTO.A0Y(inflate, R.id.note_chat_faceswarm);
        this.A01 = (ConstraintLayout) inflate.findViewById(R.id.bottom_sheet_note_avatar_container);
        this.A00 = (CardView) inflate.findViewById(R.id.bottom_sheet_note_video_preview_container);
        this.A0E = DbU.A0Y(inflate, R.id.notes_video_view_stub);
        this.A0D = DbU.A0Y(inflate, R.id.notes_video_player_layout_stub);
        this.A0B = JTO.A0X(inflate, R.id.bottom_sheet_note_header_title);
        this.A09 = JTO.A0X(inflate, R.id.bottom_sheet_note_chat_header_title);
        this.A0A = JTO.A0X(inflate, R.id.bottom_sheet_note_header_subtitle);
        this.A08 = JTO.A0X(inflate, R.id.bottom_sheet_note_chat_member_count);
        this.A0Q = (IgSimpleImageView) inflate.findViewById(R.id.bottom_sheet_note_facepile);
        this.A06 = JTO.A0X(inflate, R.id.bottom_sheet_note_share_target);
        this.A0P = (SpinnerImageView) inflate.findViewById(R.id.loading_indicator);
        this.A07 = JTO.A0X(inflate, R.id.music_reshare_subtitle);
        this.A0H = DbU.A0Y(inflate, R.id.music_note_spotify_saves_subtitle_stub);
        this.A0G = DbU.A0Y(inflate, R.id.spotify_note_header_stub);
        this.A0F = DbU.A0Y(inflate, R.id.listening_now_disclaimer_Stub);
        this.A05 = new C2355930l(requireActivity(), AnonymousClass7TE.A0l(this.A0S));
        C70799OLu oLu = (C70799OLu) this.A0R.getValue();
        LayoutInflater layoutInflater2 = getLayoutInflater();
        0qQ.A07(layoutInflater2);
        C60261JiI jiI = ((C67760MuG) this.A0T.getValue()).A02;
        0qQ.A0B(jiI, 2);
        oLu.A00 = jiI;
        oLu.A01 = new PIF(layoutInflater2, oLu.A06, oLu.A08);
        NoteUserRowsRecyclerView noteUserRowsRecyclerView = (NoteUserRowsRecyclerView) JTR.A0V(inflate, R.id.note_reactions_layout_v2).findViewById(R.id.notes_user_rows_recycler_view);
        oLu.A02 = noteUserRowsRecyclerView;
        if (noteUserRowsRecyclerView != null) {
            DbY.A16(oLu.A05, noteUserRowsRecyclerView);
            NoteUserRowsRecyclerView noteUserRowsRecyclerView2 = oLu.A02;
            if (noteUserRowsRecyclerView2 != null) {
                noteUserRowsRecyclerView2.A00 = Integer.valueOf(inflate.getResources().getDisplayMetrics().heightPixels / 2);
                NoteUserRowsRecyclerView noteUserRowsRecyclerView3 = oLu.A02;
                if (noteUserRowsRecyclerView3 != null) {
                    noteUserRowsRecyclerView3.A15(new C67838Mvi(0, oLu, jiI));
                    this.A0O = DbV.A0g(this, AnonymousClass37D.A00);
                    AnonymousClass0fD.A09(-221270783, A022);
                    return inflate;
                }
            }
        }
        0qQ.A0F("userRowsRecyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        C234502xy r0;
        int A022 = AnonymousClass0fD.A02(2085976838);
        super.onDestroyView();
        C67324Mm0 mm0 = this.A0L;
        if (mm0 != null) {
            mm0.A02(002.A0R("note_self_note_bottom_sheet", " onDestroyView"));
        }
        if (182.A06(0Tu.A05, DbY.A0R(this.A0S), 36326451137558284L) && (r0 = this.A0M) != null) {
            r0.release();
        }
        AnonymousClass0fD.A09(-22108876, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1793064443);
        NKL.super.onPause();
        C234502xy r0 = this.A0M;
        if (r0 != null) {
            r0.pause();
        }
        C67324Mm0 mm0 = this.A0L;
        if (mm0 != null) {
            C67324Mm0.A00(mm0, "note_self_note_bottom_sheet", " onPause");
        }
        AnonymousClass0fD.A09(-1977138111, A022);
    }
}
