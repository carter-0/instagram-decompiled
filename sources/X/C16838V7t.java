package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.V7t  reason: case insensitive filesystem */
public abstract class C16838V7t {
    public static UNL parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            UNK unk = null;
            UNF unf = null;
            UNE une = null;
            ArrayList arrayList = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("animation".equals(A17)) {
                    unk = C16836V7r.parseFromJson(r7);
                } else if (AppStateModule.APP_STATE_BACKGROUND.equals(A17)) {
                    unf = C16829V7k.parseFromJson(r7);
                } else if ("badge".equals(A17)) {
                    une = C16827V7i.parseFromJson(r7);
                } else if ("photos".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            UNJ parseFromJson = C16839V7u.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r7.A0z();
            }
            return new UNL(une, unf, unk, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
