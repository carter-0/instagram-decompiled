package X;

import java.util.List;

/* renamed from: X.VBr  reason: case insensitive filesystem */
public abstract class C16939VBr {
    public static final VNC A00(C295745oq r3) {
        String A0R;
        C295755or r2 = r3.A02;
        if (r2.ordinal() == 1) {
            C295775ot r0 = r3.A01;
            0qQ.A0A(r0);
            if (r0.A0E == null) {
                A0R = C273654mx.A00(1215);
            } else {
                C295775ot r02 = r3.A01;
                0qQ.A0A(r02);
                List list = r02.A0E;
                if (list != null) {
                    return new VNC(new C3251571g(list, 0, list.size()));
                }
                throw AnonymousClass7TE.A0y();
            }
        } else {
            A0R = 002.A0R(C273654mx.A00(1411), r2.A00);
        }
        0wb.A03("DiscoverySectionTransformer", A0R);
        return null;
    }
}
