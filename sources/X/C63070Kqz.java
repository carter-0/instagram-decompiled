package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Kqz  reason: case insensitive filesystem */
public abstract class C63070Kqz {
    public static final C60340gF A00(C307896Rx r6, AnonymousClass6Tm r7) {
        C262224Cq A00;
        String str;
        C307786Rm A0L = Dbb.A0L(r7);
        Object A02 = r7.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        C277014uI r3 = ((C280064zw) r7.A00()).A00;
        0lg A0B = C308206Td.A0B(r6);
        C63835L8q l8q = new C63835L8q(A0L.A00, A0B, (String) A02, (String) DbT.A0q(r7, "null cannot be cast to non-null type kotlin.String", 3));
        LMF lmf = new LMF(r6, r3);
        JVE jve = l8q.A02;
        if (jve == null) {
            str = "logger";
        } else {
            jve.A00(AnonymousClass000.A00(1172));
            C11239SGz sGz = l8q.A00;
            if (sGz == null) {
                str = "feO2ApiLevel";
            } else {
                if (sGz.A00() >= 1) {
                    jve.A00(AnonymousClass000.A00(1168));
                    Fragment A022 = C308206Td.A02(r6);
                    if (A022 != null) {
                        if (A022 instanceof AnonymousClass07Z) {
                            A00 = DbV.A0J(A022);
                        } else {
                            A00 = AnonymousClass1HX.A00();
                        }
                        if (A00 != null) {
                            AnonymousClass7TE.A1Z(new C66188MGz((Object) lmf, (Object) l8q, (AnonymousClass4D7) null, 7), A00);
                        }
                    }
                    LMF.A00(lmf, (Object) null);
                } else {
                    jve.A00(AnonymousClass000.A00(1169));
                    LMF.A00(lmf, (Object) null);
                }
                return C60340gF.A00;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
