package X;

import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import java.util.HashMap;

/* renamed from: X.UcO  reason: case insensitive filesystem */
public final class C15412UcO extends C361178fn {
    public final int A00;
    public final Object A01;

    public C15412UcO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A04(C268654dm r1) {
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        C3034368u r6 = (C3034368u) obj;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r6, 0);
                RecentAdActivityFragment recentAdActivityFragment = ((C55591HkB) this.A01).A00.A00;
                recentAdActivityFragment.A02 = r6;
                C54223H3s h3s = recentAdActivityFragment.A00;
                if (h3s == null) {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    h3s.A0C();
                    return;
                }
            case 1:
                HashMap hashMap = new HashMap();
                C15399Uc3 uc3 = (C15399Uc3) this.A01;
                hashMap.put("abc", uc3.A03);
                C273694n2 r2 = new C273694n2(uc3.requireContext());
                C51968G9o.A1D(r2, -2);
                uc3.A00.addView(r2);
                AnonymousClass6NR A002 = AnonymousClass6NS.A00(uc3.requireContext(), r6, uc3.A01);
                A002.A01 = hashMap;
                AnonymousClass6NS A003 = A002.A00();
                uc3.A02 = A003;
                A003.A07(r2);
                return;
            case 2:
                0qQ.A0B(r6, 0);
                C15682Ugn ugn = ((C15677Ugi) this.A01).A03.A00;
                ugn.A00 = r6;
                ugn.A01.D7q(r6);
                return;
            case 3:
                0qQ.A0B(r6, 0);
                C15676Ugh ugh = ((C15679Ugk) this.A01).A03.A00;
                ugh.A00 = r6;
                ugh.A02.DUn(r6);
                return;
            default:
                0qQ.A0B(r6, 0);
                ((C15685Ugq) this.A01).A00.CyT(r6);
                return;
        }
    }
}
