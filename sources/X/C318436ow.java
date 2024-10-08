package X;

import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;

/* renamed from: X.6ow  reason: invalid class name and case insensitive filesystem */
public final class C318436ow implements C249373jd {
    public final Dda A00;

    public final void ATX(1QS r1) {
    }

    public final boolean CXl(1QS r5) {
        URI uri = r5.A09;
        if (uri.getPath() == null) {
            return false;
        }
        String path = uri.getPath();
        0qQ.A07(path);
        if (00l.A0d(path, "feed/user", false)) {
            return true;
        }
        return false;
    }

    public final void onFailed(1QS r1, IOException iOException) {
    }

    public final void onFirstByteFlushed(1QS r1, long j) {
    }

    public final void onHeaderBytesReceived(1QS r1, long j, long j2) {
    }

    public final void onLastByteAcked(1QS r1, long j, long j2) {
    }

    public final void onSucceeded(1QS r1) {
    }

    public final void onUploadProgress(1QS r1, long j, long j2) {
    }

    public final void onNewData(1QS r3, 1QU r4, ByteBuffer byteBuffer) {
        this.A00.A0E("profile_network_end");
    }

    public final void onRequestCallbackDone(1QS r2, 1QU r3) {
        19V.A01.remove(this);
    }

    public final void onRequestUploadAttemptStart(1QS r3) {
        this.A00.A0E("profile_network_start");
    }

    public final void onResponseStarted(1QS r3, 1QU r4, 2ZD r5) {
        this.A00.A0E("profile_network_response_start");
    }

    public C318436ow(Dda dda) {
        this.A00 = dda;
        dda.A0E("profile_request_start");
    }
}
