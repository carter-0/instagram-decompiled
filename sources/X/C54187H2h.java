package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.H2h  reason: case insensitive filesystem */
public final class C54187H2h extends F1F {
    public final int A00;
    public final Object A01;

    public C54187H2h(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A00(UserSession userSession) {
        switch (this.A00) {
            case 0:
                AnonymousClass7TF.A0D().postDelayed(new C51167Fpd((E47) this.A01), 200);
                return;
            case 1:
                ((C314186hn) this.A01).A0c.invoke();
                return;
            default:
                C55533HjF hjF = (C55533HjF) this.A01;
                if (hjF != null) {
                    hjF.A00.A0A.Ctx();
                    return;
                }
                return;
        }
    }
}
