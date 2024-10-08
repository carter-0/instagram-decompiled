package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KbY  reason: case insensitive filesystem */
public final class C62176KbY extends C62177KbZ {
    public M0X A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;

    public final M0X A01(Context context) {
        0qQ.A0B(context, 0);
        M0X m0x = this.A00;
        if (m0x != null) {
            return m0x;
        }
        UserSession userSession = this.A01;
        AnonymousClass0iw r1 = this.A00;
        M0X m0x2 = new M0X(context, AnonymousClass0kN.A01(r1, userSession), r1, userSession);
        this.A00 = m0x2;
        return m0x2;
    }

    public C62176KbY(AnonymousClass0iw r3, UserSession userSession) {
        super(r3, userSession, C313666go.BROADCASTER);
        this.A01 = AnonymousClass0eN.A01(C66292MMb.A01(userSession, 2));
        this.A03 = AnonymousClass0eN.A01(new C20614Wvv(33, r3, userSession));
        this.A02 = AnonymousClass0eN.A01(C66292MMb.A01(userSession, 3));
    }
}
