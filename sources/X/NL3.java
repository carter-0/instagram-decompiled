package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class NL3 extends C331047Ph {
    public String A00;
    public String A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final List A03 = AnonymousClass7TE.A1C();
    public final E9R A04;
    public final C47617EAd A05;
    public final C68511NLi A06;
    public final C68508NLf A07;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2s0, X.E9R, java.lang.Object] */
    public NL3(Context context, AnonymousClass0iw r7, G6X g6x, G82 g82) {
        C68508NLf nLf = new C68508NLf(context);
        this.A07 = nLf;
        C68511NLi nLi = new C68511NLi(context, (UserSession) null);
        this.A06 = nLi;
        ? obj = new Object();
        obj.A00 = g6x;
        this.A04 = obj;
        C47617EAd eAd = new C47617EAd(r7, g82, false, false);
        this.A05 = eAd;
        A0B(nLf, nLi, obj, eAd);
    }

    public static void A00(NL3 nl3) {
        nl3.A06();
        String str = nl3.A01;
        if (str != null) {
            nl3.A09(nl3.A07, str, new OGX((Integer) null, (Integer) null, (Integer) null, (Integer) null, false));
        }
        String str2 = nl3.A00;
        if (str2 != null) {
            nl3.A09(nl3.A06, str2, new OGX(Integer.valueOf(R.dimen.action_bar_item_spacing_left), Integer.valueOf(R.dimen.abc_control_corner_material), (Integer) null, (Integer) null, false));
        }
        nl3.A08(nl3.A04, (Object) null);
        for (User user : nl3.A03) {
            nl3.A08(nl3.A05, new F06(user, user.getUsername(), user.getFullName(), (String) null, nl3.A02.contains(user)));
        }
        nl3.A07();
    }
}
