package X;

/* renamed from: X.HwS  reason: case insensitive filesystem */
public abstract class C56315HwS {
    public static final C54667HMy A01(String str) {
        0qQ.A0B(str, 0);
        for (C54667HMy hMy : C54667HMy.values()) {
            if (0qQ.A0K(hMy.A01, str)) {
                return hMy;
            }
        }
        return null;
    }

    public static C54667HMy A00(C246193eB r0) {
        return A01(r0.getId());
    }
}
