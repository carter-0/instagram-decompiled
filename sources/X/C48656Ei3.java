package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.Ei3  reason: case insensitive filesystem */
public abstract class C48656Ei3 {
    public static final Object A00(C307896Rx r23, AnonymousClass6Tm r24) {
        String str;
        boolean z;
        boolean z2;
        AnonymousClass6Tm r0 = r24;
        String A0h = DbY.A0h(r0, 0);
        C276544tV A0M = DbW.A0M(r0, 1);
        if (A0M != null) {
            str = A0M.A0F();
            z = A0M.A0R(35, true);
            z2 = A0M.A0T(false);
        } else {
            str = null;
            z = true;
            z2 = false;
        }
        String str2 = null;
        boolean z3 = !z2;
        if (str != null) {
            str2 = str;
        }
        C307896Rx r6 = r23;
        FragmentActivity A04 = C308206Td.A04(r6);
        0lg A0B = C308206Td.A0B(r6);
        A04.getSupportFragmentManager().A0v(new WE4(6, (Object) A0M, (Object) r6), A04, "on_failure");
        Bundle A0P = AnonymousClass7TG.A0P("IgSessionManager.SESSION_TOKEN_KEY", A0B.getToken(), AnonymousClass7TE.A1L("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", new SimpleWebViewConfig((String) null, (String) null, false, false, false, z3, false, true, false, false, z, z3, false, false, str2, A0h)));
        AnonymousClass4DH r02 = new AnonymousClass4DH();
        r02.setArguments(A0P);
        Dbb.A0o((Bundle) null, r02, A04, A0B);
        return null;
    }
}
