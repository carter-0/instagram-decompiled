package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.H1c  reason: case insensitive filesystem */
public final class C54158H1c extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "CreatorAILearnMoreNuxBottomSheet";
    public final AnonymousClass0eM A00 = C58683Ivs.A00(this, 39);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;
    public final String A03 = "creator_ai_learn_more_nux_bottom_sheet";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.creator_ai_fan_nux_loading_spinner);
        View findViewById2 = view.findViewById(R.id.creator_ai_fan_nux_content);
        View findViewById3 = view.findViewById(R.id.creator_ai_nux_headline);
        0qQ.A0A(findViewById3);
        findViewById3.setVisibility(8);
        View findViewById4 = view.findViewById(R.id.creator_ai_nux_bullet_one);
        View findViewById5 = view.findViewById(R.id.creator_ai_nux_bullet_two);
        View findViewById6 = view.findViewById(R.id.creator_ai_nux_bullet_three);
        View findViewById7 = view.findViewById(R.id.creator_ai_terms_footer);
        0qQ.A0A(findViewById7);
        findViewById7.setVisibility(8);
        View findViewById8 = view.findViewById(R.id.creator_ai_nux_bottom_button_layout);
        0qQ.A0A(findViewById8);
        findViewById8.setVisibility(8);
        View findViewById9 = view.findViewById(R.id.creator_ai_beta_label);
        0qQ.A0A(findViewById9);
        findViewById9.setVisibility(8);
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C59700JUh(r2, findViewById, this, findViewById4, viewLifecycleOwner, findViewById2, findViewById5, findViewById6, (AnonymousClass4D7) null, 8), AnonymousClass07a.A00(viewLifecycleOwner));
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
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
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

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C54158H1c() {
        C58683Ivs ivs = new C58683Ivs(this, 43);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58683Ivs(new C58683Ivs(this, 40), 41));
        this.A02 = DbS.A0I(new C58683Ivs(A002, 42), ivs, new C58689Ivy(12, A002, (Object) null), DbS.A0z(C52982GgZ.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1235228753);
        C54158H1c.super.onCreate(bundle);
        2YL A0H = DbS.A0H(this.A02);
        C58102ImO.A02(A0H, C318116oQ.A00(A0H), 21);
        AnonymousClass0fD.A09(-779380100, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1416750843);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.creator_ai_in_thread_nux, false);
        AnonymousClass0fD.A09(-1360501720, A022);
        return A0D;
    }
}
