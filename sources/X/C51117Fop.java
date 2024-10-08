package X;

import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Fop  reason: case insensitive filesystem */
public final class C51117Fop implements C51892G6h {
    public final C51115Fon A00;
    public final C51119For A01;
    public final Context A02;
    public final FoaUserSession A03;

    public C51117Fop(Context context, FoaUserSession foaUserSession) {
        0qQ.A0B(foaUserSession, 1);
        this.A03 = foaUserSession;
        this.A02 = context;
        this.A00 = new C51115Fon(foaUserSession);
        this.A01 = new C51119For(foaUserSession);
    }

    public final void E3m() {
        this.A00.E3m();
        this.A01.E3m();
    }
}
