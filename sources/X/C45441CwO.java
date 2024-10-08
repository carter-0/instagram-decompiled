package X;

import com.instagram.api.schemas.ContextualAdResponseExtrasImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CwO  reason: case insensitive filesystem */
public final class C45441CwO {
    public final Map A00 = AnonymousClass7TE.A1H();

    /* JADX WARNING: type inference failed for: r0v24, types: [X.Hpk, java.lang.Object] */
    public final C54077Gz1 A00(1Xj r28, int i) {
        String BUa;
        Map map = this.A00;
        1Xj r5 = r28;
        if (!map.containsKey(r5.getId())) {
            String id = r5.getId();
            if (id != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = r5.A1D().iterator();
                while (it.hasNext()) {
                    1Xj r1 = (1Xj) it.next();
                    ? obj = new Object();
                    0qQ.A0B(r1, 0);
                    obj.A00 = r1;
                    A1C.add(obj);
                }
                C54077Gz1 gz1 = new C54077Gz1();
                gz1.A0B = A1C;
                String str = null;
                C233492vo A002 = C233482vn.A00((C67241sS) null, (Boolean) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(i), 0sn.A00);
                0qQ.A0B(A002, 0);
                gz1.A06 = A002;
                C46298DUb BUS = r5.A0C.BUS();
                C42049BFc bFc = null;
                if (BUS == null || (BUa = BUS.BUa()) == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                C46298DUb BUS2 = r5.A0C.BUS();
                if (BUS2 != null) {
                    str = BUS2.BUW();
                }
                if (str == null) {
                    str = "";
                }
                gz1.A01 = new ContextualAdResponseExtrasImpl(BUa, "", str, "");
                C46298DUb BUS3 = r5.A0C.BUS();
                if (BUS3 != null) {
                    int BUX = BUS3.BUX();
                    if (Integer.valueOf(BUX) != null) {
                        gz1.A00 = BUX;
                        C46298DUb BUS4 = r5.A0C.BUS();
                        if (BUS4 != null) {
                            bFc = BUS4.F6S();
                        }
                        gz1.A03 = bFc;
                        gz1.A08 = r5.A0N;
                        gz1.A05 = r5;
                        map.put(id, gz1);
                    }
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        Object obj2 = map.get(r5.getId());
        if (obj2 != null) {
            return (C54077Gz1) obj2;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
