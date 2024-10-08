package X;

/* renamed from: X.9Fy  reason: invalid class name and case insensitive filesystem */
public final class C375969Fy implements Runnable {
    public final /* synthetic */ C359768dS A00;
    public final /* synthetic */ C359708dM A01;
    public final /* synthetic */ String A02;

    public C375969Fy(C359768dS r1, C359708dM r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void run() {
        int intValue;
        C359798dV r0;
        C359768dS r6 = this.A00;
        C359768dS r02 = C359768dS.A04;
        synchronized (r6.A02) {
            C375959Fx r03 = C375959Fx.A03;
            String str = this.A02;
            synchronized (r03.A01) {
                0yf r2 = r03.A00;
                intValue = ((Integer) r2.getOrDefault(str, 0)).intValue() - 1;
                if (intValue == 0) {
                    r2.remove(str);
                } else if (intValue >= 1) {
                    r2.put(str, Integer.valueOf(intValue));
                }
            }
            if (intValue == 0) {
                r0 = C359768dS.A00(r6, str);
            } else {
                r0 = null;
            }
        }
        if (r0 != null) {
            r0.A02.A02();
        }
    }
}
