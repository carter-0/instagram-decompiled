package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class E20 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FxISUpsellFragment";
    public ViewStub A00;
    public AnonymousClass0wW A01;
    public C46762Dkp A02;
    public String A03;

    public final String getModuleName() {
        return "IS Upsell";
    }

    public static void A00(E20 e20) {
        UserSession userSession = e20.A01;
        String str = e20.A03;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, str);
        FGS.A03(userSession, "cp_upsell_screen_confirm", str, (Map) null);
        e20.A02.A0C = A1U;
        C48916EmG.A00().A00(e20.getContext(), DbV.A0G(e20), false, false);
        AnonymousClass0wW r5 = e20.A01;
        ImmutableList immutableList = e20.A02.A00;
        immutableList.getClass();
        C47691EDa eDa = new C47691EDa(e20, 2);
        0qQ.A0B(r5, 0);
        2IS A04 = C41845B3m.A04();
        boolean A1Z = C41848B3p.A1Z(A04, "client_mutation_id", AnonymousClass7TF.A0b());
        A04.A05("accounts_to_sync", immutableList);
        17k.A0E(A1Z);
        C239113Fa r1 = new C239113Fa(A04, C47105Dqh.class, "IGFxImSyncResourcesMutation", A1U);
        C239123Fb r0 = new C239123Fb(r5);
        r0.A08(r1);
        1OC A05 = r0.A05();
        A05.A00 = eDa;
        1ES.A03(A05);
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public static void A01(E20 e20, int i) {
        C48916EmG.A00().A01(DbV.A0G(e20));
        C51950G8t A002 = C49047EoR.A00(e20);
        if (A002 != null) {
            A002.Cm0(i);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1325526787);
        E20.super.onCreate(bundle);
        this.A02 = DbW.A0F(this).A00(C46762Dkp.class);
        String string = requireArguments().getString("ONBOARDING_STEP");
        String str = "ig_nux";
        if (string != null && !string.equals(str)) {
            str = "ig_nux_after_linking_upsell";
        }
        this.A03 = str;
        this.A01 = DbX.A0T(this);
        AnonymousClass0fD.A09(-751664230, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(24880269);
        C48916EmG.A00().A00(getContext(), DbV.A0G(this), false, false);
        View inflate = layoutInflater.inflate(R.layout.fx_is_upsell_screen_layout, viewGroup, false);
        this.A00 = DbU.A0D(inflate, R.id.fx_is_upsell_screen_stub);
        AnonymousClass0wW r5 = this.A01;
        C47691EDa eDa = new C47691EDa(this, 1);
        0qQ.A0B(r5, 0);
        C239113Fa r1 = new C239113Fa(C41845B3m.A04(), C47101Dqd.class, "IGFXIMNUXConfigQuery", false);
        C239123Fb r0 = new C239123Fb(r5);
        r0.A08(r1);
        1OC A05 = r0.A05();
        A05.A00 = eDa;
        1ES.A03(A05);
        AnonymousClass0fD.A09(-1828692707, A022);
        return inflate;
    }
}
