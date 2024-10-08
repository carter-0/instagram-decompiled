package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ToI  reason: case insensitive filesystem */
public final class C14016ToI {
    public final UserSession A00;
    public final C20998X8v A01;
    public final C20980X7u A02;
    public final List A03;
    public final int A04;
    public final C61410nE A05 = C61410nE.A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.AHn(r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14016ToI(com.instagram.common.session.UserSession r7, X.C20998X8v r8, X.C20980X7u r9, int r10) {
        /*
            r6 = this;
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r6.<init>()
            r6.A00 = r7
            r6.A01 = r8
            r6.A02 = r9
            r6.A04 = r10
            X.0nE r0 = X.C61410nE.A00
            r6.A05 = r0
            r5 = r6
            monitor-enter(r5)
            X.X7u r4 = r6.A02     // Catch:{ all -> 0x0038 }
            com.instagram.common.session.UserSession r3 = r6.A00     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = r4.B8G(r3)     // Catch:{ all -> 0x0038 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0038 }
            r1.<init>()     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0031
            X.X8v r0 = r6.A01     // Catch:{ IOException -> 0x002e }
            java.util.ArrayList r0 = r0.AOm(r3, r2)     // Catch:{ IOException -> 0x002e }
            if (r0 == 0) goto L_0x0031
            r1 = r0
            goto L_0x0031
        L_0x002e:
            r4.AHn(r3)     // Catch:{ all -> 0x0038 }
        L_0x0031:
            X.01V.A1C(r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r5)
            r6.A03 = r1
            return
        L_0x0038:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14016ToI.<init>(com.instagram.common.session.UserSession, X.X8v, X.X7u, int):void");
    }

    private final synchronized void A00() {
        try {
            C20980X7u x7u = this.A02;
            UserSession userSession = this.A00;
            x7u.EKG(userSession, this.A01.ENA(userSession, this.A03));
        } catch (IOException e) {
            0KC.A0F("RecentSearchCache", "Error saving recent searches. Clearing results.", e);
            this.A02.AHn(this.A00);
        }
        return;
    }

    public final synchronized List A01() {
        ArrayList arrayList;
        List<C66942Mfb> list = this.A03;
        arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C66942Mfb AvK : list) {
            arrayList.add(this.A01.AvK(AvK));
        }
        return arrayList;
    }

    public final synchronized List A02() {
        return 00k.A0a(this.A03);
    }

    public final synchronized void A03() {
        this.A03.clear();
        this.A02.AHn(this.A00);
    }

    public final synchronized void A04(Object obj) {
        Object obj2;
        long j;
        List list = this.A03;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            C20998X8v x8v = this.A01;
            if (0qQ.A0K(x8v.BEa(obj), x8v.BEa(x8v.AvK((C66942Mfb) obj2)))) {
                break;
            }
        }
        C66942Mfb mfb = (C66942Mfb) obj2;
        if (mfb instanceof AnonymousClass72J) {
            j = System.currentTimeMillis();
        } else {
            j = AnonymousClass7TG.A0I();
        }
        if (mfb != null) {
            mfb.A02 = j;
            list.remove(mfb);
            list.add(0, mfb);
        } else {
            list.add(0, this.A01.ALz(this.A00, obj, j));
        }
        while (list.size() > this.A04) {
            list.remove(list.size() - 1);
        }
        A00();
    }

    public final synchronized void A05(Object obj) {
        List list = this.A03;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C66942Mfb mfb = (C66942Mfb) it.next();
            C20998X8v x8v = this.A01;
            if (0qQ.A0K(x8v.BEa(obj), x8v.BEa(x8v.AvK(mfb)))) {
                list.remove(mfb);
                A00();
                break;
            }
        }
    }

    public final synchronized void A06(List list) {
        List list2 = this.A03;
        list2.clear();
        list2.addAll(list);
        A00();
    }
}
