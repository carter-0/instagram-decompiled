package X;

import java.util.AbstractMap;
import java.util.Comparator;

/* renamed from: X.Qup  reason: case insensitive filesystem */
public final class C8444Qup extends C8448Qut {
    public final /* synthetic */ C8451Quw A00;

    public C8444Qup(C8451Quw quw) {
        this.A00 = quw;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C8449Quu quu = this.A00.A00;
        Comparator comparator = C8449Quu.A03;
        return new AbstractMap.SimpleImmutableEntry(quu.A01.A01.get(i), quu.A00.get(i));
    }

    public final int size() {
        return this.A00.A00.size();
    }
}
