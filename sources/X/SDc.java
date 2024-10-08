package X;

import com.instagram.android.R;
import java.util.Map;

public final class SDc {
    public final Map A00;

    public static int A00(SDc sDc, Class cls) {
        Number number;
        int intValue;
        AnonymousClass34S r0 = (AnonymousClass34S) sDc.A00.get(cls);
        if (r0 == null || (number = (Number) r0.A00) == null || (intValue = number.intValue()) == 0) {
            return R.style.FbPayAuthIG4A;
        }
        return intValue;
    }

    public SDc(Map map) {
        this.A00 = map;
    }
}
