package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.android.R;

public abstract class LPO {
    public static final void A01(Activity activity, String str, String str2, C62320sa r6, int i) {
        C65358Lry lry;
        0qQ.A0B(str, 2);
        DbT.A1Q(0wj.A01, str, 245701013);
        if (r6 != null) {
            lry = new C65358Lry(r6, 1);
        } else {
            lry = null;
        }
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            A00(activity, lry, Integer.valueOf(i), str2, 2131974095);
        }
    }

    public static final void A02(Context context) {
        0qQ.A0B(context, 0);
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A05 = "Error";
        A0Y.A0q("Failed to create cutout video sticker");
        A0Y.A0c((DialogInterface.OnClickListener) null, AnonymousClass7TF.A0d(context.getResources(), 2131968772));
        DbT.A1V(A0Y);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.MVB] */
    public static final void A00(Activity activity, MVB mvb, Integer num, String str, int i) {
        1xC r2 = 1xC.A01;
        C310336ap A0X = DbV.A0X();
        A0X.A0H = str;
        DbS.A19(activity, A0X, i);
        A0X.A0A(new Object());
        A0X.A04 = activity.getDrawable(R.drawable.instagram_error_pano_outline_24);
        if (num != null) {
            DbW.A0q(activity, A0X, num.intValue());
            A0X.A0L = true;
            if (mvb != null) {
                A0X.A0A = mvb;
            }
        }
        DbY.A1K(r2, A0X);
    }
}
