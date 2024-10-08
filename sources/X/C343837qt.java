package X;

import android.content.Context;

/* renamed from: X.7qt  reason: invalid class name and case insensitive filesystem */
public interface C343837qt {
    C343697qe Ape(C343717qg r1);

    C343917r1 Apf(C343937r3 r1);

    Object Apt(C342927pO r1);

    Object Apu(C343667qb r1);

    boolean CQN(C343717qg r1);

    boolean CQO(C343937r3 r1);

    Context getContext();

    static C343697qe A00(C344467ru r0, C343717qg r1) {
        C343837qt r02 = r0.A00;
        r02.getClass();
        C343697qe Ape = r02.Ape(r1);
        0qQ.A07(Ape);
        return Ape;
    }

    static AnonymousClass9Tp A02(Object obj) {
        return (AnonymousClass9Tp) ((C345357tM) obj).A00.Ape(AnonymousClass9Tp.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.7lJ, java.lang.Object, X.AVB] */
    static C344307re A01(C343837qt r2) {
        Context context = r2.getContext();
        ? obj = new Object();
        obj.A02 = context;
        return new C344307re(r2, obj);
    }
}
