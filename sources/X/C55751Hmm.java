package X;

import android.app.Application;
import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Hmm  reason: case insensitive filesystem */
public final class C55751Hmm {
    public final Application A00;
    public final Context A01;
    public final FoaUserSession A02;

    public C55751Hmm(Application application, Context context, FoaUserSession foaUserSession) {
        AnonymousClass7TG.A1Q(foaUserSession, context);
        this.A00 = application;
        this.A02 = foaUserSession;
        this.A01 = context;
    }
}
