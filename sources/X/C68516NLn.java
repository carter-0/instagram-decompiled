package X;

import java.util.List;

/* renamed from: X.NLn  reason: case insensitive filesystem */
public final class C68516NLn extends 1P0 {
    public final OHT A00;

    public C68516NLn(OHT oht) {
        this.A00 = oht;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        float f;
        float f2;
        float f3;
        int A03 = AnonymousClass0fD.A03(847180942);
        1XO r11 = (1XO) obj;
        int A0D = AnonymousClass7TG.A0D(r11, -922333614);
        C68516NLn.super.onSuccess(r11);
        OHT oht = this.A00;
        List list = r11.A06;
        String str = r11.A04;
        C70826OMy oMy = oht.A03;
        oMy.A08 = list;
        oMy.A04 = str;
        C68048MzF mzF = oht.A04;
        AnonymousClass2t9 r4 = oht.A01;
        C68144N2k n2k = oMy.A00().A00;
        if (n2k != null) {
            f = n2k.A00;
        } else {
            f = 1.0f;
        }
        C68144N2k n2k2 = oMy.A00().A00;
        if (n2k2 != null) {
            f2 = n2k2.A01;
        } else {
            f2 = 0.75f;
        }
        C68144N2k n2k3 = oMy.A00().A00;
        if (n2k3 != null) {
            f3 = n2k3.A02;
        } else {
            f3 = 1.0f;
        }
        C67421Mnc.A02(r4, oMy, mzF, f, f2, f3);
        AnonymousClass0fD.A0A(-1371941424, A0D);
        AnonymousClass0fD.A0A(481107037, A03);
    }
}
