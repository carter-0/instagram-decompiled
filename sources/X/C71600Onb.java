package X;

/* renamed from: X.Onb  reason: case insensitive filesystem */
public final class C71600Onb implements C74541Pwa {
    public byte[] A00;

    public final String ANc(CharSequence charSequence) {
        if (C70909ORe.A00(charSequence)) {
            byte[] bArr = this.A00;
            0JA.A06(AnonymousClass7TF.A1S(bArr.length, 8));
            int length = (charSequence.length() - 7) / 2;
            int i = 0;
            int i2 = 0;
            while (charSequence.charAt(i2) == "#".charAt(i)) {
                i2++;
                i++;
                if (i >= 7) {
                    byte[] bArr2 = new byte[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        int i4 = i2 + 1;
                        i2 = i4 + 1;
                        bArr2[i3] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) charSequence.charAt(i2)) - 65)) << 4)) & -16)) | ((byte) (((byte) (((byte) (((byte) charSequence.charAt(i4)) - 65)) << 0)) & 15)))) ^ bArr[i3 % 8]);
                    }
                    return new String(bArr2, C70909ORe.A00);
                }
            }
            return charSequence.toString();
        }
        throw AnonymousClass7TE.A15("Value is not vaulted");
    }

    public final String ARp(CharSequence charSequence) {
        if (!C70909ORe.A00(charSequence)) {
            byte[] bArr = this.A00;
            0JA.A06(AnonymousClass7TF.A1S(bArr.length, 8));
            byte[] bytes = charSequence.toString().getBytes(C70909ORe.A00);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            int i = 0;
            do {
                A1A.append("#".charAt(i));
                i++;
            } while (i < 7);
            for (int i2 = 0; i2 < bytes.length; i2++) {
                byte b = (byte) (bArr[i2 % 8] ^ bytes[i2]);
                byte b2 = (byte) (((byte) (((byte) (b >> 4)) & 15)) + 65);
                A1A.append((char) b2);
                A1A.append((char) ((byte) (((byte) (((byte) (b >> 0)) & 15)) + 65)));
            }
            return A1A.toString();
        }
        throw AnonymousClass7TE.A15("Value is already vaulted");
    }
}
