package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class SO7 {
    public static final SO7 A02 = new SO7();
    public final C13651TeI A00 = new C12590Syp();
    public final ConcurrentMap A01 = new ConcurrentHashMap();

    public static SO7 A00() {
        return A02;
    }

    public final C13845TiL A01(Class cls) {
        SS6.A03(cls);
        ConcurrentMap concurrentMap = this.A01;
        C13845TiL tiL = (C13845TiL) concurrentMap.get(cls);
        if (tiL == null) {
            tiL = this.A00.FOz(cls);
            SS6.A03(cls);
            C13845TiL tiL2 = (C13845TiL) concurrentMap.putIfAbsent(cls, tiL);
            if (tiL2 != null) {
                return tiL2;
            }
        }
        return tiL;
    }
}
