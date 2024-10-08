package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.RejectedExecutionException;

public final class Y7W extends TZ6 {
    public final /* synthetic */ C21989Xp3 A00;

    public Y7W(C21989Xp3 xp3) {
        this.A00 = xp3;
    }

    public final IOException A08(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void A09() {
        C21989Xp3 xp3 = this.A00;
        xp3.A05(AnonymousClass05K.A0j);
        Y1K y1k = xp3.A07;
        synchronized (y1k) {
            long j = y1k.A06;
            long j2 = y1k.A04;
            if (j >= j2) {
                y1k.A04 = j2 + 1;
                y1k.A05 = System.nanoTime() + 1000000000;
                try {
                    y1k.A0G.execute(new Y7D(y1k, y1k.A0C));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    public final void A0D() {
        if (A0C()) {
            throw new SocketTimeoutException(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
        }
    }
}
