package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VBt  reason: case insensitive filesystem */
public abstract class C16941VBt {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.5ty, java.lang.Object] */
    public static C298755ty parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Y(r4, A0q)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("cluster".equals(A0q)) {
                    obj.A00 = C296855ql.parseFromJson(r4);
                } else if (AnonymousClass000.A00(2937).equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1D(r4, arrayList);
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("cover_title".equals(A0q)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("should_show_icon".equals(A0q)) {
                    obj.A04 = r4.A0d();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
