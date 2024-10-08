package X;

import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Foo  reason: case insensitive filesystem */
public final class C51116Foo implements C51892G6h {
    public final C51120Fos A00;
    public final Context A01;
    public final FoaUserSession A02;

    public final void E3m() {
        this.A00.E3m();
    }

    public C51116Foo(Context context, FoaUserSession foaUserSession) {
        this.A02 = foaUserSession;
        this.A01 = context;
        this.A00 = new C51120Fos(context, foaUserSession);
    }
}
