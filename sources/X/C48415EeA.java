package X;

import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.EeA  reason: case insensitive filesystem */
public abstract class C48415EeA {
    public static final Object A00(C307896Rx r29, AnonymousClass6Tm r30) {
        String A0H;
        int A03;
        G9A g9a;
        AnonymousClass6Tm r1 = r30;
        C276544tV A0M = DbW.A0M(r1, 0);
        Object A02 = r1.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
        C3034368u r6 = (C3034368u) A02;
        r1.A03(2);
        C307896Rx r4 = r29;
        if (r4.A03 == null || A0M == null || (A0H = A0M.A0H()) == null || -1 == (A03 = A0M.A03(40, -1))) {
            return null;
        }
        Map map = (Map) C299275ur.A00(r4, AnonymousClass6Tm.A01, A0M.A09());
        if (map == null) {
            return null;
        }
        C46645DiQ diQ = new C46645DiQ((SparseArray) null, (C51893G6j) null, (C51893G6j) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (HashMap) null, AnonymousClass7TE.A1C(), map, (Map) null, (Map) null, -1, A03, -1, -1, false, false);
        IgBloksScreenConfig A0N = DbS.A0N(DbU.A0V(r4));
        A0N.A0S = A0H;
        String A0I = A0M.A0I();
        FragmentActivity A08 = Dba.A08(r4);
        C48061EUf eUf = new C48061EUf(AnonymousClass05K.A0C);
        C359618dD A05 = A0N.A05();
        0qQ.A0B(A08, 0);
        G9A g9a2 = (G9A) C46604Dhk.A01(A08);
        if (!(g9a2 instanceof 0SM) || (g9a = (0SM) g9a2) == null) {
            throw AnonymousClass7TE.A0z("Cannot replace without an existing bottom sheet.");
        }
        G9A g9a3 = g9a;
        X5M Bcw = g9a3.Bcw(C16501Uvx.Bloks);
        0qQ.A0C(Bcw, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior");
        g9a3.EFL(C49954FGj.A01(A08, diQ, (C46601Dhh) Bcw, r6, A05, A0H), eUf, A0I);
        return null;
    }
}
