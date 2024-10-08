package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.Ded  reason: case insensitive filesystem */
public final class C46416Ded implements Runnable {
    public final /* synthetic */ AnonymousClass11X A00;

    public C46416Ded(AnonymousClass11X r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass11X r4 = this.A00;
        String A0R = 002.A0R(r4.getName(), " onFinish");
        if (Systrace.A0E(1)) {
            0fS.A01(A0R, 1758878738);
        }
        try {
            r4.onFinish();
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1490835248);
            }
        }
    }
}
