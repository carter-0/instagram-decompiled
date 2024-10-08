package X;

import java.io.Serializable;

public final class T9W implements Serializable {
    public int A00 = -1;
    public String A01;
    public String A02;
    public transient Object A03;

    public final String toString() {
        Class<?> cls;
        char c;
        String str = this.A01;
        if (str != null) {
            return str;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Object obj = this.A03;
        if (obj != null) {
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
            }
            int i = 0;
            while (cls.isArray()) {
                cls = cls.getComponentType();
                i++;
            }
            String name = cls.getName();
            while (true) {
                A1A.append(name);
                i--;
                if (i < 0) {
                    break;
                }
                name = "[]";
            }
        } else {
            A1A.append("UNKNOWN");
        }
        A1A.append('[');
        String str2 = this.A02;
        if (str2 != null) {
            c = '\"';
            A1A.append('\"');
            A1A.append(str2);
        } else {
            int i2 = this.A00;
            if (i2 >= 0) {
                A1A.append(i2);
                String A0w = Pxg.A0w(A1A);
                this.A01 = A0w;
                return A0w;
            }
            c = '?';
        }
        A1A.append(c);
        String A0w2 = Pxg.A0w(A1A);
        this.A01 = A0w2;
        return A0w2;
    }
}
