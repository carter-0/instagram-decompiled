package X;

import java.util.Map;

/* renamed from: X.TMp  reason: case insensitive filesystem */
public abstract class C13131TMp implements Map.Entry {
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C9718Rfb.A00(getKey(), entry.getKey()) || !C9718Rfb.A00(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public final Object getKey() {
        if (this instanceof C8527QwR) {
            return ((C8527QwR) this).A00;
        }
        return ((C8526QwQ) this).A01;
    }

    public final Object getValue() {
        if (this instanceof C8527QwR) {
            return ((C8527QwR) this).A01;
        }
        C8526QwQ qwQ = (C8526QwQ) this;
        TS6 ts6 = qwQ.A02;
        Map A02 = ts6.A02();
        if (A02 != null) {
            return A02.get(qwQ.A01);
        }
        C8526QwQ.A00(qwQ);
        int i = qwQ.A00;
        if (i == -1) {
            return null;
        }
        Object[] objArr = ts6.A05;
        objArr.getClass();
        return objArr[i];
    }

    public final Object setValue(Object obj) {
        if (this instanceof C8527QwR) {
            throw C66580MXl.A11();
        }
        C8526QwQ qwQ = (C8526QwQ) this;
        TS6 ts6 = qwQ.A02;
        Map A02 = ts6.A02();
        if (A02 != null) {
            return A02.put(qwQ.A01, obj);
        }
        C8526QwQ.A00(qwQ);
        int i = qwQ.A00;
        if (i == -1) {
            ts6.put(qwQ.A01, obj);
            return null;
        }
        Object[] objArr = ts6.A05;
        objArr.getClass();
        Object obj2 = objArr[i];
        int i2 = qwQ.A00;
        Object[] objArr2 = ts6.A05;
        objArr2.getClass();
        objArr2[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(getKey()) ^ AnonymousClass7TE.A0L(getValue());
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder A15 = Pxe.A15(Pxf.A09(valueOf) + 1, Pxf.A09(valueOf2));
        A15.append(valueOf);
        return Pxg.A0s("=", valueOf2, A15);
    }
}
