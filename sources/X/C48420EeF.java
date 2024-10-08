package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.fbpay.shoppay.IGShopPayCustomTabsActivity;
import java.util.List;

/* renamed from: X.EeF  reason: case insensitive filesystem */
public abstract class C48420EeF {
    public static Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        List list = r10.A00;
        Object obj = list.get(0);
        String A0t = DbU.A0t(list, 1);
        C277014uI A00 = C280064zw.A00(r10.A00());
        C277014uI A002 = C280064zw.A00(DbU.A0j(r10));
        try {
            FragmentActivity A04 = C308206Td.A04(r9);
            if (obj != null) {
                String obj2 = DbV.A08(DbW.A07((String) obj), Dbp.A00(), A0t).toString();
                Intent intent = new Intent(A04, IGShopPayCustomTabsActivity.class);
                intent.putExtra("extra_url", obj2);
                C308206Td.A0K(r9, new EED(0, r9, A00, A002));
                0kR.A05(DbU.A0H(r9), intent, 1);
                return null;
            }
            throw AnonymousClass7TE.A11(String.valueOf("Cannot parse a null url"));
        } catch (IllegalArgumentException | NullPointerException unused) {
            C308206Td.A0E(r9, C280064zw.A00(r10.A03(4)), new Object[0]);
            return null;
        }
    }
}
