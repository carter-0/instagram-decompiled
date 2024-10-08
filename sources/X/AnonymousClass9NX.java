package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9NX  reason: invalid class name */
public final class AnonymousClass9NX {
    public final 1aU A00;

    public AnonymousClass9NX(UserSession userSession) {
        String str;
        PyC pyC = new PyC(1US.A1D);
        pyC.A03 = AnonymousClass05K.A01;
        PyB pyB = new PyB(pyC);
        try {
            1RH.A00().A03(userSession, pyB);
            1RH.A00().A04(userSession, pyB);
            AnonymousClass7TG.A0v();
        } catch (UnsatisfiedLinkError e) {
            e = e;
            str = "SoLoader UnsatisfiedLinkError:";
        } catch (Exception e2) {
            e = e2;
            str = "SoLoader pytorch library exception:";
        }
        AnonymousClass1aS r1 = 1aD.A01(userSession, "MantleManager").A02;
        0qQ.A07(r1);
        this.A00 = r1.A0L(new C301215yk(userSession)).A0B();
        0wb.A06("MantleManager", str, e);
        AnonymousClass1aS r12 = 1aD.A01(userSession, "MantleManager").A02;
        0qQ.A07(r12);
        this.A00 = r12.A0L(new C301215yk(userSession)).A0B();
    }
}
