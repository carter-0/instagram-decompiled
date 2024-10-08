package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.wellbeing.supportinbox.model.SupportInboxDetailBottomSheetModel;

public final class E63 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "SupportInboxObBottomSheetFragment";
    public UserSession A00;
    public IgdsBottomButtonLayout A01;
    public SupportInboxDetailBottomSheetModel A02;
    public String A03;
    public String A04;
    public boolean A05;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.oversight_board_bottom_sheet_title);
        0qQ.A0C(requireViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.oversight_board_bottom_sheet_body);
        0qQ.A0C(requireViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.oversight_board_bottom_sheet_link);
        0qQ.A0C(requireViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) requireViewById3;
        this.A01 = DbT.A0c(view, R.id.ob_reference_id_button);
        SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel = this.A02;
        0qQ.A0A(supportInboxDetailBottomSheetModel);
        if (supportInboxDetailBottomSheetModel.A03 != null) {
            SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel2 = this.A02;
            0qQ.A0A(supportInboxDetailBottomSheetModel2);
            textView.setText(supportInboxDetailBottomSheetModel2.A03);
        }
        SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel3 = this.A02;
        0qQ.A0A(supportInboxDetailBottomSheetModel3);
        if (supportInboxDetailBottomSheetModel3.A00 != null) {
            SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel4 = this.A02;
            0qQ.A0A(supportInboxDetailBottomSheetModel4);
            textView2.setText(supportInboxDetailBottomSheetModel4.A00);
        }
        SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel5 = this.A02;
        0qQ.A0A(supportInboxDetailBottomSheetModel5);
        if (supportInboxDetailBottomSheetModel5.A01 != null) {
            SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel6 = this.A02;
            0qQ.A0A(supportInboxDetailBottomSheetModel6);
            if (supportInboxDetailBottomSheetModel6.A02 != null) {
                SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel7 = this.A02;
                0qQ.A0A(supportInboxDetailBottomSheetModel7);
                String str = supportInboxDetailBottomSheetModel7.A01;
                0qQ.A0A(str);
                SupportInboxDetailBottomSheetModel supportInboxDetailBottomSheetModel8 = this.A02;
                0qQ.A0A(supportInboxDetailBottomSheetModel8);
                String str2 = supportInboxDetailBottomSheetModel8.A01;
                0qQ.A0A(str2);
                AnonymousClass7AV.A07(new ESx(this, requireActivity().getColor(2Yu.A06(getContext()))), textView3, str, str2);
            }
        }
        if (!this.A05) {
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A01;
            0qQ.A0A(igdsBottomButtonLayout);
            igdsBottomButtonLayout.setFooterText(DbW.A0h(requireContext(), this.A03, 2131974775));
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A01;
            0qQ.A0A(igdsBottomButtonLayout2);
            igdsBottomButtonLayout2.setPrimaryAction(this.A04, new C50109FOz((Object) this, 12));
            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A01;
            0qQ.A0A(igdsBottomButtonLayout3);
            igdsBottomButtonLayout3.setVisibility(0);
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
        if (this.A05) {
            return "ob_expired";
        }
        return "ob_appeal";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
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
        return false;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A01;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setTranslationY((float) ((-i) - i2));
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

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-952228348);
        E63.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = (SupportInboxDetailBottomSheetModel) C320236s2.A00(requireArguments, SupportInboxDetailBottomSheetModel.class, "ARG_BOTTOM_SHEET_INFO");
        this.A04 = C320236s2.A01(requireArguments, "ARG_REFERENCE_ID");
        this.A05 = requireArguments.getBoolean("ARG_IS_EXPIRED");
        this.A03 = 1G0.A01((double) requireArguments.getLong("ARG_EXPIRATION_TIME"));
        this.A00 = DbS.A0U(requireArguments);
        requireArguments.getString("ARG_CTRL_TYPE");
        requireArguments.getString("ARG_TICKET_TYPE");
        requireArguments.getString("ARG_REPORTED_CONTENT_ID");
        requireArguments.getString("ARG_CONTENT_TYPE");
        AnonymousClass0fD.A09(-1927261072, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1412617434);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.support_inbox_ob_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1087362531, A022);
        return inflate;
    }
}
