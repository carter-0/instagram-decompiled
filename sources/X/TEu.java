package X;

import java.util.Map;

public final class TEu implements Runnable {
    public final C255373u1 A00;
    public final SHJ A01;

    public final void run() {
        SHJ shj = this.A01;
        synchronized (shj.A01) {
            Map map = shj.A03;
            C255373u1 r2 = this.A00;
            if (((TEu) map.remove(r2)) != null) {
                TZn tZn = (TZn) shj.A02.remove(r2);
                if (tZn != null) {
                    Sg7 sg7 = (Sg7) tZn;
                    AnonymousClass389.A00();
                    sg7.A0A.execute(new C12846TAl(sg7));
                }
            } else {
                AnonymousClass389.A00();
                String.format("Timer with %s is already marked as complete.", new Object[]{r2});
            }
        }
    }

    public TEu(C255373u1 r1, SHJ shj) {
        this.A01 = shj;
        this.A00 = r1;
    }
}
