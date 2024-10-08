package X;

import java.util.Map;

/* renamed from: X.Jww  reason: case insensitive filesystem */
public final class C61085Jww extends AnonymousClass0T0 implements MTN {
    public final long A00;
    public final C62676Kkc A01;
    public final Map A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61085Jww) {
                C61085Jww jww = (C61085Jww) obj;
                if (!(this.A01 == jww.A01 && this.A00 == jww.A00 && 0qQ.A0K(this.A02, jww.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C66374MPg CAH() {
        return this.A01;
    }

    public final Map getMetadata() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, C51972G9s.A07(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public C61085Jww(C62676Kkc kkc, Map map, long j) {
        AnonymousClass7TG.A1P(kkc, map);
        this.A01 = kkc;
        this.A00 = j;
        this.A02 = map;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EngagementEvent(type=");
        A1A.append(this.A01);
        A1A.append(", timestamp=");
        A1A.append(this.A00);
        A1A.append(", metadata=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
