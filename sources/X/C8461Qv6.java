package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: X.Qv6  reason: case insensitive filesystem */
public final class C8461Qv6 extends C9021RLw {
    public boolean A00;
    public final int A01;
    public final MessageDigest A02;
    public final ByteBuffer A03;

    public /* synthetic */ C8461Qv6(MessageDigest messageDigest, int i) {
        this();
        this.A02 = messageDigest;
        this.A01 = i;
    }

    public C8461Qv6() {
        this.A03 = Pxg.A12(8);
    }
}
