package X;

import java.util.Arrays;

/* renamed from: X.HaF  reason: case insensitive filesystem */
public abstract class C54982HaF {
    public static final int A00(1Xj r1) {
        0qQ.A0B(r1, 0);
        C65231bS B8b = r1.A0C.B8b();
        if (B8b == null) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return Arrays.hashCode(new Object[]{B8b.getContextualTitleStr(), B8b.getProgressStr()});
    }
}
