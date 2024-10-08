package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.A9o  reason: case insensitive filesystem */
public final class C39793A9o {
    public final AtomicInteger A00;
    public final AtomicInteger A01;
    public final AtomicLong A02;
    public final AtomicLong A03;

    public /* synthetic */ C39793A9o() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicInteger atomicInteger2 = new AtomicInteger(0);
        AtomicLong atomicLong = new AtomicLong(0);
        AtomicLong atomicLong2 = new AtomicLong(0);
        this.A01 = atomicInteger;
        this.A00 = atomicInteger2;
        this.A03 = atomicLong;
        this.A02 = atomicLong2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39793A9o) {
                C39793A9o a9o = (C39793A9o) obj;
                if (!"generate_message_list_view_models".equals("generate_message_list_view_models") || !0qQ.A0K(this.A01, a9o.A01) || !0qQ.A0K(this.A00, a9o.A00) || !0qQ.A0K(this.A03, a9o.A03) || !0qQ.A0K(this.A02, a9o.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, 1002714075))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FOAMessagingMarkerPointConfig(markerPointName=");
        A1A.append("generate_message_list_view_models");
        A1A.append(", limit=");
        A1A.append(10);
        A1A.append(", startCounter=");
        A1A.append(this.A01);
        A1A.append(", endCounter=");
        A1A.append(this.A00);
        A1A.append(", startTimestamp=");
        A1A.append(this.A03);
        A1A.append(", endTimestamp=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
