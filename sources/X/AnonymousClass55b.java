package X;

import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.io.IOException;

/* renamed from: X.55b  reason: invalid class name */
public abstract class AnonymousClass55b {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling] */
    public static ARCapabilityMinVersionModeling parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("capability_name".equals(A0q)) {
                    obj.mCapability = VersionedCapability.fromServerValue(r3.A1Q());
                } else if ("min_version".equals(A0q)) {
                    obj.mMinVersion = r3.A1D();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling, 17Z r3) {
        r3.A0c();
        VersionedCapability versionedCapability = aRCapabilityMinVersionModeling.mCapability;
        if (versionedCapability != null) {
            r3.A0R("capability_name", versionedCapability.toServerValue());
        }
        r3.A0P("min_version", aRCapabilityMinVersionModeling.mMinVersion);
        r3.A0Z();
    }
}
