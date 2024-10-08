package X;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class E7R extends MYR implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FanClubCustomizedBenefitsEditFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2YL A0H = DbS.A0H(this.A03);
        C318136oS A002 = C318116oQ.A00(A0H);
        C66182MGt mGt = new C66182MGt((Object) A0H, (AnonymousClass4D7) null, 39);
        19B r1 = 19B.A00;
        1Eo.A05(r1, mGt, A002);
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        1Eo.A05(r1, new MHF(view, viewLifecycleOwner, r6, this, (AnonymousClass4D7) null, 41), AnonymousClass07a.A00(viewLifecycleOwner));
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        1Eo.A05(r1, new MHE(viewLifecycleOwner2, r6, this, (AnonymousClass4D7) null, 8), AnonymousClass07a.A00(viewLifecycleOwner2));
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new C47757EFr((C60106Jfm) this.A03.getValue()));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3L.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        C60106Jfm jfm = (C60106Jfm) this.A03.getValue();
        List A0Z = 00k.A0Z(jfm.A00);
        ArrayList<C61165JyH> A1C = AnonymousClass7TE.A1C();
        for (Object next : (Iterable) jfm.A05.getValue()) {
            if (((C61165JyH) next).A01) {
                A1C.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        for (C61165JyH jyH : A1C) {
            DbU.A19(jfm.A0D(), A0r, jyH.A03);
        }
        if (!(!0qQ.A0K(A0Z, 00k.A0Z(A0r)))) {
            return false;
        }
        C358248ab A0H = Dba.A0H(this);
        A0H.A09(2131957278);
        A0H.A08(2131957277);
        C50023FJi.A02(A0H, this, 51, 2131957276);
        A0H.A0O(C50023FJi.A00(this, 52), C358278ae.RED, 2131957275);
        DbT.A1V(A0H);
        return true;
    }

    public E7R() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        0eO r2 = 0eO.A02;
        this.A00 = AnonymousClass0eN.A00(r2, new C73673Phm(A1C, this, AnonymousClass000.A00(2093), 13));
        this.A01 = C51804G2n.A01(this, AnonymousClass000.A00(864), r2, 30);
        C51798G2h g2h = new C51798G2h(this, 3);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r2, new C51798G2h(new C51798G2h(this, 0), 1));
        this.A03 = DbS.A0I(new C51798G2h(A002, 2), g2h, new C58187Inr(1, A002, (Object) null), DbS.A0z(C60106Jfm.class));
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1I(r3);
        r3.Eom(2131957281);
        r3.Eiy(getString(2131957279), FP8.A00(this, 70));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(356746379);
        E7R.super.onCreate(bundle);
        setAdapter(DbU.A0U(DbV.A0S(this), new C47757EFr((C60106Jfm) this.A03.getValue())));
        AnonymousClass0fD.A09(-547211970, A022);
    }
}
