package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.78h  reason: invalid class name and case insensitive filesystem */
public abstract class C3268278h extends AnonymousClass78R {
    public final AnonymousClass78R firstCommand;
    public final boolean preventDuplicates;
    public final boolean removePrefix;
    public final AnonymousClass78R secondCommand;
    public final Integer textRangeId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3268278h(Context context, UserSession userSession, AnonymousClass7OR r4, String str, AnonymousClass7OS r6, Integer num, int i, AnonymousClass78U r9, Integer num2, AnonymousClass78R r11, AnonymousClass78R r12, boolean z, boolean z2) {
        super(context, userSession, r4, str, r6, num, i, r9);
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        0qQ.A0B(str, 4);
        0qQ.A0B(r6, 5);
        0qQ.A0B(r9, 8);
        0qQ.A0B(r11, 10);
        0qQ.A0B(r12, 11);
        this.textRangeId = num2;
        this.firstCommand = r11;
        this.secondCommand = r12;
        this.preventDuplicates = z;
        this.removePrefix = z2;
    }

    public C3260875i createCommandData() {
        AnonymousClass7OR r4 = this.commandType;
        String str = this.title;
        String str2 = this.description;
        int i = this.iconDrawableRes;
        return new C3261075k(this.firstCommand.createCommandData(), this.secondCommand.createCommandData(), this.loggingId, r4, this.textRangeId, str, str2, i, this.preventDuplicates, this.removePrefix);
    }

    public final AnonymousClass78R getFirstCommand() {
        return this.firstCommand;
    }

    public final boolean getPreventDuplicates() {
        return this.preventDuplicates;
    }

    public final boolean getRemovePrefix() {
        return this.removePrefix;
    }

    public final AnonymousClass78R getSecondCommand() {
        return this.secondCommand;
    }

    public final Integer getTextRangeId() {
        return this.textRangeId;
    }
}
