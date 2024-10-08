package X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.LhG  reason: case insensitive filesystem */
public final /* synthetic */ class C64739LhG implements C232292tQ {
    public final /* synthetic */ M0Z A00;

    public C64739LhG(M0Z m0z) {
        this.A00 = m0z;
    }

    public final void DYE(int i, int i2) {
        String str;
        String str2;
        C62260Kcu kcu;
        String str3;
        C270194gL r1;
        Set A06;
        M0Z m0z = this.A00;
        C232262tL r12 = (C232262tL) 00k.A0O(m0z.A0F, i);
        if (r12 != null) {
            if (r12 instanceof C19272WSf) {
                str = ((C19272WSf) r12).A06;
            } else if (r12 instanceof C19271WSe) {
                str = ((C19271WSe) r12).A08;
            } else {
                return;
            }
            if (str != null && str.equals(m0z.A08.getString(2131965270)) && (str2 = m0z.A0E) != null && (str3 = kcu.A07) != null) {
                AnonymousClass0eM r2 = (kcu = m0z.A0C).A0D;
                Reel A0L = Dba.A0L(AnonymousClass7TE.A0l(r2), str2);
                Set set = null;
                if (A0L != null) {
                    r1 = A0L.A0H;
                } else {
                    r1 = null;
                }
                0wc A01 = AnonymousClass0kN.A01(kcu, AnonymousClass7TF.A0L(r2, 1));
                String A0u = DbU.A0u(r2);
                if (!(r1 == null || (A06 = r1.A06()) == null)) {
                    ArrayList A0r = AnonymousClass7TG.A0r(A06);
                    Iterator it = A06.iterator();
                    while (it.hasNext()) {
                        DbY.A1W(A0r, it);
                    }
                    set = 00k.A0k(A0r);
                }
                0Aj A0e = AnonymousClass7TE.A0e(A01, "ig_live_moderator_review");
                JTQ.A14(A0e, A0u);
                DbS.A1H(A0e, "cell_impression");
                JTQ.A10(A0e, DbZ.A07(str2));
                C51965G9l.A1I(A0e, str3);
                C51969G9p.A1A(A0e, kcu);
                JTP.A1G(A0e);
                JTQ.A16(A0e, JTT.A0t(set));
            }
        }
    }
}
