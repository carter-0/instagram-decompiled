package X;

import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.O0j  reason: case insensitive filesystem */
public abstract class C70279O0j {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.5u0, java.lang.Object] */
    public static C298775u0 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("tile".equals(A17)) {
                    obj.A00 = C70280O0k.parseFromJson(r4);
                } else if ("pins".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            MediaMapPin parseFromJson = C16928VBf.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
