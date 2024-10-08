package X;

import java.util.Map;

/* renamed from: X.Jwx  reason: case insensitive filesystem */
public final class C61086Jwx extends AnonymousClass0T0 implements MTN {
    public final C391639tP A00;
    public final Map A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61086Jwx) {
                C61086Jwx jwx = (C61086Jwx) obj;
                if (!(this.A00 == jwx.A00 && this.A02 == jwx.A02 && 0qQ.A0K(this.A01, jwx.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C66374MPg CAH() {
        return this.A00;
    }

    public final Map getMetadata() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, C51972G9s.A07(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }

    public C61086Jwx(C391639tP r1, Map map, long j) {
        AnonymousClass7TG.A1P(r1, map);
        this.A00 = r1;
        this.A02 = j;
        this.A01 = map;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LifeCycleEvent(type=");
        A1A.append(this.A00);
        A1A.append(", timestamp=");
        A1A.append(this.A02);
        A1A.append(", metadata=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
