package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.FIt  reason: case insensitive filesystem */
public final class C50008FIt implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C50008FIt(Object obj, Object obj2, Object obj3, String str, String str2, String str3, String str4, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A04 = str4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            0kR.A0F((Context) this.A01, 0cp.A03("https://www.facebook.com/help/instagram/240116693975803"));
            String str = this.A05;
            String str2 = this.A06;
            String str3 = this.A07;
            String str4 = this.A04;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) this.A02, (0lg) this.A03), "instagram_shopping_mini_shop_legal_nux_learn_more_tap");
            if (A0e.isSampled()) {
                Dbc.A0e(A0e, str4, str, str2, str3);
                A0e.Cgf();
                return;
            }
            return;
        }
        AnonymousClass0aP r7 = (AnonymousClass0aP) this.A02;
        AnonymousClass4DH r5 = (AnonymousClass4DH) this.A01;
        String str5 = this.A07;
        String str6 = this.A06;
        String str7 = this.A05;
        Context requireContext = r5.requireContext();
        0qQ.A0A(r7);
        1NY A0N = DbU.A0N(r7);
        A0N.A0A("accounts/vetted_phone_reg_login/");
        A0N.A9m("token", str7);
        DbZ.A0y(requireContext, A0N, Dbj.A01(), DbT.A0u(requireContext, A0N, "source", "vetted_phone_reg"));
        A0N.A9m("uid", str6);
        DbW.A1A(19f.A1v, A0N, DbW.A0I(A0N, r7, "adid", FHA.A0H()));
        DbW.A1D(A0N);
        1OC A0U = DbT.A0U(A0N, true);
        AnonymousClass4DH r6 = r5;
        A0U.A00 = new C47907EMb(r5, r6, r7, new C50515Fdb(r5.requireActivity()), (C46634DiE) this.A03, str5, str7);
        1ES.A03(A0U);
    }
}
