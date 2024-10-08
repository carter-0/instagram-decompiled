package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.NUw  reason: case insensitive filesystem */
public final class C68736NUw extends NJT implements C273494mf {
    public static final /* synthetic */ AnonymousClass0YZ[] A07;
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeDevicesV2Fragment";
    public boolean A00;
    public final C319956rV A01;
    public final C319956rV A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final C62320sa A06 = new C73908Plj(this, 16);

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
        IgdsHeadline A0O = C66584MXp.A0O(view);
        A0O.setImageResource(R.drawable.ig_illustrations_illo_one_time_code2_refresh);
        A0O.setHeadline(2131961652);
        A0O.setBody(2131961646);
        C3021461u r1 = (C3021461u) AnonymousClass7TF.A0F(view, R.id.bottom_button);
        C71407Ok6.A02(r1, this, 16);
        NJT.A07(r1, this, 17);
        C319956rV r5 = this.A01;
        AnonymousClass0YZ[] r4 = A07;
        ((RecyclerView) C66940MfZ.A01(r5, this, r4, 0)).setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        Dba.A17((RecyclerView) C66940MfZ.A01(r5, this, r4, 0), this.A03);
        C66940MfZ.A00(r5, this, r4, 0).setOverScrollMode(2);
        C71145Oe2.A05(DbX.A0I(view, R.id.container), this, NJT.A00(C66581MXm.A0S(this.A04)));
        C67753Mu7.A00(this.A05).A0B("OTC_DEVICE_LIST_IMPRESSION");
    }

    static {
        Class<C68736NUw> cls = C68736NUw.class;
        A07 = new AnonymousClass0YZ[]{C66580MXl.A16(cls, "deviceList", "getDeviceList()Landroidx/recyclerview/widget/RecyclerView;"), C66580MXl.A16(cls, "loadingSpinner", "getLoadingSpinner()Landroid/view/View;")};
    }

    public final void afterOnViewCreated() {
        AnonymousClass0eM r4 = this.A05;
        DbZ.A1C(this, new MG9(this, (AnonymousClass4D7) null, 27), ((C67753Mu7) r4.getValue()).A05);
        DbZ.A1C(this, new MGY(this, (AnonymousClass4D7) null, 43), ((C67753Mu7) r4.getValue()).A04);
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
        return C2808154f.A05((RecyclerView) C66940MfZ.A01(this.A01, this, A07, 0));
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.NUw, java.lang.Object] */
    public C68736NUw() {
        0eO r2 = 0eO.A02;
        this.A04 = C73908Plj.A00(this, r2, 10);
        C73908Plj plj = new C73908Plj(this, 15);
        AnonymousClass0eM A002 = C73908Plj.A00(new C73908Plj(this, 12), r2, 13);
        this.A05 = DbS.A0I(new C73908Plj(A002, 14), plj, new C73664Phd(46, A002, (Object) null), DbS.A0z(C67753Mu7.class));
        this.A01 = NJT.A01(this, 9);
        this.A02 = NJT.A01(this, 11);
        this.A03 = AnonymousClass1YB.A00(C73734Piv.A00);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1526809471);
        C68736NUw.super.onCreate(bundle);
        C67753Mu7 mu7 = (C67753Mu7) this.A05.getValue();
        0sn parcelableArrayList = requireArguments().getParcelableArrayList("deviceListKey");
        if (parcelableArrayList == null) {
            parcelableArrayList = 0sn.A00;
        }
        mu7.A02.FIA(parcelableArrayList);
        AnonymousClass0fD.A09(-1326228256, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1549737743);
        0qQ.A0B(layoutInflater, 0);
        C68736NUw.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_otc_devices_v2_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1943231210, A022);
        return inflate;
    }
}
