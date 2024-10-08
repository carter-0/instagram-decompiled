package X;

import java.io.IOException;

/* renamed from: X.Cbh  reason: case insensitive filesystem */
public abstract class C44246Cbh {
    public static C42065BFs parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            while (r6.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r6, "presence_id")) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            if (str != null || !(r6 instanceof 0c9)) {
                return new C42065BFs(str);
            }
            AnonymousClass7TF.A1L("presence_id", r6, "PresenceNoteResponseInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
