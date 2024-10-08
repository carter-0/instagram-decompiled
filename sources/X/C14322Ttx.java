package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: X.Ttx  reason: case insensitive filesystem */
public class C14322Ttx implements X9Q {
    public int A00;
    public X8S A01;
    public final int A02;
    public final long A03;
    public final Context A04;
    public final UserSession A05;
    public final AnonymousClass4DU A06;
    public final String A07;
    public final Map A08 = new HashMap();
    public final PriorityQueue A09 = new PriorityQueue();
    public final boolean A0A;

    public final boolean CcR(1Xj r4) {
        C14312Ttm ttm;
        0qQ.A0B(r4, 0);
        Map map = this.A08;
        if (map.isEmpty() || !map.containsKey(r4) || (ttm = (C14312Ttm) map.get(r4)) == null || !ttm.A0I(r4)) {
            return false;
        }
        return true;
    }

    public final void EXG(1Xj r3, boolean z) {
        C14312Ttm ttm;
        0qQ.A0B(r3, 0);
        Map map = this.A08;
        if (map.containsKey(r3) && (ttm = (C14312Ttm) map.get(r3)) != null) {
            ttm.A0D(z);
        }
    }

    public final void Eqa(1Xj r3, boolean z) {
        C14312Ttm ttm;
        0qQ.A0B(r3, 0);
        Map map = this.A08;
        if (map.containsKey(r3) && (ttm = (C14312Ttm) map.get(r3)) != null) {
            ttm.A0E(z);
        }
    }

    public final int EyN(1Xj r5, String str, boolean z) {
        0qQ.A0B(r5, 0);
        C14312Ttm ttm = (C14312Ttm) this.A08.remove(r5);
        if (ttm == null) {
            return 0;
        }
        ttm.A0C(str, true);
        PriorityQueue priorityQueue = this.A09;
        if (!priorityQueue.contains(ttm)) {
            priorityQueue.add(ttm);
            return ttm.A00;
        }
        throw new IllegalStateException("Video player manager idle video player pool already contains video player");
    }

    public final void E23(String str) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A08);
        while (A0v.hasNext()) {
            ((C14312Ttm) A0v.next()).A08();
        }
    }

    public final void ECU() {
        Map map = this.A08;
        if (!map.isEmpty()) {
            Collection<C14312Ttm> values = map.values();
            for (C14312Ttm A092 : values) {
                A092.A09();
            }
            map.clear();
            this.A09.addAll(values);
        }
    }

    public final void EJ3() {
        Iterator A0v = AnonymousClass7TF.A0v(this.A08);
        while (A0v.hasNext()) {
            ((C14312Ttm) A0v.next()).A0A();
        }
    }

    public final void Ey8(String str, boolean z) {
        Map map = this.A08;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            C14312Ttm ttm = (C14312Ttm) A0v.next();
            ttm.A0C(str, z);
            map.values().remove(ttm);
            PriorityQueue priorityQueue = this.A09;
            if (!priorityQueue.contains(ttm)) {
                priorityQueue.add(ttm);
            } else {
                throw new IllegalStateException("Video player manager idle video player pool already contains video player");
            }
        }
    }

    public C14322Ttx(Context context, UserSession userSession, AnonymousClass4DU r6, String str, long j, boolean z) {
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = r6;
        this.A07 = str;
        this.A0A = z;
        this.A03 = j;
        this.A02 = (int) 182.A01(0Tu.A05, userSession, 36591832871796755L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0009 A[LOOP:0: B:1:0x0009->B:4:0x0019, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E6t(X.C20976X7p r3, X.1Xj r4) {
        /*
            r2 = this;
            X.AnonymousClass7TG.A1N(r4, r3)
            java.util.Map r0 = r2.A08
            java.util.Iterator r1 = X.AnonymousClass7TF.A0v(r0)
        L_0x0009:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            X.Ttm r0 = (X.C14312Ttm) r0
            boolean r0 = r0.A0H(r3, r4)
            if (r0 == 0) goto L_0x0009
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14322Ttx.E6t(X.X7p, X.1Xj):void");
    }
}
