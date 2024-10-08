package X;

import java.util.Map;

/* renamed from: X.Hth  reason: case insensitive filesystem */
public final class C56154Hth {
    public final C54660HMr A00;
    public final C56058Hs7 A01;
    public final C54658HMp A02;
    public final String A03;

    public C56154Hth(C54660HMr hMr, C56058Hs7 hs7, C54658HMp hMp, String str) {
        0qQ.A0B(hs7, 4);
        this.A03 = str;
        this.A00 = hMr;
        this.A02 = hMp;
        this.A01 = hs7;
    }

    public final void A02(Integer num, Map map) {
        0qQ.A0B(map, 1);
        C56058Hs7 hs7 = this.A01;
        String str = this.A03;
        C54660HMr hMr = this.A00;
        Integer num2 = AnonymousClass05K.A01;
        hs7.A00(hMr, this.A02, num2, num, str, map);
    }

    public final void A00() {
        A02(AnonymousClass05K.A0Y, AnonymousClass7TE.A1H());
    }

    public final void A01() {
        A02(AnonymousClass05K.A0N, AnonymousClass7TE.A1H());
    }

    public final void A03(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        A02(AnonymousClass05K.A0C, 0Yt.A07(new 0eP[]{AnonymousClass7TE.A1L("original_value", str), AnonymousClass7TE.A1L("new_value", str2)}));
    }
}
