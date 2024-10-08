package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.Edr  reason: case insensitive filesystem */
public abstract class C48396Edr {
    public static final List A00(C307896Rx r9, AnonymousClass6Tm r10) {
        Iterable iterable = (Iterable) DbW.A0e(r10);
        boolean A1W = DbW.A1W(r10, 1);
        C307786Rm r0 = r9.A03;
        if (r0 == null) {
            return AnonymousClass7TE.A1C();
        }
        AnonymousClass2XD.A00(r0.A00);
        if (iterable != null) {
            Set A0k = 00k.A0k(iterable);
            ArrayList<2Xa> A1C = AnonymousClass7TE.A1C();
            for (Object next : (Collection) AnonymousClass2XL.A02.getValue()) {
                2Xa r5 = (2Xa) next;
                if ((!A1W || System.currentTimeMillis() < Long.MAX_VALUE) && A0k.contains(r5.A09)) {
                    A1C.add(next);
                }
            }
            ArrayList A0r = AnonymousClass7TG.A0r(A1C);
            for (2Xa r92 : A1C) {
                0eP A1L = AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r92.A09);
                double d = r92.A06;
                List list = r92.A07.A00;
                0eP A1L2 = AnonymousClass7TE.A1L("group_size", Double.valueOf((d / ((double) list.size())) * 100.0d));
                HashMap A1E = AnonymousClass7TE.A1E();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    A1E.put(Integer.valueOf(i), ((2XX) list.get(i)).A01);
                }
                0eP A1L3 = AnonymousClass7TE.A1L("groups", A1E);
                String str = 2Xa.A00(r92).A01;
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (0qQ.A0K(((2XX) list.get(i2)).A01, str)) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                A0r.add(0Yt.A02(AnonymousClass7TH.A0h("current_group_index", Integer.valueOf(i2), A1L, A1L2, A1L3)));
            }
            return A0r;
        }
        ArrayList<2Xa> A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : (Collection) AnonymousClass2XL.A02.getValue()) {
            if (!A1W || System.currentTimeMillis() < Long.MAX_VALUE) {
                A1C2.add(next2);
            }
        }
        ArrayList A0r2 = AnonymousClass7TG.A0r(A1C2);
        for (2Xa r02 : A1C2) {
            A0r2.add(DbY.A0m(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r02.A09));
        }
        return A0r2;
    }
}
