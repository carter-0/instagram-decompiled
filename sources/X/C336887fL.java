package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.7fL  reason: invalid class name and case insensitive filesystem */
public final class C336887fL {
    public static final C336887fL A00 = new Object();

    public static final SpannableStringBuilder A00(Context context, SpannableString spannableString, UserSession userSession, String str, List list, Map map, C62320sa r11, 0sP r12, 0sP r13, 0sL r14, 0sL r15, int i, boolean z) {
        0qQ.A0B(str, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(list, 4);
        if (0mk.A02(context)) {
            str = 002.A0D(str, 8207);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int A0F = 2Yu.A0F(context, i);
        C253003q3 r1 = new C253003q3(spannableStringBuilder, userSession);
        r1.A03 = A0F;
        r1.A01 = A0F;
        r1.A04 = A0F;
        r1.A02 = 2Yu.A0F(context, R.attr.textColorSecondary);
        r1.A03(new C336907fN(r12));
        C336917fO r0 = new C336917fO(map, r15);
        r1.A07 = context;
        r1.A0C = r0;
        r1.A0J = map;
        r1.A0W = true;
        if (z) {
            r1.A02(new C336927fP(r13));
        }
        if ((!list.isEmpty()) && new 0Rd(userSession).A01()) {
            r1.A01(context, new C40521AdU(r14), list);
        }
        SpannableStringBuilder A002 = r1.A00();
        0qQ.A07(A002);
        if (spannableString != null) {
            spannableString.setSpan(new C46681DjA(context, r11), 0, spannableString.length(), 33);
            A002.append(' ').append(spannableString);
        }
        return A002;
    }

    public final SpannableStringBuilder A01(Context context, C333777a7 r18, UserSession userSession, User user, C62320sa r21, int i, boolean z) {
        String str;
        AnonymousClass3OA r1;
        String str2;
        boolean z2;
        int length;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        User user2 = user;
        0qQ.A0B(user2, 4);
        Context context2 = context;
        boolean A02 = 0mk.A02(context2);
        C333777a7 r4 = r18;
        if (r18 == null) {
            str = null;
        } else {
            String str3 = r4.A0I;
            str = r4.A0D;
            0qQ.A0B(str3, 1);
            AnonymousClass1wP A002 = 1wN.A00(userSession2);
            if (!C67741wV.A00 && (r1 = (AnonymousClass3OA) A002.A00.get(str3)) != null) {
                str = r1.A0U;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = i;
        if (!user2.A2Q()) {
            if (r18 == null || !C231122qu.A0X(userSession2, r4.A0I, r4.A0h) || str == null || str.length() == 0 || r4.A0A != user2) {
                str = user2.getUsername();
            }
            if (A02) {
                str2 = "‏";
            } else {
                str2 = "";
            }
            spannableStringBuilder.append(str2);
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(new C336897fM(userSession2, r21, i2), 0, spannableStringBuilder.length(), 33);
            if (user2.isVerified()) {
                spannableStringBuilder.append(" ");
                if (r18 != null) {
                    z2 = true;
                    if (r4.A0d) {
                        C244273av.A05(context2, spannableStringBuilder, C244273av.A00, Integer.valueOf(2Yu.A0A(context2)), false, false);
                    }
                } else {
                    z2 = true;
                }
                C244273av.A05(context2, spannableStringBuilder, C244273av.A00, (Integer) null, z2, false);
            } else {
                z2 = true;
            }
            if (z) {
                F5q.A01(context2, spannableStringBuilder, z2, z2, false);
            }
            spannableStringBuilder.append(" ");
            if (A02) {
                spannableStringBuilder.append("‬");
                return spannableStringBuilder;
            }
        } else if (!(r18 == null || !C231122qu.A0X(userSession2, r4.A0I, r4.A0h) || str == null || (length = str.length()) == 0 || r4.A0A != user2)) {
            spannableStringBuilder.append(str).append(" ");
            spannableStringBuilder.setSpan(new CharacterStyle(), 0, length, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i2), 0, length, 33);
        }
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder A02(Context context, UserSession userSession, User user, String str, List list, 0sP r21, 0sP r22, 0sL r23, int i, int i2, boolean z) {
        String str2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        User user2 = user;
        0qQ.A0B(user2, 4);
        List list2 = list;
        0qQ.A0B(list2, 9);
        Context context2 = context;
        0sP r9 = r21;
        SpannableStringBuilder A002 = A00(context2, (SpannableString) null, userSession2, str, list2, (Map) null, C41600AxE.A00, r9, r22, r23, (0sL) null, i, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String username = user2.getUsername();
        if (z) {
            str2 = "‏";
        } else {
            str2 = "";
        }
        spannableStringBuilder.append(str2);
        spannableStringBuilder.append(username);
        C389129ow r3 = new C389129ow(username, r9, 2Yu.A0F(context2, i2));
        int length = str2.length();
        spannableStringBuilder.setSpan(r3, length, length + username.length(), 33);
        spannableStringBuilder.append(' ');
        if (z) {
            spannableStringBuilder.append("‏");
        }
        spannableStringBuilder.append(A002);
        return spannableStringBuilder;
    }
}
