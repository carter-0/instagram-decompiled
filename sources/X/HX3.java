package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class HX3 {
    public static final String A00(Context context, UserSession userSession, int i) {
        String string;
        if (182.A06(0Tu.A05, userSession, 36329470499766420L)) {
            string = context.getResources().getQuantityString(R.plurals.unified_feedback_replies_on_threads, i, new Object[]{C14066TpE.A00(context.getResources(), Integer.valueOf(i), (Integer) null, false)});
        } else {
            string = context.getString(2131975900);
        }
        0qQ.A07(string);
        return string;
    }
}
