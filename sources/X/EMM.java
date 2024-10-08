package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;

public final class EMM extends C47659EBt {
    public final /* synthetic */ C47476E4a A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EMM(Fragment fragment, 0lg r2, C47476E4a e4a, C46634DiE diE) {
        super(fragment, r2, diE);
        this.A00 = e4a;
    }

    public final void A00(DwY dwY) {
        int A03 = AnonymousClass0fD.A03(-2021049851);
        C47476E4a e4a = this.A00;
        02m.A0p.markerPoint(725096125, "network_request_complete");
        if (!dwY.A08) {
            super.A00(dwY);
            C47476E4a.A02(e4a, "sms");
        } else if (e4a.getActivity() != null && e4a.isResumed()) {
            C49721F3j A0X = DbW.A0X();
            String str = dwY.A05;
            String str2 = e4a.A08;
            C49922FEx fEx = e4a.A06;
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putAll(fEx.A00);
            E3X A032 = A0X.A03(A0a, str, str2, false);
            Dbb.A14(A032, e4a.requireActivity(), e4a.A05);
            FGJ fgj = FGJ.A03;
            FragmentActivity requireActivity = e4a.requireActivity();
            AnonymousClass0aP r8 = e4a.A05;
            String str3 = dwY.A05;
            C46634DiE diE = C46634DiE.A1J;
            fgj.A03(requireActivity, r8, A032, diE, str3);
            0xI A05 = 1Q0.A1E.A02(e4a.A05).A05((EXD) null, diE);
            e4a.A06.A00.putString(DbX.A0s(C48071EUp.A09), "sms");
            e4a.A06.A03(A05);
            DbU.A1R(A05, e4a.A05);
        }
        AnonymousClass0fD.A0A(-1317322190, A03);
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(1766234409);
        super.onFail(r6);
        02m.A0p.markerAnnotate(725096125, TraceFieldType.FailureReason, "network_error");
        02m.A0p.markerEnd(725096125, 3);
        AnonymousClass0fD.A0A(1530869943, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(564147120);
        C47476E4a e4a = this.A00;
        if (e4a.mView != null) {
            e4a.A02.setVisibility(8);
        }
        if (e4a.getActivity() != null && e4a.isResumed()) {
            Dba.A0m(e4a.requireActivity(), 2dZ.A0t);
        }
        AnonymousClass0fD.A0A(1959804989, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(207741013);
        C47476E4a e4a = this.A00;
        e4a.A02.setVisibility(0);
        if (e4a.getActivity() != null && e4a.isResumed()) {
            Dba.A0n(e4a.requireActivity(), 2dZ.A0t);
        }
        AnonymousClass0fD.A0A(-1868586415, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1888600935);
        A00((DwY) obj);
        AnonymousClass0fD.A0A(2021144942, A03);
    }
}
