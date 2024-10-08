package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VDr  reason: case insensitive filesystem */
public abstract class C16991VDr {
    public static VSZ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            VSZ vsz = new VSZ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1C(A17)) {
                    vsz.A00 = (C16631UyR) EnumHelper.A00(r4.A1Q(), C16631UyR.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("parameters".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C14529Txp parseFromJson = C14528Txo.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vsz.A01 = arrayList;
                }
                r4.A0z();
            }
            return vsz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
