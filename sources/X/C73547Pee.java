package X;

import com.facebook.advancedcryptotransport.MNSStreamThread;

/* renamed from: X.Pee  reason: case insensitive filesystem */
public final class C73547Pee extends Thread {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MNSStreamThread A01;

    public C73547Pee(MNSStreamThread mNSStreamThread, long j) {
        this.A01 = mNSStreamThread;
        this.A00 = j;
    }

    public final void run() {
        MNSStreamThread.nativeMNSStreamThreadRun(this.A00);
    }
}
