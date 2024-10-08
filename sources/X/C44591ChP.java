package X;

import java.io.IOException;

/* renamed from: X.ChP  reason: case insensitive filesystem */
public abstract class C44591ChP {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Cvo, java.lang.Object] */
    public static C45408Cvo parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("pk".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r5);
                } else if (C41845B3m.A1B(A17)) {
                    obj.A03 = C41845B3m.A0a(r5, false);
                } else if ("broadcast".equals(A17)) {
                    obj.A02 = C45893D9w.parseFromJson(r5);
                } else if (AnonymousClass000.A00(686).equals(A17)) {
                    obj.A00 = r5.A0y();
                } else if ("can_reply".equals(A17) || "can_reshare".equals(A17)) {
                    r5.A0d();
                } else if ("cover_frame_url".equals(A17)) {
                    obj.A01 = 16h.A00(r5);
                } else if ("progressive_playback_url".equals(A17)) {
                    C41846B3n.A1A(r5);
                } else if (C273654mx.A00(246).equals(A17)) {
                    obj.A05 = r5.A0d();
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
