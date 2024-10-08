package X;

import android.text.TextUtils;
import java.util.Map;
import java.util.Random;

/* renamed from: X.4kx  reason: invalid class name and case insensitive filesystem */
public abstract class C272564kx {
    public final Random A00 = new Random();

    public int A00(String str) {
        C272554kw r1 = (C272554kw) this;
        int i = r1.A00;
        if (TextUtils.isEmpty(str) || "empty".equals(str)) {
            str = "MISSING_ENDPOINT_KEY";
        }
        Map map = r1.A01;
        if (map.containsKey(str)) {
            return ((Number) map.get(str)).intValue();
        }
        return i;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public boolean A03() {
        return true;
    }
}
