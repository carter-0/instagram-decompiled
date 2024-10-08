package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.io.IOException;

public final class WT2 implements AnonymousClass0lh {
    public C17364VSr A00;
    public C17365VSs A01;
    public AnonymousClass0u2 A02;
    public boolean A03 = false;
    public final C61480nO A04;
    public final AnonymousClass0u1 A05;

    public static synchronized WT2 A00(Context context, UserSession userSession) {
        WT2 wt2;
        Class<WT2> cls = WT2.class;
        synchronized (cls) {
            wt2 = (WT2) userSession.A00(cls);
            if (wt2 == null) {
                11Z.A06("Expects to be created on main thread");
                wt2 = new WT2(0nY.A00(), new AnonymousClass0us(new Handler()), new C17364VSr(context, userSession));
                userSession.A04(cls, wt2);
            }
        }
        return wt2;
    }

    public static void A01(WT2 wt2) {
        if (!wt2.A03) {
            C17364VSr vSr = wt2.A00;
            C17365VSs vSs = new C17365VSs();
            String string = vSr.A00.getString("operations", (String) null);
            if (string != null) {
                try {
                    vSs = C18221Vnl.parseFromJson(16P.A00(string));
                } catch (IOException e) {
                    0wb.A07("ViewStateModStore", e);
                }
            }
            wt2.A01 = vSs;
            wt2.A03 = true;
        }
    }

    public final void onSessionWillEnd() {
        AnonymousClass0u2 r1 = this.A02;
        r1.AWE();
        r1.Ent((AnonymousClass0u1) null);
    }

    public WT2(C61480nO r2, AnonymousClass0u2 r3, C17364VSr vSr) {
        C19361WWc wWc = new C19361WWc(this);
        this.A05 = wWc;
        this.A04 = r2;
        this.A02 = r3;
        r3.Ent(wWc);
        this.A00 = vSr;
    }
}
