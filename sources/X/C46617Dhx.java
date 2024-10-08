package X;

import java.util.List;

/* renamed from: X.Dhx  reason: case insensitive filesystem */
public abstract class C46617Dhx {
    public static C276544tV A00(C276544tV r5) {
        int i = r5.A04;
        if (i != 13690) {
            if (i == 13785) {
                List<C276544tV> list = (List) C276544tV.A00(r5, 40);
                if (list != null && !list.isEmpty()) {
                    for (C276544tV r1 : list) {
                        if (r1 != null && r1.A04 == 13890) {
                            return r1;
                        }
                    }
                }
            } else {
                1Kn.A02("BloksScreenNavbarUtils", "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2");
            }
        }
        return null;
    }
}
