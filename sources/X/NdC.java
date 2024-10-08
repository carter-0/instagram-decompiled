package X;

import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.friendmap.data.MapText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class NdC extends MYL {
    public String A00 = "";
    public final UserSession A01;
    public final C71144Ody A02;
    public final FriendMapRepository A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final List A05 = AnonymousClass7TE.A1C();
    public final T6B A06;
    public final Comparator A07 = new C73428PcS((Object) this, 8);
    public final boolean A08;

    public final void A0S(String str) {
        0qQ.A0B(str, 0);
        this.A00 = str;
        List list = this.A05;
        if (!list.isEmpty()) {
            if (AnonymousClass7TF.A1Q(str.length())) {
                List list2 = this.A04;
                list2.clear();
                list2.addAll(list);
            } else {
                List list3 = this.A04;
                list3.clear();
                MYK myk = new MYK(str, 36);
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    if (AnonymousClass7TE.A1a(myk.invoke(next))) {
                        A1C.add(next);
                    }
                }
                list3.addAll(A1C);
            }
            A03((N4t) null, this);
        }
    }

    private final PHD A00(N4t n4t, int i) {
        0eP r0;
        float f;
        float f2;
        String str;
        String str2;
        Location A002 = this.A06.A00("FriendMapUpdatesViewModel");
        String str3 = null;
        N4t n4t2 = n4t;
        if (A002 != null) {
            Location location = n4t.A03;
            r0 = AnonymousClass7TE.A1L(Float.valueOf(A002.distanceTo(location)), Float.valueOf((float) (((double) A002.bearingTo(location)) - ((45.0d * 3.141592653589793d) / 180.0d))));
        } else {
            r0 = new 0eP((Object) null, (Object) null);
        }
        Float f3 = (Float) r0.A00;
        Float f4 = (Float) r0.A01;
        if (f3 != null) {
            float floatValue = f3.floatValue();
            if (this.A08) {
                f = 1609.34f;
                f2 = 10.0f;
                str = "mi";
            } else {
                f = 1000.0f;
                f2 = 20.0f;
                str = "km";
            }
            float f5 = floatValue / f;
            Object[] objArr = new Object[1];
            if (f5 > f2) {
                G9w.A1Z(objArr, (int) f5, 0);
                str2 = "%d ";
            } else {
                objArr[0] = Float.valueOf(f5);
                str2 = "%.1f ";
            }
            str3 = 002.A0R(0mp.A06(str2, objArr), str);
        }
        return new PHD(n4t2, f3, f4, str3, i);
    }

    public static final void A03(N4t n4t, NdC ndC) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Comparator comparator;
        int i;
        if (182.A06(0Tu.A05, ndC.A01, 36321769624250079L)) {
            List list = ndC.A04;
            HashSet A1F = AnonymousClass7TE.A1F();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                C51971G9r.A1O(N4t.A01(next), next, A1F, A1C);
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                N4t n4t2 = (N4t) next2;
                if (!n4t2.A0G || (n4t != null && 0qQ.A0K(n4t.A0B, n4t2.A0B))) {
                    A1C3.add(next2);
                } else {
                    A1C2.add(next2);
                }
            }
            arrayList = AnonymousClass7TE.A1C();
            if (AnonymousClass7TE.A1b(A1C2)) {
                arrayList.add(new PHC(new MapText.Res(2131962734, new String[0])));
                ArrayList A0p = AnonymousClass7TF.A0p(A1C2);
                Iterator it2 = A1C2.iterator();
                while (it2.hasNext()) {
                    A0p.add(ndC.A00(C66580MXl.A0f(it2), 0));
                }
                arrayList.addAll(00k.A0g(A0p, ndC.A07));
            }
            if (AnonymousClass7TE.A1b(A1C3)) {
                arrayList.add(new PHC(new MapText.Res(2131962757, new String[0])));
                ArrayList A0p2 = AnonymousClass7TF.A0p(A1C3);
                Iterator it3 = A1C3.iterator();
                while (it3.hasNext()) {
                    A0p2.add(ndC.A00(C66580MXl.A0f(it3), 0));
                }
                comparator = ndC.A07;
                arrayList2 = A0p2;
            }
            ndC.A0R(new C59100J6i(arrayList, 41));
        }
        arrayList = AnonymousClass7TE.A1C();
        List list2 = ndC.A04;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        for (Object next3 : list2) {
            ((List) JTS.A0h(N4t.A01(next3), A1H)).add(next3);
        }
        Collection<List> values = A1H.values();
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        for (List list3 : values) {
            N4t n4t3 = (N4t) 00k.A0J(list3);
            if (n4t3 != null) {
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    i = 0;
                    while (it4.hasNext()) {
                        N4t A0f = C66580MXl.A0f(it4);
                        if (A0f.A0G && A0f.A05 != null && (i = i + 1) < 0) {
                            0sr.A1S();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                } else {
                    i = 0;
                }
                A1C4.add(ndC.A00(n4t3, i));
            }
        }
        List A0g = 00k.A0g(A1C4, ndC.A07);
        comparator = new C73429PcU(35);
        arrayList2 = A0g;
        arrayList.addAll(00k.A0g(arrayList2, comparator));
        ndC.A0R(new C59100J6i(arrayList, 41));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NdC(UserSession userSession, T6B t6b, C71144Ody ody, FriendMapRepository friendMapRepository, boolean z) {
        super(new C68278N8p(0sn.A00, false, false));
        C51974G9v.A1P(userSession, t6b, friendMapRepository, ody);
        this.A01 = userSession;
        this.A06 = t6b;
        this.A03 = friendMapRepository;
        this.A02 = ody;
        this.A08 = z;
        MG8.A01(this, C318116oQ.A00(this), 27);
    }
}
