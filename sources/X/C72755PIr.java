package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PIr  reason: case insensitive filesystem */
public final class C72755PIr implements AnonymousClass5IX {
    public final int A00;
    public final 2Ix A01;

    public final boolean E1z(AnonymousClass5IY r3) {
        int i;
        Integer A012 = this.A01.A01();
        0qQ.A07(A012);
        switch (A012.intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return AnonymousClass7TF.A1S(i, this.A00);
    }

    public C72755PIr(UserSession userSession, int i) {
        this.A00 = i;
        2Ix A002 = 2Ix.A00(userSession);
        0qQ.A07(A002);
        this.A01 = A002;
    }
}
