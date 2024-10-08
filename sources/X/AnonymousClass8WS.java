package X;

import java.util.Arrays;

/* renamed from: X.8WS  reason: invalid class name */
public final class AnonymousClass8WS implements 2YM {
    public final AnonymousClass8WQ[] A00;

    public AnonymousClass8WS(AnonymousClass8WQ... r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final 2YL create(Class cls, AnonymousClass2YQ r8) {
        0qQ.A0B(cls, 0);
        0qQ.A0B(r8, 1);
        0Yh r5 = new 0Yh(cls);
        AnonymousClass8WQ[] r1 = this.A00;
        AnonymousClass8WQ[] r4 = (AnonymousClass8WQ[]) Arrays.copyOf(r1, r1.length);
        0qQ.A0B(r4, 2);
        int length = r4.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AnonymousClass8WQ r12 = r4[i];
            if (0qQ.A0K(r12.A01, r5)) {
                2YL r0 = (2YL) r12.A00.invoke(r8);
                if (r0 != null) {
                    return r0;
                }
            } else {
                i++;
            }
        }
        throw new IllegalArgumentException(002.A0R("No initializer set for given class ", 0q1.A00(r5.A00)));
    }

    public final /* synthetic */ 2YL create(Class cls) {
        throw new UnsupportedOperationException(AnonymousClass000.A00(64));
    }
}
