package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.List;

/* renamed from: X.6Vl  reason: invalid class name and case insensitive filesystem */
public final class C308746Vl implements AnonymousClass3CG {
    public final int A00;
    public final UserSession A01;
    public final String A02;
    public final boolean A03;
    public final int A04;

    public final int BU3() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ void DMH(Object obj, int i) {
        IgShowreelComposition BwC;
        int i2;
        C250973mM r9 = (C250973mM) obj;
        0qQ.A0B(r9, 0);
        UserSession userSession = this.A01;
        List A002 = C250973mM.A00(userSession, r9);
        int size = A002.size();
        int i3 = this.A00;
        if (size > i3) {
            size = i3;
        }
        int i4 = r9.A0H.A00;
        if (!this.A03 && i4 != 0 && size > (i2 = i4 + 1)) {
            size = i2;
        }
        for (int i5 = 0; i5 < size; i5++) {
            C255773uh r0 = (C255773uh) A002.get(i5);
            1Xj r1 = r0.A0b;
            if (!(r1 == null || !C297785sK.A0c(r0) || (BwC = r1.A0C.BwC()) == null)) {
                AnonymousClass6OH.A00(userSession).A01(BwC.AqT(), this.A02, BwC.Acn());
            }
        }
    }

    public C308746Vl(UserSession userSession, String str, int i, int i2, boolean z) {
        this.A01 = userSession;
        this.A02 = str;
        this.A04 = i;
        this.A00 = i2;
        this.A03 = z;
    }
}
