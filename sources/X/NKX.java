package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import com.instagram.user.model.User;
import java.util.List;

public final class NKX extends AnonymousClass32G implements C273494mf, G7N, G82, G6X {
    public static final String __redex_internal_original_name = "SelectVictimBottomSheetFragment";
    public float A00;
    public UserSession A01;
    public C331157Pu A02;
    public IgdsButton A03;
    public User A04;
    public ONV A05;
    public C71038Oa2 A06;
    public NL3 A07;
    public C74488Pvi A08;
    public NHU A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public LinearLayout A0E;
    public TypeaheadHeader A0F;
    public String A0G = "";
    public final List A0H = AnonymousClass7TE.A1C();
    public final 1P0 A0I = new NMI((Object) this, 32);

    public final boolean CZf(User user) {
        return false;
    }

    public final boolean CbR(User user) {
        return true;
    }

    public final void CtI(User user) {
    }

    public final boolean Dw3(User user, boolean z) {
        if (z) {
            List list = this.A0H;
            if (!list.isEmpty()) {
                list.clear();
                list.add(user);
                NL3 nl3 = this.A07;
                List list2 = nl3.A02;
                list2.clear();
                list2.addAll(list);
                NL3.A00(nl3);
            } else {
                list.add(user);
                IgdsButton igdsButton = this.A03;
                if (igdsButton != null) {
                    igdsButton.setEnabled(true);
                    return true;
                }
            }
        } else {
            this.A0H.remove(user);
            IgdsButton igdsButton2 = this.A03;
            if (igdsButton2 != null) {
                igdsButton2.setEnabled(false);
                return true;
            }
        }
        return true;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "select_victim_bottom_sheet_fragment";
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

    public final View getRowView() {
        TypeaheadHeader typeaheadHeader = this.A0F;
        if (typeaheadHeader != null || AnonymousClass2Rc.A00) {
            return typeaheadHeader;
        }
        throw AnonymousClass7TE.A0z("Should only be called between onCreateView and onDestroyView");
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
        LinearLayout linearLayout = this.A0E;
        if (linearLayout != null) {
            linearLayout.setTranslationY((float) (-i));
        }
    }

    public final void registerTextViewLogging(TextView textView) {
        textView.addTextChangedListener(AnonymousClass4v0.A00(this.A01));
    }

    public final void searchTextChanged(String str) {
        String str2 = str;
        if (!this.A0G.equals(str)) {
            this.A0G = str;
            1OC A022 = FFZ.A02(this.A01, new C47165Drg(str2, "wellbeing_page", (String) null, (String) null, (String) null, (String) null, 50, false, false, false));
            A022.A00 = this.A0I;
            schedule(A022);
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public NKX(C331157Pu r3, User user, C71038Oa2 oa2, C74488Pvi pvi, NHU nhu) {
        this.A09 = nhu;
        this.A0B = nhu.A00().A0H;
        this.A02 = r3;
        this.A08 = pvi;
        this.A04 = user;
        this.A06 = oa2;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(154533133);
        NKX.super.onCreate(bundle);
        if (bundle != null) {
            C66580MXl.A1G(this);
            i = -2071510224;
        } else {
            Bundle requireArguments = requireArguments();
            this.A01 = DbX.A0U(this);
            this.A0A = DbU.A0l(requireArguments, "ReportingConstants.ARG_CONTENT_ID");
            this.A0D = requireArguments.getBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED");
            this.A00 = requireArguments.getFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO");
            this.A0C = requireArguments.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD");
            NL3 nl3 = new NL3(requireContext(), this, this, this);
            this.A07 = nl3;
            A0V(nl3);
            ONV A002 = C49238Erh.A00(this.A01, this.A0C);
            this.A05 = A002;
            A002.A00(this, this.A04, this.A0B, this.A0A);
            i = -2123580158;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-761843468);
        this.A0F = new TypeaheadHeader(layoutInflater.getContext());
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.frx_report_fragment);
        AnonymousClass0fD.A09(-484421240, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-819040459);
        super.onDestroyView();
        this.A0E = null;
        this.A03 = null;
        this.A0F.A01();
        this.A0F = null;
        C71038Oa2 oa2 = this.A06;
        if (oa2 != null) {
            oa2.A01();
        }
        AnonymousClass0fD.A09(-706540827, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        super.onViewCreated(view, bundle);
        this.A0E = (LinearLayout) view.findViewById(R.id.frx_report_action_button_wrapper);
        this.A03 = (IgdsButton) view.findViewById(R.id.frx_report_action_button);
        NL3 nl3 = this.A07;
        NHU nhu = this.A09;
        C70754OKa oKa = nhu.A00().A0F;
        if (oKa != null) {
            str = oKa.A00;
        } else {
            str = null;
        }
        if (nhu.A00().A07 != null) {
            str2 = nhu.A00().A07.A00.A00;
        } else {
            str2 = null;
        }
        nl3.A01 = str;
        nl3.A00 = str2;
        NL3.A00(nl3);
        OTO oto = nhu.A00().A01;
        if (!(oto == null || this.A03 == null)) {
            0S7.A00(this);
            0nA.A0X(this.A04, DbV.A05(this).getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height));
            this.A03.setText(oto.A01.A00);
            C71409Ok8.A01(this.A03, 47, oto, this);
            this.A03.setEnabled(false);
            LinearLayout linearLayout = this.A0E;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            this.A05.A02(this.A04, this.A0B, this.A0A, OTO.A00(oto));
            C71038Oa2 oa2 = this.A06;
            if (oa2 != null) {
                oa2.A05(2);
            }
        }
        String str3 = this.A0G;
        if (!str3.isEmpty()) {
            this.A0F.A04(str3);
            this.A0F.A02();
        }
        TypeaheadHeader typeaheadHeader = this.A0F;
        typeaheadHeader.A01 = this;
        typeaheadHeader.A03(getString(2131972797));
        0S7.A00(this);
        this.A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        C71038Oa2 oa22 = this.A06;
        if (oa22 != null) {
            oa22.A05(2);
        }
    }
}
