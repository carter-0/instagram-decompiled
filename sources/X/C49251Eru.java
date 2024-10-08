package X;

import java.io.IOException;

/* renamed from: X.Eru  reason: case insensitive filesystem */
public abstract class C49251Eru {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.EvY] */
    public static C49432EvY parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("ig_supervised_user_screen_time_settings_subscribe".equals(AnonymousClass7TE.A17(r4))) {
                    C49612EzV parseFromJson = C49252Erv.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    obj.A00 = parseFromJson;
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
