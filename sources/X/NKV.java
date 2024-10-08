package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;

public final class NKV extends AnonymousClass32G implements C273494mf {
    public static final String __redex_internal_original_name = "EscalationBottomSheetFragment";
    public View.OnClickListener A00;
    public UserSession A01;
    public C331157Pu A02;
    public User A03;
    public ONV A04;
    public C49530ExC A05;
    public NKz A06;
    public NHU A07;
    public String A08;
    public String A09;
    public LinearLayout A0A;
    public IgdsButton A0B;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "escalation_bottom_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final 0lg A0Y() {
        return this.A01;
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

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C66582MXn.A15(this.A0A, i, i2);
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

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(-1806303807);
        NKV.super.onCreate(bundle);
        if (bundle != null) {
            C66580MXl.A1G(this);
            i = -1606392583;
        } else {
            Bundle requireArguments = requireArguments();
            this.A01 = DbX.A0U(this);
            boolean z = requireArguments.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD");
            this.A04 = C49238Erh.A00(this.A01, z);
            this.A05 = ORV.A00(this.A01, z);
            this.A08 = DbU.A0l(requireArguments, "ReportingConstants.ARG_CONTENT_ID");
            NKz nKz = new NKz(requireContext(), this);
            this.A06 = nKz;
            A0V(nKz);
            requireArguments.getBoolean("ReportingConstants.ARG_IS_INTEROP_THREAD");
            requireArguments.getString("ReportingConstants.ARG_DIRECT_THREAD_ID");
            i = 1531108612;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1862588506);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.frx_report_fragment);
        AnonymousClass0fD.A09(-19444060, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1082939479);
        super.onDestroyView();
        this.A0A = null;
        this.A0B = null;
        AnonymousClass0fD.A09(-1917892195, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        OM1 A002 = this.A07.A00();
        this.A02.A0M(A002.A0G.A00);
        NKz nKz = this.A06;
        ImageUrl imageUrl = A002.A00;
        C70754OKa oKa = A002.A0F;
        C70754OKa oKa2 = A002.A04;
        nKz.A00 = imageUrl;
        nKz.A02 = oKa;
        nKz.A01 = oKa2;
        nKz.A06();
        ImageUrl imageUrl2 = nKz.A00;
        if (!C253833rU.A02(imageUrl2)) {
            nKz.A09(nKz.A03, (Object) null, C70709OHe.A00(imageUrl2));
        }
        C70754OKa oKa3 = nKz.A02;
        if (oKa3 != null) {
            nKz.A09(nKz.A05, oKa3.A00, new OGX((Integer) null, (Integer) null, (Integer) null, (Integer) null, true));
        }
        C70754OKa oKa4 = nKz.A01;
        if (oKa4 != null) {
            nKz.A09(nKz.A04, oKa4.A00, new OGX(Integer.valueOf(R.dimen.action_bar_item_spacing_left), (Integer) null, (Integer) null, (Integer) null, true));
        }
        nKz.A07();
        this.A0A = (LinearLayout) view.findViewById(R.id.frx_report_action_button_wrapper);
        IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.frx_report_action_button);
        this.A0B = igdsButton;
        OTO oto = A002.A02;
        if (oto != null && igdsButton != null) {
            0S7.A00(this);
            0nA.A0X(this.A04, DbV.A05(this).getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height));
            this.A0B.setText(oto.A01.A00);
            AnonymousClass0fU.A00(this.A00, this.A0B);
            this.A0B.setEnabled(true);
            LinearLayout linearLayout = this.A0A;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            this.A04.A02(this.A03, this.A09, this.A08, OTO.A00(oto));
        }
    }
}
