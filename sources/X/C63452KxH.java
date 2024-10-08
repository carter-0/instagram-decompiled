package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KxH  reason: case insensitive filesystem */
public abstract class C63452KxH {
    public static AnonymousClass47J parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass47J r1 = new AnonymousClass47J();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (AnonymousClass000.A00(5117).equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            LE3 parseFromJson = C63453KxI.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r1.A00 = arrayList;
                }
                r5.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
