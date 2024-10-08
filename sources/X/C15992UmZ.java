package X;

import android.view.View;

/* renamed from: X.UmZ  reason: case insensitive filesystem */
public final class C15992UmZ extends AnonymousClass2xK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C15992UmZ(View view, C14076TpQ tpQ, int i) {
        this.A00 = i;
        this.A02 = tpQ;
        this.A01 = view;
    }

    public final boolean Ds8(AnonymousClass5Gv r4) {
        int i = this.A00;
        0qQ.A0B(r4, 0);
        Object obj = this.A02;
        if (i != 0) {
            C14076TpQ tpQ = (C14076TpQ) obj;
            if (tpQ.A03 == null) {
                return true;
            }
            new C56800ICx(tpQ, 63).onClick((View) this.A01);
            C51975G9x.A18(AnonymousClass7TE.A0e(tpQ.A0T.A00, AnonymousClass000.A00(591)), "ig_explore_controls_upsell_tapped");
            return true;
        }
        new WB9(obj, 1).onClick((View) this.A01);
        return true;
    }

    public final void DsH(AnonymousClass5Gv r5) {
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            C14076TpQ tpQ = (C14076TpQ) obj;
            0xY A0p = AnonymousClass7TE.A0p(1Au.A00(tpQ.A0R));
            A0p.E5T("explore_controls_upsell_tooltip_shown", true);
            A0p.apply();
            C51975G9x.A18(AnonymousClass7TE.A0e(tpQ.A0T.A00, AnonymousClass000.A00(591)), "ig_explore_controls_upsell_shown");
            return;
        }
        AnonymousClass7TG.A0g(C2593341h.A00(((C14076TpQ) obj).A0R).A00, "explore_search_bar_entry_point_tooltip_display_count").apply();
    }
}
