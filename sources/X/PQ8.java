package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

public final class PQ8 implements X77 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ PBV A01;

    public final void DCZ() {
    }

    public PQ8(UserSession userSession, PBV pbv) {
        this.A01 = pbv;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1qK, java.lang.Object] */
    public final void DK5(Drawable drawable) {
        this.A01.A08.setImageDrawable(drawable);
        AnonymousClass1Nd.A00(this.A00).A00(new Object());
    }
}
