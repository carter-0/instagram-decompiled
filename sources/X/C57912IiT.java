package X;

import java.util.Map;

/* renamed from: X.IiT  reason: case insensitive filesystem */
public final class C57912IiT implements Runnable {
    public final /* synthetic */ HBK A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public C57912IiT(HBK hbk, String str, Map map) {
        this.A00 = hbk;
        this.A01 = str;
        this.A02 = map;
    }

    public final void run() {
        1Wj r4 = 1Wj.A00;
        if (r4 != null) {
            HBK hbk = this.A00;
            r4.A00(hbk.A05, hbk.A06, this.A01, this.A02);
        }
    }
}
