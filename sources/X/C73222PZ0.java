package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.PZ0  reason: case insensitive filesystem */
public final class C73222PZ0 implements Runnable {
    public final /* synthetic */ C72521P9e A00;
    public final /* synthetic */ MessageIdentifier A01;

    public C73222PZ0(C72521P9e p9e, MessageIdentifier messageIdentifier) {
        this.A00 = p9e;
        this.A01 = messageIdentifier;
    }

    public final void run() {
        C72521P9e.A00(this.A00, this.A01);
    }
}
