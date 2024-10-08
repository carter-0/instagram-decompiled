package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.65f  reason: invalid class name and case insensitive filesystem */
public final class C3027765f implements AnonymousClass0lh {
    public final Map A00;
    public final boolean A01;

    public C3027765f(C300355wz r9, UserSession userSession) {
        1K2 r1;
        1K2 r12;
        1K2 r13;
        0qQ.A0B(userSession, 2);
        this.A01 = C3027865g.A00(userSession, AnonymousClass0yP.A00(36325965807629736L), true);
        LinkedHashMap A06 = 0Yt.A06(new 0eP[]{new 0eP(1, new Object()), new 0eP(2, new Object()), new 0eP(3, new Object()), new 0eP(5, new Object())});
        this.A00 = A06;
        if (!r9.A05 && (r13 = (1K2) A06.get(2)) != null) {
            r13.set(C60340gF.A00);
        }
        if (!r9.A03 && (r12 = (1K2) A06.get(3)) != null) {
            r12.set(C60340gF.A00);
        }
        if (!r9.A01 && (r1 = (1K2) A06.get(5)) != null) {
            r1.set(C60340gF.A00);
        }
    }

    public final void A00(C62320sa r4, int i) {
        1K2 r2 = (1K2) this.A00.get(Integer.valueOf(i));
        if (!this.A01 || r2 == null) {
            r4.invoke();
        } else {
            C255183ti.A04(new AWV(r4, i), r2, 1Lf.A01);
        }
    }

    public final void onSessionWillEnd() {
        Map map = this.A00;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((1K2) entry.getValue()).isDone()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry value : linkedHashMap.entrySet()) {
            ((1K2) value.getValue()).cancel(true);
        }
    }
}
