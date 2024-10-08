package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;

/* renamed from: X.7jX  reason: invalid class name and case insensitive filesystem */
public final class C339397jX implements AnonymousClass2qY {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C339297jN A01;

    public C339397jX(UserSession userSession, C339297jN r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void DLW(Context context, AnonymousClass4UE r10, 2bv r11, String str) {
        AnonymousClass4UE r6 = r10;
        0qQ.A0B(r10, 1);
        if (r10.CA0().contains(Trigger.A1R)) {
            C339297jN r5 = this.A01;
            AnonymousClass4DH r1 = r5.A0B;
            UserSession userSession = this.A00;
            1OC A012 = LTC.A01(userSession);
            A012.A00 = new KAO(context, userSession, r5, r6, r11);
            r1.schedule(A012);
        }
    }
}
