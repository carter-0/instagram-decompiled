package X;

/* renamed from: X.VkC  reason: case insensitive filesystem */
public final class C18032VkC {
    public long A00 = -1;
    public final X8G A01;

    public final long A01() {
        long j = this.A00;
        if (j != -1) {
            return j;
        }
        this.A00 = 0;
        X8G x8g = this.A01;
        int frameCount = x8g.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.A00 += (long) x8g.B84(i);
        }
        return this.A00;
    }

    public C18032VkC(X8G x8g) {
        this.A01 = x8g;
    }

    public final int A00(long j) {
        long A012 = A01();
        long j2 = 0;
        if (A012 != 0) {
            X8G x8g = this.A01;
            if (x8g.getLoopCount() != 0 && j / A012 >= ((long) x8g.getLoopCount())) {
                return -1;
            }
            j2 = j % A012;
        }
        int i = 0;
        long j3 = 0;
        do {
            j3 += (long) this.A01.B84(i);
            i++;
        } while (j2 >= j3);
        return i - 1;
    }

    public final long A02(long j) {
        long A012 = A01();
        long j2 = 0;
        if (A012 != 0) {
            X8G x8g = this.A01;
            if (x8g.getLoopCount() == 0 || j / A012 < ((long) x8g.getLoopCount())) {
                long j3 = j % A012;
                int frameCount = x8g.getFrameCount();
                for (int i = 0; i < frameCount && j2 <= j3; i++) {
                    j2 += (long) x8g.B84(i);
                }
                return j + (j2 - j3);
            }
        }
        return -1;
    }
}
