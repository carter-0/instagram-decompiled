package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VDv  reason: case insensitive filesystem */
public abstract class C16995VDv {
    public static C17585Vad parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17585Vad vad = new C17585Vad();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("__typename".equals(A17)) {
                    vad.A03 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A17(A17)) {
                    vad.A00 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A19(A17)) {
                    vad.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("tag".equals(A17)) {
                    vad.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("url".equals(A17)) {
                    vad.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("android_urls".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    vad.A05 = arrayList;
                }
                r4.A0z();
            }
            return vad;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
