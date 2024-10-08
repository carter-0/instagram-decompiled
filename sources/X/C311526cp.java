package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.Html;
import android.text.Spanned;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6cp  reason: invalid class name and case insensitive filesystem */
public final class C311526cp {
    public FragmentActivity A00;
    public UserSession A01;

    public C311526cp(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final boolean A01() {
        1Av A002 = 1Au.A00(this.A01);
        return ((Boolean) A002.A7y.CDM(A002, 1Av.A8a[143])).booleanValue();
    }

    public final void A00(DialogInterface.OnDismissListener onDismissListener, boolean z) {
        C49989FHy fHy;
        if (A01()) {
            1Av A002 = 1Au.A00(this.A01);
            A002.A7y.Epx(A002, false, 1Av.A8a[143]);
            FragmentActivity fragmentActivity = this.A00;
            Spanned fromHtml = Html.fromHtml(fragmentActivity.getResources().getString(2131971439));
            0qQ.A07(fromHtml);
            C358248ab r2 = new C358248ab((Activity) fragmentActivity);
            r2.A0i(fragmentActivity.getDrawable(R.drawable.ig_illustrations_illo_delete_recovery_refresh));
            r2.A0r(true);
            r2.A0s(true);
            r2.A09(2131971440);
            r2.A0q(fromHtml);
            r2.A0G(new C49988FHx(this), 2131971441);
            if (z) {
                fHy = new C49989FHy(this);
            } else {
                fHy = null;
            }
            r2.A0H(fHy, 2131956164);
            if (onDismissListener != null) {
                r2.A0f(onDismissListener);
            }
            AnonymousClass0fN.A00(r2.A02());
        }
    }
}
