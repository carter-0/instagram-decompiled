package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7sY  reason: invalid class name and case insensitive filesystem */
public final class C344867sY {
    public final AtomicBoolean A00 = new AtomicBoolean();
    public final C344887sa[] A01 = new C344887sa[C344877sZ.values().length];
    public final boolean[] A02 = new boolean[C344877sZ.values().length];

    public static void A00(C344867sY r6) {
        for (C344877sZ ordinal : C344877sZ.values()) {
            int ordinal2 = ordinal.ordinal();
            C344887sa[] r1 = r6.A01;
            if (r1[ordinal2] != null && r6.A00.get() && r6.A02[ordinal2]) {
                r1[ordinal2].ARH();
            }
        }
    }
}
