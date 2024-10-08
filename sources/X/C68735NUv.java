package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.NUv  reason: case insensitive filesystem */
public final class C68735NUv extends NJT implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A06;
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeDevicesFragment";
    public C62320sa A00 = new C73908Plj(this, 8);
    public boolean A01;
    public final C319956rV A02;
    public final C319956rV A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C3021461u r1 = (C3021461u) AnonymousClass7TF.A0F(view, R.id.bottom_button);
        C71407Ok6.A02(r1, this, 14);
        NJT.A07(r1, this, 15);
        C319956rV r5 = this.A02;
        AnonymousClass0YZ[] r4 = A06;
        ((RecyclerView) C66940MfZ.A01(r5, this, r4, 0)).setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        Dba.A17((RecyclerView) C66940MfZ.A01(r5, this, r4, 0), this.A04);
        C66940MfZ.A00(r5, this, r4, 0).setOverScrollMode(2);
        NJT.A04(view, this);
        C67753Mu7.A00(this.A05).A0B("OTC_DEVICE_LIST_IMPRESSION");
    }

    static {
        Class<C68735NUv> cls = C68735NUv.class;
        A06 = new AnonymousClass0YZ[]{C66580MXl.A16(cls, "deviceList", "getDeviceList()Landroidx/recyclerview/widget/RecyclerView;"), C66580MXl.A16(cls, "loadingSpinner", "getLoadingSpinner()Landroid/view/View;")};
    }

    public final void afterOnViewCreated() {
        AnonymousClass0eM r4 = this.A05;
        DbZ.A1C(this, new MG9(this, (AnonymousClass4D7) null, 26), ((C67753Mu7) r4.getValue()).A05);
        DbZ.A1C(this, new MGY(this, (AnonymousClass4D7) null, 42), ((C67753Mu7) r4.getValue()).A04);
        ((C67753Mu7) r4.getValue()).A01();
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
        return C2808154f.A05((RecyclerView) C66940MfZ.A01(this.A02, this, A06, 0));
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.NUv, java.lang.Object] */
    public C68735NUv() {
        C73908Plj plj = new C73908Plj(this, 7);
        AnonymousClass0eM A002 = C73908Plj.A00(new C73908Plj(this, 4), 0eO.A02, 5);
        this.A05 = DbS.A0I(new C73908Plj(A002, 6), plj, new C73664Phd(45, A002, (Object) null), DbS.A0z(C67753Mu7.class));
        this.A02 = NJT.A01(this, 2);
        this.A03 = NJT.A01(this, 3);
        this.A04 = AnonymousClass1YB.A00(C73733Piu.A00);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1524423810);
        C68735NUv.super.onCreate(bundle);
        C67753Mu7 mu7 = (C67753Mu7) this.A05.getValue();
        0sn parcelableArrayList = requireArguments().getParcelableArrayList("deviceListKey");
        if (parcelableArrayList == null) {
            parcelableArrayList = 0sn.A00;
        }
        mu7.A02.FIA(parcelableArrayList);
        AnonymousClass0fD.A09(-479596402, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1536039190);
        0qQ.A0B(layoutInflater, 0);
        C68735NUv.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_otc_devices_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1971044974, A022);
        return inflate;
    }
}
