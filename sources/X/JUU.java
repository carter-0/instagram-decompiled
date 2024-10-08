package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class JUU {
    public static final List A00(String str) {
        C61015JvF jvF;
        if (str == null || str.equals("")) {
            return 0sn.A00;
        }
        List<String> A18 = DbV.A18(str, "␞");
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (String A00 : A18) {
            try {
                jvF = LIP.parseFromJson(16P.A00(A00));
            } catch (IOException e) {
                0kD.A06("StackedTimelineAction", "Failed to deserialize StackedTimelineActions from Clips draft.", e);
                jvF = null;
            }
            if (jvF != null) {
                A1C.add(jvF);
            }
        }
        return A1C;
    }
}
