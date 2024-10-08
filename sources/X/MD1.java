package X;

import java.util.Map;
import java.util.TimerTask;

public final class MD1 extends TimerTask {
    public final /* synthetic */ C11254SHo A00;
    public final /* synthetic */ Map A01;

    public MD1(C11254SHo sHo, Map map) {
        this.A00 = sHo;
        this.A01 = map;
    }

    public final void run() {
        C11254SHo sHo = this.A00;
        L36 l36 = sHo.A06;
        Map map = this.A01;
        0qQ.A0B(map, 0);
        C62961KpD.A00(l36.A00, l36.A01, map, 40);
        sHo.A01();
    }
}
