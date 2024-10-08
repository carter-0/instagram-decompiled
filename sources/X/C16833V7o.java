package X;

import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.V7o  reason: case insensitive filesystem */
public abstract class C16833V7o {
    public static UNI parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            UNF unf = null;
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            UNO uno = null;
            UNN unn = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (AppStateModule.APP_STATE_BACKGROUND.equals(A17)) {
                    unf = C16829V7k.parseFromJson(r10);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("metadata_items".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r10.A1J() != 16L.A08) {
                            UNN parseFromJson = C18117Vll.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("separator_color".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("text_color".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("thumbnail".equals(A17)) {
                    uno = C18118Vlm.parseFromJson(r10);
                } else if (C41845B3m.A1E(A17)) {
                    unn = C18117Vll.parseFromJson(r10);
                }
                r10.A0z();
            }
            return new UNI(unf, unn, uno, str, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
