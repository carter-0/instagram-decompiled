package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5o6  reason: invalid class name and case insensitive filesystem */
public final class C295405o6 {
    public final Map A00;
    public final AnonymousClass0eM A01;
    public final 0wc A02;
    public final String A03;

    public final void A00(C295415o7 r9, Integer num, List list) {
        Set set;
        long j;
        Long A0n;
        if (((Boolean) this.A01.getValue()).booleanValue()) {
            0wc r2 = this.A02;
            0Aj A002 = r2.A00(r2.A00, "ig_client_cache_remove_media");
            ArrayList<1Xj> arrayList = new ArrayList<>();
            for (Object next : list) {
                1Xj r5 = (1Xj) next;
                Iterable iterable = (Iterable) this.A00.get(r9);
                if (iterable == null || !00k.A0u(iterable, r5.A30())) {
                    arrayList.add(next);
                }
            }
            arrayList.size();
            if (!arrayList.isEmpty() && A002.isSampled()) {
                A002.AAJ("cache_type", r9.A00);
                A002.AAJ("viewer_session_id", this.A03);
                ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
                for (1Xj A30 : arrayList) {
                    0bb r22 = new 0bb();
                    String A302 = A30.A30();
                    if (A302 == null || (A0n = 00y.A0n(10, A302)) == null) {
                        j = -1;
                    } else {
                        j = A0n.longValue();
                    }
                    r22.A05("ig_media_id", Long.valueOf(j));
                    arrayList2.add(r22);
                }
                A002.AAe("medias", arrayList2);
                A002.AAJ("reason", "SEEN");
                A002.Cgf();
                if (num == AnonymousClass05K.A00 && (set = (Set) this.A00.get(r9)) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (1Xj A303 : arrayList) {
                        String A304 = A303.A30();
                        if (A304 != null) {
                            arrayList3.add(A304);
                        }
                    }
                    set.addAll(arrayList3);
                }
            }
        }
    }

    public final void A01(C295415o7 r8, List list) {
        long j;
        Long A0n;
        if (((Boolean) this.A01.getValue()).booleanValue()) {
            0wc r2 = this.A02;
            0Aj A002 = r2.A00(r2.A00, "ig_client_cache_add_media");
            if (A002.isSampled()) {
                A002.AAJ("cache_type", r8.A00);
                A002.AAJ("viewer_session_id", this.A03);
                ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    0bb r22 = new 0bb();
                    String A30 = ((1Xj) it.next()).A30();
                    if (A30 == null || (A0n = 00y.A0n(10, A30)) == null) {
                        j = -1;
                    } else {
                        j = A0n.longValue();
                    }
                    r22.A05("ig_media_id", Long.valueOf(j));
                    arrayList.add(r22);
                }
                A002.AAe("medias", arrayList);
                A002.Cgf();
            }
        }
    }

    public C295405o6(UserSession userSession) {
        this.A02 = AnonymousClass0kN.A02(userSession);
        this.A03 = AnonymousClass93S.A00(userSession).A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C295415o7.FLASH_CACHE, new LinkedHashSet());
        linkedHashMap.put(C295415o7.PREFETCH_CACHE, new LinkedHashSet());
        this.A00 = linkedHashMap;
        this.A01 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LH(userSession, 10));
    }
}
