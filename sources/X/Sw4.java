package X;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

public final class Sw4 implements C13455Tai {
    public static volatile C12823T8s A04;
    public final C13457Tak A00;
    public final C10819Ryf A01;
    public final C13632Tdy A02;
    public final C13632Tdy A03;

    public static Sw4 A00() {
        C12823T8s t8s = A04;
        if (t8s != null) {
            return (Sw4) t8s.A09.get();
        }
        throw AnonymousClass7TE.A0z("Not initialized!");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.T8s, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.0eK, X.TPC] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.0eK, X.TPC] */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, X.0eK, X.TPC] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.0eK, X.TPC] */
    public static void A01(Context context) {
        if (A04 == null) {
            synchronized (Sw4.class) {
                if (A04 == null) {
                    Context context2 = context;
                    context2.getClass();
                    ? obj = new Object();
                    C13174TOg tOg = C9979RkY.A00;
                    ? obj2 = new Object();
                    Object obj3 = TPC.A02;
                    obj2.A00 = obj3;
                    obj2.A01 = tOg;
                    obj.A03 = obj2;
                    TPD tpd = new TPD(context2);
                    obj.A08 = tpd;
                    C13178TOk tOk = C9984Rkd.A00;
                    C13179TOl tOl = C9985Rke.A00;
                    C13191TOx tOx = new C13191TOx(tpd, tOk, tOl);
                    obj.A01 = tOx;
                    C13188TOu tOu = new C13188TOu(tpd, tOx);
                    ? obj4 = new Object();
                    obj4.A00 = obj3;
                    obj4.A01 = tOu;
                    obj.A04 = obj4;
                    AnonymousClass0eK r5 = obj.A08;
                    C13192TOy tOy = new C13192TOy(r5, C9981Rka.A00, C9982Rkb.A00);
                    obj.A07 = tOy;
                    C13184TOq tOq = new C13184TOq(r5);
                    obj.A05 = tOq;
                    TP6 tp6 = new TP6(tOk, tOl, C9983Rkc.A00, tOy, tOq);
                    ? obj5 = new Object();
                    obj5.A00 = obj3;
                    obj5.A01 = tp6;
                    obj.A06 = obj5;
                    C13183TOp tOp = new C13183TOp(tOk);
                    obj.A00 = tOp;
                    AnonymousClass0eK r8 = obj.A08;
                    TP2 tp2 = new TP2(r8, obj5, tOp, tOl);
                    obj.A0C = tp2;
                    AnonymousClass0eK r12 = obj.A03;
                    AnonymousClass0eK r9 = obj.A04;
                    TP5 tp5 = new TP5(r12, r9, tp2, obj5, obj5);
                    obj.A02 = tp5;
                    TP7 tp7 = new TP7(r8, r9, obj5, tp2, r12, obj5, tOk, tOl, obj5);
                    obj.A0A = tp7;
                    TP3 tp3 = new TP3(r12, obj5, tp2, obj5);
                    obj.A0B = tp3;
                    TP4 tp4 = new TP4(tOk, tOl, tp5, tp7, tp3);
                    ? obj6 = new Object();
                    obj6.A00 = obj3;
                    obj6.A01 = tp4;
                    obj.A09 = obj6;
                    A04 = obj;
                }
            }
        }
    }

    public final Sw1 A02(C13454Tah tah) {
        Set singleton;
        byte[] bytes;
        if (tah instanceof C13952TmF) {
            singleton = Collections.unmodifiableSet(Sw3.A03);
        } else {
            singleton = Collections.singleton(new S5K("proto"));
        }
        RE0 re0 = RE0.DEFAULT;
        String str = ((Sw3) tah).A00;
        if (str == null) {
            bytes = null;
        } else {
            bytes = String.format("%s%s%s%s", new Object[]{"1$", str, "\\", ""}).getBytes(Pxe.A17());
        }
        return new Sw1(C9689Rf7.A00(re0, "cct", bytes), this, singleton);
    }

    public Sw4(C13457Tak tak, C10819Ryf ryf, C10700Rwe rwe, C13632Tdy tdy, C13632Tdy tdy2) {
        this.A02 = tdy;
        this.A03 = tdy2;
        this.A00 = tak;
        this.A01 = ryf;
        rwe.A03.execute(new TDE(rwe));
    }
}
