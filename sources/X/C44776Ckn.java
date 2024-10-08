package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ckn  reason: case insensitive filesystem */
public abstract class C44776Ckn {
    public static C45292Ctv parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45292Ctv ctv = new C45292Ctv();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("header".equals(A17)) {
                    ctv.A00 = AnonymousClass7TG.A0l(r4);
                } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45347Cup parseFromJson = C44775Ckm.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    ctv.A01 = arrayList;
                }
                r4.A0z();
            }
            return ctv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
