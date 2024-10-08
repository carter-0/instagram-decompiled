package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;

/* renamed from: X.KJg  reason: case insensitive filesystem */
public final class C61715KJg extends C64943Lki {
    public PhotoFilter A00;
    public final UserSession A01;
    public final C66534MVo A02;

    public final C66534MVo ArI() {
        return this.A02;
    }

    public C61715KJg(UserSession userSession, C63805L7l l7l, C66534MVo mVo) {
        this.A00 = l7l;
        this.A01 = userSession;
        this.A02 = mVo;
    }

    public final C59974Jcj AWf(Context context, Drawable drawable, C62592KiP kiP) {
        String upperCase = context.getResources().getString(2131968277).toUpperCase(context.getResources().getConfiguration().locale);
        if (!this.A00.A03) {
            upperCase = null;
        }
        return new C61719KJk(drawable, upperCase);
    }
}
