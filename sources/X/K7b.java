package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryMusicPickAggregationVisibility;
import com.instagram.common.session.UserSession;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import java.util.List;

public final class K7b extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "MusicPickViewerFragment";
    public int A00;
    public RecyclerView A01;
    public C255773uh A02;
    public C60969JuR A03;
    public int A04;
    public final C230222pE A05;
    public final L2G A06;
    public final L2H A07;
    public final MU7 A08;
    public final String A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F = C66294MMd.A01(this, 11);
    public final AnonymousClass0eM A0G;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000d: MOVE  (r1v1 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v0 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            r2 = 0
            X.0qQ.A0B(r4, r2)
            super.onViewCreated(r4, r5)
            androidx.fragment.app.Fragment r1 = r3.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x0018
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x0018
            X.7Pu r0 = r1.A02
            if (r0 == 0) goto L_0x0018
            r0.A0Q(r2)
        L_0x0018:
            A00(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K7b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(K7b k7b) {
        UserSession A0l = AnonymousClass7TE.A0l(k7b.A0G);
        AnonymousClass0eM r1 = k7b.A0C;
        String str = ((MusicPickStickerModel) r1.getValue()).A02;
        String str2 = ((MusicPickStickerModel) r1.getValue()).A03;
        AnonymousClass7TG.A1T(A0l, str2, str);
        1NY A0b = AnonymousClass7TG.A0b(A0l);
        C51968G9o.A1K(A0b, "stories/prompt_stickers/top_participants_pagination_music_pick/", str2);
        A0b.A9m("prompt_sticker_id", str);
        0qQ.A0B("user_ids_to_materialize", 0);
        1OC A0S = DbU.A0S(A0b, XPJ.class, C21516Xdi.class);
        C61500KAf.A00(A0S, k7b, 30);
        k7b.schedule(A0S);
        View requireView = k7b.requireView();
        JTR.A1D(requireView, R.id.spinner);
        int A032 = Dbb.A03(requireView, R.id.prompt_sticker_context);
        DbT.A1F(requireView, R.id.divider, A032);
        DbT.A1F(requireView, R.id.prompt_sticker_participants, A032);
        DbT.A1F(requireView, R.id.empty_state, A032);
        DbT.A1F(requireView, R.id.magic_mod_empty_state, A032);
        DbT.A1F(requireView, R.id.disabled_state, A032);
    }

    public static final void A01(K7b k7b) {
        AnonymousClass0eM r6 = k7b.A0A;
        if (!((C60441JlZ) r6.getValue()).A01) {
            C60969JuR juR = k7b.A03;
            if (juR == null) {
                C41845B3m.A0v();
                throw AnonymousClass00P.createAndThrow();
            }
            List list = juR.A08;
            if (list != null && k7b.A04 < list.size()) {
                int i = k7b.A04;
                int size = list.size();
                int i2 = k7b.A04 + k7b.A00;
                if (size > i2) {
                    size = i2;
                }
                List subList = list.subList(i, size);
                int i3 = k7b.A04 + k7b.A00;
                k7b.A04 = i3;
                boolean A1P = JTQ.A1P(i3, list.size());
                UserSession A0l = AnonymousClass7TE.A0l(k7b.A0G);
                AnonymousClass0eM r1 = k7b.A0C;
                String str = ((MusicPickStickerModel) r1.getValue()).A02;
                String str2 = ((MusicPickStickerModel) r1.getValue()).A03;
                Boolean valueOf = Boolean.valueOf(A1P);
                AnonymousClass7TG.A1T(A0l, str2, str);
                String str3 = null;
                1NY A0b = AnonymousClass7TG.A0b(A0l);
                C51968G9o.A1K(A0b, "stories/prompt_stickers/top_participants_pagination_music_pick/", str2);
                A0b.A9m("prompt_sticker_id", str);
                if (subList != null) {
                    str3 = 00k.A0P(",", "[", "]", subList, (0sP) null);
                }
                A0b.A0G("user_ids_to_materialize", str3);
                A0b.A0E("is_last_page", valueOf);
                1OC A0S = DbU.A0S(A0b, XPJ.class, C21516Xdi.class);
                C61500KAf.A00(A0S, k7b, 31);
                k7b.schedule(A0S);
                C60441JlZ jlZ = (C60441JlZ) r6.getValue();
                int i4 = 1;
                jlZ.A01 = true;
                int size2 = jlZ.A02.size();
                if (jlZ.A00 == null) {
                    i4 = 0;
                }
                jlZ.notifyItemInserted(size2 + i4);
            }
        }
    }

    public static final boolean A02(K7b k7b) {
        MWP mwp;
        C60969JuR juR = k7b.A03;
        if (juR == null || (mwp = juR.A02) == null) {
            return false;
        }
        if (((C61118JxU) mwp).A01.isEmpty()) {
            return true;
        }
        C60969JuR juR2 = k7b.A03;
        if (juR2 != null) {
            MWP mwp2 = juR2.A02;
            0qQ.A0A(mwp2);
            if (((C61118JxU) mwp2).A00 == StoryMusicPickAggregationVisibility.UNRECOGNIZED) {
                return true;
            }
            C60969JuR juR3 = k7b.A03;
            if (juR3 != null) {
                MWP mwp3 = juR3.A02;
                0qQ.A0A(mwp3);
                if (((C61118JxU) mwp3).A00 == StoryMusicPickAggregationVisibility.HIDDEN) {
                    return true;
                }
                return false;
            }
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        throw AnonymousClass00P.createAndThrow();
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

    public final String getModuleName() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
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
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null || !JTP.A1Y(recyclerView)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public K7b() {
        0eO r2 = 0eO.A02;
        this.A0D = C66294MMd.A00(this, r2, 10);
        this.A0C = C66294MMd.A00(this, r2, 9);
        this.A0E = AnonymousClass0eN.A00(r2, MLM.A00);
        this.A0A = C66294MMd.A00(this, r2, 7);
        this.A0B = C66294MMd.A00(this, r2, 8);
        this.A07 = new L2H(this);
        this.A05 = new C50896Fkb(this, 11);
        this.A08 = new C65597LwX(this);
        this.A06 = new L2G(this);
        this.A0G = C227642jf.A02(this);
        this.A09 = "music_pick_context_sheet_prompt";
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1831735678);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.prompt_sticker_viewer_fragment, false);
        AnonymousClass0fD.A09(330666673, A022);
        return A0D2;
    }
}
