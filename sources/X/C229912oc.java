package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2oc  reason: invalid class name and case insensitive filesystem */
public abstract class C229912oc implements C250603lj {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C229842oQ A02;
    public final Map A03;

    public final void A00(AnonymousClass30Y r4, C252093oY r5) {
        int intValue = r5.CEk(r4).intValue();
        if (intValue == 0 || intValue == 1) {
            ((C229902ob) this).A09.put(r4.A05, Float.valueOf(r5.CFe(r4)));
        } else {
            ((C229902ob) this).A09.remove(r4.A05);
        }
    }

    public C229912oc(UserSession userSession, AnonymousClass4DU r2, C229842oQ r3, Map map) {
        this.A01 = r2;
        this.A00 = userSession;
        this.A02 = r3;
        this.A03 = map;
    }
}
