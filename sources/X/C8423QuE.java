package X;

import java.io.IOException;

/* renamed from: X.QuE  reason: case insensitive filesystem */
public final class C8423QuE extends C8424QuF {
    public static final C8423QuE zzb;
    public C13981TnX zzd = C8422QuD.A02;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.IOException, X.RCZ] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.io.IOException, X.RCZ] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.io.IOException, X.RCZ] */
    public static C8423QuE A00(byte[] bArr) {
        RCZ rcz;
        byte[] bArr2 = bArr;
        int length = bArr.length;
        SNE sne = SNE.A01;
        C8423QuE quE = new C8423QuE();
        try {
            C13829Ti0 A00 = SH3.A02.A00(quE.getClass());
            A00.FPs(new SFD(sne), quE, bArr2, 0, length);
            A00.FPf(quE);
            return quE;
        } catch (RCZ e) {
            rcz = e;
            rcz.A00 = quE;
            throw rcz;
        } catch (TQH e2) {
            ? iOException = new IOException(e2.getMessage());
            iOException.A00 = null;
            rcz = iOException;
            rcz.A00 = quE;
            throw rcz;
        } catch (IOException e3) {
            if (e3.getCause() instanceof RCZ) {
                throw e3.getCause();
            }
            ? iOException2 = new IOException(e3.getMessage(), e3);
            iOException2.A00 = null;
            rcz = iOException2;
            rcz.A00 = quE;
            throw rcz;
        } catch (IndexOutOfBoundsException unused) {
            ? iOException3 = new IOException(C273654mx.A00(13));
            iOException3.A00 = null;
            rcz = iOException3;
            rcz.A00 = quE;
            throw rcz;
        }
    }

    static {
        C8423QuE quE = new C8423QuE();
        zzb = quE;
        quE.zzd &= Integer.MAX_VALUE;
        C8424QuF.zzb.put(C8423QuE.class, quE);
    }
}
