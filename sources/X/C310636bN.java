package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6bN  reason: invalid class name and case insensitive filesystem */
public final class C310636bN implements C310646bO {
    public final UserSession A00;
    public final List A01 = new ArrayList();
    public final List A02;
    public final Map A03 = new LinkedHashMap();
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final AtomicInteger A05;
    public final C310596bJ A06;
    public final C310626bM A07;
    public final boolean A08;

    public final C309426Yf Bz3(C255773uh r4) {
        0qQ.A0B(r4, 0);
        Map map = this.A03;
        C309426Yf r1 = (C309426Yf) map.get(r4);
        if (r1 != null) {
            return r1;
        }
        C309426Yf r12 = new C309426Yf(this.A08);
        map.put(r4, r12);
        return r12;
    }

    public final int A00() {
        int i = this.A05.get();
        if (i > 1000) {
            0wb.A03("ReelViewerData#getCount resulting in large accumulation of ViewModels", 002.A0O("viewModels: ", i));
        }
        return i;
    }

    public final void A01(C250973mM r4, int i) {
        ConcurrentHashMap concurrentHashMap = this.A04;
        Reel reel = r4.A0H;
        String id = reel.getId();
        0qQ.A07(id);
        if (!concurrentHashMap.containsKey(id)) {
            this.A02.add(i, r4);
            String id2 = reel.getId();
            0qQ.A07(id2);
            concurrentHashMap.put(id2, r4);
            List list = this.A01;
            String id3 = reel.getId();
            0qQ.A07(id3);
            list.add(i, id3);
            this.A05.incrementAndGet();
        }
    }

    public final boolean A02(C250973mM r6) {
        ConcurrentHashMap concurrentHashMap = this.A04;
        Reel reel = r6.A0H;
        String id = reel.getId();
        0qQ.A07(id);
        Object remove = concurrentHashMap.remove(id);
        boolean remove2 = this.A02.remove(r6);
        List list = this.A01;
        String id2 = reel.getId();
        0qQ.A07(id2);
        boolean remove3 = list.remove(id2);
        this.A05.decrementAndGet();
        if (remove == null || !remove2 || !remove3) {
            return false;
        }
        return true;
    }

    public C310636bN(UserSession userSession, C310596bJ r6, boolean z) {
        this.A00 = userSession;
        this.A08 = z;
        this.A06 = r6;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        0qQ.A07(synchronizedList);
        this.A02 = synchronizedList;
        this.A07 = (C310626bM) userSession.A01(C310626bM.class, new AnonymousClass9L1(userSession, 49));
        this.A05 = new AtomicInteger(0);
    }
}
