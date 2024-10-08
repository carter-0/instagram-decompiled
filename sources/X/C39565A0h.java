package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.A0h  reason: case insensitive filesystem */
public abstract class C39565A0h {
    public static A4L parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            A4L a4l = new A4L();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if ("timestamps".equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            arrayList.add(AnonymousClass7TF.A0U(r5));
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    a4l.A00 = arrayList;
                }
                r5.A0z();
            }
            return a4l;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
