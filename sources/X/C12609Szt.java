package X;

import java.util.Map;

/* renamed from: X.Szt  reason: case insensitive filesystem */
public final class C12609Szt implements 1UV {
    public final int A00;

    public C12609Szt(int i) {
        this.A00 = i;
    }

    public final boolean apply(Object obj) {
        switch (this.A00) {
            case 0:
                if (obj != null) {
                    return true;
                }
                return false;
            case 1:
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
