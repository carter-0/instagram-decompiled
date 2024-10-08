package X;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KuN  reason: case insensitive filesystem */
public abstract class C63278KuN {
    public static final 0eP A00(List list) {
        Iterator A0x = JTP.A0x(list);
        long j = 0;
        long j2 = Long.MAX_VALUE;
        long j3 = 0;
        long j4 = Long.MAX_VALUE;
        while (A0x.hasNext()) {
            long j5 = JTO.A0W(A0x).A0D;
            if (j5 < j4) {
                j4 = j5;
            }
            if (j5 > j3) {
                j3 = j5;
            }
        }
        if (j4 == Long.MAX_VALUE || j3 == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long j6 = JTO.A0W(it).A0C * 1000;
                if (j6 < j2) {
                    j2 = j6;
                }
                if (j6 > j) {
                    j = j6;
                }
            }
            j3 = j;
            j4 = j2;
        }
        Calendar A00 = C361828gs.A00();
        return AnonymousClass7TF.A0y(Long.valueOf(C362978ip.A01(A00, new Date(j4)).getTime()), C362978ip.A01(A00, new Date(j3)).getTime());
    }
}
