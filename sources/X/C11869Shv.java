package X;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* renamed from: X.Shv  reason: case insensitive filesystem */
public final class C11869Shv implements C13691Tf9 {
    public final C11416SSr A00;

    public final /* bridge */ /* synthetic */ C13796ThF ANe(C11856Shi shi, Object obj, int i, int i2) {
        C11416SSr sSr = this.A00;
        return C11416SSr.A01(shi, C11416SSr.A0A, sSr, new C11971Sjm((ParcelFileDescriptor) obj, sSr.A02, sSr.A04), i, i2);
    }

    public final /* bridge */ /* synthetic */ boolean CJU(C11856Shi shi, Object obj) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        String str = Build.MANUFACTURER;
        if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
            SJ8 sj8 = C11416SSr.A05;
            if ("robolectric".equals(Build.FINGERPRINT)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C11869Shv(C11416SSr sSr) {
        this.A00 = sSr;
    }
}
