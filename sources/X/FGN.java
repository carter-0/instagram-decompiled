package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

public abstract class FGN {
    public static final void A01(Context context, UserSession userSession, String str, String str2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C49852F9r.A01, userSession2), "instagram_two_fac_setup_action");
        DbS.A1J(A0e, "link");
        A0e.AAJ("view", "");
        Dbc.A0W(A0e);
        String str3 = str;
        A0e.AAJ("url", str3);
        A0e.Cgf();
        SimpleWebViewActivity.A02.A02(context, userSession2, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, str2, str3));
    }

    public static final void A02(ClickableSpan clickableSpan, ClickableSpan clickableSpan2, TextView textView, String str, String str2) {
        0qQ.A0B(textView, 0);
        SpannableStringBuilder A0C = DbS.A0C(str);
        A0C.setSpan(clickableSpan, 0, str.length(), 33);
        SpannableStringBuilder A0C2 = DbS.A0C(str2);
        A0C2.setSpan(clickableSpan2, 0, str2.length(), 33);
        DbT.A1H(textView);
        textView.setHighlightColor(0);
        textView.setText(DbS.A0C(A0C).append(" • ").append(A0C2));
    }

    public static final void A03(TextView textView, TextView textView2, String str) {
        0qQ.A0B(str, 0);
        if (str.length() != 32) {
            0wb.A03("two factor", "instagram key length invalid");
            textView.setText(str);
            return;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        for (int i = 0; i < 16; i++) {
            if (i != 0 && i % 4 == 0) {
                A1A.append("  ");
            }
            A1A.append(str.charAt(i));
        }
        textView.setText(A1A);
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        int i2 = 16;
        while (true) {
            A1A2.append(str.charAt(i2));
            i2++;
            if (i2 >= 32) {
                textView2.setText(A1A2);
                return;
            } else if (i2 != 16 && i2 % 4 == 0) {
                A1A2.append("  ");
            }
        }
    }

    public static final void A05(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 0);
        FCE.A00(userSession, AnonymousClass05K.A1I);
        FFR.A03();
        DbY.A14(new E2T(), fragmentActivity, userSession);
    }

    public static final String A00(String str) {
        int length = str.length();
        if (length >= 4) {
            String substring = str.substring(length - 4, length);
            0qQ.A07(substring);
            return substring;
        }
        0wb.A03("two fac util", 002.A0g("phone number :", str, " length less then 4"));
        return "xxxx";
    }

    public static void A04(Fragment fragment, UserSession userSession, int i) {
        String string = fragment.getString(i);
        0qQ.A07(string);
        A01(fragment.requireContext(), userSession, Dbq.A05(217, 52, 49), string);
    }
}
