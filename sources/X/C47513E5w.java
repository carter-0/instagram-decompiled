package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.E5w  reason: case insensitive filesystem */
public final class C47513E5w extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ChannelChooserFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "direct_interest_based_channel_chooser";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2dY.A01(FPI.A00(this, 37), DbX.A0I(view, R.id.direct_interest_channel_action_bar)).A0X(FTT.A00);
        BaseFragmentActivity requireActivity = requireActivity();
        0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        requireActivity.A0a();
        FragmentActivity requireActivity2 = requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(this.A04);
        AnonymousClass0eM r6 = this.A01;
        ((RecyclerView) AnonymousClass7TF.A0F(view, R.id.recycler_view)).setAdapter(new C46828Dm4(requireActivity2, A0l, (ChannelCreationFlowExtraArgs) this.A02.getValue(), (ChannelCreationSource) r6.getValue()));
        C313756gx A0R = DbZ.A0R(this.A00);
        ChannelCreationSource channelCreationSource = (ChannelCreationSource) r6.getValue();
        0qQ.A0B(channelCreationSource, 0);
        1Ln A0J = DbT.A0J(A0R);
        if (DbT.A1Y(A0J)) {
            DbW.A17(A0J, A0R);
            DbV.A1M(A0J, "create_channel_sheet_rendered");
            A0J.A0p("channel_item");
            Dba.A1E(A0J, C313756gx.A00(channelCreationSource));
            Dba.A1C(A0J, A0R);
        }
        C50338FYv fYv = (C50338FYv) this.A05.getValue();
        ChannelCreationSource channelCreationSource2 = (ChannelCreationSource) r6.getValue();
        0qQ.A0B(channelCreationSource2, 0);
        1Ln A002 = C50338FYv.A00(fYv);
        if (DbT.A1Y(A002)) {
            C50338FYv.A04(A002, fYv);
            DbV.A1M(A002, "create_channel_sheet_rendered");
            A002.A0p("channel_item");
            C50338FYv.A05(A002, fYv, C50338FYv.A01(channelCreationSource2));
            A002.Cgf();
        }
        if (AnonymousClass7TF.A1Z(this.A03)) {
            int A032 = Dbb.A03(view, R.id.direct_interest_channel_action_bar);
            DbT.A1F(view, R.id.header_title, A032);
            DbT.A1F(view, R.id.header_description, A032);
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
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

    public C47513E5w() {
        0eO r2 = 0eO.A02;
        this.A01 = C51804G2n.A01(this, "social_channel_creation_source", r2, 13);
        this.A03 = Dba.A0g(this, r2, 25);
        this.A02 = C51804G2n.A01(this, "direct_channel_creation_flow_extra_args", r2, 14);
        this.A00 = Dba.A0g(this, r2, 24);
        this.A05 = Dba.A0g(this, r2, 26);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(248770421);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_interest_channel_chooser, false);
        AnonymousClass0fD.A09(-1958049361, A022);
        return A0D;
    }
}
