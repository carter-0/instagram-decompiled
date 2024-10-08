package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.8dF  reason: invalid class name and case insensitive filesystem */
public abstract class C359638dF {
    public static void A04(Context context, C359628dE r5, String str, Map map, long j) {
        A03(context, r5, str, (String) null, map, j);
    }

    public static void A02(Context context, C359628dE r3, String str, String str2, Map map, long j) {
        if (str != null) {
            C359688dK A01 = C64361Kj.A00().A01();
            try {
                A01.A00.AUh(context, A01.A01.A00(context, r3, str, str2, map, j));
            } finally {
                1Kg.A01();
            }
        }
    }

    public static void A03(Context context, C359628dE r3, String str, String str2, Map map, long j) {
        if (str != null) {
            C359688dK A01 = C64361Kj.A00().A01();
            A01.A00.E3Z(context, A01.A01.A00(context, r3, str, str2, map, j), j);
        }
    }

    public static C359978dn A00(Context context, C359628dE r3, String str, String str2, Map map, long j) {
        C359688dK A01 = C64361Kj.A00().A01();
        return new C359968dm(A01.A00.BnC(context, A01.A01.A00(context, r3, str, str2, map, j)));
    }

    public static void A01(Context context, C359628dE r12, String str, String str2, Map map) {
        C359688dK A01 = C64361Kj.A00().A01();
        try {
            A01.A00.CNk(context, A01.A01.A00(context, r12, str, str2, map, 0));
        } finally {
            A01.A02.A00(r12, str, str2, map);
        }
    }
}
