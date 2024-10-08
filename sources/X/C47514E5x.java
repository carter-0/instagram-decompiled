package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.E5x  reason: case insensitive filesystem */
public final class C47514E5x extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "QuickSnapPreviewAudienceListFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C51765G0h(this, 44));
    public final String A06 = __redex_internal_original_name;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r6 = this.A02;
        ((TextView) this.A01.getValue()).setText(DbY.A0d(DbV.A05(this), DbS.A05(r6.getValue()), R.plurals.quick_snap_preview_audience_count));
        AnonymousClass0eM r3 = this.A03;
        DbY.A16(this, (RecyclerView) r3.getValue());
        AnonymousClass0eM r1 = this.A00;
        ((RecyclerView) r3.getValue()).setAdapter((2Rw) AnonymousClass7TE.A14(r1));
        ((RecyclerView) r3.getValue()).A0S = true;
        AnonymousClass2t9 r5 = (AnonymousClass2t9) AnonymousClass7TE.A14(r1);
        ViewModelListUpdate A0R = DbS.A0R();
        List list = (List) r6.getValue();
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(new FYB(this, DbT.A0k(it)));
        }
        A0R.A01(A0r);
        r5.A05(A0R);
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
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
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
        return !AnonymousClass7TE.A0c(this.A03).canScrollVertically(-1);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C47514E5x() {
        C51832G3q g3q = C51832G3q.A00;
        this.A03 = I7E.A05(this, g3q, R.id.recycler_view);
        this.A01 = I7E.A05(this, g3q, R.id.audience_count);
        this.A02 = AnonymousClass1YB.A00(new C51765G0h(this, 43));
        this.A00 = AnonymousClass1YB.A00(new C51765G0h(this, 42));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(895664156);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_quick_snap_preview_audience_list, false);
        AnonymousClass0fD.A09(802968093, A022);
        return A0D;
    }
}
