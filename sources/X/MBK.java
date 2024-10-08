package X;

import com.instagram.common.session.UserSession;

public final class MBK implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;

    public MBK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                return C311976dc.A04((C311976dc) this.A01, (AnonymousClass4D7) obj);
            case 2:
                KB5 kb5 = (KB5) this.A01;
                AnonymousClass514 r7 = (AnonymousClass514) obj;
                if (kb5.A0D == r7) {
                    return null;
                }
                kb5.A0D = r7;
                kb5.A0S.A05 = r7;
                KB5.A09(kb5);
                KB5.A0D(kb5, kb5.A0D);
                KB5.A06(kb5);
                KB5.A0A(kb5);
                return null;
            case 3:
                UserSession userSession = (UserSession) this.A01;
                GO1 go1 = (GO1) obj;
                if (!go1.A00.isEmpty()) {
                    AnonymousClass8A2 A012 = AnonymousClass8A1.A01(userSession);
                    A012.A0K.A09(A012.A01, AnonymousClass000.A00(820), go1.toString());
                    JW1.A00(userSession).A07(go1.toString());
                    break;
                }
                break;
            default:
                0sP r0 = (0sP) this.A01;
                AnonymousClass7TG.A1N(r0, obj);
                r0.invoke(obj);
                break;
        }
        return C60340gF.A00;
    }
}
