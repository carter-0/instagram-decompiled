package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IoQ  reason: case insensitive filesystem */
public final class C58222IoQ extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58222IoQ(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z, boolean z2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A05 = z;
        this.A06 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        if (this.A00 != 0) {
            C18012Vjo vjo = (C18012Vjo) this.A04;
            C20910X4b x4b = (C20910X4b) vjo.A06.getValue();
            X4Z x4z = (X4Z) vjo.A04.getValue();
            C19542WbS wbS = new C19542WbS((UserSession) this.A03, (List) this.A01, this.A05, this.A06);
            return new C14200Trf(C18405Vr7.A00, x4z, x4b, wbS, (C337287g2) this.A02, 3, false);
        }
        boolean z = this.A06;
        C70817OMm oMm = (C70817OMm) this.A04;
        if (z) {
            oMm.A00();
        } else {
            FragmentActivity fragmentActivity = oMm.A00;
            UserSession userSession = oMm.A02;
            boolean z2 = this.A05;
            C69486NmU nmU = (C69486NmU) this.A01;
            C68150N2q A0S = oMm.A03.A0S();
            if (A0S != null) {
                str = A0S.A04;
            } else {
                str = null;
            }
            C55023Hau.A00(fragmentActivity, nmU, userSession, str, new C59361JGn(21, this.A03, oMm, this.A02), z2);
        }
        return C60340gF.A00;
    }
}
