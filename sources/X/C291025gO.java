package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.5gO  reason: invalid class name and case insensitive filesystem */
public final class C291025gO extends 0ng {
    public final /* synthetic */ AnonymousClass11X A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C291025gO(AnonymousClass11X r1, int i, int i2, boolean z, boolean z2) {
        super(i, i2, z, z2);
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass11X r4 = this.A00;
        r4.getName();
        if (Systrace.A0E(1)) {
            0fS.A01(002.A0R("run ", r4.getName()), 1078929841);
        }
        try {
            r4.run();
            AnonymousClass1HI.A03.Eyo(new C299415v7(this));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1920899816);
            }
        }
    }

    public final String toString() {
        return this.A00.toString();
    }
}
