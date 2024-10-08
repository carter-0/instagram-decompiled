package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.GLd  reason: case insensitive filesystem */
public final class C52262GLd {
    public final Set A00 = DbS.A0y();
    public final Set A01 = DbS.A0y();
    public final Set A02 = DbS.A0y();

    public final void A02(C298835u7 r22, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        List list2 = list;
        boolean A1X = DbW.A1X(list2);
        Set<C270674h7> set = this.A01;
        if (!set.isEmpty()) {
            C298835u7 r3 = r22;
            C52263GLe gLe = new C52263GLe(r3, (Long) null, (Long) null, r3.BaG(), r3.Bnn(), (String) null, r3.Ahj(), list2, (List) null, i, z, z2, z3, z4, z5, z6, z7, A1X);
            for (C270674h7 D3u : set) {
                D3u.D3u(gLe);
            }
        }
    }

    public final void A03(C268654dm r11, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C268654dm r3 = r11;
        0qQ.A0B(r11, 0);
        Set<C270674h7> set = this.A01;
        if (!set.isEmpty()) {
            H3D h3d = new H3D(r3, i, z, z2, z3, z4, z5);
            for (C270674h7 D3r : set) {
                D3r.D3r(h3d);
            }
        }
    }

    public final void A04(Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        Integer num2 = num;
        0qQ.A0B(num, 0);
        Set<C270674h7> set = this.A01;
        if (!set.isEmpty()) {
            C52228GJt gJt = new C52228GJt(num2, z, z2, z3, z4);
            for (C270674h7 D3t : set) {
                D3t.D3t(gJt);
            }
        }
    }

    public final void A00() {
        for (C270674h7 D3s : this.A01) {
            D3s.D3s();
        }
    }

    public final void A01() {
        for (GBE A0G : this.A00) {
            A0G.A0G();
        }
    }
}
