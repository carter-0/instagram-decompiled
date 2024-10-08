package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;

public abstract class EUN extends FFY {
    public static final void A00(Context context, UserSession userSession, FBUserTag fBUserTag, C51918G7m g7m, Integer num) {
        Integer num2 = AnonymousClass05K.A01;
        if (num != num2) {
            FragmentActivity B7r = g7m.B7r();
            if (C49907FEf.A00.A01(context) || B7r == null || !182.A06(0Tu.A05, userSession, 36325420345471947L)) {
                FBUserTag.FBUserInfo fBUserInfo = fBUserTag.A02;
                C49907FEf.A00(context, fBUserInfo.A02, fBUserInfo.A04);
            } else {
                C48917EmH.A00(B7r, num2, fBUserTag.A02.A02, new C20614Wvv(17, context, fBUserTag));
            }
            g7m.DDy(fBUserTag);
        }
    }
}
