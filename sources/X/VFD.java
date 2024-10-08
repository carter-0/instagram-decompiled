package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class VFD {
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.VcT] */
    public static C17698VcT parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("pageName".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    obj.A05 = A0l;
                } else if ("businessCategories".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    obj.A09 = arrayList;
                } else if ("pageDescription".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r5);
                } else if ("phoneNumber".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r5);
                } else if ("location".equals(A17)) {
                    obj.A01 = VFC.parseFromJson(r5);
                } else if ("websiteUrl".equals(A17)) {
                    obj.A08 = AnonymousClass7TG.A0l(r5);
                } else if ("profilePicUrl".equals(A17)) {
                    obj.A00 = 16h.A00(r5);
                } else if ("pageFanCountNum".equals(A17)) {
                    obj.A02 = AnonymousClass7TF.A0X(r5);
                } else if ("pageFanCount".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    obj.A04 = A0l2;
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
