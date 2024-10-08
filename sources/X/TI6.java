package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class TI6 implements Runnable {
    public final /* synthetic */ QGH A00;
    public final /* synthetic */ S5Q A01;
    public final /* synthetic */ C10963S2v A02;

    public TI6(QGH qgh, S5Q s5q, C10963S2v s2v) {
        this.A00 = qgh;
        this.A01 = s5q;
        this.A02 = s2v;
    }

    public final void run() {
        Map map;
        Object obj;
        QGH qgh = this.A00;
        AnonymousClass3Q2 r0 = qgh.A05;
        if (r0 != null) {
            String str = r0.A3t;
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            S5Q s5q = this.A01;
            Object obj2 = s5q.A00;
            C10963S2v s2v = this.A02;
            if (obj2 instanceof List) {
                Iterator A1H = C51966G9m.A1H(obj2);
                while (A1H.hasNext()) {
                    Object next = A1H.next();
                    Object obj3 = null;
                    if (next instanceof Map) {
                        map = (Map) next;
                    } else {
                        map = null;
                    }
                    if (map != null) {
                        obj = map.get("language");
                    } else {
                        obj = null;
                    }
                    String valueOf = String.valueOf(obj);
                    if (map != null) {
                        obj3 = map.get("is_lipsync");
                    }
                    boolean A1X = AnonymousClass7TG.A1X((Boolean) obj3);
                    A1C2.add(DbY.A0p("is_lipsync", String.valueOf(A1X), AnonymousClass7TE.A1L("language", valueOf)));
                    2IV A0R = Pxe.A0R();
                    A0R.A09(valueOf, "language");
                    A0R.A08("is_lipsync", Boolean.valueOf(A1X));
                    A1C.add(A0R);
                }
                C11039S6r s6r = qgh.A02;
                if (s6r != null) {
                    String iSO3Language = Locale.getDefault().getISO3Language();
                    0qQ.A07(iSO3Language);
                    0eP A1L = AnonymousClass7TE.A1L("input_language", new QGF(iSO3Language));
                    C250873mC r6 = C250863mB.A03;
                    C255453u9 r02 = C255453u9.A01;
                    s6r.A03(DbY.A0p("output_languages", new QGF(r6.A02(A1C2, new AnonymousClass409(new C258613zM(r02, r02)))), A1L));
                }
                2IV A0R2 = Pxe.A0R();
                A0R2.A09(Locale.getDefault().getISO3Language(), "input_language");
                0Df.A00(A0R2.A02(), DbV.A0q(str), "upload_id");
                A0R2.A05("output_languages", A1C);
                2IS A04 = C41845B3m.A04();
                2IS A042 = C41845B3m.A04();
                A04.A00(A0R2, "data");
                1vm.A01(qgh.A07).ATL(new C71556Omr(0, s5q, s2v), new C12094Smo(0, qgh, s2v), new PandoGraphQLRequest(C41845B3m.A05(), "AutodubCreateQuery", A04.getParamsCopy(), A042.getParamsCopy(), QR2.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_autodub_create", AnonymousClass7TE.A1C()));
            }
        }
    }
}
