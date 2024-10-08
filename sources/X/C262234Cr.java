package X;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.4Cr  reason: invalid class name and case insensitive filesystem */
public interface C262234Cr {
    void onFailed(1QS r1, IOException iOException);

    void onFirstByteFlushed(1QS r1, long j);

    void onHeaderBytesReceived(1QS r1, long j, long j2);

    void onLastByteAcked(1QS r1, long j, long j2);

    void onNewData(1QS r1, 1QU r2, ByteBuffer byteBuffer);

    void onRequestCallbackDone(1QS r1, 1QU r2);

    void onRequestUploadAttemptStart(1QS r1);

    void onResponseStarted(1QS r1, 1QU r2, 2ZD r3);

    void onSucceeded(1QS r1);

    void onUploadProgress(1QS r1, long j, long j2);
}
