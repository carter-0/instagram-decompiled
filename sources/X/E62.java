package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.model.business.ProfileAddressData;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class E62 extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "ProfileMultipleAddressesBottomsheetFragment";
    public Ey4 A00;
    public RecyclerView A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;
    public final C50312FXr A04 = new C50312FXr(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "profile_multiple_addresses_bottomsheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0sn A1C;
        ArrayList arrayList;
        05G r0;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Context requireContext = requireContext();
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(requireContext);
        A002.A01(new C47786EGx(this));
        A002.A03 = this.A04;
        AnonymousClass2t9 A003 = A002.A00();
        RecyclerView A0I = DbT.A0I(view2, R.id.multiple_addresses_bottomsheet_recycler_view);
        this.A01 = A0I;
        if (A0I != null) {
            A0I.setAdapter(A003);
            DbV.A1B(requireContext, A0I);
            A0I.A11(new C46856DmY(this, 1));
        }
        AnonymousClass0eM r7 = this.A03;
        05G r02 = ((C46753Dkg) r7.getValue()).A02;
        19B r5 = 19B.A00;
        DbV.A1F(getViewLifecycleOwner(), C226292g8.A00(r5, r02), new G4S(A003, 22), 35);
        C46753Dkg dkg = (C46753Dkg) r7.getValue();
        User A022 = dkg.A00.A02(dkg.A01);
        if (A022 == null) {
            r0 = dkg.A02;
            A1C = 0sn.A00;
        } else {
            A1C = AnonymousClass7TE.A1C();
            String AnQ = A022.A03.AnQ();
            if (!(AnQ == null || AnQ.length() == 0)) {
                A1C.add(new ProfileAddressData(A022.A03.BLe(), A022.A03.BOb(), "primary", A022.A03.AZg(), A022.A03.AnP(), A022.A03.AnQ(), A022.A03.CHc(), A022.A03.BHm()));
            }
            List<C46311DUo> AZa = A022.A03.AZa();
            if (AZa != null) {
                arrayList = AnonymousClass7TG.A0r(AZa);
                for (C46311DUo dUo : AZa) {
                    arrayList.add(new ProfileAddressData(dUo.BLe(), dUo.BOb(), dUo.AZZ(), dUo.AZg(), dUo.AnP(), dUo.AnQ(), dUo.CHd(), dUo.BHm()));
                }
            } else {
                arrayList = 0sn.A00;
            }
            A1C.addAll(arrayList);
            r0 = dkg.A02;
        }
        r0.Epw(A1C);
        0lg A0L = AnonymousClass7TF.A0L(this.A02, 0);
        if (AnonymousClass35I.A00(A0L).booleanValue() && 182.A06(0Tu.A05, A0L, 2342172144706207563L)) {
            C46753Dkg dkg2 = (C46753Dkg) r7.getValue();
            String A0r = DbX.A0r(dkg2.A00.A02(dkg2.A01));
            View A0G = AnonymousClass7TF.A0G(view2, R.id.links_promo_container_bottom);
            1Eo.A05(r5, new MH6(this, A0G, A0r, (AnonymousClass4D7) null, 18), DbV.A0J(this));
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
        return DbS.A0T(this.A02);
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
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null || recyclerView.computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public E62() {
        C51800G2j A002 = C51800G2j.A00(this, 23);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C51800G2j.A00(C51800G2j.A00(this, 20), 21));
        this.A03 = DbS.A0I(C51800G2j.A00(A003, 22), A002, new MJ4(33, (Object) null, A003), DbS.A0z(C46753Dkg.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1058640147);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_profile_multiple_addresses_bottomsheet_fragment, false);
        AnonymousClass0fD.A09(787820259, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(534700101);
        super.onDestroyView();
        this.A01 = null;
        AnonymousClass0fD.A09(-189302267, A022);
    }
}
