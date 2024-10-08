package X;

import java.util.Map;

/* renamed from: X.TMq  reason: case insensitive filesystem */
public final class C13132TMq implements Map.Entry {
    public Object A00;
    public final Object A01;
    public final /* synthetic */ C367698rQ A02;

    public C13132TMq(C367698rQ r1, Object obj, Object obj2) {
        this.A02 = r1;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.A01.equals(entry.getKey())) {
            return Pxi.A1W(this.A00, entry.getValue());
        }
        return false;
    }

    public final Object getKey() {
        return this.A01;
    }

    public final Object getValue() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    public final Object setValue(Object obj) {
        Object put = this.A02.put(this.A01, obj);
        this.A00 = obj;
        return put;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(getKey());
        A1A.append("=");
        return AnonymousClass7TF.A0i(getValue(), A1A);
    }
}
