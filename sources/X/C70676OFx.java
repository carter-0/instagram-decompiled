package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OFx  reason: case insensitive filesystem */
public final class C70676OFx {
    public final AnonymousClass0iw A00;
    public final AnonymousClass2t9 A01;
    public final UserSession A02;
    public final NK0 A03;
    public final Context A04;

    public C70676OFx(Context context, AnonymousClass0iw r7, UserSession userSession, NK0 nk0) {
        AnonymousClass7TG.A1Q(userSession, r7);
        this.A04 = context;
        this.A02 = userSession;
        this.A00 = r7;
        this.A03 = nk0;
        this.A01 = DbU.A0U(AnonymousClass2t9.A00(context), new NOP(this.A00, this.A02, new C72328P1t(this)));
    }
}
