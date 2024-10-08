package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.46N  reason: invalid class name */
public final class AnonymousClass46N extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1UV A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C228612lx A03;
    public final /* synthetic */ C233992wo A04;
    public final /* synthetic */ AnonymousClass46L A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass46N(1UV r4, UserSession userSession, C228612lx r6, C233992wo r7, AnonymousClass46L r8, List list, int i, boolean z) {
        super(345, 3, false, false);
        this.A03 = r6;
        this.A05 = r8;
        this.A00 = i;
        this.A01 = r4;
        this.A02 = userSession;
        this.A04 = r7;
        this.A07 = z;
        this.A06 = list;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.0rm, java.lang.Object] */
    public final void run() {
        Map map;
        Map map2;
        ArrayList arrayList;
        Runnable runnable;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        C228612lx r9 = this.A03;
        Object obj = r9.A02;
        List<String> list = this.A06;
        synchronized (obj) {
            for (String str : list) {
                r9.A04.remove(str);
                r9.A03.remove(str);
                hashSet.add(str);
            }
            map = r9.A04;
            arrayList2.addAll(map.values());
            map2 = r9.A03;
            arrayList2.addAll(map2.values());
        }
        AnonymousClass46L r10 = this.A05;
        int i = this.A00;
        1UV r8 = this.A01;
        ArrayList A002 = C228612lx.A00(r8, r9, r10, arrayList2, hashSet, i, false);
        UserSession userSession = this.A02;
        if (1Uh.A03(userSession) && 182.A06(0Tu.A05, userSession, 36328517017025927L) && (!(A002 instanceof Collection) || !A002.isEmpty())) {
            Iterator it = A002.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AnonymousClass3VP.A02((1Xg) it.next())) {
                        arrayList = C228612lx.A00(r8, r9, r10, arrayList2, hashSet, i, true);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        arrayList = 0sn.A00;
        C233992wo r6 = this.A04;
        if (this.A07) {
            ? obj2 = new Object();
            List CsY = r6.CsY(A002);
            obj2.A00 = CsY;
            if (CsY.isEmpty() && (!arrayList.isEmpty())) {
                obj2.A00 = r6.CsY(arrayList);
            }
            synchronized (obj) {
                for (1Xg r0 : (List) obj2.A00) {
                    String str2 = r0.A09;
                    map.remove(str2);
                    map2.remove(str2);
                }
            }
            runnable = new C57843IhM(r6, obj2);
        } else {
            runnable = new C265644Vp(r9, r6, A002, arrayList);
        }
        11Z.A02(runnable);
    }
}
