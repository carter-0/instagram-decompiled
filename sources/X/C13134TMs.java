package X;

import java.util.Map;

/* renamed from: X.TMs  reason: case insensitive filesystem */
public final class C13134TMs implements Map.Entry, Comparable {
    public Object A00;
    public final Comparable A01;
    public final /* synthetic */ TS4 A02;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.A01;
        Object key = entry.getKey();
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.A00;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public C13134TMs(TS4 ts4, Comparable comparable, Object obj) {
        this.A02 = ts4;
        this.A01 = comparable;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A01.compareTo(((C13134TMs) obj).A01);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final Object getValue() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A01) ^ AnonymousClass7TE.A0L(this.A00);
    }

    public final Object setValue(Object obj) {
        TS4.A03(this.A02);
        Object obj2 = this.A00;
        this.A00 = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A01);
        A1A.append("=");
        return AnonymousClass7TF.A0i(this.A00, A1A);
    }
}
