package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class NKC extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "HideCommentNUXBottomSheetFragment";
    public ODM A00;
    public C247733gp A01;
    public String A02;
    public boolean A03;
    public View A04;
    public boolean A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final String A07 = "hide_comment_nux_bottom_sheet";

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AAQ.A01(AnonymousClass7TE.A0l(this.A06), this.A01, "show_bottomsheet_nux");
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.hide_comment_nux_headline_component);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_hide_comments_refresh);
        igdsHeadline.setHeadline((CharSequence) DbV.A05(this).getString(2131963325));
        FGX A022 = FGX.A02(requireContext(), true);
        A022.A05((CharSequence) null, DbV.A05(this).getString(2131963322), R.drawable.instagram_eye_off_pano_outline_24);
        Resources A052 = DbV.A05(this);
        String str = this.A02;
        if (str == null) {
            0qQ.A0F("targetUsername");
            throw AnonymousClass00P.createAndThrow();
        }
        A022.A05((CharSequence) null, 0bC.A01(A052, new String[]{str}, 2131963324), R.drawable.instagram_alert_off_pano_outline_24);
        FGX.A03(A022, igdsHeadline, (CharSequence) null, 0bC.A01(DbV.A05(this), new String[0], 2131963323), R.drawable.instagram_limited_interactions_pano_outline_24);
        C3021461u r2 = (C3021461u) view.findViewById(R.id.hide_comment_nux_bottom_button_layout);
        r2.setPrimaryActionOnClickListener(new C71403Ok2(this, 22));
        r2.setSecondaryActionOnClickListener(new C71403Ok2(this, 23));
        AnonymousClass37D A023 = AnonymousClass37D.A00.A02(requireContext());
        if (A023 != null) {
            C72964PQw.A00(this, 0, A023);
        }
        View findViewById = view.findViewById(R.id.hide_comment_nux_bottom_sheet_scrollview);
        this.A04 = findViewById;
        r2.addOnLayoutChangeListener(new C71414OkD(0, findViewById, r2));
    }

    public static final void A00(NKC nkc) {
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(nkc.requireContext());
        if (nkc.A05) {
            C331157Pu A002 = C48943Emh.A00(A022);
            if (!nkc.A03) {
                AAQ.A00(AnonymousClass7TE.A0l(nkc.A06), nkc.A01, "comment_hidden_nux_dismiss");
                ODM odm = nkc.A00;
                if (odm != null) {
                    C52971GgO ggO = odm.A00;
                    ggO.A0A.A0L(odm.A01, odm.A02);
                }
            }
            if (A002 != null) {
                A002.A0T();
            }
        } else if (A022 != null) {
            A022.A0B();
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
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
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
        View view = this.A04;
        if (view == null || JTP.A1Y(view)) {
            return false;
        }
        return true;
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
        int A022 = AnonymousClass0fD.A02(-2010256882);
        NKC.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = C320236s2.A01(requireArguments, "arg_target_username");
        this.A05 = requireArguments.getBoolean("arg_is_launched_from_bottomsheet");
        AnonymousClass0fD.A09(-327681606, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1967315858);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.hide_comment_nux_bottom_sheet_fragment, false);
        AnonymousClass0fD.A09(894089054, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1251460041);
        super.onDestroyView();
        this.A04 = null;
        AnonymousClass0fD.A09(1203017739, A022);
    }
}
