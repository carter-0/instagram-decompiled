package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4wo  reason: invalid class name and case insensitive filesystem */
public final class C278394wo implements AnonymousClass0lh {
    public final Map A00 = new ConcurrentHashMap();
    public final Map A01 = new ConcurrentHashMap();
    public final Set A02;
    public final Set A03;
    public final UserSession A04;

    public final void A01(C60958JuG juG, String str) {
        0qQ.A0B(str, 0);
        synchronized (this) {
            this.A01.put(str, juG);
        }
    }

    public final void A02(String str) {
        synchronized (this) {
            Map map = this.A01;
            C60958JuG juG = (C60958JuG) map.get(str);
            if (juG != null) {
                this.A00.put(str, juG);
                map.remove(str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r2.A00.containsKey(r3) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
            monitor-enter(r2)
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0016
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.containsKey(r3)     // Catch:{ all -> 0x0019 }
            r0 = 0
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            monitor-exit(r2)
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278394wo.A03(java.lang.String):boolean");
    }

    public final void onSessionWillEnd() {
        synchronized (this) {
            this.A01.clear();
            this.A02.clear();
            this.A03.clear();
            this.A00.clear();
        }
    }

    public final List A00(String str) {
        Set set = this.A03;
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            if (0qQ.A0K(((C47184Drz) next).A02, str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public C278394wo(UserSession userSession) {
        this.A04 = userSession;
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet();
        0qQ.A07(newKeySet);
        this.A02 = newKeySet;
        ConcurrentHashMap.KeySetView newKeySet2 = ConcurrentHashMap.newKeySet();
        0qQ.A07(newKeySet2);
        this.A03 = newKeySet2;
    }
}
