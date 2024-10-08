package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D1x  reason: case insensitive filesystem */
public final class C45698D1x {
    public static CGJ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CGJ cgj = new CGJ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                if (C41846B3n.A1Z(r5, A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C45304Cu8 parseFromJson = C44953Cnn.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cgj.A01 = arrayList;
                } else {
                    1XY.A01(r5, cgj, A0q);
                }
                r5.A0z();
            }
            List<C45304Cu8> list = cgj.A01;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C45304Cu8 cu8 : list) {
                JZC jzc = cu8.A00;
                if (jzc != null || (jzc = cu8.A01) != null) {
                    A1C.add(jzc);
                }
            }
            cgj.A00 = A1C;
            return cgj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
