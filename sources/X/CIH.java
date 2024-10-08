package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGConsiderAndBrowseType;
import java.util.LinkedHashMap;

public final class CIH extends 17P implements C278624xG {
    public final IGConsiderAndBrowseType CGB() {
        return (IGConsiderAndBrowseType) A0M(-99865430, DKC.A00);
    }

    public final C278614xF F11() {
        return new C278614xF(CGB());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4xG, com.facebook.pando.TreeJNI, X.CIH] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (CGB() != null) {
            IGConsiderAndBrowseType CGB = CGB();
            0qQ.A0B(CGB, 0);
            A0t.put("watch_type", CGB.A00);
        }
        return C41846B3n.A0P(this, A0t);
    }
}
