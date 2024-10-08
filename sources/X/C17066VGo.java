package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VGo  reason: case insensitive filesystem */
public abstract class C17066VGo {
    public static C15248UXi parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if (DialogModule.KEY_ITEMS.equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            arrayList.add(1Xg.A00(r5));
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A01 = arrayList;
                } else if ("next_max_id".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r5);
                } else if ("more_available".equals(A17)) {
                    r0.A02 = r5.A0d();
                } else {
                    1XY.A01(r5, r0, A17);
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
