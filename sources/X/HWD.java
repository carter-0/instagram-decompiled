package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

public abstract class HWD {
    public static C55982Hqn parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C55982Hqn hqn = new C55982Hqn();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("section_type".equals(A17)) {
                    hqn.A00 = C48739EjO.A00(r5.A1Q());
                } else {
                    ArrayList arrayList = null;
                    if (DialogModule.KEY_ITEMS.equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                1Xj A00 = 1Xj.A00(r5);
                                if (A00 != null) {
                                    arrayList.add(A00);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        hqn.A04 = arrayList;
                    } else if ("display_cta_button_text".equals(A17)) {
                        hqn.A01 = AnonymousClass7TG.A0l(r5);
                    } else if ("display_subtitle".equals(A17)) {
                        hqn.A02 = AnonymousClass7TG.A0l(r5);
                    } else if ("display_title".equals(A17)) {
                        hqn.A03 = AnonymousClass7TG.A0l(r5);
                    }
                }
                r5.A0z();
            }
            return hqn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
