package X;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: X.Sjr  reason: case insensitive filesystem */
public final class C11976Sjr implements C13538TcA {
    public final Bitmap.CompressFormat A00 = Bitmap.CompressFormat.JPEG;

    public final C13796ThF FHZ(C11856Shi shi, C13796ThF thF) {
        ByteArrayOutputStream A0b = Pxe.A0b();
        0fO.A02(this.A00, (Bitmap) thF.get(), A0b, 100);
        thF.recycle();
        return new C11906Sif(A0b.toByteArray());
    }
}
