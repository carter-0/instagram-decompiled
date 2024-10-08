package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.User;

public final class E5U extends AnonymousClass4DH implements AnonymousClass4DU, C273494mf {
    public static final String __redex_internal_original_name = "ProfileNotificationsSettingsFragment";
    public C49598EzH A00;
    public G6E A01;
    public ScrollView A02;
    public final 1Z6 A03 = AnonymousClass2MF.A00();
    public final String A04 = "media_notifications_sheet";
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A02 = (ScrollView) view2.requireViewById(R.id.profile_follow_sheet_notifications_scroll_view);
        View A0G = AnonymousClass7TF.A0G(view2, R.id.profile_follow_sheet_notifications_list_container);
        C252063oV A012 = 2b1.A01(view2.findViewById(R.id.igtv_setting_row_stub), false, false);
        C252063oV A0Y = DbU.A0Y(view2, R.id.clips_setting_row_stub);
        C252063oV A0Y2 = DbU.A0Y(view2, R.id.live_settings_row_stub);
        C252063oV A0T = DbV.A0T(view2, R.id.subscriptions_content_row_stub, false);
        C252063oV A0Y3 = DbU.A0Y(view2, R.id.broadcast_chat_settings_row_stub);
        C252063oV A0Y4 = DbU.A0Y(view2, R.id.broadcast_chat_multi_options_settings_row_stub);
        EmptyStateView emptyStateView = (EmptyStateView) AnonymousClass7TF.A0G(view2, R.id.profile_follow_sheet_notifications_empty_state_view);
        emptyStateView.A0N(FPC.A00(this, 48), C320156rr.ERROR);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C58091Im6(viewLifecycleOwner, r3, this, A0G, emptyStateView, view2, A012, A0Y2, A0Y, A0T, A0Y3, A0Y4, (AnonymousClass4D7) null, 0), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(C252063oV r4, E5U e5u, User user) {
        if (!182.A06(0Tu.A05, DbY.A0R(e5u.A05), 36321911357056861L)) {
            IgdsListCell igdsListCell = (IgdsListCell) r4.getView();
            igdsListCell.A06(2131976251);
            igdsListCell.setTextCellType(C69349Njo.TYPE_SWITCH);
            igdsListCell.setChecked(user.A23());
            FdT.A03(igdsListCell, user, e5u, 5);
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

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
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
        ScrollView scrollView = this.A02;
        if (scrollView == null || scrollView.getScrollY() <= 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public E5U() {
        C51795G2e g2e = new C51795G2e(this, 20);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51795G2e(new C51795G2e(this, 17), 18));
        this.A06 = DbS.A0I(new C51795G2e(A002, 19), g2e, new MJ4(40, (Object) null, A002), DbS.A0z(C46774Dl1.class));
    }

    public static final void A01(C252063oV r3, E5U e5u, User user) {
        int i;
        IgdsListCell igdsListCell = (IgdsListCell) r3.getView();
        igdsListCell.A06(2131962578);
        igdsListCell.A0C(FPC.A00(e5u, 47));
        int ordinal = user.A0A().ordinal();
        if (ordinal != 1) {
            i = 2131976243;
            if (ordinal != 3) {
                i = 2131976238;
            }
        } else {
            i = 2131976232;
        }
        igdsListCell.A0K(AnonymousClass7TF.A0d(igdsListCell.getResources(), i), false);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-140950141);
        E5U.super.onCreate(bundle);
        ((C46774Dl1) this.A06.getValue()).A00();
        AnonymousClass0fD.A09(-1634427330, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1024731319);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_profile_follow_sheet_notifications, viewGroup, false);
        AnonymousClass0fD.A09(-124902505, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1675376519);
        super.onDestroyView();
        this.A02 = null;
        AnonymousClass0fD.A09(-1051380884, A022);
    }
}
