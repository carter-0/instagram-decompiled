package X;

import java.io.IOException;

/* renamed from: X.En6  reason: case insensitive filesystem */
public abstract class C48968En6 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.FBN, java.lang.Object] */
    public static FBN parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("resend_sms_delay_sec".equals(A17)) {
                    obj.A02 = r3.A1D();
                } else if ("max_sms_count".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if ("robocall_count_down_time_sec".equals(A17)) {
                    obj.A01 = r3.A1D();
                } else if ("robocall_after_max_sms".equals(A17)) {
                    obj.A03 = r3.A0d();
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
