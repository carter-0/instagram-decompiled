package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.55k  reason: invalid class name and case insensitive filesystem */
public final class C2809955k {
    public static C2809855j parseFromJson(16F r4) {
        String str;
        Integer num;
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("version".equals(A0q)) {
                    r0.A00 = r4.A1D();
                } else if ("actions".equals(A0q)) {
                    r0.A01 = C2810255n.parseFromJson(r4);
                } else if ("handler".equals(A0q)) {
                    int A0i = r4.A0i();
                    if (A0i == 0) {
                        num = AnonymousClass05K.A00;
                    } else if (A0i == 1) {
                        num = AnonymousClass05K.A01;
                    } else if (A0i != 2) {
                        0wb.A03(C2809855j.class.getSimpleName(), 002.A0O("Unrecognized emergency push handler type received from backend: ", A0i));
                        num = AnonymousClass05K.A00;
                    } else {
                        num = AnonymousClass05K.A0C;
                    }
                    r0.A03 = num;
                } else if ("try_crash_on_bg_for_x_mins_else_crash_now".equals(A0q)) {
                    r0.A02 = Integer.valueOf(r4.A1D());
                } else if (DialogModule.KEY_MESSAGE.equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    r0.A04 = str;
                } else {
                    1XY.A01(r4, r0, A0q);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
