package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.FGa  reason: case insensitive filesystem */
public abstract class C49946FGa {
    public static final SpannableStringBuilder A00(Context context, List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 1);
        for (Object next : list) {
            if (!((BrandedContentTag) next).A03) {
                A0q.add(next);
            }
        }
        int size = A0q.size();
        if (size == 1) {
            SpannableStringBuilder A0D = DbY.A0D(context, ((BrandedContentTag) A0q.get(0)).A02, 2131974137);
            DbV.A1D(A0D, ((BrandedContentTag) A0q.get(0)).A02);
            return A0D;
        } else if (size != 2) {
            return DbW.A08(context, 2131969136);
        } else {
            SpannableStringBuilder A0C = DbS.A0C(DbV.A0u(context, ((BrandedContentTag) A0q.get(0)).A02, ((BrandedContentTag) A0q.get(1)).A02, 2131969135));
            DbV.A1D(A0C, ((BrandedContentTag) A0q.get(0)).A02);
            DbV.A1D(A0C, ((BrandedContentTag) A0q.get(1)).A02);
            return A0C;
        }
    }

    public static final SpannableStringBuilder A01(Context context, List list, boolean z) {
        0qQ.A0B(list, 2);
        if (!z) {
            return new SpannableStringBuilder();
        }
        int size = list.size();
        if (size == 1) {
            SpannableStringBuilder A0C = DbS.A0C(DbY.A0b(context, DbS.A0g(list, 0), 2131974137));
            DbV.A1D(A0C, DbX.A0u(list, 0));
            return A0C;
        } else if (size != 2) {
            return DbW.A08(context, 2131969136);
        } else {
            SpannableStringBuilder A0C2 = DbS.A0C(DbV.A0u(context, DbX.A0u(list, 0), DbX.A0u(list, 1), 2131969135));
            DbV.A1D(A0C2, DbX.A0u(list, 0));
            DbV.A1D(A0C2, DbX.A0u(list, 1));
            return A0C2;
        }
    }

    public static final SpannableStringBuilder A02(FragmentActivity fragmentActivity, UserSession userSession, String str, int i) {
        AnonymousClass7TG.A1O(userSession, str);
        String A16 = AnonymousClass7TE.A16(fragmentActivity, 2131954165);
        SpannableStringBuilder A0D = DbY.A0D(fragmentActivity, A16, i);
        AnonymousClass7AV.A05(A0D, new C48051ESu(fragmentActivity, userSession, str, DbV.A02(fragmentActivity), 0), A16);
        return A0D;
    }

    public static final String A03(Context context, BrandedContentGatingInfo brandedContentGatingInfo) {
        String A0h;
        0sn r1 = brandedContentGatingInfo.A04;
        if (r1 == null) {
            r1 = 0sn.A00;
        }
        int size = r1.size();
        if (size == 1) {
            A0h = new Locale(Locale.getDefault().getDisplayLanguage(), AnonymousClass7TE.A19(r1, 0)).getDisplayCountry();
        } else {
            A0h = DbW.A0h(context, Integer.valueOf(size), 2131954159);
        }
        0qQ.A0A(A0h);
        return A0h;
    }

    public static final void A05(Activity activity, UserSession userSession, 1Xj r10, Class cls, String str) {
        AnonymousClass7TG.A1Q(r10, str);
        C358248ab A0X = DbS.A0X(activity);
        A0X.A09(2131972108);
        A0X.A08(2131972105);
        Class cls2 = cls;
        A0X.A0E(new C49999FIk(activity, cls2, r10, userSession, str, 1));
        DbX.A16(FJ2.A00, A0X);
    }

    public static final boolean A06(Context context, Fragment fragment, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        if (AnonymousClass7TF.A0Q(userSession).A2K()) {
            return false;
        }
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131952886);
        A0Y.A08(2131952884);
        A0Y.A0J(new C50026FJl(8, (Object) context, (Object) userSession, (Object) fragment), 2131952885);
        DbY.A1M(A0Y, 2131968513);
        return true;
    }

    public static final void A04(Activity activity, DialogInterface.OnClickListener onClickListener, UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1U(userSession, str, str2);
        C358248ab A0X = DbS.A0X(activity);
        A0X.A05 = str;
        A0X.A0q(str2);
        C50025FJk.A01(A0X, activity, userSession, 6, 2131964884);
        DbX.A16(onClickListener, A0X);
    }
}
