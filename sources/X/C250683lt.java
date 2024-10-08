package X;

import com.instagram.api.schemas.MediaReminderImpl;
import java.io.IOException;

/* renamed from: X.3lt  reason: invalid class name and case insensitive filesystem */
public abstract class C250683lt {
    public static MediaReminderImpl parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Integer num = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Boolean bool = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("expected_send_time".equals(A0q)) {
                    num = Integer.valueOf(r4.A1D());
                } else if ("is_reminder_set".equals(A0q)) {
                    bool = Boolean.valueOf(r4.A0d());
                }
                r4.A0z();
            }
            return new MediaReminderImpl(bool, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
