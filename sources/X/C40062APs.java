package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.APs  reason: case insensitive filesystem */
public final /* synthetic */ class C40062APs implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass80D A00;
    public final /* synthetic */ AnonymousClass825 A01;

    public /* synthetic */ C40062APs(AnonymousClass80D r1, AnonymousClass825 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onChanged(Object obj) {
        AnonymousClass80D r0 = this.A00;
        AnonymousClass825 r4 = this.A01;
        Boolean bool = (Boolean) obj;
        UserSession userSession = r0.A0S;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36327627958598215L) && bool.booleanValue() && r4.A03) {
            05G r2 = r4.A06;
            if (r2.getValue() != AnonymousClass826.CLOSED) {
                r2.Epw(AnonymousClass826.PENDING_CLOSE);
            }
        }
    }
}
