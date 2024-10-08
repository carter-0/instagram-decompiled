package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.EGh  reason: case insensitive filesystem */
public final class C47770EGh extends AnonymousClass4AA implements C331837So {
    public final AnonymousClass7SD A00;
    public final CharSequence A01;
    public final Integer A02;
    public final String A03;

    public C47770EGh(Context context, UserSession userSession, AnonymousClass7SD r12, User user, Integer num) {
        String str;
        String str2;
        CharSequence A0u;
        Resources resources;
        int i;
        int intValue = num.intValue();
        if (intValue == 1) {
            str = context.getString(2Au.A01(userSession) ? 2131973944 : 2131971193);
        } else if (intValue == 4 || intValue == 2 || intValue == 3 || intValue == 0) {
            str = null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        boolean A012 = 2Au.A01(userSession);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        Locale A022 = AnonymousClass1Q2.A02();
        if (is24HourFormat) {
            str2 = "H:mm";
        } else {
            str2 = "h:mm a";
        }
        String format = new SimpleDateFormat(str2, A022).format(new Date());
        if (intValue == 1) {
            A0u = DbV.A0u(context, format, context.getString(R.string.f0nameremoved), A012 ? 2131973943 : 2131971192);
        } else if (intValue != 4) {
            String str3 = null;
            if (intValue == 2) {
                resources = context.getResources();
                i = 2131971215;
                if (A012) {
                    i = 2131973963;
                }
            } else if (intValue == 3) {
                resources = context.getResources();
                i = 2131971219;
                if (A012) {
                    i = 2131973967;
                }
            } else if (intValue == 0) {
                A0u = 0bC.A01(context.getResources(), new String[]{format, context.getString(R.string.f0nameremoved)}, A012 ? 2131973937 : 2131971184);
            } else {
                throw AnonymousClass7TE.A1K();
            }
            A0u = DbU.A07(resources, user != null ? user.getUsername() : str3, i);
        } else {
            A0u = DbW.A0h(context, context.getString(R.string.f0nameremoved), A012 ? 2131973968 : 2131971220);
        }
        0qQ.A07(A0u);
        CharSequence charSequence = A0u;
        0qQ.A0B(charSequence, 2);
        this.A03 = str;
        this.A01 = charSequence;
        this.A02 = num;
        this.A00 = r12;
    }

    public final int getType() {
        return 157;
    }

    public final long C7Z() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C47770EGh eGh = (C47770EGh) obj;
        0qQ.A0B(eGh, 0);
        if (!0qQ.A0K(this.A03, eGh.A03) || !0qQ.A0K(this.A01, eGh.A01)) {
            return false;
        }
        return true;
    }
}
