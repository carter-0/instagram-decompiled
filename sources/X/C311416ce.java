package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.6ce  reason: invalid class name and case insensitive filesystem */
public final class C311416ce {
    public final UserSession A00;
    public final C273384mU A01;
    public final C317116mk A02;

    public C311416ce(UserSession userSession, C273384mU r3, C317116mk r4) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r4, 2);
        this.A00 = userSession;
        this.A02 = r4;
        this.A01 = r3;
    }

    public static final C367618rI A00(Context context, C62320sa r14, int i, int i2) {
        String string = context.getString(i);
        0qQ.A07(string);
        return new C367618rI((Drawable) null, context.getDrawable(i2), (C15048ULb) null, new C50479FcR(r14), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false);
    }
}
