package X;

import java.io.IOException;

/* renamed from: X.O2m  reason: case insensitive filesystem */
public abstract class C70334O2m {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.OFe, java.lang.Object] */
    public static C70657OFe parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("alert_title".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("alert_message".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("alert_confirmation_button".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("alert_cancel_button".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
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
