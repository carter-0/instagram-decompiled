package X;

import java.util.Map;

/* renamed from: X.Jwy  reason: case insensitive filesystem */
public final class C61087Jwy extends AnonymousClass0T0 implements MTN {
    public final C69509Nmr A00;
    public final Map A01;
    public final long A02;

    public C61087Jwy(C69509Nmr nmr, Map map, long j) {
        0qQ.A0B(nmr, 1);
        this.A00 = nmr;
        this.A02 = j;
        this.A01 = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61087Jwy) {
                C61087Jwy jwy = (C61087Jwy) obj;
                if (!(this.A00 == jwy.A00 && this.A02 == jwy.A02 && 0qQ.A0K(this.A01, jwy.A01))) {
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

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ModelEngagementEvent(type=");
        A1A.append(this.A00);
        A1A.append(", timestamp=");
        A1A.append(this.A02);
        A1A.append(", metadata=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
