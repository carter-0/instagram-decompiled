package X;

import java.util.ConcurrentModificationException;
import java.util.Map;

public final class Y42 implements Map.Entry, AnonymousClass0s3 {
    public Object A00;
    public final Object A01;
    public final /* synthetic */ XGM A02;

    public Y42(XGM xgm) {
        this.A02 = xgm;
        Map.Entry entry = xgm.A01;
        0qQ.A0A(entry);
        this.A01 = entry.getKey();
        Map.Entry entry2 = xgm.A01;
        0qQ.A0A(entry2);
        this.A00 = entry2.getValue();
    }

    public final Object setValue(Object obj) {
        XGM xgm = this.A02;
        Y43 y43 = xgm.A03;
        if (y43.A00().A00 == xgm.A00) {
            Object value = getValue();
            y43.put(getKey(), obj);
            this.A00 = obj;
            return value;
        }
        throw new ConcurrentModificationException();
    }

    public final Object getKey() {
        return this.A01;
    }

    public final Object getValue() {
        return this.A00;
    }
}
