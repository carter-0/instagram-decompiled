package X;

import java.io.IOException;

/* renamed from: X.Cog  reason: case insensitive filesystem */
public abstract class C45003Cog {
    public static C45419Cvz parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45419Cvz cvz = new C45419Cvz();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1J(A17)) {
                    cvz.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("slider_id".equals(A17)) {
                    cvz.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("vote".equals(A17)) {
                    cvz.A01 = D2J.parseFromJson(r3);
                } else if ("reel_viewer_module_name".equals(A17)) {
                    cvz.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("media_delivery_class".equals(A17)) {
                    cvz.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("tray_session_id".equals(A17)) {
                    cvz.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("tray_position".equals(A17)) {
                    cvz.A00 = r3.A1D();
                }
                r3.A0z();
            }
            return cvz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
