package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.64z  reason: invalid class name and case insensitive filesystem */
public abstract class C3027164z {
    public static final ArrayList A00(String str) {
        0qQ.A0B(str, 0);
        16F A03 = AnonymousClass15o.A00.A03(str);
        A03.A1J();
        ArrayList arrayList = new ArrayList();
        if (A03.A11() == 16L.A0C) {
            while (A03.A1J() != 16L.A08) {
                if (A03.A11() == 16L.A0D) {
                    AnonymousClass651 parseFromJson = AnonymousClass650.parseFromJson(A03);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    } else {
                        throw new IOException("Failed to parse IrisSyncMessage from payload");
                    }
                }
            }
        }
        return arrayList;
    }
}
