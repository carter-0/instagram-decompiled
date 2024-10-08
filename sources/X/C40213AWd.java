package X;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.AWd  reason: case insensitive filesystem */
public final class C40213AWd implements AnonymousClass98Q {
    public static final Set A03;
    public static final byte[] A04 = new byte[0];
    public final AnonymousClass98Q A00;
    public final AnonymousClass983 A01;
    public final String A02;

    static {
        HashSet A1F = AnonymousClass7TE.A1F();
        A1F.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        A1F.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        A1F.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        A1F.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        A1F.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        A1F.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        A03 = Collections.unmodifiableSet(A1F);
    }

    public final byte[] AOH(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw AnonymousClass7TG.A0q("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] AOH = this.A00.AOH(bArr3, A04);
            String str = this.A02;
            AnonymousClass97Z r0 = AnonymousClass97R.A02;
            return ((AnonymousClass98Q) AnonymousClass979.A01.A00(C3739497o.A01.A00(C375049Ca.A00, C3739997t.A00(AnonymousClass97O.SYMMETRIC, AnonymousClass98D.RAW, AnonymousClass97R.A01(AOH, 0, AOH.length), (Integer) null, str)), AnonymousClass98Q.class)).AOH(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        AnonymousClass97G A002 = AnonymousClass98J.A00(this.A01, AnonymousClass98J.A02);
        byte[] ASD = this.A00.ASD(((C3739997t) C3739497o.A01.A02(A002, C375049Ca.A00)).A02.A04(), A04);
        byte[] ASD2 = ((AnonymousClass98Q) AnonymousClass979.A01.A00(A002, AnonymousClass98Q.class)).ASD(bArr, bArr2);
        int length = ASD.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 4 + ASD2.length);
        allocate.putInt(length);
        allocate.put(ASD);
        allocate.put(ASD2);
        return allocate.array();
    }

    @Deprecated
    public C40213AWd(AnonymousClass98Q r5, C384459hM r6) {
        if (A03.contains(r6.typeUrl_)) {
            this.A02 = r6.typeUrl_;
            C375269Cx A0C = C384459hM.DEFAULT_INSTANCE.A0C();
            if (!A0C.A01.equals(r6)) {
                A0C.A03();
                AnonymousClass972 r2 = A0C.A00;
                AnonymousClass9BZ.A02.A00(r2.getClass()).Co5(r2, r6);
            }
            C384319h8 r3 = (C384319h8) A0C;
            r3.A04(AnonymousClass98D.RAW);
            this.A01 = AAL.A00(r3.A01().A0B());
            this.A00 = r5;
            return;
        }
        throw AnonymousClass7TE.A0w(002.A0g("Unsupported DEK key type: ", r6.typeUrl_, ". Only Tink AEAD key types are supported."));
    }
}
