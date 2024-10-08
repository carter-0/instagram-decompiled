package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.meta.foa.session.FoaUserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Fon  reason: case insensitive filesystem */
public final class C51115Fon implements C51892G6h {
    public final 05G A00 = DbS.A10(new HHG(0sn.A00, 0));
    public final FoaUserSession A01;

    public final void E3m() {
        FoaUserSession foaUserSession = this.A01;
        0qQ.A0B(foaUserSession, 0);
        C49712F2x f2x = FRS.A01;
        UserSession A002 = C56316HwT.A00(foaUserSession);
        Context context = C60960kU.A00;
        0qQ.A07(context);
        ArrayList A003 = f2x.A00(context, A002);
        ArrayList A0r = AnonymousClass7TG.A0r(A003);
        Iterator it = A003.iterator();
        while (it.hasNext()) {
            A0r.add(C49257Es0.A00((Map) it.next()));
        }
        this.A00.Epw(new HHG(A0r, A0r.size()));
    }

    public C51115Fon(FoaUserSession foaUserSession) {
        this.A01 = foaUserSession;
    }
}
