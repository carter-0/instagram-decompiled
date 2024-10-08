package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.V9c  reason: case insensitive filesystem */
public abstract class C16873V9c {
    public static final Object A00(C307896Rx r3, AnonymousClass6Tm r4) {
        String A0h = DbY.A0h(r4, 0);
        0lg A0B = C308206Td.A0B(r3);
        FragmentActivity A04 = C308206Td.A04(r3);
        0qQ.A0B(A0h, 0);
        AnonymousClass7TF.A1B(A0B, 1, A04);
        Bundle bundle = new Bundle();
        bundle.putString("igUserId", A0h);
        bundle.putString("stripeAccountInformationType", "BANK_ACCOUNT");
        1WM.getInstance();
        T8B A01 = new T8B(A0B).A01("IgPaymentsSettingsPaymentAddBankAccountRoute");
        A01.A00(bundle);
        A01.F08(A04).A04();
        return null;
    }
}
