package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.base.BoundedLinearLayout;
import java.util.ArrayList;

public final class R8Y extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ValuePickerFragment";
    public AnonymousClass0wW A00;
    public C13680Tep A01;
    public boolean A02;
    public RecyclerView A03;
    public QEa A04;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "instagram_value_picker";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
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
        return !this.A03.canScrollVertically(-1);
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
        int A022 = AnonymousClass0fD.A02(1797256937);
        R8Y.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0T(this);
        int i = requireArguments.getInt("arg_selected_index");
        ArrayList<String> stringArrayList = requireArguments.getStringArrayList("arg_values");
        boolean[] booleanArray = requireArguments.getBooleanArray("arg_enabled_indices");
        this.A02 = requireArguments.getBoolean("arg_is_modal");
        T8M t8m = new T8M(this, 2);
        stringArrayList.getClass();
        this.A04 = new QEa(t8m, stringArrayList, booleanArray, i);
        AnonymousClass0fD.A09(-770348417, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(913441896);
        BoundedLinearLayout boundedLinearLayout = (BoundedLinearLayout) layoutInflater.inflate(R.layout.layout_value_picker, viewGroup, false);
        int A08 = (int) (((float) 0nA.A08(requireContext())) * 0.4f);
        boundedLinearLayout.setMaxHeight(A08);
        this.A03 = (RecyclerView) boundedLinearLayout.requireViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        this.A03.setLayoutManager(linearLayoutManager);
        this.A03.setAdapter(this.A04);
        linearLayoutManager.A1p(requireArguments().getInt("arg_selected_index"), (A08 / 2) - ((DbV.A05(this).getDimensionPixelSize(R.dimen.account_group_management_row_text_size) + (DbV.A05(this).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material) * 2)) / 2));
        AnonymousClass0fD.A09(-1767358030, A022);
        return boundedLinearLayout;
    }
}
