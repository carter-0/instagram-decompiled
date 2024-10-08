package X;

import com.instagram.business.promote.model.IGBoostPackage;
import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VAO {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.business.promote.model.IGBoostPackagesFlowInfo, java.lang.Object] */
    public static IGBoostPackagesFlowInfo parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("destination".equals(A17)) {
                    obj.A00 = C16852V8h.A00(AnonymousClass7TG.A0l(r4));
                } else if (C41845B3m.A1E(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r4);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("audience".equals(A17)) {
                    obj.A01 = VAP.parseFromJson(r4);
                } else if ("packages".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            IGBoostPackage parseFromJson = C63096KrP.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A04 = arrayList;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
