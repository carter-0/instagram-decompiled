package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.Fsc  reason: case insensitive filesystem */
public final class C51344Fsc implements Runnable {
    public final /* synthetic */ FZ6 A00;
    public final /* synthetic */ AnonymousClass11X A01;

    public C51344Fsc(FZ6 fz6, AnonymousClass11X r2) {
        this.A01 = r2;
        this.A00 = fz6;
    }

    public final void run() {
        AnonymousClass11X r5 = this.A01;
        FZ6 fz6 = this.A00;
        if (Systrace.A0E(1)) {
            0fS.A01(002.A0R(r5.getName(), " onFinish"), 636123605);
        }
        try {
            r5.getName();
            if (fz6.A01.get()) {
                r5.onFinish();
            } else {
                r5.getName();
                r5.onCancel();
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1173788204);
            }
        }
    }
}
