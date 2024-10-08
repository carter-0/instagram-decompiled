package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Llv  reason: case insensitive filesystem */
public final class C65018Llv implements MTV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C357038Wf A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    public C65018Llv(Context context, UserSession userSession, C357038Wf r3, List list, boolean z) {
        this.A04 = z;
        this.A00 = context;
        this.A03 = list;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final void Doh(List list) {
        if (this.A04) {
            Context context = this.A00;
            List list2 = this.A03;
            UserSession userSession = this.A01;
            C65019Llw llw = new C65019Llw(this.A02, list);
            C290815g0 r1 = new C290815g0(new C66091MAy(context, userSession, list2, true), 468);
            r1.A00 = new C61671KGv(llw);
            1ES.A03(r1);
            return;
        }
        11Z.A02(new C65966M6d(this.A02, list));
    }

    public final void onFailure(Exception exc) {
        11Z.A02(new C65965M6c(this.A02, exc));
    }
}
