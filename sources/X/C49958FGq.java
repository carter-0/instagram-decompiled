package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.registration.ui.NotificationBar;
import java.util.regex.Pattern;

/* renamed from: X.FGq  reason: case insensitive filesystem */
public abstract class C49958FGq {
    public static void A07(Fragment fragment, 0hq r4, String str) {
        0s1 r1;
        if (r4.A0R(str) == null) {
            r1.A0D(fragment, str, R.id.layout_container_main);
            r1.A0I((String) null);
        } else {
            r1 = new 0s1(r4);
            r4.A0y((String) null, 1);
            r1.A0D(fragment, str, R.id.layout_container_main);
        }
        r1.A01();
    }

    public static void A04(Bundle bundle, 0hq r4) {
        0s1 r2 = new 0s1(r4);
        r4.A0y((String) null, 1);
        DbT.A15();
        E54 e54 = new E54();
        e54.setArguments(bundle);
        r2.A0A(e54, R.id.layout_container_main);
        r2.A00();
    }

    public static void A08(NotificationBar notificationBar, String str) {
        if (!"".equals(str)) {
            Context context = notificationBar.getContext();
            notificationBar.A04(str, context.getColor(2Yu.A03(context)), context.getColor(2Yu.A02(context)));
        }
    }

    public static String A00(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        String stripSeparators = PhoneNumberUtils.stripSeparators(002.A0g(str, " ", str2));
        Pattern pattern = 0mp.A01;
        if (stripSeparators == null) {
            return "";
        }
        return stripSeparators;
    }

    public static void A01(Context context, View view, ImageView imageView) {
        int A09 = 0nA.A09(context);
        Drawable drawable = imageView.getDrawable();
        drawable.getClass();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int i = (int) (((float) A09) * 0.45f);
        imageView.getLayoutParams().width = Math.min(intrinsicWidth, i);
        if (view != null) {
            view.getLayoutParams().width = imageView.getLayoutParams().width + DbS.A02(context, 48);
        }
    }

    public static void A02(Context context, TextView textView, 0lg r7) {
        String string = context.getString(2131964583);
        String A0h = DbW.A0h(context, string, 2131956603);
        int A02 = DbV.A02(context);
        textView.setHighlightColor(0);
        SpannableStringBuilder A0C = DbS.A0C(A0h);
        String A022 = SQU.A02(context, "https://www.facebook.com/help/instagram/261704639352628?ref=learn_more");
        0qQ.A07(A022);
        AnonymousClass7AV.A05(A0C, new C48036ESb(context, r7, A022, A02), string);
        DbX.A1G(textView, A0C);
    }

    public static void A03(Context context, TextView textView, 0lg r9, EXD exd, String str, String str2, String str3, boolean z, boolean z2) {
        int i;
        Object[] objArr;
        String string = context.getString(2131964588);
        String string2 = context.getString(2131964585);
        String string3 = context.getString(2131964584);
        if (z) {
            i = 2131972884;
            objArr = new Object[]{str2, str3, string, string2, string3};
        } else {
            if ("eu".equals(str)) {
                i = 2131964580;
                if (EXD.SAC.equals(exd)) {
                    i = 2131972882;
                }
            } else if (!"row".equals(str)) {
                String string4 = context.getString(2131964588);
                String string5 = context.getString(2131964587);
                String A0u = DbV.A0u(context, string4, string5, 2131964579);
                int A01 = DbV.A01(context);
                textView.setHighlightColor(0);
                SpannableStringBuilder A0C = DbS.A0C(A0u);
                AnonymousClass7AV.A05(A0C, new C48036ESb(context, r9, 1Ma.A03("/legal/terms/"), A01), string4);
                AnonymousClass7AV.A05(A0C, new C48036ESb(context, r9, 1Ma.A03("/legal/privacy/"), A01), string5);
                DbX.A1G(textView, A0C);
                textView.setTextColor(A01);
                return;
            } else if (EXD.SAC.equals(exd)) {
                i = 2131972883;
            } else {
                i = 2131964581;
                if (z2) {
                    i = 2131964582;
                }
            }
            objArr = new Object[]{string, string2, string3};
        }
        String string6 = context.getString(i, objArr);
        int A02 = DbV.A02(context);
        textView.setHighlightColor(0);
        SpannableStringBuilder A0C2 = DbS.A0C(string6);
        String A022 = SQU.A02(context, C66579MXk.A00(35));
        0qQ.A07(A022);
        AnonymousClass7AV.A05(A0C2, new C48036ESb(context, r9, A022, A02), string);
        String A023 = SQU.A02(context, "https://help.instagram.com/519522125107875");
        0qQ.A07(A023);
        AnonymousClass7AV.A05(A0C2, new C48036ESb(context, r9, A023, A02), string2);
        String A024 = SQU.A02(context, "https://i.instagram.com/legal/cookies/");
        0qQ.A07(A024);
        AnonymousClass7AV.A05(A0C2, new C48036ESb(context, r9, A024, A02), string3);
        DbX.A1G(textView, A0C2);
    }

    public static void A05(View view, Fragment fragment, 0lg r7, EXD exd, C46634DiE diE, boolean z) {
        TextView A0G = DbU.A0G(view, R.id.log_in_button);
        Dbb.A0l(DbV.A05(fragment), A0G, 2131952921);
        AnonymousClass0fU.A00(new FOB(2, exd, r7, fragment, diE, z), A0G);
    }

    public static void A06(TextView textView) {
        if (TextUtils.isEmpty(DbV.A0x(textView))) {
            textView.requestFocus();
            0nA.A0Q(textView);
            return;
        }
        0nA.A0N(textView);
    }
}
