package X;

import com.hisi.perfhub.PerfHub;

public final class Xnt {
    public static 15F A02;
    public static 15H A03;
    public final PerfHub A00;
    public final Object A01;

    static {
        15F r3 = new 15F("com.hisi.perfhub.PerfHub");
        A02 = r3;
        A03 = r3.A02("perfEvent", new Class[]{Integer.TYPE, String.class, int[].class});
    }

    public final int A00(int i, int... iArr) {
        PerfHub perfHub = this.A00;
        if (perfHub != null) {
            return perfHub.perfEvent(i, "", iArr);
        }
        return A03.A00(new Object[]{Integer.valueOf(i), "", iArr}, this.A01);
    }

    public Xnt() {
        15F r1 = A02;
        if (r1.A03) {
            this.A00 = new PerfHub();
            return;
        }
        Class cls = r1.A01;
        Object obj = null;
        if (cls != null) {
            try {
                obj = cls.newInstance();
            } catch (Throwable unused) {
            }
        }
        this.A01 = obj;
    }
}
