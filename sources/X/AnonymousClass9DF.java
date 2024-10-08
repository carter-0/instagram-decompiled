package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9DF  reason: invalid class name */
public abstract class AnonymousClass9DF extends AnonymousClass9DG {
    public final AtomicInteger A00 = new AtomicInteger();
    public volatile AnonymousClass3JY A01;

    public final AnonymousClass9DN A01() {
        AnonymousClass9DM r0;
        if (!(this instanceof AnonymousClass9DE)) {
            return ((C381049b5) this).A04;
        }
        synchronized (AnonymousClass9DM.class) {
            if (AnonymousClass9DM.A01 == null) {
                AnonymousClass9DM.A01 = new AnonymousClass9DM();
            }
            r0 = AnonymousClass9DM.A01;
        }
        return r0;
    }

    public final AnonymousClass9DJ A02() {
        if (this instanceof AnonymousClass9DE) {
            AnonymousClass9DE r2 = (AnonymousClass9DE) this;
            AnonymousClass9DJ r3 = r2.A02;
            if (r3 != null) {
                return r3;
            }
            AnonymousClass9DJ r32 = new AnonymousClass9DJ(r2.A00, r2.A04);
            r2.A02 = r32;
            return r32;
        }
        C381049b5 r22 = (C381049b5) this;
        AnonymousClass9DJ r33 = r22.A02;
        if (r33 != null) {
            return r33;
        }
        AnonymousClass9DJ r34 = new AnonymousClass9DJ(r22.A00, r22.A03());
        r22.A02 = r34;
        return r34;
    }

    public final String A03() {
        if (this instanceof AnonymousClass9DE) {
            return ((AnonymousClass9DE) this).A04;
        }
        C381049b5 r1 = (C381049b5) this;
        String str = r1.A05;
        if (str == null) {
            return ((AnonymousClass3JZ) r1.A01).A01;
        }
        return str;
    }
}
