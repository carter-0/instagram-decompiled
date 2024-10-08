package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.9ku  reason: invalid class name and case insensitive filesystem */
public final class C386629ku extends 0ng {
    public final /* synthetic */ C279414yb A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386629ku(C279414yb r4, int i) {
        super(19927624, i, false, true);
        this.A00 = r4;
    }

    public final void run() {
        C279414yb r1 = this.A00;
        if (C279614yw.A00(r1.A02).booleanValue()) {
            C279414yb.A01(r1);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = r1.A00;
        if (byteArrayOutputStream != null) {
            C279414yb.A02(r1, byteArrayOutputStream);
        }
    }
}
