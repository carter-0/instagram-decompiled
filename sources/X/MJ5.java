package X;

import com.instagram.common.session.UserSession;

public final class MJ5 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJ5(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object invoke;
        AnonymousClass07P r1;
        Object invoke2;
        switch (this.A00) {
            case 0:
                1Xj r2 = (1Xj) this.A01;
                r2.A00 = 1;
                r2.A0C.EUA(C51967G9n.A0j());
                AnonymousClass6Z5 r12 = (AnonymousClass6Z5) this.A02;
                UserSession userSession = r12.A09;
                if (userSession == null) {
                    DbS.A17();
                    throw AnonymousClass00P.createAndThrow();
                }
                r2.AE7(userSession);
                r12.A17.EHd();
                return C60340gF.A00;
            case 2:
            case 3:
                C62320sa r0 = (C62320sa) this.A01;
                if (r0 == null || (invoke = r0.invoke()) == null) {
                    return JTU.A08(this.A02);
                }
                return invoke;
            default:
                C62320sa r02 = (C62320sa) this.A01;
                if (r02 != null && (invoke2 = r02.invoke()) != null) {
                    return invoke2;
                }
                AnonymousClass07g A0c = C51969G9p.A0c(this.A02);
                if (!(A0c instanceof AnonymousClass07P) || (r1 = (AnonymousClass07P) A0c) == null) {
                    return AnonymousClass2YP.A00;
                }
                return r1.getDefaultViewModelCreationExtras();
        }
    }
}
