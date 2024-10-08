package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.Oam  reason: case insensitive filesystem */
public final class C71067Oam {
    public int A00;
    public 1OC A01;
    public NJC A02;
    public C68186N5b A03;
    public final 1a8 A04 = C66581MXm.A0P();
    public final OBZ A05;
    public final O76 A06;
    public final C254743sy A07;
    public final 17i A08;
    public final String A09;
    public final String A0A;
    public final List A0B = AnonymousClass7TE.A1C();
    public final List A0C = AnonymousClass7TE.A1C();
    public final Map A0D = AnonymousClass7TE.A1H();
    public final boolean A0E;
    public final boolean A0F;

    public static final void A00(C71067Oam oam) {
        AnonymousClass2Ep r0;
        AnonymousClass2Ep r02;
        NJC njc = oam.A02;
        if (njc != null) {
            boolean A022 = A02(oam);
            if (!njc.A09 || (r0 = njc.A06) == null || r0.BHS() != 7 || (r02 = njc.A06) == null || r02.COP()) {
                IgdsBottomButtonLayout igdsBottomButtonLayout = njc.A08;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(A022);
                    return;
                }
                return;
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = njc.A08;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setPrimaryButtonEnabled(false);
            }
        }
    }

    public static final void A01(C71067Oam oam) {
        String str;
        OBZ obz = oam.A05;
        C68186N5b n5b = oam.A03;
        if (n5b != null) {
            List list = oam.A0C;
            List list2 = oam.A0B;
            AnonymousClass7TG.A1O(list, list2);
            ViewModelListUpdate A0R = DbS.A0R();
            A0R.A00(n5b);
            A0R.A01(list);
            A0R.A01(list2);
            AnonymousClass2t9 r0 = obz.A00;
            if (r0 != null) {
                r0.A05(A0R);
                NJC njc = oam.A02;
                if (njc != null) {
                    AnonymousClass7TH.A0R(njc.A00);
                    AnonymousClass7TF.A16(njc.A01);
                    return;
                }
                return;
            }
            str = "igRecyclerViewAdapter";
        } else {
            str = "questionViewModel";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A02(C71067Oam oam) {
        if (!oam.A0D.isEmpty()) {
            return true;
        }
        List<C68197N5m> list = oam.A0B;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C68197N5m n5m : list) {
            CharSequence charSequence = n5m.A00;
            if (charSequence != null && charSequence.length() != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.2tF, java.lang.Object] */
    public C71067Oam(NJC njc, OBZ obz, O76 o76, C254743sy r7, 17i r8, String str, String str2, boolean z, boolean z2) {
        AnonymousClass7TG.A1P(r7, r8);
        this.A07 = r7;
        this.A0A = str;
        this.A08 = r8;
        this.A05 = obz;
        this.A09 = str2;
        this.A06 = o76;
        this.A0F = z;
        this.A0E = z2;
        this.A02 = njc;
        OJe oJe = new OJe(this);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(obz.A01);
        A002.A01(new Object());
        A002.A01(new NO2(oJe));
        obz.A00 = DbU.A0U(A002, new C68593NOp(oJe));
    }
}
