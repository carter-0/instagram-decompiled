package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Qwv  reason: case insensitive filesystem */
public final class C8557Qwv extends C8554Qws {
    public final transient int A00;
    public final transient C13140TMy A01;
    public final transient Object[] A02;

    public final boolean A07() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int size() {
        return this.A00;
    }

    public final C8553Qwr A0A() {
        return new C8555Qwt(this);
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value != null) {
            return Pxi.A1W(value, this.A01.get(key));
        }
        return false;
    }

    public C8557Qwv(C13140TMy tMy, Object[] objArr, int i) {
        this.A01 = tMy;
        this.A02 = objArr;
        this.A00 = i;
    }

    public final int A08(Object[] objArr, int i) {
        return A09().A08(objArr, 0);
    }

    public final /* synthetic */ Iterator iterator() {
        return A09().listIterator(0);
    }
}
