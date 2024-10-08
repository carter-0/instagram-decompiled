package X;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;

public abstract class S80 {
    public static void A01(ImmutableList.Builder builder, ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i2);
        duplicate.limit(i2 + (i - i2));
        builder.add(duplicate.slice());
    }

    public static ImmutableList A00(ByteBuffer byteBuffer) {
        boolean z;
        int i;
        if (byteBuffer.remaining() == 0) {
            return ImmutableList.of();
        }
        int i2 = -1;
        int limit = byteBuffer.limit();
        int i3 = 0;
        while (true) {
            if (i3 < limit) {
                if (i3 < byteBuffer.limit() - 3 && byteBuffer.get(i3) == 0 && byteBuffer.get(i3 + 1) == 0 && byteBuffer.get(i3 + 2) == 1) {
                    i2 = i3 + 3;
                    z = true;
                    break;
                } else if (byteBuffer.get(i3) == 0) {
                    i3++;
                } else {
                    throw AnonymousClass7TE.A0z("Sample does not start with a NAL unit");
                }
            } else {
                z = false;
                break;
            }
        }
        ImmutableList.Builder A0Y = Pxe.A0Y();
        int i4 = i;
        while (i < limit) {
            boolean z2 = true;
            if (!(i < byteBuffer.limit() - 3 && byteBuffer.get(i) == 0 && byteBuffer.get(i + 1) == 0 && byteBuffer.get(i + 2) == 1)) {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    A01(A0Y, byteBuffer, i, i4);
                    i4 = i + 3;
                    i = i4;
                } else {
                    if (i < byteBuffer.limit() - 3 && byteBuffer.get(i) == 0 && byteBuffer.get(i + 1) == 0 && byteBuffer.get(i + 2) == 0) {
                        A01(A0Y, byteBuffer, i, i4);
                        i++;
                        z = false;
                    }
                    i++;
                }
            } else if (z2) {
                i += 3;
                i4 = i;
                z = true;
            } else {
                if (byteBuffer.get(i) != 0) {
                    throw AnonymousClass7TE.A0z("Invalid NAL units");
                }
                i++;
            }
            if (i == limit && z) {
                A01(A0Y, byteBuffer, i, i4);
            }
        }
        byteBuffer.rewind();
        return A0Y.build();
    }
}
