package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.OdF  reason: case insensitive filesystem */
public final class C71121OdF {
    public static Dialog A00;
    public static final C71121OdF A01 = new Object();
    public static final 11S A02 = new 11S("\\X");

    public static final void A00(Context context, AnonymousClass07V r6, UserSession userSession, Integer num, String str) {
        C3018760k A012;
        String str2;
        String str3;
        String str4;
        Integer num2;
        String str5;
        0qQ.A0B(str, 0);
        AnonymousClass7TG.A1Q(r6, userSession);
        Dialog dialog = A00;
        if (dialog == null || !dialog.isShowing()) {
            C71121OdF odF = A01;
            String[] stringArray = context.getResources().getStringArray(R.array.notes_new_year_phrases);
            0qQ.A07(stringArray);
            List asList = Arrays.asList(stringArray);
            0qQ.A07(asList);
            if (A03(str, asList)) {
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36322701631039850L)) {
                    A01(context, r6, AnonymousClass05K.A00);
                    if (182.A06(r2, userSession, 36322701631105387L)) {
                        A012 = C3018660j.A01(userSession);
                        if (num.intValue() != 0) {
                            str3 = "consumption";
                        } else {
                            str3 = "creation";
                        }
                        str4 = "nye";
                        A012.A0R(str3, str4);
                    }
                    return;
                }
            }
            String[] stringArray2 = context.getResources().getStringArray(R.array.notes_valentines_day_phrases);
            0qQ.A07(stringArray2);
            List asList2 = Arrays.asList(stringArray2);
            0qQ.A07(asList2);
            if (A03(str, asList2) && 182.A06(0Tu.A05, userSession, 36322701631170924L)) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    num2 = AnonymousClass05K.A01;
                } else {
                    num2 = AnonymousClass05K.A0C;
                }
                A01(context, r6, num2);
                A012 = C3018660j.A01(userSession);
                if (intValue != 0) {
                    str5 = "consumption";
                } else {
                    str5 = "creation";
                }
                str4 = "vday";
                A012.A0R(str3, str4);
            } else if (odF.A04(context, str) && 182.A06(0Tu.A05, userSession, 36324329423712261L)) {
                A01(context, r6, AnonymousClass05K.A0N);
                A012 = C3018660j.A01(userSession);
                if (num.intValue() != 0) {
                    str2 = "consumption";
                } else {
                    str2 = "creation";
                }
                str4 = "birthday";
                A012.A0R(str3, str4);
            }
        }
    }

    public final boolean A04(Context context, String str) {
        0qQ.A0B(str, 0);
        String[] stringArray = context.getResources().getStringArray(R.array.notes_birthday_trigger_words);
        0qQ.A07(stringArray);
        List asList = Arrays.asList(stringArray);
        0qQ.A07(asList);
        if (A02(str, asList)) {
            String[] stringArray2 = context.getResources().getStringArray(R.array.notes_birthday_blocked_words);
            0qQ.A07(stringArray2);
            List asList2 = Arrays.asList(stringArray2);
            0qQ.A07(asList2);
            if (A02(str, asList2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void A01(Context context, AnonymousClass07V r7, Integer num) {
        C314126hh r5 = new C314126hh(context);
        Dialog dialog = new Dialog(context, 16973841);
        dialog.setContentView(R.layout.layout_animation_image_view);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(131096);
            window.clearFlags(2);
        }
        C71497Olm olm = new C71497Olm(dialog, 1);
        r7.A09(olm);
        r5.A02((ImageView) dialog.findViewById(R.id.animation_image_view), num);
        r5.A01(new C71161Oea(dialog, 3));
        dialog.setOnDismissListener(new C50030FJp(2, olm, r7));
        A00 = dialog;
        AnonymousClass0fN.A00(dialog);
    }

    public static final boolean A02(String str, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            DbV.A1U(next, A1C, A02.A08((String) next) ? 1 : 0);
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : list) {
            if (A02.A08((String) next2)) {
                A1C2.add(next2);
            }
        }
        String str2 = "";
        String A0P = 00k.A0P("|", str2, str2, A1C, (0sP) null);
        if (AnonymousClass7TE.A1b(A1C2)) {
            str2 = G9w.A0k("|(", 00k.A0P("|", str2, str2, A1C2, (0sP) null));
        }
        return new 11S(002.A0u("\\b(", A0P, ")\\b", str2), C69517Nmz.IGNORE_CASE).A07(str);
    }

    public static final boolean A03(String str, List list) {
        String A0j = AnonymousClass7TF.A0j(str);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int length = A0j.length();
        for (int i = 0; i < length; i++) {
            char charAt = A0j.charAt(i);
            if (Character.isLetterOrDigit(charAt) || 11R.A01(charAt)) {
                A1A.append(charAt);
            }
        }
        String A12 = DbV.A12(DbT.A10(A1A));
        if (list.contains(str) || list.contains(A12)) {
            return true;
        }
        return false;
    }
}
