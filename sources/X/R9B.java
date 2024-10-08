package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

public final class R9B extends C67620Mqs {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SKG A01;
    public final /* synthetic */ Map A02;

    public R9B(Context context, SKG skg, Map map) {
        this.A02 = map;
        this.A01 = skg;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ Object A03(Object[] objArr) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A02);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String str = (String) A1J.getKey();
            Map map = (Map) A1J.getValue();
            SKG skg = this.A01;
            String A0r = DbU.A0r("url", map);
            String A0r2 = DbU.A0r("file_name", map);
            String A0r3 = DbU.A0r("version", map);
            Context context = this.A00;
            if (!(A0r == null || A0r2 == null || str == null || A0r3 == null)) {
                C11159SCp sCp = C11159SCp.A00;
                02m A0l = C51965G9l.A0l();
                int hashCode = AnonymousClass0HM.A00().hashCode();
                1Pq r1 = new 1Pq((1HW) null);
                r1.A02 = A0r;
                r1.A01(AnonymousClass05K.A0N);
                r1.A05 = true;
                1QS A002 = r1.A00();
                AnonymousClass1QT A0E = JTQ.A0E();
                A0E.A03 = 1Fe.A02;
                A0E.A0A = A0r2;
                1QU A003 = A0E.A00();
                AnonymousClass7TE.A1Z(new TTC(context, skg, A0l, A002, A003, A0r, str, A0r3, A0r2, (AnonymousClass4D7) null, hashCode), AnonymousClass1HX.A02(1990359309, 3));
            }
        }
        return null;
    }
}
