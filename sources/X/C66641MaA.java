package X;

import java.util.List;

/* renamed from: X.MaA  reason: case insensitive filesystem */
public abstract class C66641MaA {
    public static final boolean A00(2Er r3) {
        if (r3.CUG()) {
            return false;
        }
        List BRZ = r3.BRZ();
        0qQ.A0B(BRZ, 0);
        if (BRZ.size() != 1) {
            return false;
        }
        if (((AnonymousClass17F) BRZ.get(0)).CXO() || ((AnonymousClass17G) BRZ.get(0)).CPV()) {
            return true;
        }
        return false;
    }
}
