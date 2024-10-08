package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3e6  reason: invalid class name and case insensitive filesystem */
public abstract class C246143e6 {
    public static C246203eC parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("interested".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C246183eA parseFromJson = C246163e8.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (NetInfoModule.CONNECTION_TYPE_NONE.equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C246183eA parseFromJson2 = C246163e8.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r5.A0z();
            }
            return new C246203eC(arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
