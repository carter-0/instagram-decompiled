package X;

import java.util.Map;

public final class M1Q implements 1aV {
    public final /* synthetic */ LFO A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C252683pV A03;

    public M1Q(LFO lfo, String str, String str2, C252683pV r4) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = lfo;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        if (!((C8918RFl) obj).A01) {
            RF1 rf1 = RF1.ITEM_TYPE_INAPP;
            String str = this.A02;
            String str2 = this.A01;
            LFO lfo = this.A00;
            lfo.A05.A02(lfo.A00, new C7610QOs(rf1, str, 002.A15("{\"sku\":\"", str, "\",\"product_id\":\"", str2, "\",\"product_session_id\":\"", lfo.A06, "\"}"), str2, (String) null, (Map) null), new C64431Lbm(lfo, this.A03), (C10300Rpy) null);
            return;
        }
        C252683pV r2 = this.A03;
        r2.FIG(new C61129Jxf());
        r2.AI3((Throwable) null);
    }
}
