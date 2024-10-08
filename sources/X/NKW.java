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
import java.util.List;

public final class NKW extends AnonymousClass32G implements C273494mf {
    public static final String __redex_internal_original_name = "ProcessEducationBottomSheetFragment";
    public float A00;
    public UserSession A01;
    public C331157Pu A02;
    public User A03;
    public ONV A04;
    public C49530ExC A05;
    public NL0 A06;
    public C74488Pvi A07;
    public NHU A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public LinearLayout A0F;
    public IgdsButton A0G;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "process_education_bottom_sheet";
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
        C66582MXn.A15(this.A0F, i, i2);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public NKW(C331157Pu r2, User user, C74488Pvi pvi, NHU nhu) {
        this.A02 = r2;
        this.A08 = nhu;
        this.A0B = nhu.A00().A0H;
        this.A0C = nhu.A00().A0A;
        this.A09 = nhu.A01();
        this.A07 = pvi;
        this.A03 = user;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(-1066464382);
        NKW.super.onCreate(bundle);
        if (bundle != null) {
            C66580MXl.A1G(this);
            i = 1025124726;
        } else {
            Bundle bundle2 = this.mArguments;
            bundle2.getClass();
            this.A01 = DbX.A0U(this);
            this.A0A = DbU.A0l(bundle2, "ReportingConstants.ARG_CONTENT_ID");
            this.A0D = bundle2.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD");
            this.A0E = bundle2.getBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED");
            this.A00 = bundle2.getFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO");
            NL0 nl0 = new NL0(requireContext(), this);
            this.A06 = nl0;
            A0V(nl0);
            this.A04 = C49238Erh.A00(this.A01, this.A0D);
            this.A05 = ORV.A00(this.A01, this.A0D);
            bundle2.getBoolean("ReportingConstants.ARG_IS_INTEROP_THREAD");
            bundle2.getString("ReportingConstants.ARG_DIRECT_THREAD_ID");
            i = -1813478544;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1886578961);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.frx_report_fragment);
        AnonymousClass0fD.A09(1189559037, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-356566233);
        super.onDestroyView();
        this.A0F = null;
        this.A0G = null;
        AnonymousClass0fD.A09(-1506519922, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        this.A0F = (LinearLayout) view.requireViewById(R.id.frx_report_action_button_wrapper);
        this.A0G = DbU.A0b(view, R.id.frx_report_action_button);
        OM1 A002 = this.A08.A00();
        OTO oto = A002.A01;
        this.A02.A0M(A002.A0G.A00);
        NL0 nl0 = this.A06;
        ImageUrl imageUrl = A002.A00;
        C70754OKa oKa = A002.A0F;
        if (oKa != null) {
            str = oKa.A00;
        } else {
            str = null;
        }
        List list = A002.A0E;
        nl0.A00 = imageUrl;
        nl0.A01 = str;
        List<C70754OKa> list2 = nl0.A05;
        list2.clear();
        if (list != null) {
            list2.addAll(list);
        }
        nl0.A06();
        ImageUrl imageUrl2 = nl0.A00;
        if (!C253833rU.A02(imageUrl2)) {
            nl0.A09(nl0.A02, (Object) null, C70709OHe.A00(imageUrl2));
        }
        String str2 = nl0.A01;
        if (str2 != null) {
            nl0.A09(nl0.A04, str2, new OGX((Integer) null, (Integer) null, (Integer) null, (Integer) null, true));
        }
        for (C70754OKa A003 : list2) {
            nl0.A09(nl0.A03, A003.A00(), new OGX(Integer.valueOf(R.dimen.action_bar_item_spacing_left), (Integer) null, (Integer) null, (Integer) null, true));
        }
        nl0.A07();
        if (oto != null && this.A0G != null) {
            0S7.A00(this);
            0nA.A0X(this.A04, DbV.A05(this).getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height));
            this.A0G.setText(oto.A01.A00);
            C71409Ok8.A01(this.A0G, 44, oto, this);
            this.A0G.setEnabled(true);
            LinearLayout linearLayout = this.A0F;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            this.A04.A02(this.A03, this.A0B, this.A0A, OTO.A00(oto));
        }
    }
}
