package X;

import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.49H  reason: invalid class name */
public final class AnonymousClass49H {
    public static final AtomicInteger A07 = new AtomicInteger();
    public 1OC A00;
    public 1GP A01;
    public AnonymousClass3BU A02;
    public final int A03 = A07.incrementAndGet();
    public final String A04;
    public final Collection A05;
    public final UUID A06;

    public AnonymousClass49H(AnonymousClass3BU r2, String str, Collection collection) {
        UUID randomUUID = UUID.randomUUID();
        0qQ.A07(randomUUID);
        this.A06 = randomUUID;
        this.A04 = str;
        this.A05 = Collections.unmodifiableCollection(collection);
        this.A02 = r2;
    }

    public AnonymousClass49H() {
        UUID randomUUID = UUID.randomUUID();
        0qQ.A07(randomUUID);
        this.A06 = randomUUID;
        this.A04 = "";
        this.A05 = 0sn.A00;
    }
}
