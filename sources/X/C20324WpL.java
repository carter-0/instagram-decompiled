package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.WpL  reason: case insensitive filesystem */
public final class C20324WpL implements Runnable {
    public final /* synthetic */ C16672Uz8 A00;
    public final /* synthetic */ C17694VcP A01;
    public final /* synthetic */ C15964Ulg A02;
    public final /* synthetic */ C15381Ube A03;

    public C20324WpL(C16672Uz8 uz8, C17694VcP vcP, C15964Ulg ulg, C15381Ube ube) {
        this.A00 = uz8;
        this.A03 = ube;
        this.A02 = ulg;
        this.A01 = vcP;
    }

    public final void run() {
        String obj = this.A00.toString();
        C15381Ube ube = this.A03;
        C18806W2y w2y = ube.A0c;
        C15964Ulg ulg = this.A02;
        int i = ulg.A00;
        Map map = w2y.A00;
        synchronized (map) {
            C17830Vgj vgj = (C17830Vgj) C51968G9o.A10(map, i);
            if (vgj != null) {
                vgj.A01.put("tab", obj);
            }
        }
        C18806W2y.A01(w2y, i, true);
        C18806W2y.A05(w2y, "FEED_REQUEST_SUCCESS", i);
        if (ulg.A03) {
            C321676uZ r1 = ube.A02;
            if (r1 != null) {
                if (!(obj == null || obj.length() == 0)) {
                    r1.A01 = obj;
                }
                List list = this.A01.A07;
                0qQ.A06(list);
                if (list.isEmpty()) {
                    C321676uZ r0 = ube.A02;
                    if (r0 != null) {
                        r0.A00.A07("empty_page");
                        C321676uZ r02 = ube.A02;
                        if (r02 != null) {
                            r02.D3U();
                            return;
                        }
                    }
                } else {
                    C321676uZ r12 = ube.A02;
                    if (r12 != null) {
                        r12.A00 = Integer.valueOf(list.size());
                        C321676uZ r03 = ube.A02;
                        if (r03 != null) {
                            r03.A00.A05();
                            C321676uZ r04 = ube.A02;
                            if (r04 != null) {
                                r04.D3V();
                                return;
                            }
                        }
                    }
                }
            }
            0qQ.A0F("gridPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
