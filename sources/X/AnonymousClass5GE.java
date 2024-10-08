package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.5GE  reason: invalid class name */
public final class AnonymousClass5GE extends AnonymousClass3PS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5G8 A01;

    public AnonymousClass5GE(AnonymousClass5G8 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void A01(Map map) {
        Collection values = map.values();
        int i = this.A00;
        AnonymousClass5G8 r0 = this.A01;
        UserSession userSession = r0.A02;
        Integer num = r0.A03;
        GWQ.A01(r0.A00, r0.A01, userSession, num, values, r0.A06, i, r0.A07, r0.A08);
    }
}
