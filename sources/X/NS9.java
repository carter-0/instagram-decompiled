package X;

import com.facebook.common.stringformat.StringFormatUtil;

public final class NS9 extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ OFX A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NS9(OFX ofx, int i) {
        super(842414696, 3, false, false);
        this.A01 = ofx;
        this.A00 = i;
    }

    public final void run() {
        OFX ofx = this.A01;
        int i = this.A00;
        OWA owa = ofx.A03;
        Integer num = AnonymousClass05K.A0C;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("slider_%d_%d_pct", Integer.valueOf(i), Integer.valueOf(i + 5));
        0qQ.A07(formatStrLocaleSafe);
        owa.A02(new PL6(num, (Integer) null, (Long) null, formatStrLocaleSafe));
    }
}
