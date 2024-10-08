package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.9la  reason: invalid class name and case insensitive filesystem */
public final class C387049la extends 0vM {
    public final /* synthetic */ C279414yb A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387049la(C279414yb r3) {
        super(AnonymousClass000.A00(3906), 19927624);
        this.A00 = r3;
    }

    public final void loggedRun() {
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
