package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.Ft0  reason: case insensitive filesystem */
public final class C51368Ft0 implements Runnable {
    public final /* synthetic */ C47699EDi A00;
    public final /* synthetic */ DwX A01;

    public C51368Ft0(C47699EDi eDi, DwX dwX) {
        this.A00 = eDi;
        this.A01 = dwX;
    }

    public final void run() {
        C47448E2u e2u = (C47448E2u) this.A00.A01;
        e2u.A07.getClass();
        EVZ evz = e2u.A0E;
        EVZ evz2 = EVZ.ARGUMENT_TWOFAC_FLOW;
        if (evz == evz2) {
            DbT.A15();
            ArrayList arrayList = this.A01.A03;
            Bundle A0a = AnonymousClass7TE.A0a();
            C48975EnD.A00(A0a, evz2);
            A0a.putStringArrayList("backup_codes_key", arrayList);
            ESR esr = new ESR();
            Dbb.A12(esr, DbU.A0I(A0a, esr, e2u), e2u.A07);
            return;
        }
        C267674c0 targetFragment = e2u.getTargetFragment();
        if (targetFragment == null || !targetFragment.CIy()) {
            DbT.A1J(e2u);
        }
        AnonymousClass1Nd.A00(e2u.A07).A00(new AnonymousClass3DP(e2u.requireContext(), 0Gl.A02(e2u.A07), this.A01.A01));
    }
}
