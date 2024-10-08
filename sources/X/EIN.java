package X;

import android.os.Handler;
import com.facebook.systrace.Systrace;
import java.util.concurrent.atomic.AtomicBoolean;

public final class EIN extends 0ng {
    public final /* synthetic */ FZ6 A00;
    public final /* synthetic */ AnonymousClass11X A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EIN(FZ6 fz6, AnonymousClass11X r2, int i, int i2, boolean z, boolean z2) {
        super(i, i2, z, z2);
        this.A01 = r2;
        this.A00 = fz6;
    }

    public final void run() {
        int i;
        AnonymousClass11X r2 = this.A01;
        r2.getName();
        FZ6 fz6 = this.A00;
        if (Systrace.A0E(1)) {
            0fS.A01(002.A0R("run ", r2.getName()), -1778486092);
        }
        try {
            AtomicBoolean atomicBoolean = fz6.A01;
            if (!atomicBoolean.get()) {
                r2.getName();
                ((Handler) 1EZ.A00.getValue()).post(new C51189Fpz(r2));
                if (Systrace.A0E(1)) {
                    i = -2114238131;
                } else {
                    return;
                }
            } else {
                r2.run();
                if (!atomicBoolean.get()) {
                    r2.getName();
                    ((Handler) 1EZ.A00.getValue()).post(new C51190Fq0(r2));
                    if (Systrace.A0E(1)) {
                        i = 1580526768;
                    } else {
                        return;
                    }
                } else {
                    ((Handler) 1EZ.A00.getValue()).post(new C51344Fsc(fz6, r2));
                    return;
                }
            }
            0fS.A00(i);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1423339236);
            }
        }
    }

    public final String toString() {
        return this.A01.toString();
    }
}
