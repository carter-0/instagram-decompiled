package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4Y8  reason: invalid class name */
public final class AnonymousClass4Y8 extends AnonymousClass4Y9 {
    public final long A00;
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();

    public final AnonymousClass4Y8 A00(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass4Y8 r1 = (AnonymousClass4Y8) list.get(i2);
            if (r1.A00 == i) {
                return r1;
            }
        }
        return null;
    }

    public final AnonymousClass4YA A01(int i) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass4YA r1 = (AnonymousClass4YA) list.get(i2);
            if (r1.A00 == i) {
                return r1;
            }
        }
        return null;
    }

    public final String toString() {
        return 002.A11(AnonymousClass4Y9.A00(this.A00), " leaves: ", Arrays.toString(this.A02.toArray()), Pxd.A00(298), Arrays.toString(this.A01.toArray()));
    }

    public AnonymousClass4Y8(int i, long j) {
        super(i);
        this.A00 = j;
    }
}
