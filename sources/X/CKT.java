package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;

public final class CKT extends 17P implements C46238DRt {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CKT] */
    public final BEw F3X() {
        ImmutableList stringListByHashCode = getStringListByHashCode(1840031572);
        0qQ.A07(stringListByHashCode);
        return new BEw(stringListByHashCode);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.CKT] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        0qQ.A07(getStringListByHashCode(1840031572));
        ImmutableList stringListByHashCode = getStringListByHashCode(1840031572);
        0qQ.A07(stringListByHashCode);
        A0t.put("group_poll_prompt_suggestions", stringListByHashCode);
        return C41846B3n.A0P(this, A0t);
    }
}
