package X;

import java.util.Map;

/* renamed from: X.PcZ  reason: case insensitive filesystem */
public final class C73434PcZ implements Map.Entry, AnonymousClass0s3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Object[] A01;
    public final /* synthetic */ String[] A02;

    public C73434PcZ(Object[] objArr, String[] strArr, int i) {
        this.A02 = strArr;
        this.A00 = i;
        this.A01 = objArr;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02[this.A00];
    }

    public final Object getValue() {
        return this.A01[this.A00];
    }

    public final Object setValue(Object obj) {
        throw AnonymousClass7TE.A1B("Can't set a value while iterating over a ReadableNativeMap");
    }
}
