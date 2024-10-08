package X;

import android.os.Message;

/* renamed from: X.Ujo  reason: case insensitive filesystem */
public final class C15864Ujo extends 0ng {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ AnonymousClass0s8 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15864Ujo(Message message, AnonymousClass0s8 r4, int i) {
        super(i, 1, false, true);
        this.A01 = r4;
        this.A00 = message;
    }

    public final void run() {
        AnonymousClass0s8 r1 = this.A01;
        Message message = this.A00;
        r1.handleMessage(message);
        message.recycle();
    }
}
