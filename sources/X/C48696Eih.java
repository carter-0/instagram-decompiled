package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Eih  reason: case insensitive filesystem */
public abstract class C48696Eih {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        ArrayList A1C;
        String A0i = DbW.A0i(r8, 0);
        Integer A00 = C46621Di1.A00(DbV.A10((C276544tV) r8.A03(1), GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
        0qQ.A07(A00);
        FragmentActivity A04 = C308206Td.A04(r7);
        0qQ.A0A(A0i);
        C48060EUe eUe = new C48060EUe(A00);
        0qQ.A0B(A04, 0);
        0qQ.A0B(A0i, 1);
        List A03 = C46604Dhk.A03(C46604Dhk.A00(A04));
        if (A03 != null && !A03.isEmpty()) {
            A1C = AnonymousClass7TE.A1C();
            int size = A03.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    G9A g9a = (Fragment) A03.get(size);
                    if ((g9a instanceof G9A) && (g9a instanceof 0SM)) {
                        G9A g9a2 = (0SM) g9a;
                        A1C.add(g9a2);
                        if (g9a2.AJd(A0i)) {
                            break;
                        }
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        }
        A1C = AnonymousClass7TE.A1C();
        if (DbT.A1b(A1C)) {
            int size2 = A1C.size() - 1;
            for (int i2 = 0; i2 < size2; i2++) {
                G9A g9a3 = (0SM) A1C.get(i2);
                if (g9a3 != null) {
                    g9a3.APb(new C48059EUd(eUe.A00), (Runnable) null);
                }
            }
            G9A g9a4 = (0SM) A1C.get(A1C.size() - 1);
            if (g9a4 == null) {
                return null;
            }
            g9a4.FJH(eUe, A0i);
            return null;
        }
        throw AnonymousClass7TE.A0z("Cannot unwind without an existing bottom sheet.");
    }
}
