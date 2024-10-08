package X;

import java.util.Map;
import java.util.Set;

public abstract class SyO implements C13482Tb9 {
    public transient Map A00;
    public transient Set A01;

    public static Map A00(SyO syO) {
        Map map = syO.A00;
        if (map != null) {
            return map;
        }
        C8528QwS qwS = (C8528QwS) syO;
        TS3 ts3 = new TS3(qwS, qwS.A01);
        syO.A00 = ts3;
        return ts3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13482Tb9)) {
            return false;
        }
        return A00(this).equals(A00((SyO) ((C13482Tb9) obj)));
    }

    public final int hashCode() {
        return A00(this).hashCode();
    }

    public final String toString() {
        return ((TS3) A00(this)).A02.toString();
    }
}
