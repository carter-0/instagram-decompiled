package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.B5x  reason: case insensitive filesystem */
public final class C41902B5x extends 17P implements C67051rn {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.B5x] */
    public final 1rm FDb() {
        return new 1rm(getBooleanValueByHashCode(-586140148));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.B5x] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        getShouldAllowRestore();
        A0t.put("should_allow_restore", Boolean.valueOf(getBooleanValueByHashCode(-586140148)));
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5x] */
    public final boolean getShouldAllowRestore() {
        return getBooleanValueByHashCode(-586140148);
    }
}
