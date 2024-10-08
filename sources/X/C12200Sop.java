package X;

import com.facebook.proxygen.HTTPTransportCallback;

/* renamed from: X.Sop  reason: case insensitive filesystem */
public final class C12200Sop implements HTTPTransportCallback {
    public final 1QS A00;
    public final C13846TiM A01;
    public final AnonymousClass0vF A02;

    public final void bodyBytesGenerated(long j) {
    }

    public final void bodyBytesReceived(long j) {
    }

    public final void firstHeaderByteFlushed() {
    }

    public final int getEnabledCallbackFlag() {
        return 106;
    }

    public final void headerBytesGenerated(long j, long j2) {
    }

    public final void lastByteFlushed() {
    }

    public final void headerBytesReceived(long j, long j2) {
        this.A02.ATE(new R94(this, j, j2));
    }

    public C12200Sop(1QS r1, C13846TiM tiM, AnonymousClass0vF r3) {
        AnonymousClass7TG.A1U(tiM, r3, r1);
        this.A01 = tiM;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void firstByteFlushed() {
        this.A02.ATE(new R93(this, System.currentTimeMillis()));
    }

    public final void lastByteAcked(long j) {
        this.A02.ATE(new R95(this, j, System.currentTimeMillis()));
    }
}
