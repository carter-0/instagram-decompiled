package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class KA8 extends 1P0 {
    public final /* synthetic */ C317466nJ A00;
    public final /* synthetic */ C317876nz A01;
    public final /* synthetic */ AnonymousClass8ME A02;

    public KA8(C317466nJ r1, C317876nz r2, AnonymousClass8ME r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-879332078);
        int A032 = AnonymousClass0fD.A03(1842105685);
        AnonymousClass8ME r6 = this.A02;
        JY9 jy9 = (JY9) r6.A1L.get();
        C317466nJ r2 = this.A00;
        C59811JZf jZf = jy9.A0J;
        if (jZf != null) {
            C59810JZe jZe = jZf.A0G;
            ArrayList arrayList = jZe.A05;
            arrayList.remove(r2);
            jZe.clear();
            C59810JZe.A00(jZe, arrayList);
            jy9.A0O(true);
        }
        C321086tY A002 = C353578Ie.A00(r6.A0r);
        String str = this.A01.A0Z;
        05G r1 = A002.A05;
        LinkedHashMap A033 = 0Yt.A03(JTO.A18(r1));
        A033.remove(str);
        r1.Epw(A033);
        AnonymousClass0fD.A0A(1745515035, A032);
        AnonymousClass0fD.A0A(-1800557137, A03);
    }
}
