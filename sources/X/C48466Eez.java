package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Eez  reason: case insensitive filesystem */
public abstract class C48466Eez {
    public static Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        Object obj;
        Object obj2;
        EVY evy;
        UserSession A0Z = DbT.A0Z(r9);
        FragmentActivity A04 = C308206Td.A04(r9);
        boolean A1U = AnonymousClass7TF.A1U(0, A0Z, A04);
        List list = r10.A00;
        String A0t = DbU.A0t(list, 0);
        C49519Ewy ewy = new C49519Ewy(r9, DbV.A0R(list, 2));
        Object obj3 = null;
        if (5 < list.size()) {
            obj = list.get(5);
        } else {
            obj = null;
        }
        String str = (String) obj;
        if (6 < list.size()) {
            obj2 = list.get(6);
        } else {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str2 == null || (evy = EVY.valueOf(str2)) == null) {
            evy = EVY.COLLECTION_CHOOSE_COVER;
        }
        if (7 < list.size()) {
            obj3 = list.get(7);
        }
        C249713kF.A00.A0T();
        E10 e10 = new E10();
        Bundle A09 = DbY.A09(A0Z);
        A09.putString(C273654mx.A00(88), A0t);
        A09.putString("product_id", str);
        A09.putString("merchant_id", (String) obj3);
        A09.putSerializable("product_guide_picker_entry_point", evy);
        e10.setArguments(A09);
        e10.A00 = ewy;
        C309516Yo A0M = DbS.A0M(A04, A0Z);
        A0M.A0B((Bundle) null, e10);
        A0M.A0E = A1U;
        A0M.A03();
        return null;
    }
}
