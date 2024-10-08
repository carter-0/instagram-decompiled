package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.Qwy  reason: case insensitive filesystem */
public final class C8560Qwy extends C9725Rfi {
    public boolean A00;
    public final int A01;
    public final ByteBuffer A02;
    public final MessageDigest A03;

    private final void A00() {
        if (!(!this.A00)) {
            throw AnonymousClass7TE.A0z(AnonymousClass000.A00(2136));
        }
    }

    public final void A02(char c) {
        ByteBuffer byteBuffer = this.A02;
        byteBuffer.putChar(c);
        try {
            A03(byteBuffer.array());
        } finally {
            byteBuffer.clear();
        }
    }

    public /* synthetic */ C8560Qwy(MessageDigest messageDigest, int i) {
        this();
        this.A03 = messageDigest;
        this.A01 = i;
    }

    public final C8561Qwz A01() {
        byte[] copyOf;
        A00();
        this.A00 = true;
        int i = this.A01;
        MessageDigest messageDigest = this.A03;
        if (i == messageDigest.getDigestLength()) {
            copyOf = messageDigest.digest();
        } else {
            copyOf = Arrays.copyOf(messageDigest.digest(), i);
        }
        return new C8561Qwz(copyOf);
    }

    public final void A03(byte[] bArr) {
        A00();
        this.A03.update(bArr, 0, 2);
    }

    public C8560Qwy() {
        this.A02 = Pxg.A12(8);
    }
}
