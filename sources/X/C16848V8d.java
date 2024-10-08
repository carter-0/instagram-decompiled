package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.V8d  reason: case insensitive filesystem */
public abstract class C16848V8d {
    public static C15068UNl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            UNF unf = null;
            ArrayList arrayList = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (AppStateModule.APP_STATE_BACKGROUND.equals(A17)) {
                    unf = C16829V7k.parseFromJson(r5);
                } else if ("comments".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            UNG parseFromJson = C18115Vlj.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r5.A0z();
            }
            return new C15068UNl(unf, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
