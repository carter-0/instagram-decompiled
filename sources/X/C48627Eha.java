package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.Eha  reason: case insensitive filesystem */
public abstract class C48627Eha {
    public static Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        C276544tV r5 = (C276544tV) r7.A01();
        0lg A0B = C308206Td.A0B(r6);
        FragmentActivity A04 = C308206Td.A04(r6);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("bottom_sheet_content_fragment", "bloks");
        A0a.putInt("bloks_data", C46636DiG.A00(A0B).A01(r5));
        AnonymousClass6W8 A0b = DbS.A0b(A04, A0a, A0B, TransparentModalActivity.class, "bottom_sheet");
        C277014uI A0A = r5.A0A(40);
        if (A0A != null) {
            C308206Td.A0K(r6, new EEI(r6, A0A, 4));
            A0b.A0D(DbU.A0H(r6), 32779);
            return null;
        }
        A0b.A0C(A04);
        return null;
    }
}
