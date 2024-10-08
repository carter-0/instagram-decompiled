package X;

import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.IjC  reason: case insensitive filesystem */
public final class C57957IjC implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FoaUserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C57957IjC(Context context, FoaUserSession foaUserSession, String str, String str2) {
        this.A00 = context;
        this.A01 = foaUserSession;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void run() {
        Context context = this.A00;
        FoaUserSession foaUserSession = this.A01;
        C49258Es1.A00(context, C51976G9y.A0H(), C55362HgU.A00, foaUserSession, new C55749Hmk(foaUserSession, this.A02, this.A03));
    }
}
