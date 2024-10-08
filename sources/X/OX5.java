package X;

import java.util.Iterator;

public abstract class OX5 {
    public static void A01(0Aj r4, Integer num, Integer num2) {
        Object obj;
        Object obj2;
        C69458Nm2 nm2;
        Iterator it = O57.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C69438Nli) obj).name(), C69839Nt3.A00(num))) {
                break;
            }
        }
        r4.A8M((C69438Nli) obj, "theme_type");
        if (num2 == AnonymousClass05K.A0N) {
            nm2 = C69458Nm2.COLOR_GRADIENT;
        } else {
            Iterator it2 = O57.A00.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (0qQ.A0K(((C69458Nm2) obj2).name(), C69839Nt3.A00(num2))) {
                    break;
                }
            }
            nm2 = (C69458Nm2) obj2;
        }
        r4.A8M(nm2, "set_theme_type");
        r4.Cgf();
    }

    public static final void A02(0wc r1, C254783t2 r2, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(r1, C273654mx.A00(2277));
        if (A0e.isSampled()) {
            C66581MXm.A1H(A0e, AnonymousClass6W3.A07(r2));
            C66580MXl.A1J(A0e, str);
            DbS.A1F(A00(str2), A0e);
            C66583MXo.A16(A0e, r2);
            A0e.Cgf();
        }
    }

    public static final C69478NmM A00(String str) {
        switch (str.hashCode()) {
            case -2019791911:
                if (str.equals("null_state")) {
                    return C69478NmM.NULL_STATE;
                }
                break;
            case -855114483:
                if (str.equals("thread_details")) {
                    return C69478NmM.THREAD_DETAILS;
                }
                break;
            case -326696768:
                if (str.equals("long_press")) {
                    return C69478NmM.LONG_PRESS;
                }
                break;
            case 1936452375:
                if (str.equals("admin_message")) {
                    return C69478NmM.ADMIN_MESSAGE;
                }
                break;
        }
        return C69478NmM.UNDEFINED;
    }
}
