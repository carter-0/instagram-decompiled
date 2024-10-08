package X;

import java.util.Set;

/* renamed from: X.PZ9  reason: case insensitive filesystem */
public final class C73230PZ9 implements Runnable {
    public final /* synthetic */ C70628ODz A00;
    public final /* synthetic */ String A01;

    public C73230PZ9(C70628ODz oDz, String str) {
        this.A00 = oDz;
        this.A01 = str;
    }

    public final void run() {
        C70628ODz oDz = this.A00;
        Set set = oDz.A01;
        String str = this.A01;
        if (set.contains(str)) {
            oDz.A00.markerEnd(20128010, str.hashCode(), 113);
            set.remove(str);
        }
    }
}
