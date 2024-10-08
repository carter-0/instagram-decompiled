package X;

import java.io.IOException;

/* renamed from: X.9zc  reason: invalid class name and case insensitive filesystem */
public abstract class C395349zc {
    public static AnonymousClass1fu parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1fu r1 = new AnonymousClass1fu();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(4710).equals(A17)) {
                    r1.A01 = C63327KvA.parseFromJson(r3);
                } else if ("view_mode".equals(A17)) {
                    r1.A06 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(1764).equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("source_media_id".equals(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("replied_to_message".equals(A17)) {
                    r1.A00 = C254933tI.A00(r3);
                } else {
                    C66893Meb.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
