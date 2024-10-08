package X;

import org.codeaurora.Performance;

/* renamed from: X.4EH  reason: invalid class name */
public final class AnonymousClass4EH {
    public static 15F A02;
    public static 15H A03 = A02.A02("perfLockAcquire", new Class[]{Integer.TYPE, int[].class});
    public static 15H A04 = A02.A02("perfLockRelease", new Class[0]);
    public final Object A00;
    public final Performance A01;

    static {
        15F r1 = new 15F("org.codeaurora.Performance");
        A02 = r1;
        15F.A00(r1, new Class[0], false);
    }

    public final int A00(int i, int... iArr) {
        Performance performance = this.A01;
        if (performance != null) {
            return performance.perfLockAcquire(i, iArr);
        }
        return A03.A00(new Object[]{Integer.valueOf(i), iArr}, this.A00);
    }

    public final void A01() {
        Performance performance = this.A01;
        if (performance != null) {
            performance.perfLockRelease();
            return;
        }
        A04.A00(new Object[0], this.A00);
    }

    public AnonymousClass4EH() {
        15F r1 = A02;
        if (r1.A03) {
            this.A01 = new Performance();
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
        this.A00 = obj;
    }
}
