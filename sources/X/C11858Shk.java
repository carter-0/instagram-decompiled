package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: X.Shk  reason: case insensitive filesystem */
public final class C11858Shk implements C13892TjF {
    public static final C11037S6p A08 = new C11037S6p(50);
    public final Class A00;
    public final int A01;
    public final int A02;
    public final C13892TjF A03;
    public final C13892TjF A04;
    public final C11856Shi A05;
    public final C13916TlI A06;
    public final ST0 A07;

    public final void FK7(MessageDigest messageDigest) {
        Object A012;
        ST0 st0 = this.A07;
        Class<byte[]> cls = byte[].class;
        synchronized (st0) {
            A012 = ST0.A01(st0.A03.A00(cls, 8), st0, cls);
        }
        byte[] bArr = (byte[]) A012;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putInt(this.A02);
        wrap.putInt(this.A01);
        wrap.array();
        this.A03.FK7(messageDigest);
        this.A04.FK7(messageDigest);
        messageDigest.update(bArr);
        C13916TlI tlI = this.A06;
        if (tlI != null) {
            tlI.FK7(messageDigest);
        }
        this.A05.FK7(messageDigest);
        C11037S6p s6p = A08;
        Class cls2 = this.A00;
        byte[] bArr2 = (byte[]) s6p.A00(cls2);
        if (bArr2 == null) {
            bArr2 = cls2.getName().getBytes(C13892TjF.A00);
            s6p.A03(cls2, bArr2);
        }
        messageDigest.update(bArr2);
        st0.A05(bArr);
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof C11858Shk)) {
            return false;
        }
        C11858Shk shk = (C11858Shk) obj;
        if (this.A01 != shk.A01 || this.A02 != shk.A02) {
            return false;
        }
        C13916TlI tlI = this.A06;
        C13916TlI tlI2 = shk.A06;
        if (tlI == null) {
            equals = DbW.A1a(tlI2);
        } else {
            equals = tlI.equals(tlI2);
        }
        if (!equals || !this.A00.equals(shk.A00) || !this.A04.equals(shk.A04) || !this.A03.equals(shk.A03)) {
            return false;
        }
        return Pxi.A1W(this.A05, shk.A05);
    }

    public final int hashCode() {
        int hashCode = (((((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A02) * 31) + this.A01;
        C13916TlI tlI = this.A06;
        if (tlI != null) {
            hashCode = AnonymousClass7TE.A0N(tlI, hashCode * 31);
        }
        return AnonymousClass7TE.A0N(this.A05, AnonymousClass7TF.A07(this.A00, hashCode * 31));
    }

    public C11858Shk(C13892TjF tjF, C13892TjF tjF2, C11856Shi shi, C13916TlI tlI, ST0 st0, Class cls, int i, int i2) {
        this.A07 = st0;
        this.A04 = tjF;
        this.A03 = tjF2;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = tlI;
        this.A00 = cls;
        this.A05 = shi;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ResourceCacheKey{sourceKey=");
        A1A.append(this.A04);
        A1A.append(", signature=");
        A1A.append(this.A03);
        A1A.append(", width=");
        A1A.append(this.A02);
        A1A.append(", height=");
        A1A.append(this.A01);
        A1A.append(", decodedResourceClass=");
        A1A.append(this.A00);
        A1A.append(", transformation='");
        A1A.append(this.A06);
        A1A.append('\'');
        A1A.append(", options=");
        return Pxg.A0p(this.A05, A1A);
    }
}
