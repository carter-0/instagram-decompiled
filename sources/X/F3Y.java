package X;

import android.os.Bundle;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;

public final class F3Y {
    public final C47445E2r A01(Bundle bundle, Integer num, Integer num2, String str, boolean z) {
        0qQ.A0B(str, 1);
        bundle.putString("phone_number_or_email", str);
        if (num != null) {
            bundle.putString("two_fac_method", C48977EnF.A00(num));
        }
        bundle.putBoolean("two_fac_should_fetch_code", z);
        bundle.putString("two_fac_confirm_code_source", C48976EnE.A00(num2));
        C47445E2r e2r = new C47445E2r();
        e2r.setArguments(bundle);
        return e2r;
    }

    public final E4T A00(ArrayList arrayList, boolean z) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("arg_should_check_email", z);
        if (arrayList != null) {
            A0a.putStringArrayList("arg_backup_codes", arrayList);
        } else {
            A0a.putBoolean(Dbq.A05(0, 33, 94), true);
        }
        E4T e4t = new E4T();
        e4t.setArguments(A0a);
        return e4t;
    }

    public final C47435E2h A02(Integer num, boolean z, boolean z2) {
        String str;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("skip_landing_screen", z);
        A0a.putBoolean("direct_launch_backup_codes", z2);
        switch (num.intValue()) {
            case 0:
                str = "qp";
                break;
            case 1:
                str = "megaphone";
                break;
            case 2:
                str = "setting";
                break;
            case 3:
                str = "url";
                break;
            case 4:
                str = "bloks_extension";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE;
                break;
        }
        DbS.A1B(A0a, str);
        C47435E2h e2h = new C47435E2h();
        e2h.setArguments(A0a);
        return e2h;
    }
}
