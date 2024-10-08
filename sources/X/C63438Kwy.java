package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kwy  reason: case insensitive filesystem */
public abstract class C63438Kwy {
    public static C61078JwG parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C61078JwG jwG = new C61078JwG(49);
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (DialogModule.KEY_ITEMS.equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C61074JwC parseFromJson = C45065Cpi.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    jwG.A00 = arrayList;
                }
                r5.A0z();
            }
            return jwG;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
