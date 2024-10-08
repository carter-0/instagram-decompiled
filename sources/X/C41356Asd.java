package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.Asd  reason: case insensitive filesystem */
public final class C41356Asd implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C41356Asd(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        Bitmap.CompressFormat compressFormat;
        if (this.A00 != 0) {
            boolean z = this.A03;
            Context context = ((LT3) this.A02).A04;
            if (z) {
                str = ".png";
            } else {
                str = ".jpg";
            }
            File A002 = 0qc.A00(context, str);
            if (A002 == null) {
                return null;
            }
            Bitmap bitmap = (Bitmap) this.A01;
            if (z) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
            1MF.A0L(compressFormat, bitmap, A002, 100);
            return FileProvider.A00(context, A002);
        }
        AnonymousClass9RJ r2 = (AnonymousClass9RJ) this.A01;
        if (r2.isConnected()) {
            if (this.A03) {
                AnonymousClass9S6 r1 = r2.A0I;
                if (r1.A07) {
                    r1.A04 = true;
                    r1.A01();
                }
            }
            C378979Ry A012 = AnonymousClass9RJ.A01(r2, r2.A00);
            try {
                A012.A00.A01(C342717p3.A0P, false);
                A012.A00.A01(C342717p3.A0R, false);
                A012.A02();
                return null;
            } catch (RuntimeException e) {
                ((AnonymousClass8GD) this.A02).A01(e);
                return null;
            }
        } else {
            throw new RuntimeException(002.A0R("Camera not initialised: ", "Failed to unlock automatics (focus, exposure, white-balance)"));
        }
    }
}
