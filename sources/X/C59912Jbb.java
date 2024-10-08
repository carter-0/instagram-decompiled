package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jbb  reason: case insensitive filesystem */
public final class C59912Jbb {
    public static final C59912Jbb A00 = new Object();

    public static final SpannableString A00(Context context, C295095nZ r5) {
        String str;
        if (r5 == null || (str = r5.A04) == null) {
            str = "";
        }
        SpannableString spannableString = new SpannableString(DbW.A0h(context, str, 2131962308));
        int A08 = 00l.A08(spannableString, str, 0, false);
        spannableString.setSpan(new StyleSpan(1), A08, str.length() + A08, 33);
        return spannableString;
    }

    public static final SpannableStringBuilder A01(Spanned spanned, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        C51972G9s.A1B(userSession, str2);
        SpannableStringBuilder A0C = DbS.A0C(spanned);
        AnonymousClass7AV.A05(A0C, new Q8J(fragmentActivity, userSession, str2, str3, 1), str);
        return A0C;
    }

    public static final String A02(Context context, C295095nZ r3, boolean z) {
        String str;
        if (r3 != null) {
            str = r3.A04;
        } else {
            str = null;
        }
        if (z) {
            return context.getString(2131973567);
        }
        if (r3 == null || r3.A00) {
            return str;
        }
        return null;
    }

    public static final String A03(Context context, C62623Kiu kiu) {
        int i;
        if (kiu == null) {
            return null;
        }
        int ordinal = kiu.ordinal();
        if (ordinal == 2) {
            i = 2131976053;
        } else if (ordinal != 1) {
            return null;
        } else {
            i = 2131976052;
        }
        return context.getString(i);
    }

    public final void A04(Context context, C62623Kiu kiu, String str) {
        int i;
        Object[] objArr;
        String A03 = A03(context, kiu);
        if (str != null || A03 != null) {
            Resources resources = context.getResources();
            if (A03 == null) {
                i = 2131962369;
                objArr = new Object[]{str};
            } else if (str == null) {
                i = 2131962370;
                objArr = new Object[]{A03};
            } else {
                i = 2131962368;
                objArr = new Object[]{str, A03};
            }
            0bC.A00(resources, objArr, i);
        }
    }
}
