package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Map;

/* renamed from: X.Dhq  reason: case insensitive filesystem */
public abstract class C46610Dhq {
    public static final Handler A00 = AnonymousClass7TF.A0D();

    public static AnonymousClass4D6 A00(Fragment fragment, AnonymousClass4D6 r2, String str, String str2) {
        if (str.equals("long-live")) {
            return new FZ4();
        }
        if (fragment == null || fragment.isAdded()) {
            return r2;
        }
        0wb.A03("bloks_stale_async_action", 002.A0g("Async action tried to schedule app ID ", str2, " but host is already detached."));
        return null;
    }

    public static Object A01(C307896Rx r9, AnonymousClass6Tm r10) {
        String str;
        String str2 = (String) r10.A01();
        List list = r10.A00;
        Map map = (Map) list.get(1);
        C277014uI A0R = DbV.A0R(list, 2);
        C277014uI A0R2 = DbV.A0R(list, 3);
        String str3 = "current-screen";
        if (list.size() > 4) {
            str = DbU.A0t(list, 4);
        } else {
            str = str3;
        }
        C307896Rx r5 = r9;
        C308206Td.A09(r9);
        if (str != null) {
            str3 = str;
        }
        AnonymousClass4D6 A002 = A00(C308206Td.A02(r9), C308206Td.A0C(r9), str3, str2);
        if (A002 != null) {
            C360678ey A04 = C359988do.A04(C308206Td.A0B(r9), str2, C308206Td.A0H(map));
            A04.A00(new C47559E7x(r5, A0R, A0R2, str2, 0));
            A002.schedule(A04);
        }
        return null;
    }
}
