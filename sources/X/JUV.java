package X;

import com.instagram.user.model.UpcomingEventImpl;
import java.io.IOException;

public abstract class JUV {
    public static final UpcomingEventImpl A00(String str) {
        if (str != null) {
            try {
                16F A03 = AnonymousClass15o.A00.A03(str);
                A03.A12();
                return C45712D2l.parseFromJson(A03);
            } catch (IOException e) {
                0kD.A06("UpcomingEventConverter", "Failed to deserialize UpcomingEvent from ClipsDraft", e);
            }
        }
        return null;
    }
}
