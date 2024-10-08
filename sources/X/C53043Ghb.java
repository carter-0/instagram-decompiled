package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveHomeViewModel$makeRequest$1;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ghb  reason: case insensitive filesystem */
public final class C53043Ghb extends 2YL implements JQJ {
    public 05G A00 = C51967G9n.A0u();
    public final UserSession A01;
    public final C55735HmW A02 = new Object();
    public final String A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.HmW, java.lang.Object] */
    public C53043Ghb(UserSession userSession, String str, List list, List list2, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        C51972G9s.A1E(list, list2);
        this.A01 = userSession;
        this.A03 = str;
        this.A06 = z;
        this.A07 = z2;
        this.A04 = list;
        this.A05 = list2;
    }

    public static final void A00(C53043Ghb ghb, C62320sa r10, boolean z) {
        C53043Ghb ghb2 = ghb;
        Integer num = ghb.A02.A00;
        Integer num2 = AnonymousClass05K.A00;
        if (num != num2) {
            C318136oS A002 = C318116oQ.A00(ghb);
            1Eo.A03(num2, 19B.A00, new SaveHomeViewModel$makeRequest$1(ghb2, (AnonymousClass4D7) null, r10, z, true), A002);
        }
    }

    public final void AAU(SavedCollection savedCollection) {
        05G r7 = this.A00;
        C54702HPh hPh = (C54702HPh) r7.getValue();
        if (hPh instanceof HE6) {
            HE6 he6 = (HE6) hPh;
            ArrayList A0U = 00k.A0U(he6.A00);
            Iterator it = A0U.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((SavedCollection) it.next()).A07 != C54665HMw.MEDIA) {
                    i++;
                } else if (i != -1) {
                    A0U.add(i, savedCollection);
                }
            }
            A0U.add(savedCollection);
            r7.Epw(new HE6(A0U, he6.A01));
        }
    }

    public final void EB9(C62320sa r3) {
        if (this.A02.A00 != AnonymousClass05K.A00) {
            A00(this, r3, true);
        }
    }

    public final void EDU(String str) {
        05G r5 = this.A00;
        C54702HPh hPh = (C54702HPh) r5.getValue();
        if (hPh instanceof HE6) {
            HE6 he6 = (HE6) hPh;
            List list = he6.A00;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                DbY.A1T(((SavedCollection) next).A0F, str, next, A1C);
            }
            r5.Epw(new HE6(A1C, he6.A01));
        }
    }
}
