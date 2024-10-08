package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.7oZ  reason: invalid class name and case insensitive filesystem */
public abstract class C342417oZ {
    public static C342427oa parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            C342477of r5 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("shopping_sheet_config".equals(A0q)) {
                    r5 = C393449wS.parseFromJson(r7);
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (str != null || !(r7 instanceof 0c9)) {
                return new C342427oa(r5, str);
            }
            ((0c9) r7).A03.A00(DialogModule.KEY_TITLE, "ScheduledLiveConfigImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
