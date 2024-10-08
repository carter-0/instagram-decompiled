package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.CQi  reason: case insensitive filesystem */
public final class C44009CQi extends 17P implements C51948G8r {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CQi] */
    public final boolean CRv() {
        return getBooleanValueByHashCode(1875869432);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CQi] */
    public final BI9 FDB() {
        return new BI9(getBooleanValueByHashCode(1875869432));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.CQi] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        CRv();
        A0t.put("is_eligible_for_creator_settings_review", Boolean.valueOf(getBooleanValueByHashCode(1875869432)));
        return C41846B3n.A0P(this, A0t);
    }
}
