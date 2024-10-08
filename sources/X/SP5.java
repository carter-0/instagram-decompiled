package X;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class SP5 {
    public int A00 = -1;
    public int A01 = 1;
    public Exception A02 = null;
    public boolean A03 = false;
    public final int A04;
    public final C365488nC A05;
    public final C7970QeI[] A06;
    public final AtomicInteger A07 = new AtomicInteger();

    public static synchronized int A00(SP5 sp5, Exception exc, int i) {
        synchronized (sp5) {
            if (i == 1 && exc != null) {
                0KC.A0K("DownloadStateHandler", "Result should not be SUCCESS when exception != null", exc);
                i = 2;
            }
            if (sp5.A01 == 1) {
                sp5.A01 = i;
            }
            if (sp5.A02 == null) {
                sp5.A02 = exc;
            }
        }
        return i;
    }

    private synchronized void A01() {
        if (!this.A03) {
            C7970QeI[] qeIArr = this.A06;
            int i = 0;
            do {
                C7970QeI qeI = qeIArr[i];
                int i2 = this.A04;
                qeI.A01(this.A05, this.A02, i2, this.A01);
                i++;
            } while (i < 2);
            this.A03 = true;
        }
    }

    public final void A02(0gC r8, Exception exc, int i) {
        C7970QeI[] qeIArr = this.A06;
        int i2 = 0;
        do {
            qeIArr[i2].A02(exc, r8.A02, this.A04, i);
            i2++;
        } while (i2 < 2);
        synchronized (this) {
            A00(this, exc, i);
            int incrementAndGet = this.A07.incrementAndGet();
            int i3 = this.A00;
            if (i3 < 0) {
                i3 = this.A05.A02.size();
            }
            if (incrementAndGet == i3) {
                A01();
            }
        }
    }

    public final void A03(IOException iOException, int i, int i2) {
        for (int i3 = 0; i3 < 2; i3++) {
        }
        synchronized (this) {
            Integer valueOf = Integer.valueOf(i2);
            Set set = this.A05.A02;
            if (i2 != set.size()) {
                0KC.A0P("DownloadStateHandler", "Expected metadata for %d modules, got %d", new Object[]{Integer.valueOf(set.size()), valueOf});
            }
            this.A00 = i2;
            if (A00(this, iOException, i) != 1) {
                A01();
            }
        }
    }

    public final synchronized void A04(Exception exc, int i) {
        A00(this, exc, i);
        A01();
    }

    public SP5(C365488nC r2, C7970QeI[] qeIArr, int i) {
        this.A04 = i;
        this.A05 = r2;
        this.A06 = qeIArr;
    }
}
