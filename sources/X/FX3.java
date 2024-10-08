package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

public final class FX3 implements 1wn {
    public final /* synthetic */ C47448E2u A00;

    public FX3(C47448E2u e2u) {
        this.A00 = e2u;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        String str;
        int A03 = AnonymousClass0fD.A03(240669527);
        C50262FVt fVt = (C50262FVt) obj;
        int A032 = AnonymousClass0fD.A03(1144252275);
        C47448E2u e2u = this.A00;
        Bundle bundle = e2u.mArguments;
        if (!(bundle == null || bundle.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER) == null)) {
            Bundle bundle2 = e2u.mArguments;
            if (bundle2 != null) {
                str = bundle2.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER);
            } else {
                str = null;
            }
            if (str.equals(fVt.A02)) {
                Context requireContext = e2u.requireContext();
                String string = e2u.getString(2131961740);
                String str2 = fVt.A01;
                if (TextUtils.isEmpty(str2)) {
                    str2 = DbZ.A0j(e2u);
                }
                C49952FGh.A06(requireContext, str2, string);
                i = -1521928810;
                AnonymousClass0fD.A0A(i, A032);
                AnonymousClass0fD.A0A(-1497926542, A03);
            }
        }
        i = 1940679066;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-1497926542, A03);
    }
}
