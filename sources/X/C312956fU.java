package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6fU  reason: invalid class name and case insensitive filesystem */
public final class C312956fU {
    public final 0xa A00 = 0xn.A01("ig_ard_nmlml_migration_capability_version_schema");
    public final Map A01 = Collections.synchronizedMap(new HashMap());

    public C312956fU() {
        for (C312976fW r0 : C312966fV.A00()) {
            0xa r2 = this.A00;
            VersionedCapability versionedCapability = r0.A01;
            String serverValue = versionedCapability.toServerValue();
            C312986fX r4 = C312986fX.ARD;
            String string = r2.getString(serverValue, r4.toString());
            Map map = this.A01;
            if (string != null) {
                C312986fX r1 = C312986fX.NMLML;
                if (!r1.A00.equals(string)) {
                    r1 = r4;
                    if (!r4.A00.equals(string)) {
                        r1 = C312986fX.INVALID;
                    }
                }
                r4 = r1;
            }
            map.put(versionedCapability, r4);
        }
    }
}
