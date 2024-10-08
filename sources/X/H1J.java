package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.common.session.UserSession;

public final class H1J extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, C273494mf, AnonymousClass4DS, X7t {
    public static final String __redex_internal_original_name = "TrendingAudioFragment";
    public RecyclerView A00;
    public TrackOrOriginalSoundSchema A01;
    public C320506sU A02 = new C320506sU(AnonymousClass8ZN.TRENDING_AUDIO_LIST, AnonymousClass7TG.A0j());
    public C3515689j A03;
    public U94 A04;
    public HM8 A05;
    public String A06;
    public String A07;
    public C234502xy A08;
    public boolean A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final AnonymousClass0eM A0B;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        if (this.A03 == C3515689j.GALLERY) {
            r4.Eu4(false);
            r4.Eol(2131975525, R.color.barcelona_story_share_light_mode);
            return;
        }
        r4.Eu4(true);
        r4.Eom(2131975525);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0077, code lost:
        if (r6 == X.C3515689j.BROWSER) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        if (r5 == X.C3515689j.BROWSER) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            r21 = this;
            r3 = 0
            r0 = r22
            X.0qQ.A0B(r0, r3)
            r9 = r21
            r1 = r23
            super.onViewCreated(r0, r1)
            X.0eM r5 = r9.A0A
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r5)
            X.2xy r11 = r9.A08
            if (r11 == 0) goto L_0x0171
            X.6sU r8 = r9.A02
            X.0lg r4 = X.AnonymousClass7TF.A0L(r5, r3)
            X.0Tu r6 = X.0Tu.A05
            r1 = 36328401052908874(0x81107d00043d4a, double:3.0375653363645877E-306)
            boolean r16 = X.182.A06(r6, r4, r1)
            boolean r4 = r9.A09
            X.0lg r5 = X.AnonymousClass7TF.A0L(r5, r3)
            r1 = 36328555671666090(0x8110a100033daa, double:3.037663117889251E-306)
            boolean r1 = X.182.A06(r6, r5, r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Integer r13 = X.AnonymousClass05K.A0Y
        L_0x003b:
            android.content.Context r7 = r9.requireContext()
            X.89j r5 = r9.A03
            X.89j r1 = X.C3515689j.GALLERY
            if (r5 == r1) goto L_0x004b
            X.89j r2 = X.C3515689j.BROWSER
            r18 = 0
            if (r5 != r2) goto L_0x004d
        L_0x004b:
            r18 = 1
        L_0x004d:
            r19 = 0
            r15 = 1
            X.J4S r14 = X.J4S.A00
            X.U94 r6 = new X.U94
            r12 = r9
            r17 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r9.A04 = r6
            r2 = 2131432342(0x7f0b1396, float:1.8486439E38)
            android.view.View r4 = X.AnonymousClass7TE.A0b(r0, r2)
            com.instagram.ui.emptystaterow.EmptyStateView r4 = (com.instagram.ui.emptystaterow.EmptyStateView) r4
            r2 = 12
            X.ICy r2 = X.C56801ICy.A00(r9, r2)
            X.6rr r5 = X.C320156rr.ERROR
            r4.A0N(r2, r5)
            X.89j r6 = r9.A03
            if (r6 == r1) goto L_0x0079
            X.89j r2 = X.C3515689j.BROWSER
            r1 = 0
            if (r6 != r2) goto L_0x007a
        L_0x0079:
            r1 = 1
        L_0x007a:
            r7 = 8
            if (r1 == 0) goto L_0x00a7
            r4.setVisibility(r7)
            android.content.Context r2 = r9.requireContext()
            r1 = 2131099921(0x7f060111, float:1.7812209E38)
            int r1 = r2.getColor(r1)
            r4.A0M(r1)
            android.content.Context r2 = r9.requireContext()
            r1 = 2131099703(0x7f060037, float:1.7811767E38)
            int r2 = r2.getColor(r1)
            java.util.HashMap r1 = r4.A01
            java.lang.Object r1 = r1.get(r5)
            r1.getClass()
            X.72b r1 = (X.C3253572b) r1
            r1.A01 = r2
        L_0x00a7:
            r1 = 2131433821(0x7f0b195d, float:1.8489439E38)
            android.view.View r6 = r0.findViewById(r1)
            r1 = 2131428275(0x7f0b03b3, float:1.847819E38)
            android.view.View r5 = X.AnonymousClass7TE.A0b(r0, r1)
            X.89j r2 = r9.A03
            X.89j r1 = X.C3515689j.BROWSER
            if (r2 != r1) goto L_0x010e
            r6.setVisibility(r3)
            r1 = 2131433855(0x7f0b197f, float:1.8489507E38)
            android.widget.TextView r2 = X.DbW.A0B(r6, r1)
            r1 = 2131975535(0x7f135d6f, float:1.9588165E38)
            X.DbU.A1G(r2, r9, r1)
            r1 = 2131433815(0x7f0b1957, float:1.8489426E38)
            android.view.View r2 = r6.findViewById(r1)
            r1 = 13
            X.C56801ICy.A01(r2, r1, r9)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            r1.height = r3
        L_0x00dd:
            r1 = 2131439764(0x7f0b3094, float:1.8501492E38)
            android.view.View r5 = r0.findViewById(r1)
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r5 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r5
            r2 = 5
            X.Wf5 r1 = new X.Wf5
            r1.<init>(r9, r2)
            r5.A07 = r1
            r1 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r9.A00 = r1
            if (r1 == 0) goto L_0x00fe
            X.DbY.A16(r9, r1)
        L_0x00fe:
            androidx.recyclerview.widget.RecyclerView r8 = r9.A00
            if (r8 == 0) goto L_0x0138
            X.U94 r7 = r9.A04
            if (r7 != 0) goto L_0x011d
            X.DbS.A13()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x010e:
            r6.setVisibility(r7)
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            r1 = -2
            r2.height = r1
            goto L_0x00dd
        L_0x0119:
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            goto L_0x003b
        L_0x011d:
            X.Ghn r6 = new X.Ghn
            r6.<init>()
            r2 = 9
            X.MMt r1 = new X.MMt
            r1.<init>(r6, r2)
            r7.A06(r1)
            X.2Rw[] r2 = new X.2Rw[]{r7, r6}
            X.UAE r1 = new X.UAE
            r1.<init>(r2)
            r8.setAdapter(r1)
        L_0x0138:
            androidx.recyclerview.widget.RecyclerView r6 = r9.A00
            if (r6 == 0) goto L_0x0155
            int r1 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            androidx.fragment.app.FragmentActivity r2 = r9.requireActivity()
            r1 = 50
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r1)
            X.3jo r2 = (X.C249453jo) r2
            X.3Dv r1 = new X.3Dv
            r1.<init>(r2, r3)
            r6.A15(r1)
        L_0x0155:
            X.07U r14 = X.07U.A05
            X.07Z r18 = r9.getViewLifecycleOwner()
            X.0xx r2 = X.AnonymousClass07a.A00(r18)
            r20 = 24
            X.JTw r1 = new X.JTw
            r12 = r1
            r13 = r0
            r15 = r4
            r16 = r5
            r17 = r9
            r12.<init>((java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (X.AnonymousClass4D7) r19, (int) r20)
            X.AnonymousClass7TE.A1Z(r1, r2)
            return
        L_0x0171:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1J.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void A00() {
        C234502xy r1 = this.A08;
        if (r1 != null) {
            r1.EHu(false);
        }
    }

    public final void D05(C16181Uq6 uq6) {
        2YL A0H = DbS.A0H(this.A0B);
        C58105ImR.A01(A0H, uq6, C318116oQ.A00(A0H), 8);
    }

    public final void DLx(C16181Uq6 uq6) {
        2YL A0H;
        C318136oS A002;
        int i;
        C3515689j r1 = this.A03;
        if (r1 == C3515689j.GALLERY || r1 == C3515689j.BROWSER) {
            A0H = DbS.A0H(this.A0B);
            A002 = C318116oQ.A00(A0H);
            i = 7;
        } else if (r1 == C3515689j.AUDIO_PAGE || r1 == C3515689j.TREND_REPORT || r1 == C3515689j.CREATORS_INSPIRATION_HUB_AUDIO) {
            A0H = DbS.A0H(this.A0B);
            A002 = C318116oQ.A00(A0H);
            i = 6;
        } else {
            return;
        }
        C58105ImR.A01(A0H, uq6, A002, i);
    }

    public final void Dgd(C16181Uq6 uq6) {
        ((C52963GgG) this.A0B.getValue()).A0H(uq6);
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
        if (this.A05 == HM8.CREATOR_INSPIRATION_HUB_AUDIO_TAB) {
            return "ig_creator_inspiration_hub_audio_see_more";
        }
        return "trending_audio_list";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
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
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || recyclerView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public final boolean onBackPressed() {
        0hq r0;
        if (this.A03 != C3515689j.BROWSER || (r0 = this.mFragmentManager) == null) {
            return false;
        }
        r0.A0c();
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public H1J() {
        C58679Ivo ivo = new C58679Ivo(this, 28);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58679Ivo(new C58679Ivo(this, 25), 26));
        this.A0B = DbS.A0I(new C58679Ivo(A002, 27), ivo, C58688Ivx.A00((Object) null, A002, 49), DbS.A0z(C52963GgG.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass8ZN r1;
        int A022 = AnonymousClass0fD.A02(1902396574);
        H1J.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A07 = requireArguments.getString(AnonymousClass000.A00(5176));
        this.A03 = (C3515689j) requireArguments.getSerializable(AnonymousClass000.A00(1608));
        this.A01 = (TrackOrOriginalSoundSchema) requireArguments.getParcelable(AnonymousClass000.A00(2671));
        this.A05 = (HM8) requireArguments.getSerializable(AnonymousClass000.A00(811));
        this.A06 = requireArguments.getString(AnonymousClass000.A00(692));
        this.A09 = requireArguments.getBoolean(AnonymousClass000.A00(1815));
        if (this.A05 == HM8.CREATOR_INSPIRATION_HUB_AUDIO_TAB) {
            String A0j = AnonymousClass7TG.A0j();
            if (0qQ.A0K(this.A06, "trending")) {
                r1 = AnonymousClass8ZN.CREATOR_INSPIRATION_HUB_AUDIO_TRENDING_LIST_SEE_MORE;
            } else if (0qQ.A0K(this.A06, AnonymousClass000.A00(348))) {
                r1 = AnonymousClass8ZN.CREATOR_INSPIRATION_HUB_AUDIO_POPULAR_WITH_YOUR_FOLLOWERS_SEE_MORE;
            } else {
                r1 = AnonymousClass8ZN.CREATOR_INSPIRATION_HUB_AUDIO;
            }
            this.A02 = new C320506sU(r1, A0j);
        }
        Context requireContext = requireContext();
        AnonymousClass0eM r3 = this.A0A;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        this.A08 = C234472xv.A00(requireContext, A0l, this, new C234462xu(requireContext(), AnonymousClass7TE.A0l(r3)), __redex_internal_original_name, C234472xv.A02(A0l));
        0lg A0X = DbT.A0X(r3);
        Long A0j2 = C51972G9s.A0j(this.A07);
        String str = this.A06;
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(this, A0X, 0), "instagram_organic_view_audio_list");
        if (A0e.isSampled()) {
            C51965G9l.A1M(A0e, getModuleName());
            C51965G9l.A1F(A0e, A0j2);
            DbY.A1C(A0e);
            A0e.AAJ("trending_tab_category", str);
            A0e.Cgf();
        }
        AnonymousClass0fD.A09(816749460, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(436783398);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.trending_audio_fragment, viewGroup, false);
        AnonymousClass0fD.A09(43752295, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-359662157);
        super.onDestroy();
        C234502xy r0 = this.A08;
        if (r0 != null) {
            r0.release();
        }
        this.A08 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(713287244, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-2136327804);
        H1J.super.onPause();
        C234502xy r1 = this.A08;
        if (r1 != null) {
            r1.EHu(false);
        }
        AnonymousClass0fD.A09(881720354, A022);
    }
}
