package X;

import android.iawareperf.UniPerf;
import java.lang.reflect.Method;

/* renamed from: X.4kG  reason: invalid class name and case insensitive filesystem */
public final class C272174kG {
    public static 15F A02;
    public static 15H A03;
    public static 15H A04 = A02.A02("uniPerfEvent", new Class[]{Integer.TYPE, String.class, int[].class});
    public final UniPerf A00;
    public final Object A01;

    static {
        15F r2 = new 15F("android.iawareperf.UniPerf");
        A02 = r2;
        A03 = r2.A02("getInstance", new Class[0]);
    }

    public final int A00(int i, int... iArr) {
        UniPerf uniPerf = this.A00;
        if (uniPerf != null) {
            return uniPerf.uniPerfEvent(i, "", iArr);
        }
        return A04.A00(new Object[]{Integer.valueOf(i), "", iArr}, this.A01);
    }

    public C272174kG() {
        if (A02.A03) {
            this.A00 = UniPerf.getInstance();
            return;
        }
        Object[] objArr = new Object[0];
        Method method = A03.A00;
        Object obj = null;
        if (method != null) {
            try {
                obj = method.invoke((Object) null, objArr);
            } catch (Exception unused) {
            }
        }
        this.A01 = obj;
    }
}
