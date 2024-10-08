package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.QwG  reason: case insensitive filesystem */
public final class C8520QwG extends C8513Qw9 {
    public final transient int A00;
    public final transient Object[] A01;
    public final transient C13138TMw A02;

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
        C8518QwE qwE = this.A00;
        if (qwE == null) {
            qwE = new C8514QwA(this);
            this.A00 = qwE;
        }
        return qwE.listIterator(0);
    }

    public C8520QwG(C13138TMw tMw, Object[] objArr, int i) {
        this.A02 = tMw;
        this.A01 = objArr;
        this.A00 = i;
    }
}
