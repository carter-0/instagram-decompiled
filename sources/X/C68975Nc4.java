package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nc4  reason: case insensitive filesystem */
public abstract class C68975Nc4 extends AnonymousClass78R {
    public final Integer textRangeId;

    public C3260875i createCommandData() {
        return new C68976Nc5(this.loggingId, this.commandType, this.textRangeId, this.title, this.description, this.iconDrawableRes);
    }

    public final Integer getTextRangeId() {
        return this.textRangeId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68975Nc4(Context context, UserSession userSession, AnonymousClass7OR r4, String str, AnonymousClass7OS r6, Integer num, int i, AnonymousClass78U r9, Integer num2) {
        super(context, userSession, r4, str, r6, num, i, r9);
        C51974G9v.A1P(context, userSession, r4, str);
        AnonymousClass7TF.A1F(r6, 5, r9);
        this.textRangeId = num2;
    }
}
