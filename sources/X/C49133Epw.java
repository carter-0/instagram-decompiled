package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.instagram.android.R;

/* renamed from: X.Epw  reason: case insensitive filesystem */
public abstract class C49133Epw {
    public static Dialog A00(Activity activity, DialogInterface.OnDismissListener onDismissListener, AnonymousClass0iw r12, 0lg r13, Integer num, String str, String str2) {
        C358248ab A0X = DbS.A0X(activity);
        A0X.A09(2131971939);
        A0X.A0q(DbU.A07(activity.getResources(), str, 2131971931).toString());
        A0X.A0I(new C49999FIk(activity, r12, r13, num, str2, 5), 2131972568);
        A0X.A0H(new C49969FHc(13), 2131968513);
        A0X.A0f(onDismissListener);
        A0X.A07(R.drawable.instagram_lock_outline_96);
        return A0X.A02();
    }
}
