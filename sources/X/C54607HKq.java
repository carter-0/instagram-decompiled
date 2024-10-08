package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

/* renamed from: X.HKq  reason: case insensitive filesystem */
public enum C54607HKq {
    ;

    /* access modifiers changed from: public */
    static {
        C54607HKq[] hKqArr;
        A00 = 0oU.A00(hKqArr);
    }

    public final String A00(Context context, UserSession userSession) {
        if (this instanceof C54198H2s) {
            return AnonymousClass7TF.A0d(context.getResources(), 2131969506);
        }
        if (this instanceof H2w) {
            AnonymousClass7TG.A1N(userSession, context);
            return A04.A00(context, userSession);
        } else if (this instanceof C54197H2r) {
            return AnonymousClass7TF.A0d(context.getResources(), 2131969506);
        } else {
            if (this instanceof C54196H2q) {
                return null;
            }
            if (this instanceof C54201H2v) {
                return AnonymousClass7TF.A0d(context.getResources(), 2131969505);
            }
            boolean z = this instanceof C54200H2u;
            Resources resources = context.getResources();
            if (z) {
                return AnonymousClass7TF.A0d(resources, 2131969505);
            }
            return AnonymousClass7TF.A0d(resources, 2131969507);
        }
    }
}
