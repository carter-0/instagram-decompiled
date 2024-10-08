package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class VZ8 {
    public ArrayList A00 = new ArrayList();
    public final WFU A01;
    public final ArrayList A02 = new ArrayList();
    public final Map A03 = new HashMap();
    public final C17172VLb A04;

    public VZ8(WFU wfu) {
        this.A01 = wfu;
        this.A04 = new C17172VLb(wfu.A0K);
        wfu.A0D = this;
        if (wfu.A0I.A0T) {
            wfu.A06();
        }
        wfu.A06 = new WFG(this);
    }
}
