package com.bumptech.glide.load.resource.bitmap;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11877SiA;
import X.C13892TjF;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class RoundedCorners extends C11877SiA {
    public static final byte[] A01 = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(C13892TjF.A00);
    public final int A00;

    public final void FK7(MessageDigest messageDigest) {
        messageDigest.update(A01);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.A00);
        messageDigest.update(allocate.array());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RoundedCorners) || this.A00 != ((RoundedCorners) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.A00) * 31) - 569625254;
    }

    public RoundedCorners(int i) {
        if (AnonymousClass7TF.A1R(i)) {
            this.A00 = i;
            return;
        }
        throw AnonymousClass7TE.A0w("roundingRadius must be greater than 0.");
    }
}
