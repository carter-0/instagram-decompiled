package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.Ub6  reason: case insensitive filesystem */
public final class C15355Ub6 extends AnonymousClass4DH implements AnonymousClass4DU, C273494mf, C273414mX {
    public static final String __redex_internal_original_name = "DiscountsFragment";
    public C331157Pu A00;
    public String A01;
    public boolean A02;
    public FragmentActivity A03;
    public final VP7 A04 = new VP7(this);
    public final AnonymousClass0eM A05 = C20692WxO.A00(this, 44);
    public final AnonymousClass0eM A06 = C20692WxO.A00(this, 45);
    public final AnonymousClass0eM A07 = C20692WxO.A00(this, 46);
    public final AnonymousClass0eM A08 = C20692WxO.A00(this, 47);
    public final AnonymousClass0eM A09 = C20692WxO.A00(this, 48);
    public final AnonymousClass0eM A0A = C20692WxO.A00(this, 49);
    public final AnonymousClass0eM A0B = C227642jf.A02(this);
    public final AnonymousClass0eM A0C = C20701WxY.A01(this, 0);

    public final void Cyf() {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "instagram_shopping_discounts_bottom_sheet";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        C15355Ub6.super.onAttach(context);
        this.A03 = requireActivity();
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.recycler_view);
        DbU.A15(requireContext(), recyclerView, 1, false);
        AnonymousClass0eM r0 = this.A05;
        Dba.A17(recyclerView, r0);
        C15470UdL udL = (C15470UdL) r0.getValue();
        udL.clear();
        for (Object addModel : udL.A01) {
            udL.addModel(addModel, udL.A00);
        }
        udL.notifyDataSetChanged();
    }

    public final void Cyc() {
        if (this.A02) {
            this.A02 = false;
            C249713kF r4 = C249713kF.A00;
            FragmentActivity fragmentActivity = this.A03;
            String str = null;
            if (fragmentActivity == null) {
                0qQ.A0F("fragmentActivity");
                throw AnonymousClass00P.createAndThrow();
            }
            C18025Vk1 A0J = r4.A0J(fragmentActivity, AnonymousClass7TE.A0l(this.A0B), C16675UzB.DISCOUNTS, DbS.A0t(this.A0C), "instagram_shopping_discounts_bottom_sheet");
            AnonymousClass0eM r1 = this.A09;
            A0J.A0D = C13988Tno.A0b((User) r1.getValue());
            A0J.A03 = (User) r1.getValue();
            User user = (User) r1.getValue();
            if (user != null) {
                str = AnonymousClass3ZA.A00(user);
            }
            A0J.A08 = str;
            A0J.A04 = this.A01;
            A0J.A0A = DbS.A0t(this.A0A);
            A0J.A00();
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
        return DbS.A0T(this.A0B);
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

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1465230012);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        AnonymousClass0fD.A09(1232440559, A022);
        return inflate;
    }
}
