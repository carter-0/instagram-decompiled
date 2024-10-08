package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public final class Si0 implements C13691Tf9 {
    public final C13813Thg A00;
    public final Si5 A01;

    public final /* bridge */ /* synthetic */ C13796ThF ANe(C11856Shi shi, Object obj, int i, int i2) {
        QHK A002 = this.A01.A00((Uri) obj, shi);
        if (A002 == null) {
            return null;
        }
        return C11119SAy.A00((Drawable) A002.get(), this.A00, i, i2);
    }

    public final /* bridge */ /* synthetic */ boolean CJU(C11856Shi shi, Object obj) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }

    public Si0(C13813Thg thg, Si5 si5) {
        this.A01 = si5;
        this.A00 = thg;
    }
}
