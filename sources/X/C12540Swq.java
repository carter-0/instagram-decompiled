package X;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Swq  reason: case insensitive filesystem */
public final class C12540Swq implements C13465Tas {
    public static final C12540Swq A02 = new C12540Swq(Collections.emptyMap());
    public int A00;
    public final Map A01;

    public final C12540Swq A01(C10462Rsd rsd) {
        Map map = this.A01;
        HashMap A19 = Pxe.A19(map);
        List unmodifiableList = Collections.unmodifiableList(AnonymousClass7TE.A1D(rsd.A00));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            A19.remove(unmodifiableList.get(i));
        }
        HashMap A192 = Pxe.A19(rsd.A01);
        Iterator A0s = AnonymousClass7TF.A0s(A192);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Object value = A1J.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                A1J.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        Iterator A0u = AnonymousClass7TF.A0u(Collections.unmodifiableMap(A192));
        while (A0u.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u);
            Object key = A1J2.getKey();
            Object value2 = A1J2.getValue();
            if (value2 instanceof Long) {
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.putLong(AnonymousClass7TE.A0R(value2));
                value2 = allocate.array();
            } else if (value2 instanceof String) {
                value2 = ((String) value2).getBytes(AnonymousClass2RN.A05);
            } else if (!(value2 instanceof byte[])) {
                throw Pxe.A0g();
            }
            A19.put(key, value2);
        }
        if (A00(map, A19)) {
            return this;
        }
        return new C12540Swq(A19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return A00(this.A01, ((C12540Swq) obj).A01);
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            i = 0;
            Iterator A0u = AnonymousClass7TF.A0u(this.A01);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                i += Arrays.hashCode((byte[]) A1J.getValue()) ^ DbT.A13(A1J).hashCode();
            }
            this.A00 = i;
        }
        return i;
    }

    public C12540Swq(Map map) {
        this.A01 = Collections.unmodifiableMap(map);
    }

    public static boolean A00(Map map, Map map2) {
        if (map.size() == map2.size()) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                if (!Arrays.equals((byte[]) A1J.getValue(), (byte[]) map2.get(A1J.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public C12540Swq() {
        this(Collections.emptyMap());
    }
}
