package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class TKH implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ XSa A01;
    public final /* synthetic */ C11332SNl A02;
    public final /* synthetic */ C10280Rpe A03;
    public final /* synthetic */ Object A04;

    public /* synthetic */ TKH(XSa xSa, C11332SNl sNl, C10280Rpe rpe, Object obj, long j) {
        this.A02 = sNl;
        this.A01 = xSa;
        this.A04 = obj;
        this.A00 = j;
        this.A03 = rpe;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [X.Rxb, java.lang.Object] */
    public final void run() {
        RJB rjb;
        C11332SNl sNl = this.A02;
        XSa xSa = this.A01;
        Object obj = this.A04;
        long j = this.A00;
        C10280Rpe rpe = this.A03;
        Map map = sNl.A07;
        if (!map.containsKey(xSa)) {
            map.put(xSa, new C8521QwL());
        }
        C13955TmI tmI = (C13955TmI) map.get(xSa);
        Long valueOf = Long.valueOf(j);
        C8528QwS qwS = (C8528QwS) tmI;
        Map map2 = qwS.A01;
        Collection collection = (Collection) map2.get(obj);
        if (collection == null) {
            ArrayList A0v = DbS.A0v(3);
            if (A0v.add(valueOf)) {
                qwS.A00++;
                map2.put(obj, A0v);
            } else {
                throw Pxe.A0e(C273654mx.A00(1314));
            }
        } else if (collection.add(valueOf)) {
            qwS.A00++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map map3 = sNl.A06;
        if (map3.get(xSa) == null || elapsedRealtime - AnonymousClass7TE.A0R(map3.get(xSa)) > TimeUnit.SECONDS.toMillis(30)) {
            map3.put(xSa, Long.valueOf(elapsedRealtime));
            SyO syO = (SyO) tmI;
            Set set = syO.A01;
            if (set == null) {
                C8528QwS qwS2 = (C8528QwS) syO;
                set = new C8541Qwf(qwS2, qwS2.A01);
                syO.A01 = set;
            }
            for (Object next : set) {
                Collection collection2 = (Collection) qwS.A01.get(next);
                if (collection2 == null) {
                    collection2 = DbS.A0v(3);
                }
                ArrayList A1D = AnonymousClass7TE.A1D(qwS.A00(next, collection2));
                Collections.sort(A1D);
                Iterator it = A1D.iterator();
                long j2 = 0;
                while (it.hasNext()) {
                    j2 += Pxg.A0H(it);
                }
                Long valueOf2 = Long.valueOf((j2 / ((long) A1D.size())) & Long.MAX_VALUE);
                Long valueOf3 = Long.valueOf(Pxg.A0I(A1D, Math.max(Pxh.A0C(A1D, 100.0d) - 1, 0)) & Long.MAX_VALUE);
                Long valueOf4 = Long.valueOf(Pxg.A0I(A1D, Math.max(Pxh.A0C(A1D, 75.0d) - 1, 0)) & Long.MAX_VALUE);
                C10786Ry7 ry7 = new C10786Ry7(valueOf3, Long.valueOf(Pxg.A0I(A1D, Math.max(Pxh.A0C(A1D, 0.0d) - 1, 0)) & Long.MAX_VALUE), valueOf2, Long.valueOf(Pxg.A0I(A1D, Math.max(Pxh.A0C(A1D, 25.0d) - 1, 0)) & Long.MAX_VALUE), Long.valueOf(Pxg.A0I(A1D, Math.max(Pxh.A0C(A1D, 50.0d) - 1, 0)) & Long.MAX_VALUE), valueOf4);
                int size = A1D.size();
                R2v r2v = rpe.A00;
                C10989S4b s4b = (C10989S4b) next;
                ? obj2 = new Object();
                if (r2v.A01.A01()) {
                    rjb = RJB.TYPE_THICK;
                } else {
                    rjb = RJB.TYPE_THIN;
                }
                obj2.A01 = rjb;
                obj2.A00 = new C10610Rv4(s4b, ry7, Integer.valueOf(size & Integer.MAX_VALUE));
                RJJ.A01.execute(new C13064TJu(xSa, sNl, new C10612Rv6(obj2, 0), C11332SNl.A00(sNl)));
            }
            map.remove(xSa);
        }
    }
}
