package X;

import java.util.Map;

/* renamed from: X.6Ki  reason: invalid class name and case insensitive filesystem */
public final class C305986Ki implements Map.Entry, AnonymousClass0s3 {
    public Object A00;
    public String A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final Object getValue() {
        return this.A00;
    }

    public final Object setValue(Object obj) {
        Object value = getValue();
        this.A00 = obj;
        return value;
    }
}
