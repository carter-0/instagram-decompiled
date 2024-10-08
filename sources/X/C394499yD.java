package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9yD  reason: invalid class name and case insensitive filesystem */
public abstract class C394499yD {
    public static A6E parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            A6E a6e = new A6E();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("overlay_drawable_data".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            A6D parseFromJson = C379519Uf.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    a6e.A02 = arrayList;
                } else if ("overlay_asset_data".equals(A17)) {
                    a6e.A01 = C370068vm.A00(r4);
                } else if ("drawables_max_z".equals(A17)) {
                    a6e.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return a6e;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
