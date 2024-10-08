package X;

import android.content.Context;
import android.os.Bundle;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

public final class FX5 implements 1wn {
    public final /* synthetic */ C47448E2u A00;

    public FX5(C47448E2u e2u) {
        this.A00 = e2u;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        String str;
        String str2;
        int A03 = AnonymousClass0fD.A03(568315871);
        C50263FVu fVu = (C50263FVu) obj;
        int A032 = AnonymousClass0fD.A03(867191998);
        C47448E2u e2u = this.A00;
        Bundle bundle = e2u.mArguments;
        if (!(bundle == null || bundle.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER) == null)) {
            Bundle bundle2 = e2u.mArguments;
            if (bundle2 != null) {
                str = bundle2.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER);
            } else {
                str = null;
            }
            if (str.equals(fVu.A02)) {
                e2u.A07.getClass();
                1Ng A002 = AnonymousClass1Nd.A00(e2u.A07);
                Context requireContext = e2u.requireContext();
                String A02 = 0Gl.A02(e2u.A07);
                Bundle bundle3 = e2u.mArguments;
                if (bundle3 != null) {
                    str2 = bundle3.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER);
                } else {
                    str2 = null;
                }
                A002.A00(new AnonymousClass3DP(requireContext, A02, str2));
                C267674c0 targetFragment = e2u.getTargetFragment();
                if (targetFragment == null || !targetFragment.CIy()) {
                    DbT.A1J(e2u);
                }
                i = -1180807015;
                AnonymousClass0fD.A0A(i, A032);
                AnonymousClass0fD.A0A(-1126752921, A03);
            }
        }
        i = 867291248;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-1126752921, A03);
    }
}
