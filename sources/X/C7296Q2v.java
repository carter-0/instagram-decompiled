package X;

import java.util.List;

/* renamed from: X.Q2v  reason: case insensitive filesystem */
public final class C7296Q2v implements C13670Tee {
    public final String A00;

    public static void A00(C307446Qd r2, String str, List list, int i) {
        r2.A0D(new Q43(new C7296Q2v(str)), new R9X(list, i, str));
    }

    public C7296Q2v(String str) {
        this.A00 = str;
    }

    public final boolean Ezc(C276544tV r3) {
        if (r3.A0C() == null || !r3.A0C().equals(this.A00)) {
            return false;
        }
        return true;
    }
}
