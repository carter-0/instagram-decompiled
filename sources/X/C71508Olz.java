package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Olz  reason: case insensitive filesystem */
public final class C71508Olz implements C74539PwY {
    public final Map A00;
    public volatile Map A01;

    public final Map BCm() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    HashMap A1E = AnonymousClass7TE.A1E();
                    Iterator A0u = AnonymousClass7TF.A0u(this.A00);
                    while (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        List list = (List) A1J.getValue();
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String str = ((ON7) list.get(i)).A00;
                            if (!TextUtils.isEmpty(str)) {
                                A1A.append(str);
                                if (i != C51966G9m.A06(list)) {
                                    A1A.append(',');
                                }
                            }
                        }
                        String obj = A1A.toString();
                        if (!TextUtils.isEmpty(obj)) {
                            A1E.put(A1J.getKey(), obj);
                        }
                    }
                    this.A01 = Collections.unmodifiableMap(A1E);
                }
            }
        }
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C71508Olz) {
            return this.A00.equals(((C71508Olz) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C71508Olz(Map map) {
        this.A00 = Collections.unmodifiableMap(map);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LazyHeaders{headers=");
        A1A.append(this.A00);
        return C51967G9n.A0r(A1A, '}');
    }
}
