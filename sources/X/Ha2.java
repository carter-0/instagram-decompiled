package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

public abstract class Ha2 {
    public static C298715tu parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C298715tu r1 = new C298715tu();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("channel_id".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r3);
                } else if (C273654mx.A00(68).equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r3);
                } else {
                    if ("header".equals(A17)) {
                        if (r3.A11() == 16L.A0G) {
                        }
                    } else if (DialogModule.KEY_TITLE.equals(A17)) {
                        r1.A02 = AnonymousClass7TG.A0l(r3);
                    } else if ("context".equals(A17)) {
                        if (r3.A11() == 16L.A0G) {
                        }
                    } else if ("media_count".equals(A17)) {
                        r3.A1D();
                    } else if ("media".equals(A17)) {
                        r1.A00 = 1Xj.A00(r3);
                    }
                    r3.A1P();
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
