package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnboardingEntryActionType;
import java.util.LinkedHashMap;

/* renamed from: X.CHv  reason: case insensitive filesystem */
public final class C43901CHv extends 17P implements AnonymousClass5AT {
    public final OnboardingEntryActionType AYX() {
        return (OnboardingEntryActionType) A0M(1583758243, DK4.A00);
    }

    public final BDp F0U() {
        return new BDp(AYX());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CHv, X.5AT] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (AYX() != null) {
            C41846B3n.A1I(AYX(), A0t);
        }
        return C41846B3n.A0P(this, A0t);
    }
}
