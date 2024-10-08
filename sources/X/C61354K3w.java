package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.K3w  reason: case insensitive filesystem */
public final class C61354K3w extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "LeadGenConfirmationBottomSheetFragment";
    public final AnonymousClass0eM A00;

    public final String getModuleName() {
        return "lead_gen_confirmation_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0G = DbU.A0G(view, R.id.confirmation_title);
        AnonymousClass0eM r2 = this.A00;
        A0G.setText(((C60139JgK) r2.getValue()).A02);
        DbU.A0G(view, R.id.confirmation_description).setText(((C60139JgK) r2.getValue()).A01);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return ((C60139JgK) this.A00.getValue()).A00;
    }

    public C61354K3w() {
        C20696WxS wxS = new C20696WxS(this, 34);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20696WxS(new C20696WxS(this, 31), 32));
        this.A00 = DbS.A0I(new C20696WxS(A002, 33), wxS, new C73666Phf(46, (Object) null, A002), DbS.A0z(C60139JgK.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-984164642);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_lead_gen_confirmation_bottom_sheet, false);
        AnonymousClass0fD.A09(-303185641, A02);
        return A0D;
    }
}
