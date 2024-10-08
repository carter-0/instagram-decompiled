package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.FxD  reason: case insensitive filesystem */
public final class C51624FxD implements 02o {
    public final /* synthetic */ C47475E3z A00;
    public final /* synthetic */ IgdsBottomButtonLayout A01;
    public final /* synthetic */ boolean A02;

    public C51624FxD(C47475E3z e3z, IgdsBottomButtonLayout igdsBottomButtonLayout, boolean z) {
        this.A00 = e3z;
        this.A02 = z;
        this.A01 = igdsBottomButtonLayout;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r9) {
        String str;
        if (AnonymousClass7TE.A1a(obj)) {
            C47475E3z e3z = this.A00;
            C49461Ew2 ew2 = e3z.A00;
            if (ew2 == null) {
                str = "logger";
            } else {
                0Aj A0e = AnonymousClass7TE.A0e(ew2.A00, "ig_creator_agents_suggested_replies_turn_on_sr_onboard_nux");
                if (A0e.isSampled()) {
                    DbV.A1J(A0e, ew2.A01);
                }
                AnonymousClass0eM r5 = e3z.A02;
                1Av A0h = DbX.A0h(r5);
                AnonymousClass7TF.A1J(A0h, A0h.A1a, 1Av.A8a, 387, true);
                if (this.A02) {
                    C309516Yo A0P = DbZ.A0P(e3z, r5);
                    C61372K4q k4q = new C61372K4q();
                    String str2 = e3z.A01;
                    if (str2 == null) {
                        str = "entryPoint";
                    } else {
                        DbT.A1N(k4q, new 0eP[]{AnonymousClass7TE.A1L("entrypoint", str2)});
                        A0P.A0D(k4q);
                        A0P.A0D = false;
                        A0P.A07();
                    }
                } else {
                    DbX.A0h(r5).A1K(true);
                    DbX.A1I(e3z);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01.setPrimaryActionIsLoading(false);
        return C60340gF.A00;
    }
}
