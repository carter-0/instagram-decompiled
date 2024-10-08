package X;

import java.util.List;

/* renamed from: X.AaY  reason: case insensitive filesystem */
public final class C40339AaY implements MTW {
    public final /* synthetic */ C39658A3y A00;

    public final void Doh(List list) {
        String str;
        AnonymousClass8Zl A002;
        C39658A3y a3y = this.A00;
        C349307zv r4 = (C349307zv) list.get(0);
        0qQ.A0B(r4, 0);
        AnonymousClass889 r5 = a3y.A00;
        C356848Vl r0 = r5.A02;
        if (r0 == null) {
            str = "visibilityControllerComponentProvider";
        } else if (r0.A00().A02 != 1) {
            28D r1 = r5.A06;
            AnonymousClass80D r2 = r5.A0B;
            int A003 = AnonymousClass9TT.A00(r1, r2, r5.A04);
            r4.A0d = r2.A2H;
            r4.A0o = r2.A2e;
            r4.A0F = A003;
            r4.A0m = r2.A2G;
            AnonymousClass8E5 r02 = r5.A03;
            if (!(r02 == null || (A002 = r02.A00()) == null)) {
                A002.Cmf(AnonymousClass7TE.A1I(r4));
            }
            AnonymousClass8VZ r12 = r5.A01;
            if (r12 != null) {
                r12.A01(C365808ni.A00, r4, false);
                return;
            }
            str = "capturedMediaProcessor";
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C40339AaY(C39658A3y a3y) {
        this.A00 = a3y;
    }

    public final void onFailure(Exception exc) {
        AnonymousClass889 r3 = this.A00.A00;
        0kD.A07(r3.A07.getModuleName(), 002.A0R("Error importing video: ", exc.getLocalizedMessage()), exc);
        AnonymousClass889.A00(r3);
    }
}
