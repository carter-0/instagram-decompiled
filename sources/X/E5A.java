package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

public final class E5A extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "ReporterAppealEducationBottomSheetFragment";
    public int A00;
    public View A01;
    public UserSession A02;
    public IgdsBottomButtonLayout A03;
    public C331157Pu A04;
    public E6Y A05;
    public Long A06;
    public String A07;
    public String A08;
    public View A09;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "reporter_appeal_education";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
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

    public final AnonymousClass0wW getSession() {
        return this.A02;
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
        View view = this.A09;
        if (view == null || view.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        this.A03.setTranslationY((float) ((-i) - i2));
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
        int A022 = AnonymousClass0fD.A02(1475214655);
        E5A.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = DbX.A0U(this);
        this.A00 = requireArguments.getInt("ARG_REPORTING_EDUCATION_TIP_NUMBER", 0);
        this.A08 = DbU.A0l(requireArguments, "ARG_REPORTING_EDUCATION_TICKET_ID");
        this.A07 = DbU.A0l(requireArguments, "ARG_REPORTING_EDUCATION_REPORT_TYPE");
        17k.A0E(requireArguments.containsKey("ARG_REPORTING_EDUCATION_REPORTED_CONTENT_ID"));
        this.A06 = Long.valueOf(requireArguments.getLong("ARG_REPORTING_EDUCATION_REPORTED_CONTENT_ID"));
        requireArguments.getString("ARG_REPORTING_EDUCATION_REPORTED_CONTENT_TYPE");
        this.A04.getClass();
        AnonymousClass0fD.A09(-683195493, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-808511112);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.reporting_education_bottom_sheet_fragment);
        AnonymousClass0fD.A09(-1802504051, A022);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        String string;
        int i;
        super.onViewCreated(view, bundle);
        this.A09 = view.requireViewById(R.id.support_detail_reporting_education_scrollview);
        this.A01 = view.requireViewById(R.id.support_detail_reporting_education_body_container);
        this.A03 = DbT.A0c(view, R.id.support_detail_reporting_education_bottom_button);
        ImageView A0F = DbU.A0F(view, R.id.support_detail_reporting_education_icon);
        TextView A0G = DbU.A0G(view, R.id.support_detail_reporting_education_title_row);
        TextView A0G2 = DbU.A0G(view, R.id.support_detail_reporting_education_subtitle_row);
        int i2 = this.A00;
        if (i2 == 0) {
            A0F.setImageDrawable(AnonymousClass2dd.A00(DbV.A05(this), R.drawable.instagram_wellbeing_illustrations_reporting_flow_1));
            DbU.A1G(A0G, this, 2131974781);
            String string2 = getString(2131956462);
            SpannableStringBuilder A0E = DbY.A0E(this, string2, 2131974780);
            AnonymousClass7AV.A05(A0E, new C46678Dj7(0cp.A03("https://help.instagram.com/477434105621119")), string2);
            DbX.A1G(A0G2, A0E);
            igdsBottomButtonLayout = this.A03;
            string = getString(2131956706);
            i = 5;
        } else if (i2 == 1) {
            A0F.setImageDrawable(AnonymousClass2dd.A00(DbV.A05(this), R.drawable.instagram_wellbeing_illustrations_reporting_flow_2));
            DbU.A1G(A0G, this, 2131974785);
            DbU.A1G(A0G2, this, 2131974784);
            this.A03.setPrimaryAction(getString(2131956706), new C50109FOz((Object) this, 5));
            0nA.A0T(this.A01, DbV.A05(this).getDimensionPixelSize(R.dimen.bottom_button_layout_height_with_secondary));
            ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
            layoutParams.height = Dbb.A07(this, R.dimen.bottom_button_layout_height_with_secondary);
            this.A03.setLayoutParams(layoutParams);
            this.A03.setSecondaryAction(getString(2131974798), new C50109FOz((Object) this, 6));
            return;
        } else if (i2 == 2) {
            A0F.setImageDrawable(AnonymousClass2dd.A00(DbV.A05(this), R.drawable.instagram_wellbeing_illustrations_reporting_flow_3));
            DbU.A1G(A0G, this, 2131974783);
            DbU.A1G(A0G2, this, 2131974782);
            igdsBottomButtonLayout = this.A03;
            string = getString(2131974779);
            i = 4;
        } else {
            return;
        }
        igdsBottomButtonLayout.setPrimaryAction(string, new C50109FOz((Object) this, i));
    }
}
