package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5ea  reason: invalid class name and case insensitive filesystem */
public abstract class C289995ea {
    public static C376509Ig parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Long l = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            Long l2 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("content_id".equals(A0q)) {
                    l = Long.valueOf(r8.A0y());
                } else if ("mentioned_user_ids".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            Long valueOf = Long.valueOf(r8.A0y());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("mentioned_content_ids".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            Long valueOf2 = Long.valueOf(r8.A0y());
                            if (valueOf2 != null) {
                                arrayList2.add(valueOf2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("ad_id".equals(A0q)) {
                    l2 = Long.valueOf(r8.A0y());
                }
                r8.A0z();
            }
            return new C376509Ig(9, (Object) arrayList2, (Object) arrayList, (Object) l, (Object) l2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
