package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.Egv  reason: case insensitive filesystem */
public abstract class C48586Egv {
    public static final Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        String str;
        String A0K;
        String A0K2;
        FragmentActivity A04 = C308206Td.A04(r12);
        C276544tV A0P = DbY.A0P(r13, 0);
        C46498Dg1 dg1 = new C46498Dg1(A04, C308206Td.A0B(r12));
        Iterator it = A0P.A0N(35).iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            C276544tV r9 = (C276544tV) it.next();
            FPE fpe = new FPE(10, (Object) r9, (Object) r12);
            String A0K3 = r9.A0K(34);
            if (A0K3 == null || A0K3.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                dg1.A0C(DbV.A11(r9, str, 38), fpe);
            } else if (A0K3.equals("destructive")) {
                dg1.A0A(DbV.A11(r9, str, 38), fpe);
            } else {
                String format = String.format("Got unexpected value: %s while parsing action sheet item style", Arrays.copyOf(new Object[]{A0K3}, 1));
                0qQ.A07(format);
                1Kn.A02("IgBloksNavigationExtensions", format);
            }
        }
        C276544tV A07 = A0P.A07(38);
        if (A07 != null) {
            String A0K4 = A07.A0K(35);
            C276544tV A072 = A0P.A07(40);
            if (A072 == null || (A0K2 = A072.A0K(35)) == null) {
                if (A0K4 != null) {
                    str = A0K4;
                }
                dg1.A08(str);
            } else {
                if (A0K4 != null) {
                    str = A0K4;
                }
                dg1.A0D(str, A0K2);
            }
        }
        C276544tV A073 = A0P.A07(36);
        if (!(A073 == null || (A0K = A073.A0K(36)) == null)) {
            dg1.A07(DbS.A0V(A0K));
        }
        AnonymousClass37D A0i = DbT.A0i(A04);
        if (A0i == null || !((AnonymousClass37F) A0i).A0g) {
            new C49945FFy(dg1).A03(A04);
            return null;
        }
        new C49945FFy(dg1).A04(A04);
        return null;
    }
}
