package com.facebook.tigon;

import X.AnonymousClass9IM;
import X.C239923Iu;
import com.facebook.tigon.iface.TigonRequest;
import java.nio.ByteBuffer;

public interface TigonCallbacks {
    void onBody(ByteBuffer byteBuffer);

    void onBodyExperimental(byte[] bArr);

    void onEOM(C239923Iu r1);

    void onError(TigonError tigonError, C239923Iu r2);

    void onFirstByteFlushed(long j);

    void onHeaderBytesReceived(long j, long j2);

    void onLastByteAcked(long j, long j2);

    void onResponse(AnonymousClass9IM r1);

    void onStarted(TigonRequest tigonRequest);

    void onUploadProgress(long j, long j2);

    void onWillRetry(TigonError tigonError, C239923Iu r2);
}
