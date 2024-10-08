package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Tu  reason: invalid class name and case insensitive filesystem */
public final class C242373Tu {
    public static final long A07;
    public static final C242373Tu A08 = new C242373Tu();
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C242383Tv A04 = new Object();
    public boolean A05;
    public Long A06;

    public final boolean A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return A00(userSession) != 0;
    }

    static {
        ArrayList arrayList = new ArrayList(r4);
        for (Integer A002 : AnonymousClass05K.A00(15)) {
            arrayList.add(Long.valueOf(C242393Tw.A00(A002)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) it.next()).longValue() | ((Number) next).longValue());
            }
            A07 = ((Number) next).longValue();
            return;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final long A00(UserSession userSession) {
        Long l = this.A06;
        if (l == null) {
            int i = this.A01;
            long j = this.A03;
            boolean z = this.A05;
            if (i == 0 && z && 182.A06(0Tu.A06, userSession, 36330269363421738L)) {
                j |= 1;
            }
            l = Long.valueOf(j);
            this.A06 = l;
            if (l == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return l.longValue();
    }

    public final boolean A01() {
        if (this.A01 != 0 || (this.A04.A00 & 42) == 42) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        int i = this.A01;
        if ((i & 4) == 4 || (i & 8) == 8) {
            return true;
        }
        return false;
    }
}
