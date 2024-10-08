package X;

import java.util.Map;

public final class I10 {
    public final C54660HMr A00;
    public final C56058Hs7 A01;
    public final C54658HMp A02;
    public final String A03;

    public static final void A00(I10 i10, Integer num, Map map) {
        C56058Hs7 hs7 = i10.A01;
        String str = i10.A03;
        hs7.A00(i10.A00, i10.A02, AnonymousClass05K.A00, num, str, map);
    }

    public final void A01() {
        A00(this, AnonymousClass05K.A1F, AnonymousClass7TE.A1H());
    }

    public final void A02() {
        A00(this, AnonymousClass05K.A15, AnonymousClass7TE.A1H());
    }

    public I10(C54660HMr hMr, C56058Hs7 hs7, C54658HMp hMp, String str) {
        this.A03 = str;
        this.A00 = hMr;
        this.A02 = hMp;
        this.A01 = hs7;
    }
}
