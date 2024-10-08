package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EhI  reason: case insensitive filesystem */
public abstract class C48609EhI {
    public static final Object A00(C307896Rx r6) {
        UserSession A0Z = DbT.A0Z(r6);
        User A0j = DbT.A0j(A0Z);
        FragmentActivity A04 = C308206Td.A04(r6);
        if (A04 != null) {
            Dbb.A0o((Bundle) null, C46339Dch.A01().Cr3(A0Z, C46451DfE.A00(C46443Df5.FOLLOWERS, A0j.getId(), (String) null, false)), A04, A0Z);
        }
        return null;
    }
}
