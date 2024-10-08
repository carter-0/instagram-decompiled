package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.discovery.refinement.model.Refinement;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VBn  reason: case insensitive filesystem */
public abstract class C16935VBn {
    public static C61078JwG parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C61078JwG jwG = new C61078JwG(14);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if (DialogModule.KEY_ITEMS.equals(AnonymousClass7TE.A17(r4))) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            Refinement parseFromJson = C16934VBm.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    jwG.A00 = arrayList;
                }
                r4.A0z();
            }
            return jwG;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
