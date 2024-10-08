package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8CM  reason: invalid class name */
public final class AnonymousClass8CM implements AnonymousClass8CN {
    public final AnonymousClass8CN A00;
    public final AnonymousClass84S A01;
    public final UserSession A02;
    public final List A03;
    public final List A04;

    public final void AUy(AnonymousClass8CQ r2, boolean z) {
        this.A00.AUy(r2, z);
    }

    public AnonymousClass8CM(AnonymousClass84S r2, UserSession userSession, List list, List list2) {
        AnonymousClass8CN r0;
        this.A01 = r2;
        this.A03 = list;
        this.A02 = userSession;
        this.A04 = list2;
        if (r2 != null) {
            r0 = new AQ6(r2, list);
        } else {
            r0 = new AnonymousClass8CO(userSession, list2);
        }
        this.A00 = r0;
    }
}
