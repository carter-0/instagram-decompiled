package X;

import android.content.Intent;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.EoH  reason: case insensitive filesystem */
public abstract class C49037EoH {
    public static final void A00(Fragment fragment, String str, boolean z) {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.instagram.com/%s", str);
        Resources A05 = DbV.A05(fragment);
        int i = 2131973518;
        if (z) {
            i = 2131973513;
        }
        String A0w = DbV.A0w(A05, str, formatStrLocaleSafe, i);
        0qQ.A0A(A0w);
        Intent A09 = DbS.A09();
        A09.setAction("android.intent.action.SEND");
        A09.putExtra("android.intent.extra.TEXT", A0w);
        A09.setType("text/plain");
        0kR.A06(fragment, Intent.createChooser(A09, (CharSequence) null), 7384567);
    }
}
