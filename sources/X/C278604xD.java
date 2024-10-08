package X;

import com.instagram.api.schemas.IGConsiderAndBrowseType;
import java.io.IOException;

/* renamed from: X.4xD  reason: invalid class name and case insensitive filesystem */
public abstract class C278604xD {
    public static C278614xF parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            IGConsiderAndBrowseType iGConsiderAndBrowseType = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("watch_type".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    iGConsiderAndBrowseType = (IGConsiderAndBrowseType) IGConsiderAndBrowseType.A01.get(str);
                    if (iGConsiderAndBrowseType == null) {
                        iGConsiderAndBrowseType = IGConsiderAndBrowseType.UNRECOGNIZED;
                    }
                }
                r6.A0z();
            }
            if (iGConsiderAndBrowseType != null || !(r6 instanceof 0c9)) {
                return new C278614xF(iGConsiderAndBrowseType);
            }
            ((0c9) r6).A03.A00("watch_type", "BrowseInfoDictImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
