package X;

import android.content.Context;
import com.google.gson.Gson;
import java.util.AbstractMap;
import java.util.List;

/* renamed from: X.Rgx  reason: case insensitive filesystem */
public abstract class C9801Rgx {
    public static final Object A00(C307896Rx r13, AnonymousClass6Tm r14) {
        String str;
        0Tu r2 = 0Tu.A05;
        if (1AW.A06(r2, 18316721257464738L)) {
            String A0h = DbY.A0h(r14, 0);
            C307786Rm r0 = r13.A03;
            if (r0 != null) {
                Context context = r0.A00;
                1AW.A01(r2, 18598196234230115L);
                Gson gson = new Gson();
                C239283Fv A00 = AnonymousClass5KI.A00(context, (AnonymousClass5KJ) null, "underage_storage", new C377589Mk("underage_storage", 5));
                AnonymousClass0Gt r5 = AnonymousClass0Gt.A00;
                0qQ.A07(r5);
                0qQ.A0B(A0h, 0);
                String str2 = (String) C67351tA.A00(19B.A00, new MFe((Object) A00, "{}", "underage", (AnonymousClass4D7) null, 0));
                List A18 = DbV.A18(A0h, "-");
                if (A18.size() > 2) {
                    str = AnonymousClass7TE.A19(A18, 2);
                } else {
                    str = "";
                }
                if (str.length() > 0) {
                    Object A09 = gson.A09(str2, new R2P().type);
                    0qQ.A07(A09);
                    AbstractMap abstractMap = (AbstractMap) A09;
                    Number number = (Number) abstractMap.get(str);
                    if (number == null) {
                        number = 0;
                    }
                    C66581MXm.A1S(str, abstractMap, number.intValue() + 1);
                    String A0f = Pxf.A0f(abstractMap);
                    0qQ.A07(A0f);
                    C262294Dd AR3 = A00.AR3();
                    AR3.E5f("underage", A0f);
                    AR3.AIN();
                    long now = r5.now();
                    C262294Dd AR32 = A00.AR3();
                    AR32.E5b("underage_timestamp", now);
                    AR32.AIN();
                }
            }
        }
        return null;
    }
}
