package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;

/* renamed from: X.6fS  reason: invalid class name and case insensitive filesystem */
public final class C312936fS implements C312946fT {
    public final 0xa A00 = 0xn.A01("ig_ard_versioned_capability_experiment");

    public final boolean AH2(VersionedCapability versionedCapability, String str) {
        0xa r4 = this.A00;
        String name = versionedCapability.name();
        String string = r4.getString(name, (String) null);
        boolean z = false;
        if (!2Ob.A00(str, string)) {
            0xY AR4 = r4.AR4();
            if (string == null || str != null) {
                AR4.E5g(name, str);
                z = true;
            } else {
                AR4.ED3(name);
            }
            AR4.apply();
        }
        return z;
    }
}
