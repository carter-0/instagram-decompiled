package X;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: X.SKn  reason: case insensitive filesystem */
public abstract class C11303SKn {
    public static byte[] A02(UUID uuid, byte[] bArr, UUID[] uuidArr) {
        int i;
        int length;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i2 = i + 32;
        if (uuidArr != null) {
            i2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        allocate.putInt(i2);
        allocate.putInt(1886614376);
        int i3 = 0;
        if (uuidArr != null) {
            i3 = 16777216;
        }
        allocate.putInt(i3);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(r3);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || (length = bArr.length) == 0)) {
            allocate.putInt(length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static C10594Ruo A00(byte[] bArr) {
        AnonymousClass4XV r7 = new AnonymousClass4XV(bArr);
        if (r7.A00 >= 32 && Pxh.A09(r7, 0) == (r7.A00 - r7.A01) + 4 && r7.A01() == 1886614376) {
            int A01 = (r7.A01() >> 24) & 255;
            if (A01 > 1) {
                2AG.A04("PsshAtomUtil", 002.A0O("Unsupported pssh version: ", A01));
            } else {
                UUID uuid = new UUID(r7.A06(), r7.A06());
                if (A01 == 1) {
                    r7.A0H(r7.A04() * 16);
                }
                int A04 = r7.A04();
                if (A04 == r7.A00 - r7.A01) {
                    byte[] bArr2 = new byte[A04];
                    r7.A0J(bArr2, 0, A04);
                    return new C10594Ruo(uuid, bArr2, A01);
                }
            }
        }
        return null;
    }

    public static byte[] A01(UUID uuid, byte[] bArr) {
        C10594Ruo A00 = A00(bArr);
        if (A00 != null) {
            UUID uuid2 = A00.A01;
            if (uuid.equals(uuid2)) {
                return A00.A02;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("UUID mismatch. Expected: ");
            A1A.append(uuid);
            A1A.append(", got: ");
            A1A.append(uuid2);
            2AG.A04("PsshAtomUtil", AnonymousClass7TF.A0l(".", A1A));
        }
        return null;
    }
}
