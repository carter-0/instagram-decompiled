package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MeU  reason: case insensitive filesystem */
public abstract class C66889MeU {
    public static final 11S A00 = new 11S("@(\\w+(\\.\\w+)*)");

    public static final CharSequence A02(FragmentActivity fragmentActivity, C70802Vt r13, UserSession userSession, Integer num, Long l, String str, String str2, String str3, String str4, String str5) {
        String str6 = str;
        0qQ.A0B(str6, 0);
        UserSession userSession2 = userSession;
        String str7 = str2;
        AnonymousClass7TG.A1Q(userSession, str7);
        if (str6.length() == 0 || !182.A06(0Tu.A05, userSession, 36323766782930385L)) {
            return str;
        }
        return A00(fragmentActivity, r13, userSession2, num, l, str6, str7, str3, str4, str5, true);
    }

    public static final CharSequence A03(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        UserSession userSession2 = userSession;
        String str3 = str;
        String str4 = str2;
        DbZ.A0t(0, str, userSession, str2);
        if (str.length() == 0 || !182.A06(0Tu.A05, userSession, 36316074497281963L)) {
            return str;
        }
        return A00(fragmentActivity, (C70802Vt) null, userSession2, (Integer) null, (Long) null, str3, str4, (String) null, (String) null, (String) null, false);
    }

    public static final String A05(Context context, long j) {
        int i;
        Object[] objArr;
        Integer valueOf;
        String string;
        int A02 = C66583MXo.A02(j);
        int i2 = A02 / 60;
        if (i2 == 0 && A02 == 0) {
            string = context.getString(2131968635);
        } else {
            if (i2 == 0) {
                i = 2131968634;
                objArr = new Object[1];
                valueOf = Integer.valueOf(A02);
            } else {
                i = 2131968633;
                objArr = new Object[1];
                valueOf = Integer.valueOf(i2);
            }
            objArr[0] = valueOf;
            string = context.getString(i, objArr);
        }
        0qQ.A0A(string);
        return string;
    }

    public static final void A06(IgTextView igTextView, IgTextView igTextView2, C68770NWf nWf) {
        String str;
        0qQ.A0B(nWf, 2);
        if (igTextView != null) {
            Context context = igTextView2.getContext();
            if (context != null) {
                str = context.getString(2131954892);
            } else {
                str = null;
            }
            igTextView.setText(str);
        }
        igTextView2.setText(nWf.A0B);
    }

    public static final void A07(IgTextView igTextView, IgTextView igTextView2, C68770NWf nWf) {
        String str;
        0qQ.A0B(nWf, 2);
        if (igTextView != null) {
            Context context = igTextView2.getContext();
            if (context != null) {
                str = context.getString(2131954894);
            } else {
                str = null;
            }
            igTextView.setText(str);
        }
        igTextView2.setText(nWf.A0B);
    }

    public static final SpannableStringBuilder A00(FragmentActivity fragmentActivity, C70802Vt r21, UserSession userSession, Integer num, Long l, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        String str7 = str;
        SpannableStringBuilder A0C = DbS.A0C(str7);
        for (C291265gs A06 = A00.A06(str7, 0); A06 != null; A06 = A06.A02()) {
            C291285gu A09 = A06.A02.A09(1);
            if (A09 != null) {
                str6 = A09.A00;
            } else {
                str6 = "";
            }
            FragmentActivity fragmentActivity2 = fragmentActivity;
            A0C.setSpan(new C69197Ngv(fragmentActivity2, r21, userSession, num, l, str6, str2, str3, str4, str5, DbV.A02(fragmentActivity2), z), A06.A01().A00, A06.A01().A01 + 1, 33);
            A0C.setSpan(new StyleSpan(1), A06.A01().A00, A06.A01().A01 + 1, 33);
        }
        return A0C;
    }

    public static final SpannableStringBuilder A01(String str) {
        SpannableStringBuilder A0C = DbS.A0C(str);
        for (C291265gs A06 = A00.A06(str, 0); A06 != null; A06 = A06.A02()) {
            A0C.setSpan(new StyleSpan(1), A06.A01().A00, A06.A01().A01 + 1, 33);
        }
        return A0C;
    }

    public static final CharSequence A04(UserSession userSession, String str) {
        if (C66581MXm.A04(str) == 0 || !182.A06(0Tu.A05, userSession, 36316074497281963L)) {
            return str;
        }
        return A01(str);
    }
}
