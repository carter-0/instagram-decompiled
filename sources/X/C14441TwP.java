package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TwP  reason: case insensitive filesystem */
public final class C14441TwP {
    public long A00;
    public final int A01;
    public final List A02;
    public final ConcurrentMap A03 = new ConcurrentHashMap();
    public final UserSession A04;
    public final C61410nE A05 = C61410nE.A00;

    public final void A00(String str, String str2) {
        ConcurrentMap concurrentMap = this.A03;
        if (str2 == null) {
            str2 = "";
        }
        concurrentMap.put(str, str2);
    }

    public final void A01(String str, String str2) {
        this.A02.add(new AnonymousClass9V0(1, str, str2, System.currentTimeMillis()));
    }

    public C14441TwP(UserSession userSession, int i) {
        this.A01 = i;
        this.A04 = userSession;
        List A0v = Pxf.A0v();
        0qQ.A07(A0v);
        this.A02 = A0v;
    }

    public final void A02(short s) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.A00) {
            0wb.A07("QplSession", new RuntimeException());
            return;
        }
        02m r3 = 02m.A0p;
        0qQ.A07(r3);
        int i = this.A01;
        r3.A0g(i, this.A00);
        for (AnonymousClass9V0 r0 : this.A02) {
            02m r4 = 02m.A0p;
            0qQ.A07(r4);
            r4.markerPoint(i, r0.A03, r0.A02, r0.A01, TimeUnit.MILLISECONDS);
        }
        Iterator A0u = AnonymousClass7TF.A0u(this.A03);
        while (A0u.hasNext()) {
            Map.Entry entry = (Map.Entry) A0u.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                02m r02 = 02m.A0p;
                0qQ.A07(r02);
                r02.markerAnnotate(i, str, (String) value);
            } else if (value instanceof Integer) {
                02m r1 = 02m.A0p;
                0qQ.A07(r1);
                r1.markerAnnotate(i, str, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                02m r12 = 02m.A0p;
                0qQ.A07(r12);
                r12.markerAnnotate(i, str, ((Boolean) value).booleanValue());
            }
        }
        02m r8 = 02m.A0p;
        0qQ.A07(r8);
        int i2 = i;
        r8.markerEnd(i2, s, currentTimeMillis, TimeUnit.MILLISECONDS);
    }
}
