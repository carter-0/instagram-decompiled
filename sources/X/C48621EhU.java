package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EhU  reason: case insensitive filesystem */
public abstract class C48621EhU {
    public static final Object A00(C307896Rx r4) {
        FragmentActivity A04 = C308206Td.A04(r4);
        UserSession A0Z = DbT.A0Z(r4);
        Bundle A0a = AnonymousClass7TE.A0a();
        String str = A0Z.A05;
        DbS.A1A(A0a, str);
        C309516Yo A0Q = DbU.A0Q(A04, A0Z);
        A0Q.A0B(A0a, SAY.A01(str, C273654mx.A00(970), A04.getApplicationContext().getString(2131965135)));
        A0Q.A04();
        return null;
    }
}
