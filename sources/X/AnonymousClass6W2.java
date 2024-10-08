package X;

import java.util.UUID;

/* renamed from: X.6W2  reason: invalid class name */
public final class AnonymousClass6W2 {
    public String A00;
    public String A01;
    public final C62320sa A02;

    public final void A01() {
        String str = this.A01;
        if (str != null && str.length() != 0) {
            this.A02.invoke();
            this.A01 = null;
        }
    }

    public final void A02() {
        String str = this.A00;
        if (!(str == null || str.length() == 0)) {
            A00();
        }
        this.A00 = UUID.randomUUID().toString();
        A03();
    }

    public final void A03() {
        String str = this.A01;
        if (!(str == null || str.length() == 0)) {
            A01();
        }
        this.A01 = UUID.randomUUID().toString();
    }

    public AnonymousClass6W2(C62320sa r1) {
        this.A02 = r1;
    }

    public final void A00() {
        A01();
        this.A00 = null;
    }
}
