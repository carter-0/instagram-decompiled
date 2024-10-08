package X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;

/* renamed from: X.Edz  reason: case insensitive filesystem */
public abstract class C48404Edz {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        if (r6.A00.size() >= 1) {
            String str = (String) DbW.A0g(r6, 0);
            0qQ.A0B(str, 0);
            String replace = str.replace('_', '-');
            0qQ.A07(replace);
            if (!TextUtils.isEmpty(replace)) {
                Iterator it = FEP.A01.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C47271Dtz dtz = (C47271Dtz) it.next();
                    if (dtz.A02.equals(replace)) {
                        FEP.A01(DbT.A04(), dtz);
                        break;
                    }
                }
            }
            FragmentActivity A04 = C308206Td.A04(r5);
            Intent A09 = DbS.A09();
            A09.setClassName(A04, "com.instagram.nux.activity.BloksSignedOutFragmentActivity");
            A09.setFlags(67108864);
            0kR.A0B(A04, A09);
        }
        return null;
    }
}
