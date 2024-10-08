package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.List;

/* renamed from: X.Nrx  reason: case insensitive filesystem */
public abstract class C69774Nrx {
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.1pl] */
    public static Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        AnonymousClass0iw os1;
        String str = (String) r11.A01();
        List list = r11.A00;
        String A0t = DbU.A0t(list, 1);
        String A0t2 = DbU.A0t(list, 2);
        if (TextUtils.isEmpty(A0t)) {
            os1 = C308206Td.A08(r10);
        } else {
            os1 = new C71860Os1(A0t);
        }
        UserSession A0B = C308206Td.A0B(r10);
        FragmentActivity A04 = C308206Td.A04(r10);
        C21270XRp xRp = (C21270XRp) EnumHelper.A00(str, C21270XRp.A1F);
        if (C66581MXm.A1a(AnonymousClass7TF.A1W(xRp, C21270XRp.A02))) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString(AnonymousClass000.A00(4450), os1.getModuleName());
            A0a.putString("location", str);
            A0a.putString(Dbp.A00(), A0t2);
            DbU.A0w(A04, A0a, A0B, ModalActivity.class, "account_status");
            return null;
        }
        if (1pl.A00 == null) {
            1pl.A00 = new Object();
        }
        1pl A00 = O3B.A00();
        Dba.A0j(1, A04, A0B);
        AnonymousClass7TF.A1C(os1, 2, xRp);
        1pl.A00(A04, os1, A0B, xRp, A00, A0t2, (String) null).A04();
        return null;
    }
}
