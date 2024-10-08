package X;

import android.view.Surface;
import java.util.List;

/* renamed from: X.AiR  reason: case insensitive filesystem */
public final class C40739AiR implements Runnable {
    public final /* synthetic */ AJ3 A00;

    public C40739AiR(AJ3 aj3) {
        this.A00 = aj3;
    }

    public final void run() {
        AJ3 aj3 = this.A00;
        if (aj3.A0V.getAndSet(5) != 5) {
            aj3.A05 = -1;
            aj3.A04 = -1;
            aj3.A01 = -1.0f;
            aj3.A00 = -1.0f;
            List<C369008tg> list = aj3.A0T;
            for (C369008tg A01 : list) {
                A01.A01();
            }
            list.clear();
            AHA aha = aj3.A0F;
            if (aha != null) {
                aha.A02();
                aj3.A0F = null;
            }
            C345937uK r0 = aj3.A0B;
            if (r0 != null) {
                r0.A02();
                aj3.A0B = null;
            }
            Surface surface = aj3.A07;
            if (surface != null) {
                surface.release();
                aj3.A07 = null;
            }
            C344587s6 r02 = aj3.A08;
            if (r02 != null) {
                r02.release();
                aj3.A08 = null;
            }
        }
    }
}
