package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.9Se  reason: invalid class name and case insensitive filesystem */
public abstract class C379039Se {
    public static final int A00(Editable editable) {
        0qQ.A0B(editable, 0);
        int selectionEnd = Selection.getSelectionEnd(editable) - 1;
        int i = selectionEnd;
        while (true) {
            if (-1 >= i || editable.charAt(i) == ' ') {
                break;
            } else if (editable.charAt(i) != '#') {
                i--;
            } else if (i == selectionEnd) {
                return -1;
            } else {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.6Ly, X.8ur, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.6Ly, X.8ur, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.6Ly, X.8ur, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v3, types: [X.6Ly, X.8ur, java.lang.Object] */
    public static final C347017w8 A01(Context context, UserSession userSession, String str, float f, int i) {
        0qQ.A0B(str, 2);
        Context context2 = context;
        int A01 = AnonymousClass7TH.A01(context);
        ArrayList A1C = AnonymousClass7TE.A1C();
        SpannableString spannableString = new SpannableString(str);
        AJB.A09(AnonymousClass7TF.A0A(context), spannableString, A01, -1, AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_pink));
        ? r8 = new C306386Ly(context, i);
        float f2 = (float) A01;
        UserSession userSession2 = userSession;
        float f3 = f;
        float f4 = f2;
        AJB.A05(context2, userSession2, r8, f3, f2, f4);
        r8.A0L(spannableString);
        r8.A00 = "hashtag_sticker_gradient";
        A1C.add(r8);
        SpannableString spannableString2 = new SpannableString(str);
        Resources resources = context2.getResources();
        AJB.A04(context2, spannableString2, A01);
        ? r82 = new C306386Ly(context2, i);
        AJB.A05(context2, userSession2, r82, f3, f2, f4);
        r82.A0L(spannableString2);
        r82.A00 = "hashtag_sticker_subtle";
        A1C.add(r82);
        SpannableString spannableString3 = new SpannableString(str);
        0qQ.A0A(resources);
        0qQ.A0B(resources, 1);
        AJB.A0A(resources, spannableString3, AnonymousClass5BH.A01, A01);
        ? r83 = new C306386Ly(context2, i);
        AJB.A05(context2, userSession2, r83, f3, f2, f4);
        r83.A0L(spannableString3);
        r83.A00 = "hashtag_sticker_rainbow_gradient";
        A1C.add(r83);
        SpannableString spannableString4 = new SpannableString(str);
        AJB.A03(context2, resources, spannableString4, A01);
        ? r84 = new C306386Ly(context2, i);
        AJB.A05(context2, userSession2, r84, f3, f2, f4);
        r84.A0L(spannableString4);
        r84.A00 = "hashtag_sticker_hero_gradient";
        A1C.add(r84);
        C347017w8 r1 = new C347017w8(context2, userSession2, A1C);
        r1.A03 = new C387359m5(str, i, f);
        return r1;
    }
}
