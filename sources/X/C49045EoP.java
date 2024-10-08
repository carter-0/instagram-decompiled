package X;

import java.util.ArrayList;

/* renamed from: X.EoP  reason: case insensitive filesystem */
public abstract class C49045EoP {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.F39, X.ENv] */
    public static final C47944ENv A00(FRM frm, 0sn r8) {
        0qQ.A0B(frm, 0);
        if (r8 == null) {
            r8 = 0sn.A00;
        }
        FET fet = new FET(frm);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int size = r8.size();
        for (int i = 0; i < size; i++) {
            Ez9 ez9 = (Ez9) r8.get(i);
            0qQ.A0B(ez9, 0);
            C48155EZx eZx = ez9.A00;
            if (eZx != null) {
                A1C.add(FET.A00(fet, eZx, ez9.A02));
            }
        }
        return new F39(A1C);
    }
}
