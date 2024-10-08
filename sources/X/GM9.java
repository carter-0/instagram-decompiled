package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class GM9 {
    public int A00;
    public long A01;
    public final UserSession A02;
    public final 0xa A03;
    public final List A04;
    public final Set A05 = C51972G9s.A0u();
    public final C61410nE A06;
    public final C3728893a A07;
    public final Set A08 = C51972G9s.A0u();

    public GM9(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        0xa A0n = C51969G9p.A0n(1Al.A01(userSession), 1An.A2h, this);
        this.A03 = A0n;
        List synchronizedList = Collections.synchronizedList(AnonymousClass7TE.A1C());
        0qQ.A07(synchronizedList);
        this.A04 = synchronizedList;
        this.A01 = -1;
        this.A06 = C61410nE.A00;
        this.A07 = AnonymousClass93Z.A01(userSession);
        this.A00 = -1;
        if (A0n.getString("latest_headload_items", (String) null) != null) {
            try {
                AnonymousClass40R r5 = C250863mB.A03.A02;
                0Yh A0z = DbS.A0z(C52324GNr.class);
                r5.A00.get(A0z);
                C360608er.A01(A0z);
                throw AnonymousClass00P.createAndThrow();
            } catch (Exception e) {
                0KC.A0F("ClipsViewerCacheStateManager", "Failed to decode ClipsItemCacheData", e);
            }
        }
        Set stringSet = this.A03.getStringSet("latest_headload_ids", (Set) null);
        if (stringSet != null) {
            this.A05.addAll(stringSet);
            this.A08.addAll(stringSet);
        }
        if (1KU.A05(this.A02) || 1KU.A04(this.A02)) {
            this.A01 = this.A03.getLong("latest_headload_timestamp", -1);
            this.A00 = this.A03.getInt("cached_ad_previous_page_size", -1);
        }
    }

    public final List A00(String str, List list, int i, boolean z) {
        String str2;
        1Xj r0;
        UserSession userSession = this.A02;
        GM9 A002 = C52166GHi.A00(userSession);
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        if (i == -1 || i >= A1D.size()) {
            return list;
        }
        int i2 = i + 1;
        ArrayList A0U = 00k.A0U(A1D.subList(i2, A1D.size()));
        0Tu r8 = 0Tu.A05;
        if (!182.A06(r8, userSession, 36325918562989440L) && !C51969G9p.A1W(r8, userSession)) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A0U.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C267324bN r02 = (C267324bN) next;
                0qQ.A0B(r02, 0);
                if (A002.A05.contains(r02.getId())) {
                    A1C.add(next);
                }
            }
            if (z && AnonymousClass7TE.A1b(A1C)) {
                A1D.removeAll(A0U);
                return A1D;
            }
        } else if (str != null && str.equals(((C267324bN) list.get(i)).getId()) && i <= 0) {
            List A0v = C51969G9p.A0v(list, i2);
            1Ua A0j = C51971G9r.A0j(userSession);
            0qQ.A07(A0j);
            AnonymousClass2fL A003 = AnonymousClass2fL.A00(userSession);
            Iterator it2 = A0v.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C267324bN r5 = (C267324bN) it2.next();
                1Xj r03 = r5.A02;
                String str3 = null;
                if (r03 != null) {
                    str2 = r03.getId();
                } else {
                    str2 = null;
                }
                if (!A0j.A03(str2) && ((r0 = r5.A02) == null || !r0.A5z())) {
                    1Xj r04 = r5.A02;
                    if (r04 != null) {
                        str3 = r04.A2n();
                    }
                    if (A003.A0P(String.valueOf(str3))) {
                        break;
                    }
                } else {
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    Iterator it3 = A0U.iterator();
                }
            }
            ArrayList A1C22 = AnonymousClass7TE.A1C();
            Iterator it32 = A0U.iterator();
            while (it32.hasNext()) {
                Object next2 = it32.next();
                if (((C267324bN) next2).A01 != C295365o2.GHOST) {
                    A1C22.add(next2);
                }
            }
            A1D.removeAll(A1C22);
        }
        return A1D;
    }

    public final void A01(int i, boolean z, List list) {
        0xa r2;
        0xY AR4;
        Long l;
        Set set = this.A05;
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0p.add(((C267324bN) it.next()).getId());
        }
        set.addAll(A0p);
        Set set2 = this.A08;
        ArrayList A0p2 = AnonymousClass7TF.A0p(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            A0p2.add(((C267324bN) it2.next()).getId());
        }
        set2.addAll(A0p2);
        List list2 = this.A04;
        ArrayList A0p3 = AnonymousClass7TF.A0p(list);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C267324bN r5 = (C267324bN) it3.next();
            String id = r5.getId();
            1Xj r0 = r5.A02;
            Integer num = null;
            if (r0 != null) {
                l = Long.valueOf(r0.A19());
            } else {
                l = null;
            }
            1Xj r02 = r5.A02;
            if (r02 != null) {
                num = r02.CEl();
            }
            A0p3.add(new C52324GNr(num, l, id));
        }
        list2.addAll(A0p3);
        if (i != -1) {
            this.A00 = i;
            r2 = this.A03;
            AR4 = r2.AR4();
            AR4.E5h("latest_headload_ids", 00k.A0k(set));
            AR4.E5Z("cached_ad_previous_page_size", i);
        } else {
            r2 = this.A03;
            AR4 = r2.AR4();
            AR4.E5h("latest_headload_ids", 00k.A0k(set));
        }
        AR4.apply();
        if (!z) {
            try {
                r2.AR4();
                AnonymousClass40R r22 = C250863mB.A03.A02;
                0Yh A0z = DbS.A0z(C52324GNr.class);
                r22.A00.get(A0z);
                C360608er.A01(A0z);
                throw AnonymousClass00P.createAndThrow();
            } catch (Exception e) {
                0KC.A0F("ClipsViewerCacheStateManager", "Failed to encode ClipsItemCacheData", e);
            }
        }
        C3728893a r4 = this.A07;
        if (r4 != null) {
            List A0a = 00k.A0a(set);
            int i2 = this.A00;
            if (!r4.A00) {
                C3728893a.A02(r4);
                0XK r8 = new 0XK();
                r8.A00("cache_list_id", A0a.toString(), 4);
                r8.A00("previous_page_size", String.valueOf(i), 2);
                r8.A00("cached_ad_previous_page_size", String.valueOf(i2), 2);
                C3728893a.A00(r4).markerPoint(976032351, 0, 7, "cache_list_update", r8, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
            }
        }
    }
}
