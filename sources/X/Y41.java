package X;

import java.util.Map;

public class Y41 implements Map.Entry, C62650uo {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !0qQ.A0K(entry.getKey(), getKey()) || !0qQ.A0K(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    public final Object getValue() {
        if (this instanceof C22505Y6y) {
            return ((C22505Y6y) this).A00.A02;
        }
        if (this instanceof C22504Y6x) {
            return ((C22504Y6x) this).A00;
        }
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.AbstractMap, X.XDx] */
    public final Object setValue(Object obj) {
        if (this instanceof C22505Y6y) {
            C22505Y6y y6y = (C22505Y6y) this;
            C21086XDz xDz = y6y.A00;
            Object obj2 = xDz.A02;
            C21086XDz xDz2 = new C21086XDz(obj, xDz.A01, xDz.A00);
            y6y.A00 = xDz2;
            y6y.A01.put(y6y.getKey(), xDz2);
            return obj2;
        } else if (this instanceof C22504Y6x) {
            C22504Y6x y6x = (C22504Y6x) this;
            Object value = y6x.getValue();
            y6x.A00 = obj;
            C22439Y3v y3v = y6x.A01;
            Object key = y6x.getKey();
            Y74 y74 = y3v.A00;
            ? r4 = y74.A03;
            if (!r4.containsKey(key)) {
                return value;
            }
            if (y74.hasNext()) {
                Object A02 = y74.A02();
                r4.put(key, obj);
                Y74.A00(A02, y74, r4.A04, C51971G9r.A0E(A02), 0);
            } else {
                r4.put(key, obj);
            }
            y74.A00 = r4.A00;
            return value;
        } else {
            throw Pxh.A0s();
        }
    }

    public Y41(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        int i = 0;
        int A0E = C51971G9r.A0E(getKey());
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return A0E ^ i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(getKey());
        A1A.append('=');
        return AnonymousClass7TF.A0i(getValue(), A1A);
    }
}
