package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class FCK {
    public static void A01(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            textView.setTextSize(0, (float) textView.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
            textView.setTypeface(textView.getTypeface(), 1);
        }
    }

    public static boolean A02(Bundle bundle, UserSession userSession) {
        if ((bundle == null || bundle.getString(AnonymousClass000.A00(928)) == null) && !182.A06(0Tu.A05, userSession, 36325227071812338L)) {
            return false;
        }
        return true;
    }

    public static void A00(TextView textView, Context context) {
        C49948FGd.A03(new TextView[]{textView}[0], 2Yu.A06(context));
    }
}
