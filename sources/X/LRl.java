package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class LRl {
    public Set A00 = DbS.A0y();
    public final L72 A01 = new L72();
    public final L55 A02 = new L55();
    public final Set A03 = DbS.A0y();

    public final void A06(List list) {
        Set A0k = 00k.A0k(list);
        Set set = this.A03;
        ArrayList A0r = AnonymousClass7TG.A0r(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C61036Jva.A02(A0r, it);
        }
        Iterator it2 = 00k.A0m(A0k, 00k.A0k(A0r)).iterator();
        while (it2.hasNext()) {
            this.A00.add(new C61036Jva(JTP.A0d(it2), false, true));
        }
    }

    public final void A07(List list) {
        0qQ.A0B(list, 0);
        Set set = this.A03;
        set.clear();
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(new C61036Jva(JTP.A0d(it), true, true));
        }
        set.addAll(A0r);
    }

    public final void A08(List list) {
        0qQ.A0B(list, 0);
        Set A0k = 00k.A0k(list);
        Set set = this.A03;
        ArrayList A0r = AnonymousClass7TG.A0r(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C61036Jva.A02(A0r, it);
        }
        Set A0m = 00k.A0m(A0k, 00k.A0k(A0r));
        this.A00.clear();
        Iterator it2 = A0m.iterator();
        while (it2.hasNext()) {
            this.A00.add(new C61036Jva(JTP.A0d(it2), false, true));
        }
    }

    public static void A01(K6S k6s, LRl lRl) {
        k6s.A09().A03(lRl.A03.size());
    }

    public final ImmutableList A02() {
        return DbU.A0K(this.A03);
    }

    public final ImmutableList A03() {
        return DbU.A0K(this.A00);
    }

    public final void A04() {
        Set<C61036Jva> set = this.A03;
        ArrayList A0r = AnonymousClass7TG.A0r(set);
        for (C61036Jva jva : set) {
            jva.A01 = false;
            A0r.add(C60340gF.A00);
        }
        for (C61036Jva jva2 : set) {
            L72 l72 = this.A01;
            User user = jva2.A02;
            0qQ.A0B(user, 0);
            l72.A02.add(user);
            l72.A00.remove(user);
            l72.A01.remove(user);
            L55 l55 = this.A02;
            C63950LEs lEs = new C63950LEs(user, AnonymousClass05K.A0C);
            Set set2 = l55.A00;
            if (set2.contains(lEs)) {
                set2.remove(lEs);
            } else {
                l55.A01.add(lEs);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.A00);
        this.A00.clear();
        this.A00.addAll(set);
        this.A00.addAll(linkedHashSet);
        set.clear();
    }

    public final void A05(C61036Jva jva, Integer num, boolean z, boolean z2) {
        C63950LEs lEs;
        Set set;
        C61036Jva jva2;
        Set set2;
        C61036Jva jva3;
        Set set3;
        if (z) {
            jva.A01 = true;
            this.A03.add(jva);
            Iterator it = this.A00.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (0qQ.A0K(it.next(), jva)) {
                        jva3 = jva;
                        break;
                    }
                } else {
                    jva3 = null;
                    break;
                }
            }
            0u4.A00(this.A00).remove(jva3);
            L72 l72 = this.A01;
            User user = jva.A02;
            0qQ.A0B(user, 0);
            l72.A02.remove(user);
            if (z2) {
                set3 = l72.A01;
            } else {
                set3 = l72.A00;
            }
            set3.add(user);
            L55 l55 = this.A02;
            lEs = new C63950LEs(user, num);
            set = l55.A01;
            if (!set.contains(lEs)) {
                set2 = l55.A00;
            }
            set.remove(lEs);
            return;
        }
        jva.A01 = false;
        LinkedHashSet A0y = DbS.A0y();
        A0y.add(jva);
        A0y.addAll(this.A00);
        this.A00 = A0y;
        Set set4 = this.A03;
        Iterator it2 = set4.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (0qQ.A0K(it2.next(), jva)) {
                    jva2 = jva;
                    break;
                }
            } else {
                jva2 = null;
                break;
            }
        }
        0u4.A00(set4).remove(jva2);
        L72 l722 = this.A01;
        User user2 = jva.A02;
        0qQ.A0B(user2, 0);
        l722.A02.add(user2);
        l722.A00.remove(user2);
        l722.A01.remove(user2);
        L55 l552 = this.A02;
        lEs = new C63950LEs(user2, num);
        set = l552.A00;
        if (!set.contains(lEs)) {
            set2 = l552.A01;
        }
        set.remove(lEs);
        return;
        set2.add(lEs);
    }

    public static void A00(K6S k6s, LRl lRl) {
        k6s.A09().A05(lRl.A02(), lRl.A03());
        k6s.A09().A02();
    }
}
