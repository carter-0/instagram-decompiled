package X;

import android.os.Bundle;

/* renamed from: X.V9g  reason: case insensitive filesystem */
public abstract class C16877V9g {
    public static final Object A00(C307896Rx r13, AnonymousClass6Tm r14) {
        int A04 = DbW.A04(r14.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(r14.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A00 = r14.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        String A0n = Pxg.A0n(r14, 3);
        C277014uI A0P = DbW.A0P(r14, 4);
        String A0n2 = Pxg.A0n(r14, 5);
        String A0n3 = Pxg.A0n(r14, 6);
        String A0n4 = Pxg.A0n(r14, 7);
        String A0n5 = Pxg.A0n(r14, 8);
        String A0n6 = Pxg.A0n(r14, 9);
        C309516Yo A0I = Dbb.A0I(r13);
        C249713kF.A00.A0T();
        WBH wbh = new WBH(19, (Object) A0P, (Object) r13);
        Bundle bundle = new Bundle();
        bundle.putBoolean("in_app_signup_flow", true);
        bundle.putInt("in_app_signup_stepper_index", A04);
        bundle.putInt("in_app_signup_stepper_capacity", A042);
        bundle.putString("in_app_signup_catalog_selection_title_text", A0n6);
        bundle.putString("in_app_signup_bottom_button_text", (String) A00);
        bundle.putString("in_app_signup_bottom_button_route", A0n);
        bundle.putString("waterfall_id", A0n2);
        DbS.A1B(bundle, A0n3);
        bundle.putString("presentation_style", A0n5);
        bundle.putString("prior_module_name", A0n4);
        C15390Ubt ubt = new C15390Ubt();
        ubt.A00 = wbh;
        ubt.setArguments(bundle);
        return Dba.A0U(ubt, A0I);
    }
}
