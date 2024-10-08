package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;

public final class E41 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FanClubPurchaseProcessingFragment";
    public final AnonymousClass0eM A00 = C51798G2h.A00(this, 17);
    public final AnonymousClass0eM A01 = C51798G2h.A00(this, 18);
    public final AnonymousClass0eM A02 = C51798G2h.A00(this, 19);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04 = C51798G2h.A00(this, 20);
    public final AnonymousClass0eM A05;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131963088);
        r3.Eu5(FP1.A00(this, 1), true);
    }

    public final String getModuleName() {
        return "FanClubPurchaseProcessFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String A0t;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbS.A1T(DbX.A0k(view));
        Object value = this.A00.getValue();
        if (value != null && (A0t = DbS.A0t(this.A04)) != null) {
            07U r3 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(new MH7(viewLifecycleOwner, r3, this, value, A0t, (AnonymousClass4D7) null, 16), AnonymousClass07a.A00(viewLifecycleOwner));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public E41() {
        C51798G2h g2h = new C51798G2h(this, 24);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51798G2h(new C51798G2h(this, 21), 22));
        this.A05 = DbS.A0I(new C51798G2h(A002, 23), g2h, new C58187Inr(7, A002, (Object) null), DbS.A0z(FanClubGiftingViewModel.class));
    }

    public final boolean onBackPressed() {
        C358248ab A0H = Dba.A0H(this);
        A0H.A09(2131962071);
        A0H.A08(2131963085);
        A0H.A0I((DialogInterface.OnClickListener) null, 2131962069);
        A0H.A0O(C50023FJi.A00(this, 57), C358278ae.RED, 2131962068);
        DbT.A1V(A0H);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1446244777);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fan_club_purchase_processing, viewGroup, false);
        AnonymousClass0fD.A09(-276876014, A022);
        return inflate;
    }
}
