package X;

import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.S2m  reason: case insensitive filesystem */
public final class C10954S2m {
    public final C10571RuQ A00;
    public final AnonymousClass8MA A01;
    public final C11121SBa A02;
    public final Set A03;
    public final boolean A04;

    public final SOP A00(C7255Q1d q1d, S5Y s5y, C7334Q4k q4k, Q1G q1g, String str) {
        C10833Ryt ryt;
        C7334Q4k q4k2 = q4k;
        String str2 = str;
        C51974G9v.A1M(str2, q1d, q4k);
        C10571RuQ ruQ = this.A00;
        S5Y s5y2 = s5y;
        C11283SJb sJb = new C11283SJb(s5y, ruQ.A00, ruQ.A01, ruQ.A02);
        ThreadPoolExecutor A032 = q1d.A03(AnonymousClass05K.A07, (Thread.UncaughtExceptionHandler) null);
        if (this.A04) {
            ryt = new C10833Ryt(s5y, sJb, str2, A032);
        } else {
            ryt = null;
        }
        return new SOP(this.A01, this.A02, s5y2, sJb, ryt, q4k2, q1g, str2, this.A03, A032);
    }

    public C10954S2m(AnonymousClass8MA r5, C11121SBa sBa, File file, String str, String str2, Map map, boolean z) {
        Object obj;
        AnonymousClass7TG.A1P(file, str2);
        0qQ.A0B(sBa, 6);
        this.A01 = r5;
        this.A02 = sBa;
        this.A04 = z;
        this.A00 = new C10571RuQ(file, str2, map);
        try {
            List A0R = 00l.A0R(str, new String[]{","}, 0);
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                C51973G9u.A1F(DbV.A12(AnonymousClass7TE.A18(it)), A1C);
            }
            obj = (Long[]) A1C.toArray(new Long[0]);
            if (obj == null) {
                obj = new Long[0];
            }
        } catch (Throwable th) {
            obj = JTO.A1B(th);
        }
        Long[] lArr = (Long[]) (obj instanceof 0eQ ? null : obj);
        lArr = lArr == null ? new Long[0] : lArr;
        HashSet hashSet = new HashSet(0se.A0L(lArr.length));
        03t.A0M(hashSet, lArr);
        this.A03 = hashSet;
    }
}
