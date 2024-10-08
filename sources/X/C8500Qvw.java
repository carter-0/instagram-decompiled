package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Qvw  reason: case insensitive filesystem */
public final class C8500Qvw extends C8501Qvx {
    public final transient int A00;
    public final transient Object[] A01;
    public final transient C13137TMv A02;

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
        C8499Qvv qvv = this.A00;
        if (qvv == null) {
            qvv = new C8502Qvy(this);
            this.A00 = qvv;
        }
        return qvv.listIterator(0);
    }

    public C8500Qvw(C13137TMv tMv, Object[] objArr, int i) {
        this.A02 = tMv;
        this.A01 = objArr;
        this.A00 = i;
    }
}
