package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Quw  reason: case insensitive filesystem */
public final class C8451Quw extends C8443Quo {
    public final /* synthetic */ C8449Quu A00;

    public C8451Quw(C8449Quu quu) {
        this.A00 = quu;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.A00.get(entry.getKey());
        if (obj2 != null) {
            return Pxi.A1W(obj2, entry.getValue());
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (Object A0E : this.A00.entrySet()) {
            i += C51971G9r.A0E(A0E);
        }
        return i;
    }

    public final int size() {
        return this.A00.size();
    }

    public final /* synthetic */ Iterator iterator() {
        return A08().listIterator(0);
    }

    public C8451Quw() {
    }
}
