package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Qwb  reason: case insensitive filesystem */
public final class C8537Qwb extends C8538Qwc {
    public final transient int A00;
    public final transient Object[] A01;
    public final transient C13139TMx A02;

    public final int size() {
        return this.A00;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value != null) {
            return Pxi.A1W(value, this.A02.get(key));
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        C8535QwZ qwZ = this.A00;
        if (qwZ == null) {
            qwZ = new C8533QwX(this);
            this.A00 = qwZ;
        }
        return qwZ.listIterator(0);
    }

    public C8537Qwb(C13139TMx tMx, Object[] objArr, int i) {
        this.A02 = tMx;
        this.A01 = objArr;
        this.A00 = i;
    }
}
