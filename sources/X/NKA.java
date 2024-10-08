package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import java.util.Set;

public final class NKA extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "PendingThreadsSortAndFilterCustomizationFragment";
    public IgdsListCell A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public IgdsListCell A03;
    public IgdsListCell A04;
    public IgdsListCell A05;
    public IgdsListCell A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08 = DbS.A0I(new C73914Plp(this, 29), new C73914Plp(this, 30), new C73667Phg(45, (Object) null, this), DbS.A0z(C68497NKq.class));

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.NKA, X.07Z, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (IgdsListCell) view.requireViewById(R.id.pending_threads_recent_sort_option);
        this.A05 = (IgdsListCell) view.requireViewById(R.id.pending_threads_top_sort_option);
        IgdsListCell igdsListCell = this.A03;
        if (igdsListCell != null) {
            igdsListCell.setTextCellType(C69349Njo.TYPE_RADIO);
        }
        IgdsListCell igdsListCell2 = this.A03;
        if (igdsListCell2 != null) {
            igdsListCell2.A06(2131959952);
        }
        IgdsListCell igdsListCell3 = this.A05;
        if (igdsListCell3 != null) {
            igdsListCell3.setTextCellType(C69349Njo.TYPE_RADIO);
        }
        IgdsListCell igdsListCell4 = this.A05;
        if (igdsListCell4 != null) {
            igdsListCell4.A06(2131959953);
        }
        this.A06 = (IgdsListCell) view.requireViewById(R.id.pending_threads_verified_filter);
        this.A00 = (IgdsListCell) view.requireViewById(R.id.pending_threads_business_filter);
        this.A02 = (IgdsListCell) view.requireViewById(R.id.pending_threads_creator_filter);
        this.A04 = (IgdsListCell) view.requireViewById(R.id.pending_threads_subscriber_filter);
        this.A01 = (IgdsListCell) view.requireViewById(R.id.pending_threads_creator_ai_filter);
        IgdsListCell igdsListCell5 = this.A06;
        if (igdsListCell5 != null) {
            A00(C69415Nkv.VERIFIED, igdsListCell5, C74101Pp4.A00);
        }
        IgdsListCell igdsListCell6 = this.A00;
        if (igdsListCell6 != null) {
            A00(C69415Nkv.BUSINESS, igdsListCell6, C74101Pp4.A00);
        }
        IgdsListCell igdsListCell7 = this.A02;
        if (igdsListCell7 != null) {
            A00(C69415Nkv.CREATOR, igdsListCell7, C74101Pp4.A00);
        }
        IgdsListCell igdsListCell8 = this.A04;
        if (igdsListCell8 != null) {
            A00(C69415Nkv.SUBSCRIBER, igdsListCell8, C74101Pp4.A00);
        }
        AnonymousClass0eM r2 = this.A07;
        User A022 = JTR.A0u(r2).A02(DbU.A0u(r2));
        if (A022 == null) {
            A022 = DbX.A0l(AnonymousClass0t1.A01, r2);
        }
        boolean A2O = A022.A2O();
        IgdsListCell igdsListCell9 = this.A01;
        if (!A2O) {
            AnonymousClass7TH.A0R(igdsListCell9);
        } else if (igdsListCell9 != null) {
            igdsListCell9.setVisibility(0);
            C52369GPq.A01(C54688HOt.A0O, new C52369GPq(AnonymousClass7TE.A0l(r2), (String) null));
            A00(C69415Nkv.CREATOR_AI, igdsListCell9, new C73933PmD(this, 36));
        }
        JTS.A10(this, new C73566Pfn(this, (AnonymousClass4D7) null, 43), ((C68497NKq) this.A08.getValue()).A06);
        IgdsListCell igdsListCell10 = this.A03;
        if (igdsListCell10 != null) {
            C71469OlD.A01(igdsListCell10, this, 27);
        }
        IgdsListCell igdsListCell11 = this.A05;
        if (igdsListCell11 != null) {
            C71469OlD.A01(igdsListCell11, this, 28);
        }
    }

    private final void A00(C69415Nkv nkv, IgdsListCell igdsListCell, 0sP r5) {
        igdsListCell.setTextCellType(C69349Njo.TYPE_CHECKBOX);
        igdsListCell.setChecked(((Set) ((C68497NKq) this.A08.getValue()).A04.getValue()).contains(nkv));
        igdsListCell.A0D(new IEA(2, nkv, r5, this));
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
        return DbS.A0T(this.A07);
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
        int A022 = AnonymousClass0fD.A02(-1017791066);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.pending_threads_sort_and_filter_bottom_sheet, false);
        AnonymousClass0fD.A09(-1059440894, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1619116886);
        super.onDestroyView();
        this.A03 = null;
        this.A05 = null;
        this.A06 = null;
        this.A00 = null;
        this.A02 = null;
        this.A04 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-1873949623, A022);
    }
}
