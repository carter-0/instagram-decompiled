package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.android.R;
import java.io.File;

public final class AZA implements MTS, B1T {
    public final AnonymousClass889 A00;
    public final Context A01;

    public final void onFailure(Exception exc) {
    }

    public final void ALX(C369948va r11) {
        Bitmap bitmap;
        if (r11 != null) {
            bitmap = r11.BPm();
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            Context context = this.A01;
            LTL.A03(context, bitmap, this, 2RR.A02(context, false), context.getColor(R.color.badge_color));
            return;
        }
        Context context2 = this.A01;
        LTL.A05(context2, this, 2RR.A02(context2, false), 0.2f, -16777216, -16777216, false);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        0qQ.A0B(file, 0);
        this.A00.A01(C282665Eg.A03(file, 1, 0));
    }

    public AZA(Context context, AnonymousClass889 r2) {
        AnonymousClass7TG.A1O(context, r2);
        this.A01 = context;
        this.A00 = r2;
    }
}
