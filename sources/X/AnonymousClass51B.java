package X;

import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.51B  reason: invalid class name */
public abstract class AnonymousClass51B {
    public static SparkVisionCapability parseFromJson(16F r4) {
        String A1P;
        0qQ.A0B(r4, 0);
        try {
            SparkVisionCapability sparkVisionCapability = new SparkVisionCapability();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("identifiers".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            if (!(r4.A11() == 16L.A0G || (A1P = r4.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    }
                    sparkVisionCapability.A00 = arrayList;
                }
                r4.A0z();
            }
            return sparkVisionCapability;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
