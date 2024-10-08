package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

public abstract class CWU {
    public static UMs parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            UKM ukm = null;
            Boolean bool2 = null;
            BAY bay = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("boosted_component_async_request_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("creation_request_accepted".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if ("error".equals(A17)) {
                    ukm = C44284CcS.parseFromJson(r10);
                } else if (C273654mx.A00(296).equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r10);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    bay = CWT.parseFromJson(r10);
                }
                r10.A0z();
            }
            if (bool != null || !(r10 instanceof 0c9)) {
                return new UMs(bay, ukm, bool2, str, bool.booleanValue());
            }
            AnonymousClass7TF.A1L("creation_request_accepted", r10, "CreatePromotionResponseImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
