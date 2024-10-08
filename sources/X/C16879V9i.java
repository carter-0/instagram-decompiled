package X;

import android.os.Bundle;

/* renamed from: X.V9i  reason: case insensitive filesystem */
public abstract class C16879V9i {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        C276544tV A0O = DbY.A0O(r9);
        String str = "";
        String str2 = str;
        String A0D = A0O.A0D();
        if (A0D != null) {
            str2 = A0D;
        }
        C277014uI A0A = A0O.A0A(40);
        C309516Yo r4 = new C309516Yo(C308206Td.A04(r8), DbW.A0R(r8));
        C13990Tnq.A0h();
        String str3 = str;
        String A0F = A0O.A0F();
        if (A0F != null) {
            str3 = A0F;
        }
        String str4 = str;
        String A0K = A0O.A0K(46);
        if (A0K != null) {
            str4 = A0K;
        }
        String A0H = A0O.A0H();
        if (A0H != null) {
            str = A0H;
        }
        VRP vrp = new VRP(r8, A0A);
        Bundle A0N = C51971G9r.A0N(str3);
        A0N.putString("boosted_id", str4);
        DbS.A1B(A0N, str2);
        A0N.putString("page_id", str);
        UZX uzx = new UZX();
        uzx.setArguments(A0N);
        uzx.A00 = vrp;
        return Dba.A0U(uzx, r4);
    }
}
