package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.modal.ModalActivity;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.E6i  reason: case insensitive filesystem */
public final class C47522E6i extends C227812jx implements AnonymousClass4DU, C273504mg, C273494mf, AnonymousClass71G, AnonymousClass0j6, AnonymousClass4DS, G77, AnonymousClass4Zh, G6X {
    public static final String __redex_internal_original_name = "LikesListFragment";
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public C46329Dbx A04;
    public 1Xj A05;
    public 1Xl A06;
    public C324466zK A07;
    public IgdsInlineSearchBox A08;
    public C363528js A09;
    public E9N A0A;
    public C46729DkI A0B;
    public F1t A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public Integer A0F;
    public String A0G;
    public C62320sa A0H;
    public C62320sa A0I;
    public boolean A0J;
    public boolean A0K = true;
    public C46487Dfq A0L;
    public AnonymousClass32A A0M;
    public String A0N;
    public String A0O = "";
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final AnonymousClass0eM A0T = C227642jf.A02(this);
    public final C249383je A0U = new C47918EMo(this, 3);

    public final void D2K(IgImageView igImageView, 1Xl r13, int i, int i2, boolean z, boolean z2) {
        AnonymousClass7TF.A1C(r13, 0, igImageView);
        AnonymousClass0eM r3 = this.A0T;
        C271794jb r8 = new C271794jb(AnonymousClass7TE.A0l(r3), r13);
        r8.A00 = i2;
        r8.A01 = i;
        Q03 q03 = new Q03(this, AnonymousClass7TE.A0l(r3), r8, this, 2EG.A2D);
        q03.A00(igImageView, r8, Dbb.A0N(r13, q03, i2, i));
        if (r13 instanceof AnonymousClass3OA) {
            q03.A0O = (AnonymousClass3OA) r13;
        }
        new Q02(q03).A02();
        1Xj BPf = r13.BPf();
        FragmentActivity requireActivity = requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        AnonymousClass47L r32 = null;
        AndroidLink A022 = AnonymousClass47K.A02(requireActivity, A0l, BPf, i2, false);
        AnonymousClass47L r1 = null;
        if (A022 != null) {
            r32 = C271714jT.A01(A022);
        }
        if (r32 != AnonymousClass47L.AD_DESTINATION_CANVAS) {
            if (A022 != null) {
                r1 = C271714jT.A01(A022);
            }
            if (r1 != AnonymousClass47L.AD_DESTINATION_CLIPS_VIEWER) {
                return;
            }
        }
        DbZ.A17(this);
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        String str;
        Reel reel2 = reel;
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
        AnonymousClass7TG.A1N(reel, gradientSpinnerAvatarView);
        List A1I = AnonymousClass7TE.A1I(reel);
        AnonymousClass32A r3 = this.A0M;
        if (r3 == null) {
            str = "reelViewerLauncher";
        } else {
            String str2 = this.A0N;
            if (str2 == null) {
                str = "reelTraySessionId";
            } else {
                r3.A0C = str2;
                C50896Fkb.A00(requireActivity(), gradientSpinnerAvatarView.getAvatarBounds(), r3, this, 17);
                r3.A09(reel2, AnonymousClass3BQ.LIKES_LIST, gradientSpinnerAvatarView2, A1I, A1I, A1I);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DGM(User user, int i) {
    }

    public final void DRX(User user) {
        String str;
        0qQ.A0B(user, 0);
        if (this.A0S) {
            String B8Q = user.B8Q();
            String id = user.getId();
            String str2 = this.A0G;
            if (str2 != null) {
                ClipsInteractionReplySheetContent clipsInteractionReplySheetContent = new ClipsInteractionReplySheetContent(SocialContextType.LIKED_BY, user.Bh3(), B8Q, id, str2, (String) null, getModuleName());
                FragmentActivity requireActivity = requireActivity();
                UserSession A0l = AnonymousClass7TE.A0l(this.A0T);
                C62320sa r1 = this.A0I;
                if (r1 != null) {
                    C62320sa r0 = this.A0H;
                    if (r0 != null) {
                        C69970NvA.A00(requireActivity, A0l, clipsInteractionReplySheetContent, r1, r0);
                        return;
                    }
                    str = "logReplyBottomSheetKeyboardInteraction";
                } else {
                    str = "logUserProfileClickFromBottomSheet";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0y();
        }
        1pE A012 = 1pE.A01(requireActivity(), this, AnonymousClass7TE.A0l(this.A0T), "message_button");
        Dbc.A0x(A012, user);
        A012.A06();
    }

    public final void DwV(User user, int i) {
        0qQ.A0B(user, 0);
        FragmentActivity requireActivity = requireActivity();
        String id = user.getId();
        String moduleName = getModuleName();
        AnonymousClass0eM r6 = this.A0T;
        C46474Dfc A012 = C46548Dgp.A01(AnonymousClass7TE.A0l(r6), id, "likes_list_user_row", moduleName);
        if (this.A0J) {
            Bundle A013 = C46447Df9.A02().A01(AnonymousClass7TE.A0l(r6), A012.A04());
            DbU.A1K(this, DbS.A0b(requireActivity(), A013, DbT.A0X(r6), ModalActivity.class, "profile"));
            return;
        }
        C309516Yo A0N2 = DbX.A0N(requireActivity, r6);
        A0N2.A0F = true;
        C46474Dfc.A03(A0N2, AnonymousClass7TE.A0l(r6), C46447Df9.A02(), A012);
    }

    public final void DwW(View view, User user, int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        if (isAdded()) {
            if (this.A0J) {
                r3.Etr(false);
            }
            C46729DkI dkI = this.A0B;
            if (dkI == null) {
                0qQ.A0F("likesListViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            r3.Eom(dkI.A0E(this.A0F));
            if (this.A05 != null) {
                UserSession A0l = AnonymousClass7TE.A0l(this.A0T);
                1Xj r0 = this.A05;
                0qQ.A0A(r0);
                if (C46342Dck.A01(A0l, r0)) {
                    C46342Dck.A00(requireContext(), FP4.A00(this, 48), r3);
                }
            }
            r3.Eu4(true);
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final int getExtraDragSpace() {
        return 0;
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isScrolledToBottom() {
        if (this.mView == null || getRecyclerView() == null || !getRecyclerView().canScrollVertically(1)) {
            return true;
        }
        return false;
    }

    public final boolean isScrolledToTop() {
        if (this.mView == null || getRecyclerView() == null || !getRecyclerView().canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final void onSearchTextChanged(String str) {
        0qQ.A0B(str, 0);
        if (!0qQ.A0K(this.A0O, str)) {
            this.A0O = str;
            C46729DkI dkI = this.A0B;
            if (dkI == null) {
                0qQ.A0F("likesListViewModel");
                throw AnonymousClass00P.createAndThrow();
            } else {
                dkI.A04.Epw(str);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A07 != null && this.A0K) {
            View view2 = this.A03;
            if (view2 == null) {
                0qQ.A0F("likesContainer");
                throw AnonymousClass00P.createAndThrow();
            }
            ViewGroup viewGroup = (ViewGroup) view2;
            Context requireContext = requireContext();
            AnonymousClass0eM r3 = this.A0T;
            GTF gtf = new GTF(requireContext, AnonymousClass7TE.A0l(r3), this);
            View A012 = GTF.A04.A01(requireContext(), viewGroup, AnonymousClass7TE.A0l(r3));
            GTH gth = new GTH(AnonymousClass7TE.A0l(r3), this, this);
            GTG gtg = new GTG(this.A02, this.A01);
            Object tag = A012.getTag();
            if (tag != null) {
                1Xl r0 = this.A06;
                0qQ.A0A(r0);
                gtf.A00(gth.A00(r0, gtg), (GTD) tag);
                viewGroup.addView(A012);
                viewGroup.invalidate();
                C324466zK r02 = this.A07;
                0qQ.A0A(r02);
                r02.A02(A012);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        getScrollingViewProxy().AAD(this.A0U);
        DbV.A0F(this).setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Activity A032 = DbT.A03(this);
        AnonymousClass0eM r32 = this.A0T;
        C46487Dfq A002 = C46486Dfp.A00(A032, this, AnonymousClass7TE.A0l(r32), 23606367);
        getScrollingViewProxy().AAD(A002);
        this.A0L = A002;
        registerLifecycleListener(A002);
        E9N e9n = this.A0A;
        if (e9n == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        setAdapter(e9n);
        String str = this.A0O;
        if (AnonymousClass7TF.A1R(str.length())) {
            IgdsInlineSearchBox igdsInlineSearchBox = this.A08;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A0E.setText(str);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        C238833Dp.A00(DbT.A0X(r32)).A05(view, C238863Ds.REACTION_BROWSER);
        if (this.A0Q && !this.A0P) {
            F1Z f1z = C49303Esm.A00;
            UserSession A0l = AnonymousClass7TE.A0l(r32);
            String str2 = this.A0G;
            if (str2 != null) {
                f1z.A00(this, A0l, str2, (long) this.A02);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        A02(this);
        07U r7 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C59845JaL(viewLifecycleOwner, r7, this, (AnonymousClass4D7) null, 32), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(C47522E6i e6i) {
        E9N e9n = e6i.A0A;
        if (e9n != null) {
            e9n.A0C = false;
            DbY.A18(e6i, false);
            E9N e9n2 = e6i.A0A;
            if (e9n2 != null) {
                if (e9n2.A0R.isEmpty()) {
                    C46445Df7.A01(e6i, false);
                    return;
                }
                return;
            }
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C47522E6i e6i) {
        E9N e9n = e6i.A0A;
        if (e9n == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        1Xj r1 = e6i.A05;
        if (r1 != null) {
            e9n.A03 = r1;
            e9n.A0P.A00 = r1;
            e9n.A03();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A02(C47522E6i e6i) {
        E9N e9n = e6i.A0A;
        if (e9n != null) {
            e9n.A0C = true;
            DbY.A18(e6i, true);
            E9N e9n2 = e6i.A0A;
            if (e9n2 != null) {
                if (e9n2.A0R.isEmpty()) {
                    C46445Df7.A01(e6i, true);
                    return;
                }
                return;
            }
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A03() {
        E9N e9n = this.A0A;
        if (e9n == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            e9n.notifyDataSetChanged();
        }
    }

    public final void A04() {
        E9N e9n = this.A0A;
        if (e9n == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            e9n.A03();
        }
    }

    public final 0jB E4x() {
        1Xj r2 = this.A05;
        if (r2 != null) {
            AnonymousClass0eM r3 = this.A0T;
            if (r2.A2A(AnonymousClass7TE.A0l(r3)) != null) {
                0jB r22 = new 0jB();
                1Xj r1 = this.A05;
                0qQ.A0A(r1);
                User A2A = r1.A2A(AnonymousClass7TE.A0l(r3));
                0qQ.A0A(A2A);
                r22.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A2A.getId());
                1Xj r0 = this.A05;
                0qQ.A0A(r0);
                r22.A0A("media_id", r0.getId());
                return r22;
            }
        }
        return null;
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
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

    public final String getModuleName() {
        String str;
        User A2A;
        AnonymousClass0eM r0 = this.A0T;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        1Xj r1 = this.A05;
        if (r1 == null || (A2A = r1.A2A(AnonymousClass7TE.A0l(r0))) == null) {
            str = null;
        } else {
            str = A2A.getId();
        }
        0qQ.A0B(A0l, 0);
        if (2R8.A07(A0l.A06, str)) {
            return "self_likers";
        }
        return "likers";
    }

    public final View getRowView() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A08;
        if (igdsInlineSearchBox != null || AnonymousClass2Rc.A00) {
            0qQ.A0A(igdsInlineSearchBox);
            return igdsInlineSearchBox;
        }
        throw AnonymousClass7TE.A0z(C66579MXk.A00(8));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0T);
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

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C324466zK r0 = this.A07;
        if (r0 != null) {
            r0.A01(i);
        }
    }

    public final void onSearchCleared(String str) {
        C46729DkI dkI = this.A0B;
        if (dkI == null) {
            0qQ.A0F("likesListViewModel");
            throw AnonymousClass00P.createAndThrow();
        } else {
            dkI.A04.Epw("");
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Integer num;
        super.onActivityResult(i, i2, intent);
        if ((i != 4921 && i != 4928) || this.A05 == null) {
            return;
        }
        if (i2 == 1 || i2 == 2) {
            AnonymousClass0eM r0 = this.A0T;
            UserSession A0l = AnonymousClass7TE.A0l(r0);
            UserSession A0l2 = AnonymousClass7TE.A0l(r0);
            1Xj r4 = this.A05;
            if (r4 != null) {
                LAG A002 = C246353eS.A00(AnonymousClass818.IG_SELF_REEL_LIKES_SHEET, new C64548Ldp(this, 2), A0l2, r4, AnonymousClass05K.A15);
                Context requireContext = requireContext();
                if (i2 == 1) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A01;
                }
                C246353eS.A03(requireContext, A002, A0l, num);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: X.G6X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: X.71G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: X.E6i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: X.E6i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: X.E6i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: X.4DH} */
    /* JADX WARNING: type inference failed for: r26v0, types: [java.lang.Object, X.2ms] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01ba, code lost:
        if (X.F8J.A01(r9) == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01c3, code lost:
        if (r12 == false) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01d7, code lost:
        if (X.2R8.A04(r9, r10.A2A(r9)) == false) goto L_0x026e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r44) {
        /*
            r43 = this;
            r0 = 143329835(0x88b0a2b, float:8.368149E-34)
            int r18 = X.AnonymousClass0fD.A02(r0)
            r8 = r43
            android.os.Bundle r7 = r8.requireArguments()
            r0 = r44
            super.onCreate(r0)
            java.lang.String r0 = "LikesListFragment.MEDIA_ID"
            r6 = 0
            java.lang.String r0 = r7.getString(r0, r6)
            r8.A0G = r0
            java.lang.String r0 = "LikesListFragment.TIME_ORDERED"
            r7.getBoolean(r0)
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5 = 0
            int r0 = r7.getInt(r0, r5)
            r8.A01 = r0
            r0 = 976(0x3d0, float:1.368E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4 = -1
            int r0 = r7.getInt(r0, r4)
            r8.A02 = r0
            r0 = 112(0x70, float:1.57E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r7.getBoolean(r0, r5)
            r8.A0J = r0
            r0 = 236(0xec, float:3.31E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r7.getBoolean(r0, r5)
            r8.A0Q = r0
            java.lang.String r0 = "UserListFragmentFactory.LIKERS_LIST_FRAGMENT_ARGUMENTS_HAS_MULTI_TABS_IN_BOTTOM_SHEET_MODE"
            boolean r0 = r7.getBoolean(r0, r5)
            r8.A0P = r0
            r0 = 1055(0x41f, float:1.478E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r7.getBoolean(r0, r5)
            r8.A0R = r0
            r0 = 1054(0x41e, float:1.477E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r7.getBoolean(r0, r5)
            r8.A0S = r0
            r0 = 2350(0x92e, float:3.293E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3 = 1
            boolean r0 = r7.getBoolean(r0, r3)
            r8.A0K = r0
            X.0eM r14 = r8.A0T
            X.0lg r10 = X.DbT.A0X(r14)
            java.lang.String r0 = "EARLY_INITIALIZED_REPOSITORY"
            java.lang.String r9 = r7.getString(r0)
            r2 = 0
            if (r9 == 0) goto L_0x027d
            X.0qQ.A0B(r10, r5)
            X.Pm5 r1 = new X.Pm5
            r1.<init>(r10, r3)
            java.lang.Class<X.Ewt> r0 = X.C49514Ewt.class
            java.lang.Object r0 = r10.A01(r0, r1)
            X.Ewt r0 = (X.C49514Ewt) r0
            java.util.Map r0 = r0.A00
            java.lang.Object r1 = r0.remove(r9)
            com.instagram.repository.common.IgBaseRepository r1 = (com.instagram.repository.common.IgBaseRepository) r1
        L_0x00a6:
            boolean r0 = r1 instanceof com.instagram.user.userlist.data.LikesListRepository
            if (r0 == 0) goto L_0x00ad
            r2 = r1
            com.instagram.user.userlist.data.LikesListRepository r2 = (com.instagram.user.userlist.data.LikesListRepository) r2
        L_0x00ad:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r14)
            X.JwH r10 = X.C49191Eqw.A00(r7, r0)
            android.app.Application r9 = X.DbY.A05(r8)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r14)
            X.Dla r0 = new X.Dla
            r0.<init>(r9, r10, r1, r2)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r8)
            java.lang.Class<X.DkI> r0 = X.C46729DkI.class
            X.2YL r0 = r1.A00(r0)
            X.DkI r0 = (X.C46729DkI) r0
            r8.A0B = r0
            X.1Xl r0 = r10.A04()
            r8.A06 = r0
            if (r0 == 0) goto L_0x027a
            X.1Xj r0 = r0.BPf()
        L_0x00dd:
            r8.A05 = r0
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r14)
            r9 = 31784966(0x1e50006, float:8.412135E-38)
            java.lang.String r0 = "likers"
            X.Dbx r1 = new X.Dbx
            r1.<init>(r10, r0, r9)
            r8.A04 = r1
            android.content.Context r0 = r8.requireContext()
            X.DbY.A0v(r0, r1, r8, r14)
            int r1 = r8.A01
            X.1Xl r0 = r8.A06
            boolean r0 = X.1sx.A0R(r0, r1)
            if (r0 == 0) goto L_0x0276
            android.content.Context r0 = r8.requireContext()
            X.6zK r0 = X.C324456zJ.A00(r0)
            r8.A07 = r0
            r8.registerLifecycleListener(r0)
            r36 = 1
        L_0x010f:
            android.content.Context r20 = r8.requireContext()
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r14)
            r9 = 2
            r0 = r17
            X.0qQ.A0B(r0, r9)
            X.Fmj r26 = new X.Fmj
            r26.<init>()
            boolean r0 = r8.A0R
            r21 = r0
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r14)
            boolean r1 = r8.A0J
            X.FAF r16 = new X.FAF
            r0 = r16
            r0.<init>(r8, r10, r1)
            boolean r0 = r8.A0Q
            if (r0 != 0) goto L_0x0141
            X.1Xj r0 = r8.A05
            if (r0 == 0) goto L_0x0272
            boolean r0 = r0.A5G()
            if (r0 != r3) goto L_0x0272
        L_0x0141:
            r37 = 1
        L_0x0143:
            X.1Xj r0 = r8.A05
            if (r0 == 0) goto L_0x015d
            X.3QO r1 = r0.A1t()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 != r0) goto L_0x015d
            X.0lg r11 = X.DbT.A0X(r14)
            X.0Tu r10 = X.0Tu.A05
            r0 = 36316087382839231(0x81054a00160fbf, double:3.029778121829376E-306)
            X.182.A06(r10, r11, r0)
        L_0x015d:
            boolean r0 = r8.A0J
            r19 = r0
            r0 = 3
            X.FmY r15 = new X.FmY
            r15.<init>(r8, r0)
            X.F1t r13 = new X.F1t
            r13.<init>(r8)
            r8.A0C = r13
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r14)
            boolean r0 = X.C335997dt.A01(r0)
            if (r0 == 0) goto L_0x019e
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r14)
            X.Fs0 r10 = new X.Fs0
            r10.<init>(r8)
            X.0qQ.A0B(r11, r3)
            X.7wN r0 = X.C347167wN.A00
            boolean r0 = r0.A00(r11, r3)
            if (r0 == 0) goto L_0x019e
            X.0xx r12 = X.AnonymousClass07a.A00(r1)
            r1 = 20
            X.ImR r0 = new X.ImR
            r0.<init>((java.lang.Object) r11, (java.lang.Object) r10, (X.AnonymousClass4D7) r6, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r12)
        L_0x019e:
            X.EvP r11 = new X.EvP
            r11.<init>(r8)
            X.1Xj r10 = r8.A05
            boolean r0 = r8.A0Q
            com.instagram.common.session.UserSession r9 = X.DbW.A0S(r14, r9)
            r38 = 1
            if (r10 == 0) goto L_0x026e
            boolean r1 = r10.A5R()
            if (r1 != r3) goto L_0x01bc
            boolean r1 = X.F8J.A01(r9)
            r12 = 1
            if (r1 != 0) goto L_0x01bd
        L_0x01bc:
            r12 = 0
        L_0x01bd:
            boolean r1 = r10.A5T()
            if (r1 == r3) goto L_0x01c5
            if (r12 == 0) goto L_0x026e
        L_0x01c5:
            if (r0 != 0) goto L_0x026e
            X.1sw r1 = r10.A1u()
            X.1sw r0 = X.1sw.A04
            if (r1 == r0) goto L_0x026e
            com.instagram.user.model.User r0 = r10.A2A(r9)
            boolean r0 = X.2R8.A04(r9, r0)
            if (r0 == 0) goto L_0x026e
        L_0x01d9:
            X.0lg r10 = X.DbT.A0X(r14)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36322723105876340(0x810b5300002974, double:3.0339745797979556E-306)
            boolean r0 = X.182.A06(r9, r10, r0)
            r42 = r0 ^ 1
            X.E9N r0 = new X.E9N
            r23 = r8
            r24 = r17
            r25 = r15
            r27 = r8
            r28 = r8
            r29 = r13
            r30 = r11
            r31 = r8
            r32 = r8
            r33 = r8
            r34 = r21
            r35 = r3
            r39 = r3
            r40 = r5
            r41 = r19
            r19 = r0
            r21 = r8
            r22 = r16
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r8.A0A = r0
            r0 = 975(0x3cf, float:1.366E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r1 = r7.getInt(r0, r4)
            r8.A00 = r1
            if (r1 == r4) goto L_0x0233
            X.E9N r0 = r8.A0A
            if (r0 != 0) goto L_0x0231
            java.lang.String r0 = "adapter"
        L_0x0229:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0231:
            r0.A00 = r1
        L_0x0233:
            X.1Xj r0 = r8.A05
            if (r0 == 0) goto L_0x023a
            A01(r8)
        L_0x023a:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r14)
            X.328 r1 = new X.328
            r1.<init>(r8, r4)
            X.32A r0 = new X.32A
            r0.<init>(r8, r3, r1)
            r8.A0M = r0
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r8.A0N = r0
            if (r2 != 0) goto L_0x0267
            X.DkI r3 = r8.A0B
            if (r3 != 0) goto L_0x0259
            java.lang.String r0 = "likesListViewModel"
            goto L_0x0229
        L_0x0259:
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 49
            X.MG5 r0 = new X.MG5
            r0.<init>(r3, r6, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
        L_0x0267:
            X.Dbx r0 = r8.A04
            if (r0 != 0) goto L_0x0280
            java.lang.String r0 = "navigationPerfLogger"
            goto L_0x0229
        L_0x026e:
            r38 = 0
            goto L_0x01d9
        L_0x0272:
            r37 = 0
            goto L_0x0143
        L_0x0276:
            r36 = 0
            goto L_0x010f
        L_0x027a:
            r0 = r6
            goto L_0x00dd
        L_0x027d:
            r1 = r2
            goto L_0x00a6
        L_0x0280:
            X.34p r0 = r0.A00
            r0.A04()
            java.lang.String r1 = r8.getModuleName()
            java.lang.String r0 = "self_likers"
            X.0qQ.A0K(r1, r0)
            X.8js r1 = r8.A09
            if (r1 != 0) goto L_0x029d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r14)
            X.8js r1 = new X.8js
            r1.<init>(r0)
            r8.A09 = r1
        L_0x029d:
            X.EvO r0 = new X.EvO
            r0.<init>(r8)
            r1.A00 = r0
            X.0qQ.A0A(r1)
            java.lang.String r0 = "likes_sheet"
            r1.A06(r0, r5)
            r1 = 1637986439(0x61a1b087, float:3.7283074E20)
            r0 = r18
            X.AnonymousClass0fD.A09(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47522E6i.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1716357636);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview_with_progress, viewGroup, false);
        this.A03 = inflate.requireViewById(R.id.layout_listview_parent_container);
        Context context = layoutInflater.getContext();
        0qQ.A07(context);
        IgdsInlineSearchBox igdsInlineSearchBox = new IgdsInlineSearchBox(context, (AttributeSet) null, 0);
        igdsInlineSearchBox.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        igdsInlineSearchBox.A02 = this;
        igdsInlineSearchBox.setImeOptions(6);
        if (this.A0J) {
            0nA.A0c(igdsInlineSearchBox, DbV.A05(this).getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
            igdsInlineSearchBox.setSearchRowBackgroundColor(R.drawable.elevated_searchbar_background);
        }
        this.A08 = igdsInlineSearchBox;
        AnonymousClass0fD.A09(-241126143, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(192231194);
        E9N e9n = this.A0A;
        if (e9n == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7Q8 r0 = e9n.A06;
        if (r0 != null) {
            r0.A01();
        }
        this.A07 = null;
        super.onDestroy();
        AnonymousClass0fD.A09(-1728813225, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1797574496);
        View currentFocus = requireActivity().getCurrentFocus();
        if (currentFocus != null) {
            0nA.A0N(currentFocus);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = this.A08;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
            this.A08 = null;
            C307936Sb.A00(AnonymousClass7TE.A0l(this.A0T)).A01.set(false);
            unregisterLifecycleListener(this.A0L);
            this.A0L = null;
            super.onDestroyView();
            AnonymousClass0fD.A09(1213789434, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(459214787, A022);
        throw A0y;
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        DbZ.A1D(recyclerView);
        recyclerView.A0S = true;
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1242086420);
        super.onResume();
        AnonymousClass3K2 A062 = 1OP.A06(requireActivity());
        if (A062 != null && A062.A0Z() && A062.A0H == AnonymousClass3BQ.LIKES_LIST) {
            A062.A0X(this);
        }
        AnonymousClass0fD.A09(-1885450564, A022);
    }
}
