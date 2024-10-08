package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Vmu  reason: case insensitive filesystem */
public final class C18180Vmu {
    public static UXE parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            UXE uxe = new UXE();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (DialogModule.KEY_ITEMS.equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    uxe.A00 = arrayList;
                } else {
                    1XY.A01(r5, uxe, A17);
                }
                r5.A0z();
            }
            return uxe;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
