package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

public final class EQR extends H4J {
    public final AnonymousClass4DH A00;
    public final AnonymousClass0aP A01;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-468544590);
        int A032 = AnonymousClass0fD.A03(-216817479);
        AnonymousClass4DH r4 = this.A00;
        Context requireContext = r4.requireContext();
        FragmentActivity requireActivity = r4.requireActivity();
        AnonymousClass0aP r7 = this.A01;
        C48971En9.A00(requireContext, r4, requireActivity, DbT.A0M(r4, r7), r7, (DwI) obj, false);
        AnonymousClass0fD.A0A(-399613532, A032);
        AnonymousClass0fD.A0A(664811941, A03);
    }

    public EQR(AnonymousClass4DH r2, AnonymousClass0aP r3) {
        super(r2.getParentFragmentManager());
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-36817067);
        DbZ.A0s(2131972232);
        AnonymousClass0fD.A0A(1521090429, A03);
    }
}
