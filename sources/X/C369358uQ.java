package X;

import com.instagram.api.schemas.ElectionAddYoursInfoDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8uQ  reason: invalid class name and case insensitive filesystem */
public abstract class C369358uQ {
    public static ElectionAddYoursInfoDict parseFromJson(16F r6) {
        String A1P;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Boolean bool = null;
            ArrayList arrayList = null;
            String str = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if (C273654mx.A00(142).equals(A0q)) {
                    bool = Boolean.valueOf(r6.A0d());
                } else if (C273654mx.A00(3430).equals(A0q)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            if (!(r6.A11() == 16L.A0G || (A1P = r6.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("tray_title".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new ElectionAddYoursInfoDict(bool, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
