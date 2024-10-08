package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Htm  reason: case insensitive filesystem */
public final class C56158Htm {
    public final Map A00;

    public final float A00(Object obj) {
        Number A14 = C51966G9m.A14(obj, this.A00);
        if (A14 != null) {
            return A14.floatValue();
        }
        return Float.NaN;
    }

    public final Object A01(float f) {
        Object next;
        Iterator A0u = AnonymousClass7TF.A0u(this.A00);
        if (!A0u.hasNext()) {
            next = null;
        } else {
            next = A0u.next();
            if (A0u.hasNext()) {
                float A002 = AnonymousClass7TE.A00(f, AnonymousClass7TE.A04(((Map.Entry) next).getValue()));
                do {
                    Object next2 = A0u.next();
                    float A003 = AnonymousClass7TE.A00(f, AnonymousClass7TE.A04(((Map.Entry) next2).getValue()));
                    if (Float.compare(A002, A003) > 0) {
                        next = next2;
                        A002 = A003;
                    }
                } while (A0u.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final Object A02(float f, boolean z) {
        Object next;
        float f2;
        float f3;
        Iterator A0u = AnonymousClass7TF.A0u(this.A00);
        if (!A0u.hasNext()) {
            next = null;
        } else {
            next = A0u.next();
            if (A0u.hasNext()) {
                float A04 = AnonymousClass7TE.A04(((Map.Entry) next).getValue());
                if (z) {
                    f2 = A04 - f;
                } else {
                    f2 = f - A04;
                }
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = A0u.next();
                    float A042 = AnonymousClass7TE.A04(((Map.Entry) next2).getValue());
                    if (z) {
                        f3 = A042 - f;
                    } else {
                        f3 = f - A042;
                    }
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (A0u.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56158Htm)) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((C56158Htm) obj).A00);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00);
    }

    public C56158Htm(Map map) {
        this.A00 = map;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MapDraggableAnchors(");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
