package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.77c  reason: invalid class name */
public final class AnonymousClass77c {
    public static C3265177b parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C254703su A00 = C254703su.A00(r5, (DirectThreadKey) null, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    r0.A00 = arrayList;
                } else {
                    1XY.A01(r5, r0, A0q);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
