package X;

import java.util.concurrent.TimeoutException;

/* renamed from: X.S6d  reason: case insensitive filesystem */
public final class C11026S6d {
    public Throwable A00 = null;
    public final int A01;
    public final long A02;
    public final ST3 A03;
    public final RFZ A04;
    public final String A05;
    public volatile C13987Tnd A06;
    public volatile C13775Tgq A07;

    public final void A00() {
        synchronized (this) {
            this.A00 = new TimeoutException();
        }
        if (this.A07 != null) {
            this.A07.Dat(this.A01);
        }
        if (this.A06 != null) {
            this.A06.cancel(false);
        }
    }

    public final void A01(C241873Rq r4) {
        synchronized (this) {
            this.A00 = r4;
        }
        if (this.A07 != null) {
            this.A07.DET(this.A01, S9M.A01(r4.A00));
        }
        if (this.A06 != null) {
            this.A06.cancel(false);
        }
    }

    public C11026S6d(ST3 st3, RFZ rfz, String str, int i, long j) {
        this.A03 = st3;
        this.A05 = str;
        this.A04 = rfz;
        this.A01 = i;
        this.A02 = j;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MqttOperation{mResponseType=");
        A1A.append(this.A04);
        A1A.append(", mOperationId=");
        A1A.append(this.A01);
        A1A.append(", mCreationTime=");
        return Pxg.A0y(A1A, this.A02);
    }
}
