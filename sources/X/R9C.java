package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

public final class R9C extends C67620Mqs {
    public AnonymousClass8DV A00;
    public final /* synthetic */ C7926Qcx A01;

    public R9C(C7926Qcx qcx) {
        this.A01 = qcx;
    }

    public final /* bridge */ /* synthetic */ Object A03(Object[] objArr) {
        Bitmap decodeFile;
        C7926Qcx qcx = this.A01;
        String str = qcx.A06;
        if (!(str == null || (decodeFile = BitmapFactory.decodeFile(str)) == null)) {
            AnonymousClass8DV r2 = new AnonymousClass8DV(DbV.A05(qcx), decodeFile);
            r2.A08.setAntiAlias(true);
            r2.invalidateSelf();
            r2.A02(JTO.A02(decodeFile) * 0.03f);
            this.A00 = r2;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        ImageView imageView = this.A01.A01;
        if (imageView != null) {
            imageView.setImageDrawable(this.A00);
        }
    }
}
