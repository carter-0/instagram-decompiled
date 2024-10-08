package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.3El  reason: invalid class name and case insensitive filesystem */
public class C239023El {
    public final String A00;

    public C239023El(String str) {
        this.A00 = str;
    }

    public static C239023El A00(char c) {
        return new C239023El(String.valueOf(c));
    }

    public CharSequence A01(Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public final String A02(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        A03(sb, it);
        return sb.toString();
    }

    public final void A03(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                while (true) {
                    sb.append(A01(it.next()));
                    if (it.hasNext()) {
                        sb.append(this.A00);
                    } else {
                        return;
                    }
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public C239023El() {
        this.A00 = ", ";
    }
}
