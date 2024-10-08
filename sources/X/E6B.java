package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.login.twofac.model.TrustedDevice;
import java.util.ArrayList;

public final class E6B extends AnonymousClass4DH implements C273494mf, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacTrustedDevicesFragment";
    public TrustedDevice A00;
    public ListView A01;
    public C46707Djd A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131975785);
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "trusted_devices";
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

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
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

    public final void onBottomSheetClosed() {
        TrustedDevice trustedDevice = this.A00;
        if (trustedDevice != null) {
            Integer num = trustedDevice.A03;
            if (num == null) {
                num = AnonymousClass05K.A00;
                trustedDevice.A03 = num;
            }
            int intValue = num.intValue();
            if (intValue == 1) {
                C46707Djd djd = this.A02;
                if (djd != null) {
                    djd.A00.remove(trustedDevice);
                    0fE.A00(djd, -5287943);
                    DbZ.A0w(requireContext(), this, 2131975782);
                    C46707Djd djd2 = this.A02;
                    if (djd2 != null) {
                        if (djd2.isEmpty()) {
                            DbT.A1I(this);
                        }
                    }
                }
                0qQ.A0F("trustedDevicesAdapter");
                throw AnonymousClass00P.createAndThrow();
            } else if (intValue == 2) {
                C59689JTv.A07(requireContext(), 2131975781);
            }
            this.A00 = null;
        }
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
        String str;
        int A022 = AnonymousClass0fD.A02(-816358043);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_trusted_devices_fragment, viewGroup, false);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("trusted_devices");
        if (parcelableArrayList == null) {
            parcelableArrayList = AnonymousClass7TE.A1C();
        }
        this.A02 = new C46707Djd(requireContext(), this, parcelableArrayList);
        ListView listView = (ListView) inflate.requireViewById(R.id.trusted_devices_listview);
        this.A01 = listView;
        if (listView == null) {
            str = "trustedDevicesListView";
        } else {
            C46707Djd djd = this.A02;
            if (djd == null) {
                str = "trustedDevicesAdapter";
            } else {
                listView.setAdapter(djd);
                AnonymousClass0fD.A09(-1968233305, A022);
                return inflate;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
