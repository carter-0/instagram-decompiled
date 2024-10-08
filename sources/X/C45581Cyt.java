package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cyt  reason: case insensitive filesystem */
public final class C45581Cyt {
    public static CEF parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("double_height_reel_media".equals(A17)) {
                    r4.A00 = C275974sH.parseFromJson(r5);
                } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1F(r5, arrayList);
                        }
                    }
                    r4.A03 = arrayList;
                } else if ("page_info".equals(A17)) {
                    r4.A02 = CYZ.parseFromJson(r5);
                } else {
                    1XY.A01(r5, r4, A17);
                }
                r5.A0z();
            }
            r4.A01 = new C61106JxI(r4.A00, r4.A02, r4.A03);
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
