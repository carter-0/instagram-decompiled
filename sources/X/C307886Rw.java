package X;

import android.app.Application;
import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Rw  reason: invalid class name and case insensitive filesystem */
public abstract class C307886Rw {
    public static C307896Rx A01(C307786Rm r12, C307456Qe r13, List list) {
        C229392nJ r0 = r12.A02;
        C276744tp A05 = C307476Qg.A05(r12);
        return new C307896Rx((C276634te) null, r12, (C307786Rm) null, r13, (AnonymousClass6SD) null, r0.AgE().AgJ(), (C277014uI) null, A05, AnonymousClass05K.A0C, C307476Qg.A07(r12), (String) null, list, (Map) null, (Map) null);
    }

    public static Object A02(Context context, C46620Di0 di0, C229392nJ r6, AnonymousClass6Tm r7, Map map) {
        C307446Qd r3 = new C307446Qd(new C3034368u((C361078fd) null, di0.A01, new C276544tV(-1), (String) null), C229652no.A00, C307436Qc.A00);
        if (context instanceof Application) {
            1Kn.A02("BloksInterpreterHelper", "Creating BloksContext with Application Context. This may break the ability to execute navigation actions correctly");
        }
        C307786Rm A01 = C307476Qg.A01(context, new SparseArray(), r3, r6, di0.A03);
        r3.A04(A01, new INC(), Collections.emptyMap());
        return C299275ur.A00(A00(di0, A01, map), r7, di0.A02);
    }

    public static void A06(C46620Di0 di0, C307896Rx r3, C277014uI r4, C277014uI r5, Map map) {
        Q3B q3b = null;
        if (r4 != null) {
            q3b = new Q3B(r3, r4);
        }
        if (r5 != null) {
            new Q3B(r3, r5);
        }
        A05(di0, q3b, r3, map);
    }

    public static C307896Rx A00(C46620Di0 di0, C307786Rm r7, Map map) {
        C3034468v r5 = di0.A01;
        C307476Qg.A02(r7).A09(new C3034368u((C361078fd) null, r5, new C276544tV(-1), (String) null), C3034368u.A05(r5.A02, map));
        return C307896Rx.A01(r7, di0.A02, (List) null);
    }

    public static Object A03(C307786Rm r1, C276544tV r2, AnonymousClass6Tm r3, C277014uI r4) {
        return C299275ur.A00(C307896Rx.A01(r1, r4, r2.A09), r3, r4);
    }

    public static void A05(C46620Di0 di0, Q3B q3b, C307896Rx r9, Map map) {
        C307786Rm r5 = r9.A03;
        if (r5 == null) {
            1Kn.A02("BloksAsyncAction", "Async action executed with a null Context");
            return;
        }
        C307896Rx A00 = A00(di0, r5, map);
        C277014uI AKh = di0.A02.AKh(r9.A02, (List) null);
        C308276Tl r0 = new C308276Tl();
        r0.A03(r5, 0);
        Object A002 = C299275ur.A00(A00, new AnonymousClass6Tm(r0.A00), AKh);
        if (q3b != null) {
            C308276Tl r1 = new C308276Tl();
            r1.A03(A002, 0);
            r1.A03(r5, 1);
            q3b.A04((C307896Rx) null, new AnonymousClass6Tm(r1.A00));
        }
    }

    @Deprecated
    public static Object A04(C229392nJ r3, AnonymousClass6Tm r4, C277014uI r5, String str) {
        return C299275ur.A00(C307896Rx.A01(C307476Qg.A01(C64361Kj.A00().A00, new SparseArray(), (C307446Qd) null, r3, str), r5, (List) null), r4, r5);
    }
}
