package X;

import com.instagram.api.schemas.OriginalSoundData;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D0h  reason: case insensitive filesystem */
public final class C45657D0h {
    public static CFB parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CFB cfb = new CFB();
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
                            OriginalSoundData parseFromJson = 1dk.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cfb.A00 = arrayList;
                } else {
                    1XY.A01(r5, cfb, A0q);
                }
                r5.A0z();
            }
            return cfb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
