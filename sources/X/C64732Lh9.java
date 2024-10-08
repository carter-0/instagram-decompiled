package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Lh9  reason: case insensitive filesystem */
public final class C64732Lh9 implements 1DN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4D6 A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ Integer A04;

    public C64732Lh9(Context context, UserSession userSession, AnonymousClass4D6 r3, User user, Integer num) {
        this.A03 = user;
        this.A01 = userSession;
        this.A04 = num;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void DWm(Map map) {
        Object obj = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        if (obj == C346927vz.GRANTED) {
            User user = this.A03;
            Integer num = this.A04;
            Context context = this.A00;
            AnonymousClass4D6 r3 = this.A02;
            C290815g0 r1 = new C290815g0(new C66088MAv(context, user, num), 481);
            KH1.A01(r1, context, 19);
            r3.schedule(r1);
        } else if (obj == C346927vz.DENIED_DONT_ASK_AGAIN) {
            W38.A02((Activity) this.A00, 2131974228);
        } else if (obj == C346927vz.DENIED) {
            C59689JTv.A07(this.A00, 2131967996);
        }
    }
}
