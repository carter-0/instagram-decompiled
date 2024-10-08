package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.8as  reason: invalid class name and case insensitive filesystem */
public final class C358418as {
    public boolean A00;
    public boolean A01;
    public final C358448av A02;

    public C358418as(AnonymousClass0iw r5, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r5, 2);
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        this.A02 = C358428at.A01(r5, userSession, obj, 182.A06(0Tu.A05, userSession, 36311173938872779L));
    }

    public final void A00() {
        if (!this.A00) {
            this.A02.CkR();
            this.A00 = true;
        }
    }

    public final void A01() {
        if (!this.A01) {
            this.A02.CkS();
            this.A01 = true;
        }
    }

    public final void A02(String str, String str2, int i) {
        this.A02.CkL(OVV.A00((Integer) null, C66579MXk.A00(165), str, "USER", (String) null, "server"), AnonymousClass05K.A0N, AnonymousClass05K.A0C, str2, "", i);
    }
}
