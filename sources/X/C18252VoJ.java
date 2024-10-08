package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VoJ  reason: case insensitive filesystem */
public final class C18252VoJ {
    public static UYA parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            UYA uya = new UYA();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("users".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C17503VYh parseFromJson = VHT.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    uya.A01 = arrayList;
                } else if ("more_available".equals(A17)) {
                    uya.A02 = r5.A0d();
                } else if ("next_max_id".equals(A17)) {
                    uya.A00 = AnonymousClass7TG.A0l(r5);
                } else {
                    1XY.A01(r5, uya, A17);
                }
                r5.A0z();
            }
            return uya;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
