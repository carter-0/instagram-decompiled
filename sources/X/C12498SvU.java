package X;

import android.util.SparseArray;
import java.util.LinkedHashMap;

/* renamed from: X.SvU  reason: case insensitive filesystem */
public final class C12498SvU implements C13739TgB {
    public final /* synthetic */ C8608Qxp A00;
    public final /* synthetic */ Qn3 A01;

    public C12498SvU(C8608Qxp qxp, Qn3 qn3) {
        this.A01 = qn3;
        this.A00 = qxp;
    }

    public final void D0U() {
        this.A00.A07();
    }

    public final void D6J() {
        Qn3 qn3 = this.A01;
        SparseArray sparseArray = QCW.A06;
        C8269QnB qnB = qn3.A01;
        S2S s2s = qnB.A07;
        if (s2s != null) {
            AnonymousClass2gB r1 = qnB.A02;
            if (r1 == null) {
                r1 = s2s.A01;
                qnB.A02 = r1;
            }
            r1.A09(qnB.A0D);
            LinkedHashMap A06 = C2818159r.A06(qnB.A04);
            A06.put("target_name", "add_shoppay");
            Pxh.A1R(A06);
            qnB.A0E.Cgl("user_add_credential_enter", A06);
        }
        this.A00.A07();
    }
}
