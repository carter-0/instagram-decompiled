package X;

import java.util.Iterator;
import java.util.Map;

public final class WE5 implements C13907Tl7 {
    public final /* synthetic */ C17721Vcq A00;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public WE5(C17721Vcq vcq) {
        this.A00 = vcq;
    }

    public final void onDestroy(AnonymousClass07Z r5) {
        Map map = this.A00.A0D;
        Iterator it = 00k.A0Y(map.values()).iterator();
        while (it.hasNext()) {
            0eP A1A = JTO.A1A(it);
            C51965G9l.A1W(A1A.A01, A1A.A00);
        }
        map.clear();
    }

    public final void onPause(AnonymousClass07Z r3) {
        for (Object A1U : 00k.A0Y(this.A00.A09)) {
            DbS.A1U(A1U);
        }
    }

    public final void onResume(AnonymousClass07Z r3) {
        for (Object A1U : this.A00.A0A) {
            DbS.A1U(A1U);
        }
    }

    public final void onStart(AnonymousClass07Z r3) {
        for (Object A1U : this.A00.A0B) {
            DbS.A1U(A1U);
        }
    }

    public final void onStop(AnonymousClass07Z r3) {
        for (Object A1U : 00k.A0Y(this.A00.A0C)) {
            DbS.A1U(A1U);
        }
    }
}
