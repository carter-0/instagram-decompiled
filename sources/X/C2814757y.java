package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.57y  reason: invalid class name and case insensitive filesystem */
public abstract class C2814757y {
    public static C2814857z parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C2814857z r0 = new C2814857z();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if ("message_static".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A02 = str;
                } else if ("details".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A00 = str;
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A03 = str;
                } else if (DialogModule.KEY_MESSAGE.equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r0.A01 = str;
                } else if ("is_linked".equals(A0q)) {
                    r0.A04 = r4.A0d();
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
