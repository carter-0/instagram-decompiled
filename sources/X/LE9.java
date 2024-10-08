package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class LE9 {
    public C344207rU A00;
    public C63839L8u A01;
    public final Context A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final Handler A04;
    public final UserSession A05;
    public final Runnable A06 = new M2B(this);
    public final List A07 = new LinkedList();
    public volatile boolean A08;

    public final void A00(List list) {
        if (!this.A08) {
            synchronized (this) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C63804L7k l7k = (C63804L7k) it.next();
                    boolean z = false;
                    List list2 = this.A07;
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C63804L7k l7k2 = (C63804L7k) it2.next();
                        if (l7k2.A00 == l7k.A00 && !l7k2.A03.get()) {
                            z = true;
                            break;
                        }
                    }
                    list2.add(l7k);
                    if (z) {
                        it.remove();
                    }
                }
            }
            if (!list.isEmpty()) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    C63804L7k l7k3 = (C63804L7k) it3.next();
                    A1C.add(new L66(l7k3.A02, l7k3.A03, l7k3.A00));
                }
                this.A04.post(new M67(this, A1C));
            }
        }
    }

    public LE9(Context context, UserSession userSession) {
        this.A02 = context;
        this.A05 = userSession;
        Handler BAM = new C343897qz().BAM("Lite-Controller-Thread");
        this.A04 = BAM;
        BAM.post(new M2C(this));
    }
}
