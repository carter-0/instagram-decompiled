package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GBr  reason: case insensitive filesystem */
public abstract class C52020GBr {
    public static final GKY A00(UserSession userSession, AnonymousClass93U r40, String str) {
        AnonymousClass93U r1 = r40;
        String str2 = str;
        int A02 = DbW.A02(1, str2, r1);
        UserSession userSession2 = userSession;
        1L5 A01 = 1L0.A01(userSession2, r1);
        0Tu r8 = 0Tu.A05;
        boolean A06 = 182.A06(r8, userSession2, 36318140376487834L);
        boolean A062 = 182.A06(r8, userSession2, 36318140377012128L);
        boolean A063 = 182.A06(r8, userSession2, 2342161149591492523L);
        C58719IwS iwS = new C58719IwS(A01, userSession2, str2, 26);
        C58719IwS iwS2 = new C58719IwS(A01, userSession2, str2, 27);
        C41566AwY awY = new C41566AwY(49, A01, userSession2);
        C58719IwS iwS3 = new C58719IwS(A01, userSession2, str2, 28);
        C58719IwS iwS4 = new C58719IwS(A01, userSession2, str2, 29);
        C58719IwS iwS5 = new C58719IwS(A01, userSession2, str2, 30);
        C58719IwS iwS6 = new C58719IwS(A01, userSession2, str2, 31);
        C58719IwS iwS7 = new C58719IwS(A01, userSession2, str2, 32);
        C58719IwS iwS8 = new C58719IwS(A01, userSession2, str2, 33);
        C58719IwS iwS9 = new C58719IwS(A01, userSession2, str2, 22);
        C58719IwS iwS10 = new C58719IwS(A01, userSession2, str2, 23);
        GL3 gl3 = new GL3(A02, A01, userSession2, A062);
        C58719IwS iwS11 = new C58719IwS(A01, userSession2, str2, 24);
        return new GKY(A01, str2, iwS, iwS2, awY, iwS3, iwS4, iwS5, iwS6, iwS7, iwS8, iwS9, iwS10, gl3, iwS11, new C58719IwS(A01, userSession2, str2, 25), A06, A062, A063, 182.A06(r8, userSession2, 36318140376422297L));
    }

    public static final String A02(C267324bN r0) {
        String id;
        1Xj r02 = r0.A02;
        if (r02 == null || (id = r02.getId()) == null) {
            return "n/a";
        }
        return id;
    }

    public static final C230482ph A01(UserSession userSession, C230472pg r5, C249763kK r6, String str) {
        AnonymousClass7TG.A1T(userSession, r6, str);
        return new C230482ph(userSession, new C230462pf(userSession, new C52021GBs(userSession, r6, str), new C230442pd(), C230432pc.CLIPS), r5);
    }
}
