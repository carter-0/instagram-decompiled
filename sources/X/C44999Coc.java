package X;

import java.io.IOException;

/* renamed from: X.Coc  reason: case insensitive filesystem */
public abstract class C44999Coc {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Cvy] */
    public static C45418Cvy parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("timestamp".equals(A17)) {
                    obj.A01 = r3.A0y();
                } else if (C41845B3m.A1J(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("quiz_id".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("answer".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if ("reel_viewer_module_name".equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("media_delivery_class".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("tray_session_id".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
