package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.io.Closeables;
import com.instagram.ui.widget.nametag.NametagCardView;
import com.instagram.user.model.User;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* renamed from: X.MAv  reason: case insensitive filesystem */
public final class C66088MAv implements Callable {
    public final Context A00;
    public final User A01;
    public final Integer A02;

    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00;
        File A002 = 0qc.A00(context, ".png");
        if (A002 != null) {
            FileOutputStream A0t = JTO.A0t(A002);
            int A09 = 0nA.A09(context);
            NametagCardView nametagCardView = new NametagCardView(context, (AttributeSet) null);
            Integer num = this.A02;
            if (num != null) {
                nametagCardView.A01(this.A01, num.intValue());
            } else {
                nametagCardView.A01(this.A01, 0);
            }
            nametagCardView.measure(View.MeasureSpec.makeMeasureSpec(A09, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(A09, SN3.MAX_SIGNED_POWER_OF_TWO));
            try {
                Bitmap createBitmap = Bitmap.createBitmap(A09, A09, Bitmap.Config.ARGB_8888);
                Canvas A0B = JTO.A0B(createBitmap);
                nametagCardView.layout(0, 0, A09, A09);
                nametagCardView.draw(A0B);
                0fO.A02(Bitmap.CompressFormat.PNG, createBitmap, A0t, 100);
                A0t.flush();
                Closeables.A00(A0t, false);
                C59730JVo.A08(context, A002);
                return AnonymousClass7TE.A0v();
            } catch (OutOfMemoryError unused) {
                Closeables.A00(A0t, false);
            } catch (Throwable th) {
                Closeables.A00(A0t, false);
                throw th;
            }
        }
        return false;
    }

    public C66088MAv(Context context, User user, Integer num) {
        this.A00 = context;
        this.A01 = user;
        this.A02 = num;
    }
}
