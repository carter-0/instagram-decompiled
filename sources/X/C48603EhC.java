package X;

import android.os.Bundle;
import com.instagram.modal.ModalActivity;

/* renamed from: X.EhC  reason: case insensitive filesystem */
public abstract class C48603EhC {
    public static Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        int A0M = AnonymousClass7TE.A0M(r8.A01());
        String str = (String) r8.A02();
        C277014uI A0O = DbW.A0O(r8);
        0lg A0B = C308206Td.A0B(r7);
        AnonymousClass6SM.A00 = new C49451Evs(r7, A0O);
        Bundle A0B2 = DbV.A0B(str, 1);
        A0B2.putInt("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_SECONDS", A0M);
        A0B2.putString(AnonymousClass000.A00(555), str);
        Dba.A0K(C308206Td.A04(r7), A0B2, A0B, ModalActivity.class, C273654mx.A00(1430)).A0A(C308206Td.A04(r7), 1003);
        return null;
    }
}
