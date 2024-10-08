package X;

import java.util.List;

/* renamed from: X.9c2  reason: invalid class name and case insensitive filesystem */
public final class C381609c2 extends AnonymousClass0T0 {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C381609c2) && 0qQ.A0K(this.A00, ((C381609c2) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C381609c2(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SparkleMetadata(pointPositionsAndAlphasList=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
