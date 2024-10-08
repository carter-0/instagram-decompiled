package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.MapText;

/* renamed from: X.OaW  reason: case insensitive filesystem */
public abstract class C71054OaW {
    public static final void A00(Activity activity, C62320sa r6, boolean z) {
        AnonymousClass37D A0i = DbT.A0i(activity);
        if (A0i != null) {
            AnonymousClass37F r2 = (AnonymousClass37F) A0i;
            if (r2.A0g) {
                A0i.A0O(new GPw(true, z, false));
                r2.A0H = new C72964PQw(r6, 5);
                r2.A0z.clear();
                A0i.A0B();
                return;
            }
            r6.invoke();
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, C69312NjD njD) {
        int i;
        switch (njD.ordinal()) {
            case 0:
                i = 2131962696;
                break;
            case 1:
                i = 2131962697;
                break;
            case 2:
            case 6:
                i = 2131974093;
                break;
            case 3:
                i = 2131962693;
                break;
            case 4:
                i = 2131962695;
                break;
            case 5:
                i = 2131962694;
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        MapText.Res res = new MapText.Res(i, new String[0]);
        C59689JTv.A00(fragmentActivity, C70286O0q.A00(fragmentActivity, res), AnonymousClass7TG.A0m(njD, "IG_FRIEND_MAP_", AnonymousClass7TE.A1A()), 0);
    }

    public static final void A02(AnonymousClass4DH r4, UserSession userSession) {
        new SUL(r4.requireContext(), userSession, 2EG.A1r, "https://help.instagram.com/402343555458995", DbW.A1X(userSession)).A0A();
    }

    public static final void A03(AnonymousClass4DH r3, C358278ae r4, CharSequence charSequence, Integer num, Integer num2, String str, C62320sa r9, C62320sa r10, C62320sa r11, int i) {
        C358248ab A0U = DbW.A0U(r3);
        A0U.A05 = str;
        A0U.A0R(new C71182Oey(r11, 0), r4, i);
        C71250OgH.A00(A0U, r9, 7);
        C71252OgJ.A00(A0U, r10, 10);
        if (num != null) {
            DbU.A16(r3.requireContext(), A0U, num.intValue());
        }
        if (num2 != null) {
            A0U.A0H((DialogInterface.OnClickListener) null, num2.intValue());
        }
        if (charSequence != null) {
            A0U.A0q(charSequence);
        }
        DbT.A1V(A0U);
    }
}
