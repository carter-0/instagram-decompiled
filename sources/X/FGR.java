package X;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class FGR {
    public static final SimpleDateFormat A03(Context context) {
        String str;
        0qQ.A0B(context, 0);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        Locale A02 = AnonymousClass1Q2.A02();
        if (is24HourFormat) {
            str = "H:mm";
        } else {
            str = "h:mma";
        }
        return new SimpleDateFormat(str, A02);
    }

    public static String A01(Context context, long j) {
        return A03(context).format(new Date(j * 1000));
    }

    public static final long A00() {
        return DbZ.A08(Calendar.getInstance());
    }

    public static final String A02(Context context, long j, boolean z) {
        Locale locale;
        String str;
        long A00 = C280074zx.A00() / 1000;
        if (!z || (j / 60) % 60 <= 0) {
            boolean is24HourFormat = DateFormat.is24HourFormat(context);
            locale = AnonymousClass1Q2.A02();
            if (!is24HourFormat) {
                str = "h a";
            }
            str = "H:mm";
        } else {
            boolean is24HourFormat2 = DateFormat.is24HourFormat(context);
            locale = AnonymousClass1Q2.A02();
            if (!is24HourFormat2) {
                str = "h:mm a";
            }
            str = "H:mm";
        }
        String format = new SimpleDateFormat(str, locale).format(new Date((A00 + j) * 1000));
        0qQ.A07(format);
        return format;
    }

    public static final SimpleDateFormat A04(Context context, long j) {
        Locale A02;
        String str;
        if (DateFormat.is24HourFormat(context)) {
            A02 = AnonymousClass1Q2.A02();
            str = "H:mm LLL d";
        } else {
            int i = (((j / 60) % 60) > 0 ? 1 : (((j / 60) % 60) == 0 ? 0 : -1));
            A02 = AnonymousClass1Q2.A02();
            if (i > 0) {
                str = "h:mm a LLL d";
            } else {
                str = "h a LLL d";
            }
        }
        return new SimpleDateFormat(str, A02);
    }

    public static final void A05(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AnonymousClass7TG.A1N(fragmentActivity, userSession);
        if (182.A06(0Tu.A05, userSession, 2342161703641029000L)) {
            C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
            A0Q.A0B((Bundle) null, Eq6.A00(C21251XQw.SLEEP_MODE, (String) null));
            A0Q.A04();
            return;
        }
        DbW.A0W(fragmentActivity, DbY.A0B("entrypoint", str), userSession, ModalActivity.class, "quiet_mode_settings").A0C(fragmentActivity);
    }
}
