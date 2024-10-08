package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

public abstract class V9C {
    public static final Object A00(C307896Rx r4) {
        FragmentActivity A04 = C308206Td.A04(r4);
        0lg A0R = DbW.A0R(r4);
        C13990Tnq.A0h();
        Bundle bundle = new Bundle();
        DbS.A1B(bundle, "ads_manager");
        C15327Uab uab = new C15327Uab();
        uab.setArguments(bundle);
        return Dba.A0U(uab, new C309516Yo(A04, A0R));
    }
}
