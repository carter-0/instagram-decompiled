package X;

import java.util.Map;

public abstract class GFX {
    public static 0eP A00;
    public static 0eP A01;
    public static 0eP A02;

    public static final void A00(C52206GIx gIx, C52054GDa gDa) {
        Throwable th;
        0qQ.A0B(gIx, 2);
        if (!gIx.A01 && (th = gIx.A00) != null) {
            0wj r3 = 0wj.A01;
            Class<?> cls = th.getClass();
            Map map = 0Yh.A03;
            0qQ.A0B(cls, 1);
            0f9 AEf = r3.AEf(0q1.A01(cls), 630203803);
            AEf.ERJ(th);
            StringBuilder sb = new StringBuilder();
            for (C52056GDc gDc = gDa.A02; gDc != null; gDc = gDc.A00) {
                sb.append(gDc.A01.toString());
                sb.append(10);
            }
            String obj = sb.toString();
            0qQ.A07(obj);
            AEf.ABQ("timeline", obj);
            gDa.A06.getValue();
            AEf.report();
        }
    }
}
