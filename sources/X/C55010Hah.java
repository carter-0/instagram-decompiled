package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hah  reason: case insensitive filesystem */
public abstract class C55010Hah {
    public static final String A00(Context context, UserSession userSession, 1Xj r6) {
        int size;
        List Aay = r6.A0C.Aay();
        if (Aay != null && (size = Aay.size()) > 0 && C56645I6a.A03(userSession)) {
            return 0bC.A02(context.getResources(), new String[]{String.valueOf(size)}, R.plurals.open_carousel_media_user_name_header_v2_subtitle, size).toString();
        }
        if (182.A06(0Tu.A05, userSession, 36320279271514288L)) {
            return r6.A2o();
        }
        return null;
    }
}
