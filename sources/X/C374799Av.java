package X;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: X.9Av  reason: invalid class name and case insensitive filesystem */
public abstract class C374799Av {
    public static final Object A00 = new Object();

    public static void A00(AnonymousClass98Q r6, AnonymousClass9BV r7, AnonymousClass9D1 r8) {
        Throwable th;
        if (r6 != null) {
            try {
                byte[] bArr = new byte[0];
                C3738097a r4 = r7.A01;
                byte[] ASD = r6.ASD(r4.A0B(), bArr);
                try {
                    if (AnonymousClass972.A02(C3738397d.A00(), C3738097a.DEFAULT_INSTANCE, r6.AOH(ASD, bArr)).equals(r4)) {
                        C375269Cx A0C = C3741098e.DEFAULT_INSTANCE.A0C();
                        AnonymousClass97V A01 = AnonymousClass97R.A01(ASD, 0, ASD.length);
                        A0C.A03();
                        ((C3741098e) A0C.A00).encryptedKeyset_ = A01;
                        C3741198f A002 = C39842ABo.A00(r4);
                        A0C.A03();
                        C3741098e r1 = (C3741098e) A0C.A00;
                        A002.getClass();
                        r1.keysetInfo_ = A002;
                        r1.bitField0_ |= 1;
                        if (!r8.A00.putString(r8.A01, C374809Aw.A00(A0C.A01().A0B())).commit()) {
                            th = new IOException("Failed to write to SharedPreferences");
                        } else {
                            return;
                        }
                    } else {
                        throw new GeneralSecurityException("cannot encrypt keyset");
                    }
                } catch (AnonymousClass9GO unused) {
                    th = new GeneralSecurityException("invalid keyset, corrupted key material");
                }
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        } else {
            if (!r8.A00.putString(r8.A01, C374809Aw.A00(r7.A01.A0B())).commit()) {
                th = new IOException("Failed to write to SharedPreferences");
            } else {
                return;
            }
        }
        throw th;
    }
}
