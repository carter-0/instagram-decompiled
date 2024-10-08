package X;

import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Eig  reason: case insensitive filesystem */
public abstract class C48695Eig {
    public static final Object A00(C307896Rx r35, AnonymousClass6Tm r36) {
        C51113Fol fol;
        C277014uI A0A;
        boolean z = false;
        AnonymousClass6Tm r1 = r36;
        Object A0p = DbT.A0p(r1, 0);
        0qQ.A0C(A0p, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r2 = (C276544tV) A0p;
        Object A02 = r1.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r4 = (C276544tV) A02;
        Object A00 = r1.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>");
        HashMap hashMap = (HashMap) A00;
        C307896Rx r3 = r35;
        C307786Rm A002 = C276734to.A00(r3, r1, 3);
        Map A0B = C46611Dhr.A0B(r3, r4, 38);
        C276544tV A03 = C46611Dhr.A03(C46611Dhr.A09(r2), 15932);
        if (A03 == null || (A0A = A03.A0A(40)) == null) {
            fol = null;
        } else {
            fol = new C51113Fol(r3, A0A, 3);
        }
        C229382nI A06 = C308206Td.A06(r3);
        int A003 = C48273Ebs.A00(A03);
        String A07 = C46611Dhr.A07(r2);
        String A062 = C46611Dhr.A06(r2);
        0sm A004 = C48297EcG.A00(hashMap);
        if (A004 == null) {
            A004 = 0Yt.A0E();
        }
        0qQ.A0C(A004, C66579MXk.A00(37));
        C46645DiQ diQ = new C46645DiQ((SparseArray) null, (C51893G6j) null, (C51893G6j) null, (Object) null, (String) null, A07, (String) null, (String) null, (HashMap) A004, AnonymousClass7TE.A1C(), (Map) null, A0B, A0B, -1, C46611Dhr.A00(r2), -1, -1, false, false);
        C49672F1e f1e = new C49672F1e(C308206Td.A0B(r3));
        boolean z2 = A06.A00;
        IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
        igBloksScreenConfig.A0c = z2;
        C46611Dhr.A0C(igBloksScreenConfig, A002, r3, r2);
        C3034368u A005 = C48717Ej2.A00(r3, r2);
        if (igBloksScreenConfig.A07 == null) {
            igBloksScreenConfig.A07 = A005;
        }
        igBloksScreenConfig.A0R = A062;
        C46611Dhr.A0D(igBloksScreenConfig, r2);
        String str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        String A0F = r4.A0F();
        if (A0F != null) {
            str = A0F;
        }
        Integer A006 = C46621Di1.A00(str);
        0qQ.A07(A006);
        if (A03 != null && A03.A0R(48, false)) {
            z = true;
        }
        FragmentActivity A04 = C308206Td.A04(r3);
        String A08 = C46611Dhr.A08(r2);
        C49954FGj.A02(A04, diQ, igBloksScreenConfig.A07, igBloksScreenConfig.A05(), new C46619Dhz((C46626Di6) null, fol, A006, A003, z), A08);
        return null;
    }
}
