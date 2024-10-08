package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.IjU  reason: case insensitive filesystem */
public final class C57975IjU implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xj A04;

    public C57975IjU(Activity activity, Context context, AnonymousClass0iw r3, UserSession userSession, 1Xj r5) {
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = r5;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void run() {
        C358248ab A0Y = DbS.A0Y(this.A01);
        A0Y.A09(2131972158);
        A0Y.A08(2131972156);
        UserSession userSession = this.A03;
        1Xj r2 = this.A04;
        Activity activity = this.A00;
        A0Y.A0I(new C50026FJl(38, (Object) activity, (Object) userSession, (Object) r2), 2131972157);
        A0Y.A0G(new C50026FJl(39, (Object) activity, (Object) userSession, (Object) this.A02), 2131972155);
        A0Y.A0H(C56715I8v.A00, 2131960862);
        DbT.A1V(A0Y);
    }
}
