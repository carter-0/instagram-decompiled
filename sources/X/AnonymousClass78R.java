package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.78R  reason: invalid class name */
public abstract class AnonymousClass78R implements AnonymousClass78N {
    public final AnonymousClass7OR commandType;
    public final String description;
    public final int iconDrawableRes;
    public final AnonymousClass78U inputChecker;
    public final AnonymousClass7OS loggingId;
    public final String title;
    public final String trigger;
    public final UserSession userSession;

    public AnonymousClass78R(Context context, UserSession userSession2, AnonymousClass7OR r4, String str, AnonymousClass7OS r6, Integer num, int i, AnonymousClass78U r9) {
        String str2;
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession2, 2);
        0qQ.A0B(r4, 3);
        0qQ.A0B(str, 4);
        0qQ.A0B(r6, 5);
        0qQ.A0B(r9, 8);
        this.userSession = userSession2;
        this.commandType = r4;
        this.trigger = str;
        this.loggingId = r6;
        this.iconDrawableRes = i;
        this.inputChecker = r9;
        this.title = 002.A0D(str, r4.A00);
        if (num != null) {
            str2 = context.getString(num.intValue());
        } else {
            str2 = null;
        }
        this.description = str2;
    }

    public abstract C3260875i createCommandData();

    public ArrayList filter(String str) {
        0qQ.A0B(str, 0);
        if (this.inputChecker.CVU(this.userSession, this, str)) {
            return 0sr.A1L(new C3260875i[]{createCommandData()});
        }
        return null;
    }

    public final AnonymousClass7OR getCommandType() {
        return this.commandType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getIconDrawableRes() {
        return this.iconDrawableRes;
    }

    public final AnonymousClass78U getInputChecker() {
        return this.inputChecker;
    }

    public final AnonymousClass7OS getLoggingId() {
        return this.loggingId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public final UserSession getUserSession() {
        return this.userSession;
    }
}
