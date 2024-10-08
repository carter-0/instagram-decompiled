package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6aE  reason: invalid class name and case insensitive filesystem */
public abstract class C309976aE {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.3kK, java.lang.Object, X.1L1] */
    public static final C238513Cd A00(UserSession userSession, AnonymousClass4DU r28, String str) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        String str2 = str;
        0qQ.A0B(str2, 2);
        ? obj = new Object();
        obj.A00 = str2;
        1L5 A01 = 1L0.A01(userSession2, obj);
        0Tu r12 = 0Tu.A05;
        boolean A06 = 182.A06(r12, userSession2, 36318140376487834L);
        boolean A062 = 182.A06(r12, userSession2, 36318140377012128L);
        boolean A063 = 182.A06(r12, userSession2, 2342161149591295912L);
        AnonymousClass4DU r11 = r28;
        AnonymousClass9MF r15 = new AnonymousClass9MF(45, r11, userSession2, A01);
        AnonymousClass9MF r14 = new AnonymousClass9MF(46, r11, userSession2, A01);
        AnonymousClass9MF r9 = new AnonymousClass9MF(47, r11, userSession2, A01);
        AnonymousClass9M1 r8 = new AnonymousClass9M1(7, r11, userSession2);
        AnonymousClass9MF r7 = new AnonymousClass9MF(48, r11, userSession2, A01);
        AnonymousClass9MF r6 = new AnonymousClass9MF(49, r11, userSession2, A01);
        AnonymousClass9MJ r5 = new AnonymousClass9MJ(0, r11, A01, userSession2);
        AnonymousClass9M1 r4 = new AnonymousClass9M1(8, A01, userSession2);
        AnonymousClass9M1 r3 = new AnonymousClass9M1(9, A01, userSession2);
        AnonymousClass9MA r2 = new AnonymousClass9MA(8, userSession2, A01, A062);
        boolean A064 = 182.A06(r12, userSession2, 36318140376356760L);
        boolean z = A062;
        AnonymousClass9MF r16 = r14;
        return new C238513Cd(r11, A01, r15, r16, r9, r8, r7, r6, r5, r4, r3, r2, A06, z, A063, A064);
    }

    public static final String A02(C255773uh r0) {
        String id;
        1Xj r02 = r0.A0b;
        if (r02 == null || (id = r02.getId()) == null) {
            return "n/a";
        }
        return id;
    }

    public static final ArrayList A03(UserSession userSession, C250973mM r4) {
        Reel reel = r4.A0H;
        ArrayList arrayList = new ArrayList();
        if (reel.A17(userSession)) {
            List<C255773uh> A0O = reel.A0O(userSession);
            0qQ.A07(A0O);
            for (C255773uh r0 : A0O) {
                1Xj r02 = r0.A0b;
                if (r02 != null) {
                    String id = r02.getId();
                    if (id != null) {
                        arrayList.add(id);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        return arrayList;
    }

    public static final AnonymousClass2y6 A01(UserSession userSession, AnonymousClass4DU r5, C270424gi r6, C249763kK r7) {
        C230422pb iYq;
        C230422pb iYr;
        boolean A01 = 1P7.A01(userSession);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36320670111572747L);
        if (A01) {
            if (A06) {
                iYr = new C308706Vh(userSession, r5, r6, r7);
            } else {
                iYr = new C57360IYr(userSession, r5, r6, r7);
            }
            return AnonymousClass2y5.A00(userSession, iYr, C230432pc.STORIES);
        }
        if (A06) {
            iYq = new C308706Vh(userSession, r5, r6, r7);
        } else {
            iYq = new C57359IYq(userSession, r5, r6, r7);
        }
        return AnonymousClass2y5.A00(userSession, iYq, C230432pc.STORIES);
    }
}
