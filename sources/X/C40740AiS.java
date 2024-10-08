package X;

/* renamed from: X.AiS  reason: case insensitive filesystem */
public final class C40740AiS implements Runnable {
    public final /* synthetic */ AJ3 A00;

    public C40740AiS(AJ3 aj3) {
        this.A00 = aj3;
    }

    public final void run() {
        AJ3 aj3 = this.A00;
        if (aj3.A0V.get() != 0) {
            C345937uK r0 = aj3.A09;
            if (r0 != null) {
                r0.A02();
                aj3.A09 = null;
            }
            SSS sss = aj3.A0G;
            if (sss != null) {
                Q7n q7n = sss.A05;
                if (q7n != null) {
                    q7n.sendEmptyMessage(4);
                }
                aj3.A0G = null;
            }
        }
    }
}
