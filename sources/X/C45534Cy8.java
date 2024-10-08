package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Cy8  reason: case insensitive filesystem */
public final class C45534Cy8 {
    public static CEY parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("boosted_component_async_request_id".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    r1.A05 = str;
                } else if ("creation_request_accepted".equals(A17)) {
                    r1.A03 = AnonymousClass7TF.A0S(r7);
                } else if ("error".equals(A17)) {
                    r1.A02 = C44284CcS.parseFromJson(r7);
                } else if (C273654mx.A00(296).equals(A17)) {
                    r1.A04 = AnonymousClass7TF.A0S(r7);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    r1.A00 = CWT.parseFromJson(r7);
                } else {
                    1XY.A01(r7, r1, A17);
                }
                r7.A0z();
            }
            String str2 = r1.A05;
            boolean A14 = C41845B3m.A14(r1.A03);
            r1.A01 = new UMs(r1.A00, r1.A02, r1.A04, str2, A14);
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
