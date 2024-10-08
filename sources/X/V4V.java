package X;

import java.util.Arrays;
import java.util.List;

public final class V4V {
    public String A00;
    public String A01;
    public List A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof V4V)) {
            return false;
        }
        V4V v4v = (V4V) obj;
        int i = 0;
        while (true) {
            List list = this.A02;
            if (i < list.size()) {
                if (!v4v.A02.get(i).equals(list.get(i))) {
                    return false;
                }
                i++;
            } else if (v4v.A02.size() != list.size() || !v4v.A01.equals(this.A01)) {
                return false;
            } else {
                String str = v4v.A00;
                String str2 = this.A00;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 == null) {
                    return true;
                } else {
                    return false;
                }
                return true;
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(Pxf.A1Y(this.A01, this.A00, this.A02.hashCode()));
    }
}
