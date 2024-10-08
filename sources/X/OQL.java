package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public final class OQL {
    public static NHP parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            NHP nhp = new NHP();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                ArrayList arrayList = null;
                if (C66581MXm.A1X(r5, A0q)) {
                    if (r5.A11() == 16L.A0G) {
                    }
                    r5.A1P();
                } else if ("has_newer".equals(A0q)) {
                    nhp.A01 = AnonymousClass7TF.A0S(r5);
                } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C254703su A00 = C254703su.A00(r5, (DirectThreadKey) null, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    nhp.A04 = arrayList;
                } else if (AnonymousClass000.A00(4150).equals(A0q)) {
                    nhp.A00 = r5.A1D();
                } else if ("last_activity_at".equals(A0q)) {
                    r5.A0y();
                } else if ("oldest_cursor".equals(A0q)) {
                    nhp.A03 = AnonymousClass7TG.A0l(r5);
                } else if ("newest_cursor".equals(A0q)) {
                    nhp.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("prev_cursor".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                    }
                    r5.A1P();
                } else if (C273654mx.A00(838).equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                    }
                    r5.A1P();
                } else {
                    1XY.A01(r5, nhp, A0q);
                }
                r5.A0z();
            }
            Iterator it = nhp.A04.iterator();
            while (it.hasNext()) {
                C66580MXl.A0a(it).A1m(AnonymousClass05K.A0j);
            }
            return nhp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
