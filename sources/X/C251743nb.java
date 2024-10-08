package X;

import java.io.IOException;

/* renamed from: X.3nb  reason: invalid class name and case insensitive filesystem */
public final class C251743nb implements C251753nc {
    public final /* synthetic */ C251563nJ A00;

    public C251743nb(C251563nJ r1) {
        this.A00 = r1;
    }

    public final void DEa(IOException iOException) {
        C251563nJ r1 = this.A00;
        r1.sendMessage(r1.obtainMessage(5, iOException));
    }

    public final void onSuccess() {
        C251563nJ r1 = this.A00;
        r1.sendMessage(r1.obtainMessage(2));
    }
}
