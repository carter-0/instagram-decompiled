package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class V8X {
    public static C15066UNj parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r4.A1J() != 16L.A09) {
                if ("fragments".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C15065UNi parseFromJson = V8V.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r4.A0z();
            }
            return new C15066UNj(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
