package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Calendar;

public final class ADK {
    public final C347017w8 A01(Context context, UserSession userSession, C317876nz r15, String str, String str2, long j) {
        String str3;
        Context context2 = context;
        AnonymousClass7TG.A1T(r15, context, userSession);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C317966o8 r0 : r15.A0O) {
            String str4 = r0.A0S;
            int hashCode = str4.hashCode();
            long j2 = j;
            if (hashCode != -715403045) {
                if (hashCode == -637054625 && str4.equals("memories")) {
                    str3 = "memories_with_date";
                }
                throw AnonymousClass7TE.A0w("Sticker does not exist.");
            } else if (!str4.equals("on_this_day")) {
                throw AnonymousClass7TE.A0w("Sticker does not exist.");
            } else if (A00(j2)) {
                str3 = "on_this_day_with_year";
            }
            A1C.add(new C369468uo(context2, str3, str, str2, j2));
        }
        return new C347017w8(context, userSession, A1C);
    }

    public static final boolean A00(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(System.currentTimeMillis());
        if (instance.get(5) == instance2.get(5) && instance.get(2) == instance2.get(2)) {
            return true;
        }
        return false;
    }
}
