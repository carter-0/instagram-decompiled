package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

public final class OTG {
    public final Context A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;

    public OTG(Context context, AnonymousClass4DH r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r3;
    }

    public static final C367618rI A00(Context context, C62320sa r15, int i, int i2) {
        Drawable drawable;
        int i3 = i2;
        Drawable drawable2 = context.getDrawable(i3);
        if (C61670oa.A08()) {
            drawable = context.getDrawable(i3);
        } else {
            drawable = null;
        }
        return new C367618rI(drawable2, drawable, (C15048ULb) null, new PHN(r15, 3), (Integer) null, AnonymousClass7TE.A16(context, i), 0, 0, 0, false, false, false, true, false, false, false);
    }
}
