package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Eia  reason: case insensitive filesystem */
public abstract class C48689Eia {
    public static final String A00(C307896Rx r32, AnonymousClass6Tm r33) {
        C51114Fom fom;
        G9A A00;
        C277014uI A0A;
        boolean z = false;
        AnonymousClass6Tm r3 = r33;
        Object A03 = r3.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r4 = (C276544tV) A03;
        String str = (String) DbW.A0d(r3);
        Object A002 = r3.A00();
        0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        Object A0j = DbU.A0j(r3);
        0qQ.A0C(A0j, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>");
        HashMap hashMap = (HashMap) A0j;
        C307896Rx r6 = r32;
        C307786Rm A003 = C276734to.A00(r6, r3, 4);
        Map A0B = C46611Dhr.A0B(r6, (C276544tV) A002, 36);
        C276544tV A032 = C46611Dhr.A03(C46611Dhr.A09(r4), 15932);
        if (A032 == null || (A0A = A032.A0A(40)) == null) {
            fom = null;
        } else {
            fom = new C51114Fom(A003, r6, A0A, 0);
        }
        String A07 = C46611Dhr.A07(r4);
        String A06 = C46611Dhr.A06(r4);
        0sm A004 = C48297EcG.A00(hashMap);
        if (A004 == null) {
            A004 = 0Yt.A0E();
        }
        0qQ.A0C(A004, C66579MXk.A00(37));
        C46645DiQ diQ = new C46645DiQ((SparseArray) null, (C51893G6j) null, (C51893G6j) null, (Object) null, (String) null, A07, (String) null, (String) null, (HashMap) A004, AnonymousClass7TE.A1C(), (Map) null, A0B, A0B, -1, C46611Dhr.A00(r4), -1, -1, false, false);
        C229382nI A062 = C308206Td.A06(r6);
        int A005 = C48273Ebs.A00(A032);
        if (A032 != null && A032.A0R(48, false)) {
            z = true;
        }
        0qQ.A0A(A003);
        C49672F1e f1e = new C49672F1e(C308206Td.A0A(A003));
        boolean z2 = A062.A00;
        IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
        igBloksScreenConfig.A0c = z2;
        C46611Dhr.A0C(igBloksScreenConfig, A003, r6, r4);
        C3034368u A006 = C48717Ej2.A00(r6, r4);
        if (igBloksScreenConfig.A07 == null) {
            igBloksScreenConfig.A07 = A006;
        }
        igBloksScreenConfig.A0R = A06;
        C46611Dhr.A0D(igBloksScreenConfig, r4);
        String A08 = C46611Dhr.A08(r4);
        Context context = A003.A00;
        C16400UuI uuI = new C16400UuI(fom, A005, z);
        C359618dD A05 = igBloksScreenConfig.A05();
        C3034368u r9 = igBloksScreenConfig.A07;
        0qQ.A0B(str, 1);
        C49954FGj fGj = C49954FGj.A00;
        List A033 = C46604Dhk.A03(C46604Dhk.A00(context));
        if (A033 == null || A033.isEmpty() || (A00 = C49954FGj.A00(fGj, str, A033)) == null) {
            1Kn.A02("CDSBloksBottomSheetController", "Cannot insert a new Screen without a valid bottom sheet - no bottom sheet contains the screen ID");
            return A08;
        }
        G9A g9a = A00;
        X5M Bcw = g9a.Bcw(C16501Uvx.Bloks);
        0qQ.A0C(Bcw, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior");
        g9a.CNT(C49954FGj.A01(context, diQ, (C46601Dhh) Bcw, r9, A05, A08), uuI, str);
        return A08;
    }
}
