package X;

import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;

/* renamed from: X.6yv  reason: invalid class name and case insensitive filesystem */
public final class C324276yv implements C249373jd {
    public int A00;
    public final int A01;
    public final 02m A02;

    public final void ATX(1QS r1) {
    }

    public final boolean CXl(1QS r6) {
        URI uri = r6.A09;
        if (uri.getPath() == null) {
            return false;
        }
        String path = uri.getPath();
        0qQ.A07(path);
        if (!00l.A0d(path, "users/", false)) {
            return false;
        }
        String path2 = uri.getPath();
        0qQ.A07(path2);
        if (!00l.A0d(path2, "/usernameinfo", false)) {
            String path3 = uri.getPath();
            0qQ.A07(path3);
            if (00l.A0d(path3, "/info", false)) {
                return true;
            }
            return false;
        }
        return true;
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

    public final void onNewData(1QS r5, 1QU r6, ByteBuffer byteBuffer) {
        String A0c;
        int i = this.A00;
        if (i == 0) {
            A0c = "fetch_user_network_end";
        } else {
            A0c = 002.A0c("fetch_user_network_flush", "_end", i);
        }
        this.A02.markerPoint(31784979, this.A01, A0c);
        this.A00++;
    }

    public final void onRequestCallbackDone(1QS r2, 1QU r3) {
        19V.A01.remove(this);
    }

    public final void onRequestUploadAttemptStart(1QS r5) {
        this.A02.markerPoint(31784979, this.A01, "fetch_user_network_start");
    }

    public final void onResponseStarted(1QS r5, 1QU r6, 2ZD r7) {
        this.A02.markerPoint(31784979, this.A01, "fetch_user_network_response_start");
    }

    public C324276yv(int i) {
        this.A01 = i;
        02m r3 = 02m.A0p;
        0qQ.A07(r3);
        this.A02 = r3;
        r3.markerPoint(31784979, this.A01, "fetch_user_request_start");
    }
}
