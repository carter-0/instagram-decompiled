package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Kqv  reason: case insensitive filesystem */
public abstract class C63066Kqv {
    public static final C60340gF A00(C307896Rx r8, AnonymousClass6Tm r9) {
        C262224Cq A00;
        C307786Rm A0L = Dbb.A0L(r9);
        Object A02 = r9.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        Object A002 = r9.A00();
        0qQ.A0C(A002, "null cannot be cast to non-null type kotlin.String");
        C277014uI r3 = ((C280064zw) r9.A03(3)).A00;
        0lg A0B = C308206Td.A0B(r8);
        C63835L8q l8q = new C63835L8q(A0L.A00, A0B, (String) A002, (String) DbT.A0q(r9, "null cannot be cast to non-null type kotlin.String", 4));
        0qQ.A0B(str, 1);
        LMF lmf = new LMF(r8, r3);
        Fragment A022 = C308206Td.A02(r8);
        if (A022 != null) {
            if (A022 instanceof AnonymousClass07Z) {
                A00 = DbV.A0J(A022);
            } else {
                A00 = AnonymousClass1HX.A00();
            }
            if (A00 != null) {
                AnonymousClass7TE.A1Z(new C66174MGl((Object) l8q, (Object) lmf, str, (AnonymousClass4D7) null, 14), A00);
                return C60340gF.A00;
            }
        }
        LMF.A00(lmf, (Object) null);
        return C60340gF.A00;
    }
}
