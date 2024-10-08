package X;

import com.instagram.common.session.UserSession;

public final class IT4 implements C270594gz {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IT4(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void A8S(C254523sc r3, AnonymousClass4DU r4, String str) {
        UserSession userSession;
        int i = this.A00;
        0qQ.A0B(r3, 2);
        Object obj = this.A02;
        switch (i) {
            case 0:
                userSession = ((HF3) obj).A00;
                break;
            case 1:
                userSession = ((C52486GUo) obj).A01;
                break;
            default:
                userSession = ((HF2) obj).A00;
                break;
        }
        r3.A0K(userSession, (AnonymousClass3OA) this.A01);
    }
}
