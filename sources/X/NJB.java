package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.user.model.User;
import java.util.List;

public final class NJB extends AnonymousClass4DH implements AnonymousClass0iw, C273494mf {
    public static final String __redex_internal_original_name = "SelectEvidenceBottomSheetFragment";
    public float A00;
    public Context A01;
    public View A02;
    public LinearLayout A03;
    public UserSession A04;
    public IgTextView A05;
    public IgTextView A06;
    public C331157Pu A07;
    public IgdsButton A08;
    public DirectShareTarget A09;
    public SearchEditText A0A;
    public User A0B;
    public ONV A0C;
    public C70802OLx A0D;
    public C74488Pvi A0E;
    public NHU A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "SELECT_EVIDENCE_BOTTOM_SHEET_FRAGMENT";
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
        return this.A04;
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
        C66582MXn.A15(this.A03, i, i2);
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
        int A022 = AnonymousClass0fD.A02(2062011247);
        NJB.super.onCreate(bundle);
        if (bundle != null) {
            C66580MXl.A1G(this);
            i = 2113891199;
        } else if (this.A07 == null || this.A0E == null) {
            i = -1501936930;
        } else {
            this.A01 = requireContext();
            Bundle bundle2 = this.mArguments;
            bundle2.getClass();
            this.A0F.getClass();
            UserSession A0U = DbX.A0U(this);
            this.A04 = A0U;
            A0U.getClass();
            this.A0G = DbU.A0l(bundle2, "ReportingConstants.ARG_CONTENT_ID");
            this.A0K = bundle2.getBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED");
            this.A0J = bundle2.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD");
            this.A0L = bundle2.getBoolean("ReportingConstants.ARG_IS_PRIVATE_IMPERSONATION");
            this.A0I = bundle2.getBoolean("ReportingConstants.ARG_IS_CONSOLIDATED_IMPERSONATION_REPORTING");
            this.A0H = bundle2.getString("ReportingConstants.ARG_EVIDENCE_PAGE_TYPE");
            this.A00 = bundle2.getFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO");
            this.A0M = bundle2.getBoolean("ReportingConstants.ARG_IS_SELF_VICTIM");
            this.A0C = C49238Erh.A00(this.A04, this.A0J);
            this.A0E.getClass();
            Context context = this.A01;
            User user = this.A0B;
            NHU nhu = this.A0F;
            nhu.getClass();
            DirectShareTarget directShareTarget = this.A09;
            UserSession userSession = this.A04;
            C74488Pvi pvi = this.A0E;
            String str = this.A0G;
            this.A0D = new C70802OLx(context, userSession, directShareTarget, user, this.A0C, this, pvi, nhu, str, this.A00, this.A0K, this.A0L, this.A0J, this.A0M);
            i = 943190408;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1588943962);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.frx_evidence_fragment);
        AnonymousClass0fD.A09(-598995752, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1751277471);
        super.onDestroyView();
        this.A03 = null;
        this.A08 = null;
        this.A06 = null;
        this.A05 = null;
        this.A0A = null;
        this.A02 = null;
        AnonymousClass0fD.A09(757207507, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        IgdsButton igdsButton;
        Context context;
        int i;
        String str2;
        super.onViewCreated(view, bundle);
        this.A06 = DbT.A0a(view, R.id.bottom_sheet_title);
        this.A05 = DbT.A0a(view, R.id.bottom_sheet_subtitle);
        this.A0A = (SearchEditText) view.requireViewById(R.id.search_edit_text);
        this.A02 = view.requireViewById(R.id.evidence_container);
        this.A03 = (LinearLayout) view.requireViewById(R.id.frx_report_action_button_wrapper);
        this.A08 = DbU.A0b(view, R.id.frx_report_action_button);
        this.A0H.getClass();
        IgTextView igTextView = this.A05;
        C70802OLx oLx = this.A0D;
        if ("evidence_confirmation".equals(this.A0H)) {
            if (!oLx.A0E) {
                boolean A082 = C49960FGs.A08(oLx.A02, oLx.A03, oLx.A04, oLx.A0D);
                Context context2 = oLx.A01;
                int i2 = 2131962797;
                if (A082) {
                    i2 = 2131962793;
                }
                str = context2.getString(i2);
            }
            str = "";
        } else {
            C70662OFj oFj = oLx.A08.A00().A07;
            if (oFj != null) {
                str = oFj.A00.A00;
            }
            str = "";
        }
        igTextView.setText(str);
        if (this.A0D.A00(this.A0H) != null) {
            this.A06.setText(this.A0D.A00(this.A0H));
        }
        String str3 = this.A0H;
        if (str3.equals("evidence_search")) {
            SearchEditText searchEditText = this.A0A;
            RectF rectF = 0nA.A01;
            if (searchEditText != null) {
                searchEditText.setVisibility(0);
            }
            SearchEditText searchEditText2 = this.A0A;
            searchEditText2.A0J = false;
            searchEditText2.setFocusable(false);
            C66997MgV.A00(this.A0A);
            AnonymousClass0fU.A00(new FP4(this, 66), this.A0A);
            C331157Pu r1 = this.A07;
            r1.getClass();
            NHU nhu = this.A0F;
            nhu.getClass();
            r1.A0M(nhu.A00().A0G.A00);
            this.A07.A0O(true);
        } else if (str3.equals("evidence_confirmation")) {
            LinearLayout linearLayout = this.A03;
            RectF rectF2 = 0nA.A01;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            View view2 = this.A02;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            if (this.A09 != null) {
                TextView A0G2 = DbU.A0G(this.A02, R.id.row_inbox_username);
                DirectShareTarget directShareTarget = this.A09;
                String str4 = directShareTarget.A0J;
                if (str4 == null) {
                    str4 = "";
                }
                if (directShareTarget.A0V()) {
                    SpannableStringBuilder A0C2 = DbS.A0C(str4);
                    C244273av.A08(A0G2.getContext(), A0C2, true);
                    A0G2.setText(A0C2);
                } else {
                    A0G2.setText(str4);
                }
                List A14 = DbT.A14(this.A09);
                if (A14.size() == 1) {
                    DbU.A0G(this.A02, R.id.row_inbox_digest).setText(AnonymousClass50n.A01(requireContext(), (AnonymousClass170) A14.get(0)));
                    GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) this.A02.requireViewById(R.id.avatar_container);
                    gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, this, ((PendingRecipient) A14.get(0)).A03);
                    gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                }
            }
            NHU nhu2 = this.A0F;
            nhu2.getClass();
            OTO oto = nhu2.A00().A01;
            if (oto != null && (igdsButton = this.A08) != null) {
                C70802OLx oLx2 = this.A0D;
                if (C49960FGs.A08(oLx2.A02, oLx2.A03, oLx2.A04, oLx2.A0D)) {
                    context = oLx2.A01;
                    i = 2131974591;
                } else {
                    OTO oto2 = oLx2.A08.A00().A01;
                    if (oto2 != null) {
                        str2 = oto2.A01.A00;
                        igdsButton.setText(str2);
                        C71409Ok8.A01(this.A08, 46, oto, this);
                        C70802OLx oLx3 = this.A0D;
                        oLx3.A05.A02(oLx3.A04, oLx3.A0A, oLx3.A09, OTO.A00(oto));
                    }
                    context = oLx2.A01;
                    i = 2131974592;
                }
                str2 = context.getString(i);
                igdsButton.setText(str2);
                C71409Ok8.A01(this.A08, 46, oto, this);
                C70802OLx oLx32 = this.A0D;
                oLx32.A05.A02(oLx32.A04, oLx32.A0A, oLx32.A09, OTO.A00(oto));
            }
        }
    }
}
