package X;

import android.net.LocalServerSocket;
import java.io.IOException;

/* renamed from: X.Igo  reason: case insensitive filesystem */
public final class C57809Igo implements Runnable {
    public final /* synthetic */ 1yV A00;
    public final /* synthetic */ String A01;

    public C57809Igo(1yV r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        LocalServerSocket localServerSocket;
        1yV r0 = this.A00;
        synchronized (r0.A03) {
            localServerSocket = (LocalServerSocket) r0.A05.get(this.A01);
        }
        if (localServerSocket != null) {
            try {
                localServerSocket.close();
            } catch (IOException unused) {
            }
        }
    }
}
