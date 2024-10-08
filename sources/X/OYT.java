package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

public final class OYT {
    public static boolean A00;
    public static final OYT A01 = new Object();

    public static final void A00(Context context, UserSession userSession, int i) {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(C273654mx.A00(1029), userSession.A06);
        0qQ.A07(formatStrLocaleSafe);
        Context applicationContext = context.getApplicationContext();
        String A002 = C273654mx.A00(1375);
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(A002, 0);
        0qQ.A07(sharedPreferences);
        0xY AR4 = new 0tX(sharedPreferences, A002).AR4();
        AR4.E5Z(formatStrLocaleSafe, i);
        AR4.apply();
    }
}
