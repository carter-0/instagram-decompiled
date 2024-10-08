package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public abstract class V9T {
    public static final Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        String A0D;
        String str;
        Fragment fragment;
        Object A03 = r15.A03(0);
        0qQ.A0C(A03, AnonymousClass000.A00(5084));
        C3034368u r2 = (C3034368u) A03;
        C307786Rm r1 = r14.A03;
        if (r1 == null || (A0D = C9812Rha.A00(r1, r14, r2.A02).A0D()) == null) {
            return null;
        }
        String A0t = DbU.A0t(r15.A00, 1);
        C277014uI A0P = DbW.A0P(r15, 3);
        0lg A0R = DbW.A0R(r14);
        for (Integer num : AnonymousClass05K.A00(4)) {
            switch (num.intValue()) {
                case 1:
                    str = "bake_off";
                    break;
                case 2:
                    str = AnonymousClass000.A00(1602);
                    break;
                case 3:
                    str = "acqs";
                    break;
                default:
                    str = "asq";
                    break;
            }
            if (A0D.equals(str)) {
                int A00 = C14615TzM.A00(new VVJ(r14, A0P));
                int intValue = num.intValue();
                if (intValue == 2 || intValue == 0 || intValue == 3) {
                    fragment = IgFragmentFactoryImpl.A00().A01(Integer.valueOf(A00), A0D, A0t, (String) null);
                } else if (intValue != 1) {
                    return null;
                } else {
                    IgFragmentFactoryImpl.A00();
                    fragment = new AdBakeOffFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString(C273654mx.A00(104), A0t);
                    fragment.setArguments(bundle);
                }
                0qQ.A0A(fragment);
                Dbb.A0o((Bundle) null, fragment, C308206Td.A04(r14), A0R);
                return null;
            }
        }
        return null;
    }
}
