package X;

import android.os.MessageQueue;

/* renamed from: X.JXy  reason: case insensitive filesystem */
public final class C59779JXy implements MessageQueue.IdleHandler {
    public final /* synthetic */ AnonymousClass2l3 A00;

    public C59779JXy(AnonymousClass2l3 r1) {
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        AnonymousClass2l3 r2 = this.A00;
        18q r0 = AnonymousClass2l3.A0V;
        if (!r2.A0I.A0V()) {
            return false;
        }
        Integer num = r2.A0O;
        Integer num2 = AnonymousClass05K.A00;
        if (num != num2 && r2.A0P != num2) {
            return false;
        }
        Integer num3 = AnonymousClass05K.A0Y;
        r2.A0O = num3;
        r2.A0P = num3;
        AnonymousClass2l3.A01(r2);
        return false;
    }
}
