package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3Qi  reason: invalid class name and case insensitive filesystem */
public abstract class C241693Qi {
    public static AnonymousClass3QQ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass3QQ r0 = new AnonymousClass3QQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("reupload_count".equals(A0q)) {
                    r0.A00 = r5.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("step_auto_retry_count".equals(A0q)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r5.A1J() != 16L.A08) {
                                Integer valueOf = Integer.valueOf(r5.A1D());
                                if (valueOf != null) {
                                    arrayList.add(valueOf);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A01 = arrayList;
                    } else if ("step_auto_manual_count".equals(A0q)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r5.A1J() != 16L.A08) {
                                Integer valueOf2 = Integer.valueOf(r5.A1D());
                                if (valueOf2 != null) {
                                    arrayList.add(valueOf2);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A02 = arrayList;
                    }
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
