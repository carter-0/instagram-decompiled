package X;

import java.nio.ByteBuffer;

/* renamed from: X.TiM  reason: case insensitive filesystem */
public interface C13846TiM {
    void DCl(C8838RCa rCa);

    void Deg();

    void Df9(2ZD r1);

    void E0P();

    void onBody(ByteBuffer byteBuffer);

    void onEOM();

    void onFirstByteFlushed(long j);

    void onHeaderBytesReceived(long j, long j2);

    void onLastByteAcked(long j, long j2);
}
