package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6bx  reason: invalid class name and case insensitive filesystem */
public final class C310996bx implements C250603lj {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C310666bQ A02;
    public final Map A03 = new HashMap();

    public final void ATF(AnonymousClass30Y r14, C252093oY r15) {
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        float CFe = r15.CFe(r14);
        long BlK = r15.BlK();
        C255773uh r8 = (C255773uh) r14.A03;
        Object obj = r14.A04;
        AnonymousClass6YY r7 = (AnonymousClass6YY) obj;
        boolean z = r7.A02.A18;
        0qQ.A0A(r8);
        0qQ.A06(obj);
        UserSession userSession = this.A00;
        String A0g = 002.A0g(r8.ByO(userSession), r8.A0j, "viewport");
        boolean z2 = false;
        if (Float.compare(CFe, 0.99f) > 0) {
            z2 = true;
        }
        Map map = this.A03;
        boolean containsKey = map.containsKey(A0g);
        if (!z2) {
            if (containsKey) {
                Object obj2 = map.get(A0g);
                if (obj2 != null) {
                    long j = BlK - ((C305776Jm) obj2).A00;
                    AnonymousClass4DU r6 = this.A01;
                    C310666bQ r1 = this.A02;
                    AnonymousClass6KG A002 = AnonymousClass6KF.A00(r6, r7.A00.A0H, r1.A03);
                    C254523sc A022 = GTA.A02(userSession, A002, r8, "viewability");
                    AnonymousClass3PI.A08(A022, r8, r7, r1);
                    A022.A02();
                    A022.A01 = (double) (((float) j) / 1000.0f);
                    A022.A0U = 100;
                    A022.A7R = "viewport";
                    A022.A1Y = Boolean.valueOf(z);
                    C233822wX.A0I(userSession, A022, A002, AnonymousClass05K.A01);
                    map.remove(A0g);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else if (!containsKey) {
            map.put(A0g, new C305776Jm(r8, "viewport", BlK, z));
        }
    }

    public C310996bx(C310666bQ r2) {
        this.A02 = r2;
        this.A01 = r2.A02;
        this.A00 = r2.A01;
    }
}
