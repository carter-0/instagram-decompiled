package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.Egj  reason: case insensitive filesystem */
public abstract class C48574Egj {
    public static Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        String obj = r5.A01().toString();
        FragmentActivity A04 = C308206Td.A04(r4);
        if (A04 instanceof BusinessConversionActivity) {
            Intent A09 = DbS.A09();
            A09.putExtra("EXTRA_SCREEN_ID", obj);
            Dba.A0k(A04, A09);
            return null;
        }
        0hq A05 = C308206Td.A05(r4);
        if (A05 == null) {
            return null;
        }
        A05.A0y(obj, 1);
        return null;
    }
}
