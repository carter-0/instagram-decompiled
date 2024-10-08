package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnboardingEntryActionType;
import java.util.LinkedHashMap;

/* renamed from: X.CHt  reason: case insensitive filesystem */
public final class C43899CHt extends 17P implements C245373cm {
    public final OnboardingEntryActionType AYX() {
        return (OnboardingEntryActionType) A0M(1583758243, DK3.A00);
    }

    public final C245363cl F0S() {
        return new C245363cl(AYX());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CHt, X.3cm] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (AYX() != null) {
            C41846B3n.A1I(AYX(), A0t);
        }
        return C41846B3n.A0P(this, A0t);
    }
}
