package X;

import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Map;

/* renamed from: X.Eif  reason: case insensitive filesystem */
public abstract class C48694Eif {
    public static Object A00(C307896Rx r28, AnonymousClass6Tm r29) {
        AnonymousClass6Tm r0 = r29;
        C276544tV A0M = DbW.A0M(r0, 0);
        Map map = (Map) r0.A00();
        if (A0M == null) {
            1Kn.A02("bk.action.cds.PushCdsBottomSheet", "Error opening CDS Bottom Sheet with a null screen.");
            return null;
        }
        C307896Rx r5 = r28;
        C307786Rm A09 = C308206Td.A09(r5);
        C229382nI A06 = C308206Td.A06(r5);
        String A07 = C46611Dhr.A07(A0M);
        String A062 = C46611Dhr.A06(A0M);
        C46645DiQ diQ = new C46645DiQ(new SparseArray(), (C51893G6j) null, (C51893G6j) null, (Object) null, (String) null, A07, (String) null, (String) null, C308206Td.A0H(map), AnonymousClass7TE.A1C(), (Map) null, (Map) null, (Map) null, -1, C46611Dhr.A00(A0M), -1, -1, false, false);
        C49672F1e f1e = new C49672F1e(C308206Td.A0B(r5));
        boolean z = A06.A00;
        IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
        igBloksScreenConfig.A0c = z;
        C46611Dhr.A0C(igBloksScreenConfig, A09, r5, A0M);
        C3034368u A00 = C48717Ej2.A00(r5, A0M);
        if (igBloksScreenConfig.A07 == null) {
            igBloksScreenConfig.A07 = A00;
        }
        igBloksScreenConfig.A0R = A062;
        C46611Dhr.A0D(igBloksScreenConfig, A0M);
        FragmentActivity A04 = C308206Td.A04(r5);
        String A08 = C46611Dhr.A08(A0M);
        C46619Dhz dhz = new C46619Dhz((C46626Di6) null, (X5O) null, (Integer) null, 32, false);
        C46645DiQ diQ2 = diQ;
        C49954FGj.A02(A04, diQ2, igBloksScreenConfig.A07, igBloksScreenConfig.A05(), dhz, A08);
        return null;
    }
}
