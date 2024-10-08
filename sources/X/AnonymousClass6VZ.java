package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6VZ  reason: invalid class name */
public final class AnonymousClass6VZ implements AnonymousClass2wO {
    public final AnonymousClass2vH A00;
    public final AnonymousClass2wO A01;

    public final /* bridge */ /* synthetic */ void AWG(C54608HKr hKr, 1PW r3, Object obj) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(hKr, 1);
        0qQ.A0B(r3, 2);
        this.A01.AWG(hKr, r3, obj);
    }

    public final C271864ji E4e(String str, Collection collection, Map map, boolean z) {
        String str2;
        Collection collection2 = collection;
        0qQ.A0B(collection2, 1);
        Map map2 = map;
        0qQ.A0B(map2, 2);
        String str3 = str;
        0qQ.A0B(str3, 3);
        C271864ji E4e = this.A01.E4e(str3, collection2, map2, z);
        Collection<C250973mM> collection3 = E4e.A00;
        0qQ.A06(collection3);
        ArrayList arrayList = new ArrayList();
        for (C250973mM r0 : collection3) {
            C239613Hd r02 = r0.A0H.A0X;
            if (!(r02 == null || (str2 = r02.A02) == null)) {
                arrayList.add(str2);
            }
        }
        Set A0k = 00k.A0k(arrayList);
        ArrayList arrayList2 = new ArrayList(E4e.A01);
        ArrayList arrayList3 = new ArrayList(collection3);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C250973mM r9 = (C250973mM) it.next();
            C239613Hd r03 = r9.A0H.A0X;
            if (r03 != null && A0k.contains(r03.A02)) {
                AnonymousClass2vH r6 = this.A00;
                ArrayList arrayList4 = new ArrayList();
                List singletonList = Collections.singletonList("ad_from_ad_pod_is_invalidated");
                0qQ.A07(singletonList);
                r6.Cgw(new 1PW(AnonymousClass05K.A00), (Long) null, r9, "ad_from_ad_pod_is_invalidated", (String) null, (String) null, (String) null, arrayList4, singletonList, (Map) null, (Map) null, false);
                it.remove();
                arrayList3.add(r9);
            }
        }
        return new C271864ji(arrayList2, arrayList3);
    }

    public AnonymousClass6VZ(UserSession userSession, C228812mN r9, C233402vf r10, AnonymousClass2vH r11, C249863kU r12, 1PJ r13) {
        C271844jg r0 = new C271844jg(userSession, r9, r10, r11, r12, r13);
        this.A00 = r11;
        this.A01 = r0;
    }
}
