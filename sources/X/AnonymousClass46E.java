package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.46E  reason: invalid class name */
public final class AnonymousClass46E {
    public static final Map A04 = new HashMap();
    public final byte A00;
    public final String A01;
    public final Map A02;
    public final short A03;

    public AnonymousClass46E(String str, byte b, short s) {
        Map map = A04;
        this.A01 = str;
        this.A00 = b;
        this.A03 = s;
        this.A02 = map;
    }

    public final String toString() {
        return String.format("<TField name:'%s' type:%d field-id:%d metadata='%s'>", new Object[]{this.A01, Byte.valueOf(this.A00), Short.valueOf(this.A03), this.A02});
    }

    public AnonymousClass46E() {
        this("", (byte) 0, 0);
    }
}
