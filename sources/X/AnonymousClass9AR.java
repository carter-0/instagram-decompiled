package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: X.9AR  reason: invalid class name */
public final class AnonymousClass9AR extends AnonymousClass99N {
    public final AnonymousClass9AV A00;
    public final C3740497y A01;
    public final Integer A02;

    public static AnonymousClass9AR A00(AnonymousClass9AV r3, Integer num) {
        byte[] bArr;
        C39880ADc aDc = r3.A00;
        if (aDc == C39880ADc.A02) {
            if (num != null) {
                ByteBuffer allocate = ByteBuffer.allocate(5);
                allocate.put((byte) 1);
                allocate.putInt(num.intValue());
                bArr = allocate.array();
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (aDc != C39880ADc.A01) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown Variant: ");
            sb.append(aDc);
            throw new GeneralSecurityException(sb.toString());
        } else if (num == null) {
            bArr = new byte[0];
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        return new AnonymousClass9AR(r3, C3740497y.A00(bArr), num);
    }

    public AnonymousClass9AR(AnonymousClass9AV r1, C3740497y r2, Integer num) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = num;
    }
}
