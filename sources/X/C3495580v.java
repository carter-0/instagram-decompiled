package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.80v  reason: invalid class name and case insensitive filesystem */
public final class C3495580v implements C3495480u {
    public final /* synthetic */ C357638Yz A00;

    public C3495580v(C357638Yz r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C279284yO r5 = (C279284yO) obj;
        0qQ.A0B(r5, 0);
        C357638Yz r3 = this.A00;
        C279284yO r1 = r3.A02;
        if (!0qQ.A0K(r1, r5)) {
            if (r1 != null && !r1.A03 && r5.A03) {
                28D r0 = 28D.A0f;
                UserSession userSession = r3.A0A;
                C360908fL.A00(r0);
                C360908fL.A01(userSession, r5, 27p.A01(userSession).A04.A0L);
                C360908fL.A03(userSession, "ui_ready_to_interact", true);
            }
            r3.A02 = r5;
            AnonymousClass81O.A00(r3.A0A).A00 = r5;
            for (Map.Entry entry : r3.A0C.entrySet()) {
                C358088aL r02 = (C358088aL) entry.getKey();
                0qQ.A0A(r02);
                ((C3494680m) entry.getValue()).A04(Integer.valueOf(C352618Eb.A00(r02)));
            }
        }
    }
}
