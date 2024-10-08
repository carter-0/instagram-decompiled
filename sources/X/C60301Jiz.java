package X;

import com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jiz  reason: case insensitive filesystem */
public final class C60301Jiz extends 2YL {
    public final LPB A00;
    public final LCZ A01;
    public final C64823Lij A02;
    public final C63045Kqa A03;
    public final AppreciationGiftingRepository A04;
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;

    public C60301Jiz(LPB lpb, LCZ lcz, C64823Lij lij, C63045Kqa kqa, AppreciationGiftingRepository appreciationGiftingRepository) {
        0qQ.A0B(lij, 5);
        this.A04 = appreciationGiftingRepository;
        this.A03 = kqa;
        this.A00 = lpb;
        this.A01 = lcz;
        this.A02 = lij;
        MHA.A03(lij, lij.A01, 39);
        02z A012 = 106.A01(C64488Lcp.A00);
        this.A07 = A012;
        this.A08 = 10b.A03(A012);
        1HR A0w = G9w.A0w();
        this.A05 = A0w;
        this.A06 = 0u9.A04(A0w);
    }

    public static final Object A01(C60301Jiz jiz, AnonymousClass4D7 r5) {
        return JTP.A0l(jiz.A05.ELH(new C61138Jxo(JTP.A0P(2131953022), false), r5));
    }

    public static final C61071Jw9 A00(C53373Gn3 gn3) {
        Object obj;
        Iterator A1H = C51966G9m.A1H(gn3.A03);
        while (true) {
            if (!A1H.hasNext()) {
                obj = null;
                break;
            }
            obj = A1H.next();
            if (((N4E) obj).A06) {
                break;
            }
        }
        N4E n4e = (N4E) obj;
        if (n4e == null) {
            return null;
        }
        ImageUrl imageUrl = (ImageUrl) n4e.A03;
        ImageUrl imageUrl2 = (ImageUrl) n4e.A04;
        boolean z = false;
        if (n4e.A01 <= gn3.A01) {
            z = true;
        }
        return new C61071Jw9(n4e, imageUrl, imageUrl2, z);
    }

    public final void A02(C61071Jw9 jw9, Integer num, List list, int i, boolean z) {
        C318136oS A002;
        0sL jue;
        boolean z2;
        Integer num2 = num;
        List list2 = list;
        C51972G9s.A1D(list2, num2);
        int i2 = i;
        if (num2 == AnonymousClass05K.A01) {
            z2 = true;
        } else {
            C61071Jw9 jw92 = jw9;
            if (jw9 == null) {
                if (i > 0) {
                    A002 = C318116oQ.A00(this);
                    jue = new MHA(this, (AnonymousClass4D7) null, 45);
                } else {
                    Integer num3 = AnonymousClass05K.A00;
                    JTO.A1Y(num3, new MHH((AnonymousClass4D7) null, (Object) this, (Object) num3, 14), C318116oQ.A00(this));
                    return;
                }
            } else if (!jw9.A02) {
                z2 = false;
            } else if (!z) {
                Object value = this.A07.getValue();
                A002 = C318116oQ.A00(this);
                jue = new MHG(value, jw92, this, num2, (AnonymousClass4D7) null, 13);
            } else {
                A002 = C318116oQ.A00(this);
                jue = new JUE(this, jw9, list2, (AnonymousClass4D7) null, i2, 1);
            }
            AnonymousClass7TE.A1Z(jue, A002);
        }
        A002 = C318116oQ.A00(this);
        jue = new MEU(this, (AnonymousClass4D7) null, i2, 0, z2);
        AnonymousClass7TE.A1Z(jue, A002);
    }
}
