package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;

public final class M8Z implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ L6A A02;

    public M8Z(Bitmap bitmap, AnonymousClass0iw r2, L6A l6a) {
        this.A02 = l6a;
        this.A00 = bitmap;
        this.A01 = r2;
    }

    public final void run() {
        L6A l6a = this.A02;
        Bitmap bitmap = this.A00;
        AnonymousClass0iw r3 = this.A01;
        Activity activity = l6a.A00;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            C358248ab A0X = DbS.A0X(activity);
            A0X.A0h(bitmap, r3, (ImageUrl) null);
            A0X.A09(2131957311);
            A0X.A08(2131957309);
            A0X.A0I((DialogInterface.OnClickListener) null, 2131957310);
            A0X.A04();
            A0X.A0g(new C71252OgJ(l6a, 1));
            DbT.A1V(A0X);
        }
    }
}
