package X;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class M91 implements Runnable {
    public final /* synthetic */ C331897Sw A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public M91(C331897Sw r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void run() {
        C331897Sw r1 = this.A00;
        C331897Sw r0 = C331897Sw.A0A;
        ConcurrentHashMap concurrentHashMap = r1.A05;
        String str = this.A01;
        Set<C320986tO> set = (Set) concurrentHashMap.get(str);
        if (set != null) {
            String str2 = this.A02;
            for (C320986tO onError : set) {
                onError.onError(str2);
            }
        }
        concurrentHashMap.remove(str);
    }
}
