package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E5u  reason: case insensitive filesystem */
public final class C47511E5u extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "DirectThreadExternalLinkBottomsheet";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final String A01 = "direct_thread_external_link_bottomsheet";
    public final boolean A02 = true;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(requireContext());
        View findViewById = view.findViewById(R.id.cross_bar_icon);
        if (findViewById != null) {
            FP8.A01(findViewById, 22, A022);
        }
        String A16 = AnonymousClass7TE.A16(requireContext(), 2131960527);
        String A0c = DbY.A0c(requireContext(), A16, 2131960529);
        ESx eSx = new ESx(this, Dbb.A04(this));
        SpannableStringBuilder A0C = DbS.A0C(A0c);
        AnonymousClass7AV.A03(A0C, eSx, A16);
        String A162 = AnonymousClass7TE.A16(requireContext(), 2131960528);
        String A0c2 = DbY.A0c(requireContext(), A162, 2131960530);
        C48053ESw eSw = new C48053ESw(this, A022, Dbb.A04(this));
        SpannableStringBuilder A0C2 = DbS.A0C(A0c2);
        AnonymousClass7AV.A03(A0C2, eSw, A162);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.external_link_title);
        if (A0d != null) {
            DbT.A18(requireContext(), A0d, 2131960531);
        }
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.external_link_subtitle_1);
        if (A0d2 != null) {
            DbT.A1H(A0d2);
            A0d2.setText(A0C);
        }
        TextView A0d3 = AnonymousClass7TE.A0d(view, R.id.external_link_subtitle_2);
        if (A0d3 != null) {
            DbT.A1H(A0d3);
            A0d3.setText(A0C2);
        }
        1Av A0h = DbX.A0h(this.A00);
        String A002 = AnonymousClass000.A00(1330);
        A0h.A0z(A002, A0h.A01.getInt(A002, 0) + 1);
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
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
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
        return this.A02;
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1791490576);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_thread_external_link, false);
        AnonymousClass0fD.A09(1458439337, A022);
        return A0D;
    }
}
