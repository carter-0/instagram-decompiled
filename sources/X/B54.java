package X;

import com.instagram.api.schemas.MediaReminder;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B54 {
    public static Map A00(MediaReminder mediaReminder) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (mediaReminder.B2f() != null) {
            A1H.put("expected_send_time", mediaReminder.B2f());
        }
        if (mediaReminder.Cac() != null) {
            A1H.put("is_reminder_set", mediaReminder.Cac());
        }
        return 0Yt.A0B(A1H);
    }
}
